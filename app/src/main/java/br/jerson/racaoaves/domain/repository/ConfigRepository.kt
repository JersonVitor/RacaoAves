package br.jerson.racaoaves.domain.repository

import kotlinx.coroutines.flow.Flow

interface ConfigRepository {
    val consumoInicial: Flow<Int>
    val consumoCrescimento: Flow<Int>
    val consumoFinal: Flow<Int>
    val idadeInicialCrescimento: Flow<Int>
    val idadeInicialTermino: Flow<Int>
    suspend fun setConsumoInicial(consumo: Int)
    suspend fun setConsumoCrescimento(consumo: Int)
    suspend fun setConsumoFinal(consumo: Int)
    suspend fun setIdadeInicialCrescimento(consumo: Int)
    suspend fun setIdadeInicialFinal(consumo: Int)

}