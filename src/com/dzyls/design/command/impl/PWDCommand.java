package com.dzyls.design.command.impl;

import com.dzyls.design.command.Command;
import com.dzyls.design.command.Receiver;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/22 9:51
 * @Version 1.0.0
 * @Description:
 */
public class PWDCommand implements Command {

    private Receiver receiver;

    public PWDCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.pwd();
    }

}
