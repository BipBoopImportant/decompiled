package a9;

import XH.C16807N;
import android.view.View;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.q;

public final class B3 extends C17544u implements C17642l<View, C16807N> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ H3<View> f41931c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B3(H3<View> h32) {
        super(1);
        this.f41931c = h32;
    }

    public final Object invoke(Object obj) {
        C17542s.j((View) obj, "$this$forView");
        H3<View> h32 = this.f41931c;
        q<? super Integer, ? super Integer, ? super Long, C16807N> qVar = h32.f42037f;
        if (qVar == null) {
            return null;
        }
        if (h32.f42035d == 0) {
            h32.f42035d = System.currentTimeMillis();
        }
        int a10 = h32.a();
        int c10 = h32.c();
        int i10 = a10 - h32.f42033b;
        int i11 = c10 - h32.f42034c;
        if (!(i10 == 0 && i11 == 0)) {
            h32.f42032a.c(new C6928s3(qVar, i10, i11, System.currentTimeMillis() - h32.f42035d, h32, a10, c10));
        }
        return C16807N.f139792a;
    }
}
