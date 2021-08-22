package com.dzyls.design.interpreter;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/29 17:05
 * @Version 1.0.0
 * @Description:
 */
public enum Expression {

    PLUS{
        @Override
        public int interpret(Expression left, Expression right) {

            return 1;
        }

        @Override
        public String toString() {
            return null;
        }
    };

    public abstract int interpret(Expression left,Expression right);
    public abstract String toString();

}
