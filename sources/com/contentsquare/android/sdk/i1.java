package com.contentsquare.android.sdk;

import XH.C16807N;
import com.contentsquare.android.sdk.C7146q;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

public final class i1 extends C17544u implements C17642l<Boolean, C16807N> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k6 f47440c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C7146q.b f47441d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i1(k6 k6Var, C7146q.b bVar) {
        super(1);
        this.f47440c = k6Var;
        this.f47441d = bVar;
    }

    public final Object invoke(Object obj) {
        C7130i0 i0Var = null;
        if (((Boolean) obj).booleanValue()) {
            C7130i0 i0Var2 = this.f47440c.f47486D;
            if (i0Var2 == null) {
                C17542s.z("settingsViewModel");
            } else {
                i0Var = i0Var2;
            }
            C7146q qVar = i0Var.f47437g;
            C7146q.b bVar = this.f47441d;
            synchronized (qVar) {
                qVar.f41928a.add(bVar);
            }
        } else {
            C7130i0 i0Var3 = this.f47440c.f47486D;
            if (i0Var3 == null) {
                C17542s.z("settingsViewModel");
            } else {
                i0Var = i0Var3;
            }
            i0Var.f47437g.a(this.f47441d);
        }
        return C16807N.f139792a;
    }
}
