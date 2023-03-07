// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя
// StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package Seminar_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class task_2 {
    public static void main(String[] args) {
        try{
            String surname = "";
            String grade = "";
            String discipline = "";
            // Reader for data file
            BufferedReader br = new BufferedReader(
            new FileReader(System.getProperty("user.dir")
            .concat("/Seminar_2/data_task_2.txt"),
            StandardCharsets.UTF_8));

            // String builder to output
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
        

            while (line != null){

                String[] words = line.split(",");
                for (String word : words){
                    if (SearchSurname(word) != null){
                        surname = SearchSurname(word);
                    }
                    if (SearchGrade(word) != null){
                        grade = SearchGrade(word);
                    }
                    if (SearchDiscipline(word) != null){
                        discipline = SearchDiscipline(word);
                    }
                }

                sb.append("Студент " + surname);               
                sb.append(" получил " + grade);
                sb.append(" по предмету " + discipline + ".");

                System.out.println(sb.toString());
                sb.setLength(0);
                line = br.readLine();                
            }
            br.close();           
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }


    public static String SearchSurname(String s) {
        Pattern pattern1 = Pattern.compile("фамилия");
        Matcher matcher = pattern1.matcher(s);

        String surname = null;
        if (matcher.find()){
            surname = s.replaceAll("\"фамилия\":", "");
            surname = surname.replaceAll("\"", "");
        }    
        return surname;
    }
    public static String SearchGrade(String s) {
        Pattern pattern1 = Pattern.compile("оценка");
        Matcher matcher = pattern1.matcher(s);

        String surname = null;
        if (matcher.find()){
            surname = s.replaceAll("\"оценка\":", "");
            surname = surname.replaceAll("\"", "");
        }    
        return surname;
    }
    public static String SearchDiscipline(String s) {
        Pattern pattern1 = Pattern.compile("предмет");
        Matcher matcher = pattern1.matcher(s);

        String surname = null;
        if (matcher.find()){
            surname = s.replaceAll("\"предмет\":", "");
            surname = surname.replaceAll("\"", "");
        }    
        return surname;
    }

}
