package main.java.validator.impl.functions

import main.java.EMPTY_INPUT_STRING
import main.java.validator.ValidateFunction

class EmptyValidateFunction(private val text: String?) : ValidateFunction {
    override val invalidMessage = EMPTY_INPUT_STRING
    override fun isValid() =!text.isNullOrEmpty()
}