package VendingMachine.Machine;

import VendingMachine.Money.Coin;

import java.util.ArrayList;

public class CoinReturn {

    private ArrayList<Coin> coins;

    public CoinReturn() {
        this.coins = new ArrayList<Coin>();
    }

    public int getCoins(){
        return this.coins.size();
    }

    public void addCoin(Coin coin){
        this.coins.add(coin);
    }

    public int totalAmount(){
        int total = 0;
        for (Coin coin : this.coins){
            total += coin.getCoinValue();
        }
        return total;
    }

    public void resetTotal(){
        this.coins.removeAll(coins);
    }

    public String returnCoins(){
        String returned = totalAmount() + " pence has been returned from the machine.";
        resetTotal();
        return returned;
    }
}
