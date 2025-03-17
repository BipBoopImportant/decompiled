package com.google.android.gms.wallet;

import Da.i;
import K9.C6619q;
import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.a;
import java.util.Locale;
import ma.s;
import ma.x;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<a> f50605a;

    /* renamed from: b  reason: collision with root package name */
    private static final a.g f50606b;

    /* renamed from: c  reason: collision with root package name */
    private static final a.C0821a f50607c;

    /* renamed from: d  reason: collision with root package name */
    public static final i f50608d = new ma.b();
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public static final s f50609e = new s();

    /* renamed from: f  reason: collision with root package name */
    public static final x f50610f = new x();

    static {
        a.g gVar = new a.g();
        f50606b = gVar;
        c cVar = new c();
        f50607c = cVar;
        f50605a = new com.google.android.gms.common.api.a<>("Wallet.API", cVar, gVar);
    }

    public static PaymentsClient a(Context context, a aVar) {
        return new PaymentsClient(context, aVar);
    }

    public static final class a implements a.d.C0822a {

        /* renamed from: a  reason: collision with root package name */
        public final int f50611a;

        /* renamed from: b  reason: collision with root package name */
        public final int f50612b;

        /* renamed from: c  reason: collision with root package name */
        public final Account f50613c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f50614d;

        /* renamed from: com.google.android.gms.wallet.b$a$a  reason: collision with other inner class name */
        public static final class C0825a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public int f50615a = 3;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public int f50616b = 1;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public boolean f50617c = true;

            public a a() {
                return new a(this);
            }

            public C0825a b(int i10) {
                if (i10 != 0) {
                    if (i10 == 0) {
                        i10 = 0;
                    } else if (!(i10 == 2 || i10 == 1 || i10 == 23 || i10 == 3)) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", new Object[]{Integer.valueOf(i10)}));
                    }
                }
                this.f50615a = i10;
                return this;
            }
        }

        private a(C0825a aVar) {
            this.f50611a = aVar.f50615a;
            this.f50612b = aVar.f50616b;
            this.f50614d = aVar.f50617c;
            this.f50613c = null;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C6619q.b(Integer.valueOf(this.f50611a), Integer.valueOf(aVar.f50611a)) && C6619q.b(Integer.valueOf(this.f50612b), Integer.valueOf(aVar.f50612b)) && C6619q.b((Object) null, (Object) null) && C6619q.b(Boolean.valueOf(this.f50614d), Boolean.valueOf(aVar.f50614d));
            }
        }

        public int hashCode() {
            return C6619q.c(Integer.valueOf(this.f50611a), Integer.valueOf(this.f50612b), null, Boolean.valueOf(this.f50614d));
        }

        public Account t() {
            return null;
        }

        private a() {
            this(new C0825a());
        }
    }
}
