package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * 
 * <p>One of the benefits of the RobotMap is you can write your code without 
 * knowing the ports in advance and can easily check that everything is wired
 * properly from one simple file. Additionally, there are less magic numbers
 * floating around the code so it is easier to understand and debug.</p>
 * 
 * <p>Recommended next step: {@link Claw}</p>
 * 
 * @author Alex Henning
 */
public class RobotMap {
    // Motors: This is the mapping of motors ports marked PWM on the DIO board
    public static final int
            leftMotorF = 1,
            leftMotorB = 2,
            rightMotorF = 3,
            rightMotorB = 4,
            liftMotor = 5,
            liftArmMotor = 6;
            
    
    // Relays: Digital IO ports
    public static final int
            feederSpike = 9,
            pusherSpike = 10,
            shooterSpike1 = 7,
            shooterSpike2 = 8;

    //Sensors
    public static final int
            analogBreakout = 1,
            gyroChannel = 5;
    
    public static final int
            shooterRetreatSwitch = 1;
    // Additional mappings could be included, but are not used on this robot
}
