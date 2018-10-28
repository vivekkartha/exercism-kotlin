object Hamming {
        fun compute(s1 : String,s2 : String) = s1.zip(s2).count{ it.first != it.second }
}