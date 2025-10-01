package br.jerson.racaoaves.data.database.converter

import androidx.room.TypeConverter
import java.util.Date

class Converters {
    @TypeConverter
    fun timestampToDate(value: Long?):Date?{
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun DateToTimestamp(date: Date?): Long?{
        return date?.time
    }
}