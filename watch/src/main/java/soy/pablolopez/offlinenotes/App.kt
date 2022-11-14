package soy.pablolopez.offlinenotes

import android.app.Application
import soy.pablolopez.offlinenotes.data.AppPrefsManager

class App : Application() {

    companion object {
        lateinit var instance: App
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        AppPrefsManager.init()
    }
}
