package com.contentsquare.android.sdk;

import android.view.View;
import kotlin.jvm.internal.C17542s;

public abstract class r1 extends C7145p0 {

    public static final class a extends r1 {

        /* renamed from: a  reason: collision with root package name */
        public final View f47610a;

        public a(View view) {
            C17542s.j(view, "scrollContainer");
            this.f47610a = view;
        }

        public final View a() {
            return this.f47610a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f47610a, ((a) obj).f47610a);
        }

        public final int hashCode() {
            return this.f47610a.hashCode();
        }

        public final String toString() {
            return "LongHorizontal(scrollContainer=" + this.f47610a + ')';
        }
    }

    public static final class b extends r1 {

        /* renamed from: a  reason: collision with root package name */
        public final View f47611a;

        public b(View view) {
            C17542s.j(view, "scrollContainer");
            this.f47611a = view;
        }

        public final View a() {
            return this.f47611a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f47611a, ((b) obj).f47611a);
        }

        public final int hashCode() {
            return this.f47611a.hashCode();
        }

        public final String toString() {
            return "LongVertical(scrollContainer=" + this.f47611a + ')';
        }
    }

    public static final class c extends r1 {

        /* renamed from: a  reason: collision with root package name */
        public final View f47612a;

        public c(View view) {
            C17542s.j(view, "scrollContainer");
            this.f47612a = view;
        }

        public final View a() {
            return this.f47612a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f47612a, ((c) obj).f47612a);
        }

        public final int hashCode() {
            return this.f47612a.hashCode();
        }

        public final String toString() {
            return "LongVerticalHorizontal(scrollContainer=" + this.f47612a + ')';
        }
    }

    public abstract View a();
}
