package W7;

import android.graphics.drawable.Drawable;

public class a implements e<Drawable> {

    /* renamed from: a  reason: collision with root package name */
    private final int f40532a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f40533b;

    /* renamed from: c  reason: collision with root package name */
    private b f40534c;

    /* renamed from: W7.a$a  reason: collision with other inner class name */
    public static class C0671a {

        /* renamed from: a  reason: collision with root package name */
        private final int f40535a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f40536b;

        public C0671a() {
            this(300);
        }

        public a a() {
            return new a(this.f40535a, this.f40536b);
        }

        public C0671a(int i10) {
            this.f40535a = i10;
        }
    }

    protected a(int i10, boolean z10) {
        this.f40532a = i10;
        this.f40533b = z10;
    }

    private d<Drawable> b() {
        if (this.f40534c == null) {
            this.f40534c = new b(this.f40532a, this.f40533b);
        }
        return this.f40534c;
    }

    public d<Drawable> a(C7.a aVar, boolean z10) {
        return aVar == C7.a.MEMORY_CACHE ? c.b() : b();
    }
}
