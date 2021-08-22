package com.dzyls.design.command;

import com.dzyls.design.command.impl.CDCommand;
import com.dzyls.design.command.impl.PWDCommand;

import java.util.Scanner;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/22 11:07
 * @Version 1.0.0
 * @Description: 命令模式
 */
public class MainApplication {


    public static void main(String[] args) {

        Broker broker = new Broker();
        broker.execute();
        Scanner scanner = new Scanner(System.in);
        Receiver receiver = new Receiver();
        while (scanner.hasNext()){
            String s = scanner.next();
            if ("cd".equalsIgnoreCase(s)){
                broker.putCmd(new CDCommand(receiver));
            }else if ("pwd".equalsIgnoreCase(s)){
                broker.putCmd(new PWDCommand(receiver));
            }else {
                System.err.println("wrong command");
            }
        }
    }


}
