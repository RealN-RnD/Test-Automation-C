/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netkuliTesting;
import org.sikuli.script.*;

/**
 *
 * @author Phildor92 <phillip.evans09@hotmail.com>
 */
public class Sanity {
    String version = "Sanity 0.1"; //version 0.1-16.09.01-A
    
    Sikulix ss = new Sikulix();
    Screen curScr = new Screen();
        
    public void SanityRunWithChecks(){
        ss.run("C:\\Program Files (x86)\\Niko\\Home Control Program\\Home Control.exe");
        curScr.wait(5.0);
        //TODO: Copy Sikulix script for Sanity run and img.
        //TODO: Add checks and write results to log.
        //TODO: Add Sanity overview modification. Via sikulix or java?? Visual vs code-based text-edit?
        //TODO: Investigate OBS recording integration (after core code completion).
        ss.run("C:\\Program Files (x86)\\obs-studio\\bin\\64bit\\obs64.exe");
        curScr.wait(5.0);
    }
    
    public void SanityRunNoMonitor(){
        ss.run("C:\\Program Files (x86)\\Niko\\Home Control Program\\Home Control.exe");
        curScr.wait(1.0);
        //TODO: Copy Sikulix script for Sanity run and img
    }
}
