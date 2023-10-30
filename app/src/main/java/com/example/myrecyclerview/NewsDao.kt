package com.example.myrecyclerview

import androidx.room.*
import com.example.myrecyclerview.Constants.NEWS_TABLE

@Dao
interface NewsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNews(newsEntity: NewsEntity)

    @Update
    fun updateNews(newsEntity: NewsEntity)

    @Delete
    fun deleteNews(newsEntity: NewsEntity)

    @Query("SELECT * FROM $NEWS_TABLE ORDER BY newsId DESC")
    fun getAllNews() : MutableList<NewsEntity>

    @Query("SELECT * FROM $NEWS_TABLE WHERE newsId LIKE :id")
    fun getNews(id : Int) : NewsEntity

}