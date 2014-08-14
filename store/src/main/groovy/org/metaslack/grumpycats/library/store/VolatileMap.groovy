package org.metaslack.grumpycats.library.store


class VolatileMap<I, T extends Serializable> implements Store {
  Map<I, Wrapper<T>> map

  VolatileMap(Map map) {
    this.map = map
  }

  @Override
  void create(Object id, Wrapper data) {
    map.put((I)id, data)
  }

  @Override
  Wrapper read(Object id) {
    map.get(id)
  }

  @Override
  List<Wrapper> readAll() {
    List<Wrapper> wrappers = new ArrayList<>()
    map.values().each { def value ->
      wrappers.add(value)
    }
    wrappers
  }

  @Override
  void update(Object id, Wrapper data) {
    map.put((I)id, data)
  }

  @Override
  void delete(Object id) {
    Wrapper<T> wrapper = map.get(id)
    if (wrapper) {
      wrapper.isDeleted = true
      map.put((I)id, wrapper)
    }
  }

}
