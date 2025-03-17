package mC;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.C5221y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mC.C14787e;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"LmC/a;", "LmC/e$b;", "Landroidx/fragment/app/DialogFragment;", "dialog", "<init>", "(Landroidx/fragment/app/DialogFragment;)V", "Landroid/view/Window;", "d", "()Landroid/view/Window;", "Landroidx/lifecycle/y;", "c", "()Landroidx/lifecycle/y;", "Landroid/view/View;", "b", "()Landroid/view/View;", "a", "Landroidx/fragment/app/DialogFragment;", "", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "systemui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mC.a  reason: case insensitive filesystem */
public final class C14783a implements C14787e.b {

    /* renamed from: a  reason: collision with root package name */
    private final DialogFragment f129358a;

    /* renamed from: b  reason: collision with root package name */
    private final String f129359b;

    public C14783a(DialogFragment dialogFragment) {
        C17542s.j(dialogFragment, "dialog");
        this.f129358a = dialogFragment;
        String simpleName = dialogFragment.getClass().getSimpleName();
        C17542s.i(simpleName, "getSimpleName(...)");
        this.f129359b = simpleName;
    }

    public View b() {
        View requireView = this.f129358a.requireView();
        C17542s.i(requireView, "requireView(...)");
        return requireView;
    }

    public C5221y c() {
        C5221y viewLifecycleOwner = this.f129358a.getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return viewLifecycleOwner;
    }

    public Window d() {
        Dialog dialog = this.f129358a.getDialog();
        Window window = dialog != null ? dialog.getWindow() : null;
        if (window != null) {
            return window;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public String getName() {
        return this.f129359b;
    }
}
