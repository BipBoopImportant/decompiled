package p0;

import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.L;
import m0.C5546i;
import m0.C5548j;
import m0.t0;
import nI.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp0/D;", "", "value", "Lm0/i;", "animationSpec", "a", "(Lp0/D;FLm0/i;LdI/e;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class z {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {40}, m = "animateScrollBy")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f27169c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f27170d;

        /* renamed from: e  reason: collision with root package name */
        int f27171e;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27170d = obj;
            this.f27171e |= Integer.MIN_VALUE;
            return z.a((C5681D) null, 0.0f, (C5546i<Float>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp0/A;", "LXH/N;", "<anonymous>", "(Lp0/A;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend")
    static final class b extends l implements p<C5678A, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f27172c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f27173d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f27174e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5546i<Float> f27175f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ L f27176g;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "currentValue", "<anonymous parameter 1>", "LXH/N;", "a", "(FF)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements p<Float, Float, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ L f27177c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C5678A f27178d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(L l10, C5678A a10) {
                super(2);
                this.f27177c = l10;
                this.f27178d = a10;
            }

            public final void a(float f10, float f11) {
                L l10 = this.f27177c;
                float f12 = l10.f144345a;
                l10.f144345a = f12 + this.f27178d.a(f10 - f12);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(float f10, C5546i<Float> iVar, L l10, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f27174e = f10;
            this.f27175f = iVar;
            this.f27176g = l10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f27174e, this.f27175f, this.f27176g, eVar);
            bVar.f27173d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(C5678A a10, C17164e<? super C16807N> eVar) {
            return ((b) create(a10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f27172c;
            if (i10 == 0) {
                y.b(obj);
                float f11 = this.f27174e;
                C5546i<Float> iVar = this.f27175f;
                a aVar = new a(this.f27176g, (C5678A) this.f27173d);
                this.f27172c = 1;
                if (t0.e(0.0f, f11, 0.0f, iVar, aVar, this, 4, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(p0.C5681D r7, float r8, m0.C5546i<java.lang.Float> r9, dI.C17164e<? super java.lang.Float> r10) {
        /*
            boolean r0 = r10 instanceof p0.z.a
            if (r0 == 0) goto L_0x0014
            r0 = r10
            p0.z$a r0 = (p0.z.a) r0
            int r1 = r0.f27171e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f27171e = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            p0.z$a r0 = new p0.z$a
            r0.<init>(r10)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r10 = r4.f27170d
            java.lang.Object r0 = eI.C17187b.f()
            int r1 = r4.f27171e
            r2 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 != r2) goto L_0x002f
            java.lang.Object r7 = r4.f27169c
            kotlin.jvm.internal.L r7 = (kotlin.jvm.internal.L) r7
            XH.y.b(r10)
            goto L_0x0055
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            XH.y.b(r10)
            kotlin.jvm.internal.L r10 = new kotlin.jvm.internal.L
            r10.<init>()
            p0.z$b r3 = new p0.z$b
            r1 = 0
            r3.<init>(r8, r9, r10, r1)
            r4.f27169c = r10
            r4.f27171e = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r7 = p0.C5681D.a(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L_0x0054
            return r0
        L_0x0054:
            r7 = r10
        L_0x0055:
            float r7 = r7.f144345a
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.b.d(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.z.a(p0.D, float, m0.i, dI.e):java.lang.Object");
    }

    public static /* synthetic */ Object b(C5681D d10, float f10, C5546i iVar, C17164e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = C5548j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        return a(d10, f10, iVar, eVar);
    }
}
