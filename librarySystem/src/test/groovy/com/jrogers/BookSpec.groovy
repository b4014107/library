package com.jrogers

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "ValidationTest"() {
        
	when: "Book is created with title, subject and author"

	def HP1 = new Book (

	title: 'Harry Potter and the Philosophers Stone', 
	subject: '', /*Subject field is given a blank and NULL value which should be noticed by the Nullable and Blank constraints*/
	author: 'J.K Rowling'
)

	then: "Validation should fail due to subject attributes constraint not permitting NULL or Blank fields"

	!HP1.validate()


    }
}
