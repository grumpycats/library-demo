package org.metaslack.grumpycats.library.store


abstract class StoreSpyBase implements Map<Long, Wrapper<Long>> {
  HashMap<Long, Wrapper<Long>> store = new HashMap<>()

  @Override
  int size() {
    return 0
  }

  @Override
  boolean isEmpty() {
    return false
  }

  @Override
  boolean containsKey(Object key) {
    return false
  }

  @Override
  boolean containsValue(Object value) {
    return false
  }

  @Override
  Wrapper<Long> get(Object key) {
    return null
  }

  @Override
  Wrapper<Long> put(Long key, Wrapper<Long> value) {
    return null
  }

  @Override
  Wrapper<Long> remove(Object key) {
    return null
  }

  @Override
  void putAll(Map<? extends Long, ? extends Wrapper<Long>> m) {

  }

  @Override
  void clear() {

  }

  @Override
  Set<Long> keySet() {
    return null
  }

  @Override
  Collection<Wrapper<Long>> values() {
    return null
  }

  @Override
  Set<Map.Entry<Long, Wrapper<Long>>> entrySet() {
    return null
  }
}
