
package org.example;

import org.example.Vessel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VesselUtilHighPerformanceTest {

    private VesselUtils vesselUtils;

    @BeforeEach
    void setUp() {

        vesselUtils = new VesselUtils();

        vesselUtils.addVesselPerformance(
                new Vessel("V001", "Sea King", 25.5, "Cargo")
        );

        vesselUtils.addVesselPerformance(
                new Vessel("V002", "Ocean Star", 18.0, "Tanker")
        );

        vesselUtils.addVesselPerformance(
                new Vessel("V003", "Wave Rider", 22.3, "Cruise")
        );
    }

    @Test
    void testGetSingleHighPerformanceVessel() {

        List<Vessel> result =
                vesselUtils.getHighPerformanceVessels();

        assertEquals(1, result.size());
        assertEquals("V001", result.get(0).getVesselId());
        assertEquals(25.5, result.get(0).getAverageSpeed());
    }

    @Test
    void testGetMultipleHighPerformanceVessels() {

        vesselUtils.addVesselPerformance(
                new Vessel("V004", "Blue Horizon", 25.5, "Cruise")
        );

        List<Vessel> result =
                vesselUtils.getHighPerformanceVessels();

        assertEquals(2, result.size());

        assertEquals("V001", result.get(0).getVesselId());
        assertEquals("V004", result.get(1).getVesselId());
    }

    @Test
    void testHighestSpeedIsAtLastPosition() {

        vesselUtils.addVesselPerformance(
                new Vessel("V004", "Blue Horizon", 30.0, "Cargo")
        );

        List<Vessel> result =
                vesselUtils.getHighPerformanceVessels();

        assertEquals(1, result.size());
        assertEquals("V004", result.get(0).getVesselId());
    }

    @Test
    void testAllVesselsHaveSameSpeed() {

        VesselUtils util = new VesselUtils();

        util.addVesselPerformance(
                new Vessel("V001", "Sea King", 20.0, "Cargo")
        );

        util.addVesselPerformance(
                new Vessel("V002", "Ocean Star", 20.0, "Tanker")
        );

        util.addVesselPerformance(
                new Vessel("V003", "Wave Rider", 20.0, "Cruise")
        );

        List<Vessel> result = util.getHighPerformanceVessels();

        assertEquals(3, result.size());
    }

    @Test
    void testGetHighPerformanceVesselsFromEmptyList() {

        VesselUtils emptyUtil = new VesselUtils();

        List<Vessel> result =
                emptyUtil.getHighPerformanceVessels();

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testResultContainsOriginalVesselObjects() {

        List<Vessel> result =
                vesselUtils.getHighPerformanceVessels();

        assertSame(
                vesselUtils.getVesselList().get(0),
                result.get(0)
        );
    }
}