
package org.example;

import org.example.Vessel;
import org.example.VesselUtils;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    // Starts the OceanFleet application.
    public static void main(String[] args) {
        new UserInterface().run();
    }

    // Coordinates the application workflow.
    public void run() {

        Scanner scanner = new Scanner(System.in);
        VesselUtil vesselUtil = new VesselUtil();
        VesselUtils vesselUtils = new VesselUtils();

        addVessels(scanner, vesselUtil);

        searchVessel(scanner, vesselUtils);

        displayHighPerformanceVessels(vesselUtil);
    }

    // Accepts and stores vessel details.
    private void addVessels(
            Scanner scanner,
            VesselUtil vesselUtil) {

        System.out.println("Enter the number of vessels to be added");

        int numberOfVessels = Integer.parseInt(scanner.nextLine());

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
    }

    // Searches for a vessel using its ID.
    private void searchVessel(
            Scanner scanner,
            VesselUtils vesselUtils) {

        System.out.println("Enter the Vessel Id to check speed");

        String vesselId = scanner.nextLine();

        Vessel vessel = vesselUtils.getVesselById(vesselId);

        if (vessel != null) {
            displayVessel(vessel);
        } else {
            System.out.println("Vessel Id " + vesselId + " not found.");
        }
    }

    // Displays all high-performance vessels.
    private void displayHighPerformanceVessels(VesselUtil vesselUtil) {

        System.out.println("High performance vessels are");

        List<Vessel> vessels = vesselUtil.getHighPerformanceVessels();

        for (Vessel vessel : vessels) {
            displayVessel(vessel);
        }
    }

    // Displays vessel details in the required format.
    private void displayVessel(Vessel vessel) {

        System.out.println(
                vessel.getVesselId() + " | "
                        + vessel.getVesselName() + " | "
                        + vessel.getVesselType() + " | "
                        + vessel.getAverageSpeed() + " knots"
        );
    }
}