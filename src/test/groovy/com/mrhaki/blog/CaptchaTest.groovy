package com.mrhaki.blog

import spock.lang.Specification

class CaptchaTest extends Specification{
    def "First pattern left operand shold be numeric string"() {
        setup:
            def captcha = new Captcha(pattern, left, operator, right)

        expect:
            captcha.left() == result

        where:
            pattern | left | operator | right | result
            1       | 1    | 1        | 1     | "One"
            1       | 2    | 1        | 1     | "Two"
            1       | 9    | 1        | 1     | "Nine"
    }

    def "Second pattern left operand shold be numeric"() {
        setup:
            def captcha = new Captcha(pattern, left, operator, right)

        expect:
            captcha.left() == result

        where:
            pattern | left | operator | right | result
            2       | 1    | 1        | 1     | "1"
            2       | 2    | 1        | 1     | "2"
            2       | 9    | 1        | 1     | "9"
    }
}
