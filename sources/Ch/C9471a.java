package ch;

import U0.A1;
import U0.C4889m;
import U0.C4895p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5525D;
import m0.C5547i0;
import m0.C5548j;
import m0.M;
import m0.V;
import m0.W;
import m0.X;
import m0.r0;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "label", "", "start", "end", "", "offset", "duration", "Lm0/D;", "easing", "LU0/A1;", "a", "(Ljava/lang/String;FFIILm0/D;LU0/m;II)LU0/A1;", "giftcard-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ch.a  reason: case insensitive filesystem */
public final class C9471a {
    public static final A1<Float> a(String str, float f10, float f11, int i10, int i11, C5525D d10, C4889m mVar, int i12, int i13) {
        String str2 = str;
        C4889m mVar2 = mVar;
        int i14 = i12;
        C17542s.j(str, "label");
        mVar2.W(1742923732);
        int i15 = (i13 & 8) != 0 ? 1000 : i10;
        int i16 = (i13 & 16) != 0 ? 4000 : i11;
        C5525D d11 = (i13 & 32) != 0 ? M.d() : d10;
        if (C4895p.J()) {
            C4895p.S(1742923732, i14, -1, "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.vector.animateFloatValueTween (AnimateFloatExtensions.kt:28)");
        }
        A1<Float> a10 = X.a(X.c(str, mVar2, i14 & 14, 0), f10, f11, C5548j.d(C5548j.i(i16, 1000, d11), C5547i0.Reverse, r0.c(i15, 0, 2, (DefaultConstructorMarker) null)), str, mVar, W.f25632f | (i14 & 112) | (i14 & 896) | (V.f25628d << 9) | ((i14 << 12) & 57344), 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return a10;
    }
}
