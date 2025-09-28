package br.jerson.racaoaves.domain.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.Date


@Entity(tableName = "perda",
    foreignKeys = [
        ForeignKey(
            entity = Lote::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("loteId")
    )])
data class Perda(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val loteId: Int,
    val data: Date,
    val qtdPerdida: Int,
    val qtdRestante:Int,
    val idadeAves: Int
)
