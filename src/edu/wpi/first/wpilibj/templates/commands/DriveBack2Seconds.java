/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author 3851
 */
public class DriveBack2Seconds extends CommandBase{

    private int i2;
    public DriveBack2Seconds() {
        requires(drivetrain);
        setTimeout(2);
    }
    
    protected void initialize() {
    }

    protected void execute() {
        //2000 cycles ~~ 0.9 seconds
        /*for (i2=0; i2<4000; i2++) {
            drivetrain.mecanumDrive_Polar(.25, 180, 0);
        }*/
        drivetrain.mecanumDrive_Polar(.25, 180, 0);
    }

    protected boolean isFinished() {
        //experimenting with timeouts to see if similar to delays
        /*if (i2<2000) {
            return false;
        }
        else {
            return true;
        }*/
        return isTimedOut();
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
