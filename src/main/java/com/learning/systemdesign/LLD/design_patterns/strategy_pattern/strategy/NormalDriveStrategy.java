package com.learning.systemdesign.LLD.design_patterns.strategy_pattern.strategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving in normal mode with balanced performance.");
    }

}
