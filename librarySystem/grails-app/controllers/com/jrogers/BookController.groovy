package com.jrogers

import grails.converters.*

class BookController {

static allowedMethods = [index: "GET", show:"GET", remove:"REMOVE"]

def scaffold = Book

def advSearch() {

}

def advResults() {

def bookProps = Book.metaClass.properties*.name

def books = Book.withCriteria {
 "${params.queryType}" {

	params.each {field, value ->

		if(bookProps.grep(field) && value) {

			ilike(field, value)
		}
	}


}

}

[books:books]

}


 def Bindex(Book book){
 
 render Book.list() as JSON
 
 if (Book == null){
 
 render "There are currently no book details in the database"
 
 }
 
 }
 
}
