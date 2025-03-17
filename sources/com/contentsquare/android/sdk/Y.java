package com.contentsquare.android.sdk;

import XH.C16807N;
import android.view.View;
import com.contentsquare.android.sdk.C7153u;
import com.optimizely.ab.config.FeatureVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.p;

public final class Y extends C17544u implements p<View, C7153u, C16807N> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List<C7153u> f47250c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Y(ArrayList arrayList) {
        super(2);
        this.f47250c = arrayList;
    }

    public final Object invoke(Object obj, Object obj2) {
        C7153u uVar = (C7153u) obj2;
        C17542s.j((View) obj, "<anonymous parameter 0>");
        C17542s.j(uVar, FeatureVariable.JSON_TYPE);
        if (uVar.f47646h == C7153u.a.ANDROID_COMPOSE_VIEW) {
            this.f47250c.add(uVar);
        }
        return C16807N.f139792a;
    }
}
