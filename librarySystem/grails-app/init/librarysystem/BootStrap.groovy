package com.jrogers

class BootStrap {

    def init = { servletContext ->

def lib1 = new Library (
name: 'Sheffield Hallam HQ Library',
address: '23 Arundel Gate, Sheffield',
openingHours: '9:00am - 6:00pm', 
location: 'Right side of Owen Building',
studySpaces: '20'

).save()

def cour1 = new Course (
title: 'Biology',
code: 'ACES-BIO-321',
leader: 'Henry Green',
department: 'ACES',
description: ";ljhoh",	
studyMode: 'IIGUHLIU'

).save()

def stu1 = new Student (

name: 'Harry Batt',
email: 'HarryBatt@Gmail.com',
username: 'HarryBatty123',
password: 'password',
studentID: '340123412',
course: cour1,
library: lib1
).save()


def stu2 = new Student (

name: 'Suzie Jones',
email: 'SuzieJones@Outlook.com',
username: 'SuzieJones321',
password: 'password',
studentID: '340123414',
course: cour1,
library: lib1

).save()

def boo1 = new Book (

title: 'Krenton Biology Studies Series 1',
subject: 'Science',
author: 'John Glasbrow',
isbn: '6301381653',
dateBorrowed: new Date('10/03/2017'),
returnDate: new Date('17/03/2017'),
student: stu1,
overdue: false,
library: lib1

).save()

def boo2 = new Book (

title: 'Krenton Biology Studies Series 2',
subject: 'Science',
author: 'John Glasbrow',
isbn: '6301381654',
dateBorrowed: new Date('12/03/2017'),
returnDate: new Date('20/03/2017'),
student: stu1,
overdue: true,
library: lib1

).save()
     
def libria1 = new Librarian (

name: 'Jenny Yates',
email: 'JennyYates@shu.ac.uk',
office: '2201',
username: 'JenYates',
password: 'password',
telephone: '0114228345',
library: lib1

).save()

def libria2 = new Librarian (

name: 'Alan Barker',
email: 'AlanBarker@shu.ac.uk',
office: '2201',
username: 'AlBaker',
password: 'password',
telephone: '01142256754',
library: lib1

).save()

def bookrev1 = new BookReview (

bookReview: 'Book Review for Biology 1',
book: boo1,
dateMade: new Date('18/03/2017'),
student: stu1,
review: "This book is great!"

).save()

def bookrev2 = new BookReview (

bookReview: 'Book Review for Biology 2',
book: boo2,
dateMade: new Date('23/03/2017'),
student: stu1,
review: "This book isn't as good as the first one!"

).save()


	}
	def destroy = {
	}

}
