/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.shooter;

import edu.wpi.first.wpilibj.DriverStationLCD;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author 3851
 */
public class ShooterRunShooters extends CommandBase{
    public ShooterRunShooters() {
        requires(shooter);
    }
    protected void initialize() {
    }

    protected void execute() {
        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser5, 1, "isRetreated"+shooter.isRetreated());
        DriverStationLCD.getInstance().updateLCD();
        while (shooter.isRetreated()) {
            shooter.runShooters();
        }
    }

    protected boolean isFinished() {
        return shooter.isRetreated();
    }

    protected void end() {
        shooter.doNothing();
    }

    protected void interrupted() {
    }
    
}
