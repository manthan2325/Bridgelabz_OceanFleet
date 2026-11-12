
package org.example;

import org.example.Vessel;

import java.util.ArrayList;
import java.util.List;

public class VesselUtils {

    private List<Vessel> vesselList;

    // Initializes the vessel list.
    public VesselUtils() {
        this.vesselList = new ArrayList<>();
    }

    // Returns the vessel list.
    public List<Vessel> getVesselList() {
        return vesselList;
    }

    // Updates the vessel list.
    public void setVesselList(List<Vessel> vesselList) {
        this.vesselList = vesselList;
    }

    // Adds a vessel to the vessel list.
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    // Retrieves a vessel using its ID.
    public Vessel getVesselById(String vesselId) {

        for (Vessel vessel : vesselList) {

            if (vessel.getVesselId().equals(vesselId)) {
                return vessel;
            }
        }

        return null;
    }

    //UC-4 CODE ---------------------------------------------------------------->
    // Retrieves all vessels with the highest average speed.
    public List<Vessel> getHighPerformanceVessels() {

        List<Vessel> highPerformanceVessels = new ArrayList<>();

        if (vesselList.isEmpty()) {
            return highPerformanceVessels;
        }

        double maxSpeed = vesselList.get(0).getAverageSpeed();

        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() > maxSpeed) {
                maxSpeed = vessel.getAverageSpeed();
            }
        }

        for (Vessel vessel : vesselList) {
            if (Double.compare(vessel.getAverageSpeed(), maxSpeed) == 0) {
                highPerformanceVessels.add(vessel);
            }
        }

        return highPerformanceVessels;
    }
}