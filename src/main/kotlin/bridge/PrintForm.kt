package bridge

class PrintForm {

    fun noticeInputCarName() {
        println("경주할 자동차 이름을 입력하세요.(이름은 쉽표(,) 기준으로 구분)")
    }

    fun noticeInputHaveError() {
        println("[ERROR] 입력값은 1~5자리 사이의 문자 혹은 숫자여야 합니다.")
    }

}