package org.wenbin.console.loader;

import org.wenbin.console.common.Action;
import org.wenbin.console.common.Func;

public class StartLoader {
    public void init(){
        Name name = new Name("Jeff");
        Action action = ()->name.displayToConsole();
        action.invoke();

        Func<String, String> func = args -> name.getData(args);
        System.out.println(func.invoke("屈文斌"));
    }
}
