package com.netology.kotlinhomework4_2


class Post (
    val id: Long,
    val author: String,
    val content: String,
    val created: String, // дата - пока строка

    var likedByMe: Boolean = false,
    var CommentdByMe: Boolean = false,
    var ShareByMe: Boolean = false,
    var locationByMe: Boolean = false,

    var likedCounter: Int = 0,
    var commentCounter:Int = 0,
    var shareCounter: Int = 0,

    var address: String ="",
    var coordinates_lat: Double = 0.0,
    var coordinates_lng: Double = 0.0


)
