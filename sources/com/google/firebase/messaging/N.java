package com.google.firebase.messaging;

import android.content.Context;
import xa.C8972m;

public final /* synthetic */ class N implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f68345a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f68346b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C8972m f68347c;

    public /* synthetic */ N(Context context, boolean z10, C8972m mVar) {
        this.f68345a = context;
        this.f68346b = z10;
        this.f68347c = mVar;
    }

    public final void run() {
        O.e(this.f68345a, this.f68346b, this.f68347c);
    }
}
