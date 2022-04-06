package com.bela.dwinabela.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Router(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imgResourceId: Int
)