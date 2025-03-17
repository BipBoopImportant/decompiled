package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import l9.p;
import l9.u;
import s9.C8745a;
import w9.C8934a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        u.f(context);
        p.a d10 = p.a().b(queryParameter).d(C8934a.b(intValue));
        if (queryParameter2 != null) {
            d10.c(Base64.decode(queryParameter2, 0));
        }
        u.c().e().v(d10.a(), i10, new C8745a());
    }
}
