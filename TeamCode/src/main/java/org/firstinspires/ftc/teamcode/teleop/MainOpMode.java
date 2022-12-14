package org.firstinspires.ftc.teamcode.teleop;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.config.Config;
import com.acmerobotics.dashboard.telemetry.TelemetryPacket;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;

import org.firstinspires.ftc.teamcode.common.drivebase.FieldOrientedMecanum;
import org.firstinspires.ftc.teamcode.common.drivebase.RobotOrientedMecanum;
import org.firstinspires.ftc.teamcode.common.subsystem.IntakeClaw;
import org.firstinspires.ftc.teamcode.common.subsystem.ViperSlideKit;
import org.firstinspires.ftc.teamcode.config.Constants;

import java.lang.reflect.Field;

@TeleOp
public class MainOpMode extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        //Create subsystems, drivebase, and constants
        //FieldOrientedMecanum mecanum = new FieldOrientedMecanum();
        //ViperSlideKit lift = new ViperSlideKit();
        //IntakeClaw intake = new IntakeClaw();
        //Constants constants = new Constants();

        //FtcDashboard dashboard = Constants.dashboard;

        //Initalize
        Constants.init(hardwareMap, gamepad1);

        waitForStart();

        if (isStopRequested()) return;

        while (opModeIsActive()) {
            FieldOrientedMecanum.runOpMode();
            ViperSlideKit.runOpMode();
            IntakeClaw.runOpMode();

            //TelemetryPacket packet = new TelemetryPacket();
            //Grab telemetry from subsystems
            //lift.telemetry(packet);
            //intake.telemetry(packet);

            //dashboard.sendTelemetryPacket(packet);
        }
    }
}