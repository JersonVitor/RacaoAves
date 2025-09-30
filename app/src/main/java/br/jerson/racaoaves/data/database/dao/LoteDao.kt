package br.jerson.racaoaves.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import br.jerson.racaoaves.domain.model.Lote
import kotlinx.coroutines.flow.Flow

@Dao
interface LoteDao {
    @Insert(onConflict = OnConflictStrategy.Companion.REPLACE)
    suspend fun insertLote(lote: Lote)

    @Update
    suspend fun updateLote(lote: Lote)

    @Delete
    suspend fun deleteLote(lote: Lote)

    @Query("SELECT * FROM lote WHERE id = :id")
     fun getLoteById(id: Int): Flow<Lote>

}