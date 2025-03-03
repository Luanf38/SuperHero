package com.luanlima.superheroapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.luanlima.superheroapp.model.SuperHeroModel
import com.luanlima.superheroapp.objects.HeroesRepository
import com.luanlima.superheroapp.ui.theme.Shapes
import com.luanlima.superheroapp.ui.theme.SuperHeroAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SuperHeroAppTheme {
                SuperHeroApp(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

@Composable
fun SuperHeroApp(modifier: Modifier = Modifier) {
        Scaffold(
            modifier = modifier
        ) {
            innerPadding -> SuperHeroList(modifier = modifier
                .padding(innerPadding)
                .fillMaxWidth())
        }
}

@Composable
fun SuperHeroList(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(
            dimensionResource(R.dimen.padding_small)
        ),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        items(HeroesRepository.heroes) {
            HeroCard(
                hero = it,
            )
        }
    }
}

@Composable
fun HeroCard(
    modifier: Modifier = Modifier,
    hero: SuperHeroModel
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer
        ),
        modifier = modifier
            .height(104.dp)
            .fillMaxWidth(),
        shape = MaterialTheme.shapes.medium
    ) {
        Text(
            text = stringResource(hero.nameRes)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SuperHeroAppPreview(
) {
    SuperHeroAppTheme(
        dynamicColor = false
    ) {
        SuperHeroApp(modifier = Modifier.fillMaxSize())
    }
}