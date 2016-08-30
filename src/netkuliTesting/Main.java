/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netkuliTesting;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import org.sikuli.script.*;

/**
 *
 * @author Phildor92
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        final String VERSION = "Netkuli 0.2";//version 0.2-16.08.30-A
        Screen curScr = new Screen();
        ImagePath.setBundlePath(".\\src\\netkuliTesting\\img");
        
        int continueVar = 1;
                     
        TestRail tr1 = new TestRail();
        while (continueVar == 1){
            continueVar = tr1.runTestRailScript();
        }
    }
    
}
