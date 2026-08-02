package com.karenkotlin.jcroom


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karenkotlin.jcroom.room.entities.Insect
import com.karenkotlin.jcroom.viewmodel.InsectViewModel



// PANTALLA REAL
@Composable
fun InsectFormScreen(
    viewModel: InsectViewModel,
    onBack: () -> Unit
) {


    var name by remember {
        mutableStateOf("")
    }


    var img by remember {
        mutableStateOf("")
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {


        Text(
            text = "Nuevo Insecto"
        )


        Spacer(
            modifier = Modifier.height(20.dp)
        )


        TextField(
            value = name,
            onValueChange = {
                name = it
            },
            label = {
                Text("Nombre")
            }
        )


        Spacer(
            modifier = Modifier.height(10.dp)
        )


        TextField(
            value = img,
            onValueChange = {
                img = it
            },
            label = {
                Text("Imagen")
            }
        )


        Spacer(
            modifier = Modifier.height(20.dp)
        )


        Button(
            onClick = {


                viewModel.addInsect(
                    Insect(
                        name = name,
                        imgLocation = img
                    )
                )


                onBack()

            }
        ){

            Text("Guardar")

        }


    }

}



// PREVIEW
@Preview(showBackground = true)
@Composable
fun InsectFormPreview(){

    InsectFormPreviewContent()

}


@Composable
fun InsectFormPreviewContent(){


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ){


        Text(
            text = "Nuevo Insecto"
        )


        Spacer(
            modifier = Modifier.height(20.dp)
        )


        TextField(
            value = "",
            onValueChange = {},
            label = {
                Text("Nombre")
            }
        )


        Spacer(
            modifier = Modifier.height(10.dp)
        )


        TextField(
            value = "",
            onValueChange = {},
            label = {
                Text("Imagen")
            }
        )


        Button(
            onClick = {}
        ){

            Text("Guardar")

        }

    }

}