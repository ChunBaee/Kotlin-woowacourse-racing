package bridge

class Regex {

    fun checkUserInputCarName(userInput: String): Boolean {
        val carNameList = userInput.split(",")
        return try {
            tryCarNameRegex(carNameList)
            true
        } catch (exception : IllegalArgumentException) {
            PrintForm().noticeInputHaveError()
            false
        }
    }

    private fun tryCarNameRegex(carNameList : List<String>) {
        carNameList.forEach { carName ->
            checkEachCarNameLength(carName)
        }
    }

    private fun checkEachCarNameLength(carName: String): Boolean {
        return carName.length in 1..5
    }
}