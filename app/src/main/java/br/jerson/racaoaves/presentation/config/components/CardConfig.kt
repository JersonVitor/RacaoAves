package br.jerson.racaoaves.presentation.config.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.jerson.racaoaves.R
import br.jerson.racaoaves.ui.theme.RacaoAvesTheme

@Composable
fun CardConfig (
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit
) {

    Scaffold(){innerPadding ->
        OutlinedCard(
            modifier.fillMaxWidth().padding(innerPadding),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            border = BorderStroke(width = 1.dp, color = Color.Gray),

            ){
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Row {
                    Icon(
                        painter = painterResource(R.drawable.package_2_24dp),
                        contentDescription = "icon de ração")
                    Text("Consumo de ração (g/ave/dia)")
                }
                Spacer(modifier = Modifier.height(15.dp))
                Column(modifier = Modifier.fillMaxWidth(),
                ) {
                    Text(
                        text =  "Ração inicial",
                        fontSize = 15.sp,
                        modifier = Modifier.padding(bottom = 5.dp)
                    )
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth().height(25.dp),
                        value = value,
                        onValueChange = onValueChange,
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number
                        )
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))
                Column {
                    Text("Ração Crescimento",
                        fontSize = 15.sp,
                        modifier = Modifier.padding(bottom = 5.dp)
                    )
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth().height(25.dp),
                        value = value,
                        onValueChange = onValueChange,
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number
                        )
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))
                Column {
                    Text("Ração Terminal",
                        fontSize = 15.sp,
                        modifier = Modifier.padding(bottom = 5.dp)
                    )
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth().height(25.dp),
                        value = value,
                        onValueChange = onValueChange,
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number
                        )
                    )
                }
            }
        }
    }
   
}

@Preview(showBackground = true)
@Composable
private fun CardConfigPrev() {
    RacaoAvesTheme {
        var value: String = ""
        CardConfig(modifier = Modifier, value = value) {}
    }
}
