package com.google.android.gms.measurement.internal;

import K9.C6618p;
import K9.C6624w;
import K9.C6625x;
import K9.C6626y;
import K9.C6627z;
import android.content.Context;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import sa.C8763p;

/* renamed from: com.google.android.gms.measurement.internal.f2  reason: case insensitive filesystem */
public final class C7593f2 {

    /* renamed from: d  reason: collision with root package name */
    private static C7593f2 f50125d;

    /* renamed from: e  reason: collision with root package name */
    private static final Duration f50126e = Duration.ofMinutes(30);

    /* renamed from: a  reason: collision with root package name */
    private final P2 f50127a;

    /* renamed from: b  reason: collision with root package name */
    private final C6626y f50128b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicLong f50129c = new AtomicLong(-1);

    private C7593f2(Context context, P2 p22) {
        this.f50128b = C6625x.b(context, C6627z.a().b("measurement:api").a());
        this.f50127a = p22;
    }

    static C7593f2 a(P2 p22) {
        if (f50125d == null) {
            f50125d = new C7593f2(p22.zza(), p22);
        }
        return f50125d;
    }

    public final synchronized void b(int i10, int i11, long j10, long j11, int i12) {
        synchronized (this) {
            long c10 = this.f50127a.zzb().c();
            if (this.f50129c.get() != -1) {
                if (c10 - this.f50129c.get() <= f50126e.toMillis()) {
                    return;
                }
            }
            this.f50128b.g(new C6624w(0, Arrays.asList(new C6618p[]{new C6618p(36301, i11, 0, j10, j11, (String) null, (String) null, 0, i12)}))).e(new C8763p(this, c10));
        }
    }
}
