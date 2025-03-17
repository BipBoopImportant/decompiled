package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.v0  reason: case insensitive filesystem */
public abstract class C7156v0 {

    /* renamed from: com.contentsquare.android.sdk.v0$a */
    public static final class a extends C7156v0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f47659a = new a();
    }

    /* renamed from: com.contentsquare.android.sdk.v0$b */
    public static final class b extends C7156v0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f47660a;

        public b(int i10) {
            this.f47660a = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f47660a == ((b) obj).f47660a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f47660a);
        }

        public final String toString() {
            return "Icon(iconRes=" + this.f47660a + ')';
        }
    }

    /* renamed from: com.contentsquare.android.sdk.v0$c */
    public static final class c extends C7156v0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f47661a;

        public c(int i10) {
            this.f47661a = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f47661a == ((c) obj).f47661a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f47661a);
        }

        public final String toString() {
            return "Linear(progress=" + this.f47661a + ')';
        }
    }
}
