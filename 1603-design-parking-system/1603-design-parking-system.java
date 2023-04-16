class ParkingSystem {
    int carpark[];

    public ParkingSystem(int big, int medium, int small) {
        carpark =new int[]{big,medium,small};
    }
    
    public boolean addCar(int carType) {
        if(carpark[carType-1]>0){
            carpark[carType-1]--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */

 //big car =1 medium car =2 small car = 3