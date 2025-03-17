package H9;

import G9.C6521b;
import H9.C6536j;
import K9.C6620s;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import xa.C8972m;

/* renamed from: H9.o  reason: case insensitive filesystem */
public class C6541o<A extends a.b, L> {

    /* renamed from: a  reason: collision with root package name */
    public final C6540n<A, L> f36615a;

    /* renamed from: b  reason: collision with root package name */
    public final C6547v f36616b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f36617c;

    /* renamed from: H9.o$a */
    public static class a<A extends a.b, L> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public C6542p f36618a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public C6542p f36619b;

        /* renamed from: c  reason: collision with root package name */
        private Runnable f36620c = Z.f36544a;

        /* renamed from: d  reason: collision with root package name */
        private C6536j f36621d;

        /* renamed from: e  reason: collision with root package name */
        private C6521b[] f36622e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f36623f = true;

        /* renamed from: g  reason: collision with root package name */
        private int f36624g;

        /* synthetic */ a(c0 c0Var) {
        }

        public C6541o<A, L> a() {
            boolean z10 = false;
            C6620s.b(this.f36618a != null, "Must set register function");
            C6620s.b(this.f36619b != null, "Must set unregister function");
            if (this.f36621d != null) {
                z10 = true;
            }
            C6620s.b(z10, "Must set holder");
            return new C6541o<>(new a0(this, this.f36621d, this.f36622e, this.f36623f, this.f36624g), new b0(this, (C6536j.a) C6620s.m(this.f36621d.b(), "Key must not be null")), this.f36620c, (d0) null);
        }

        public a<A, L> b(C6542p<A, C8972m<Void>> pVar) {
            this.f36618a = pVar;
            return this;
        }

        public a<A, L> c(boolean z10) {
            this.f36623f = z10;
            return this;
        }

        public a<A, L> d(C6521b... bVarArr) {
            this.f36622e = bVarArr;
            return this;
        }

        public a<A, L> e(int i10) {
            this.f36624g = i10;
            return this;
        }

        public a<A, L> f(C6542p<A, C8972m<Boolean>> pVar) {
            this.f36619b = pVar;
            return this;
        }

        public a<A, L> g(C6536j<L> jVar) {
            this.f36621d = jVar;
            return this;
        }
    }

    /* synthetic */ C6541o(C6540n nVar, C6547v vVar, Runnable runnable, d0 d0Var) {
        this.f36615a = nVar;
        this.f36616b = vVar;
        this.f36617c = runnable;
    }

    public static <A extends a.b, L> a<A, L> a() {
        return new a<>((c0) null);
    }
}
