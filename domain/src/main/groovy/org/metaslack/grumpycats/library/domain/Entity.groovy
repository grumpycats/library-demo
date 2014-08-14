package org.metaslack.grumpycats.library.domain

import org.metaslack.grumpycats.library.domain.Identifiable

abstract class Entity<T> implements Identifiable<T>, Serializable {
  T id
  protected Entity(T id) {
    this.id = id
  }
  @Override
  T getId() {
    this.id
  }
  @Override
  String toString() {
    "Entity(${id})"
  }
}
