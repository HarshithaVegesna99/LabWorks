package collection;
import java.util.HashMap;
import java.util.Set;
public class Exercise4{

       public HashMap<String,String> getStudent(HashMap<String,Integer> stu)
       {
              HashMap<String,String> medal = new HashMap<>();
              Set<String> set = stu.keySet();
              for(String s:set)
              {
                     Integer marks = stu.get(s);
                     if(marks>=90)
                     {
                           medal.put(s,"Gold");
                     }
                     else if(marks >=80)
                     {
                           medal.put(s,"Silver");
                     }
                     else if(marks>=70)
                     {
                           medal.put(s,"Bronze");
                     }
              }
              return medal;
       }
       public static void main(String[] ar)
       {
              HashMap<String,Integer> stu = new HashMap<>();
              Exercise4 s = new Exercise4();
              stu.put("1",65);
              stu.put("2",76);
              stu.put("3",89);
              stu.put("4",90);
              stu.put("5",93);
              System.out.println(s.getStudent(stu));
       }
}