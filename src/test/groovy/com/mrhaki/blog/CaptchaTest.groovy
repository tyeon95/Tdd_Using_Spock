package com.mrhaki.blog

import spock.lang.Specification

class CaptchaTest extends Specification{
    def "First pattern left operand should be One"() {
        Captcha captcha = new Captcha(1, 1, 1, 1)
        expect: captcha.left() == "One"
    }

    def "First pattern left operand should be Nine"() {
        Captcha captcha = new Captcha(1, 9, 1, 1)
        expect: captcha.left() == "One"
    }
}
