package javaMethods.level2;

public class UnitConvertor {
    public static double convertKmToMiles(double km){
        //1 km = 0.621 miles;
        return km * 0.621;
    }
    public static double convertMilesToKm(double miles){
        //
        return miles * 1.609;
    }
    public static double convertMetersToFeet(double meters){
        return meters * 3.280;
    }
    public static double convertFeetToMeters(double feet){
        return feet * 0.304;
    }
    public static double convertYardsToFeet(double yards){
        return yards * 3;
    }
    public static double convertFeetToYards(double feet){
        return feet * 0.33;
    }
    public static double convertMetersToInches(double meters){
        return meters * 39.37;
    }
    public static double convertInchesToMeters(double inches){
        return inches * 0.025;
    }
    public static double convertInchesToCm(double inches){
        return inches * 2.54;
    }
    public static void main(String[] args) {

    }
}
