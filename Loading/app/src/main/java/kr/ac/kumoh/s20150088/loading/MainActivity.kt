package kr.ac.kumoh.s20150088.loading

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var loadingclass = LoadingClass(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonStartLoading.setOnClickListener {
            loadingclass.loading()
            work()
        }
    }
    fun work(){
        //loadingclass.loadingEnd()
    }

}
