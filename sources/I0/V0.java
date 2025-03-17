package I0;

import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.p1;
import XH.C16807N;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5525D;
import m0.C5534c;
import m0.C5548j;
import n0.C5601g;
import nI.C17642l;
import p1.C5747v0;
import p1.j1;
import r0.C5814f;
import r0.k;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aH\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\u00008\nX\u0002"}, d2 = {"", "enabled", "isError", "Lr0/k;", "interactionSource", "LI0/T0;", "colors", "Lc2/h;", "focusedBorderThickness", "unfocusedBorderThickness", "LU0/A1;", "Ln0/g;", "b", "(ZZLr0/k;LI0/T0;FFLU0/m;I)LU0/A1;", "focused", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class V0 {
    /* access modifiers changed from: private */
    public static final A1<C5601g> b(boolean z10, boolean z11, k kVar, T0 t02, float f10, float f11, C4889m mVar, int i10) {
        A1<h> a12;
        if (C4895p.J()) {
            C4895p.S(1097899920, i10, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:982)");
        }
        A1<Boolean> a10 = C5814f.a(kVar, mVar, (i10 >> 6) & 14);
        A1<C5747v0> d10 = t02.d(z10, z11, kVar, mVar, i10 & 8190);
        float f12 = c(a10) ? f10 : f11;
        if (z10) {
            mVar.W(772641254);
            a12 = C5534c.c(f12, C5548j.j(150, 0, (C5525D) null, 6, (Object) null), (String) null, (C17642l<? super h, C16807N>) null, mVar, 48, 12);
            mVar.P();
        } else {
            mVar.W(772737540);
            a12 = p1.q(h.m(f11), mVar, (i10 >> 15) & 14);
            mVar.P();
        }
        A1<C5601g> q10 = p1.q(new C5601g(a12.getValue().G(), new j1(d10.getValue().y(), (DefaultConstructorMarker) null), (DefaultConstructorMarker) null), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        return q10;
    }

    private static final boolean c(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }
}
