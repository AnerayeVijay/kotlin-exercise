package com.kotlin.collection.list



fun getEvenNumber(intList: List<Int>) : List<Int> {
    return intList.filter { x -> x%2==0 }
}

