package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.templates.commands.lift.LiftArmDeployForward;
import edu.wpi.first.wpilibj.templates.commands.lift.LiftArmDeployBack;
import edu.wpi.first.wpilibj.templates.commands.lift.LiftDown;
import edu.wpi.first.wpilibj.templates.commands.lift.LiftUp;
import edu.wpi.first.wpilibj.templates.commands.feeder.FeederFeed;
import edu.wpi.first.wpilibj.templates.commands.feeder.FeederHalfway;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.*;
/*import edu.wpi.first.wpilibj.templates.commands.LiftDown;
import edu.wpi.first.wpilibj.templates.commands.LiftUp;*/

/**
 * <p>The operator interface class ties the commands that have been implemented
 * to the physical controls of the user. This allows you to bind the same
 * command that executes autonomous to a button. It also reveal the joystick as
 * used by the DriveWithJoysticks command.</p>
 * 
 * @author Alex Henning
 */
public class IO {
    // Create the joystick and of the 9 buttons on it
    Joystick leftJoy = new Joystick(1);
    Joystick rightJoy = new Joystick(2);
    Joystick switchBoard = new Joystick(3);
    
    //left joystick buttons
    Button buttonL1 = new JoystickButton(leftJoy, 1),
            buttonL2 = new JoystickButton(leftJoy, 2),
            buttonL3 = new JoystickButton(leftJoy, 3),
            buttonL4 = new JoystickButton(leftJoy, 4),
            buttonL5 = new JoystickButton(leftJoy, 5),
            buttonL6 = new JoystickButton(leftJoy, 6),
            buttonL7 = new JoystickButton(leftJoy, 7),
            buttonL8 = new JoystickButton(leftJoy, 8),
            buttonL9 = new JoystickButton(leftJoy, 9);
    
    Button buttonShooter = new JoystickButton(switchBoard, 1);
    
    /**
     * Bind the press of each button to a specific command or command group.
     */
    public IO() {
        //button#.whenPressed(new Command());
        //control lift arm
        buttonL7.whileHeld(new LiftArmDeployForward());
        buttonL8.whileHeld(new LiftArmDeployBack());
        
        
        //control lift winch
        buttonL5.whileHeld(new LiftUp());
        buttonL6.whileHeld(new LiftDown());
        
        
        
        //feed frisbees to shooter
        /*use full rotation, then half, then full after
         *this loads the first frisbee, creates room for 4 at once, 
         *full rots after keeps loading 
         */
        buttonL2.whenPressed(new FeederFeed());
        buttonL3.whenPressed(new FeederHalfway());
    }
    
    /**
     * @return The value of the left joystick.
     */
    
    //trehshold set at 0.1 for magnitude
    public double getLeftMagnitude() {
        if (Math.abs(leftJoy.getMagnitude())<0.1) {
            return 0;
        }
        else {
            return leftJoy.getMagnitude();
        }
    }
    public double getLeftDirection() {
        return leftJoy.getDirectionDegrees();
    }
    public double getLeftY() {
        return leftJoy.getY();
    }
    public double getLeftX() {
        return leftJoy.getX();
    }
    
    //threshold set at 0.1 for joystick speed
    public double getRightX() {
        if (Math.abs(rightJoy.getX())<0.1) {
            return 0;
        }
        else {
            return rightJoy.getX();
        }
    }
    public double getRightY() {
        return rightJoy.getY();
    }
}

