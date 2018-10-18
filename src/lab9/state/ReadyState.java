package lab9.state;

import java.util.Map;
import java.util.TreeMap;

public class ReadyState implements State {
    VendingMachine vendingMachine;
    Map<String, Integer> destinationPriceMap = new TreeMap<>();

    public ReadyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
        destinationPriceMap.put("Mo Chit", 20);
        destinationPriceMap.put("Siam", 40);
        destinationPriceMap.put("Bearing", 60);
    }

    @Override
    public void insertCoin(int amount) {
        System.out.println("ERROR: Invalid State");
    }

    @Override
    public void chooseDestination(String station) {
        if (destinationPriceMap.containsKey(station)) {
            System.out.println("ERROR: No this station");
            return;
        }
        int price = destinationPriceMap.get(station);
        System.out.println("Selecting " + station + ", " + price + " $");
        vendingMachine.setCurrentState(vendingMachine.getExpendingState());
    }

    @Override
    public void getTicket() {
        System.out.println("ERROR: Invalid State");
    }
}
