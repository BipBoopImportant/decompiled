package a9;

import I2.C4600b0;
import a9.D0;
import a9.J6;
import android.view.View;
import kotlin.jvm.internal.C17542s;

public final class M implements D0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ J6<View> f42136a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f42137b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f42138c;

    public M(J6<View> j62, int i10, int i11) {
        this.f42136a = j62;
        this.f42137b = i10;
        this.f42138c = i11;
    }

    public final void a(View view) {
        C17542s.j(view, "view");
        if (view.getVisibility() == 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int width = view.getWidth();
            int height = view.getHeight();
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = this.f42137b;
            int i13 = this.f42138c;
            if (i12 >= i10 && i12 <= i10 + width && i13 >= i11 && i13 <= i11 + height && C4600b0.R(view)) {
                J6<View> j62 = this.f42136a;
                J6.a<E> aVar = j62.f42087b;
                J6.a<E> aVar2 = new J6.a<>(view);
                j62.f42087b = aVar2;
                if (aVar == null) {
                    j62.f42086a = aVar2;
                    return;
                }
                aVar2.f42090c = aVar;
                aVar.f42089b = aVar2;
            }
        }
    }
}
