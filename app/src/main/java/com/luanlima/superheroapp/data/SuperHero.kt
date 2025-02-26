package com.luanlima.superheroapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.luanlima.superheroapp.R

data class SuperHero(
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)