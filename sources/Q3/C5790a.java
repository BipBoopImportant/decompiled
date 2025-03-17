package q3;

import android.view.View;

/* renamed from: q3.a  reason: case insensitive filesystem */
public final class C5790a {

    /* renamed from: a  reason: collision with root package name */
    public final View f28072a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28073b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28074c;

    /* renamed from: q3.a$a  reason: collision with other inner class name */
    public static final class C0447a {

        /* renamed from: a  reason: collision with root package name */
        private final View f28075a;

        /* renamed from: b  reason: collision with root package name */
        private final int f28076b;

        /* renamed from: c  reason: collision with root package name */
        private String f28077c;

        public C0447a(View view, int i10) {
            this.f28075a = view;
            this.f28076b = i10;
        }

        public C5790a a() {
            return new C5790a(this.f28075a, this.f28076b, this.f28077c);
        }

        public C0447a b(String str) {
            this.f28077c = str;
            return this;
        }
    }

    @Deprecated
    public C5790a(View view, int i10, String str) {
        this.f28072a = view;
        this.f28073b = i10;
        this.f28074c = str;
    }
}
