package com.nytimes.inversion

import com.nytimes.inversion.internal.InversionDelegates
import com.nytimes.inversioncodgen.cases.generateDef.MyInterface
import com.nytimes.inversioncodgen.cases.generateDef.MyInterface_Factory
import java.util.ServiceLoader
import kotlin.jvm.JvmName
import kotlin.reflect.KClass

@JvmName("factory_com_nytimes_inversioncodgen_cases_generateDef_MyInterface")
fun Inversion.of(c: KClass<MyInterface>) =
    InversionDelegates.delegate(ServiceLoader.load(MyInterface_Factory::class.java,
    MyInterface_Factory::class.java.classLoader).iterator().next())
