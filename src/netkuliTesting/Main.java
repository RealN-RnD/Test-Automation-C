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
     * @throws java.io.IOException
     * @throws org.sikuli.script.FindFailed
     */
    public static void main(String[] args) throws IOException, FindFailed {
        final String VERSION = "Netkuli 0.2";//version 0.2-16.09.01-A
        Screen curScr = new Screen();
        ImagePath.setBundlePath(".\\src\\netkuliTesting\\img");
        Sikulix sScript = new Sikulix();

        int continueVar = 1;

        boolean isThisTestRail = sScript.popAsk("Is this a test run?", VERSION);
        if (isThisTestRail) {
            TestRail tr1 = new TestRail();
            while (continueVar == 1) {
                continueVar = tr1.runTestRailScript();
            }
        } else {
            boolean isThisInstall = sScript.popAsk("Is this an install?", VERSION);
            if (isThisInstall) {
                NikoInstallation ni1 = new NikoInstallation();
                ni1.winInstall();
            }
        }
    }
}
