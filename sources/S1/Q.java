package S1;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR \u0010\u0007\u001a\u00020\u00068\u0016X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R&\u0010\u000b\u001a\u00020\n8WX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u0010\u0019\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0014\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"LS1/Q;", "LS1/l;", "", "resId", "LS1/C;", "weight", "LS1/x;", "style", "LS1/B;", "variationSettings", "LS1/v;", "loadingStrategy", "<init>", "(ILS1/C;ILS1/B;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "I", "d", "c", "LS1/C;", "()LS1/C;", "e", "LS1/B;", "()LS1/B;", "f", "a", "getLoadingStrategy-PKNRLFQ$annotations", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Q implements C4819l {

    /* renamed from: b  reason: collision with root package name */
    private final int f13346b;

    /* renamed from: c  reason: collision with root package name */
    private final C f13347c;

    /* renamed from: d  reason: collision with root package name */
    private final int f13348d;

    /* renamed from: e  reason: collision with root package name */
    private final B f13349e;

    /* renamed from: f  reason: collision with root package name */
    private final int f13350f;

    public /* synthetic */ Q(int i10, C c10, int i11, B b10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, c10, i11, b10, i12);
    }

    public int a() {
        return this.f13350f;
    }

    public C b() {
        return this.f13347c;
    }

    public int c() {
        return this.f13348d;
    }

    public final int d() {
        return this.f13346b;
    }

    public final B e() {
        return this.f13349e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        return this.f13346b == q10.f13346b && C17542s.e(b(), q10.b()) && C4830x.f(c(), q10.c()) && C17542s.e(this.f13349e, q10.f13349e) && C4828v.e(a(), q10.a());
    }

    public int hashCode() {
        return (((((((this.f13346b * 31) + b().hashCode()) * 31) + C4830x.g(c())) * 31) + C4828v.f(a())) * 31) + this.f13349e.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.f13346b + ", weight=" + b() + ", style=" + C4830x.h(c()) + ", loadingStrategy=" + C4828v.g(a()) + ')';
    }

    private Q(int i10, C c10, int i11, B b10, int i12) {
        this.f13346b = i10;
        this.f13347c = c10;
        this.f13348d = i11;
        this.f13349e = b10;
        this.f13350f = i12;
    }
}
