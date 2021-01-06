import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class) public class CarServiceTest {
    @Mock CarCreator carCreator;
    @Mock ClientRepository clientRepository;
    @Mock PaymentRepository paymentRepository;
    @Test
    public void registerClientCarShouldReturnedClientWithNewCar(){
        String carMake = "Mercedes";
        String carColor = "White";
        String carPlate = "NSZ 49RJ";
        String id = "12345";

        Client returnedClient = new Client(id,true,null);
        Car returnedCar = new Car();

        returnedCar.setMake(carMake);
        returnedCar.setColor(carColor);
        returnedCar.setPlate(carPlate);

        CarService carService = new CarService(carCreator,clientRepository,paymentRepository);
        ArgumentCaptor<Client> captor = ArgumentCaptor.forClass(Client.class);
        when(carCreator.createCar(carMake,carColor,carPlate)).thenReturn(returnedCar);
        when(clientRepository.findClient(id)).thenReturn(returnedClient);

        carService.registerClientCar(id,carMake,carColor,carPlate);
        Mockito.verify(clientRepository).saveClient(captor.capture());
        assertEquals(returnedCar,captor.getValue().getCar());
    }
}