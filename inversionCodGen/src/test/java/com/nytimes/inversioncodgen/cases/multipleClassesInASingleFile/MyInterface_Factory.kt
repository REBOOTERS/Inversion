package com.nytimes.inversioncodgen.cases.multipleClassesInASingleFile

import com.nytimes.inversion.InversionValidator

interface MyInterface_Factory : () -> MyInterface

class MyInterface_FactoryValidator : InversionValidator {
  override fun getFactoryClass() = MyInterface_Factory::class
}