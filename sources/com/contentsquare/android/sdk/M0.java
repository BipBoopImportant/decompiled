package com.contentsquare.android.sdk;

import a9.J6;
import android.view.View;
import kotlin.jvm.internal.C17542s;

public interface M0 {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final J6<View> f47041a;

        /* renamed from: b  reason: collision with root package name */
        public final int f47042b;

        /* renamed from: c  reason: collision with root package name */
        public final int f47043c;

        public a(J6<View> j62, int i10, int i11) {
            C17542s.j(j62, "capturedTargetsList");
            this.f47041a = j62;
            this.f47042b = i10;
            this.f47043c = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f47041a, aVar.f47041a) && this.f47042b == aVar.f47042b && this.f47043c == aVar.f47043c;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f47042b);
            return Integer.hashCode(this.f47043c) + ((hashCode + (this.f47041a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Request(capturedTargetsList=" + this.f47041a + ", touchX=" + this.f47042b + ", touchY=" + this.f47043c + ')';
        }
    }

    I0 a(a aVar);
}
