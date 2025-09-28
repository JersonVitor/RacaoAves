package br.jerson.racaoaves.domain.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import androidx.room.util.TableInfo
import java.util.Date

@Entity(tableName = "lote")
data class Lote(
    @PrimaryKey(autoGenerate = true) val  id : Int = 0,
    val nome: String,
    val dataCompra: Date,
    val qtdAvesInicial:Int,
    val qtdAvesFinal:Int,
    val faseAtual: String
)


@Entity(tableName = "lote_uniao",
    foreignKeys = [ForeignKey(entity = Lote::class, parentColumns = arrayOf("id"), childColumns = arrayOf("lotePrincipal", "loteUnido"))])
data class LoteUniao(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val lotePrincipalId: Int,
    val loteUnidoId: Int,
    val dataUniao: Int,
    val status: String
)