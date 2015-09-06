package com.skyfly33.spring.mongo.dao;

import com.skyfly33.spring.mongo.domain.BaseballTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by donghoon on 15. 9. 7..
 */
@Component
public class BaseballDao {

    @Autowired
    MongoTemplate mongoTemplate;

    public void saveTeam() {
        BaseballTeam kia = new BaseballTeam(58, 0, 64);
        mongoTemplate.save(kia);
    }
}
