package com.google.android.gms.common.api;

import H9.C6527a;
import H9.C6528b;
import H9.C6531e;
import H9.C6536j;
import H9.C6537k;
import H9.C6538l;
import H9.C6541o;
import H9.C6545t;
import H9.C6551z;
import H9.I;
import H9.N;
import H9.h0;
import H9.r;
import K9.C6604c;
import K9.C6607e;
import K9.C6620s;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;
import xa.C8971l;
import xa.C8972m;

public abstract class f<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f48000a;

    /* renamed from: b  reason: collision with root package name */
    private final String f48001b;

    /* renamed from: c  reason: collision with root package name */
    private final a f48002c;

    /* renamed from: d  reason: collision with root package name */
    private final a.d f48003d;

    /* renamed from: e  reason: collision with root package name */
    private final C6528b f48004e;

    /* renamed from: f  reason: collision with root package name */
    private final Looper f48005f;

    /* renamed from: g  reason: collision with root package name */
    private final int f48006g;

    /* renamed from: h  reason: collision with root package name */
    private final g f48007h;

    /* renamed from: i  reason: collision with root package name */
    private final r f48008i;

    /* renamed from: j  reason: collision with root package name */
    protected final C6531e f48009j;

    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f48010c = new C0823a().a();

        /* renamed from: a  reason: collision with root package name */
        public final r f48011a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f48012b;

        /* renamed from: com.google.android.gms.common.api.f$a$a  reason: collision with other inner class name */
        public static class C0823a {

            /* renamed from: a  reason: collision with root package name */
            private r f48013a;

            /* renamed from: b  reason: collision with root package name */
            private Looper f48014b;

            public a a() {
                if (this.f48013a == null) {
                    this.f48013a = new C6527a();
                }
                if (this.f48014b == null) {
                    this.f48014b = Looper.getMainLooper();
                }
                return new a(this.f48013a, this.f48014b);
            }

            public C0823a b(r rVar) {
                C6620s.m(rVar, "StatusExceptionMapper must not be null.");
                this.f48013a = rVar;
                return this;
            }
        }

        private a(r rVar, Account account, Looper looper) {
            this.f48011a = rVar;
            this.f48012b = looper;
        }
    }

    public f(Activity activity, a<O> aVar, O o10, a aVar2) {
        this(activity, activity, aVar, o10, aVar2);
    }

    private final com.google.android.gms.common.api.internal.a B(int i10, com.google.android.gms.common.api.internal.a aVar) {
        aVar.j();
        this.f48009j.C(this, i10, aVar);
        return aVar;
    }

    private final C8971l C(int i10, C6545t tVar) {
        C8972m mVar = new C8972m();
        this.f48009j.D(this, i10, tVar, mVar, this.f48008i);
        return mVar.a();
    }

    public final h0 A(Context context, Handler handler) {
        return new h0(context, handler, k().a());
    }

    public g j() {
        return this.f48007h;
    }

    /* access modifiers changed from: protected */
    public C6607e.a k() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount s10;
        C6607e.a aVar = new C6607e.a();
        a.d dVar = this.f48003d;
        if (!(dVar instanceof a.d.b) || (s10 = ((a.d.b) dVar).s()) == null) {
            a.d dVar2 = this.f48003d;
            account = dVar2 instanceof a.d.C0822a ? ((a.d.C0822a) dVar2).t() : null;
        } else {
            account = s10.t();
        }
        aVar.d(account);
        a.d dVar3 = this.f48003d;
        if (dVar3 instanceof a.d.b) {
            GoogleSignInAccount s11 = ((a.d.b) dVar3).s();
            set = s11 == null ? Collections.emptySet() : s11.N0();
        } else {
            set = Collections.emptySet();
        }
        aVar.c(set);
        aVar.e(this.f48000a.getClass().getName());
        aVar.b(this.f48000a.getPackageName());
        return aVar;
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends n, A>> T l(T t10) {
        B(2, t10);
        return t10;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> C8971l<TResult> m(C6545t<A, TResult> tVar) {
        return C(2, tVar);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> C8971l<TResult> n(C6545t<A, TResult> tVar) {
        return C(0, tVar);
    }

    @ResultIgnorabilityUnspecified
    public <A extends a.b> C8971l<Void> o(C6541o<A, ?> oVar) {
        C6620s.l(oVar);
        C6620s.m(oVar.f36615a.b(), "Listener has already been released.");
        C6620s.m(oVar.f36616b.a(), "Listener has already been released.");
        return this.f48009j.w(this, oVar.f36615a, oVar.f36616b, oVar.f36617c);
    }

    @ResultIgnorabilityUnspecified
    public C8971l<Boolean> p(C6536j.a<?> aVar, int i10) {
        C6620s.m(aVar, "Listener key cannot be null.");
        return this.f48009j.x(this, aVar, i10);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends n, A>> T q(T t10) {
        B(1, t10);
        return t10;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> C8971l<TResult> r(C6545t<A, TResult> tVar) {
        return C(1, tVar);
    }

    /* access modifiers changed from: protected */
    public String s(Context context) {
        return null;
    }

    public final C6528b<O> t() {
        return this.f48004e;
    }

    public Context u() {
        return this.f48000a;
    }

    /* access modifiers changed from: protected */
    public String v() {
        return this.f48001b;
    }

    public Looper w() {
        return this.f48005f;
    }

    public <L> C6536j<L> x(L l10, String str) {
        return C6537k.a(l10, this.f48005f, str);
    }

    public final int y() {
        return this.f48006g;
    }

    public final a.f z(Looper looper, I i10) {
        a.f b10 = ((a.C0821a) C6620s.l(this.f48002c.a())).b(this.f48000a, looper, k().a(), this.f48003d, i10, i10);
        String v10 = v();
        if (v10 != null && (b10 instanceof C6604c)) {
            ((C6604c) b10).P(v10);
        }
        if (v10 != null && (b10 instanceof C6538l)) {
            ((C6538l) b10).r(v10);
        }
        return b10;
    }

    private f(Context context, Activity activity, a aVar, a.d dVar, a aVar2) {
        String str;
        C6620s.m(context, "Null context is not permitted.");
        C6620s.m(aVar, "Api must not be null.");
        C6620s.m(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) C6620s.m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f48000a = context2;
        if (Build.VERSION.SDK_INT >= 30) {
            str = context.getAttributionTag();
        } else {
            str = s(context);
        }
        this.f48001b = str;
        this.f48002c = aVar;
        this.f48003d = dVar;
        this.f48005f = aVar2.f48012b;
        C6528b a10 = C6528b.a(aVar, dVar, str);
        this.f48004e = a10;
        this.f48007h = new N(this);
        C6531e u10 = C6531e.u(context2);
        this.f48009j = u10;
        this.f48006g = u10.l();
        this.f48008i = aVar2.f48011a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C6551z.u(activity, u10, a10);
        }
        u10.H(this);
    }

    public f(Context context, a<O> aVar, O o10, a aVar2) {
        this(context, (Activity) null, aVar, o10, aVar2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(android.content.Context r2, com.google.android.gms.common.api.a<O> r3, O r4, H9.r r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.f$a$a r0 = new com.google.android.gms.common.api.f$a$a
            r0.<init>()
            r0.b(r5)
            com.google.android.gms.common.api.f$a r5 = r0.a()
            r1.<init>((android.content.Context) r2, r3, r4, (com.google.android.gms.common.api.f.a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.f.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, H9.r):void");
    }
}
