package com.ingka.ikea.zipselector.impl.ui;

import XH.C16818i;
import androidx.lifecycle.L;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class a implements L, C17537m {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C17642l f120779a;

    a(C17642l lVar) {
        C17542s.j(lVar, "function");
        this.f120779a = lVar;
    }

    public final C16818i<?> c() {
        return this.f120779a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof L) || !(obj instanceof C17537m)) {
            return false;
        }
        return C17542s.e(c(), ((C17537m) obj).c());
    }

    public final int hashCode() {
        return c().hashCode();
    }

    public final /* synthetic */ void onChanged(Object obj) {
        this.f120779a.invoke(obj);
    }
}
