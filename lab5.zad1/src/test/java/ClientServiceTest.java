import exception.ClientAlreadyInactiveException;
import exception.ClientNotFoundException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class) public class ClientServiceTest { @Mock ClientRepository clientRepository;
@Test
public void disableClientAccountMarksClientAsInactiveIfClientIsFoundAndIsActive() {
    String id = "12345";
    ClientService clientService = new ClientService(clientRepository);
    Client myClient = new Client(id, true, null);
    when(clientRepository.findClient(id)).thenReturn(myClient);
    Client returnedClient = clientService.disableClientAccount(id);
    Mockito.verify(clientRepository).saveClient(myClient);
    assertEquals(id, returnedClient.getId());
    assertFalse(returnedClient.isActive());
}
@Test
        (expected = ClientNotFoundException.class) public void disableClientAccountThrowsExceptionIfClientIsNotFound() {
    String id = "12345";
    ClientService clientService = new ClientService(clientRepository);
    when(clientRepository.findClient(id)).thenReturn(null);
    clientService.disableClientAccount(id);
    Mockito.verify(clientRepository, times(0)).saveClient(any());
}
@Test
        (expected = ClientAlreadyInactiveException.class) public void disableClientAccountThrowsExceptionIfClientIsFoundButNotActive() {
    String id = "12345";
    ClientService clientService = new ClientService(clientRepository);
    Client myClient = new Client(id, false, null);
    when(clientRepository.findClient(id)).thenReturn(myClient);
    clientService.disableClientAccount(id);
    Mockito.verify(clientRepository, times(0)).saveClient(any());
}
@Test
public void updateClientAccountIdSetNewClientIdWhenClientIsFound(){
    String id = "12345";
    String returnedId = "54321";
    ClientService clientService = new ClientService(clientRepository);
    Client myClient = new Client(id,true,null);
    when(clientRepository.findClient(id)).thenReturn(myClient);
    Client returnedClient = clientService.updateClientAccountId(id,returnedId);
    Mockito.verify(clientRepository, times(1)).saveClient(any());
    Mockito.verify(clientRepository, times(1)).deleteClient(any());
    assertEquals(returnedId,returnedClient.getId());
}
@Test
        (expected = ClientNotFoundException.class) public void updateClientAccountIdThrowsClientNotFoundException(){
    String id = "12345";
    String returnedId = "54321";
    ClientService clientService = new ClientService(clientRepository);
    when(clientRepository.findClient(id)).thenReturn(null);
    clientService.updateClientAccountId(id,returnedId);
    Mockito.verify(clientRepository, times(0)).saveClient(any());
    Mockito.verify(clientRepository, times(0)).deleteClient(any());
}
}
