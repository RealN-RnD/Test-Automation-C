/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netkuliTesing;
import org.sikuli.script.*;

/**
 *
 * @author eurofins1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Screen curScr = new Screen();
        ImagePath.setBundlePath(".\\src\\netkuliTesting\\img");
        
        try{
            curScr.click("1470125507873.png");
        }
        catch(FindFailed e){
            e.printStackTrace();
        }
    }
    
}
