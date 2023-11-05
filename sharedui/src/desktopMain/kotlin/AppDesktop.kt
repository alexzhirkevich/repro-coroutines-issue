import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun DesktopApp() {
    application {
        Window(onCloseRequest = ::exitApplication){
            App()
        }
    }
}