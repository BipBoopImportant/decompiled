package N0;

import G1.C4515s;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import j0.N;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import o1.C5667g;
import p1.C5747v0;
import p1.C5753y0;
import r0.k;
import r0.o;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0015*\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"LN0/c;", "LN0/n;", "Lr0/k;", "interactionSource", "", "bounded", "Lc2/h;", "radius", "Lp1/y0;", "color", "Lkotlin/Function0;", "LN0/g;", "rippleAlpha", "<init>", "(Lr0/k;ZFLp1/y0;LnI/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lr0/o$b;", "interaction", "Lo1/m;", "size", "", "targetRadius", "LXH/N;", "H2", "(Lr0/o$b;JF)V", "O2", "(Lr0/o$b;)V", "Lr1/f;", "I2", "(Lr1/f;)V", "n2", "()V", "Lj0/N;", "LN0/h;", "y", "Lj0/N;", "ripples", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends n {
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final N<o.b, h> f9179y;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.material.ripple.CommonRippleNode$addRipple$2", f = "CommonRipple.kt", l = {88}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f9180c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f9181d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f9182e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ o.b f9183f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, c cVar, o.b bVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f9181d = hVar;
            this.f9182e = cVar;
            this.f9183f = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f9181d, this.f9182e, this.f9183f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f9180c;
            if (i10 == 0) {
                y.b(obj);
                h hVar = this.f9181d;
                this.f9180c = 1;
                if (hVar.d(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    this.f9182e.f9179y.p(this.f9183f);
                    C4515s.a(this.f9182e);
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f9182e.f9179y.p(this.f9183f);
            C4515s.a(this.f9182e);
            return C16807N.f139792a;
        }
    }

    public /* synthetic */ c(k kVar, boolean z10, float f10, C5753y0 y0Var, C17631a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, z10, f10, y0Var, aVar);
    }

    public void H2(o.b bVar, long j10, float f10) {
        o.b bVar2 = bVar;
        N<o.b, h> n10 = this.f9179y;
        Object[] objArr = n10.f24569b;
        Object[] objArr2 = n10.f24570c;
        long[] jArr = n10.f24568a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j11 = jArr[i10];
                if ((((~j11) << 7) & j11 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j11) < 128) {
                            int i13 = (i10 << 3) + i12;
                            o.b bVar3 = (o.b) objArr[i13];
                            ((h) objArr2[i13]).h();
                        }
                        j11 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        h hVar = new h(J2() ? C5667g.d(bVar.a()) : null, f10, J2(), (DefaultConstructorMarker) null);
        this.f9179y.s(bVar2, hVar);
        F0 unused = C16314k.d(c2(), (C17168i) null, (T) null, new a(hVar, this, bVar2, (C17164e<? super a>) null), 3, (Object) null);
        C4515s.a(this);
    }

    public void I2(r1.f fVar) {
        float f10;
        int i10;
        int i11;
        float f11;
        int i12;
        float d10 = K2().invoke().d();
        if (d10 == 0.0f) {
            return;
        }
        N<o.b, h> n10 = this.f9179y;
        Object[] objArr = n10.f24569b;
        Object[] objArr2 = n10.f24570c;
        long[] jArr = n10.f24568a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j10 = jArr[i13];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    long j11 = j10;
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j11 & 255) < 128) {
                            int i17 = (i13 << 3) + i16;
                            o.b bVar = (o.b) objArr[i17];
                            float f12 = d10;
                            i11 = i16;
                            i10 = i15;
                            f11 = d10;
                            i12 = i14;
                            ((h) objArr2[i17]).e(fVar, C5747v0.o(L2(), f12, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                        } else {
                            r1.f fVar2 = fVar;
                            f11 = d10;
                            i11 = i16;
                            i10 = i15;
                            i12 = i14;
                        }
                        j11 >>= i12;
                        i16 = i11 + 1;
                        i14 = i12;
                        d10 = f11;
                        i15 = i10;
                    }
                    r1.f fVar3 = fVar;
                    f10 = d10;
                    if (i15 != i14) {
                        return;
                    }
                } else {
                    r1.f fVar4 = fVar;
                    f10 = d10;
                }
                if (i13 != length) {
                    i13++;
                    d10 = f10;
                } else {
                    return;
                }
            }
        }
    }

    public void O2(o.b bVar) {
        h c10 = this.f9179y.c(bVar);
        if (c10 != null) {
            c10.h();
        }
    }

    public void n2() {
        this.f9179y.i();
    }

    private c(k kVar, boolean z10, float f10, C5753y0 y0Var, C17631a<g> aVar) {
        super(kVar, z10, f10, y0Var, aVar, (DefaultConstructorMarker) null);
        this.f9179y = new N<>(0, 1, (DefaultConstructorMarker) null);
    }
}
