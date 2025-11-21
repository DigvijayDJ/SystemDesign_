package com.learning.systemdesign.LLD.design_patterns.strategy_pattern;

import com.learning.systemdesign.LLD.design_patterns.strategy_pattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }

}
