package a9;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.C17542s;
import w8.C8933a;

/* renamed from: a9.g6  reason: case insensitive filesystem */
public final class C6836g6 implements E0 {

    /* renamed from: a  reason: collision with root package name */
    public final C8933a f42588a;

    public C6836g6(C8933a aVar) {
        this.f42588a = aVar;
    }

    public final boolean a(View view, ViewGroup viewGroup) {
        C17542s.j(view, "thisView");
        C17542s.j(viewGroup, "withThisParent");
        C8933a aVar = this.f42588a;
        if (aVar != null) {
            return aVar.a(viewGroup);
        }
        return false;
    }
}
