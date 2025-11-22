class Album(val songs: List<Song>): Music {
    // Sum playing time of all songs on the album
    override fun getPlayingTime(): Double {
        return songs.sumOf { it.playingTime }
    }
    // All songs already stored in the album
    override fun getAllSongs(): List<Song> {
        return songs
    }
}
