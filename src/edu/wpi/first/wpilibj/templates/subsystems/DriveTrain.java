package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.commands.drivetrain.DriveWithJoysticks;

/**
 * Drivetrain subsystem, using polar mecanum drive as of now seeing as how gyro is 
 * giving wonky values
 * 
 * <p>Recommended next step: fix gyro values
 *
 * @author 3851
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
    
    //drive with gyro angle for field-centric drive (needs to be tested)
    public void mecanumDrive_Cartesian(double x, double y, double z, double gyroAngle) {
        mec_Drive.mecanumDrive_Cartesian(x, y, z, gyroAngle);
    }
    
    //drive without gyro, left is robot's left, regardless of position
    //relative to driver
    public void mecanumDrive_Polar(double magnitude, double direction, double rotation) {
        mec_Drive.mecanumDrive_Polar(magnitude, direction, rotation);
    }
    
    
    //standard tank drive 
    public void basicDrive(double x, double y) {
        mec_Drive.tankDrive(x, y);
    }
}

