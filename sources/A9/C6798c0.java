package a9;

import D8.c;
import XH.C16807N;
import com.contentsquare.android.sdk.C;
import com.contentsquare.android.sdk.C7133k;
import com.contentsquare.android.sdk.U0;
import kotlin.jvm.internal.C17540p;
import nI.q;
import u8.C8886a;

/* renamed from: a9.c0  reason: case insensitive filesystem */
public final /* synthetic */ class C6798c0 extends C17540p implements q<Integer, Integer, Long, C16807N> {
    public C6798c0(Object obj) {
        super(3, obj, C.class, "dispatchScrollEvent", "dispatchScrollEvent(IIJ)V", 0);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        long longValue = ((Number) obj3).longValue();
        C c10 = (C) this.receiver;
        c10.getClass();
        if (D6.a(C8886a.f56874d.a(), "exposure_metrics")) {
            U0.a aVar = (U0.a) C7133k.b(c10.f46920f, 23);
            aVar.f47171k = c10.f46924j.r(intValue);
            aVar.f47172l = c10.f46924j.r(intValue2);
            aVar.f47173m = longValue;
            c10.f46917c.a(aVar);
            c cVar = c10.f46926l;
            cVar.j("Scroll view event deltaX: " + intValue + " deltaY: " + intValue2 + " duration: " + longValue);
        }
        return C16807N.f139792a;
    }
}
