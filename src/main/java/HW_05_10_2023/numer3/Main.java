package HW_05_10_2023.numer3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

            Bycicle roadBike = new Bycicle("Roadster", "Black", "Carbon", 29, 2023);
            Bycicle mountainBike = new Bycicle("MountainRider", "Silver", "Steel", 27, 2022);
            Bycicle kidsBike = new Bycicle("KidsTime", "Rad", "Aluminum", 26, 2021);

            System.out.println(roadBike);
            System.out.println(mountainBike);
            System.out.println(kidsBike);

            Bycicle[] bicycles = { roadBike, mountainBike, kidsBike };
            System.out.println(Arrays.toString(bicycles));
        }

    }

