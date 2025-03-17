package a9;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.x4  reason: case insensitive filesystem */
public final class C6969x4 implements W2 {

    /* renamed from: c  reason: collision with root package name */
    public static final C6854j0 f42939c = new C6854j0(new C6949v0());

    /* renamed from: a  reason: collision with root package name */
    public final String f42940a;

    /* renamed from: b  reason: collision with root package name */
    public final String f42941b;

    public C6969x4(View view) {
        String str;
        C17542s.j(view, "view");
        if (view.getId() != 0) {
            str = C6862k0.a(view, "null");
        } else {
            ViewParent parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            str = view2 != null ? C6862k0.a(view2, (String) null) : null;
        }
        this.f42940a = str;
        this.f42941b = f42939c.a(view);
    }

    public final String a() {
        return this.f42941b;
    }

    public final String b() {
        return this.f42940a;
    }
}
