object Acronym{
    fun generate(s: String) =
        s.toUpperCase().split(Regex("""[^\w]+""")).fold(""){acronym,e -> acronym+e[0]}
}