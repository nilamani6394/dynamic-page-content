package com.nilmani.dynamicpagecontent.Repository

import com.nilmani.dynamicpagecontent.entity.Consumer
import org.springframework.data.jpa.repository.JpaRepository

interface ConsumerRepository : JpaRepository<Consumer,Long> {
}