import org.wenbin.console.Merkle.HouseCoin;
import java.util.logging.Logger;

/**
 *
 * @author quwb
 * @date 2018/1/4
 */

public class Program {

    private static Logger logger = Logger.getLogger(Object.class.getName());

    public static void main(String[] args) {

        logger.info("log test!");

        //new AsynClass().run(ThreadType.Task);
        //new StartLoader().init()
        // System.out.println(SubClass.value);
        new HouseCoin().run();
    }
}
