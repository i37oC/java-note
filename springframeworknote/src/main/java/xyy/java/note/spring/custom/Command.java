package xyy.java.note.spring.custom;

import java.util.Map;

/**
 * Created by xyy on 2017/2/24.
 */
public class Command {
    private Map commandState;

    public Object execute(){
        return null;
    }

    public Map getCommandState() {
        return commandState;
    }

    public void setCommandState(Map commandState) {
        this.commandState = commandState;
    }
}
