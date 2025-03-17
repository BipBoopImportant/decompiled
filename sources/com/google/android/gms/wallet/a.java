package com.google.android.gms.wallet;

import Ba.C6377a;
import K9.C6602b;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.l;
import com.sugarcube.app.base.data.source.CatalogRepository;
import java.util.concurrent.TimeUnit;
import xa.C8971l;
import xa.C8972m;

public class a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final long f50603a = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: b  reason: collision with root package name */
    static final long f50604b = SystemClock.elapsedRealtime();

    public static Status a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
    }

    public static void b(Intent intent, Status status) {
        if (status == null) {
            intent.removeExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
        } else {
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", status);
        }
    }

    @Deprecated
    public static <TResult extends C6377a> void c(C8971l<TResult> lVar, Activity activity, int i10) {
        d a10 = d.a(lVar);
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        int i11 = a10.f50631a;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i11);
        bundle.putInt("requestCode", i10);
        bundle.putLong("initializationElapsedRealtime", f50604b);
        zzd zzd = new zzd();
        zzd.setArguments(bundle);
        int i12 = a10.f50631a;
        beginTransaction.add(zzd, "com.google.android.gms.wallet.AutoResolveHelper" + i12).commit();
    }

    public static void g(Status status, Object obj, C8972m mVar) {
        if (status.E0()) {
            mVar.c(obj);
        } else {
            mVar.b(C6602b.a(status));
        }
    }

    /* access modifiers changed from: private */
    public static void h(Activity activity, int i10, int i11, Intent intent) {
        PendingIntent createPendingResult = activity.createPendingResult(i10, intent, CatalogRepository.FETCH_FLAG_SDB);
        if (createPendingResult != null) {
            try {
                createPendingResult.send(i11);
            } catch (PendingIntent.CanceledException e10) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Exception sending pending result", e10);
                }
            }
        } else if (Log.isLoggable("AutoResolveHelper", 5)) {
            Log.w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
        }
    }

    /* access modifiers changed from: private */
    public static void i(Activity activity, int i10, C8971l lVar) {
        int i11;
        if (!activity.isFinishing()) {
            Exception l10 = lVar.l();
            if (l10 instanceof l) {
                try {
                    ((l) l10).d(activity, i10);
                } catch (IntentSender.SendIntentException e10) {
                    if (Log.isLoggable("AutoResolveHelper", 6)) {
                        Log.e("AutoResolveHelper", "Error starting pending intent!", e10);
                    }
                }
            } else {
                Intent intent = new Intent();
                if (lVar.q()) {
                    ((C6377a) lVar.m()).q(intent);
                    i11 = -1;
                } else {
                    if (l10 instanceof b) {
                        b bVar = (b) l10;
                        b(intent, new Status(bVar.b(), bVar.getMessage(), (PendingIntent) null));
                    } else {
                        if (Log.isLoggable("AutoResolveHelper", 6)) {
                            Log.e("AutoResolveHelper", "Unexpected non API exception!", l10);
                        }
                        b(intent, new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!"));
                    }
                    i11 = 1;
                }
                h(activity, i10, i11, intent);
            }
        } else if (Log.isLoggable("AutoResolveHelper", 3)) {
            Log.d("AutoResolveHelper", "Ignoring task result for, Activity is finishing.");
        }
    }
}
