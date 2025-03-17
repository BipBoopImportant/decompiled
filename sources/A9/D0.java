package a9;

import H2.j;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.C17542s;

public final class D0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f41949a;

    /* renamed from: b  reason: collision with root package name */
    public final j<View> f41950b;

    public interface a {
        void a(View view);
    }

    public D0(a aVar, j jVar) {
        this.f41949a = aVar;
        this.f41950b = jVar;
    }

    public final void a(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "viewGroup");
        if (!this.f41950b.test(viewGroup)) {
            this.f41949a.a(viewGroup);
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    if (childAt instanceof ViewGroup) {
                        a((ViewGroup) childAt);
                    } else if (!this.f41950b.test(childAt)) {
                        a aVar = this.f41949a;
                        C17542s.i(childAt, "child");
                        aVar.a(childAt);
                    }
                }
            }
        }
    }
}
