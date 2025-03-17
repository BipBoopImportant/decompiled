package androidx.compose.ui.platform;

import G1.E0;
import G1.G;
import U0.C4889m;
import U0.C4897q;
import U0.C4904u;
import U0.V0;
import U0.r;
import XH.C16807N;
import android.view.ViewGroup;
import i1.i;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\f\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0015"}, d2 = {"LG1/G;", "container", "LU0/r;", "parent", "LU0/V0;", "a", "(LG1/G;LU0/r;)LU0/V0;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lkotlin/Function0;", "LXH/N;", "content", "LU0/q;", "c", "(Landroidx/compose/ui/platform/AbstractComposeView;LU0/r;LnI/p;)LU0/q;", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "b", "(Landroidx/compose/ui/platform/AndroidComposeView;LU0/r;LnI/p;)LU0/q;", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultLayoutParams", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class K1 {

    /* renamed from: a  reason: collision with root package name */
    private static final ViewGroup.LayoutParams f19271a = new ViewGroup.LayoutParams(-2, -2);

    public static final V0 a(G g10, r rVar) {
        return C4904u.b(new E0(g10), rVar);
    }

    private static final C4897q b(AndroidComposeView androidComposeView, r rVar, p<? super C4889m, ? super Integer, C16807N> pVar) {
        if (C5133t0.b() && androidComposeView.getTag(i.f24339K) == null) {
            androidComposeView.setTag(i.f24339K, Collections.newSetFromMap(new WeakHashMap()));
        }
        C4897q a10 = C4904u.a(new E0(androidComposeView.getRoot()), rVar);
        Object tag = androidComposeView.getView().getTag(i.f24340L);
        I1 i12 = tag instanceof I1 ? (I1) tag : null;
        if (i12 == null) {
            i12 = new I1(androidComposeView, a10);
            androidComposeView.getView().setTag(i.f24340L, i12);
        }
        i12.m(pVar);
        if (!C17542s.e(androidComposeView.getCoroutineContext(), rVar.i())) {
            androidComposeView.setCoroutineContext(rVar.i());
        }
        return i12;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final U0.C4897q c(androidx.compose.ui.platform.AbstractComposeView r3, U0.r r4, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r5) {
        /*
            androidx.compose.ui.platform.n0 r0 = androidx.compose.ui.platform.C5122n0.f19522a
            r0.b()
            int r0 = r3.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L_0x0019
            r0 = 0
            android.view.View r0 = r3.getChildAt(r0)
            boolean r2 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r2 == 0) goto L_0x001c
            r1 = r0
            androidx.compose.ui.platform.AndroidComposeView r1 = (androidx.compose.ui.platform.AndroidComposeView) r1
            goto L_0x001c
        L_0x0019:
            r3.removeAllViews()
        L_0x001c:
            if (r1 != 0) goto L_0x0034
            androidx.compose.ui.platform.AndroidComposeView r1 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r0 = r3.getContext()
            dI.i r2 = r4.i()
            r1.<init>(r0, r2)
            android.view.View r0 = r1.getView()
            android.view.ViewGroup$LayoutParams r2 = f19271a
            r3.addView((android.view.View) r0, (android.view.ViewGroup.LayoutParams) r2)
        L_0x0034:
            U0.q r3 = b(r1, r4, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.K1.c(androidx.compose.ui.platform.AbstractComposeView, U0.r, nI.p):U0.q");
    }
}
