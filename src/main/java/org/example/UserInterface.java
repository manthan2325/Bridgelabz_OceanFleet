
package org.example;

import org.example.Vessel;
import org.example.VesselUtil;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    // Starts the OceanFleet console application.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VesselUtils vesselUtil = new VesselUtils();

        System.out.println("Enter the number of vessels to be added");
        int numberOfVessels = Integer.parseInt(scanner.nextLine());

        // Accepts and stores vessel details.
        for (int i = 0; i < numberOfVessels; i++) {

            System.out.println("Enter vessel details");

            String vesselDetails = scanner.nextLine();

            String[] details = vesselDetails.split(":");

            String vesselId = details[0];
            String vesselName = details[1];
            double averageSpeed = Double.parseDouble(details[2]);
            String vesselType = details[3];

            Vessel vessel = new Vessel(
                    vesselId,
                    vesselName,
                    averageSpeed,
                    vesselType
            );

            vesselUtil.addVesselPerformance(vessel);
        }

        // Retrieves a vessel using its ID.
        System.out.println("Enter the Vessel Id to check speed");

        String vesselId = scanner.nextLine();

        Vessel searchedVessel = vesselUtil.getVesselById(vesselId);

        if (searchedVessel != null) {

            displayVessel(searchedVessel);

        } else {

            System.out.println("Vessel Id " + vesselId + " not found.");
        }

        // Displays all high-performance vessels.
        System.out.println("High performance vessels are");

        List<Vessel> highPerformanceVessels =
                vesselUtil.getHighPerformanceVessels();

        for (Vessel vessel : highPerformanceVessels) {
            displayVessel(vessel);
        }
    }

    // Displays vessel details in the required format.
    private static void displayVessel(Vessel vessel) {

        System.out.println(
                vessel.getVesselId() + " | "
                        + vessel.getVesselName() + " | "
                        + vessel.getVesselType() + " | "
                        + vessel.getAverageSpeed() + " knots"
        );
    }
}