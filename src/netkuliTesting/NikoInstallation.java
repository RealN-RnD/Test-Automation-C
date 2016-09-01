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
import static java.nio.file.StandardCopyOption.*;
import java.nio.file.*;

/**
 *
 * @author Phildor92 <phillip.evans09@hotmail.com>
 */
public class NikoInstallation {

    private Sikulix ss = new Sikulix();
    private Screen curScr = new Screen(0);

    private final String VERSION = "0.1";//version alpha 0.1-16.09.01-A

    public void winInstall() throws IOException, FindFailed {
        /*boolean answer = ss.popAsk("Uninstall first?");
        if (answer) {
            winUninstall();
        }*/
        boolean skipInstall = ss.popAsk("Skip install?", VERSION);
        if (!skipInstall) {
            Desktop.getDesktop().open(new File("C:\\Users\\" + System.getenv("USERNAME") + "\\Downloads"));
            curScr.doubleClick("1472465623000.png");
            curScr.wait(5.0);
            curScr.type(Key.ENTER);
            curScr.wait(1.0);
            curScr.type(Key.ENTER);
            curScr.wait(1.0);
            Pattern pattern4 = new Pattern("1472465721069.png");
            curScr.click(pattern4.targetOffset(-91, -8));
            curScr.wait(1.0);
            curScr.type(Key.ENTER);
            curScr.wait(1.0);
            curScr.type(Key.ENTER);
            curScr.wait(1.0);
            curScr.type(Key.ENTER);
            curScr.wait(1.0);
            curScr.type(Key.ENTER);
            curScr.wait(1.0);
            curScr.type(Key.ENTER);
            curScr.wait(1.0);
            curScr.type(Key.ENTER);
            curScr.wait(20.0);
            curScr.wait("1472465828699.png");
            curScr.type(Key.ENTER);
            curScr.wait(1.0);
            Pattern pattern5 = new Pattern("1472472774966.png");
            curScr.click(pattern5.targetOffset(-110, -3));
            curScr.wait(1.0);
            curScr.type(Key.ENTER);
            curScr.wait(1.0);
            curScr.dragDrop("1472465907811.png", "1472465926332.png");
            curScr.wait(2.0);
        }
            frontBackLogging("win"); 
   }

    public void macInstall() throws IOException {
        frontBackLogging("mac");
    }

    public void frontBackLogging(String os) throws IOException {
        Path path1 = Paths.get("C:\\Program Files (x86)\\Niko\\Configurator.exe.config");
        Path path2 = Paths.get("C:\\Program Files (x86)\\Niko\\Home Control Program\\service\\Configurator.exe.config");
        Files.copy(path1, path2, REPLACE_EXISTING);
    }

    public void winUninstall() throws FindFailed, IOException {
        ss.run("C:\\Program Files (x86)\\Niko\\Home Control Program\\unins000.exe"); 
        Pattern pattern1 = new Pattern("1472466195902.png");
        curScr.wait(pattern1.similar(0.92f));
        Pattern pattern2 = new Pattern("1472466203187.png");
        curScr.click(pattern2.similar(0.76f));
        curScr.wait(2.0);
        Pattern pattern3 = new Pattern("1472465145454.png");
        curScr.click(pattern3.targetOffset(87, 39));
    }
}
