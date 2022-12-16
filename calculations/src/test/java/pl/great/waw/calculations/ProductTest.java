package pl.great.waw.calculations;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Equals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    @Test
    void testCreate() {
        String productName = "Ser pleśniowy";
        BigDecimal price = new BigDecimal(10);

        Product product = new Product(productName, price);


        assertEquals(productName, product.getName());
        assertEquals(product.getPrice(), price);

    }

    @Test
    void testManyProducts() {
        String productName = "Ser pleśniowy";
        BigDecimal price = new BigDecimal("5.0");

        List<Product> list = new ArrayList<>();

        //Wykonanie wielokrotnie w danej metodzie
        // for (int i = 0; i <= 10; i++) {
        //     Product product = new Product(productName + " " + i, price.add(BigDecimal.valueOf(i)));
        //     list.add(product); }

        IntStream stream = IntStream.range(0, 99);
        stream.forEach((i) -> {
            Product product = new Product(productName + " " + i, price.add(BigDecimal.valueOf(i)));
            list.add(product);
        });

        //  for (int i = 0; i <= 10; i++) {
        //    System.out.println("Numer " + i + " " + list.get(0));
        //    assertEquals(productName + " " + i, list.get(i).getName()); }

        AtomicInteger counter = new AtomicInteger();

        list.stream().forEach((product) -> {
            int i = counter.get();
            System.out.println("Numer " + i + " " + product);
            assertEquals(productName + " " + i, product.getName());

            counter.getAndIncrement();
        });
        //List<BigDecimal> collect = list.stream()
        //        .map(Product::getPrice)
        //        .collect(Collectors.toList());
        //collect.forEach(System.out::println);

        BigDecimal sum = BigDecimal.valueOf(0);
        for (int i = 0; i < list.size(); i++) {
            Product product = list.get(0);
            sum = sum.add(product.getPrice());
        }
        System.out.println("Suma = " + sum);
    }
}


//Wykonywanie wielokrotnie w całej klasie
//for (int i = 0; i <= 10; i++) {
//    Product product = new Product(productName + i, price.add(BigDecimal.valueOf(i)));
//    list.add(product);
//    System.out.println("Numer " + i + " " + product);