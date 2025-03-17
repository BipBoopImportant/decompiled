package U5;

import E1.B;
import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import V5.l;
import XH.C16807N;
import XH.x;
import c2.C5267b;
import dI.C17164e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H@¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LU5/j;", "Ll6/j;", "LE1/B;", "<init>", "()V", "Ll6/h;", "b", "(LdI/e;)Ljava/lang/Object;", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "LXH/N;", "B", "(J)V", "d", "J", "latestConstraints", "LdI/e;", "e", "LdI/e;", "continuation", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements l6.j, B {

    /* renamed from: d  reason: collision with root package name */
    private long f40234d = l.g();

    /* renamed from: e  reason: collision with root package name */
    private C17164e<? super C16807N> f40235e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "coil3.compose.ConstraintsSizeResolver", f = "ConstraintsSizeResolver.kt", l = {39}, m = "size")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f40236c;

        /* renamed from: d  reason: collision with root package name */
        Object f40237d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f40238e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j f40239f;

        /* renamed from: g  reason: collision with root package name */
        int f40240g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f40239f = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f40238e = obj;
            this.f40240g |= Integer.MIN_VALUE;
            return this.f40239f.b(this);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A(a0 a0Var, a0.a aVar) {
        a0.a.i(aVar, a0Var, 0, 0, 0.0f, 4, (Object) null);
        return C16807N.f139792a;
    }

    public final void B(long j10) {
        this.f40234d = j10;
        if (!C5267b.p(j10)) {
            C17164e<? super C16807N> eVar = this.f40235e;
            if (eVar != null) {
                x.a aVar = x.f139812b;
                eVar.resumeWith(x.b(C16807N.f139792a));
            }
            this.f40235e = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(dI.C17164e<? super l6.h> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof U5.j.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            U5.j$a r0 = (U5.j.a) r0
            int r1 = r0.f40240g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f40240g = r1
            goto L_0x0018
        L_0x0013:
            U5.j$a r0 = new U5.j$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f40238e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f40240g
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f40237d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r0 = r0.f40236c
            U5.j r0 = (U5.j) r0
            XH.y.b(r7)
            goto L_0x0069
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0039:
            XH.y.b(r7)
            long r4 = r6.f40234d
            boolean r7 = c2.C5267b.p(r4)
            if (r7 == 0) goto L_0x0077
            dI.e<? super XH.N> r7 = r6.f40235e
            r0.f40236c = r6
            r0.f40237d = r7
            r0.f40240g = r3
            dI.k r2 = new dI.k
            dI.e r3 = eI.C17187b.c(r0)
            r2.<init>(r3)
            r6.f40235e = r2
            java.lang.Object r2 = r2.a()
            java.lang.Object r3 = eI.C17187b.f()
            if (r2 != r3) goto L_0x0064
            kotlin.coroutines.jvm.internal.h.c(r0)
        L_0x0064:
            if (r2 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r0 = r6
            r1 = r7
        L_0x0069:
            if (r1 == 0) goto L_0x0078
            XH.x$a r7 = XH.x.f139812b
            XH.N r7 = XH.C16807N.f139792a
            java.lang.Object r7 = XH.x.b(r7)
            r1.resumeWith(r7)
            goto L_0x0078
        L_0x0077:
            r0 = r6
        L_0x0078:
            long r0 = r0.f40234d
            l6.h r7 = V5.l.q(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.j.b(dI.e):java.lang.Object");
    }

    public J h(K k10, H h10, long j10) {
        B(j10);
        a0 i02 = h10.i0(j10);
        return K.v0(k10, i02.E0(), i02.z0(), (Map) null, new i(i02), 4, (Object) null);
    }
}
