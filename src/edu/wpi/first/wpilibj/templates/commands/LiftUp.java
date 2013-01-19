/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author 3851
 */
public class LiftUp extends CommandBase{
    
    public LiftUp() {
        requires(lift);
    }

    protected void initialize() {
    }

    protected void execute() {
        lift.liftUP();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
