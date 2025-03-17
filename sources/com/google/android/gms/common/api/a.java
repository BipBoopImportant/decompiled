package com.google.android.gms.common.api;

import G9.C6521b;
import H9.C6530d;
import H9.C6539m;
import K9.C6604c;
import K9.C6607e;
import K9.C6613k;
import K9.C6620s;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.g;
import java.util.Set;

public final class a<O extends d> {

    /* renamed from: a  reason: collision with root package name */
    private final C0821a f47994a;

    /* renamed from: b  reason: collision with root package name */
    private final g f47995b;

    /* renamed from: c  reason: collision with root package name */
    private final String f47996c;

    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    public static abstract class C0821a<T extends f, O> extends e<T, O> {
        public T a(Context context, Looper looper, C6607e eVar, O o10, C6530d dVar, C6539m mVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }

        @Deprecated
        public T b(Context context, Looper looper, C6607e eVar, O o10, g.a aVar, g.b bVar) {
            return a(context, looper, eVar, o10, aVar, bVar);
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: j0  reason: collision with root package name */
        public static final c f47997j0 = new c((r) null);

        /* renamed from: com.google.android.gms.common.api.a$d$a  reason: collision with other inner class name */
        public interface C0822a extends d {
            Account t();
        }

        public interface b extends d {
            GoogleSignInAccount s();
        }

        public static final class c implements d {
            private c() {
            }

            /* synthetic */ c(r rVar) {
            }
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        void a(String str);

        void b(C6613k kVar, Set<Scope> set);

        boolean c();

        String d();

        void e(C6604c.e eVar);

        boolean f();

        boolean g();

        Set<Scope> i();

        void j(C6604c.C0599c cVar);

        void k();

        boolean l();

        int m();

        C6521b[] n();

        String o();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(String str, C0821a<C, O> aVar, g<C> gVar) {
        C6620s.m(aVar, "Cannot construct an Api with a null ClientBuilder");
        C6620s.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f47996c = str;
        this.f47994a = aVar;
        this.f47995b = gVar;
    }

    public final C0821a a() {
        return this.f47994a;
    }

    public final c b() {
        return this.f47995b;
    }

    public final String c() {
        return this.f47996c;
    }
}
