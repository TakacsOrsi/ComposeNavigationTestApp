package com.example.navigationtestapp.navigation

sealed class Screens(val route: String) {
    object HomeScreen : Screens(route = "home_screen")
    object OtherScren : Screens(route = "other_screen")
}