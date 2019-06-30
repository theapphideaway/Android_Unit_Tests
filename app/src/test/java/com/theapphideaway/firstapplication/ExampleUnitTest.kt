package com.theapphideaway.firstapplication

import io.mockk.coEvery
import io.mockk.every
import io.mockk.mockk
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private val vm = MyViewModel()
    private val webService = WebService()


    @Test
    fun `when opening the app it should recieve data from the api`(){
        val items : List<ToDoResponse> = listOf(
            ToDoResponse(true, 1,"delectus aut autm", 111)
        )
        vm.getTodoItems()
        vm.liveDataItem.observeForever{
            assertEquals(items, it)
        }
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


}
