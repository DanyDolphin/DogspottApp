package com.a000webhostapp.dogspott.dogspottapp.retro.models

/**
 * Clases modelo: representan entidades en la base de datos
 */

data class SimpleResponse(
    var status:String?,
    var message:String?
)

data class Dog(
    var idDog:String?,
    var name:String?,
    var image:String?,
    var likes:String?
)

data class Feed(
    var idFeed:String?,
    var idDog: String?,
    var date:String?,
    var text:String?
)

data class User(
    var idUser:String?,
    var username:String?,
    var password:String?
)