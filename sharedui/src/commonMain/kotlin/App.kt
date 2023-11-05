import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

val scope = CoroutineScope(Dispatchers.Main)

fun test() : Job {
    return scope.launch { }
}

@Composable
fun App() {

    val job = remember { test() }

    Text(job.toString())
}