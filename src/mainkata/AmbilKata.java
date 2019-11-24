package mainkata;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AmbilKata {

    private String[] kataArr = new String[]{};

    public String[] getKataArr(String level) {
        
        File file = null;
        if(level.equalsIgnoreCase("1")){
            file = new File("satukata.txt");
            kataArr = new String[21];
        }else if(level.equalsIgnoreCase("2")){
            file = new File("duakata.txt");
            kataArr = new String[34];
        }else if(level.equalsIgnoreCase("3")){
            file = new File("satukata.txt");
            kataArr = new String[21];
        }else{
            System.out.println("level tidak ditemukan");
        }
        
        Scanner input;
        String z = "";
        try {
            input = new Scanner(file);
            input.useDelimiter("\n");
            int i=0;
            while (input.hasNextLine()) {
                String line = input.nextLine();
                kataArr[i]=line;
                i++;
                //System.out.println(line);
            }
            input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AmbilKata.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return kataArr;
    }

    public void setKataArr(String[] kataArr) {
        this.kataArr = kataArr;
    }
    

}