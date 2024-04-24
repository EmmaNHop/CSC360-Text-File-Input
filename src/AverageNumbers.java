import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String fileName = "";
        try {
            System.out.print("Enter name of input file: ");
            fileName = scan.nextLine();
            java.io.File file = new java.io.File("src/" + fileName);
            Scanner input = new Scanner(file);  // Create a Scanner for the file

            Average(input);
        }
        catch(Exception e){
            System.out.println("Could not find file: " + fileName);
        }
    }
    public static void Average (Scanner input){
        int total = 0;
        int parsable = 0;
        int unparsable = 0;
        String fileInput = "";
        while (input.hasNextLine()){ // Read data from a file
            try{
                fileInput = input.nextLine();
                total += Integer.parseInt(fileInput);
                parsable ++;
                System.out.println(total);
            }
            catch(NumberFormatException ex){
                System.out.println("Cannot parse " + fileInput + " as an integer");
                unparsable++;
            }
        }
        System.out.println("Number of parsable lines: " + parsable);
        System.out.println("Average value: " + (double)(total)/parsable);
        System.out.println("Number of unparsable lines: " + unparsable);
    }
}