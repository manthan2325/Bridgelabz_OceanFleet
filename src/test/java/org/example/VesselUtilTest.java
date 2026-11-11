
package org.example;

import org.example.Vessel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VesselUtilTest {

    private VesselUtil vesselUtil;

    @BeforeEach
    void setUp() {
        vesselUtil = new VesselUtil();
    }

    @Test
    void testVesselListInitiallyEmpty() {

        assertNotNull(vesselUtil.getVesselList());
        assertTrue(vesselUtil.getVesselList().isEmpty());
    }

    @Test
    void testAddSingleVessel() {

        Vessel vessel = new Vessel(
                "V001",
                "Sea King",
                25.5,
                "Cargo"
        );

        vesselUtil.addVesselPerformance(vessel);

        assertEquals(1, vesselUtil.getVesselList().size());
        assertSame(vessel, vesselUtil.getVesselList().get(0));
    }

    @Test
    void testAddMultipleVessels() {

        Vessel vessel1 = new Vessel(
                "V001",
                "Sea King",
                25.5,
                "Cargo"
        );

        Vessel vessel2 = new Vessel(
                "V002",
                "Ocean Star",
                18.0,
                "Tanker"
        );

        Vessel vessel3 = new Vessel(
                "V003",
                "Wave Rider",
                22.3,
                "Cruise"
        );

        vesselUtil.addVesselPerformance(vessel1);
        vesselUtil.addVesselPerformance(vessel2);
        vesselUtil.addVesselPerformance(vessel3);

        assertEquals(3, vesselUtil.getVesselList().size());
    }

    @Test
    void testInsertionOrderIsMaintained() {

        Vessel vessel1 = new Vessel(
                "V001", "Sea King", 25.5, "Cargo"
        );

        Vessel vessel2 = new Vessel(
                "V002", "Ocean Star", 18.0, "Tanker"
        );

        vesselUtil.addVesselPerformance(vessel1);
        vesselUtil.addVesselPerformance(vessel2);

        assertEquals(
                "V001",
                vesselUtil.getVesselList().get(0).getVesselId()
        );

        assertEquals(
                "V002",
                vesselUtil.getVesselList().get(1).getVesselId()
        );
    }

    @Test
    void testSetVesselList() {

        List<Vessel> vessels = new ArrayList<>();

        vessels.add(new Vessel(
                "V001", "Sea King", 25.5, "Cargo"
        ));

        vesselUtil.setVesselList(vessels);

        assertEquals(1, vesselUtil.getVesselList().size());
        assertSame(vessels, vesselUtil.getVesselList());
    }
}