package br.edu.ifpb.smarthome.CreationalPattern

interface RoomFactory {

    fun createView()

    fun attachDevice(toggle : Boolean)
}