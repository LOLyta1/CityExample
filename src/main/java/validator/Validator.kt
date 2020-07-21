package main.java.validator


interface Validator {
    val validateFunctions: List<ValidateFunction>

    fun check(): Boolean {
        var isValid = true
        validateFunctions.forEach {
            if (!it.isValid()) {
                isValid = false
                println(it.invalidMessage)
            }
        }
        return isValid
    }
}