package org.metaslack.grumpycats.library.store

import org.metaslack.grumpycats.library.domain.Book
import spock.lang.Shared
import spock.lang.Specification


class StoreBehaviourTest extends Specification {

  @Shared
  Wrapper book1, book2
  @Shared
  Store subject

  def setupSpec() {
    book1 = new Wrapper()
    book1.wrapped = new Book('test book1', 1L)
    book2 = new Wrapper()
    book2.wrapped = new Book('test book2', 2L)
    book2.isError = true
    book2.errorMessage = 'some error'
    subject = new VolatileMap(new HashMap())
  }

  def "read create read update read delete read"() {
    expect:
      crudOperation == expectedValue

    where:
      crudOperation                       |expectedValue
      subject.read(1L)                    |null
      subject.create(1L, book1)           |null
      subject.read(1L)                    |book1
      subject.update(1L, book2)           |null
      subject.read(1L)                    |book2
      subject.delete(1L)                  |null
      subject.read(1L).isDeleted          |true
  }

  def "create with error read create without error read"() {
    expect:
      crudOperation == expectedValue

    where:
      crudOperation                       |expectedValue
      subject.create(2L,book2)            |null
      subject.read(2L).isError            |true
      subject.read(2L).errorMessage       |'some error'
      subject.create(2L,book1)            |null
      subject.read(2L).isError            |false
      subject.read(2L).errorMessage       |null
  }
}
