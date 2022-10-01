public class HATCHBACK extends car {
    private double dailyRental;

    private double invoiceForgetdailyRental;

    public HATCHBACK(){
        super.setdailyRental(true);

    }


    public HATCHBACK(double luggageCapacity, int age, double dailyRental){
        super(luggageCapacity,age);
        super.setdailyRental(true);

        this.dailyRental= dailyRental;
    }



    public double invoiceFordailyRental() {
        return this.dailyRental +(super.getluggageCapacity()/100+super.age());
    }

    public double getdailyRental() {
        return dailyRental;
    }

    public void setdailyRental(double dailyRental) {
        this.dailyRental = dailyRental;
    }

}

