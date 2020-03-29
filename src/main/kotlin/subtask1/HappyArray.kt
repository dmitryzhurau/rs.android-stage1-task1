package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        val happyList = sadArray.toMutableList()
        var i = 1
        while (i < happyList.size - 1) {
            if ( i != 0 && happyList[i] > happyList[i + 1] + happyList[i - 1]) {
                happyList.removeAt(i)
                i --
            } else {
                i ++
            }
        }
        return happyList.toIntArray()
    }
}
