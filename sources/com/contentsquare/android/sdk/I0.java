package com.contentsquare.android.sdk;

import android.view.View;
import kotlin.jvm.internal.C17542s;

public final class I0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f47008d = new a();

    /* renamed from: a  reason: collision with root package name */
    public final View f47009a;

    /* renamed from: b  reason: collision with root package name */
    public final b f47010b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f47011c;

    public static final class a implements b {
    }

    public interface b {
    }

    public I0(View view, b bVar, boolean z10) {
        C17542s.j(view, "view");
        C17542s.j(bVar, "payload");
        this.f47009a = view;
        this.f47010b = bVar;
        this.f47011c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I0)) {
            return false;
        }
        I0 i02 = (I0) obj;
        return C17542s.e(this.f47009a, i02.f47009a) && C17542s.e(this.f47010b, i02.f47010b) && this.f47011c == i02.f47011c;
    }

    public final int hashCode() {
        int hashCode = (this.f47010b.hashCode() + (this.f47009a.hashCode() * 31)) * 31;
        boolean z10 = this.f47011c;
        if (z10) {
            z10 = true;
        }
        return hashCode + (z10 ? 1 : 0);
    }

    public final String toString() {
        return "GestureTarget(view=" + this.f47009a + ", payload=" + this.f47010b + ", isUnresponsive=" + this.f47011c + ')';
    }
}
