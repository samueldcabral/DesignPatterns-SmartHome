package br.edu.ifpb.smarthome.CreationalPattern

import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ToggleButton
import br.edu.ifpb.smarthome.R

class KitchenFactoryActivity : AppCompatActivity(), RoomFactory {
    private lateinit var buttonList : HashMap<SimpleLight, ToggleButton>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kitchen_factory)
        this.buttonList = hashMapOf()
        attachDevice(false)
        attachDevice(true)

        var linearLayout = findViewById<LinearLayout>(R.id.llKitchen)

        for(button in this.buttonList){
            linearLayout.addView(button.value)
        }
    }

    override fun createView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun attachDevice(toggle : Boolean) {
        var simpleLight = SimpleLight()
//        var button = simpleLight.createDevice(this) as Button
        var toggleBtn = ToggleButton(this)

        var status = false

        if(toggle) {
            status = simpleLight.toggle()
        }else {
            status = simpleLight.status
        }

//        <!--    <ToggleButton-->
//        <!--        android:checked="true"-->
//        <!--        android:textOff=""-->
//        <!--        android:textOn=""-->
//        <!--        android:background="@drawable/lamp_switch"-->
//        <!--        android:layout_width="wrap_content"-->
//        <!--        android:layout_height="wrap_content"/>-->

//        var status = simpleLight.status

        toggleBtn.setBackgroundResource(R.drawable.lamp_switch)
        toggleBtn.textOff = ""
        toggleBtn.textOn = ""
        toggleBtn.width = LinearLayout.LayoutParams.WRAP_CONTENT
        toggleBtn.height = LinearLayout.LayoutParams.WRAP_CONTENT
        toggleBtn.isChecked = status
        this.buttonList.put(simpleLight, toggleBtn)
    }
}
