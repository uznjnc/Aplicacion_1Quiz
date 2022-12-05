import androidx.lifecycle.ViewModel
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.logging.Log

private const val TAG = "QuizViewModel"
class QuizViewModel : ViewModel() {
    init {
        Log.d(TAG, "ViewModel instance created")
    }
    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "ViewModel instance about to be destroyed")
    }

}