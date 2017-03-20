package com.jrogers

class Library {

String name

String address

String openingHours

String location

String studySpaces

String toString(){ 

return name

}

static hasMany=[librarians:Librarian, students:Student, books:Book]



    static constraints = {

name blank:false, nullable: false

address blank: false, nullable: false

openingHours blank: false, nullable: false

location blank: false, nullable: false

studySpaces blank: false, nullable: false




    }
}


