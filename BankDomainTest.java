import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class BankDomainTest {

    @Test void test1() {
        Account a = new Account("123-456", 500, "한호석");
        assertNotNull(a);
    }


    @Test void test2() {
        assertThrows(IllegalArgumentException.class, () -> new Account("abc-def", 100, "한호석"));
    }


    @Test void test3() {
        assertThrows(IllegalArgumentException.class, () -> new Transaction(-1, "DEPOSIT"));
    }

    @Test void test4() {
        assertThrows(IllegalArgumentException.class, () -> new Stock("123", "삼성"));
    }

    @Test void test5() {
        Stock s1 = new Stock("005930", "삼성전자");
        Stock s2 = new Stock("005930", "삼성전자");
        assertEquals(s1, s2);
    }

    @Test void test6() {
        Order o = new Order(new Stock("005930", "삼성"), 10, 70000);
        assertEquals(10, o.getQuantity());
    }


    @Test void test7() {
        assertThrows(IllegalArgumentException.class, () -> new Transaction(100, "TRANSFER"));
    }

    @Test void test8() {
        assertThrows(IllegalArgumentException.class, () -> new Account("111-222", -500, "홍길동"));
    }
}