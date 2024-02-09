package com.example.tinkofflabproject.net

import com.example.tinkofflabproject.data.entities.Movie
import com.example.tinkofflabproject.data.entities.MovieCredits
import com.example.tinkofflabproject.data.entities.MoviesPage
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieApi {
    @GET("movie/popular")
    suspend fun getPopularMoviesPage(
        @Query("") pageNum : Int
    ) : MoviesPage

    @GET("")
    suspend fun getMovie(
        @Path("id") id : Long
    ) : Movie

    @GET("")
    suspend fun getMovieCredits(
        @Path("id") id : Long
    ) : MovieCredits
}