package com.jrogers

class StudentController {

    def scaffold = Student

def advSearch() {

}

def advResults() {

def studentProps = Student.metaClass.properties*.name

def students = Student.withCriteria {
 "${params.queryType}" {

	params.each {field, value ->

		if(studentProps.grep(field) && value) {

			ilike(field, value)
		}
	}


}

}

[students:students]

}


def login() {

}

def validate() {

def user = Student.findByUserName(params.username)

if (user && user.password == params.password){
	
	session.user=user
	session.role='student'
	render view:'home'

}

else{

	flash.message="invalid username and password."

	render view:'login'

}


}

def logout = {

	session.user = null
	session.role = null 
	redirect(uri:'/')

}

}
