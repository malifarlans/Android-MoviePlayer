package mali.system.moviemovie.ui.favorite

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import mali.system.moviemovie.data.local.FavoriteMovieRepository

class FavoriteViewModel @ViewModelInject constructor(
    private val repository: FavoriteMovieRepository
): ViewModel(){
    val movies = repository.getFavoriteMovies()
}