package br.jerson.racaoaves.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import br.jerson.racaoaves.data.database.dao.LoteDao
import br.jerson.racaoaves.data.database.dao.PerdaDao
import br.jerson.racaoaves.data.database.dao.RacaoDao
import br.jerson.racaoaves.domain.model.Perda
import br.jerson.racaoaves.domain.model.Racao
import br.jerson.racaoaves.domain.model.Lote

@Database(entities = [Lote::class, Racao::class, Perda::class], version = 1, exportSchema = false)
abstract class DBDatabase: RoomDatabase() {
    abstract fun loteDao(): LoteDao
    abstract fun racaoDao(): RacaoDao
    abstract fun perdaDao(): PerdaDao

}