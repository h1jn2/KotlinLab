package ch3.section8_sealed

sealed class Result {
    data class Success(val data: String): Result()
    data class Error(val msg: String): Result()
}

data class Warning(val msg: String): Result()
// 새로운 sealed type 이 추가되면 when 구문을 사용했던 모든 곳이 에러
// when 에서 모든 sealed 타입의 조건을 걸어줘야 함
data class Loading(val msg: String): Result()

fun handleResult(result: Result) = when(result) {
    is Result.Success -> println("success")
    is Result.Error -> println("error")
    is Warning -> println("warning")
    is Loading -> println("Loading")
}