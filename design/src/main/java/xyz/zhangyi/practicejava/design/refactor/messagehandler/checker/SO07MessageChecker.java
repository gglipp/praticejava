package xyz.zhangyi.practicejava.design.refactor.messagehandler.checker;


import xyz.zhangyi.practicejava.design.refactor.messagehandler.MessageReader;

public class SO07MessageChecker extends MessageChecker {
    public SO07MessageChecker(MessageReader expectedMessage, String actualMessage) {
        super(expectedMessage, actualMessage);
    }

    @Override
    public void checkResponse() {

    }
}
