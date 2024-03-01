package com.example.firatproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firatproject.ui.theme.FiratProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FiratProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background)
                {
                    Column {

                        InfoCard(title = "Условия подключения", sum = "30")
                        InfoRegion()
                        Content()

                    }

                }

                }
            }
        }
    } /** Поправить табуляция, выровнить ковычки*/


@Composable
fun InfoCard(
    title: String,
    sum: String

){

    Card (modifier= Modifier.padding(16.dp)) { //круглая карта в которой через падинг мы меняем отступы//
        Column(modifier= Modifier.padding(16.dp)){
            Text(text = title, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.size(16.dp)) //отступы между строк//
            Text(text = "Абонентская плата")
            Text(text = "от $sum",fontWeight= FontWeight.ExtraLight)
            Divider()     //полоска//
            Spacer(modifier = Modifier.size(16.dp))
            Text(text = "Палата за подключение")
            Text(text = "от $sum",fontWeight= FontWeight.ExtraLight)
    } /** Поправить табуляция, выровнить ковычки*/
    } /** Поправить табуляция, выровнить ковычки*/

}
@Composable
fun InfoRegion() {
    Card(modifier = Modifier.padding(16.dp)) { //круглая карта в которой через падинг мы меняем отступы//
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Регион", fontWeight = FontWeight.ExtraLight)
            Spacer(modifier = Modifier.size(16.dp)) //отступы между строк//
            Row {
                Text(text = "Выберите регион")
                Icon (Icons.Default.KeyboardArrowRight,contentDescription = null) //стрелочка//
            } /** Поправить табуляция, выровнить ковычки*/

        } /** Поправить табуляция, выровнить ковычки*/
        } /** Поправить табуляция, выровнить ковычки*/
} /** Поправить табуляция, выровнить ковычки*/

@Composable
fun Content() {
    Card(modifier = Modifier.padding(16.dp)) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Подключите опцию <<Любимый межгород>>по направлению, в котором" +
                    " Вы часто звоните, и все звонки в этом направоении будут стоить для вас" +
                    " 1,5 руб. за минуту.В качестве бонуса все звонки за пределы Вашего населеного" +
                    " пункта по области (или Республике) будут стоить также 1,50 руб./мин.Вы можете " +
                    "выбрать несколько любимых направлений. ")
          } /** Поправить табуляция, выровнить ковычки*/
          } /** Поправить табуляция, выровнить ковычки*/
        } /** Поправить табуляция, выровнить ковычки*/