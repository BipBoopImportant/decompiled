package com.contentsquare.android.sdk;

import XH.C16807N;
import android.widget.LinearLayout;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

public final class f1 extends C17544u implements C17642l<Boolean, C16807N> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k6 f47411c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f47412d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f1(k6 k6Var, LinearLayout linearLayout) {
        super(1);
        this.f47411c = k6Var;
        this.f47412d = linearLayout;
    }

    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C7130i0 i0Var = this.f47411c.f47486D;
        if (i0Var == null) {
            C17542s.z("settingsViewModel");
            i0Var = null;
        }
        i0Var.f47437g.f41929b = booleanValue;
        if (booleanValue) {
            LinearLayout linearLayout = this.f47412d;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
        } else {
            LinearLayout linearLayout2 = this.f47412d;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        }
        return C16807N.f139792a;
    }
}
