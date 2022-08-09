
package main;

import java.io.*;
import java.util.Scanner;
import java.lang.*;
import static main.Main.main_page;
public class Main {
static Scanner sc=new Scanner(System.in);
    
    
    
    public static void main_page(){
        
        System.out.println("Do you want to order pizza? type 'yes' ");
        String text="yes";
        String choice=sc.nextLine();
        
        if(text.equals(choice)){
            System.out.println("which pizza do you want to order:"
                    + "\n1.Neapoliton Pizza"
                    + "\n2.Sicilian Pizza"
                    + "\n3.Chicago Pizza");
            int pizza_choice;
            
            
                pizza_choice=sc.nextInt();
                sc.nextLine();
            
            switch(pizza_choice){
                case 1:
                    neapolitan_pizza obj = new neapolitan_pizza();
                obj.History();
                obj.Speciality();
                obj.Price();
                    break;
                case 2:
                    sicilian_pizza obj1 = new sicilian_pizza();
                obj1.History();
                obj1.Speciality();
                obj1.Price();
                    break;
                case 3:
                    chicago_pizza obj2 = new chicago_pizza();
              
                obj2.History();
                obj2.Speciality();
                obj2.Price();
                    break;
                default:
                    System.out.println("you input wrong keyword");
                    main_page();
                    break;
                    

            }
        }
    
        else{
            System.out.println("you input wrong keyword");
            System.exit(0);
        
        }
    }
    
    public static void order_page(){
            System.out.println("If you want to order press 1 or press any key to exit");
           
           String text = "1";
           String choiceof = sc.next();
           if(text.equals(choiceof)){
            
                System.out.println("Enter package: ");
                System.out.println("1.Single\n2.Double");
                int choiceO = sc.nextInt();
                
                switch (choiceO){
                    case 1:
                        System.out.println("You Have Chosen Single Pizza Package");
                        break;
                        
                    case 2:
                        System.out.println("You Have Chosen Double Pizza Package");
                        break;
                    default:
                        main_page();
                }
                System.out.println("Enter number of items:");
                int choiceI = sc.nextInt();
                System.out.println("Thanks for your order. It will take 15 mins to serve your order!");
            }
            else{
            System.exit(0); 
            }
        }


    public static void main(String[] args) {
        
       
        main_page();
        order_page();
        
    }
}


