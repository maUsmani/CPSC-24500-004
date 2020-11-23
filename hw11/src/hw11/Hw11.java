/*
 * Ammar Irfan 
 * 11/08/2020
 * This program is a practise of Serialization 
 * Create a menu driven program as following and convert the Class object
 * into ByteObject and cast again in a proper object.
 */
package hw11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Ammar
 */
public class Hw11 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        final int size =5;                                  //Constant Size of Array
        Scanner inputScanner = new Scanner(System.in);      
        Student[] arrStudent = new Student[size] ;        
        
        //Take the object after user input
        //write on a byte file and read it back
        //place the read object into the array.
        for (int i = 0; i<size; i++){
            Student xStudent = new Student();
            
            System.out.println("Student: " + (i+1));
            
            System.out.print("Name: ");
            xStudent.setName(inputScanner.next());
            System.out.print("Phone Number: ");
            xStudent.setPhone(inputScanner.nextInt());
            System.out.print("Date of Birth: ");
            xStudent.setBirthday(inputScanner.next());
            System.out.print("Address: ");
            xStudent.setAddress(inputScanner.next());     
            
            try{
                writeToFile(xStudent);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            try{
                arrStudent[i] = readFromFile();
            } catch (IOException | ClassNotFoundException e){
                System.out.println(e.getMessage());
            }
        }
        //Print THe array.
        for (int i = 0; i<size; i++){
            System.out.println( arrStudent[i].toString());
        }
        
        
            
    }
    
    public static void writeToFile(Student x) throws FileNotFoundException, IOException{
        ObjectOutputStream objectOutputStream = new ObjectOutputStream (new FileOutputStream("customer.bin"));
        objectOutputStream.writeObject(x);
    }
    
    public static Student readFromFile() throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream objectInputStream = new ObjectInputStream (new FileInputStream("customer.bin"));
        Student newStudent = (Student) objectInputStream.readObject();
        return newStudent;
        
    }
    
}

