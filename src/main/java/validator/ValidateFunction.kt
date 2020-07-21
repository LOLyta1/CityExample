package main.java.validator


interface ValidateFunction {
    val invalidMessage: String
    fun isValid(): Boolean
}
