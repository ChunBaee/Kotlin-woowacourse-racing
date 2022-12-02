package bridge

import java.util.regex.Pattern

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
            if(!checkEachCarNameLength(carName)) throw IllegalArgumentException()
        }
    }

    private fun checkEachCarNameLength(carName: String): Boolean {
        return carName.length in 1..5
    }

    fun checkUserInputTryCount(userInput : String) : Boolean {
        return try {
            tryRetryCountRegex(userInput)
            true
        } catch (exception : IllegalArgumentException) {
            PrintForm().noticeInputTryCountMustBeNumber()
            false
        }
    }

    private fun tryRetryCountRegex(userInput : String) {
        if(!Pattern.matches("^[1-9]*$", userInput)) throw IllegalArgumentException()
    }
}