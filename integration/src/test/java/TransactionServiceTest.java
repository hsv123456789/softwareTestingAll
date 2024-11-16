import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.example.integrationtest.PaymentService;
import com.example.integrationtest.TransactionService;

public class TransactionServiceTest {
    
     @Test
    public void testPlaceOrder_SuccessfulPayment() {

        PaymentService paymentServiceMock = mock(PaymentService.class);
        when(paymentServiceMock.processPayment("123", 100.0)).thenReturn(true);
        TransactionService orderService = new TransactionService(paymentServiceMock);

        String result = orderService.placeOrder("123", 100.0);

        assertEquals("Order placed successfully", result);
    }

    @Test
    public void testPlaceOrder_PaymentFailed() {

        PaymentService paymentServiceMock = mock(PaymentService.class);
        when(paymentServiceMock.processPayment("123", 100.0)).thenReturn(false);
        TransactionService orderService = new TransactionService(paymentServiceMock);

        String result = orderService.placeOrder("123", 100.0);

        assertEquals("Payment failed", result);
    }
}
