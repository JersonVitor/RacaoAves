package br.jerson.racaoaves.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import br.jerson.racaoaves.domain.model.Racao
import kotlinx.coroutines.flow.Flow

@Dao
interface RacaoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRacao(racao:Racao)
    @Update
    suspend fun updateRacao(racao: Racao)
    @Delete
    suspend fun deleteRacao(racao: Racao)
    @Query("SELECT * FROM racao WHERE loteId = :loteId ORDER BY dataCompra DESC")
    fun getRacaoByLoteId(loteId:Int): Flow<List<Racao>>
}