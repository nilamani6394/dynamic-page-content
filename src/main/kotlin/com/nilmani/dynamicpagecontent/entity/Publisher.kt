package com.nilmani.dynamicpagecontent.entity

import javax.persistence.*

@Entity
data class Publisher (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id:Long=-1,
    val name:String="",
    @ManyToMany(mappedBy = "publishers")
    val book:Set<Book> = hashSetOf()
        )
