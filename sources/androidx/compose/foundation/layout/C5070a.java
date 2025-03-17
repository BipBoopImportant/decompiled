package androidx.compose.foundation.layout;

import E1.C4468a;
import E1.C4469b;
import E1.C4483p;
import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5133t0;
import androidx.compose.ui.platform.C5137v0;
import c2.C5267b;
import c2.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import tI.C17978n;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a2\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a>\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/d;", "LE1/a;", "alignmentLine", "Lc2/h;", "before", "after", "e", "(Landroidx/compose/ui/d;LE1/a;FF)Landroidx/compose/ui/d;", "top", "bottom", "g", "(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "c", "(LE1/K;LE1/a;FFLE1/H;J)LE1/J;", "", "d", "(LE1/a;)Z", "horizontal", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.a  reason: case insensitive filesystem */
public final class C5070a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.a$a  reason: collision with other inner class name */
    static final class C0263a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4468a f18053c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f18054d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f18055e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f18056f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f18057g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a0 f18058h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f18059i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0263a(C4468a aVar, float f10, int i10, int i11, int i12, a0 a0Var, int i13) {
            super(1);
            this.f18053c = aVar;
            this.f18054d = f10;
            this.f18055e = i10;
            this.f18056f = i11;
            this.f18057g = i12;
            this.f18058h = a0Var;
            this.f18059i = i13;
        }

        public final void a(a0.a aVar) {
            int i10;
            int i11 = 0;
            if (C5070a.d(this.f18053c)) {
                i10 = 0;
            } else {
                i10 = !h.D(this.f18054d, h.f23031b.c()) ? this.f18055e : (this.f18056f - this.f18057g) - this.f18058h.E0();
            }
            if (C5070a.d(this.f18053c)) {
                i11 = !h.D(this.f18054d, h.f23031b.c()) ? this.f18055e : (this.f18059i - this.f18057g) - this.f18058h.z0();
            }
            a0.a.m(aVar, this.f18058h, i10, i11, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.a$b */
    public static final class b extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4468a f18060c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f18061d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f18062e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C4468a aVar, float f10, float f11) {
            super(1);
            this.f18060c = aVar;
            this.f18061d = f10;
            this.f18062e = f11;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("paddingFrom");
            v0Var.a().c("alignmentLine", this.f18060c);
            v0Var.a().c("before", h.m(this.f18061d));
            v0Var.a().c("after", h.m(this.f18062e));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final J c(K k10, C4468a aVar, float f10, float f11, H h10, long j10) {
        K k11 = k10;
        float f12 = f10;
        float f13 = f11;
        a0 i02 = h10.i0(d(aVar) ? C5267b.d(j10, 0, 0, 0, 0, 11, (Object) null) : C5267b.d(j10, 0, 0, 0, 0, 14, (Object) null));
        C4468a aVar2 = aVar;
        int n02 = i02.n0(aVar);
        if (n02 == Integer.MIN_VALUE) {
            n02 = 0;
        }
        int z02 = d(aVar) ? i02.z0() : i02.E0();
        int k12 = d(aVar) ? C5267b.k(j10) : C5267b.l(j10);
        h.a aVar3 = h.f23031b;
        int i10 = k12 - z02;
        int m10 = C17978n.m((!h.D(f12, aVar3.c()) ? k10.K0(f12) : 0) - n02, 0, i10);
        int m11 = C17978n.m(((!h.D(f13, aVar3.c()) ? k10.K0(f13) : 0) - z02) + n02, 0, i10 - m10);
        int E02 = d(aVar) ? i02.E0() : Math.max(i02.E0() + m10 + m11, C5267b.n(j10));
        int max = d(aVar) ? Math.max(i02.z0() + m10 + m11, C5267b.m(j10)) : i02.z0();
        return K.v0(k10, E02, max, (Map) null, new C0263a(aVar, f10, m10, E02, m11, i02, max), 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final boolean d(C4468a aVar) {
        return aVar instanceof C4483p;
    }

    public static final d e(d dVar, C4468a aVar, float f10, float f11) {
        return dVar.s(new AlignmentLineOffsetDpElement(aVar, f10, f11, C5133t0.b() ? new b(aVar, f10, f11) : C5133t0.a(), (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ d f(d dVar, C4468a aVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = h.f23031b.c();
        }
        if ((i10 & 4) != 0) {
            f11 = h.f23031b.c();
        }
        return e(dVar, aVar, f10, f11);
    }

    public static final d g(d dVar, float f10, float f11) {
        h.a aVar = h.f23031b;
        return dVar.s(!h.D(f10, aVar.c()) ? f(d.f18749a, C4469b.a(), f10, 0.0f, 4, (Object) null) : d.f18749a).s(!h.D(f11, aVar.c()) ? f(d.f18749a, C4469b.b(), 0.0f, f11, 2, (Object) null) : d.f18749a);
    }
}
