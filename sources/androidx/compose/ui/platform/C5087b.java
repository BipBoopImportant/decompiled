package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u00162\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/b;", "Landroidx/compose/ui/platform/a;", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/util/Locale;)V", "LXH/N;", "i", "", "text", "e", "(Ljava/lang/String;)V", "", "current", "", "a", "(I)[I", "b", "Ljava/text/BreakIterator;", "c", "Ljava/text/BreakIterator;", "impl", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.b  reason: case insensitive filesystem */
public class C5087b extends C5084a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f19370d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f19371e = 8;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static C5087b f19372f;

    /* renamed from: c  reason: collision with root package name */
    private BreakIterator f19373c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/b$a;", "", "<init>", "()V", "Ljava/util/Locale;", "locale", "Landroidx/compose/ui/platform/b;", "a", "(Ljava/util/Locale;)Landroidx/compose/ui/platform/b;", "instance", "Landroidx/compose/ui/platform/b;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5087b a(Locale locale) {
            if (C5087b.f19372f == null) {
                C5087b.f19372f = new C5087b(locale, (DefaultConstructorMarker) null);
            }
            C5087b g10 = C5087b.f19372f;
            C17542s.h(g10, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return g10;
        }

        private a() {
        }
    }

    public /* synthetic */ C5087b(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    private final void i(Locale locale) {
        this.f19373c = BreakIterator.getCharacterInstance(locale);
    }

    public int[] a(int i10) {
        int length = d().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        do {
            BreakIterator breakIterator = this.f19373c;
            if (breakIterator == null) {
                C17542s.z("impl");
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f19373c;
                if (breakIterator2 == null) {
                    C17542s.z("impl");
                    breakIterator2 = null;
                }
                i10 = breakIterator2.following(i10);
            } else {
                BreakIterator breakIterator3 = this.f19373c;
                if (breakIterator3 == null) {
                    C17542s.z("impl");
                    breakIterator3 = null;
                }
                int following = breakIterator3.following(i10);
                if (following == -1) {
                    return null;
                }
                return c(i10, following);
            }
        } while (i10 != -1);
        return null;
    }

    public int[] b(int i10) {
        int length = d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        do {
            BreakIterator breakIterator = this.f19373c;
            if (breakIterator == null) {
                C17542s.z("impl");
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f19373c;
                if (breakIterator2 == null) {
                    C17542s.z("impl");
                    breakIterator2 = null;
                }
                i10 = breakIterator2.preceding(i10);
            } else {
                BreakIterator breakIterator3 = this.f19373c;
                if (breakIterator3 == null) {
                    C17542s.z("impl");
                    breakIterator3 = null;
                }
                int preceding = breakIterator3.preceding(i10);
                if (preceding == -1) {
                    return null;
                }
                return c(preceding, i10);
            }
        } while (i10 != -1);
        return null;
    }

    public void e(String str) {
        super.e(str);
        BreakIterator breakIterator = this.f19373c;
        if (breakIterator == null) {
            C17542s.z("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    private C5087b(Locale locale) {
        i(locale);
    }
}
