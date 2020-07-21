package main.java.validator.impl.validators

import main.java.validator.Validator
import main.java.validator.impl.functions.IntegerValidateFunction

class DegreeValidator(text: String? = "") : Validator {
    override val validateFunctions = listOf(IntegerValidateFunction(text))
}
