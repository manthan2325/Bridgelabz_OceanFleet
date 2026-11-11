
package org.example;

public class Vessel {

    private String vesselId;
    private String vesselName;
    private double averageSpeed;
    private String vesselType;

    // Creates an empty vessel object.
    public Vessel() {
    }

    // Initializes a vessel with all its details.
    public Vessel(
            String vesselId,
            String vesselName,
            double averageSpeed,
            String vesselType) {

        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.averageSpeed = averageSpeed;
        this.vesselType = vesselType;
    }

    // Returns the vessel ID.
    public String getVesselId() {
        return vesselId;
    }

    // Updates the vessel ID.
    public void setVesselId(String vesselId) {
        this.vesselId = vesselId;
    }

    // Returns the vessel name.
    public String getVesselName() {
        return vesselName;
    }

    // Updates the vessel name.
    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    // Returns the average speed.
    public double getAverageSpeed() {
        return averageSpeed;
    }

    // Updates the average speed.
    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    // Returns the vessel type.
    public String getVesselType() {
        return vesselType;
    }

    // Updates the vessel type.
    public void setVesselType(String vesselType) {
        this.vesselType = vesselType;
    }
}