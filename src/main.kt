fun main() {
    // create some sample songs

    val s1 = Song("Track One", "Artist A", 3.5)
    val s2 = Song("Track Two", "Artist B", 4.1)
    val s3 = Song("Track Three", "Artist A", 2.9)

    // create an album containing the songs
    val album = Album(listOf(s1,s2,s3))

    // Call the new method to get only songs by Artist A
    val artistASongs = album.filterByArtist("Artist A")

    // Print the titles of the songs returned ( could be empty)
    println("Songs by Artist A:")
    for (song in artistASongs) {
        println("- ${song.title}")
    }
}