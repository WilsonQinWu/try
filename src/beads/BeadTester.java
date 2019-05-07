/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beads;

/**
 *
 * @author Megha
 */
public class BeadTester {
    public static void main(String[] args)
    {
        Beads b1=new Beads();
        b1.setColor("White");
        System.out.println(b1.getColor());
      
          Beads b2=new Beads("black");
        System.out.println(b2.getColor());
          
    }
}
