package bean;

import java.io.Serializable;
import java.util.ArrayList;

public class BeanTest implements Serializable {

    public BeanTest() {
    }

    public static void main(String[] args) {
    Author author = new Author(1,"billy jean");

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(new Quote(1,"frick yea!", author));
        quotes.add(new Quote(2,"frick no!", author));
        quotes.add(new Quote(3,"frick maybe!", author));


        for (Quote quote : quotes){
            System.out.println(quote);

        }

    }

}
