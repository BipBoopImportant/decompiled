package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.os.RemoteException;
import android.text.TextUtils;
import sa.C8755h;

final class L4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f49818a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ E5 f49819b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f49820c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ J f49821d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f49822e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C7685s4 f49823f;

    L4(C7685s4 s4Var, boolean z10, E5 e52, boolean z11, J j10, String str) {
        this.f49818a = z10;
        this.f49819b = e52;
        this.f49820c = z11;
        this.f49821d = j10;
        this.f49822e = str;
        this.f49823f = s4Var;
    }

    public final void run() {
        long j10;
        long j11;
        long j12;
        C8755h A10 = this.f49823f.f50393d;
        if (A10 == null) {
            this.f49823f.f().E().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f49818a) {
            C6620s.l(this.f49819b);
            this.f49823f.X(A10, this.f49820c ? null : this.f49821d, this.f49819b);
        } else {
            boolean r10 = this.f49823f.a().r(K.f49721P0);
            try {
                if (TextUtils.isEmpty(this.f49822e)) {
                    C6620s.l(this.f49819b);
                    if (r10) {
                        j12 = this.f49823f.f50228a.zzb().a();
                        try {
                            j11 = this.f49823f.f50228a.zzb().c();
                        } catch (RemoteException e10) {
                            e = e10;
                            j11 = 0;
                            j10 = j12;
                            this.f49823f.f().E().b("Failed to send event to the service", e);
                            if (r10 && j10 != 0) {
                                C7593f2.a(this.f49823f.f50228a).b(36301, 13, j10, this.f49823f.f50228a.zzb().a(), (int) (this.f49823f.f50228a.zzb().c() - j11));
                            }
                            this.f49823f.o0();
                        }
                    } else {
                        j12 = 0;
                        j11 = 0;
                    }
                    try {
                        A10.K2(this.f49821d, this.f49819b);
                        if (r10) {
                            this.f49823f.f().I().a("Logging telemetry for logEvent");
                            C7593f2.a(this.f49823f.f50228a).b(36301, 0, j12, this.f49823f.f50228a.zzb().a(), (int) (this.f49823f.f50228a.zzb().c() - j11));
                        }
                    } catch (RemoteException e11) {
                        e = e11;
                        j10 = j12;
                        this.f49823f.f().E().b("Failed to send event to the service", e);
                        C7593f2.a(this.f49823f.f50228a).b(36301, 13, j10, this.f49823f.f50228a.zzb().a(), (int) (this.f49823f.f50228a.zzb().c() - j11));
                        this.f49823f.o0();
                    }
                } else {
                    A10.B0(this.f49821d, this.f49822e, this.f49823f.f().M());
                }
            } catch (RemoteException e12) {
                e = e12;
                j11 = 0;
                j10 = 0;
            }
        }
        this.f49823f.o0();
    }
}
