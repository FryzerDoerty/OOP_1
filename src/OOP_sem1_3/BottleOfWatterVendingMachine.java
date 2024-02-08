package OOP_sem1_3;

import java.util.List;

public class BottleOfWatterVendingMachine implements VendingMachine{
    List<BottleOfWatter> bottleOfWatter;

    public BottleOfWatterVendingMachine(List<BottleOfWatter> bottleOfWatter) {
        this.bottleOfWatter = bottleOfWatter;
    }

    @Override
    public Product getProduct(String name) {
        for (Product item:bottleOfWatter){
            if(item.getName().equals(name))
                return item;
        }
        return null;
    }

    public List<BottleOfWatter> getProducts() {
        return bottleOfWatter;
    }

    public List<BottleOfWatter> getBottleOfWatter() {
        return bottleOfWatter;
    }

    public void setBottleOfWatter(List<BottleOfWatter> bottleOfWatter) {
        this.bottleOfWatter = bottleOfWatter;
    }

    public void setProducts(List<BottleOfWatter> bottleOfWatter) {
        this.bottleOfWatter = bottleOfWatter;
    }
    public Product getProduct(String name, double volume){
        for (BottleOfWatter item:bottleOfWatter){
            if(item.getName().equals(name)&& item.getVolume() == volume){
                return item;
            }

        }
        return  null;
    }
    public  void addBottleOfWatter(BottleOfWatter bottleOfWatter){
        this.bottleOfWatter.add(bottleOfWatter);
    }

}
