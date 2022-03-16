/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enara
 */
public class Arithmetic {
    private String[][] multiplicationTable;
    
    //constructor
    public Arithmetic(){
        this.multiplicationTable = new String[][]{
            {"X","0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"},
            {"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
            {"1","0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"},
            {"2","0","2","4","6","8","A","C","E","3","1","7","5","B","9","F","D"},
            {"3","0","3","6","5","C","F","A","9","B","8","D","E","7","4","1","2"},
            {"4","0","4","8","C","3","7","B","F","6","2","E","A","5","1","D","9"},
            {"5","0","5","A","F","7","2","D","8","E","B","4","1","9","C","3","6"},
            {"6","0","6","C","A","B","D","7","1","5","3","9","F","E","8","2","4"},
            {"7","0","7","E","9","F","8","1","6","D","A","3","4","2","5","C","B"},
            {"8","0","8","3","B","6","E","5","D","C","4","F","7","A","2","9","1"},
            {"9","0","9","1","8","2","B","3","A","4","D","5","C","6","F","7","E"},
            {"A","0","A","7","D","E","4","9","3","F","5","8","2","1","B","6","C"},
            {"B","0","B","5","E","A","1","F","4","7","C","2","9","D","6","8","3"},
            {"C","0","C","B","7","5","9","E","2","A","6","1","D","F","3","4","8"},
            {"D","0","D","9","4","1","C","8","5","2","F","B","6","3","E","A","7"},
            {"E","0","E","F","1","D","3","2","C","9","7","6","8","4","A","B","5"},
            {"F","0","F","D","2","9","6","4","8","1","E","C","3","8","7","5","A"},
        };
    }
    
    public String[][] getMultiplicationTable(){
        return this.multiplicationTable;
    }
    
    public String multiplicationLookup(String hex1, String hex2){
        int rowIndex = 0;
        int columnIndex = 0;
        
        for (int i = 0; i < multiplicationTable.length; i++){
            if (multiplicationTable[i][0] == hex1){
                rowIndex = i;
            }
        }
        
        for (int i = 0; i < multiplicationTable[0].length; i++){
            if (multiplicationTable[0][i] == hex2){
                columnIndex = i;
            }
        }
        
        return multiplicationTable[columnIndex][rowIndex];
    }
    
    public String addNibble(String nibble1, String nibble2){
        String outputNibble = "";
        for (int i = 0; i < 4; i++){
            if (nibble1.charAt(i) == nibble2.charAt(i)){
                outputNibble += "0";
            } else {
                outputNibble += "1";
            }
        }
        
        return outputNibble;
    }
}
