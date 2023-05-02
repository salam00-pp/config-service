package com.bhn.configservice.utility;

import com.bhn.configservice.model.DatabaseSequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import java.util.Objects;
import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

public class SequenceGenerator {
    @Autowired
    private MongoOperations mongoOperations;
    public String generateSequence(String seqName) {
        DatabaseSequence counter = mongoOperations.findAndModify(query(where("_id").is(seqName)),
                new Update().inc("seq",1), options().returnNew(true).upsert(true),
                DatabaseSequence.class);
        Long seqNumber= !Objects.isNull(counter) ? counter.getSeq() : 1;
        return seqName.concat(seqNumber.toString());
    }
}
