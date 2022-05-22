package com.example.textvalidator

import android.content.Context
import android.text.InputType
import android.util.Patterns
import android.widget.EditText
import android.widget.Toast

object MediaPlayerr {
    fun UserId(context: Context, message:String, editText: EditText){
        if (message.length >= 5) {
            if (message.isNotEmpty()){
                Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
            }else{
                editText.setError("Field must not be empty")
            }

        }else{
            editText.setError("There must be at least 5 letters and signs")
        }
    }




    fun Password(context: Context, message:String, editText: EditText){
        if (message.length >= 5) {
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
            if (message.any { it in "!,+^" }){
                Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
            }else{
                editText.setError("Add these signms -> !,+^")

            }
        }else{
            editText.setError("There must be at least 8 letters and signs")
        }
    }


    fun ReEnterPassword(context: Context, message:String, message2:String, editText: EditText){
        if (message == message2) {
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
        }else{
            editText.setError("Password is not the same")
        }
    }


    fun FirstName(context: Context, message:String, editText: EditText){
        if (message.isNotEmpty()){
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
        }else{
            editText.setError("Field must not be empty")
        }
    }


    fun LastName(context: Context, message:String, editText: EditText){
        if (message.isNotEmpty()){
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
        }else{
            editText.setError("Field must not be empty")
        }
    }

    fun CharSequence?.isValidEmail() = !isNullOrEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()

    fun EmailAdress(context: Context, message:String, editText: EditText){
        if (message.isNotEmpty() || Patterns.EMAIL_ADDRESS.matcher(message).matches()){
            if (message.isEmpty()){
                Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
            }else{
                editText.setError("Wrong e-mail")
            }
        }else{
            editText.setError("Field must not be empty")
        }
    }



    fun IpAddaress(context: Context, message:String, editText: EditText){
        if (message.isNotEmpty() || Patterns.IP_ADDRESS.matcher(message).matches()){
            if (message.isEmpty()){
                Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
            }else{
                editText.setError("Wrong IP Address")
            }
        }else{
            editText.setError("Field must not be empty")
        }
    }


    fun PhoneNumber(context: Context, message:String, editText: EditText){
        if (message.isNotEmpty() || editText.inputType == InputType.TYPE_CLASS_NUMBER){
            if (message.length >= 12){
                Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
            }else{
                editText.setError("Wrong phone number")
            }
        }else{
            editText.setError("Field must not be empty")
        }
    }


    fun ZipCode(context: Context, message:String, editText: EditText){
        if (message.length >= 5) {
            if (message.isNotEmpty()){
                Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
            }else{
                editText.setError("Field must not be empty")
            }

        }else{
            editText.setError("There must be at least 5 letters and signs")
        }
    }

    fun Year(context: Context, message:String, editText: EditText){
        if (editText.inputType == InputType.TYPE_CLASS_NUMBER) {
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
        }else{
            editText.setError("There must be 4 numbers")
        }
    }

}