package kr.ac.kumoh.s20150088.naver_translate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.etInput


class MainActivity : AppCompatActivity() {

    companion object{
        lateinit var tvResult:TextView
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvResult = findViewById(R.id.tvResult)

    }

    fun onTranslate(view: View) {
        if(!etInput!!.text.toString().equals("")){
            var asyncTask = NaverTranslateTask()
            asyncTask.execute(etInput.text.toString().toLowerCase())
        }
        else{
            Toast.makeText(this,"word is null", Toast.LENGTH_LONG).show()
        }
    }
}
