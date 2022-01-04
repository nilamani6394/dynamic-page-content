package com.nilmani.dynamicpagecontent.Repository

import com.nilmani.dynamicpagecontent.entity.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository : JpaRepository<Book,Long> {
}