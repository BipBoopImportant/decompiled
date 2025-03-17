package x0;

import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import p0.C5678A;
import p0.H;
import p0.s;
import pI.C17752b;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u00020\t*\u00020\b2\u0006\u0010\n\u001a\u00020\tH@¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lx0/E;", "Lp0/s;", "Lp0/H;", "originalFlingBehavior", "Lx0/C;", "pagerState", "<init>", "(Lp0/H;Lx0/C;)V", "Lp0/A;", "", "initialVelocity", "a", "(Lp0/A;FLdI/e;)Ljava/lang/Object;", "Lp0/H;", "getOriginalFlingBehavior", "()Lp0/H;", "b", "Lx0/C;", "d", "()Lx0/C;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x0.E  reason: case insensitive filesystem */
final class C6232E implements s {

    /* renamed from: a  reason: collision with root package name */
    private final H f31634a;

    /* renamed from: b  reason: collision with root package name */
    private final C6230C f31635b;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "LazyLayoutPager.kt", l = {383}, m = "performFling")
    /* renamed from: x0.E$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f31636c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6232E f31637d;

        /* renamed from: e  reason: collision with root package name */
        int f31638e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6232E e10, C17164e<? super a> eVar) {
            super(eVar);
            this.f31637d = e10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31636c = obj;
            this.f31638e |= Integer.MIN_VALUE;
            return this.f31637d.a((C5678A) null, 0.0f, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "remainingScrollOffset", "LXH/N;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x0.E$b */
    static final class b extends C17544u implements C17642l<Float, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6232E f31639c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5678A f31640d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C6232E e10, C5678A a10) {
            super(1);
            this.f31639c = e10;
            this.f31640d = a10;
        }

        public final void a(float f10) {
            this.f31639c.d().n0(this.f31640d, C17752b.e(this.f31639c.d().I() != 0 ? f10 / ((float) this.f31639c.d().I()) : 0.0f) + this.f31639c.d().v());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return C16807N.f139792a;
        }
    }

    public C6232E(H h10, C6230C c10) {
        this.f31634a = h10;
        this.f31635b = c10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(p0.C5678A r5, float r6, dI.C17164e<? super java.lang.Float> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof x0.C6232E.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            x0.E$a r0 = (x0.C6232E.a) r0
            int r1 = r0.f31638e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f31638e = r1
            goto L_0x0018
        L_0x0013:
            x0.E$a r0 = new x0.E$a
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f31636c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f31638e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            XH.y.b(r7)
            goto L_0x0044
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            XH.y.b(r7)
            p0.H r7 = r4.f31634a
            x0.E$b r2 = new x0.E$b
            r2.<init>(r4, r5)
            r0.f31638e = r3
            java.lang.Object r7 = r7.b(r5, r6, r2, r0)
            if (r7 != r1) goto L_0x0044
            return r1
        L_0x0044:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.d(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C6232E.a(p0.A, float, dI.e):java.lang.Object");
    }

    public final C6230C d() {
        return this.f31635b;
    }
}
