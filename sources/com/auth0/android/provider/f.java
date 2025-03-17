package com.auth0.android.provider;

import android.content.Context;
import android.net.Uri;
import com.auth0.android.request.internal.k;
import u7.C8885b;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f46327a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f46328b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f46329c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Uri f46330d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ k f46331e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C8885b f46332f;

    public /* synthetic */ f(h hVar, boolean z10, Context context, Uri uri, k kVar, C8885b bVar) {
        this.f46327a = hVar;
        this.f46328b = z10;
        this.f46329c = context;
        this.f46330d = uri;
        this.f46331e = kVar;
        this.f46332f = bVar;
    }

    public final void run() {
        this.f46327a.g(this.f46328b, this.f46329c, this.f46330d, this.f46331e, this.f46332f);
    }
}
