package bm;

import am.c;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0010"}, d2 = {"Lbm/a;", "Lam/c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "text", "label", "LXH/N;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "", "b", "()Z", "Landroid/content/Context;", "appservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bm.a  reason: case insensitive filesystem */
public final class C11104a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f90483a;

    public C11104a(Context context) {
        C17542s.j(context, "context");
        this.f90483a = context;
    }

    public void a(String str, String str2) {
        C17542s.j(str, "text");
        C17542s.j(str2, "label");
        Object systemService = this.f90483a.getSystemService("clipboard");
        C17542s.h(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str2, str));
    }

    public boolean b() {
        return Build.VERSION.SDK_INT < 33;
    }
}
