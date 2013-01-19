package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.commands.DriveWithJoysticks;

/**
 * <p>The drive train is PID subsystem, but unlike the {@link Wrist} and
 * {@link Elevator}, it is not always running PID. Instead, it can be run in a
 * manual tank drive or PID can be enabled and it will use a range finder to
 * drive a fixed distance away from the target.</p>
 * 
 * <p>Recommended next step: {@link CommandBase}</p>
 *
 * @author namadaza
 */
public class DriveTrain extends Subsystem { 
    RobotDrive mec_Drive;
    //AnalogChannel driveGyro;

    // Initialize your subsystem here
    public DriveTrain() {
        mec_Drive = new RobotDrive(RobotMap.leftMotorF, RobotMap.leftMotorB,
                                            RobotMap.rightMotorF, RobotMap.rightMotorB);
        //driveGyro = new AnalogChannel(RobotMap.analogBreakout, RobotMap.gyroChannel);
    }
    
    
    /**
     * Set the default command to drive with joysticks.
     */
    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoysticks());
    }
    
    /*public void initGyro() {
        //driveGyro.resetAccumulator();
    }
    
    public double getAngle() {
        return driveGyro.getVoltage();
    }*/
    
    public void mecanumDrive_Cartesian(double x, double y, double z, double gyroAngle) {
        mec_Drive.mecanumDrive_Cartesian(x, y, z, gyroAngle);
    }
    
    public void mecanumDrive_Polar(double magnitude, double direction, double rotation) {
        mec_Drive.mecanumDrive_Polar(magnitude, direction, rotation);
    }
    
    public void basicDrive(double x, double y) {
        mec_Drive.tankDrive(x, y);
    }
}

