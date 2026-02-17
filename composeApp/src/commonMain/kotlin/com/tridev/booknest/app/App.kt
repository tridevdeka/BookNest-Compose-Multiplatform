package com.tridev.booknest.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tridev.booknest.book.presentation.book_list.BookListScreenRoot
import com.tridev.booknest.book.presentation.book_list.BookListViewModel

@Composable
@Preview
fun App() {

    BookListScreenRoot(
        viewModel = remember { BookListViewModel() },
        onBookClick = {

        },
        modifier = Modifier.fillMaxSize()
    )
}