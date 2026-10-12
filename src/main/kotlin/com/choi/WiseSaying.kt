package com.choi

data class WiseSaying(
    var content: String,
    var author: String,
){
    var id: Int = 0

    fun modify(newContent: String, newAuthor: String): WiseSaying {
        this.content = newContent
        this.author = newAuthor
        return this
    }

    fun isNew(): Boolean {
        return id == 0
    }
}
