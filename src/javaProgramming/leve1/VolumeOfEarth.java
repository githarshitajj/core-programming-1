package javaProgramming.leve1;

public class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double radiusMiles = radiusKm / 1.60934; // Convert km to miles

        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}
