package a9;

import android.graphics.Rect;
import kotlin.jvm.internal.C17542s;

public final class B0 {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f41923a;

    /* renamed from: b  reason: collision with root package name */
    public final int f41924b;

    /* renamed from: c  reason: collision with root package name */
    public final int f41925c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f41926d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f41927e;

    public B0(Rect rect, int i10, int i11, boolean z10, boolean z11) {
        C17542s.j(rect, "scrollContainerRect");
        this.f41923a = rect;
        this.f41924b = i10;
        this.f41925c = i11;
        this.f41926d = z10;
        this.f41927e = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        return C17542s.e(this.f41923a, b02.f41923a) && this.f41924b == b02.f41924b && this.f41925c == b02.f41925c && this.f41926d == b02.f41926d && this.f41927e == b02.f41927e;
    }

    public final int hashCode() {
        int hashCode = (Integer.hashCode(this.f41925c) + ((Integer.hashCode(this.f41924b) + (this.f41923a.hashCode() * 31)) * 31)) * 31;
        boolean z10 = this.f41926d;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i10 = (hashCode + (z10 ? 1 : 0)) * 31;
        boolean z12 = this.f41927e;
        if (!z12) {
            z11 = z12;
        }
        return i10 + (z11 ? 1 : 0);
    }

    public final String toString() {
        return "AppendPageContext(scrollContainerRect=" + this.f41923a + ", initialOffset=" + this.f41924b + ", numberOfSnapshots=" + this.f41925c + ", isFirstSnapshot=" + this.f41926d + ", isLastSnapshot=" + this.f41927e + ')';
    }
}
