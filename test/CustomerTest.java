import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    void statement() {

        Movie movie = new Movie("first Movie", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 3);
        Customer customer = new Customer("soobinua");

        customer.addRental(rental);
        String result = customer.statement();

//        System.out.println(result);

        Assertions.assertEquals(customer.statement(), result);
    }
}