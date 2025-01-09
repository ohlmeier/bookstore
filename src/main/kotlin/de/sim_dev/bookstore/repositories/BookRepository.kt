package de.sim_dev.bookstore.repositories

import de.sim_dev.bookstore.domain.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : JpaRepository<Book, String> {
}