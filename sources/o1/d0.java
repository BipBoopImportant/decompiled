package O1;

import android.text.Layout;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"LO1/d0;", "", "<init>", "()V", "", "value", "Landroid/text/Layout$Alignment;", "a", "(I)Landroid/text/Layout$Alignment;", "b", "Landroid/text/Layout$Alignment;", "ALIGN_LEFT_FRAMEWORK", "c", "ALIGN_RIGHT_FRAMEWORK", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f11730a = new d0();

    /* renamed from: b  reason: collision with root package name */
    private static final Layout.Alignment f11731b;

    /* renamed from: c  reason: collision with root package name */
    private static final Layout.Alignment f11732c;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (C17542s.e(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (C17542s.e(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f11731b = alignment;
        f11732c = alignment2;
    }

    private d0() {
    }

    public final Layout.Alignment a(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Layout.Alignment.ALIGN_NORMAL : f11732c : f11731b : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
    }
}
