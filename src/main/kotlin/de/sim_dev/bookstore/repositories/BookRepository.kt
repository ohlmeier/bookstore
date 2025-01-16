package de.sim_dev.bookstore.repositories

import de.sim_dev.bookstore.domain.entities.BookEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository: JpaRepository<BookEntity, String> {

    fun findByAuthorEntityId(id: Long): List<BookEntity>

}
