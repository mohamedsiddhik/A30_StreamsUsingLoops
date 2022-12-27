

// filter

package streams;

import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    float price;

    public Product(int Id , String Name , float Price){
        id = id;
        name = Name;
        price = Price;
    }
}


public class StreamExample4
{
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1,"Lenovo",25000));
        productList.add(new Product(2,"Dell",32000));
        productList.add(new Product(3,"Toshiba",29500));
        productList.add(new Product(4,"Apple",76000));
        productList.add(new Product(5,"HP",35000));

        productList.stream()
                .filter(p -> p.price > 34000)
                .map(pm -> pm.price)
                .forEach(System.out::println);
    }
}