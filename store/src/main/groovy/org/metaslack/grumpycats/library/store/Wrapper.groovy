package org.metaslack.grumpycats.library.store


class Wrapper<T extends Serializable> implements Serializable {
    String errorMessage
    boolean isDeleted
    boolean isError
    T wrapped
    @Override
    String toString() {
      """Wrapper(${wrapped}), isDeleted=${isDeleted}, isError=${isError}
"""
    }
}
