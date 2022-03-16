/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author enara
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //every class needs an object in the main method so that their properties can be accessed
        MixColumns MC = new MixColumns(); 
        Arithmetic helpers = new Arithmetic();
        
        //tests
        //System.out.println(MC.hexConversion("0101")); //works
        //System.out.println(helpers.multiplicationLookup("F","8")); //seems to work
        //System.out.println(MC.nibbleMultiply("0011","0010")); //works
        
        ArrayList<String> blocktext = new ArrayList<>(); //from our encryption working
        blocktext.add("0010");
        blocktext.add("1111");
        blocktext.add("1000");
        blocktext.add("1110");
        
        System.out.println(blocktext);

        blocktext = MC.matrixMultiply(blocktext);
        
        System.out.println(blocktext); //works
    }
    
    
    
}
