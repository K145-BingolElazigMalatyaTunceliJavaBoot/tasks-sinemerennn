public class SEDAN extends car {
    private double dailyRental;
    private double accountFormonthlyRental;
    private double accountFordailyRental;

    public SEDAN(){
        super();
        super.setdailyRental(true);
        super.setMonthlyRental(true);
    }

    public SEDAN(double luggageCapacity, int age) {
        super(luggageCapacity, age);
    }


    public void Sedan(double luggageCapacity, int age, double dailyRental){
        super(luggageCapacity,age);
        super.setdailyRental(true);
        super.setmonthlyRental(true);
        this.dailyRental=dailyRental;

    }

    public double invoiceFormonthlyRental() {
        return this.dailyRental +(super.getluggageCapacity()/100+super.age()*30);
    }

    public double invoiceFordailyRental() {
        return this.dailyRental +(super.getluggageCapacityy()/100+super.age());
    }

    public double getdailyRental() {
        return dailyRental;
    }

    public void setdailyRental(double dailyRental) {
        this.dailyRental = dailyRental;
    }
}
