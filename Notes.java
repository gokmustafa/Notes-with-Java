import java.util.Scanner;
public class Notes {

        public static void main(String[] args) {
            int history, math, physics, chemistry, total;

            Scanner note = new Scanner (System.in);
            System.out.println("Please Enter Notes");

            System.out.print("Please enter history note:");
            history = note.nextInt();

            System.out.print("Please enter math notes:");
            math = note.nextInt();

            System.out.print("Please enter physics notes:");
            physics = note.nextInt();

            System.out.print("Please enter chemistry notes:");
            chemistry = note.nextInt();

            total = (history+ math+ physics+ chemistry);
            double result = total/4;
            System.out.print("Average="+result);




        }


}
