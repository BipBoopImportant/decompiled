package N1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0015B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u000f\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"LN1/C;", "", "", "includeFontPadding", "<init>", "(Z)V", "()V", "LN1/j;", "emojiSupportMatch", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "d", "(LN1/C;)LN1/C;", "a", "Z", "c", "()Z", "getIncludeFontPadding$annotations", "b", "I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C {

    /* renamed from: c  reason: collision with root package name */
    public static final a f9280c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C f9281d = new C();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f9282a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9283b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LN1/C$a;", "", "<init>", "()V", "LN1/C;", "Default", "LN1/C;", "a", "()LN1/C;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C a() {
            return C.f9281d;
        }

        private a() {
        }
    }

    public /* synthetic */ C(int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10);
    }

    public final int b() {
        return this.f9283b;
    }

    public final boolean c() {
        return this.f9282a;
    }

    public final C d(C c10) {
        return c10 == null ? this : c10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return this.f9282a == c10.f9282a && C4675j.g(this.f9283b, c10.f9283b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f9282a) * 31) + C4675j.h(this.f9283b);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f9282a + ", emojiSupportMatch=" + C4675j.i(this.f9283b) + ')';
    }

    public C(boolean z10) {
        this.f9282a = z10;
        this.f9283b = C4675j.f9464b.b();
    }

    private C(int i10, boolean z10) {
        this.f9282a = z10;
        this.f9283b = i10;
    }

    public C() {
        this(C4675j.f9464b.b(), false, (DefaultConstructorMarker) null);
    }
}
