package com.toquemedia.todolist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.toquemedia.todolist.ui.theme.ToDoListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToDoListTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting( modifier: Modifier = Modifier) {
  Column(
      modifier = modifier
          .fillMaxWidth()
          .fillMaxHeight(),
      horizontalAlignment = Alignment.CenterHorizontally,
     //verticalArrangement = Arrangement.SpaceBetween

  ) {
      Spacer(modifier = Modifier.height(40.dp))
      Image(
          modifier = modifier
              .size(115.dp),
          painter = painterResource(id = R.drawable.instagram_logo_instagram_icon_transparent_free_png),
          contentDescription = "logo instagram",

          )
      Spacer(modifier = Modifier.height(10.dp))
      StyledTextField()
      Text(text = "Esqueceu a senha?", color = Color.Blue, textDecoration = TextDecoration.Underline, fontWeight = FontWeight.Bold ,modifier = Modifier
          .align(alignment = Alignment.End)
          .padding(10.dp))
      Spacer(modifier = Modifier.height(20.dp))
      OutlinedButton(onClick = { /*TODO*/ },
          shape = MaterialTheme.shapes.medium.copy(
          topStart =  CornerSize(5.dp),
          topEnd = CornerSize(5.dp),
          bottomStart = CornerSize(5.dp),
          bottomEnd = CornerSize(5.dp)
      ),
          modifier = Modifier
              .padding(10.dp)
              .width(500.dp)
              .height(50.dp),
          colors =  ButtonDefaults.buttonColors(containerColor = Color.Blue)) {
    Text(text = "Login")
    
}

      Spacer(modifier = Modifier.height(50.dp))
      Row(
          horizontalArrangement = Arrangement.SpaceEvenly,
          verticalAlignment = Alignment.CenterVertically,) {
          Image(
              modifier = modifier
                  .size(20.dp),
              painter = painterResource(id = R.drawable.facebook),
              contentDescription = "logo facebook",
              )
          Spacer(modifier = Modifier.width(15.dp))
          Text(text = "Continuar como Helineth Amorim", color = Color.Blue)
      }
      Spacer(modifier = Modifier.height(50.dp))
      Row(
          modifier = Modifier.fillMaxWidth(),
          horizontalArrangement = Arrangement.SpaceEvenly,
          verticalAlignment = Alignment.CenterVertically) {

          Divider(modifier = Modifier.width(150.dp))
          Text(text = "Ou")
          Divider(modifier = Modifier.width(150.dp))

      }
      Spacer(modifier = Modifier.height(60.dp))
      Row(
          horizontalArrangement = Arrangement.SpaceEvenly,
          verticalAlignment = Alignment.CenterVertically,) {
         Text(text = "Não tem uma conta?", color = Color.DarkGray)
          Spacer(modifier = Modifier.width(10.dp))
          Text(text = "Cadastre-se", color = Color.Blue)
      }
      Spacer(modifier = Modifier.height(120.dp))
      Text(text = "Instagram from Facebook", color = Color.DarkGray)
  }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StyledTextField() {
    var text by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { newText -> text = newText },
        label = { Text("Número de telefone, username, ou e-mail", color = Color.DarkGray) },
        maxLines = 1,
        modifier = Modifier
            .padding(10.dp)
            .width(500.dp)

    )
    OutlinedTextField(
        value = password,
        onValueChange = { newPassword -> password = newPassword },
        label = { Text("Password", color = Color.DarkGray) },
        maxLines = 1,
        modifier = Modifier
            .padding(10.dp)
            .width(500.dp),
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)

    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ToDoListTheme {
        Greeting()
    }
}