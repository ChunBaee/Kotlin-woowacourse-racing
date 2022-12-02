package bridge

class Regex {

    fun checkUserInputCarName(userInput: String) {
        val carNameList = userInput.split(",")
        carNameList.forEach { carName ->
            checkEachCarNameLength(carName)
        }
    }

    private fun checkEachCarNameLength(carName: String): Boolean {
        return carName.length in 1..5
    }
}