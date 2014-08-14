package org.metaslack.grumpycats.library.store

import org.junit.Test
import org.metaslack.grumpycats.library.domain.Book

import static org.fest.assertions.Assertions.assertThat

class StoreTest {

  final static Book BOOK = new Book('Book title', 1L)
  final static StoreSpy SPY = new StoreSpy()

  @Test
  void testStoreCreate() {
    Store subject = new VolatileMap(SPY)
    Wrapper wrappedBook = new Wrapper()
    wrappedBook.wrapped = BOOK
    subject.create(1L, wrappedBook)
    assertThat(SPY.lastPutKey).isEqualTo(1L)
    assertThat(SPY.lastPutValue).isEqualTo(wrappedBook)
  }
}
