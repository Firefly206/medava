package edu.uc.cs3003.medava;

public class Medicine {
    private String mMedicineName;
    // Constructor
    public Medicine(String medicineName) {
        mMedicineName = medicineName;
    }
    // getter
    public String getMedicineName() {
       return mMedicineName;
    }

    public double minimumTemperature() { // virtual methods 
        return 0.0;
    }

    public double maximumTemperature() { // virtual methods 
        return 100.0;
    }
    // Check the medicine whether it remains safe if subjected to a particular temperature range.
    public boolean isTemperatureRangeAcceptable(Double lowTemperature, Double highTemperature) {
        if (this.minimumTemperature() <= lowTemperature &&
            highTemperature <= this.maximumTemperature()) {
            return true;
        }
        return false;
    }

}