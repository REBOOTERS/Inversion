package com.nytimes.inversioncodgen.cases.generateImplBasedOnProvider

import com.nytimes.inversion.Inversion
import com.nytimes.inversion.InversionDef
import com.nytimes.inversion.of
import com.nytimes.inversioncodgen.cases.generateDef.MyInterface

interface MyInterface {
    fun doSomething()

    companion object {
        @get:InversionDef
        val factory by Inversion.of(MyInterface::class)
    }
}