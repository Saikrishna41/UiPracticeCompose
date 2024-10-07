package com.task.uipracticecompose

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _searchWidgetState: MutableState<SearchWidgetState> =
        mutableStateOf(value = SearchWidgetState.CLOSE)

    val searchWidgetState: State<SearchWidgetState>
        get() = _searchWidgetState

    private val _searchTextState: MutableState<String> = mutableStateOf(value = "")

    val searchTextState: State<String> = _searchTextState

    fun updateSearchWidgetState(state: SearchWidgetState) {
        _searchWidgetState.value = state
    }

    fun updateSearchTextState(state: String) {
        _searchTextState.value = state
    }
}