package com.example.twoblogapp.screen

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.twoblogapp.R
import com.example.twoblogapp.ui.theme.TwoBlogAppTheme


@Composable
fun BlogApp (){
    val headLine = "Exclusive: Bill Gates In Kenya To Hold Series of Public Engagements"
    val newsOne = "American Businessman and Microsoft Company owner Bill Gates is in Kenya, where he will hold a series of public engagements."
    val newsTwo = "On Tuesday, Gates will tour Makueni County and is expected to meet Governor Mutula Kilonzo at his office."
    val newsThree = "Healthcare is at the top of the Businessman's mission in Kenya. He is set to visit the Makueni Mother and Child hospital and later visit Kathonzweni Health Center where is is expected to meet health volunteers."
    val newsFour = " Gates will meet two farmers in Kathonzweni who are championing for Climate Change and are farming through irrigation."
    val newsFive = "On Thursday, November 17, Bill Gates is expected to give a talk on Innovating for Food Security and Climate Change in Africa. The event will be streamed live from the University of Nairobi"
    // Column for all
    Column (
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .background(Color.White)
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
            ) {
        Text(
            text = headLine,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
        )
        Spacer(modifier = Modifier.height(10.dp))
        // Author information
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(BorderStroke(1.dp, Color.Black))
                    .padding(5.dp),
                painter = painterResource(id = R.drawable.pic),
                contentDescription = null,
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column (
                Modifier.padding(2.dp)
                    ) {
                Text(
                    text = "Votes Wakoli",
                    fontSize = 14.sp,
                    color = MaterialTheme.colors.primary
                )
                Text(text = "15th Nov 22", fontSize = 10.sp)
                
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        // News Paragraphs        
        Column {
            // News Banner
            Image(
                painter =  painterResource(id = R.drawable.news_banner),
                contentDescription = null 
            )
            // Paragraphs
            Text(text = newsOne, modifier = Modifier.padding(5.dp))
            Text(text = newsTwo, modifier = Modifier.padding(5.dp))
            Text(text = newsThree, modifier = Modifier.padding(5.dp))
            Text(text = newsFour, modifier = Modifier.padding(5.dp))
//            Text(text = newsFive, modifier = Modifier.padding(5.dp))
        }
        Row() {
            Image(
                painter = painterResource(
                    id = R.drawable.news_banner2,
                ),
                contentDescription = null,
                modifier = Modifier.height(200.dp)
            )
                Text(text = newsFive, modifier = Modifier.padding(5.dp))


        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBlogApp () {
    TwoBlogAppTheme {
        BlogApp()
    }
}
