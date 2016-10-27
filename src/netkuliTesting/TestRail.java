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
 * 
 * Latest changes
 */
public class TestRail {
    private Sikulix ss = new Sikulix();
    
    private String version = "TestRail alpha 1.11";//version 1.11-16.09.01-B
    private Screen curScr = new Screen(0);
    //ss.popat(curScr) //Sikulix 1.1.1

    private String aut = "3.7.0 (534)";
    private String winVariable = "iPhone 6, iOS 9.3.5\niPad mini, iOS 9.2.1\n\nClaCo";
    private String macVariable = "Mac OS X 10.10.5\nMacBook Pro (Retina 13-inch Late 2013)\nModel A1502\n\nCoCo Setup";  
    private boolean isWindows;
    
    //TODO: add variable input
    public void theVariables(){
        isWindows = ss.popAsk("Are you testing on Windows?", version);
        if (isWindows) ss.popup("These are the variables:\n" + winVariable + "\n\n" + aut);
        else ss.popup("These are the variables: " + macVariable + "\n\n" + aut);
    }
    public int runTestRailScript(){
        try{
        curScr.click("1470125507873.png");
        ss.popup("Press OK when you have finished testing", version);
        curScr.click("1470125519799.png");
        curScr.wait(1.0);
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
            String defect = ss.input("Please enter defect code", "NHCXXX-###", version);
            curScr.click("1470210216668.png");
            curScr.paste(defect);
            ss.popup("Select test steps that failed and change Status", version);
        }

        curScr.click("1470644657529.png"); //replace with more precise Pattern search
        curScr.wait(1.0);
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
                        return 0;
                }
        return 1;
    }
    
}
