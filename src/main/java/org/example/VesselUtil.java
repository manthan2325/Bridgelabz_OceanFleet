
package org.example;

import org.example.Vessel;

import java.util.ArrayList;
import java.util.List;

public class VesselUtil {

    private List<Vessel> vesselList;

    // Initializes the vessel list.
    public VesselUtil() {
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

    public List<Vessel> getHighPerformanceVessels() {
        return null;
    }
}