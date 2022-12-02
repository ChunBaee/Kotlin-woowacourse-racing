package bridge

import camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest
import camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest
import camp.nextstep.edu.missionutils.test.NsTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import javax.swing.JOptionPane


class ApplicationTest : NsTest() {
    private val MOVING_FORWARD = 4
    private val STOP = 3
    private val ERROR_MESSAGE = "[ERROR]"

    @Test
    fun 전진_정지() {
        assertRandomNumberInRangeTest(
            {
                run("pobi,woni", "1");
                assertThat(output()).contains("pobi : -", "woni : ", "최종 우승자 : pobi");
            },
            MOVING_FORWARD, STOP
        )
    }

    @Test
    fun 이름에_대한_예외_처리() {
        assertSimpleTest {
            runException("pobi,javaji")
            assertThat(output()).contains(ERROR_MESSAGE)
        }
    }


    override fun runMain() {
        main()
    }

    companion object {
        private const val ERROR_MESSAGE = "[ERROR]"
    }
}
