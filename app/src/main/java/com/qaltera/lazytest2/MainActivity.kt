package com.qaltera.lazytest2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {

    @ExperimentalStdlibApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            runTest()
        }
    }
}

@Composable
fun runTest() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {
        items(count = 35) { rowIndex ->
            LazyRow {
                items(count = 10) { colIndex ->
                    Text(text = "|       \n|       " +
                        "\n$rowIndex $colIndex  ")
                }
            }
        }
    }
}