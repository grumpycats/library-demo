package org.metaslack.grumpycats.library.store


class StoreSpy extends StoreSpyBase {

  Long lastPutKey
  Wrapper<Long> lastPutValue

  @Override
  Wrapper<Long> put(Long key, Wrapper<Long> value) {
    lastPutKey = key
    lastPutValue = value
  }
}
