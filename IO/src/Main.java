import java.io.*;

public class Main {
    public static void main(String[] args) {
        //        writeToFile();
//        appendToFile("Aron");
//        appendToFile("Hasan");
//        appendToFile("Maryam");
//        appendToFile("Martine");

        readFromFile();
    }






    public static void writeToFile(){
        System.out.println("Write to file method");
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"))){

//            .write(): will write to my file
            bufferedWriter.write("Hasan");

        }
        catch(IOException e){
            System.out.println("Error: Something went wrong");
        }
    }

    public static void appendToFile(String student) {



        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt",true))){

            bufferedWriter.write(student);
            bufferedWriter.newLine();
        }
        catch(IOException e){
            System.out.println("Error: Something went wrong");
        }
    }

    public static void readFromFile(){


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("output.txt"))) {


            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);

            }




        }
        catch(IOException e){
            System.out.println("Error: occured when reading from file");
        }


    }
}