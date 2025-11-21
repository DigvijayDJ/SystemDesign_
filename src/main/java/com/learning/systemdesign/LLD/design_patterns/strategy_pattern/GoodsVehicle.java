package com.learning.systemdesign.LLD.design_patterns.strategy_pattern;
import com.learning.systemdesign.LLD.design_patterns.strategy_pattern.strategy.NormalDriveStrategy;
public class GoodsVehicle extends Vehicle{
    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }

}
