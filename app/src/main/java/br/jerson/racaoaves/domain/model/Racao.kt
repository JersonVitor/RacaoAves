package br.jerson.racaoaves.domain.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.Date

@Entity(
    tableName = "racao",
    foreignKeys = [ForeignKey(
        entity = Lote::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("loteId")
    )]
)
data class Racao(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val loteId: Int,
    val tipo: String,
    val qtdKg: Double,
    val dataCompra: Date,
    val qtdRestante:Double
    )