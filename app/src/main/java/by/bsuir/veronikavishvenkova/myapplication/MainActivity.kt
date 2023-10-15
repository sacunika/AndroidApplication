package by.bsuir.veronikavishvenkova.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column() {
                Text(
                    modifier = Modifier
                        .padding(20.dp),
                    text = "О приложении", fontSize = 7.em
                )

                ListItem(field = "Версия", description = "1.1.0", img = R.drawable.version)
                ListItem(field = "Перевод",
                    description = "Помогите нам перевести приложение на ваш язык",
                    img = R.drawable.flag)
                ListItem(field = "Сообщить об ошибке",
                    description = "Произошла непредвиденная ошибка. Приносим свои извинения. Сообщите об ошибке",
                    img = R.drawable.bug)
                ListItem(field = "Часто задаваемые вопросы", description = "Нужна помощь?", img = R.drawable.questions)
                ListItem(field = "Лицензия с открытым исходным кодом",
                    description = "Cведения о лицензии для программного обеспечения с открытым исходным кодом",
                    img = R.drawable.license)

            }
        }
    }
}

@Composable
private fun ListItem(field: String, description: String, img: Int) {
    Card(
        modifier = Modifier
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp)
    ) {
        Box(
            modifier = Modifier.background(Color.White)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically

            ) {
                Image(
                    painter = painterResource(id = img),
                    contentDescription = "img",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(35.dp)
                        .clip(CircleShape)
                )
                Column {
                    Text(text = field, fontSize = 5.em)
                    Text(text = description, fontSize = 3.5.em)
                }
            }
        }
    }
}

