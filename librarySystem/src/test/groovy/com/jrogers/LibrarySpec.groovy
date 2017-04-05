package com.jrogers

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Library)
class LibrarySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

Void "LibraryStudySpacesValidationTest"() {

    when: "A new library is created and give some specific values"

	def TownHall = new Library (

	name: 'Sheffield Town Hall Library',
	address: '23 Arundel Gate, Sheffield, S1 1WB',
	openingHours: '24 Hours', 
	location: 'Centre of the city',
	studySpaces: '500'
)

	then: "Validation passes as maxSize on studySpaces is set within the correct constraint"

	TownHall.validate()

    }
}
