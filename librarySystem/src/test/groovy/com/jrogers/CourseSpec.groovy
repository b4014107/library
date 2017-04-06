package com.jrogers

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */

@TestFor(Course)
class CourseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void totalFees() {

        when: "A Course has title and fees"

	def computing = new Course(title: 'BSc Hon Computing',


				tuitionFees:9000) /*With the computing course given a fee of 9000, it should be calculated with the 								calculate method to equal the value of 36000*/


	then:"The calculateFees method will total fees"

	computing.calculateFees() == 36000
    }
}
