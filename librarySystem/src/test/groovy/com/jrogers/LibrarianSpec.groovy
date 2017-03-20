package com.jrogers

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "EmailValidation"() {
        
	when: "A new librarian is logged onto the system with their name, email and office"

	def Mary = new Librarian (

	name: 'Mary Berry',
	studentemail: 'MB@outlook.com',
	office: '2202'
)

	then: "Marys email should be validated" 

	Mary.validate()

    }
}
