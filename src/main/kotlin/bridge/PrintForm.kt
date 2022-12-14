package bridge

class PrintForm {

    fun noticeInputCarName() {
        println("경주할 자동차 이름을 입력하세요.(이름은 쉽표(,) 기준으로 구분)")
    }

    fun noticeInputHaveError() {
        println("[ERROR] 입력값은 1~5자리 사이의 문자 혹은 숫자여야 합니다.")
    }

    fun noticeInputTryCount() {
        println("시도할 회수는 몇회인가요?")
    }

    fun noticeInputTryCountMustBeNumber() {
        println("시도할 횟수는 숫자로 구성되어야 합니다.")
    }

    fun noticePlayResultMention() {
        println("실행 결과")
    }

    fun noticePlayResult(list : List<Car>) {
        for(i in list.indices) {
            println("${list[i].name} : ${convertNumberToBar(list[i].position)}")
        }
        println("")
    }

    private fun convertNumberToBar(count : Int) : String {
        var bars = ""
        for(i in 0 until count) {
            bars += "-"
        }
        return bars
    }

    fun noticeWinner(winnerList : List<String>) {
        println("최종 우승자 : ${convertListToString(winnerList)}")
    }

    private fun convertListToString(winnerList: List<String>) : String {
        return winnerList.toString().replace("[","").replace("]","")
    }

}