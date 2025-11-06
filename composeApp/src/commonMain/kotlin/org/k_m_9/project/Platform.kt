package org.k_m_9.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform