package bg.devlabs.gamescorer.utils.extensions

import android.app.Dialog
import bg.devlabs.gamescorer.R
import kotlinx.android.synthetic.main.dialog.*


/**
 * Created by Slavi Petrov on 10.08.2017
 * Dev Labs
 * slavi@devlabs.bg
 */
fun Dialog.show(message: String, indeterminate: Boolean, cancelable: Boolean) {
    this.setContentView(R.layout.dialog)
    this.progressBar.isIndeterminate = indeterminate
    this.title.text = message
    this.setCancelable(cancelable)
    this.show()
}