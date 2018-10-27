class Year(private var yr : Int) {
    val isLeap = (yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0)
}
