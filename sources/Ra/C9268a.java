package Ra;

import android.graphics.Typeface;

/* renamed from: Ra.a  reason: case insensitive filesystem */
public final class C9268a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Typeface f63143a;

    /* renamed from: b  reason: collision with root package name */
    private final C1076a f63144b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f63145c;

    /* renamed from: Ra.a$a  reason: collision with other inner class name */
    public interface C1076a {
        void a(Typeface typeface);
    }

    public C9268a(C1076a aVar, Typeface typeface) {
        this.f63143a = typeface;
        this.f63144b = aVar;
    }

    private void d(Typeface typeface) {
        if (!this.f63145c) {
            this.f63144b.a(typeface);
        }
    }

    public void a(int i10) {
        d(this.f63143a);
    }

    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f63145c = true;
    }
}
