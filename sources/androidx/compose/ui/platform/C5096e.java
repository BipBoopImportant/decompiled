package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/e;", "Landroidx/compose/ui/platform/a;", "<init>", "()V", "", "index", "", "j", "(I)Z", "i", "current", "", "a", "(I)[I", "b", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.e  reason: case insensitive filesystem */
public final class C5096e extends C5084a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f19440c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static C5096e f19441d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/e$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/e;", "a", "()Landroidx/compose/ui/platform/e;", "instance", "Landroidx/compose/ui/platform/e;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5096e a() {
            if (C5096e.f19441d == null) {
                C5096e.f19441d = new C5096e((DefaultConstructorMarker) null);
            }
            C5096e g10 = C5096e.f19441d;
            C17542s.h(g10, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return g10;
        }

        private a() {
        }
    }

    public /* synthetic */ C5096e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final boolean i(int i10) {
        return i10 > 0 && d().charAt(i10 + -1) != 10 && (i10 == d().length() || d().charAt(i10) == 10);
    }

    private final boolean j(int i10) {
        return d().charAt(i10) != 10 && (i10 == 0 || d().charAt(i10 - 1) == 10);
    }

    public int[] a(int i10) {
        int length = d().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < length && d().charAt(i10) == 10 && !j(i10)) {
            i10++;
        }
        if (i10 >= length) {
            return null;
        }
        int i11 = i10 + 1;
        while (i11 < length && !i(i11)) {
            i11++;
        }
        return c(i10, i11);
    }

    public int[] b(int i10) {
        int length = d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && d().charAt(i10 - 1) == 10 && !i(i10)) {
            i10--;
        }
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        while (i11 > 0 && !j(i11)) {
            i11--;
        }
        return c(i11, i10);
    }

    private C5096e() {
    }
}
