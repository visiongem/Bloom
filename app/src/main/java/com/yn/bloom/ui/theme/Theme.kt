package com.yn.bloom.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import com.yn.bloom.R
import kotlin.math.log

private val DarkColorPalette = darkColors(
    primary = pink100,
    secondary = pink900,
    background = white,
    surface = white850,
    onPrimary = gray,
    onSecondary = white,
    onBackground = gray,
    onSurface = gray
)

private val LightColorPalette = lightColors(
    primary = green900,
    secondary = green300,
    background = gray,
    surface = white150,
    onPrimary = white,
    onSecondary = gray,
    onBackground = white,
    onSurface = white850

)

open class WelcomeAssets(var background: Int, var illos: Int, var logo: Int)

object LightWelcomeAssets :
    WelcomeAssets(background = R.drawable.ic_light_welcome_bg, illos = R.drawable.ic_light_welcome_illos, logo = R.drawable.ic_light_logo)

object DarkWelcomeAssets :
    WelcomeAssets(background = R.drawable.ic_dark_welcome_bg, illos = R.drawable.ic_dark_welcome_illos, logo = R.drawable.ic_dark_logo)

internal var LocalWelcomeAssets = staticCompositionLocalOf { LightWelcomeAssets as WelcomeAssets }

val MaterialTheme.welcomeAssets
    @Composable
    @ReadOnlyComposable
    get() = LocalWelcomeAssets.current

enum class BloomTheme {
    LIGHT, DARK
}

@Composable
fun BloomTheme(theme: BloomTheme = BloomTheme.LIGHT, content: @Composable () -> Unit) {

    val welcomeAssets = if (theme == BloomTheme.DARK) DarkWelcomeAssets else LightWelcomeAssets

    CompositionLocalProvider(LocalWelcomeAssets provides welcomeAssets) {
        MaterialTheme(
            colors = if (theme == BloomTheme.DARK) DarkColorPalette else LightColorPalette,
            typography = bloomTypography,
            shapes = Shapes,
            content = content
        )
    }

}