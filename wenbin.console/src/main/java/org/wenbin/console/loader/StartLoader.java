package org.wenbin.console.loader;

import org.wenbin.console.common.Action;

public class StartLoader {
    public void init(){
        Name name = new Name("Jeff");
        Action action = ()->name.DisplayToConsole();
        action.accept();
    }
}
