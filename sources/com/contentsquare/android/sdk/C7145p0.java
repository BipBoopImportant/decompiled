package com.contentsquare.android.sdk;

import kotlin.jvm.internal.C17542s;

/* renamed from: com.contentsquare.android.sdk.p0  reason: case insensitive filesystem */
public abstract class C7145p0 {

    /* renamed from: com.contentsquare.android.sdk.p0$a */
    public static final class a extends C7145p0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f47584a = new a();
    }

    /* renamed from: com.contentsquare.android.sdk.p0$b */
    public static final class b extends C7145p0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47585a = "No decorView found, no view hierarchy";

        public b() {
            C17542s.j("No decorView found, no view hierarchy", "errorMessage");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f47585a, ((b) obj).f47585a);
        }

        public final int hashCode() {
            return this.f47585a.hashCode();
        }

        public final String toString() {
            return "Unknown(errorMessage=" + this.f47585a + ')';
        }
    }
}
