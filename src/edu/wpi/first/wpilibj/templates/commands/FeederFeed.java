/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.DriverStationLCD;

/**
 *
 * @author 3851
 */
public class FeederFeed extends CommandBase {
    public FeederFeed() {
        requires(feeder);
        setTimeout(feeder.feedRotation);
    }

    protected void initialize() {
    }

    protected void execute() {
        feeder.feed();
        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser3, 1, "FeedRotation"+feeder.feedRotation);
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
