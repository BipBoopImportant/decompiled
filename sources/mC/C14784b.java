package mC;

import android.view.View;
import android.view.Window;
import androidx.core.app.C5147b;
import androidx.fragment.app.C5191t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mC.C14787e;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LmC/b;", "LmC/e$b;", "Landroidx/fragment/app/t;", "activity", "<init>", "(Landroidx/fragment/app/t;)V", "Landroid/view/Window;", "d", "()Landroid/view/Window;", "e", "()Landroidx/fragment/app/t;", "Landroid/view/View;", "b", "()Landroid/view/View;", "a", "Landroidx/fragment/app/t;", "", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "systemui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mC.b  reason: case insensitive filesystem */
public final class C14784b implements C14787e.b {

    /* renamed from: a  reason: collision with root package name */
    private final C5191t f129360a;

    /* renamed from: b  reason: collision with root package name */
    private final String f129361b;

    public C14784b(C5191t tVar) {
        C17542s.j(tVar, "activity");
        this.f129360a = tVar;
        String simpleName = tVar.getClass().getSimpleName();
        C17542s.i(simpleName, "getSimpleName(...)");
        this.f129361b = simpleName;
    }

    public View b() {
        View x10 = C5147b.x(this.f129360a, 16908290);
        C17542s.i(x10, "requireViewById(...)");
        return x10;
    }

    public Window d() {
        Window window = this.f129360a.getWindow();
        if (window != null) {
            return window;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* renamed from: e */
    public C5191t c() {
        return this.f129360a;
    }

    public String getName() {
        return this.f129361b;
    }
}
