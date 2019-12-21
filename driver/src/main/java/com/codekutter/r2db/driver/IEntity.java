package com.codekutter.r2db.driver;

import lombok.NonNull;

/**
 * Interface to be implemented for defining entities.
 *
 * @param <K> - Entity Key type.
 */
public interface IEntity<K> {
    /**
     * Get the entity key.
     *
     * @return - entity key
     */
    K getKey();

    /**
     * Copy the entity properties from the specified source.
     *
     * @param source - Source entity to copy from.
     * @return - Copied result.
     * @throws CopyException
     */
    IEntity<K> copy(@NonNull IEntity<K> source) throws CopyException;
}
