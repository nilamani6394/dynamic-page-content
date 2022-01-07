package com.nilmani.dynamicpagecontent.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Consumer(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id:Long=-1,
    val firstName:String="",
    val mobileNumber:Long=-1,
    val email:String="",
    val password:String="",
    val rePassword:String="",
)
