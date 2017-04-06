package com.jrogers

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

     void toString() {


        when:"A student has name, email and username"

	def Andrew = new Student(	

	name:'Andrew King',
	email:'AndrewKing@Gmail.com',
	userName: 'TheKing123'
)

	then:"the toString method will merge them."

	Andrew.toString() == 'Andrew King, AndrewKing@Gmail.com, TheKing123' /*toString function should output exactly like this*/

	




    }
}
