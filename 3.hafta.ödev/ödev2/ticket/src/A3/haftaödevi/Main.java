package A3.haftaödevi;

import A3.Haftaödevi;service.FlightService;

import A3.Haftaödevi ;service.PegasusService;
import A3.Haftaödevi; service.THYService;

public class Main {
    public static void main(String[] args) {
        FlightService pegasusService = new FlightService();
        System.out.println("Boş koltuklar "+pegasusService.getEmptySeat());
        System.out.println("Dolu koltuklar "+pegasusService.getFullSeat());
        pegasusService.buy("B1");
        pegasusService.getFood();

        FlightService thyService = new THYService();
        System.out.println("Boş koltuklar " + thyService.getEmptySeat());
        System.out.println("Dolu koltuklar "+ thyService.getFullSeat());
        thyService.buy("A2");
        thyService.getFood();
    }

    private static class PegasusService {
    }

    private static class FlightService {
        public String getEmptySeat() {
            return null;
        }

        public Object getFood() {
            return food;
        }

        public void buy(String b1) {
        }
    }
}