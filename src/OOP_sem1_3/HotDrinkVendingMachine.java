package OOP_sem1_3;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    List<HotDrink> hotDrinks;

    public HotDrinkVendingMachine(List<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    public List<HotDrink> getHotDrinks() {
        return hotDrinks;
    }
    public List<HotDrink> getProducts() {
        return hotDrinks;
    }
    public void setProducts(List<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    public void setHotDrinks(List<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }


    @Override
    public Product getProduct(String name) {
        for (Product item:hotDrinks){
            if(item.getName().equals(name))
                return item;
        }
        return null;
    }

    public Product getProduct(String name, double volume, double temperature){
        for (HotDrink item:hotDrinks){
            if(item.getName().equals(name)&& item.getVolume() == volume && item.getTemperature() == temperature){
                return item;
            }

        }
        return  null;
    }
    public  void addHodDrink(HotDrink hotDrink){
        this.hotDrinks.add(hotDrink);
    }

}
