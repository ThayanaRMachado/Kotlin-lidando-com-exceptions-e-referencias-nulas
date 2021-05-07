package br.com.alura.bytebank

import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaComportamentosConta
import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.IllegalStateException

fun main() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "rua Vergueiro", complemento = "prédio")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }
    teste(1)
    teste("")
}

fun teste(valor: Any){
    val numero: Int? = valor as? Int
}