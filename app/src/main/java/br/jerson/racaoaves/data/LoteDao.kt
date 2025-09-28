package br.jerson.racaoaves.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface LoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public fun insertLote()
}