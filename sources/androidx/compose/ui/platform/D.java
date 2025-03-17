package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/D;", "Landroid/view/translation/ViewTranslationCallback;", "<init>", "()V", "Landroid/view/View;", "view", "", "onShowTranslation", "(Landroid/view/View;)Z", "onHideTranslation", "onClearTranslation", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class D implements ViewTranslationCallback {

    /* renamed from: a  reason: collision with root package name */
    public static final D f19176a = new D();

    private D() {
    }

    public boolean onClearTranslation(View view) {
        C17542s.h(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().r();
        return true;
    }

    public boolean onHideTranslation(View view) {
        C17542s.h(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().t();
        return true;
    }

    public boolean onShowTranslation(View view) {
        C17542s.h(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().w();
        return true;
    }
}
