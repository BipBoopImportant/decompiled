package M0;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import nI.C17642l;
import nI.p;
import o1.C5667g;
import o1.C5668h;
import z1.C6271a;
import z1.e;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001BG\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0016H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR0\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"LM0/f;", "Lz1/a;", "Lkotlin/Function1;", "", "onPull", "Lkotlin/Function2;", "LdI/e;", "", "onRelease", "", "enabled", "<init>", "(LnI/l;LnI/p;Z)V", "Lo1/g;", "available", "Lz1/e;", "source", "C1", "(JI)J", "consumed", "N0", "(JJI)J", "Lc2/y;", "E1", "(JLdI/e;)Ljava/lang/Object;", "a", "LnI/l;", "b", "LnI/p;", "c", "Z", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class f implements C6271a {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<Float, Float> f9108a;

    /* renamed from: b  reason: collision with root package name */
    private final p<Float, C17164e<? super Float>, Object> f9109b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9110c;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", l = {107}, m = "onPreFling-QWom1Mo")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        float f9111c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f9112d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f9113e;

        /* renamed from: f  reason: collision with root package name */
        int f9114f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f9113e = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f9112d = obj;
            this.f9114f |= Integer.MIN_VALUE;
            return this.f9113e.E1(0, this);
        }
    }

    public f(C17642l<? super Float, Float> lVar, p<? super Float, ? super C17164e<? super Float>, ? extends Object> pVar, boolean z10) {
        this.f9108a = lVar;
        this.f9109b = pVar;
        this.f9110c = z10;
    }

    public long C1(long j10, int i10) {
        return !this.f9110c ? C5667g.f26701b.c() : (!e.d(i10, e.f32374a.b()) || C5667g.n(j10) >= 0.0f) ? C5667g.f26701b.c() : C5668h.a(0.0f, this.f9108a.invoke(Float.valueOf(C5667g.n(j10))).floatValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object E1(long r5, dI.C17164e<? super c2.y> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof M0.f.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            M0.f$a r0 = (M0.f.a) r0
            int r1 = r0.f9114f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9114f = r1
            goto L_0x0018
        L_0x0013:
            M0.f$a r0 = new M0.f$a
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f9112d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f9114f
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            float r5 = r0.f9111c
            XH.y.b(r7)
            goto L_0x004d
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            XH.y.b(r7)
            nI.p<java.lang.Float, dI.e<? super java.lang.Float>, java.lang.Object> r7 = r4.f9109b
            float r5 = c2.y.i(r5)
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.d(r5)
            r6 = 0
            r0.f9111c = r6
            r0.f9114f = r3
            java.lang.Object r7 = r7.invoke(r5, r0)
            if (r7 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r5 = r6
        L_0x004d:
            java.lang.Number r7 = (java.lang.Number) r7
            float r6 = r7.floatValue()
            long r5 = c2.z.a(r5, r6)
            c2.y r5 = c2.y.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.f.E1(long, dI.e):java.lang.Object");
    }

    public long N0(long j10, long j11, int i10) {
        return !this.f9110c ? C5667g.f26701b.c() : (!e.d(i10, e.f32374a.b()) || C5667g.n(j11) <= 0.0f) ? C5667g.f26701b.c() : C5668h.a(0.0f, this.f9108a.invoke(Float.valueOf(C5667g.n(j11))).floatValue());
    }
}
