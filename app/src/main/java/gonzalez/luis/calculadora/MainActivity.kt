package gonzalez.luis.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtAbajo: TextView = findViewById(R.id.txtAbajo)
        val txtArriba: TextView = findViewById(R.id.txtArriba)
        val btn0: Button = findViewById(R.id.btn0)
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
        val btn4: Button = findViewById(R.id.btn4)
        val btn5: Button = findViewById(R.id.btn5)
        val btn6: Button = findViewById(R.id.btn6)
        val btn7: Button = findViewById(R.id.btn7)
        val btn8: Button = findViewById(R.id.btn8)
        val btn9: Button = findViewById(R.id.btn9)
        val btnMas: Button = findViewById(R.id.btnMas)
        val btnMenos: Button = findViewById(R.id.btnMenos)
        val btnDiv: Button = findViewById(R.id.btnDiv)
        val btnMultip: Button = findViewById(R.id.btnMultip)
        val btnBorrar: Button = findViewById(R.id.btnBorrar)
        val btnIgual: Button = findViewById(R.id.btnIgual)

        //val txtPrueba: TextView = findViewById(R.id.txtPrueba)


        var resFinal = 0
        var numero = ""
        var formula = ""
        var operacion = ""


        btnIgual.setOnClickListener {
            if (operacion.equals("+")) {
                formula = "$formula$numero"
                resFinal += numero.toInt()
            }
            if (operacion.equals("-")) {
                formula = "$formula$numero"
                resFinal -= numero.toInt()
            }
            if (operacion.equals("/")) {
                formula = "$formula$numero"
                resFinal /= numero.toInt()
            }
            if (operacion.equals("*")) {
                formula = "$formula$numero"
                resFinal *= numero.toInt()
            }
            formula = "$formula="
            txtArriba.setText(formula)
            txtAbajo.setText("$resFinal")
            resFinal = 0
            numero = ""
            formula = ""
            operacion = ""
        }

        btnMas.setOnClickListener {
            if (operacion.equals("")) {
                resFinal = numero.toInt()
            } else {
                if (operacion.equals("+")){
                    resFinal += numero.toInt()
                } else{
                    if (operacion.equals("-")){
                        resFinal -= numero.toInt()
                    }
                    if (operacion.equals("/")){
                        resFinal /= numero.toInt()
                    }
                    if (operacion.equals("*")){
                        resFinal *= numero.toInt()
                    }
                }
            }
            operacion = "+"
            formula = "$formula$numero+"
            txtArriba.setText(formula)
            txtAbajo.setText("0")
            numero = ""
        }

        btnMenos.setOnClickListener {
            if (operacion.equals("")) {
                resFinal = numero.toInt()
            } else {
                if (operacion.equals("-")){
                    resFinal -= numero.toInt()
                } else{
                    if (operacion.equals("+")){
                        resFinal += numero.toInt()
                    }
                    if (operacion.equals("/")){
                        resFinal /= numero.toInt()
                    }
                    if (operacion.equals("*")){
                        resFinal *= numero.toInt()
                    }
                }
            }
            operacion = "-"
            formula = "$formula$numero-"
            txtArriba.setText(formula)
            txtAbajo.setText("0")
            numero = ""
        }

        btnDiv.setOnClickListener {
            if (operacion.equals("")) {
                resFinal = numero.toInt()
            } else {
                if (operacion.equals("/")){
                    resFinal /= numero.toInt()
                } else{
                    if (operacion.equals("-")){
                        resFinal -= numero.toInt()
                    }
                    if (operacion.equals("+")){
                        resFinal += numero.toInt()
                    }
                    if (operacion.equals("*")){
                        resFinal *= numero.toInt()
                    }
                }
            }
            operacion = "/"
            formula = "$formula$numero/"
            txtArriba.setText(formula)
            txtAbajo.setText("0")
            numero = ""
        }

        btnMultip.setOnClickListener {
            if (operacion.equals("")) {
                resFinal = numero.toInt()
            } else {
                if (operacion.equals("*")){
                    resFinal *= numero.toInt()
                } else{
                    if (operacion.equals("-")){
                        resFinal -= numero.toInt()
                    }
                    if (operacion.equals("/")){
                        resFinal /= numero.toInt()
                    }
                    if (operacion.equals("+")){
                        resFinal += numero.toInt()
                    }
                }
            }
            operacion = "*"
            formula = "$formula$numero*"
            txtArriba.setText(formula)
            txtAbajo.setText("0")
            numero = ""
        }

        btnBorrar.setOnClickListener {
            numero = ""
            txtAbajo.setText("0")
        }

        btn0.setOnClickListener {
            if (numero.isBlank()) {
                numero = "0"
                txtAbajo.setText(numero)
            } else {
                numero += "0"
                txtAbajo.setText(numero)
            }
        }

        btn1.setOnClickListener {
            if (numero.isBlank()) {
                numero = "1"
                txtAbajo.setText(numero)
            } else {
                numero += "1"
                txtAbajo.setText(numero)
            }
        }

        btn2.setOnClickListener {
            if (numero.isBlank()) {
                numero = "2"
                txtAbajo.setText(numero)
            } else {
                numero += "2"
                txtAbajo.setText(numero)
            }
        }

        btn3.setOnClickListener {
            if (numero.isBlank()) {
                numero = "3"
                txtAbajo.setText(numero)
            } else {
                numero += "3"
                txtAbajo.setText(numero)
            }
        }
        btn4.setOnClickListener {
            if (numero.isBlank()) {
                numero = "4"
                txtAbajo.setText(numero)
            } else {
                numero += "4"
                txtAbajo.setText(numero)
            }
        }

        btn5.setOnClickListener {
            if (numero.isBlank()) {
                numero = "5"
                txtAbajo.setText(numero)
            } else {
                numero += "5"
                txtAbajo.setText(numero)
            }
        }

        btn6.setOnClickListener {
            if (numero.isBlank()) {
                numero = "6"
                txtAbajo.setText(numero)
            } else {
                numero += "6"
                txtAbajo.setText(numero)
            }
        }

        btn7.setOnClickListener {
            if (numero.isBlank()) {
                numero = "7"
                txtAbajo.setText(numero)
            } else {
                numero += "7"
                txtAbajo.setText(numero)
            }
        }
        btn8.setOnClickListener {
            if (numero.isBlank()) {
                numero = "8"
                txtAbajo.setText(numero)
            } else {
                numero += "8"
                txtAbajo.setText(numero)
            }
        }

        btn9.setOnClickListener {
            if (numero.isBlank()) {
                numero = "9"
                txtAbajo.setText(numero)
            } else {
                numero += "9"
                txtAbajo.setText(numero)
            }
        }
    }
}