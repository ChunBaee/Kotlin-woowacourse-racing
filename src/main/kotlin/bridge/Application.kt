package bridge

fun main() {
    startRacingGame()
}

private fun startRacingGame() {
    val userCarList = convertUserListToCar(UserInput().racingCarName())
    val tryCount = UserInput().tryCount()

    RacingGame(userCarList,tryCount)
}

private fun convertUserListToCar(userList : List<String>) : List<Car>{
    val carList = mutableListOf<Car>()
    userList.forEach { name ->
        carList.add(Car(name, 0))
    }
    return carList
}

