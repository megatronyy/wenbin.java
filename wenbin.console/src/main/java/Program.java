import org.wenbin.console.asyn.AsynClass;
import org.wenbin.console.asyn.ThreadType;

/**
 * Created by quwb on 2018/1/4.
 */
public class Program {
    public static void main(String[] args) {
        new AsynClass().run(ThreadType.scheduledRate);
        //System.out.println(SubClass.value);
    }
}
