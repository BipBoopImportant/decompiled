package H9;

import G9.C6521b;
import K9.C6620s;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import xa.C8972m;

/* renamed from: H9.t  reason: case insensitive filesystem */
public abstract class C6545t<A extends a.b, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final C6521b[] f36636a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f36637b;

    /* renamed from: c  reason: collision with root package name */
    private final int f36638c;

    /* renamed from: H9.t$a */
    public static class a<A extends a.b, ResultT> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public C6542p f36639a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f36640b = true;

        /* renamed from: c  reason: collision with root package name */
        private C6521b[] f36641c;

        /* renamed from: d  reason: collision with root package name */
        private int f36642d = 0;

        /* synthetic */ a(j0 j0Var) {
        }

        public C6545t<A, ResultT> a() {
            C6620s.b(this.f36639a != null, "execute parameter required");
            return new i0(this, this.f36641c, this.f36640b, this.f36642d);
        }

        public a<A, ResultT> b(C6542p<A, C8972m<ResultT>> pVar) {
            this.f36639a = pVar;
            return this;
        }

        public a<A, ResultT> c(boolean z10) {
            this.f36640b = z10;
            return this;
        }

        public a<A, ResultT> d(C6521b... bVarArr) {
            this.f36641c = bVarArr;
            return this;
        }

        public a<A, ResultT> e(int i10) {
            this.f36642d = i10;
            return this;
        }
    }

    protected C6545t(C6521b[] bVarArr, boolean z10, int i10) {
        this.f36636a = bVarArr;
        boolean z11 = false;
        if (bVarArr != null && z10) {
            z11 = true;
        }
        this.f36637b = z11;
        this.f36638c = i10;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>((j0) null);
    }

    /* access modifiers changed from: protected */
    public abstract void b(A a10, C8972m<ResultT> mVar);

    public boolean c() {
        return this.f36637b;
    }

    public final int d() {
        return this.f36638c;
    }

    public final C6521b[] e() {
        return this.f36636a;
    }
}
