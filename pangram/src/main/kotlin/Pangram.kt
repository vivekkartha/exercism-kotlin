class Pangram {
    companion object{
        fun isPangram(s : String) = ('a'..'z').all{ s.toLowerCase().contains(it) } 
    }
}