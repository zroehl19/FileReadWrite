/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadwrite;

import java.io.*;
import java.util.*;
import java.nio.file.Files;

/**
 *
 * @author zroehl
 */
public class FileReadWrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name = "";
        ArrayList<String> names = new ArrayList<>();
        
        
        
        try(BufferedReader input = new BufferedReader(new FileReader(new File("BoyNames.txt"))))
        {
            for(int i = 0; i < 200; i++)
            {
                name = input.readLine();
                names.add(name);
            }
        }
        catch(IOException e)
        {
        }
        
        Collections.sort(names);
        
       
        
        try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("alphBetNames.txt", true))))
        {
            for(String nam:names)
            {
                writer.println(nam);
            }
        }
        catch(IOException e)
        {
        }
    }
    
}
