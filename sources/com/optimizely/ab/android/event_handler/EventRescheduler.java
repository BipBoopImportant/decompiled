package com.optimizely.ab.android.event_handler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import androidx.work.C7037f;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yE.f;

public class EventRescheduler extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    Logger f122278a = LoggerFactory.getLogger((Class<?>) EventRescheduler.class);

    /* access modifiers changed from: package-private */
    public void a(Context context, Intent intent) {
        Class<EventWorker> cls = EventWorker.class;
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED") || intent.getAction().equals("android.intent.action.MY_PACKAGE_REPLACED")) {
            f.b(context, "EventWorker", cls, C7037f.f45197c, -1L);
            this.f122278a.info("Rescheduling event flushing if necessary");
        } else if (intent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED")) {
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            if (networkInfo != null && networkInfo.isConnected()) {
                f.b(context, "EventWorker", cls, C7037f.f45197c, -1L);
                this.f122278a.info("Preemptively flushing events since wifi became available");
            }
        } else {
            this.f122278a.warn("Received unsupported broadcast action to event rescheduler");
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (context == null || intent == null) {
            this.f122278a.warn("Received invalid broadcast to event rescheduler");
            return;
        }
        try {
            a(context, intent);
        } catch (Exception e10) {
            Logger logger = this.f122278a;
            logger.warn("WorkScheduler failed to reschedule an event service: " + e10.getMessage());
        }
    }
}
