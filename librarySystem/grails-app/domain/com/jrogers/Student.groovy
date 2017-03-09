package com.jrogers

class Student {

String name

String email

String username

String password

String studentID

Course course

    static constraints = {

name blank:false, nullable:false

email blank:false, nullable:false, email:true

username blank:false, nullable:false, unique:true

password blank:false, nullable:false

studentID blank:false, nullable:false

course blank:false, nullable:false


    }
}
