package mx.edu.utng.apptodoenuno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*
import  kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long =6000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animacion:Animation = AnimationUtils.loadAnimation(this,R.anim.activity)
        txvUno.startAnimation(animacion)


        Hendler().postPlayed({ startActivity(this, PrincipalActivity::class.java)finish()}, SPLASH_TIME_OUT)

    }


}
