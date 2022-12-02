package bridge

fun main() {
    startRacingGame()
}

private fun startRacingGame() {
    val userCarLit = convertUserListToCar(UserInput().racingCarName())
    val tryCount = UserInput().tryCount()
}

private fun convertUserListToCar(userList : List<String>) : List<Car>{
    val carList = mutableListOf<Car>()
    userList.forEach { name ->
        carList.add(Car(name, 0))
    }
    return carList
}

