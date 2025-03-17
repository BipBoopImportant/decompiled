package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.I0;
import kotlin.jvm.internal.C17542s;
import w8.e;

public final class Y0 implements I0.b {

    /* renamed from: a  reason: collision with root package name */
    public final e f47251a;

    public Y0(e eVar) {
        C17542s.j(eVar, "node");
        this.f47251a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y0) && C17542s.e(this.f47251a, ((Y0) obj).f47251a);
    }

    public final int hashCode() {
        return this.f47251a.hashCode();
    }

    public final String toString() {
        return "ComposeGestureTargetPayload(node=" + this.f47251a + ')';
    }
}
