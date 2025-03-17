package androidx.compose.foundation.relocation;

import W0.b;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import o1.C5669i;
import y0.C6248b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H@¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/relocation/a;", "Ly0/b;", "<init>", "()V", "Lo1/i;", "rect", "LXH/N;", "b", "(Lo1/i;LdI/e;)Ljava/lang/Object;", "LW0/b;", "Landroidx/compose/foundation/relocation/e;", "a", "LW0/b;", "c", "()LW0/b;", "modifiers", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class a implements C6248b {

    /* renamed from: a  reason: collision with root package name */
    private final b<e> f18423a = new b<>(new e[16], 0);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {116}, m = "bringIntoView")
    /* renamed from: androidx.compose.foundation.relocation.a$a  reason: collision with other inner class name */
    static final class C0269a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f18424c;

        /* renamed from: d  reason: collision with root package name */
        Object f18425d;

        /* renamed from: e  reason: collision with root package name */
        int f18426e;

        /* renamed from: f  reason: collision with root package name */
        int f18427f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f18428g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f18429h;

        /* renamed from: i  reason: collision with root package name */
        int f18430i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0269a(a aVar, C17164e<? super C0269a> eVar) {
            super(eVar);
            this.f18429h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f18428g = obj;
            this.f18430i |= Integer.MIN_VALUE;
            return this.f18429h.b((C5669i) null, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r8 >= r2) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(o1.C5669i r8, dI.C17164e<? super XH.C16807N> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.relocation.a.C0269a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.foundation.relocation.a$a r0 = (androidx.compose.foundation.relocation.a.C0269a) r0
            int r1 = r0.f18430i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18430i = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.relocation.a$a r0 = new androidx.compose.foundation.relocation.a$a
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f18428g
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f18430i
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            int r8 = r0.f18427f
            int r2 = r0.f18426e
            java.lang.Object r4 = r0.f18425d
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f18424c
            o1.i r5 = (o1.C5669i) r5
            XH.y.b(r9)
            r9 = r5
            goto L_0x0067
        L_0x0036:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003e:
            XH.y.b(r9)
            W0.b<androidx.compose.foundation.relocation.e> r9 = r7.f18423a
            int r2 = r9.r()
            if (r2 <= 0) goto L_0x006a
            java.lang.Object[] r9 = r9.q()
            r4 = 0
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L_0x0052:
            r5 = r4[r8]
            androidx.compose.foundation.relocation.e r5 = (androidx.compose.foundation.relocation.e) r5
            r0.f18424c = r9
            r0.f18425d = r4
            r0.f18426e = r2
            r0.f18427f = r8
            r0.f18430i = r3
            java.lang.Object r5 = y0.C6251e.a(r5, r9, r0)
            if (r5 != r1) goto L_0x0067
            return r1
        L_0x0067:
            int r8 = r8 + r3
            if (r8 < r2) goto L_0x0052
        L_0x006a:
            XH.N r8 = XH.C16807N.f139792a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.a.b(o1.i, dI.e):java.lang.Object");
    }

    public final b<e> c() {
        return this.f18423a;
    }
}
