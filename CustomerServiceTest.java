package mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

import org.hamcrest.core.IsNull;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CustomerServiceTest {

    @Mock
    private CustomerDao daoMock;

    @InjectMocks
    private CustomerService service;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);
    }

     @Test
        public void testAddCustomer_returnsNewCustomer() {

            when(daoMock.save(any(Customer.class))).thenReturn(true);

            Customer customer = new Customer();

            assertThat(service.addCustomer(customer), is(IsNull.notNullValue()));
           
        }
}
