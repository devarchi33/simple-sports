import com.skyfly33.spring.mongo.dao.BaseballDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by donghoon on 15. 9. 7..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/web/WEB-INF/config/coreApplicationContext.xml", "file:src/main/web/WEB-INF/config/mongoApplicationContext.xml"})
public class BaseballTeamMongoTest {

    @Autowired
    BaseballDao baseballDao;

    @Test
    public void saveTest() {
        baseballDao.saveTeam();
    }
}
