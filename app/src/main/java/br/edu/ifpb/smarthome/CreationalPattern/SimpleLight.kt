package br.edu.ifpb.smarthome.CreationalPattern

import android.content.Context
import android.view.View
import android.widget.Button

class SimpleLight : Device {
    var name : String
    var status : Boolean

    init {
        name = "SimpleLight"
        status = false
    }

//    override fun createDevice(context : Context): View {
//       var button = Button(context)
//        button.text = "${this.name} - ${this.status}"
//        return button
//    }

    override fun toggle() : Boolean{
        this.status = !this.status
        return this.status
    }
}