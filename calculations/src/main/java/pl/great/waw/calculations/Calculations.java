package pl.great.waw.calculations;

import pl.great.waw.calculations.exepctions.ProductNoExistException;

import java.util.ArrayList;
import java.util.List;

public class Calculations {
    List<Product> list;

    public Calculations() {
        list = new ArrayList<>();
    }

    public boolean add(Product product) {
        list.add(product);
        return true;
    }

    public Product get(int i) throws ProductNoExistException {
        if (list.size() - 1 < i) {
            throw new ProductNoExistException("Indeks który chcesz pobrać nie istnieje");
        }
        return list.get(i);

    }
}
