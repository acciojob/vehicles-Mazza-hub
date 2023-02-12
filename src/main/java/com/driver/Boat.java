package com.driver;

public class Boat implements WaterVehicle{
    @Override
    public String getVehicleName() {
        return "MyBoat";
    }

    @Override
    public int getVehicleCapacity() {
        return 10;
    }
}
