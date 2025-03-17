package androidx.compose.ui.platform;

import A1.C4334a;
import A1.C4335b;
import A1.C4355w;
import android.view.PointerIcon;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/I;", "", "<init>", "()V", "Landroid/view/View;", "view", "LA1/w;", "icon", "LXH/N;", "a", "(Landroid/view/View;LA1/w;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class I {

    /* renamed from: a  reason: collision with root package name */
    public static final I f19245a = new I();

    private I() {
    }

    public final void a(View view, C4355w wVar) {
        PointerIcon a10 = wVar instanceof C4334a ? ((C4334a) wVar).a() : wVar instanceof C4335b ? PointerIcon.getSystemIcon(view.getContext(), ((C4335b) wVar).a()) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        if (!C17542s.e(view.getPointerIcon(), a10)) {
            view.setPointerIcon(a10);
        }
    }
}
