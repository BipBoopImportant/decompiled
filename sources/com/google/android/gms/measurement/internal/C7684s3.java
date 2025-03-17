package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C7282e1;

/* renamed from: com.google.android.gms.measurement.internal.s3  reason: case insensitive filesystem */
public final class C7684s3 {

    /* renamed from: a  reason: collision with root package name */
    final Context f50382a;

    /* renamed from: b  reason: collision with root package name */
    String f50383b;

    /* renamed from: c  reason: collision with root package name */
    String f50384c;

    /* renamed from: d  reason: collision with root package name */
    String f50385d;

    /* renamed from: e  reason: collision with root package name */
    Boolean f50386e;

    /* renamed from: f  reason: collision with root package name */
    long f50387f;

    /* renamed from: g  reason: collision with root package name */
    C7282e1 f50388g;

    /* renamed from: h  reason: collision with root package name */
    boolean f50389h = true;

    /* renamed from: i  reason: collision with root package name */
    Long f50390i;

    /* renamed from: j  reason: collision with root package name */
    String f50391j;

    public C7684s3(Context context, C7282e1 e1Var, Long l10) {
        C6620s.l(context);
        Context applicationContext = context.getApplicationContext();
        C6620s.l(applicationContext);
        this.f50382a = applicationContext;
        this.f50390i = l10;
        if (e1Var != null) {
            this.f50388g = e1Var;
            this.f50383b = e1Var.f48905f;
            this.f50384c = e1Var.f48904e;
            this.f50385d = e1Var.f48903d;
            this.f50389h = e1Var.f48902c;
            this.f50387f = e1Var.f48901b;
            this.f50391j = e1Var.f48907h;
            Bundle bundle = e1Var.f48906g;
            if (bundle != null) {
                this.f50386e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
