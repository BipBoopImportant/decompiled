package com.contentsquare.android.sdk;

import a9.C6898o4;
import a9.J6;
import android.view.View;
import com.contentsquare.android.sdk.M0;
import kotlin.jvm.internal.C17542s;

public final class N0 implements M0 {
    public static final boolean b(View view) {
        return view != null && view.isClickable();
    }

    public final I0 a(M0.a aVar) {
        I0 i02;
        T t10;
        T t11;
        C17542s.j(aVar, "request");
        J6<View> j62 = aVar.f47041a;
        C6898o4 o4Var = new C6898o4();
        j62.getClass();
        C17542s.j(o4Var, "filter");
        J6.a aVar2 = j62.f42087b;
        while (true) {
            i02 = null;
            if (aVar2 == null) {
                t10 = null;
                break;
            }
            t10 = aVar2.f42088a.get();
            if (t10 != null && o4Var.test(t10)) {
                break;
            }
            aVar2 = aVar2.f42090c;
        }
        View view = (View) t10;
        if (view == null) {
            J6.a aVar3 = aVar.f47041a.f42087b;
            while (true) {
                if (aVar3 == null) {
                    t11 = null;
                    break;
                }
                t11 = aVar3.f42088a.get();
                if (t11 != null) {
                    break;
                }
                aVar3 = aVar3.f42090c;
            }
            view = (View) t11;
        }
        if (view != null) {
            i02 = new I0(view, I0.f47008d, !view.isClickable() || !view.hasOnClickListeners());
        }
        return i02;
    }
}
