package beads;
import java.util.Scanner;
/**
 * @WU,QIN
 */
public class Student
{
   private int id;
   private String name;

   public static void main (String[] args)
   {
      Student[] list = new Student[5];
      Scanner in = new Scanner(System.in);
      System.out.println(list.length);

      for (int i = 0; i < list.length; i++) {
         list[i] = new Student();
         System.out.println("Enter student id: ");
         list[i].id = in.nextInt();
         System.out.println("Enter student name: ");
         list[i].name = in.next();
         System.out.println("student id: " + list[i].id + " " + "student name:" + list[i].name);
      }
   }
}
