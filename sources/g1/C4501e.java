package G1;

import D1.a;
import XH.C16820k;
import androidx.compose.ui.focus.i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00048V@VX\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LG1/e;", "Landroidx/compose/ui/focus/i;", "<init>", "()V", "", "a", "()Z", "LXH/N;", "c", "b", "Ljava/lang/Boolean;", "canFocusValue", "value", "y", "w", "(Z)V", "canFocus", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: G1.e  reason: case insensitive filesystem */
final class C4501e implements i {

    /* renamed from: a  reason: collision with root package name */
    public static final C4501e f6512a = new C4501e();

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f6513b;

    private C4501e() {
    }

    public final boolean a() {
        return f6513b != null;
    }

    public final void c() {
        f6513b = null;
    }

    public void w(boolean z10) {
        f6513b = Boolean.valueOf(z10);
    }

    public boolean y() {
        Boolean bool = f6513b;
        if (bool != null) {
            return bool.booleanValue();
        }
        a.c("canFocus is read before it is written");
        throw new C16820k();
    }
}
