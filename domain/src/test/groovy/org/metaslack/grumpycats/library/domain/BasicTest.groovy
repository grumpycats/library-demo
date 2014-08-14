package org.metaslack.grumpycats.library.domain

import org.junit.Test
import org.metaslack.grumpycats.library.domain.Book
import org.metaslack.grumpycats.library.domain.Loan
import org.metaslack.grumpycats.library.domain.User

import static org.fest.assertions.Assertions.assertThat

class BasicTest {
  final static Long NOW = (new Date()).time
  final static Long TWO_WEEKS = 1000*60*60*24*7*2

  @Test
  void testLoan() {
    User foo = new User('foo', 1L)
    Book bar = new Book('bar', 2L)
    Long due = NOW + TWO_WEEKS
    Loan subject = new Loan(foo.getId(), bar.getId(), due, 3L)
    assertThat(subject.toString()).contains('Loan(1,2,')
    assertThat(subject.toString()).contains(''+due)
    assertThat(subject.toString()).contains(',Entity(3)')
  }
}
