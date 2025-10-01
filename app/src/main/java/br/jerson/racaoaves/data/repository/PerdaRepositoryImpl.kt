package br.jerson.racaoaves.data.repository

import br.jerson.racaoaves.data.database.dao.PerdaDao
import br.jerson.racaoaves.domain.model.Perda
import br.jerson.racaoaves.domain.repository.PerdaRepository
import kotlinx.coroutines.flow.Flow

class PerdaRepositoryImpl(
    private val perdaDao : PerdaDao
): PerdaRepository {
    override suspend fun insertPerda(perda: Perda) {
        perdaDao.insertPerda(perda)
    }

    override suspend fun updatePerda(perda: Perda) {
        perdaDao.updatePerda(perda)
    }

    override suspend fun deletePerda(perda: Perda) {
        perdaDao.deletePerda(perda)
    }

    override fun getPerdaByLoteId(loteId: Int): Flow<List<Perda>> {
        return perdaDao.getPerdaByLoteId(loteId)
    }

}