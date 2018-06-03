import authentication.SymBotAuth;
import configuration.SymConfig;
import configuration.SymConfigLoader;
import org.junit.Before;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertNotNull;

/**
 * Created by nerd-they-nerd-jack on 3/6/2018.
 */
public class SymphonySmokeTests {

    private SymBotAuth botAuth;

    @Before
    public void authenticate() {
        if (botAuth == null) {
            URL url = getClass().getResource("config.json");
            SymConfigLoader configLoader = new SymConfigLoader();
            SymConfig config = configLoader.loadFromFile(url.getPath());
            botAuth = new SymBotAuth(config);
            botAuth.authenticate();
        }
    }

    @Test
    public void can_authenticate() throws Exception {
        assertNotNull(botAuth.getKmToken());
        assertNotNull(botAuth.getSessionToken());
    }
}
