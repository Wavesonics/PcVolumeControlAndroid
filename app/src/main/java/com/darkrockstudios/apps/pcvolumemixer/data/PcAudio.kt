package com.darkrockstudios.apps.pcvolumemixer.data

/**
 * Created by adamw on 9/16/2017.
 */
data class PcAudio(val version: Int, val deviceIds: MutableMap<String,String>?, val defaultDevice: AudioDevice)