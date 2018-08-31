package com.ps.stack.Impl;

import com.ps.stack.ArrayStack;

import java.util.Stack;

/**
 * @Author:panshuang
 * @Data:2018/8/31 21:59
 * @Description:
 */
public class BracketSolution {
    /**
     * 括号匹配问题，如“(){}[]”是匹配的，而“(]{}”是不匹配的
     * @param str
     * @return
     */
    public static boolean isVaild(String str){
        Stack<Character> bracketStack = new Stack<>();
        for (int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                 bracketStack.push(c);
            } else {
                if (bracketStack.size() == 0) {
                    return false;
                }
                char m = bracketStack.pop();
                if (!(c == ')' && m == '(' || c == ']' && m == '[' || c == '}' && m == '{')) {
                   return false;
                }
            }
        }
        return bracketStack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isVaild("}"));
    }

}
