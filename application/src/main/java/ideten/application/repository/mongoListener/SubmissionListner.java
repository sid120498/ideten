//package ideten.applicationrepository.mongoListener;
//
//import ideten.applicationdomain.Submission;
//import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
//import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
//import org.springframework.data.mongodb.core.mapping.event.BeforeSaveEvent;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//import java.util.UUID;
//@Component
//public class SubmissionListner extends AbstractMongoEventListener<Submission> {
//    @Override
//    public void onBeforeSave (BeforeSaveEvent<Submission> event) {
//        String uuid = UUID.randomUUID().toString();
//        event.getSource().setId(uuid);
//        event.getSource().setExecuted(0);
//        event.getSource().setVerdict("running");
//        event.getSource().setCreatedAt(new Date());
//    }
//}