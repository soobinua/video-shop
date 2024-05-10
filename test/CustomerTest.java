import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @org.junit.jupiter.api.Test
    void statement() {

        Movie movie = new Movie("first Movie", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 3);
        Customer customer = new Customer("soobinua");

        customer.addRental(rental);
        String result = customer.statement();

        System.out.println(result);


    }
}