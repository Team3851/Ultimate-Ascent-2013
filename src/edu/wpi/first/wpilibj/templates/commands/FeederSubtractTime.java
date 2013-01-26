/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author 3851
 */
public class FeederSubtractTime extends CommandBase{
    public FeederSubtractTime() {
    }

    protected void initialize() {
        feeder.feedHalfRotation=feeder.feedHalfRotation-0.05;
        feeder.feedRotation=feeder.feedRotation-0.05;
    }

    protected void execute() {
        
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
