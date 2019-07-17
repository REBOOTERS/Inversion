package com.nytimes.libinterface

import com.nytimes.inversion.Inversion
import com.nytimes.inversion.InversionDef
import com.nytimes.inversion.of

interface Container {
    fun <V> getOrCreate(f: () -> V): V
}

interface MyInterface {
    fun doSomething(): String

    companion object {
        @InversionDef
        val factory = Inversion.of(MyInterface::class).factory<Container>()
    }
}