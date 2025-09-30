package br.jerson.racaoaves.domain.repository

import br.jerson.racaoaves.domain.model.Lote
import kotlinx.coroutines.flow.Flow

interface LoteRepository {

    suspend fun insertLote(lote: Lote)
    suspend fun updateLote(lote: Lote)
    suspend fun deleteLote(lote: Lote)
    fun getLoteById(id: Int): Flow<Lote>
}