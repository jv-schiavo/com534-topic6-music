class Album(val songs: List<Song>) {
    // Return a list of songs on this album by the specified artist
    fun filterByArtist(artist: String): List<Song> {
        // Use filter() to keep only songs where song.artist == artist
        return songs.filter{ song -> song.artist == artist}
    }
}