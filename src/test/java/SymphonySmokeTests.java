import authentication.SymBotAuth;
import clients.SymBotClient;
import configuration.SymConfig;
import configuration.SymConfigLoader;
import exceptions.SymClientException;
import model.Room;
import model.RoomInfo;
import model.UserInfo;
import org.junit.Before;
import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.net.URL;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by nerd-they-nerd-jack on 3/6/2018.
 */
public class SymphonySmokeTests {

    private static SymBotAuth botAuth;
    private static SymBotClient botClient;

    @Before
    public void authenticate() {
        if (botAuth == null) {
            URL url = getClass().getResource("config.json");
            SymConfigLoader configLoader = new SymConfigLoader();
            SymConfig config = configLoader.loadFromFile(url.getPath());
            botAuth = new SymBotAuth(config);
            botAuth.authenticate();
            botClient = SymBotClient.initBot(config, botAuth);
        }
    }

    @Test
    public void can_authenticate() throws Exception {
        assertNotNull(botAuth.getKmToken());
        assertNotNull(botAuth.getSessionToken());
    }

    @Test
    public void can_find_a_user() throws Exception {
        UserInfo userInfo = botClient.getUsersClient().getUserFromEmail("commandercheng@gmail.com", true);
        assertEquals(userInfo.getDisplayName(), "Angus Cheng");
    }

    @Test
    public void can_create_a_room() throws Exception {
        RoomInfo roomInfo = createRoom();
        assertEquals(roomInfo.getRoomAttributes().getDescription(), "test");
    }

    @Test
    public void can_create_a_room_and_add_angus_in() throws Exception {
        RoomInfo roomInfo = createRoom();
        UserInfo userInfo = botClient.getUsersClient().getUserFromEmail("commandercheng@gmail.com", true);
        botClient.getStreamsClient().addMemberToRoom(roomInfo.getRoomSystemInfo().getId(), userInfo.getId());
    }

    @Test
    public void can_listen_to_messages_in_room() throws Exception {
        throw new NotImplementedException();
    }


    RoomInfo createRoom() throws SymClientException {
        Room room = new Room();
        room.setName("Angus " + UUID.randomUUID().toString());
        room.setDescription("test");
        room.setDiscoverable(true);
        room.setPublic(true);
        room.setViewHistory(true);

        return botClient.getStreamsClient().createRoom(room);
    }
}
