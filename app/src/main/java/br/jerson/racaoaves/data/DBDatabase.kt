package br.jerson.racaoaves.data

import androidx.room.Database
import br.jerson.racaoaves.domain.model.Perda
import br.jerson.racaoaves.domain.model.Racao
import br.jerson.racaoaves.domain.model.Lote

@Database(entities = arrayOf(Lote::class, Racao::class, Perda::class))