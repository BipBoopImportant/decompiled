package O1;

import android.graphics.RectF;
import android.text.Layout;
import nI.p;

/* renamed from: O1.e  reason: case insensitive filesystem */
public final /* synthetic */ class C4771e implements Layout.TextInclusionStrategy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f11733a;

    public /* synthetic */ C4771e(p pVar) {
        this.f11733a = pVar;
    }

    public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
        return C4772f.b(this.f11733a, rectF, rectF2);
    }
}
