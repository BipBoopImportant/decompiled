package j5;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.inputmethodservice.InputMethodService;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj5/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "a", "(Landroid/content/Context;)Landroid/content/Context;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: j5.b  reason: case insensitive filesystem */
public final class C8401b {

    /* renamed from: a  reason: collision with root package name */
    public static final C8401b f54041a = new C8401b();

    private C8401b() {
    }

    public final Context a(Context context) {
        C17542s.j(context, "context");
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            if ((context2 instanceof Activity) || (context2 instanceof InputMethodService)) {
                return context2;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context2;
            if (contextWrapper.getBaseContext() == null) {
                return context2;
            }
            context2 = contextWrapper.getBaseContext();
            C17542s.i(context2, "iterator.baseContext");
        }
        throw new IllegalArgumentException("Context " + context + " is not a UiContext");
    }
}
