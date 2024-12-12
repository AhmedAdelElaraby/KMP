package com.workdev.learning

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform