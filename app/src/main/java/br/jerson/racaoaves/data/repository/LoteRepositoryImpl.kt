package br.jerson.racaoaves.data.repository

import br.jerson.racaoaves.domain.model.Lote
import br.jerson.racaoaves.domain.repository.LoteRepository
import kotlinx.coroutines.flow.Flow

class LoteRepositoryImpl(): LoteRepository{
    override suspend fun insertLote(lote: Lote) {
        TODO("Not yet implemented")
    }

    override suspend fun updateLote(lote: Lote) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteLote(lote: Lote) {
        TODO("Not yet implemented")
    }

    override fun getLoteById(id: Int): Flow<Lote> {
        TODO("Not yet implemented")
    }
}