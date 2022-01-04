package com.nilmani.dynamicpagecontent.model

import com.nilmani.dynamicpagecontent.entity.Publisher

data class ResBook(
    val name:String="",
    val publishers: Set<Publisher> = hashSetOf()
)
