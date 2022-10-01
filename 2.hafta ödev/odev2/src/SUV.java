
    public class SUV extends car {
        private double dailyRental;
        private double accountFormonthlyRental;
        private double accountFordailyRental;

        public SUV(){
            super.setdailyRental(true);
            super.setmonthlyRental(true);
        }


        public SUV(double luggageCapacity, int age,double dailyRental){
            super(luggageCapacity,age);
            super.setdailyRental(true);
            super.setmonthlyRental(true);
            this.dailyRental=dailyRental;
        }

        public double accountFormonthlyRental() {
            return this.dailyRental +(super.getluggageCapacity()/100+super.age()*30);
        }

        public double accountForDaily() {
            return this.dailyRental +(super.getluggageCapacity()/100+super.age());
        }

        public double getdailyRental() {
            return dailyRental;
        }

        public void setdailyRental(double dailyRental) {
            this.dailyRental = dailyRental;
        }

    }
