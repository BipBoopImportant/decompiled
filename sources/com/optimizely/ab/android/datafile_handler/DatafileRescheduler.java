package com.optimizely.ab.android.datafile_handler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yE.C15298a;

public class DatafileRescheduler extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    Logger f122262a = LoggerFactory.getLogger((Class<?>) DatafileRescheduler.class);

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f122263a;

        /* renamed from: b  reason: collision with root package name */
        private final a f122264b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final Logger f122265c;

        /* renamed from: com.optimizely.ab.android.datafile_handler.DatafileRescheduler$a$a  reason: collision with other inner class name */
        class C3015a extends Thread {
            C3015a() {
            }

            public void run() {
                a.this.f122265c.debug("Rescheduling datafile will be done by JobScheduler");
            }
        }

        a(Context context, a aVar, Logger logger) {
            this.f122263a = context;
            this.f122264b = aVar;
            this.f122265c = logger;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            new C3015a().start();
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (context == null || intent == null || (!intent.getAction().equals("android.intent.action.BOOT_COMPLETED") && !intent.getAction().equals("android.intent.action.MY_PACKAGE_REPLACED"))) {
            this.f122262a.warn("Received invalid broadcast to data file rescheduler");
            return;
        }
        this.f122262a.info("Received intent with action {}", (Object) intent.getAction());
        new a(context, new a(new C15298a(context, LoggerFactory.getLogger((Class<?>) C15298a.class)), LoggerFactory.getLogger((Class<?>) a.class)), LoggerFactory.getLogger((Class<?>) a.class)).b();
    }
}
