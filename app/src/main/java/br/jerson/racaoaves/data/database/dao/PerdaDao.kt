package br.jerson.racaoaves.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import br.jerson.racaoaves.domain.model.Perda
import kotlinx.coroutines.flow.Flow


@Dao
interface PerdaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPerda(perda: Perda)

    @Update
    suspend fun updatePerda(perda: Perda)

    @Delete
    suspend fun deletePerda(perda: Perda)

    @Query("SELECT * FROM perda WHERE loteId = :loteId ORDER BY data DESC")
    fun getPerdaByLoteId(loteId: Int):Flow<List<Perda>>
}