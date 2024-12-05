package school;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) {

        readFromFile();
        addStudent();
        writeToFile(students);
//        System.out.println(students);

        System.out.println(getAllEuropeanStudents(students));

    }

    public static ArrayList <String> getAllEuropeanStudents(ArrayList<Student> students){
        ArrayList <String> europeanStudents = new ArrayList<>();
        for(Student student : students){
            if(student.isEuropean()){
                europeanStudents.add(student.getName());
            }
        }
        return europeanStudents;

    }

    public static void addStudent(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give the firstName");

        String name = scanner.nextLine();

        System.out.println("What course are you taking");

        String course = scanner.nextLine();

        System.out.println("Are you based out of Europe(true/false): ");

        boolean isGerman = scanner.nextBoolean();

        students.add(new Student(name,course,isGerman));
    }

    public static void readFromFile(){

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("students.txt"))){

            String line;

            while((line = bufferedReader.readLine()) != null){

               // System.out.println(Arrays.toString(line.split(",")));
                String[] student = line.split(",");

                students.add(new Student(student[0],student[1],Boolean.parseBoolean(student[2])));


            }
        }
        catch(IOException e){

        }
    }

    public static void writeToFile(ArrayList<Student> students){

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("students.txt"))){

            for( Student student : students){
                bufferedWriter.write(String.valueOf(student.saveToDatabase()));
                bufferedWriter.newLine();
            }

        }
        catch(IOException e){
            System.out.println("Issue writing to file, please try again");
        }
    }


}
