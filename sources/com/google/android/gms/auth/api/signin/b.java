package com.google.android.gms.auth.api.signin;

import B9.e;
import C9.o;
import H9.C6527a;
import K9.r;
import android.content.Context;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.d;
import com.google.android.gms.dynamite.DynamiteModule;
import xa.C8971l;
import z9.C9037a;

@Deprecated
public class b extends f<GoogleSignInOptions> {

    /* renamed from: k  reason: collision with root package name */
    private static final f f47952k = new f((e) null);

    /* renamed from: l  reason: collision with root package name */
    static int f47953l = 1;

    b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C9037a.f58556b, googleSignInOptions, new f.a.C0823a().b(new C6527a()).a());
    }

    private final synchronized int F() {
        int i10;
        try {
            i10 = f47953l;
            if (i10 == 1) {
                Context u10 = u();
                a n10 = a.n();
                int h10 = n10.h(u10, d.f48050a);
                if (h10 == 0) {
                    i10 = 4;
                    f47953l = 4;
                } else if (n10.b(u10, h10, (String) null) != null || DynamiteModule.a(u10, "com.google.android.gms.auth.api.fallback") == 0) {
                    i10 = 2;
                    f47953l = 2;
                } else {
                    i10 = 3;
                    f47953l = 3;
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return i10;
    }

    public C8971l<Void> D() {
        return r.b(o.a(j(), u(), F() == 3));
    }

    public C8971l<Void> E() {
        return r.b(o.b(j(), u(), F() == 3));
    }
}
