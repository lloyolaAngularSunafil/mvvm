package com.example.examplemvvm.model

class QuoteProvider {
    companion object{
        fun random():QuoteModel{
            val position = (0..14).random()
            return quote[position]
        }

     private val quote = listOf<QuoteModel>(
            QuoteModel("Ejemplo", "AristidesDevs"),
            QuoteModel("Ejemplo2", "AristidesDevs2"),
            QuoteModel("Ejemplo3", "AristidesDevs3"),
            QuoteModel("Ejemplo4", "AristidesDevs4"),
            QuoteModel("Ejemplo5", "AristidesDevs5"),
            QuoteModel("Ejemplo6", "AristidesDevs6"),
            QuoteModel("Ejemplo7", "AristidesDevs7"),
            QuoteModel("Ejemplo8", "AristidesDevs8"),
            QuoteModel("Ejemplo9", "AristidesDevs99999999"),
            QuoteModel("Ejemplo1010101010101010", "AristidesDevs10101010101010"),
            QuoteModel("Ejemplo11", "AristidesDevs11"),
            QuoteModel("Ejemplo12", "AristidesDevs12"),
            QuoteModel("Ejemplo13", "AristidesDevs13"),
            QuoteModel("Ejemplo14", "AristidesDevs14"),
            QuoteModel("Ejemplo15", "AristidesDevs15")
        )
    }

}