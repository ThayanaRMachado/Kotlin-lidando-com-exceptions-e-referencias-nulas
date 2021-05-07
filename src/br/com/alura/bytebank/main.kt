package br.com.alura.bytebank

import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaComportamentosConta
import java.lang.ArithmeticException
import java.lang.Exception

fun main() {
    var enderecoNulo: Endereco? = null
    val enderecoNoaNulo: Endereco = enderecoNulo!!
    enderecoNoaNulo.logradouro
}