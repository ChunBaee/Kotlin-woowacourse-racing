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
}