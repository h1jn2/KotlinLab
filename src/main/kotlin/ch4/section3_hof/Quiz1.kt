package ch4.section3_hof

class DataLoader {
    fun loadData(
        url: String,
        onSuccess: (List<String>) -> Unit,
        onError: (Exception) -> Unit
    ) {
        try {
            val result = MutableList(0, { "" })
            result.add("hello")
            result.add("world")
            onSuccess(result)
        } catch (e: Exception) {
            onError(e)
        }
    }
}

fun main() {
    val loader = DataLoader()
    loader.loadData(
        "http://www.naver.com",
        { data ->
            println("success")
        },
        { e ->
            println("error")
        }
    )

}