/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ice_task_1;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class Bird extends Animal{
      private int colour ;
   
      
    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter feather colour (1=grey, 2=white, 3=black): ");
        colour = scanner.nextInt();
    }

    @Override
    public void output() {
        super.output();
       if (colour  == 1) {
           System.out.println("Feather colour: grey ");
        }
         if (colour  == 2 ){
            System.out.println("Feather colour: white");
        }   
         if (colour == 3 ){
             System.out.println("Feather colour: black");
         }
               
       
    }
     
     public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }
}
