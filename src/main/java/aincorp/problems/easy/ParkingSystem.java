package aincorp.problems.easy;

public class ParkingSystem {

    private final int big;
    private final int medium;
    private final int small;

    public ParkingSystem(int big
            , int medium
            , int small) {

        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {

        boolean result = true;

        return true;
    }

    public int getBig() {
        return big;
    }

    public int getMedium() {
        return medium;
    }

    public int getSmall() {
        return small;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */