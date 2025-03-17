package K1;

import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import nI.p;
import pI.C17752b;
import tI.C17978n;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H@¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H@¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0005H@¢\u0006\u0004\b\u0017\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R0\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00058\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006 "}, d2 = {"LK1/h;", "", "", "viewportSize", "Lkotlin/Function2;", "", "LdI/e;", "scrollBy", "<init>", "(ILnI/p;)V", "delta", "LXH/N;", "e", "(FLdI/e;)Ljava/lang/Object;", "d", "()V", "min", "max", "f", "(IILdI/e;)Ljava/lang/Object;", "offset", "c", "(I)I", "g", "a", "I", "b", "LnI/p;", "<set-?>", "F", "()F", "scrollAmount", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class h {

    /* renamed from: a  reason: collision with root package name */
    private final int f8898a;

    /* renamed from: b  reason: collision with root package name */
    private final p<Float, C17164e<? super Float>, Object> f8899b;

    /* renamed from: c  reason: collision with root package name */
    private float f8900c;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.ui.scrollcapture.RelativeScroller", f = "ComposeScrollCaptureCallback.android.kt", l = {306}, m = "scrollBy")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f8901c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f8902d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f8903e;

        /* renamed from: f  reason: collision with root package name */
        int f8904f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f8903e = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8902d = obj;
            this.f8904f |= Integer.MIN_VALUE;
            return this.f8903e.e(0.0f, this);
        }
    }

    public h(int i10, p<? super Float, ? super C17164e<? super Float>, ? extends Object> pVar) {
        this.f8898a = i10;
        this.f8899b = pVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(float r5, dI.C17164e<? super XH.C16807N> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof K1.h.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            K1.h$a r0 = (K1.h.a) r0
            int r1 = r0.f8904f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8904f = r1
            goto L_0x0018
        L_0x0013:
            K1.h$a r0 = new K1.h$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f8902d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f8904f
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f8901c
            K1.h r5 = (K1.h) r5
            XH.y.b(r6)
            goto L_0x004a
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            XH.y.b(r6)
            nI.p<java.lang.Float, dI.e<? super java.lang.Float>, java.lang.Object> r6 = r4.f8899b
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.d(r5)
            r0.f8901c = r4
            r0.f8904f = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r5 = r4
        L_0x004a:
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r0 = r5.f8900c
            float r0 = r0 + r6
            r5.f8900c = r0
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.h.e(float, dI.e):java.lang.Object");
    }

    public final float b() {
        return this.f8900c;
    }

    public final int c(int i10) {
        return C17978n.m(i10 - C17752b.e(this.f8900c), 0, this.f8898a);
    }

    public final void d() {
        this.f8900c = 0.0f;
    }

    public final Object f(int i10, int i11, C17164e<? super C16807N> eVar) {
        if (i10 <= i11) {
            int i12 = i11 - i10;
            int i13 = this.f8898a;
            if (i12 <= i13) {
                float f10 = (float) i10;
                float f11 = this.f8900c;
                if (f10 >= f11 && ((float) i11) <= ((float) i13) + f11) {
                    return C16807N.f139792a;
                }
                if (f10 >= f11) {
                    i10 = i11 - i13;
                }
                Object g10 = g((float) i10, eVar);
                return g10 == C17187b.f() ? g10 : C16807N.f139792a;
            }
            throw new IllegalArgumentException(("Expected range (" + i12 + ") to be ≤ viewportSize=" + this.f8898a).toString());
        }
        throw new IllegalArgumentException(("Expected min=" + i10 + " ≤ max=" + i11).toString());
    }

    public final Object g(float f10, C17164e<? super C16807N> eVar) {
        Object e10 = e(f10 - this.f8900c, eVar);
        return e10 == C17187b.f() ? e10 : C16807N.f139792a;
    }
}
