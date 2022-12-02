package bridge

import camp.nextstep.edu.missionutils.Randoms

class ReturnRandom {
    fun returnRandom() : Int {
        return Randoms.pickNumberInRange(0, 9)
    }
}