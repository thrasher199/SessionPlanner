package com.nasrol.sessionplanner.entity

import spock.lang.Specification

import java.text.SimpleDateFormat

class SessionTest extends Specification {

    def "CalculateEndDate"() {
        Session session = new Session()

        when:
        Date inputDate = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(input)
        def result = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(session.calculateEndDate(inputDate))


        then :
        result == expected

        where:
        input | expected
        '2019-12-04 11:41' | '2019-12-04 12:41'
    }
}
