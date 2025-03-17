package Uc;

import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.p1;
import U0.r;
import XH.C16807N;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import nI.p;
import qa.b;
import qa.c;

@Metadata(d1 = {"\u00002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000\"\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014²\u0006\u0012\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\nX\u0002"}, d2 = {"", "", "keys", "Lkotlin/Function0;", "LXH/N;", "content", "Lqa/b;", "c", "([Ljava/lang/Object;LnI/p;LU0/m;I)Lqa/b;", "Landroid/view/ViewGroup;", "parent", "LU0/r;", "compositionContext", "e", "(Landroid/view/ViewGroup;LU0/r;LnI/p;)Lqa/b;", "", "a", "I", "measureSpec", "currentContent", "maps-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class D1 {

    /* renamed from: a  reason: collision with root package name */
    private static final int f64153a = View.MeasureSpec.makeMeasureSpec(0, 0);

    public static final b c(Object[] objArr, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
        C17542s.j(objArr, "keys");
        C17542s.j(pVar, "content");
        mVar.W(1871105836);
        if (C4895p.J()) {
            C4895p.S(1871105836, i10, -1, "com.google.maps.android.compose.rememberComposeBitmapDescriptor (RememberComposeBitmapDescriptor.kt:22)");
        }
        Object Q10 = mVar.Q(AndroidCompositionLocals_androidKt.k());
        C17542s.h(Q10, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) Q10;
        r d10 = C4883j.d(mVar, 0);
        A1<T> q10 = p1.q(pVar, mVar, (i10 >> 3) & 14);
        U u10 = new U(4);
        u10.a(viewGroup);
        u10.a(d10);
        u10.a(d(q10));
        u10.b(objArr);
        boolean z10 = false;
        for (Object V10 : u10.d(new Object[u10.c()])) {
            z10 |= mVar.V(V10);
        }
        Object D10 = mVar.D();
        if (z10 || D10 == C4889m.f14007a.a()) {
            D10 = e(viewGroup, d10, d(q10));
            mVar.u(D10);
        }
        b bVar = (b) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return bVar;
    }

    /* access modifiers changed from: private */
    public static final p<C4889m, Integer, C16807N> d(A1<? extends p<? super C4889m, ? super Integer, C16807N>> a12) {
        return (p) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final b e(ViewGroup viewGroup, r rVar, p<? super C4889m, ? super Integer, C16807N> pVar) {
        Canvas canvas = new Canvas();
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        composeView.setParentCompositionContext(rVar);
        composeView.setContent(pVar);
        viewGroup.addView(composeView);
        composeView.draw(canvas);
        int i10 = f64153a;
        composeView.measure(i10, i10);
        if (composeView.getMeasuredWidth() == 0 || composeView.getMeasuredHeight() == 0) {
            throw new IllegalStateException("The ComposeView was measured to have a width or height of zero. Make sure that the content has a non-zero size.");
        }
        composeView.layout(0, 0, composeView.getMeasuredWidth(), composeView.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(composeView.getMeasuredWidth(), composeView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        C17542s.i(createBitmap, "createBitmap(...)");
        composeView.draw(new Canvas(createBitmap));
        viewGroup.removeView(composeView);
        b a10 = c.a(createBitmap);
        C17542s.i(a10, "fromBitmap(...)");
        return a10;
    }
}
