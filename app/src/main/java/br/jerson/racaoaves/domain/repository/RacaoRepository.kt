package br.jerson.racaoaves.domain.repository

import br.jerson.racaoaves.domain.model.Racao
import kotlinx.coroutines.flow.Flow

interface RacaoRepository {

    suspend fun insertRacao(racao: Racao)
    suspend fun updateRacao(racao: Racao)
    suspend fun deleteRacao(racao: Racao)
    fun getRacaoByLoteId(loteId: Int): Flow<List<Racao>>
}