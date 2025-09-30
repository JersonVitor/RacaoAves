package br.jerson.racaoaves.data.config

import android.content.Context
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.preferencesDataStore


val Context.configDataStore by preferencesDataStore(
    name = "config"
)

object Configuracao{
    val CONSUMO_INICIAL = intPreferencesKey("consumo_inicial")
    val CONSUMO_CRESCIMENTO = intPreferencesKey("consumo_crescimento")
    val CONSUMO_FINAL = intPreferencesKey("consumo_final")
    val IDADE_INICIO_CRESCIMENTO = intPreferencesKey("idade_inicio_cres")
    val IDADE_INICIO_TERMINACAO = intPreferencesKey("idade_inicio_term")
}