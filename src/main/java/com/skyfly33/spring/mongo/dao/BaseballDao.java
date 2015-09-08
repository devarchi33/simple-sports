package com.skyfly33.spring.mongo.dao;

import com.mongodb.WriteResult;
import com.skyfly33.spring.mongo.domain.BaseballTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

/**
 * Created by donghoon on 15. 9. 7..
 */
@Component
public class BaseballDao {

    @Autowired
    MongoTemplate mongoTemplate;

    public void saveTeam(BaseballTeam team) {
        mongoTemplate.save(team);
    }

    public void update(String name) {
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(name));
        Update update = new Update();
        update.set("draw", 1);
        WriteResult result = mongoTemplate.updateFirst(query, update, BaseballTeam.class);
    }
}
