package br.jerson.racaoaves.data.repository

import android.content.Context
import androidx.datastore.preferences.core.edit
import br.jerson.racaoaves.data.config.Configuracao
import br.jerson.racaoaves.data.config.configDataStore
import br.jerson.racaoaves.domain.repository.ConfigRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class ConfigRepositoryImpl(
    private val context: Context
): ConfigRepository {
    override val consumoInicial :Flow<Int> = context.configDataStore.data.map {
        it[Configuracao.CONSUMO_INICIAL] ?: 20
    }
    override val consumoCrescimento: Flow<Int> = context.configDataStore.data.map {
        it[Configuracao.CONSUMO_CRESCIMENTO]?: 40
    }
    override val consumoFinal: Flow<Int> = context.configDataStore.data.map {
        it[Configuracao.CONSUMO_FINAL]?: 60
    }
    override val idadeInicialCrescimento: Flow<Int> = context.configDataStore.data.map {
        it[Configuracao.IDADE_INICIO_CRESCIMENTO] ?: 21
    }
    override val idadeInicialTermino: Flow<Int> = context.configDataStore.data.map {
        it[Configuracao.IDADE_INICIO_TERMINACAO] ?: 40
    }

    override suspend fun setConsumoInicial(consumo: Int) {
        context.configDataStore.edit {
            it[Configuracao.CONSUMO_INICIAL] = consumo

        }
    }
    override suspend fun setConsumoCrescimento(consumo: Int){
        context.configDataStore.edit {
            it[Configuracao.CONSUMO_CRESCIMENTO] = consumo
        }
    }
    override suspend fun setConsumoFinal(consumo: Int){
        context.configDataStore.edit {
            it[Configuracao.CONSUMO_FINAL] = consumo
        }
    }
    override suspend fun setIdadeInicialCrescimento(consumo: Int){
        context.configDataStore.edit {
            it[Configuracao.IDADE_INICIO_CRESCIMENTO] = consumo
        }
    }
    override suspend fun setIdadeInicialFinal(consumo: Int){
        context.configDataStore.edit {
            it[Configuracao.IDADE_INICIO_TERMINACAO] = consumo
        }
    }

}
