package com.example.quest6_042.view

import android.graphics.fonts.FontFamily
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quest6_042.R
import com.example.quest6_042.model.Siswa

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilanData(
    statusUiSiswa: Siswa,
    onBackBtnClick: () -> Unit
) {

    val items = listOf("Nama Lengkap" to statusUiSiswa.nama, "Jenis Kelamin" to statusUiSiswa.gender, "Alamat" to statusUiSiswa.alamat)

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(id = R.string.tampil), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            )
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {

            // DATA DETAIL
            i
    }
}
