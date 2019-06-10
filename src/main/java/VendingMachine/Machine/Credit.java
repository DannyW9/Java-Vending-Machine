package VendingMachine.Machine;
import VendingMachine.Money.Coin;
import java.util.ArrayList;

public class Credit {

    private ArrayList<Coin> coins;

    public Credit() {
        this.coins = new ArrayList<Coin>();
    }

    public int getCoins() {
        return this.coins.size();
    }

    public int totalAmount(){
        int total = 0;
        for (Coin coin : this.coins){
            total += coin.getCoinValue();
        }
        return total;
    }

    public void addCoin(Coin coin){
        this.coins.add(coin);
    }

    public void removeAllCoins(){
        this.coins.removeAll(coins);
    }




}
