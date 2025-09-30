package br.jerson.racaoaves.domain.repository

import br.jerson.racaoaves.domain.model.Perda
import kotlinx.coroutines.flow.Flow

interface PerdaRepository {

    suspend fun insertPerda(perda: Perda)
    suspend fun updatePerda(perda: Perda)
    suspend fun deletePerda(perda: Perda)
    fun getPerdaByLoteId(loteId: Int): Flow<List<Int>>
}