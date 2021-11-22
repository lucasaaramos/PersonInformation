/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personinformation;

/**
 *
 * @author lucas
 */
public class PersonInformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        People [] p = new People[2];
        Book [] l = new Book[3];
        
        p[0] = new People("Lucas", 25, 'M');
        p[1] = new People("Bianca", 25, 'F');
        
        l[0] = new Book("Learning Java", "José", 300, p[0]);
        l[1] = new Book("Begginers in Java", "Maria", 500, p[1]);
        l[2] = new Book("All about Java", "Lucas", 800, p[0]);
        
        l[0].open();
        l[0].folhear(100);
        l[0].skipPage();
        System.out.println(l[0].detals());
        
        
    }
    
}
