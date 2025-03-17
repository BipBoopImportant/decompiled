package Rv;

import Wv.a;
import Wv.c;
import Wv.f;
import Wv.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010!¨\u0006\""}, d2 = {"LRv/a;", "", "LWv/c$a;", "scaffoldData", "LWv/a$a;", "overviewData", "LWv/h$a;", "yourHomeData", "LWv/f$a;", "settingsData", "<init>", "(LWv/c$a;LWv/a$a;LWv/h$a;LWv/f$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LWv/c$a;", "b", "()LWv/c$a;", "LWv/a$a;", "()LWv/a$a;", "c", "LWv/h$a;", "d", "()LWv/h$a;", "LWv/f$a;", "()LWv/f$a;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final c.a f39755a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0672a f39756b;

    /* renamed from: c  reason: collision with root package name */
    private final h.a f39757c;

    /* renamed from: d  reason: collision with root package name */
    private final f.a f39758d;

    public a(c.a aVar, a.C0672a aVar2, h.a aVar3, f.a aVar4) {
        C17542s.j(aVar, "scaffoldData");
        C17542s.j(aVar2, "overviewData");
        C17542s.j(aVar3, "yourHomeData");
        C17542s.j(aVar4, "settingsData");
        this.f39755a = aVar;
        this.f39756b = aVar2;
        this.f39757c = aVar3;
        this.f39758d = aVar4;
    }

    public final a.C0672a a() {
        return this.f39756b;
    }

    public final c.a b() {
        return this.f39755a;
    }

    public final f.a c() {
        return this.f39758d;
    }

    public final h.a d() {
        return this.f39757c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f39755a, aVar.f39755a) && C17542s.e(this.f39756b, aVar.f39756b) && C17542s.e(this.f39757c, aVar.f39757c) && C17542s.e(this.f39758d, aVar.f39758d);
    }

    public int hashCode() {
        return (((((this.f39755a.hashCode() * 31) + this.f39756b.hashCode()) * 31) + this.f39757c.hashCode()) * 31) + this.f39758d.hashCode();
    }

    public String toString() {
        c.a aVar = this.f39755a;
        a.C0672a aVar2 = this.f39756b;
        h.a aVar3 = this.f39757c;
        f.a aVar4 = this.f39758d;
        return "Content(scaffoldData=" + aVar + ", overviewData=" + aVar2 + ", yourHomeData=" + aVar3 + ", settingsData=" + aVar4 + ")";
    }
}
