package ch4.section5_collection_api

import com.google.gson.Gson
import java.io.File

data class Data(val id: Int, val name: String, val addr: String, val age: String)

fun main() {
    val file = File("build/resources/main/test.json")
    val inputStream = file.inputStream()
    val inputString = inputStream.bufferedReader().use {it.readText()}

    val gson = Gson()
    val list: List<Data> = gson.fromJson(inputString, Array<Data>::class.java).toList()
    list.filter { it.addr.equals("seoul") }
        .groupBy { it.age }
        .forEach {
            println("${it.key} - ${it.value.count()}명")
            it.value.forEach {
                println("${it.name} ${it.addr} ${it.age}")
            }
        }
}