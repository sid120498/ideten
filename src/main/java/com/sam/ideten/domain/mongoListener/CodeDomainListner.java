package com.sam.ideten.domain.mongoListener;

import com.sam.ideten.domain.Code;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;
@Component
public class CodeDomainListner extends AbstractMongoEventListener<Code> {
    @Override
    public void onBeforeConvert(BeforeConvertEvent<Code> event) {
        String uuid = UUID.randomUUID().toString();
        event.getSource().setId(uuid);
        event.getSource().setCreatedAt(new Date());
    }
}