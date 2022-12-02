package bridge

class RacingGame (private val carList : List<Car>, private val tryCount : Int) {

    fun loopRacingGame() {
        PrintForm().noticePlayResultMention()
        for(i in 0 until tryCount) {
            //각 게임의 매 회차
            loopForEachCars()
        }
    }

    private fun loopForEachCars() {
        for(i in carList.indices) {
            //매 회차 자동차별로 동작
        }
    }
}