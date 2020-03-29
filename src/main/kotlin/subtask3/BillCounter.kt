package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val annaBill = (bill.sum() - bill[k]) / 2;
        if (annaBill == b) {
            return "Bon Appetit";
        } else {
            return (b - annaBill).toString();
        }
    }
}
