object Pangram {
    fun isPangram(s : String) = ('a'..'z').all{ s.toLowerCase().contains(it) }
}