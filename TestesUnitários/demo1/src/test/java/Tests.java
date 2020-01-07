
import Model.UMCarroJa;
import Model.User;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test(expected = Exception.class)
    public void Test1() throws Exception {
        // testar a função login
        String username = "username";
        String passwd = "pass";


        UMCarroJa model = new UMCarroJa();
        User user = model.logIn(username, passwd);

        assertTrue(model.getUsers().getUserBase().containsValue(user));
    }


    @Test
    public void Test2() {

        UMCarroJa model = new UMCarroJa();
        List<Map.Entry<String, Double>> bct = model.getBestClientsTravel();
        List<Map.Entry<String, Double>> bc = model.getBestClients();
        List<Map.Entry<String, Integer>> bctimes = model.getBestClientsTimes();

        assertEquals(model.getUsers().getUserBase().size(), bct.size());
        assertEquals(model.getUsers().getUserBase().size(), bc.size());
        assertEquals(model.getUsers().getUserBase().size(), bctimes.size());
    }

    @Test
    public void Test3() {

    }
}
