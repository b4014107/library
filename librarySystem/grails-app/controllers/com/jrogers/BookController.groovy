package com.jrogers

import grails.converters.*

class BookController {

static allowedMethods = [index: "GET", show:"GET", remove:"REMOVE"]

def scaffold = Book

def Bindex(Book book){

render Book.list() as JSON

if (Book == null){


flash.message="There are currently no book details in the database"

}

}


def Bshow (Book book) {

if (params.id && Book.exists(params.id)){

render Book.findById(params.id) as JSON

}

else {

render Book.list() as JSON

}

}

def delete (Book book) {



}

}
