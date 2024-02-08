package OOP_sem1_3;


import java.util.ArrayList;
import java.util.List;
public interface VendingMachine {
    //Задание 1: создали лист  и сохранили в методе initProduct и getProduct
    //private - нельзя для интерфеса
    //List<Product> products = new ArrayList<>(); Тоже больше не надо, ну что такое..
    /* конструктор нам больше не нужен
    public VendingMachine(List<OOP_sem1_2.Product> products) {
        this.products = products;
    }*/
    // убрали initProduct, т.к. сделали конструктор VendingMachine и смысл отпал!!!
    //public void  initProduct(List<Product> products){
    //    this.products = products;
    //}

    Product getProduct(String name);
    //Product getProduct(String name, double volume, double temperature);
    /*
    Больше не надо
    {
        for (Product item:products){
            if (item.getName().equals(name))
                return item;
        }
        return null;

    }*/
/* Больще не надо
    public List<OOP_sem1_2.Product> getProducts() {
        return products;
    }

    public void setProducts(List<OOP_sem1_2.Product> products) {
        this.products = products;
    }

    public void add(Product product){
        products.add(product);
    }
*/
}
