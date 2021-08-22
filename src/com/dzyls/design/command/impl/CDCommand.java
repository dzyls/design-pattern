package com.dzyls.design.command.impl;

import com.dzyls.design.command.Command;
import com.dzyls.design.command.Receiver;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/22 11:00
 * @Version 1.0.0
 * @Description:
 */
public class CDCommand implements Command {

    private Receiver receiver;

    public CDCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.cd();
    }
}
