package ideten.execution_inteface;

import ideten.execution_inteface.model.Submission;

public class ExecutionInterfaceService  {
    public void execute (String code, String lang, String id){
        //@Todo write logic for distributing load
        Submission submission = new Submission(id,code, lang);

    }
}
