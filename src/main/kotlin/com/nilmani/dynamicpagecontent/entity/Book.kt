package com.nilmani.dynamicpagecontent.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@Entity
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id:Long=-1,
    val name:String="",
    @ManyToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @JoinTable(name = "book_publisher",
        joinColumns = [JoinColumn(name = "book_id", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "publisher_id", referencedColumnName = "id")])
    @JsonIgnoreProperties("book")
    val publishers: Set<Publisher> = hashSetOf()
)
