package bridge

import camp.nextstep.edu.missionutils.Console

class UserInput {

    fun racingCarName(): List<String> {
        var isInputCorrect = false
        var userInput = ""
        while (!isInputCorrect) {
            PrintForm().noticeInputCarName()
            userInput = Console.readLine()
            isInputCorrect = Regex().checkUserInputCarName(userInput)
        }
        return convertStringToList(userInput)
    }

    private fun convertStringToList(input: String): List<String> {
        return input.split(",").filter { it != "" }
    }

    fun tryCount(): Int {
        var isInputCorrect = false
        var input = ""
        while(!isInputCorrect) {
            PrintForm().noticeInputTryCount()
            input = Console.readLine()
            isInputCorrect = Regex().checkUserInputTryCount(input)
        }
        return convertStringToInt(input)
    }

    private fun convertStringToInt(input : String) : Int {
        return input.toInt()
    }
}