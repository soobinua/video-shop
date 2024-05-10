import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    void statement() {

        Movie movie = new Movie("first Movie", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 3);
        Customer customer = new Customer("soobinua");

        customer.addRental(rental);
//        String result = customer.statement();
        String result = "soobinua 고객님의 대여 기록\n" +
                "\tfirst Movie\t9.0\n" +
                "누적 대여료 : 9.0\n" +
                "적립 포인트 : 2";

//        System.out.println(result);

        Assertions.assertEquals(customer.statement(), result);
    }

    @Test
    void htmlStatement() {

        Movie movie = new Movie("first Movie", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 3);
        Customer customer = new Customer("soobinua");

        customer.addRental(rental);
        //result 문자열로 .html 만들면 기존 텍스트에서 HTML 형식으로 바뀐 것 크롬에서 확인 가능
        String result = "soobinua <h1>고객님의 대여 기록</h1><span>first Movie</span><span>9.0</span><h2>누적 대여료 : 9.0</h2><h2>적립 포인트 : 2</h2>";

//        System.out.println(result);

        Assertions.assertEquals(customer.htmlStatement(), result);
    }


}