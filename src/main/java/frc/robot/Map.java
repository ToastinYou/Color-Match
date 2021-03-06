package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

public class Map {
    public static XboxController XboxControl = new XboxController(0);
    public static Joystick JoystickControl = new Joystick(1);

	//public static int CAN0 = 0;
	public static CANSparkMax ColorMotorController = new CANSparkMax(0, MotorType.kBrushless);
	
	public static int CAN1 = 1;
	public static int CAN2 = 2;
	public static int CAN3 = 3;
	public static int CAN4 = 4;
	public static int CAN5 = 5;
	public static int CAN6 = 6;
	public static int CAN7 = 7;
	public static int CAN8 = 8;
	public static int CAN9 = 9;

	public static int PWM0 = 0;
	public static int PWM1 = 1;
	public static int PWM2 = 2;
	public static int PWM3 = 3;
	public static int PWM4 = 4;
	public static int PWM5 = 5;
	public static int PWM6 = 6;
	public static int PWM7 = 7;
	public static int PWM8 = 8;
	public static int PWM9 = 9;

	public static int xboxA = 1;
	public static int xboxB = 2;
	public static int xboxX = 3;
	public static int xboxY = 4;
	public static int xboxLB = 5;
	public static int xboxRB = 6;
	public static int xboxBack = 7;
	public static int xboxStart = 8;
	public static int xboxLS = 9;
	public static int xboxRS = 10;

	public static int joystick1 = 1;
	public static int joystick2 = 2;
	public static int joystick3 = 3;
	public static int joystick4 = 4;
	public static int joystick5 = 5;
	public static int joystick6 = 6;
	public static int joystick7 = 7;
	public static int joystick8 = 8;
	public static int joystick9 = 9;
	public static int joystick10 = 10;
	public static int joystick11 = 11;
	public static int joystick12 = 12;
}