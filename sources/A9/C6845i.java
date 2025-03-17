package a9;

import G8.g;
import android.view.View;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

/* renamed from: a9.i  reason: case insensitive filesystem */
public final class C6845i extends C17544u implements C17642l<View, Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public static final C6845i f42604c = new C6845i();

    public C6845i() {
        super(1);
    }

    public final Object invoke(Object obj) {
        View view = (View) obj;
        C17542s.j(view, "it");
        return Boolean.valueOf(g.h(view, "AppBarLayout"));
    }
}
