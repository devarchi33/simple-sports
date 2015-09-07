import com.fasterxml.jackson.databind.ObjectMapper;
import com.skyfly33.spring.mongo.domain.BaseballTeam;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;

/**
 * Created by donghoon on 15. 9. 5..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/web/WEB-INF/config/coreApplicationContext.xml", "file:src/main/web/WEB-INF/config/mongoApplicationContext.xml"})
public class BaseballTeamJacksonTest {

    Logger logger = LoggerFactory.getLogger(BaseballTeamJacksonTest.class);

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void stringToObjectTest() throws Exception {
        String kiaJson = "{\"win\": " + 58 + ", \"draw\": " + 0 + ", \"lose\": " + 63 + "}";
        BaseballTeam kia = objectMapper.readValue(kiaJson, BaseballTeam.class);
        int win = kia.getWin();
        logger.info("Kia Win: " + win);
    }

    @Test
    public void fileToObjectTest() throws Exception {
        File file = new File("/Users/donghoon/IdeaProjects/simple-jackson/src/main/resources/json/kia.json");
        BaseballTeam kia = objectMapper.readValue(file, BaseballTeam.class);
        int draw = kia.getDraw();
        logger.info("Kia draw: " + draw);
    }
}
