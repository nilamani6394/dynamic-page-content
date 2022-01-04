//package com.nilmani.dynamicpagecontent.controller
//
//import com.nilmani.dynamicpagecontent.Repository.BookRepository
//import com.nilmani.dynamicpagecontent.Repository.PublisherRepository
//import com.nilmani.dynamicpagecontent.entity.Book
//import com.nilmani.dynamicpagecontent.entity.Publisher
//import com.nilmani.dynamicpagecontent.model.ReqBook
//import com.nilmani.dynamicpagecontent.model.ResBook
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.boot.CommandLineRunner
//import org.springframework.http.HttpStatus
//import org.springframework.http.ResponseEntity
//import org.springframework.web.bind.annotation.ModelAttribute
//import org.springframework.web.bind.annotation.PostMapping
//import org.springframework.web.bind.annotation.RequestMapping
//import org.springframework.web.bind.annotation.RestController
//
//
//@RestController
//@RequestMapping("/test")
//class AdminController {
//    @Autowired
//    private lateinit var bookRepository: BookRepository
//    @Autowired
//    private lateinit var publisherRepository: PublisherRepository
//
//    @PostMapping("/add")
//    fun newBook(@ModelAttribute request: ReqBook,publisher: Publisher):ResponseEntity<*>{
//        val bookNew  = Book(
//        name = request.name
//        )
//        val saveBook = bookRepository.save(bookNew)
//        val newPublisher = Publisher(
//            name = publisher.name,
//            book = publisher.book
//        )
//        val savePublisher = publisherRepository.save(newPublisher)
//
//        saveBook
//
//        val respBook = ResBook(
//            saveBook.name,
//            saveBook.publishers
//        )
//        return ResponseEntity(savePublisher,HttpStatus.OK)
//    }
//
//}
