package kF;

import U0.A1;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.foundation.o;
import androidx.compose.ui.d;
import androidx.compose.ui.draw.b;
import c2.h;
import com.google.ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m0.C5525D;
import m0.C5534c;
import m0.C5548j;
import nI.C17642l;
import o1.C5662b;
import o1.C5668h;
import o1.C5673m;
import o1.C5674n;
import p1.C5747v0;
import p1.C5749w0;
import r1.C5817c;
import r1.f;
import r1.g;
import rF.C15002a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aM\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\u00058\nX\u0002"}, d2 = {"Landroidx/compose/ui/d;", "Landroidx/compose/foundation/o;", "state", "Lp1/v0;", "color", "", "ratio", "Lc2/h;", "width", "cornerRadius", "minScrollHeightThreshold", "b", "(Landroidx/compose/ui/d;Landroidx/compose/foundation/o;JFFFFLU0/m;II)Landroidx/compose/ui/d;", "alpha", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: kF.O  reason: case insensitive filesystem */
public final class C14694O {
    public static final d b(d dVar, o oVar, long j10, float f10, float f11, float f12, float f13, C4889m mVar, int i10, int i11) {
        o oVar2 = oVar;
        C4889m mVar2 = mVar;
        int i12 = i10;
        C17542s.j(dVar, "$this$verticalScrollBar");
        C17542s.j(oVar2, "state");
        mVar2.W(282477544);
        long a10 = (i11 & 2) != 0 ? C15002a.a(mVar2, 0).a() : j10;
        float f14 = (i11 & 4) != 0 ? 3.0f : f10;
        float B10 = (i11 & 8) != 0 ? h.B((float) 6) : f11;
        float B11 = (i11 & 16) != 0 ? h.B((float) 8) : f12;
        float B12 = (i11 & 32) != 0 ? h.B((float) 0) : f13;
        if (C4895p.J()) {
            C4895p.S(282477544, i12, -1, "com.sugarcube.app.base.ui.compose.common.verticalScrollBar (VerticalScrollBar.kt:40)");
        }
        float f15 = B12;
        float f16 = B11;
        float f17 = B10;
        A1<Float> d10 = C5534c.d(oVar.b() ? 1.0f : 0.25f, C5548j.j(oVar.b() ? 150 : 500, 0, (C5525D) null, 6, (Object) null), 0.0f, "", (C17642l<? super Float, C16807N>) null, mVar, 3072, 20);
        mVar2.W(93952716);
        float f18 = f16;
        boolean V10 = ((((i12 & 112) ^ 48) > 32 && mVar2.V(oVar2)) || (i12 & 48) == 32) | mVar2.V(d10) | ((((3670016 & i12) ^ 1572864) > 1048576 && mVar2.c(f15)) || (i12 & 1572864) == 1048576) | ((((i12 & 7168) ^ 3072) > 2048 && mVar2.c(f14)) || (i12 & 3072) == 2048) | ((((i12 & 896) ^ 384) > 256 && mVar2.e(a10)) || (i12 & 384) == 256) | ((((57344 & i12) ^ 24576) > 16384 && mVar2.c(f17)) || (i12 & 24576) == 16384) | ((((458752 & i12) ^ ImageMetadata.EDGE_MODE) > 131072 && mVar2.c(f18)) || (i12 & ImageMetadata.EDGE_MODE) == 131072);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            C14693N n10 = new C14693N(oVar, f15, f14, a10, f17, f18, d10);
            mVar2.u(n10);
            D10 = n10;
        }
        mVar.P();
        d d11 = b.d(dVar, (C17642l) D10);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return d11;
    }

    private static final float c(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N d(o oVar, float f10, float f11, long j10, float f12, float f13, A1 a12, C5817c cVar) {
        float f14 = f12;
        C5817c cVar2 = cVar;
        C17542s.j(cVar2, "$this$drawWithContent");
        cVar.V1();
        boolean z10 = (oVar.b() || c(a12) > 0.0f) && ((float) oVar.m()) > f10;
        float i10 = C5673m.i(cVar.b()) / f11;
        float i11 = (C5673m.i(cVar.b()) - i10) / ((float) oVar.m());
        if (z10) {
            float n10 = ((float) oVar.n()) * i11;
            f.q1(cVar, C5747v0.o(j10, 0.1f, 0.0f, 0.0f, 0.0f, 14, (Object) null), C5668h.a(C5673m.l(cVar.b()) - cVar2.H1(f14), C5673m.i(cVar.b())), C5674n.a(cVar2.H1(f14), C5673m.i(cVar.b())), 0.0f, (g) null, (C5749w0) null, 0, 120, (Object) null);
            f.L1(cVar, C5747v0.o(j10, c(a12), 0.0f, 0.0f, 0.0f, 14, (Object) null), C5668h.a(C5673m.l(cVar.b()) - cVar2.H1(f14), n10), C5674n.a(cVar2.H1(f14), i10), C5662b.b(cVar2.H1(f13), 0.0f, 2, (Object) null), (g) null, 0.0f, (C5749w0) null, 0, 240, (Object) null);
        }
        return C16807N.f139792a;
    }
}
