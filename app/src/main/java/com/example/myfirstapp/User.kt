package com.example.myfirstapp

class User {
    var name:String=""
    var email:String=""
    var phone:String=""
    var password:String=""
    constructor(){}
    constructor(name: String, email: String, phone: String, password: String) {
        this.name = name
        this.email = email
        this.phone = phone
        this.password = password
    }


}