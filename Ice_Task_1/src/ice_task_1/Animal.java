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
public class Animal {
    private int IDtag;
    private String species ;

     public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID tag: ");
        IDtag = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter species: ");
        species = scanner.nextLine();
    }

    public void output() {
        System.out.println("ID tag: " + IDtag);
        System.out.println("Species: " + species);
    }
     
    
    
    public int getIDtag() {
            return IDtag;
        }

        public void setIDtag(int IDtag) {
            this.IDtag = IDtag;
        }

        public String getSpecies() {
            return species;
        }

        public void setSpecies(String species) {
            this.species = species;
        }
}
