package org.metaslack.grumpycats.library.domain

import org.metaslack.grumpycats.library.domain.Entity

class Loan extends Entity<Long> {
  Long bookId
  Long userId
  Long dueDate
  Loan(Long userId, Long bookId, Long dueDate, Long loanId) {
    super(loanId)
    this.userId = userId
    this.bookId = bookId
    this.dueDate = dueDate
  }
  @Override
  String toString() {
    "Loan(${userId},${bookId},${dueDate},${super.toString()})"
  }
}
