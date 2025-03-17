package com.google.firebase.remoteconfig.internal;

import Fb.f;
import Ic.c;
import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import nc.e;

public class p {

    /* renamed from: a  reason: collision with root package name */
    private final Set<c> f68794a;

    /* renamed from: b  reason: collision with root package name */
    private final s f68795b;

    /* renamed from: c  reason: collision with root package name */
    private final m f68796c;

    /* renamed from: d  reason: collision with root package name */
    private final f f68797d;

    /* renamed from: e  reason: collision with root package name */
    private final e f68798e;

    /* renamed from: f  reason: collision with root package name */
    private final f f68799f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f68800g;

    /* renamed from: h  reason: collision with root package name */
    private final String f68801h;

    /* renamed from: i  reason: collision with root package name */
    private final t f68802i;

    /* renamed from: j  reason: collision with root package name */
    private final ScheduledExecutorService f68803j;

    public p(f fVar, e eVar, m mVar, f fVar2, Context context, String str, t tVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f68794a = linkedHashSet;
        this.f68795b = new s(fVar, eVar, mVar, fVar2, context, str, linkedHashSet, tVar, scheduledExecutorService);
        this.f68797d = fVar;
        this.f68796c = mVar;
        this.f68798e = eVar;
        this.f68799f = fVar2;
        this.f68800g = context;
        this.f68801h = str;
        this.f68802i = tVar;
        this.f68803j = scheduledExecutorService;
    }

    private synchronized void a() {
        if (!this.f68794a.isEmpty()) {
            this.f68795b.C();
        }
    }

    public synchronized void b(boolean z10) {
        this.f68795b.z(z10);
        if (!z10) {
            a();
        }
    }
}
