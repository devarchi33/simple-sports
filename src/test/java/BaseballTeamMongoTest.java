import com.fasterxml.jackson.databind.ObjectMapper;
import com.skyfly33.spring.mongo.dao.BaseballDao;
import com.skyfly33.spring.mongo.domain.BaseballTeam;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;

/**
 * Created by donghoon on 15. 9. 7..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/web/WEB-INF/config/coreApplicationContext.xml", "file:src/main/web/WEB-INF/config/mongoApplicationContext.xml"})
public class BaseballTeamMongoTest {

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    BaseballDao baseballDao;

    @Test
    public void saveTest() throws Exception {
        File baseballTeam = new File("/Users/donghoon/IdeaProjects/simple-jackson/src/main/resources/json/lotte.json");
        BaseballTeam team = objectMapper.readValue(baseballTeam, BaseballTeam.class);
        baseballDao.saveTeam(team);
    }

    @Test
    public void updateTest() throws Exception {
        baseballDao.update("lotte");
    }
}
