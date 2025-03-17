package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public final class C0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f48565a = (Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);

    public static PendingIntent a(Context context, int i10, Intent intent, int i11) {
        return PendingIntent.getBroadcast(context, 0, intent, i11);
    }
}
