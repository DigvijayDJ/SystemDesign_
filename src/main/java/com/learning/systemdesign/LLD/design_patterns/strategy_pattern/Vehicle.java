package com.learning.systemdesign.LLD.design_patterns.strategy_pattern;

import com.learning.systemdesign.LLD.design_patterns.strategy_pattern.strategy.DriveStrategy;

public class Vehicle {
    public DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveObj){
        this.driveStrategy = driveObj;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
