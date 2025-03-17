package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;
import l1.C5508a;
import l1.C5515h;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/C;", "", "<init>", "()V", "Landroid/view/View;", "view", "Ll1/h;", "transferData", "Ll1/a;", "dragShadowBuilder", "", "a", "(Landroid/view/View;Ll1/h;Ll1/a;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class C {

    /* renamed from: a  reason: collision with root package name */
    public static final C f19156a = new C();

    private C() {
    }

    public final boolean a(View view, C5515h hVar, C5508a aVar) {
        return view.startDragAndDrop(hVar.a(), aVar, hVar.c(), hVar.b());
    }
}
