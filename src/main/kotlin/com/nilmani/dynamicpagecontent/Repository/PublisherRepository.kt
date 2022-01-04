package com.nilmani.dynamicpagecontent.Repository

import com.nilmani.dynamicpagecontent.entity.Publisher
import org.springframework.data.jpa.repository.JpaRepository

interface PublisherRepository : JpaRepository<Publisher,Long> {
}