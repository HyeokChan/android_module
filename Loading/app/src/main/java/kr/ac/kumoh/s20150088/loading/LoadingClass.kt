package kr.ac.kumoh.s20150088.loading

import android.app.ProgressDialog
import android.content.Context

class LoadingClass {
    var context:Context
    lateinit var progressDialog: ProgressDialog
    constructor(context: Context){
        this.context = context
    }
    fun loading() {
        android.os.Handler().postDelayed(
            {
                progressDialog = ProgressDialog(context)
                progressDialog.isIndeterminate = true
                progressDialog.setMessage("잠시만 기다려 주세요")
                progressDialog.show()
            }, 0
        )
    }
    fun loadingEnd() {
        android.os.Handler().postDelayed(
            { progressDialog.dismiss() }, 0
        )
    }
}