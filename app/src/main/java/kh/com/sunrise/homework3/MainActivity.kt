package kh.com.sunrise.homework3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var edtUsername: EditText = findViewById(R.id.edt_username)
        val edtPassword: EditText = findViewById(R.id.edt_password)
        val btnLogin: Button = findViewById(R.id.button)
        btnLogin.setOnClickListener {
            val username = edtUsername.text
            val password = edtPassword.text
            if (username.toString() == "phirum" && password.toString() == "123456789") {
                Toast.makeText(it.context, "Login success", Toast.LENGTH_SHORT).show()
            } else
                Toast.makeText(it.context, "Login failed", Toast.LENGTH_SHORT).show()
        }
    }
}