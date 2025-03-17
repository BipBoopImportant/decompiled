package com.contentsquare.android.sdk;

import kotlin.jvm.internal.C17542s;
import w8.d;

public abstract class p1 extends C7145p0 {

    public static final class a extends p1 {

        /* renamed from: a  reason: collision with root package name */
        public final d f47586a;

        public a(d dVar) {
            C17542s.j(dVar, "scroller");
            this.f47586a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f47586a, ((a) obj).f47586a);
        }

        public final int hashCode() {
            return this.f47586a.hashCode();
        }

        public final String toString() {
            return "LongVertical(scroller=" + this.f47586a + ')';
        }
    }
}
