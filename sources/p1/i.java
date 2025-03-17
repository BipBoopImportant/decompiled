package P1;

import O1.C;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0018B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001bJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b \u0010\u001bJ\u0015\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u0013J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0014\u0010'\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010&¨\u0006("}, d2 = {"LP1/i;", "", "", "charSequence", "", "start", "end", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/lang/CharSequence;IILjava/util/Locale;)V", "offset", "", "getPrevWordBeginningOnTwoWordsBoundary", "b", "(IZ)I", "getNextWordEndOnTwoWordBoundary", "c", "m", "(I)Z", "l", "h", "j", "LXH/N;", "a", "(I)V", "n", "(I)I", "o", "e", "d", "f", "g", "i", "k", "Ljava/lang/CharSequence;", "I", "Ljava/text/BreakIterator;", "Ljava/text/BreakIterator;", "iterator", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* renamed from: e  reason: collision with root package name */
    public static final a f11839e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f11840f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f11841a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11842b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11843c;

    /* renamed from: d  reason: collision with root package name */
    private final BreakIterator f11844d;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LP1/i$a;", "", "<init>", "()V", "", "cp", "", "a", "(I)Z", "WINDOW_WIDTH", "I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(int i10) {
            int type = Character.getType(i10);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        private a() {
        }
    }

    public i(CharSequence charSequence, int i10, int i11, Locale locale) {
        this.f11841a = charSequence;
        if (i10 < 0 || i10 > charSequence.length()) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        } else if (i11 < 0 || i11 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        } else {
            BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
            this.f11844d = wordInstance;
            this.f11842b = Math.max(0, i10 - 50);
            this.f11843c = Math.min(charSequence.length(), i11 + 50);
            wordInstance.setText(new C(charSequence, i10, i11));
        }
    }

    private final void a(int i10) {
        int i11 = this.f11842b;
        if (i10 > this.f11843c || i11 > i10) {
            throw new IllegalArgumentException(("Invalid offset: " + i10 + ". Valid range is [" + this.f11842b + " , " + this.f11843c + ']').toString());
        }
    }

    private final int b(int i10, boolean z10) {
        a(i10);
        if (j(i10)) {
            return (!this.f11844d.isBoundary(i10) || (h(i10) && z10)) ? this.f11844d.preceding(i10) : i10;
        }
        if (h(i10)) {
            return this.f11844d.preceding(i10);
        }
        return -1;
    }

    private final int c(int i10, boolean z10) {
        a(i10);
        if (h(i10)) {
            return (!this.f11844d.isBoundary(i10) || (j(i10) && z10)) ? this.f11844d.following(i10) : i10;
        }
        if (j(i10)) {
            return this.f11844d.following(i10);
        }
        return -1;
    }

    private final boolean h(int i10) {
        return i10 <= this.f11843c && this.f11842b + 1 <= i10 && Character.isLetterOrDigit(Character.codePointBefore(this.f11841a, i10));
    }

    private final boolean j(int i10) {
        return i10 < this.f11843c && this.f11842b <= i10 && Character.isLetterOrDigit(Character.codePointAt(this.f11841a, i10));
    }

    private final boolean l(int i10) {
        return !k(i10) && i(i10);
    }

    private final boolean m(int i10) {
        return k(i10) && !i(i10);
    }

    public final int d(int i10) {
        return c(i10, true);
    }

    public final int e(int i10) {
        return b(i10, true);
    }

    public final int f(int i10) {
        a(i10);
        while (i10 != -1 && !m(i10)) {
            i10 = o(i10);
        }
        return i10;
    }

    public final int g(int i10) {
        a(i10);
        while (i10 != -1 && !l(i10)) {
            i10 = n(i10);
        }
        return i10;
    }

    public final boolean i(int i10) {
        int i11 = this.f11842b + 1;
        if (i10 > this.f11843c || i11 > i10) {
            return false;
        }
        return f11839e.a(Character.codePointBefore(this.f11841a, i10));
    }

    public final boolean k(int i10) {
        int i11 = this.f11842b;
        if (i10 >= this.f11843c || i11 > i10) {
            return false;
        }
        return f11839e.a(Character.codePointAt(this.f11841a, i10));
    }

    public final int n(int i10) {
        a(i10);
        return this.f11844d.following(i10);
    }

    public final int o(int i10) {
        a(i10);
        return this.f11844d.preceding(i10);
    }
}
