package br.jerson.racaoaves.di

import android.app.Application
import androidx.datastore.preferences.preferencesDataStore
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import android.content.Context
import androidx.room.Room
import br.jerson.racaoaves.data.database.DBDatabase
import br.jerson.racaoaves.data.repository.ConfigRepositoryImpl
import br.jerson.racaoaves.domain.repository.ConfigRepository
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideConfigRepository(@ApplicationContext context: Context): ConfigRepository =
        ConfigRepositoryImpl(context)

    @Provides
    @Singleton
    fun provideDatabase(application: Application): DBDatabase {
        return Room.databaseBuilder(
            context = application,
            DBDatabase::class.java,
            name = "db_racao_aves"
        ).build()
    }

    @Provides
    @Singleton
    fun provideLoteDao(database: DBDatabase) = database.loteDao()

    @Provides
    @Singleton
    fun provideRacaoDao(database:DBDatabase) = database.racaoDao()

    @Provides
    @Singleton
    fun providePerdaDao(database: DBDatabase) = database.perdaDao()
}