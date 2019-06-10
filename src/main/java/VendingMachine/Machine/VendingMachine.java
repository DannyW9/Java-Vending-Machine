package VendingMachine.Machine;
import VendingMachine.Money.Coin;

import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Compartment> compartments;
    private CoinReturn coinReturn;
    private Credit credit;

    public VendingMachine() {
        this.compartments = new ArrayList<Compartment>();
        this.coinReturn = new CoinReturn();
        this.credit = new Credit();
    }

    public ArrayList<Compartment> getCompartments() {
        return compartments;
    }

    public CoinReturn getCoinReturn() {
        return coinReturn;
    }

    public Credit getCredit() {
        return credit;
    }

    public void addCompartment(Compartment compartment){
        this.compartments.add(compartment);
    }

    public void addCoinToCoinReturn(Coin coin){
        this.coinReturn.addCoin(coin);
    }

    public void addCoinToCredit(Coin coin){
        this.credit.addCoin(coin);
    }

    public boolean checkCoinValidity(Coin coin){
        return coin.checkCoinValidity();
    }

    public void addCoinToVendingMachine(Coin coin){
        if (checkCoinValidity(coin)){
            addCoinToCredit(coin);
        } else {
            addCoinToCoinReturn(coin);
        }
    }

    public Compartment chosenCompartment(CompartmentCode compartmentCode) {
        for (Compartment compartment : this.compartments) {
            if (compartmentCode.equals(compartment.getCompartmentCode())) {
                return compartment;
            }
        }
        return null;
    }

    public String buyProduct(CompartmentCode compartmentCode){
        Compartment chosenCompartment = chosenCompartment(compartmentCode);
            if (credit.totalAmount() >= chosenCompartment.getPrice()){
                this.credit.removeAllCoins();
                return "The compartment of the vending machine opens, revealing the " + chosenCompartment.getProduct().getName();
            }
            return "Not enough credit - Insert a further " + (chosenCompartment.getPrice() - credit.totalAmount()) + " to purchase";
    }


}
