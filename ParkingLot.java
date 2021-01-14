class ParkingLot{
  private int numCars;
  public final int MAX_CARS = 2500;


   public ParkingLot(int inNum){
     if (MAX_CARS >= inNum){
       numCars = inNum;
     }else{
       System.out.println("You cannot add that number");
     }
     }
    public ParkingLot(){
      numCars = 0;
    }

    public int getNumCars(){
      return numCars;
    }
    
    public void setNumCars(int theNumCars){
       if (MAX_CARS >= theNumCars){
         if (theNumCars >= 0){
        numCars = theNumCars;
        }
       }else{
         System.out.println();
       }
    }

    public String toString(){
      return "Number of cars is " + numCars;
    }

    public boolean equals(Object other){
       ParkingLot p = (ParkingLot)other;

       if (this.numCars == p.numCars){
         return true;
       }else{
         return false;
       }
       }
    }
  
