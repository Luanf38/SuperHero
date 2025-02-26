package com.luanlima.superheroapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class SuperHeroModel(
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)