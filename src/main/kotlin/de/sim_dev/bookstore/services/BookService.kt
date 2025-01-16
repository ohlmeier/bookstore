package de.sim_dev.bookstore.services

import de.sim_dev.bookstore.domain.BookSummary
import de.sim_dev.bookstore.domain.BookUpdateRequest
import de.sim_dev.bookstore.domain.entities.BookEntity

interface BookService {

    fun createUpdate(isbn: String, bookSummary: BookSummary): Pair<BookEntity, Boolean>

    fun list(authorId: Long?=null): List<BookEntity>

    fun get(isbn: String): BookEntity?

    fun partialUpdate(isbn: String, bookUpdateRequest: BookUpdateRequest): BookEntity

    fun delete(isbn: String)

}