package jH;

import android.content.Context;
import androidx.activity.j;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import cH.C17062a;
import dH.C17157a;
import dH.C17158b;
import eH.C17180b;
import hH.C17323b;
import iH.C17359f;
import mH.C17599b;

/* renamed from: jH.b  reason: case insensitive filesystem */
final class C17405b implements C17599b<C17180b> {

    /* renamed from: a  reason: collision with root package name */
    private final k0 f143948a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f143949b;

    /* renamed from: c  reason: collision with root package name */
    private volatile C17180b f143950c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f143951d = new Object();

    /* renamed from: jH.b$a */
    class a implements i0.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f143952a;

        a(Context context) {
            this.f143952a = context;
        }

        public <T extends f0> T create(Class<T> cls, l3.a aVar) {
            C17411h hVar = new C17411h(aVar);
            return new c(((C3516b) C17158b.b(this.f143952a, C3516b.class)).g().a(hVar).g(), hVar);
        }
    }

    /* renamed from: jH.b$b  reason: collision with other inner class name */
    public interface C3516b {
        C17323b g();
    }

    /* renamed from: jH.b$c */
    static final class c extends f0 {

        /* renamed from: m  reason: collision with root package name */
        private final C17180b f143954m;

        /* renamed from: n  reason: collision with root package name */
        private final C17411h f143955n;

        c(C17180b bVar, C17411h hVar) {
            this.f143954m = bVar;
            this.f143955n = hVar;
        }

        /* access modifiers changed from: package-private */
        public C17180b C() {
            return this.f143954m;
        }

        /* access modifiers changed from: package-private */
        public C17411h D() {
            return this.f143955n;
        }

        /* access modifiers changed from: protected */
        public void onCleared() {
            super.onCleared();
            ((C17359f) ((d) C17062a.a(this.f143954m, d.class)).b()).b();
        }
    }

    /* renamed from: jH.b$d */
    public interface d {
        C17157a b();
    }

    /* renamed from: jH.b$e */
    static abstract class e {
        static C17157a a() {
            return new C17359f();
        }
    }

    C17405b(j jVar) {
        this.f143948a = jVar;
        this.f143949b = jVar;
    }

    private C17180b a() {
        return ((c) d(this.f143948a, this.f143949b).a(c.class)).C();
    }

    private i0 d(k0 k0Var, Context context) {
        return new i0(k0Var, (i0.c) new a(context));
    }

    /* renamed from: b */
    public C17180b g0() {
        if (this.f143950c == null) {
            synchronized (this.f143951d) {
                try {
                    if (this.f143950c == null) {
                        this.f143950c = a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f143950c;
    }

    public C17411h c() {
        return ((c) d(this.f143948a, this.f143949b).a(c.class)).D();
    }
}
