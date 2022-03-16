
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enara
 */
public class MixColumns {
    private String[][] hexTable;
    private String[] constantMatrix;
    private Arithmetic helpers;

    //constructor
    public MixColumns() {
        this.hexTable = new String[][] {
            {"0000","0"},
            {"0001","1"},
            {"0010","2"},
            {"0011","3"},
            {"0100","4"},
            {"0101","5"},
            {"0110","6"},
            {"0111","7"},
            {"1000","8"},
            {"1001","9"},
            {"1010","A"},
            {"1011","B"},
            {"1100","C"},
            {"1101","D"},
            {"1110","E"},
            {"1111","F"},     
        };
        
        this.constantMatrix = new String[]{"0011", "0010", "0010", "0011"};
        
        this.helpers = new Arithmetic();
    }

    //getters
    public String[] getConstant(){
        return this.constantMatrix;
    }
    
    public String[][] getHexTable(){
        return this.hexTable; 
    }
    
    //other methods
    public String hexConversion(String nibble){
        String hexDigit = "";
        
        for (int i = 0; i < hexTable.length; i++){
            if (nibble == hexTable[i][0]){
                hexDigit = hexTable[i][1];
            }
        }
        
        return hexDigit;
    }
    
    public String inverseHexConversion(String nibble){
        String hexDigit = "";
        
        for (int i = 0; i < hexTable.length; i++){
            if (nibble == hexTable[i][1]){
                hexDigit = hexTable[i][0];
            }
        }
        
        return hexDigit;
    }
    
    public String nibbleMultiply(String nibble1, String nibble2){
        String nibble1Hex = hexConversion(nibble1);
        String nibble2Hex = hexConversion(nibble2);
        
        String hexProduct = helpers.multiplicationLookup(nibble1Hex, nibble2Hex);
        
        return inverseHexConversion(hexProduct);
    }
    
    public ArrayList<String> matrixMultiply(ArrayList<String> blocktext){
        ArrayList<String> tempBlock = new ArrayList<>();
        
        Integer[][] rowPattern = new Integer[][]{{0,1}, {0,1}, {2,3}, {2,3}};
        Integer[][] colPattern = new Integer[][]{{0,2}, {1,3}, {0,2}, {1,3}};
        
        for (int i = 0; i < 4; i++){
            String nibbleProduct1 = nibbleMultiply(getConstant()[rowPattern[i][0]], blocktext.get(colPattern[i][0]));
            String nibbleProduct2 = nibbleMultiply(getConstant()[rowPattern[i][1]], blocktext.get(colPattern[i][1]));
        
            String finalNibble = helpers.addNibble(nibbleProduct1, nibbleProduct2);
        
            tempBlock.add(finalNibble);
        }
        
        return tempBlock;
    }
}
