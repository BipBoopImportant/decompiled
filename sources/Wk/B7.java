package wK;

import N1.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;
import s0.C5834E;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001a\u0010\"R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u001f\u0010\"¨\u0006#"}, d2 = {"LwK/B7;", "", "Lp1/v0;", "backgroundColor", "LN1/Y;", "headerTextStyle", "contentTextStyle", "Ls0/E;", "headerPaddingValues", "bodyPaddingValues", "footerPaddingValues", "<init>", "(JLN1/Y;LN1/Y;Ls0/E;Ls0/E;Ls0/E;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "LN1/Y;", "f", "()LN1/Y;", "c", "d", "Ls0/E;", "e", "()Ls0/E;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class B7 {

    /* renamed from: a  reason: collision with root package name */
    private final long f149280a;

    /* renamed from: b  reason: collision with root package name */
    private final Y f149281b;

    /* renamed from: c  reason: collision with root package name */
    private final Y f149282c;

    /* renamed from: d  reason: collision with root package name */
    private final C5834E f149283d;

    /* renamed from: e  reason: collision with root package name */
    private final C5834E f149284e;

    /* renamed from: f  reason: collision with root package name */
    private final C5834E f149285f;

    public /* synthetic */ B7(long j10, Y y10, Y y11, C5834E e10, C5834E e11, C5834E e12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, y10, y11, e10, e11, e12);
    }

    public final long a() {
        return this.f149280a;
    }

    public final C5834E b() {
        return this.f149284e;
    }

    public final Y c() {
        return this.f149282c;
    }

    public final C5834E d() {
        return this.f149285f;
    }

    public final C5834E e() {
        return this.f149283d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B7)) {
            return false;
        }
        B7 b72 = (B7) obj;
        return C5747v0.q(this.f149280a, b72.f149280a) && C17542s.e(this.f149281b, b72.f149281b) && C17542s.e(this.f149282c, b72.f149282c) && C17542s.e(this.f149283d, b72.f149283d) && C17542s.e(this.f149284e, b72.f149284e) && C17542s.e(this.f149285f, b72.f149285f);
    }

    public final Y f() {
        return this.f149281b;
    }

    public int hashCode() {
        return (((((((((C5747v0.w(this.f149280a) * 31) + this.f149281b.hashCode()) * 31) + this.f149282c.hashCode()) * 31) + this.f149283d.hashCode()) * 31) + this.f149284e.hashCode()) * 31) + this.f149285f.hashCode();
    }

    public String toString() {
        String x10 = C5747v0.x(this.f149280a);
        Y y10 = this.f149281b;
        Y y11 = this.f149282c;
        C5834E e10 = this.f149283d;
        C5834E e11 = this.f149284e;
        C5834E e12 = this.f149285f;
        return "PromptStyle(backgroundColor=" + x10 + ", headerTextStyle=" + y10 + ", contentTextStyle=" + y11 + ", headerPaddingValues=" + e10 + ", bodyPaddingValues=" + e11 + ", footerPaddingValues=" + e12 + ")";
    }

    private B7(long j10, Y y10, Y y11, C5834E e10, C5834E e11, C5834E e12) {
        C17542s.j(y10, "headerTextStyle");
        C17542s.j(y11, "contentTextStyle");
        C17542s.j(e10, "headerPaddingValues");
        C17542s.j(e11, "bodyPaddingValues");
        C17542s.j(e12, "footerPaddingValues");
        this.f149280a = j10;
        this.f149281b = y10;
        this.f149282c = y11;
        this.f149283d = e10;
        this.f149284e = e11;
        this.f149285f = e12;
    }
}
