package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/platform/g;", "Landroidx/compose/ui/platform/a;", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/util/Locale;)V", "LXH/N;", "l", "", "index", "", "k", "(I)Z", "i", "j", "", "text", "e", "(Ljava/lang/String;)V", "current", "", "a", "(I)[I", "b", "Ljava/text/BreakIterator;", "c", "Ljava/text/BreakIterator;", "impl", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.g  reason: case insensitive filesystem */
public final class C5102g extends C5084a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f19497d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f19498e = 8;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static C5102g f19499f;

    /* renamed from: c  reason: collision with root package name */
    private BreakIterator f19500c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/g$a;", "", "<init>", "()V", "Ljava/util/Locale;", "locale", "Landroidx/compose/ui/platform/g;", "a", "(Ljava/util/Locale;)Landroidx/compose/ui/platform/g;", "instance", "Landroidx/compose/ui/platform/g;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5102g a(Locale locale) {
            if (C5102g.f19499f == null) {
                C5102g.f19499f = new C5102g(locale, (DefaultConstructorMarker) null);
            }
            C5102g g10 = C5102g.f19499f;
            C17542s.h(g10, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return g10;
        }

        private a() {
        }
    }

    public /* synthetic */ C5102g(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    private final boolean i(int i10) {
        return i10 > 0 && j(i10 + -1) && (i10 == d().length() || !j(i10));
    }

    private final boolean j(int i10) {
        if (i10 < 0 || i10 >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i10));
    }

    private final boolean k(int i10) {
        return j(i10) && (i10 == 0 || !j(i10 - 1));
    }

    private final void l(Locale locale) {
        this.f19500c = BreakIterator.getWordInstance(locale);
    }

    public int[] a(int i10) {
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (!j(i10) && !k(i10)) {
            BreakIterator breakIterator = this.f19500c;
            if (breakIterator == null) {
                C17542s.z("impl");
                breakIterator = null;
            }
            i10 = breakIterator.following(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f19500c;
        if (breakIterator2 == null) {
            C17542s.z("impl");
            breakIterator2 = null;
        }
        int following = breakIterator2.following(i10);
        if (following == -1 || !i(following)) {
            return null;
        }
        return c(i10, following);
    }

    public int[] b(int i10) {
        int length = d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && !j(i10 - 1) && !i(i10)) {
            BreakIterator breakIterator = this.f19500c;
            if (breakIterator == null) {
                C17542s.z("impl");
                breakIterator = null;
            }
            i10 = breakIterator.preceding(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f19500c;
        if (breakIterator2 == null) {
            C17542s.z("impl");
            breakIterator2 = null;
        }
        int preceding = breakIterator2.preceding(i10);
        if (preceding == -1 || !k(preceding)) {
            return null;
        }
        return c(preceding, i10);
    }

    public void e(String str) {
        super.e(str);
        BreakIterator breakIterator = this.f19500c;
        if (breakIterator == null) {
            C17542s.z("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    private C5102g(Locale locale) {
        l(locale);
    }
}
