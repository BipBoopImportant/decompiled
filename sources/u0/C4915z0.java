package U0;

import U0.C4879h0;
import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J*\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\nH@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0013"}, d2 = {"LU0/z0;", "LU0/h0;", "frameClock", "<init>", "(LU0/h0;)V", "LXH/N;", "a", "()V", "b", "R", "Lkotlin/Function1;", "", "onFrame", "i0", "(LnI/l;LdI/e;)Ljava/lang/Object;", "LU0/h0;", "LU0/c0;", "LU0/c0;", "latch", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.z0  reason: case insensitive filesystem */
public final class C4915z0 implements C4879h0 {

    /* renamed from: a  reason: collision with root package name */
    private final C4879h0 f14200a;

    /* renamed from: b  reason: collision with root package name */
    private final C4864c0 f14201b = new C4864c0();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {62, 63}, m = "withFrameNanos")
    /* renamed from: U0.z0$a */
    static final class a<R> extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f14202c;

        /* renamed from: d  reason: collision with root package name */
        Object f14203d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f14204e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4915z0 f14205f;

        /* renamed from: g  reason: collision with root package name */
        int f14206g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C4915z0 z0Var, C17164e<? super a> eVar) {
            super(eVar);
            this.f14205f = z0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f14204e = obj;
            this.f14206g |= Integer.MIN_VALUE;
            return this.f14205f.i0((C17642l) null, this);
        }
    }

    public C4915z0(C4879h0 h0Var) {
        this.f14200a = h0Var;
    }

    public final void a() {
        this.f14201b.d();
    }

    public final void b() {
        this.f14201b.f();
    }

    public <R> R fold(R r10, p<? super R, ? super C17168i.b, ? extends R> pVar) {
        return C4879h0.a.a(this, r10, pVar);
    }

    public <E extends C17168i.b> E get(C17168i.c<E> cVar) {
        return C4879h0.a.b(this, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063 A[PHI: r7 
      PHI: (r7v2 java.lang.Object) = (r7v4 java.lang.Object), (r7v1 java.lang.Object) binds: [B:19:0x0060, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <R> java.lang.Object i0(nI.C17642l<? super java.lang.Long, ? extends R> r6, dI.C17164e<? super R> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof U0.C4915z0.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            U0.z0$a r0 = (U0.C4915z0.a) r0
            int r1 = r0.f14206g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f14206g = r1
            goto L_0x0018
        L_0x0013:
            U0.z0$a r0 = new U0.z0$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f14204e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f14206g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            XH.y.b(r7)
            goto L_0x0063
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.f14203d
            nI.l r6 = (nI.C17642l) r6
            java.lang.Object r2 = r0.f14202c
            U0.z0 r2 = (U0.C4915z0) r2
            XH.y.b(r7)
            goto L_0x0053
        L_0x0040:
            XH.y.b(r7)
            U0.c0 r7 = r5.f14201b
            r0.f14202c = r5
            r0.f14203d = r6
            r0.f14206g = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r2 = r5
        L_0x0053:
            U0.h0 r7 = r2.f14200a
            r2 = 0
            r0.f14202c = r2
            r0.f14203d = r2
            r0.f14206g = r3
            java.lang.Object r7 = r7.i0(r6, r0)
            if (r7 != r1) goto L_0x0063
            return r1
        L_0x0063:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.C4915z0.i0(nI.l, dI.e):java.lang.Object");
    }

    public C17168i minusKey(C17168i.c<?> cVar) {
        return C4879h0.a.c(this, cVar);
    }

    public C17168i plus(C17168i iVar) {
        return C4879h0.a.d(this, iVar);
    }
}
