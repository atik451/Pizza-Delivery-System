
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class sicilian_pizza implements pizza {
    public void History(){
    try {
      File myObj = new File("E:\\sicilian_history.txt");
      Scanner myReader = new Scanner(myObj);
      
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
    public void Speciality(){
    try {
      File myObj = new File("E:\\sicilian_speciality.txt");
      Scanner myReader = new Scanner(myObj);
      
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
    public void Price(){
    try {
      File myObj = new File("E:\\sicilian_price.txt");
      Scanner myReader = new Scanner(myObj);
      
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
   
}
