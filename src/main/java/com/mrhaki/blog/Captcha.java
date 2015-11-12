package com.mrhaki.blog;

/**
 * Created by roof on 11/11/15.
 */
public class Captcha {
    private int left, pattern;
    public Captcha(int pattern, int left, int operator, int right) {
            this.left = left;
            this.pattern = pattern;
    }

    public String left() {
        String[] numericString = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if (this.pattern==1)
            return numericString[this.left-1];
        return String.valueOf(this.left);
    }
}
