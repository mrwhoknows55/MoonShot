package com.haroldadmin.moonshot.notifications.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.haroldadmin.moonshot.di.appComponent
import com.haroldadmin.moonshot.models.NotificationType
import com.haroldadmin.moonshot.notifications.Notifier
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

class DayBeforeLaunchAlarmReceiver : BroadcastReceiver() {

    @Inject
    lateinit var notifier: Notifier

    @ExperimentalCoroutinesApi
    override fun onReceive(context: Context?, intent: Intent?) {
        appComponent().broadcastReceiversComponent().create().inject(this)
        notifier.processBroadcast(NotificationType.DayBeforeLaunch)
    }
}