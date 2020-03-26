package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        var min: Int = input[0]
        var max: Int = input[0]
        var sum: Int = 0

        for (element in input) {
            if (element < min) {
                min = element
            }
            if (element >max) {
                max = element
            }
            sum += element

        }
        return intArrayOf(sum - max, sum - min)
    }
}
