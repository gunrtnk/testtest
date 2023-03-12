import java.util.Scanner;

import javax.swing.JOptionPane;

public class Q1 {
    /**
     * @param args
     * @throws Exception
     */ 
  
    public static void main(String[] args) throws Exception {

       Scanner input = new Scanner(System.in);
       System.out.print("Enter Input : ");
       int height = input.nextInt();
       Christmastree tree = new Christmastree(height);
       tree.draw(height);
    }
}
