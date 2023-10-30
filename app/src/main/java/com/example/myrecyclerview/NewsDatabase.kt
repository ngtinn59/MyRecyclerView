package com.example.myrecyclerview

import androidx.room.*

@Database(entities = [NewsEntity::class], version = 1)
abstract class NewsDatabase : RoomDatabase(){
    abstract fun doa():NewsDao
}
