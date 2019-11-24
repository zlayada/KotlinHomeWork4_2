package com.netology.kotlinhomework4_2


class SpecialPost (
    id: Long,
    author: String,
    content: String,
    created: String,

    likedByMe: Boolean,
    CommentdByMe: Boolean,
    ShareByMe: Boolean,

    likedCounter: Int,
    commentCounter:Int,
    shareCounter: Int,

    // Добавлены дополнительные поля
    var locationByMe: Boolean = false,
    val address: String ="",
    val coordinates_lat: Double = 0.0,
    val coordinates_lng: Double = 0.0


): Post(
        id,
    author,
    content,
    created,

    likedByMe,
    CommentdByMe,
    ShareByMe,

    likedCounter,
    commentCounter,
    shareCounter
 )
