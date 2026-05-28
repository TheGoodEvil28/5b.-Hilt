package com.mylab.myapplication.data

import kotlin.random.Random

class RandomNumberRepository : NumberRepository {
    // Big positive/negative range (adjust as needed)
    override fun getNumber(): Int = Random.nextInt(from = -1_000_000_000, until = 1_000_000_001)
}
