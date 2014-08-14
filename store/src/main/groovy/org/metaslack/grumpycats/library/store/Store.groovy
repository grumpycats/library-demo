package org.metaslack.grumpycats.library.store


public interface Store<I, E extends Serializable> {
  void create(I id, Wrapper<E> data)
  Wrapper<E> read(I id)
  List<Wrapper<E>> readAll()
  void update(I id, Wrapper<E> data)
  void delete(I id)
}