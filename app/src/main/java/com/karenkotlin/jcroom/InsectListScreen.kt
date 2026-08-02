package com.karenkotlin.jcroom

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karenkotlin.jcroom.ui.theme.JCRoomTheme
import com.karenkotlin.jcroom.viewmodel.InsectViewModel


// PANTALLA REAL
@Composable
fun InsectListScreen(
    viewModel: InsectViewModel,
    onNew: () -> Unit
) {

    val insects by viewModel.insects.collectAsState(
        initial = emptyList()
    )


    Column(
        modifier = Modifier.fillMaxSize()
    ) {


        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {

            items(insects) { insect ->


                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {

                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {

                        Text(
                            text = insect.name
                        )


                        Text(
                            text = if(insect.inDanger)
                                "En peligro"
                            else
                                "Seguro"
                        )


                        Row {

                            Button(
                                onClick = {}
                            ) {
                                Text("Editar")
                            }


                            Spacer(
                                modifier = Modifier.width(10.dp)
                            )


                            Button(
                                onClick = {
                                    viewModel.deleteInsect(insect)
                                }
                            ) {
                                Text("Eliminar")
                            }

                        }

                    }

                }

            }

        }



        Button(
            onClick = onNew,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {

            Text("Nuevo")

        }

    }

}



// PREVIEW
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InsectListPreview(){

    JCRoomTheme {

        InsectListPreviewContent()

    }

}


@Composable
fun InsectListPreviewContent(){


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {


        Text(
            text = "Lista de Insectos"
        )


        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {


            Column(
                modifier = Modifier.padding(16.dp)
            ) {


                Text("Abeja")

                Text("Seguro")


                Row {

                    Button(
                        onClick = {}
                    ){
                        Text("Editar")
                    }


                    Spacer(
                        modifier = Modifier.width(10.dp)
                    )


                    Button(
                        onClick = {}
                    ){
                        Text("Eliminar")
                    }

                }


            }


        }


        Button(
            onClick = {}
        ){

            Text("Nuevo")

        }


    }

}