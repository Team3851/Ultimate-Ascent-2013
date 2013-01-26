/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author 3851
 */
public class FeederDoNothing extends CommandBase{
    public FeederDoNothing() {
        requires(feeder);
    }

    protected void initialize() {
    }

    protected void execute() {
        feeder.doNothing();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
