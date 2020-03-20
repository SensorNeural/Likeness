package com.vladzkv.likeness.domain

/**
 * File for extensions functions
 */

fun <T> MutableCollection<T>.addAllAndClear(newValues: Collection<T>) {
    clear()
    addAll(newValues)
}