package bridge

class RacingGame(private val carList: List<Car>, private val tryCount: Int) {

    fun loopRacingGame() {
        PrintForm().noticePlayResultMention()
        for (i in 0 until tryCount) {
            //각 게임의 매 회차
            loopForEachCars()
            PrintForm().noticePlayResult(carList)
        }
        printWinner()
    }

    private fun loopForEachCars() {
        for (i in carList.indices) {
            if (ReturnRandom().returnRandom() in 4..9) {
                carList[i].position++
            }
        }
    }

    private fun printWinner() {
        checkWhoIsWinner()
    }

    private fun checkWhoIsWinner() {
        val maxLength = carList.maxWithOrNull(Comparator.comparingInt { it.position })?.position
    }
}