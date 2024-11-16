package lastlab.uvg.edu.gt.presentacion.main.List

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
data object ListDestination

fun NavGraphBuilder.list(
    navigateToProfile: (String) -> Unit
){
    composable<ListDestination> {
        ListRoute(
            onProfileClick = navigateToProfile
        )
    }
}