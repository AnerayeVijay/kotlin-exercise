package com.functor

class Functor<T>(val value: T) {
    infix fun <B> map(function: (T) -> B ): Functor<B> {
        return Functor(function(value))
    }

}

sealed class Result<out T> {
    object None : Result<Nothing>()
    data class Some<out T>(val value: T) : Result<T>()


    inline infix fun <B> map(function: (T) -> B): Result<B> = when (this) {
        is None -> this
        is Some -> Some(function(value))
    }
}