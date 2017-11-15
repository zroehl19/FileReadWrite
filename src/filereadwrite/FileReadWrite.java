/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadwrite;

import java.io.BufferedReader;
import java.util.ArrayList;

/**
 *
 * @author zroehl
 */
public class FileReadWrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();
        
        try(BufferedReader in = new BufferedReader(BoyNames.txt))
        {
            
        }
        catch(exception e)
        {
            
        }
    }
    
}
