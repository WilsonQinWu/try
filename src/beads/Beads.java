/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beads;

/**
 *
 * @author Megha,2019
 */
public class Beads {

    public String color;
    public char letter;
        
    /**
     * @param args the command line arguments
     */
    Beads(){}
   Beads(String clr)
   {
       color=clr;
   }
    /**getter for the color field
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /** setter for the color field
     * @param color the color to set
     */
    public void setColor(String clr) {
        color = clr;
    }

    /**getter for the letter
     * @return the letter
     */
    public char getLetter() {
        return letter;
    }

    /**
     * @param letter the letter to set
     */
    public void setLetter(char ltr) {
        letter = ltr;
    }
    
}
