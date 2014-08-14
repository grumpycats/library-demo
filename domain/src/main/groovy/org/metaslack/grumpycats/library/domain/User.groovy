package org.metaslack.grumpycats.library.domain

import org.metaslack.grumpycats.library.domain.Entity

class User extends Entity<Long> {
  String name
  User(String name, Long id) {
    super(id)
    this.name = name
  }
  @Override
  String toString() {
    "User(${name},${super.toString()})"
  }
}
