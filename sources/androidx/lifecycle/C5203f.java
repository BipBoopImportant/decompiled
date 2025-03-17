package androidx.lifecycle;

import QJ.C16311i0;
import QJ.F0;
import QJ.S;
import QJ.b1;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BE\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012(\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nH@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0013\u0010\u0012R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/f;", "T", "Landroidx/lifecycle/I;", "LdI/i;", "context", "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/G;", "LdI/e;", "LXH/N;", "", "block", "<init>", "(LdI/i;JLnI/p;)V", "e", "(LdI/e;)Ljava/lang/Object;", "onActive", "()V", "onInactive", "Landroidx/lifecycle/c;", "d", "Landroidx/lifecycle/c;", "blockRunner", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.f  reason: case insensitive filesystem */
public final class C5203f<T> extends I<T> {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C5200c<T> f22276d;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.f$a */
    static final class a extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5203f<T> f22277c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5203f<T> fVar) {
            super(0);
            this.f22277c = fVar;
        }

        public final void invoke() {
            this.f22277c.f22276d = null;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {235}, m = "clearSource$lifecycle_livedata_release")
    /* renamed from: androidx.lifecycle.f$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f22278c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f22279d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5203f<T> f22280e;

        /* renamed from: f  reason: collision with root package name */
        int f22281f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5203f<T> fVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f22280e = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f22279d = obj;
            this.f22281f |= Integer.MIN_VALUE;
            return this.f22280e.e(this);
        }
    }

    public C5203f(C17168i iVar, long j10, p<? super G<T>, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        C17542s.j(iVar, "context");
        C17542s.j(pVar, "block");
        p<? super G<T>, ? super C17164e<? super C16807N>, ? extends Object> pVar2 = pVar;
        long j11 = j10;
        this.f22276d = new C5200c(this, pVar2, j11, S.a(C16311i0.c().P0().plus(iVar).plus(b1.a((F0) iVar.get(F0.f137562d0)))), new a(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(dI.C17164e<? super XH.C16807N> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.C5203f.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.lifecycle.f$b r0 = (androidx.lifecycle.C5203f.b) r0
            int r1 = r0.f22281f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f22281f = r1
            goto L_0x0018
        L_0x0013:
            androidx.lifecycle.f$b r0 = new androidx.lifecycle.f$b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f22279d
            eI.C17187b.f()
            int r1 = r0.f22281f
            if (r1 == 0) goto L_0x0034
            r2 = 1
            if (r1 != r2) goto L_0x002c
            java.lang.Object r0 = r0.f22278c
            androidx.lifecycle.f r0 = (androidx.lifecycle.C5203f) r0
            XH.y.b(r5)
            goto L_0x0038
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0034:
            XH.y.b(r5)
            r0 = r4
        L_0x0038:
            r0.getClass()
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C5203f.e(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public void onActive() {
        super.onActive();
        C5200c<T> cVar = this.f22276d;
        if (cVar != null) {
            cVar.h();
        }
    }

    /* access modifiers changed from: protected */
    public void onInactive() {
        super.onInactive();
        C5200c<T> cVar = this.f22276d;
        if (cVar != null) {
            cVar.g();
        }
    }
}
