package main.java.validator.impl.validators

import main.java.validator.Validator
import main.java.validator.impl.functions.EmptyValidateFunction

class CityValidator(text: String? = "") : Validator {
    override val validateFunctions = listOf(EmptyValidateFunction(text))
}
