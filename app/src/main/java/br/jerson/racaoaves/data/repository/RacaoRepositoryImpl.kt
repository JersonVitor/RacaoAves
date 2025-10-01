package br.jerson.racaoaves.data.repository

import br.jerson.racaoaves.data.database.dao.RacaoDao
import br.jerson.racaoaves.domain.model.Racao
import br.jerson.racaoaves.domain.repository.RacaoRepository
import kotlinx.coroutines.flow.Flow

class RacaoRepositoryImpl(
    private val racaoDao: RacaoDao
): RacaoRepository {
    override suspend fun insertRacao(racao: Racao) {
        racaoDao.insertRacao(racao)
    }

    override suspend fun updateRacao(racao: Racao) {
        racaoDao.updateRacao(racao)
    }

    override suspend fun deleteRacao(racao: Racao) {
        racaoDao.deleteRacao(racao)
    }

    override fun getRacaoByLoteId(loteId: Int): Flow<List<Racao>> {
        return racaoDao.getRacaoByLoteId(loteId)
    }

}