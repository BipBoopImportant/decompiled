package com.contentsquare.android.sdk;

import E8.b;
import XH.C16807N;
import YH.C16877v;
import android.view.View;
import android.widget.LinearLayout;
import b8.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

public final class L extends C17544u implements C17642l<Boolean, C16807N> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ N1 f47034c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f47035d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public L(N1 n12, View view) {
        super(1);
        this.f47034c = n12;
        this.f47035d = view;
    }

    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C7130i0 i0Var = this.f47034c.f47048D;
        C7130i0 i0Var2 = null;
        if (i0Var == null) {
            C17542s.z("settingsViewModel");
            i0Var = null;
        }
        i0Var.f47431a.h(b.DEVELOPER_OVERRIDE_FEATURE_FLAGS_ENABLED, booleanValue);
        LinearLayout linearLayout = (LinearLayout) this.f47035d.findViewById(m.f45568m);
        if (booleanValue) {
            N1 n12 = this.f47034c;
            C7130i0 i0Var3 = n12.f47048D;
            if (i0Var3 == null) {
                C17542s.z("settingsViewModel");
                i0Var3 = null;
            }
            List<String> list = i0Var3.f47439i;
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                String str = (String) next;
                C7130i0 i0Var4 = n12.f47048D;
                if (i0Var4 == null) {
                    C17542s.z("settingsViewModel");
                    i0Var4 = null;
                }
                i0Var4.getClass();
                C17542s.j(str, "name");
                if (i0Var4.f47434d.d(str)) {
                    arrayList.add(next);
                }
            }
            Set y12 = C16877v.y1(arrayList);
            C7130i0 i0Var5 = n12.f47048D;
            if (i0Var5 == null) {
                C17542s.z("settingsViewModel");
            } else {
                i0Var2 = i0Var5;
            }
            i0Var2.getClass();
            C17542s.j(y12, "value");
            i0Var2.f47431a.m(b.DEVELOPER_OVERRIDE_FEATURE_FLAGS_STATES, y12);
            this.f47034c.a(this.f47035d);
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
        } else if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        return C16807N.f139792a;
    }
}
