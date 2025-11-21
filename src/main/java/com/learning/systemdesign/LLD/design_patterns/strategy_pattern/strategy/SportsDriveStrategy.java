package com.learning.systemdesign.LLD.design_patterns.strategy_pattern.strategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving in sports mode with high speed and performance.");
    }

}
