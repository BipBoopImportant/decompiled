package H9;

import G9.C6521b;
import H9.C6536j;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import xa.C8972m;

/* renamed from: H9.n  reason: case insensitive filesystem */
public abstract class C6540n<A extends a.b, L> {

    /* renamed from: a  reason: collision with root package name */
    private final C6536j f36608a;

    /* renamed from: b  reason: collision with root package name */
    private final C6521b[] f36609b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f36610c;

    /* renamed from: d  reason: collision with root package name */
    private final int f36611d;

    protected C6540n(C6536j<L> jVar, C6521b[] bVarArr, boolean z10, int i10) {
        this.f36608a = jVar;
        this.f36609b = bVarArr;
        this.f36610c = z10;
        this.f36611d = i10;
    }

    public void a() {
        this.f36608a.a();
    }

    public C6536j.a<L> b() {
        return this.f36608a.b();
    }

    public C6521b[] c() {
        return this.f36609b;
    }

    /* access modifiers changed from: protected */
    public abstract void d(A a10, C8972m<Void> mVar);

    public final int e() {
        return this.f36611d;
    }

    public final boolean f() {
        return this.f36610c;
    }
}
