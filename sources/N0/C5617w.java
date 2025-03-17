package n0;

import android.content.Context;
import android.widget.EdgeEffect;
import c2.r;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\rJ\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\rJ\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\rJ\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\rJ\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\rJ\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\rJ\r\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\rJ\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\rJ\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\rJ\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\nJ\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\nJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\nJ\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\nJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\nJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\nJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\nJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010\nJ\u0018\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010\"\u001a\u00020!8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010-R\u0018\u00103\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010-R\u0018\u00104\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010-R\u0018\u00105\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010-R\u001a\u00108\u001a\u00020\u000b*\u0004\u0018\u00010\b8BX\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001a\u0010:\u001a\u00020\u000b*\u0004\u0018\u00010\b8BX\u0004¢\u0006\u0006\u001a\u0004\b9\u00107\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Ln0/w;", "", "Landroid/content/Context;", "context", "", "glowColor", "<init>", "(Landroid/content/Context;I)V", "Landroid/widget/EdgeEffect;", "e", "()Landroid/widget/EdgeEffect;", "", "A", "()Z", "q", "t", "w", "z", "p", "s", "v", "y", "o", "r", "u", "l", "f", "h", "j", "m", "g", "i", "k", "Lc2/r;", "size", "LXH/N;", "B", "(J)V", "a", "Landroid/content/Context;", "b", "I", "c", "J", "d", "Landroid/widget/EdgeEffect;", "topEffect", "bottomEffect", "leftEffect", "rightEffect", "topEffectNegation", "bottomEffectNegation", "leftEffectNegation", "rightEffectNegation", "x", "(Landroid/widget/EdgeEffect;)Z", "isStretched", "n", "isAnimating", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.w  reason: case insensitive filesystem */
final class C5617w {

    /* renamed from: a  reason: collision with root package name */
    private final Context f26473a;

    /* renamed from: b  reason: collision with root package name */
    private final int f26474b;

    /* renamed from: c  reason: collision with root package name */
    private long f26475c = r.f23053b.a();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public EdgeEffect f26476d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public EdgeEffect f26477e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public EdgeEffect f26478f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public EdgeEffect f26479g;

    /* renamed from: h  reason: collision with root package name */
    private EdgeEffect f26480h;

    /* renamed from: i  reason: collision with root package name */
    private EdgeEffect f26481i;

    /* renamed from: j  reason: collision with root package name */
    private EdgeEffect f26482j;

    /* renamed from: k  reason: collision with root package name */
    private EdgeEffect f26483k;

    public C5617w(Context context, int i10) {
        this.f26473a = context;
        this.f26474b = i10;
    }

    private final EdgeEffect e() {
        EdgeEffect a10 = C5616v.f26472a.a(this.f26473a);
        a10.setColor(this.f26474b);
        if (!r.f(this.f26475c, r.f23053b.a())) {
            a10.setSize(r.h(this.f26475c), r.g(this.f26475c));
        }
        return a10;
    }

    private final boolean n(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    private final boolean x(EdgeEffect edgeEffect) {
        boolean z10 = false;
        if (edgeEffect == null) {
            return false;
        }
        if (C5616v.f26472a.b(edgeEffect) == 0.0f) {
            z10 = true;
        }
        return !z10;
    }

    public final boolean A() {
        return x(this.f26476d);
    }

    public final void B(long j10) {
        this.f26475c = j10;
        EdgeEffect edgeEffect = this.f26476d;
        if (edgeEffect != null) {
            edgeEffect.setSize(r.h(j10), r.g(j10));
        }
        EdgeEffect edgeEffect2 = this.f26477e;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize(r.h(j10), r.g(j10));
        }
        EdgeEffect edgeEffect3 = this.f26478f;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize(r.g(j10), r.h(j10));
        }
        EdgeEffect edgeEffect4 = this.f26479g;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize(r.g(j10), r.h(j10));
        }
        EdgeEffect edgeEffect5 = this.f26480h;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize(r.h(j10), r.g(j10));
        }
        EdgeEffect edgeEffect6 = this.f26481i;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize(r.h(j10), r.g(j10));
        }
        EdgeEffect edgeEffect7 = this.f26482j;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize(r.g(j10), r.h(j10));
        }
        EdgeEffect edgeEffect8 = this.f26483k;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize(r.g(j10), r.h(j10));
        }
    }

    public final EdgeEffect f() {
        EdgeEffect edgeEffect = this.f26477e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e10 = e();
        this.f26477e = e10;
        return e10;
    }

    public final EdgeEffect g() {
        EdgeEffect edgeEffect = this.f26481i;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e10 = e();
        this.f26481i = e10;
        return e10;
    }

    public final EdgeEffect h() {
        EdgeEffect edgeEffect = this.f26478f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e10 = e();
        this.f26478f = e10;
        return e10;
    }

    public final EdgeEffect i() {
        EdgeEffect edgeEffect = this.f26482j;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e10 = e();
        this.f26482j = e10;
        return e10;
    }

    public final EdgeEffect j() {
        EdgeEffect edgeEffect = this.f26479g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e10 = e();
        this.f26479g = e10;
        return e10;
    }

    public final EdgeEffect k() {
        EdgeEffect edgeEffect = this.f26483k;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e10 = e();
        this.f26483k = e10;
        return e10;
    }

    public final EdgeEffect l() {
        EdgeEffect edgeEffect = this.f26476d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e10 = e();
        this.f26476d = e10;
        return e10;
    }

    public final EdgeEffect m() {
        EdgeEffect edgeEffect = this.f26480h;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e10 = e();
        this.f26480h = e10;
        return e10;
    }

    public final boolean o() {
        return n(this.f26477e);
    }

    public final boolean p() {
        return x(this.f26481i);
    }

    public final boolean q() {
        return x(this.f26477e);
    }

    public final boolean r() {
        return n(this.f26478f);
    }

    public final boolean s() {
        return x(this.f26482j);
    }

    public final boolean t() {
        return x(this.f26478f);
    }

    public final boolean u() {
        return n(this.f26479g);
    }

    public final boolean v() {
        return x(this.f26483k);
    }

    public final boolean w() {
        return x(this.f26479g);
    }

    public final boolean y() {
        return n(this.f26476d);
    }

    public final boolean z() {
        return x(this.f26480h);
    }
}
