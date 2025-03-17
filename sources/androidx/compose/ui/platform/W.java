package androidx.compose.ui.platform;

import android.view.ViewConfiguration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/W;", "", "<init>", "()V", "Landroid/view/ViewConfiguration;", "viewConfiguration", "", "b", "(Landroid/view/ViewConfiguration;)F", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class W {

    /* renamed from: a  reason: collision with root package name */
    public static final W f19360a = new W();

    private W() {
    }

    public final float a(ViewConfiguration viewConfiguration) {
        return (float) viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public final float b(ViewConfiguration viewConfiguration) {
        return (float) viewConfiguration.getScaledHandwritingSlop();
    }
}
