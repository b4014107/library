package com.jrogers

class Course {

String title

String code

String leader

String department

String description 

String studyMode

double tuitionFees

static hasMany=[students:Student]

String toString(){ 

return title

}

double calculateFees(){

4*tuitionFees

}











    static constraints = {

title blank:false, nullable:false

code blank:false, nullable:false

leader blank:false, nullable:false

department blank:false, nullable:false

description blank:false, nullable:false, maxSize:5000 

studyMode blank:false, nullable:false, size: 1..20

tuitionFees blank:false, nullable:false, scale: 2


    }
}
