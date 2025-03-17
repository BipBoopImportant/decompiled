package com.contentsquare.android.sdk;

import kotlin.jvm.internal.C17542s;

/* renamed from: com.contentsquare.android.sdk.k0  reason: case insensitive filesystem */
public abstract class C7134k0 {

    /* renamed from: com.contentsquare.android.sdk.k0$a */
    public static final class a extends C7134k0 {

        /* renamed from: a  reason: collision with root package name */
        public final b f47468a;

        /* renamed from: b  reason: collision with root package name */
        public final String f47469b;

        public a(b bVar, String str) {
            C17542s.j(bVar, "failureReason");
            C17542s.j(str, "screenName");
            this.f47468a = bVar;
            this.f47469b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f47468a, aVar.f47468a) && C17542s.e(this.f47469b, aVar.f47469b);
        }

        public final int hashCode() {
            return this.f47469b.hashCode() + (this.f47468a.hashCode() * 31);
        }

        public final String toString() {
            return "Failed(failureReason=" + this.f47468a + ", screenName=" + this.f47469b + ')';
        }
    }

    /* renamed from: com.contentsquare.android.sdk.k0$b */
    public static abstract class b {

        /* renamed from: com.contentsquare.android.sdk.k0$b$a */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f47470a = new a();
        }

        /* renamed from: com.contentsquare.android.sdk.k0$b$b  reason: collision with other inner class name */
        public static final class C0819b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0819b f47471a = new C0819b();
        }

        /* renamed from: com.contentsquare.android.sdk.k0$b$c */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f47472a = new c();
        }

        /* renamed from: com.contentsquare.android.sdk.k0$b$d */
        public static final class d extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final d f47473a = new d();
        }

        /* renamed from: com.contentsquare.android.sdk.k0$b$e */
        public static final class e extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final e f47474a = new e();
        }

        /* renamed from: com.contentsquare.android.sdk.k0$b$f */
        public static final class f extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final f f47475a = new f();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.k0$c */
    public static final class c extends C7134k0 {

        /* renamed from: a  reason: collision with root package name */
        public static final c f47476a = new c();
    }

    /* renamed from: com.contentsquare.android.sdk.k0$d */
    public static final class d extends C7134k0 {

        /* renamed from: a  reason: collision with root package name */
        public static final d f47477a = new d();
    }

    /* renamed from: com.contentsquare.android.sdk.k0$e */
    public static final class e extends C7134k0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f47478a;

        /* renamed from: b  reason: collision with root package name */
        public final int f47479b;

        /* renamed from: c  reason: collision with root package name */
        public final int f47480c;

        public e(int i10, int i11) {
            this.f47478a = i10;
            this.f47479b = i11;
            this.f47480c = (int) ((100.0f / ((float) i11)) * ((float) (i10 + 1)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f47478a == eVar.f47478a && this.f47479b == eVar.f47479b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f47479b) + (Integer.hashCode(this.f47478a) * 31);
        }

        public final String toString() {
            return "LongSnapshotProgress(snapshotIndex=" + this.f47478a + ", numberOfSnapshots=" + this.f47479b + ')';
        }
    }

    /* renamed from: com.contentsquare.android.sdk.k0$f */
    public static final class f extends C7134k0 {

        /* renamed from: a  reason: collision with root package name */
        public static final f f47481a = new f();
    }

    /* renamed from: com.contentsquare.android.sdk.k0$g */
    public static final class g extends C7134k0 {

        /* renamed from: a  reason: collision with root package name */
        public static final g f47482a = new g();
    }

    /* renamed from: com.contentsquare.android.sdk.k0$h */
    public static final class h extends C7134k0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47483a;

        public h(String str) {
            C17542s.j(str, "screenName");
            this.f47483a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && C17542s.e(this.f47483a, ((h) obj).f47483a);
        }

        public final int hashCode() {
            return this.f47483a.hashCode();
        }

        public final String toString() {
            return "Success(screenName=" + this.f47483a + ')';
        }
    }
}
