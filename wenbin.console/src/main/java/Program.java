import org.wenbin.console.asyn.AsynClass;
import org.wenbin.console.asyn.ThreadType;

import java.util.logging.Logger;

/**
 * Created by quwb on 2018/1/4.
 */
public class Program {

    private static Logger logger = Logger.getLogger(Object.class.getName());

    public static void main(String[] args) {

        logger.info("log test!");

        new AsynClass().run(ThreadType.scheduledRate);
        //System.out.println(SubClass.value);
    }
}
