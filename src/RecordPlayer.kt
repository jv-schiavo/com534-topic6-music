class RecordPlayer {
    fun play(music: Music) {

        println("Total playing time: ${music.getPlayingTime()}")

        println("Track list:")
        music.getAllSongs().forEach { song ->
            println(" - ${song.title} by ${song.artist} (${song.playingTime} min")
        }
        println()

    }
}