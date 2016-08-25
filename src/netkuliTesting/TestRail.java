/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netkuliTesting;
import org.sikuli.script.*;

/**
 *
 * @author eurofins1
 */
public class TestRail {
    Sikulix ss = new Sikulix();
    
    String version = "TestRail alpha 1.9";//version 1.9-17.08.25-A
    Screen curScr = new Screen(0);
    //popat(curScr)

    String aut = "1.14.0.67";
    String winVariable = "";
    String macVariable = "Mac OS X 10.10.5\nMacBook Pro (Retina 13-inch Late 2013)\nModel A1502\n\nBackend 1.14.0.60";  
    

    boolean isWindows = ss.popAsk("Are you testing on Windows?", version);
    
    public int runTestRailScript(){
        try{
        curScr.click("1470125507873.png");
        ss.popup("Press OK when you have finished testing", version);
        curScr.click("1470125519799.png");
        curScr.wait("1470046377455.png");
        if (!isWindows){
            curScr.click("1470046377455.png");   
            curScr.paste(macVariable);
        } else {
            curScr.click("1470046377455.png");
            curScr.paste(winVariable);
        }
        curScr.click("1470046406673.png");
        curScr.click("1470223593900.png");
    
        curScr.paste(aut);
        curScr.click("1470046187921.png");
        if (!isWindows){
            curScr.type("Mac OS X 10.10");
        } else {
            curScr.type("Windows 7 64");
        }
        boolean answer = ss.popAsk("Did the test pass?", version);
        if (!answer){
            String defect = ss.input("Please enter defect code");
            curScr.click("1470210216668.png");
            curScr.paste(defect);
            ss.popup("Select test steps that failed and change Status", version);
        }

        curScr.click("1470644657529.png"); //replace with more precise Pattern search
        curScr.wait("1470126608431.png");
        curScr.click("1470126608431.png");
        boolean doWeContinue = ss.popAsk("Another test?", version);
        if (!doWeContinue){
            ss.popup("You're Winner", version);
            return 0;
        }
        }
        catch(FindFailed e){
                        e.printStackTrace();
                }
        return 1;
    }
    
}
