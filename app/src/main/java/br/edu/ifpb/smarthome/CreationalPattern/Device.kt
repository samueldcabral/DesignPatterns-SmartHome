package br.edu.ifpb.smarthome.CreationalPattern

import android.content.Context
import android.view.View

interface Device {

//    fun createDevice(context : Context) : View
    fun toggle() : Boolean
}