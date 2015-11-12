package com.mrhaki.blog

import spock.lang.Specification

class CaptchaTest extends Specification{
    def "First pattern left operand should be One"() {
        def captcha = new Captcha(1, 1, 1, 1)
        expect: captcha.left() == "One"
    }

    def "First pattern left operand should be Nine"() {
        def captcha = new Captcha(1, 9, 1, 1)
        expect: captcha.left() == "Nine"
    }

    def "Second pattern left operand should be 1"() {
        def captcha = new Captcha(2, 1, 1, 1)
        expect: captcha.left() == "1"
    }
}
