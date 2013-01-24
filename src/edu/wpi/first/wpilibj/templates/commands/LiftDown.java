/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author 3851
 */
public class LiftDown extends CommandBase{
    
    public LiftDown() {
        requires(lift);
    }

    protected void initialize() {
    }

    protected void execute() {
        lift.liftDOWN();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
