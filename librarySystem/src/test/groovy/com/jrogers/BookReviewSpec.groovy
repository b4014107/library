package com.jrogers

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(BookReview)
class BookReviewSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

   void "BookReviewValidation"() {
        
	when: "A new book review is made"

	def IndianaBones = new BookReview (

	bookReview: 'Book Review for Biology 1',
	book: boo1,
	dateMade: new Date('18/03/2017'),
	student: stu1,
	review: "This book is great!"

)

	then: "Marys email should be validated" 

	IndianaBones.validate()

    }
}
