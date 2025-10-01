package br.jerson.racaoaves.data.repository

import br.jerson.racaoaves.data.database.dao.LoteDao
import br.jerson.racaoaves.domain.model.Lote
import br.jerson.racaoaves.domain.repository.LoteRepository
import kotlinx.coroutines.flow.Flow

class LoteRepositoryImpl(
   private val loteDao: LoteDao
): LoteRepository{
    override suspend fun insertLote(lote: Lote) {
        loteDao.insertLote(lote)
    }

    override suspend fun updateLote(lote: Lote) {
        loteDao.updateLote(lote)
    }

    override suspend fun deleteLote(lote: Lote) {
        loteDao.deleteLote(lote)
    }

    override fun getLoteById(id: Int): Flow<Lote> {
        return loteDao.getLoteById(id)
    }
}