package ch3.section9_object

interface DataHandler {
    fun handleData(data: String)
    fun canProcess(dataType: String): Boolean
}



class DataProcessor(private val name: String, private var isActive: Boolean = true) {
    companion object {
        const val MAX_BATCH_SIZE: Int = 100
        private var processedCount: Int = 0

        fun getProcessedCount(): Int = processedCount
        fun resetCounter() { println("resetCounter()") }
    }

    fun processData(data: String, dataType: String) {
        val handler: DataHandler = object: DataHandler {
            override fun handleData(data: String) {
                println("handleData() call")
            }

            override fun canProcess(dataType: String): Boolean = true
        }

        if (handler.canProcess(dataType)) handler.handleData(data)
    }
}

fun main() {
    val processor1 = DataProcessor("TextProcessor")
    processor1.processData("Hello, World!", "text")

    DataProcessor.getProcessedCount()
    DataProcessor.resetCounter()
}