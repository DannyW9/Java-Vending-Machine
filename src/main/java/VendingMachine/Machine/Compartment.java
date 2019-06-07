package VendingMachine.Machine;

import VendingMachine.Products.Product;

public class Compartment {

    private CompartmentCode compartmentCode;
    private Product product;
    private int price;

    public Compartment(CompartmentCode compartmentCode, Product product) {
        this.compartmentCode = compartmentCode;
        this.product = product;
        this.price = 0;
        setCompartmentPrice();
    }

    public CompartmentCode getCompartmentCode() {
        return compartmentCode;
    }

    public Product getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }

    public void setCompartmentPrice(){
        String productType = this.product.getType();
        if (productType.equals("Sweet")){
            this.price = 65;
        }
        if (productType.equals("Crisp")){
            this.price = 50;
        }
        if (productType.equals("Drink")){
            this.price = 100;
        }
    }
}
