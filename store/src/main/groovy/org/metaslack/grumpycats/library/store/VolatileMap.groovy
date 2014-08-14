package org.metaslack.grumpycats.library.store


class VolatileMap<I, T extends Serializable> implements Store {
  Map<I, Wrapper<T>> store

  VolatileMap(Map store) {
    this.store = store
  }

  @Override
  void create(Object id, Wrapper data) {
    store.put((I)id, data)
  }

  @Override
  Wrapper read(Object id) {
    store.get(id)
  }

  @Override
  List<Wrapper> readAll() {
    List<Wrapper> wrappers = new ArrayList<>()
    store.values().each { def value ->
      wrappers.add(value)
    }
    wrappers
  }

  @Override
  void update(Object id, Wrapper data) {
    store.put((I)id, data)
  }

  @Override
  void delete(Object id) {
    Wrapper<T> wrapper = store.get(id)
    if (wrapper) {
      wrapper.isDeleted = true
      store.put((I)id, wrapper)
    }
  }

}
