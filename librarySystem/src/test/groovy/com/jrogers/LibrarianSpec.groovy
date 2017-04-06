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
        
	when: "A new librarian is logged onto the system with their name and incorrect email and office"

	def Mary = new Librarian (

	name: 'Mary Berry',

	email: 'MBOutlook.com', /*This is the attribute which is being tested, as the email constraint on email should recognise an invalid 					email*/

	office: '2012'

)

	then: "Marys should not be validated due to the email constraint on the email attribute recognising the inserted email is invalid" 

	!Mary.validate()

    }
}
