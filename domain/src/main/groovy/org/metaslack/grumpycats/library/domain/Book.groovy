package org.metaslack.grumpycats.library.domain

import org.metaslack.grumpycats.library.domain.Entity

class Book extends Entity<Long> {
  String title
  Book(String title, Long id) {
    super(id)
    this.title = title
  }
  @Override
  String toString() {
    "Book(${title},${super.toString()})"
  }
}
