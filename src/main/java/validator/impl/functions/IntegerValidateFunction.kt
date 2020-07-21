package main.java.validator.impl.functions

import main.java.INVALID_INTEGER
import main.java.validator.ValidateFunction

class IntegerValidateFunction(private val text: String?) : ValidateFunction {
    override val invalidMessage = INVALID_INTEGER
    override fun isValid() =  if (text.isNullOrEmpty()) {
                false
            } else {
                try {
                    text!!.toInt()
                    true
                }catch (ex:Exception){
                    false
                }
            }
}