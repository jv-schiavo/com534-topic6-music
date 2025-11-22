fun main() {
    // create some sample songs

    val s1 = Song("Track One", "Artist A", 3.5)
    val s2 = Song("Track Two", "Artist B", 4.1)
    val s3 = Song("Track Three", "Artist A", 2.9)
    val s4 = Song("Track Four", "Artist C", 3.5)

    // create a single containing 2 songs
    val single = Single(s1, s2)

    // create an album containing the songs
    val album = Album(listOf(s2,s3, s4))

    // List of Music - contains both Single and Album
    val library: List<Music> = listOf(single, album)

    library.forEach { item ->
        println("\nTotal playing time: ${item.getPlayingTime()} minutes")
        println("Songs:")
        item.getAllSongs().forEach { song ->
            println(" - ${song.title} by ${song.artist}")
        }
    }


}