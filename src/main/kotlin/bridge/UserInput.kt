package bridge

import camp.nextstep.edu.missionutils.Console

class UserInput {

    fun racingCarName() {
        PrintForm().noticeInputCarName()
        val userInput = Console.readLine()
    }
}