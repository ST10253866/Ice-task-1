/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice_task_1;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class Ice_Task_1 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      Bird brd = new Bird ();
      Reptile rept = new Reptile ();
      Scanner kb = new Scanner(System.in);
      int choice ; 
        System.out.println("Please enter 1 for details on Birds :"
        + " \nPlease enter 2 for details on Reptiles : ");
       choice = kb.nextInt();
    
       
       switch(choice){
       case 1 :    System.out.println("Enter details for the bird:");
        brd.input();
         System.out.println("\nBird details:");
        brd.output();
        break;
       case 2 :  System.out.println("Enter details for the reptile:");
        rept.input();
         System.out.println("\nReptile details:");
        rept.output();
        
        
     }
      
    }
   
}
