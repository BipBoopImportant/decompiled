package com.contentsquare.android.sdk;

import android.text.SpannableString;
import kotlin.jvm.internal.C17542s;

public abstract class k1 {

    public static final class a extends k1 {

        /* renamed from: a  reason: collision with root package name */
        public final int f47484a;

        public a(int i10) {
            this.f47484a = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f47484a == ((a) obj).f47484a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f47484a);
        }

        public final String toString() {
            return "Res(stringRes=" + this.f47484a + ')';
        }
    }

    public static final class b extends k1 {

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f47485a;

        public b(SpannableString spannableString) {
            C17542s.j(spannableString, "charSequence");
            this.f47485a = spannableString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f47485a, ((b) obj).f47485a);
        }

        public final int hashCode() {
            return this.f47485a.hashCode();
        }

        public final String toString() {
            return "Text(charSequence=" + this.f47485a + ')';
        }
    }
}
