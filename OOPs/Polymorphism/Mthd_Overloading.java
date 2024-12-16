class Flat {
    int bedrooms;
    int halls;
    int kitchens;

    void displayDetails() {
        System.out.println("Flat Details:");
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Halls: " + halls);
        System.out.println("Kitchens: " + kitchens);
    }

    void displayDetails(String message) {
        System.out.println(message);
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Halls: " + halls);
        System.out.println("Kitchens: " + kitchens);
    }

    void displayDetails(boolean showBedrooms, boolean showHalls, boolean showKitchens) {
        System.out.println("Flat Details:");
        if (showBedrooms) System.out.println("Bedrooms: " + bedrooms);
        if (showHalls) System.out.println("Halls: " + halls);
        if (showKitchens) System.out.println("Kitchens: " + kitchens);
    }
}

public class Mthd_Overloading {
    public static void main(String[] args) {
        Flat f = new Flat();

        f.bedrooms = 3;
        f.halls = 1;
        f.kitchens = 1;

        f.displayDetails();
        f.displayDetails("Custom Message: My Dream Flat");
        f.displayDetails(true, false, true);
    }
}
