/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.feeder;

import edu.wpi.first.wpilibj.DriverStationLCD;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author 3851
 */
public class FeederHalfway extends CommandBase{
    public FeederHalfway() {
        requires(feeder);
        setTimeout(feeder.feedHalfRotation);
    }

    protected void initialize() {
    }

    protected void execute() {
        feeder.feed();
        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser2, 1, "FeedHalfRotation"+feeder.feedHalfRotation);
        DriverStationLCD.getInstance().updateLCD();
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
        feeder.doNothing();
    }

    protected void interrupted() {
    }
    
}
