package Gh;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b#\u0010(¨\u0006)"}, d2 = {"LGh/b;", "", "", "durationMs", "LGh/a;", "framing", "", "title", "category", "analyticsId", "LGh/d;", "video", "LGh/c;", "image", "<init>", "(JLGh/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LGh/d;LGh/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "LGh/a;", "d", "()LGh/a;", "Ljava/lang/String;", "f", "e", "LGh/d;", "g", "()LGh/d;", "LGh/c;", "()LGh/c;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final long f60730a;

    /* renamed from: b  reason: collision with root package name */
    private final a f60731b;

    /* renamed from: c  reason: collision with root package name */
    private final String f60732c;

    /* renamed from: d  reason: collision with root package name */
    private final String f60733d;

    /* renamed from: e  reason: collision with root package name */
    private final String f60734e;

    /* renamed from: f  reason: collision with root package name */
    private final d f60735f;

    /* renamed from: g  reason: collision with root package name */
    private final c f60736g;

    public b(long j10, a aVar, String str, String str2, String str3, d dVar, c cVar) {
        C17542s.j(aVar, "framing");
        C17542s.j(str, "title");
        C17542s.j(str2, "category");
        C17542s.j(str3, "analyticsId");
        this.f60730a = j10;
        this.f60731b = aVar;
        this.f60732c = str;
        this.f60733d = str2;
        this.f60734e = str3;
        this.f60735f = dVar;
        this.f60736g = cVar;
    }

    public final String a() {
        return this.f60734e;
    }

    public final String b() {
        return this.f60733d;
    }

    public final long c() {
        return this.f60730a;
    }

    public final a d() {
        return this.f60731b;
    }

    public final c e() {
        return this.f60736g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f60730a == bVar.f60730a && this.f60731b == bVar.f60731b && C17542s.e(this.f60732c, bVar.f60732c) && C17542s.e(this.f60733d, bVar.f60733d) && C17542s.e(this.f60734e, bVar.f60734e) && C17542s.e(this.f60735f, bVar.f60735f) && C17542s.e(this.f60736g, bVar.f60736g);
    }

    public final String f() {
        return this.f60732c;
    }

    public final d g() {
        return this.f60735f;
    }

    public int hashCode() {
        int hashCode = ((((((((Long.hashCode(this.f60730a) * 31) + this.f60731b.hashCode()) * 31) + this.f60732c.hashCode()) * 31) + this.f60733d.hashCode()) * 31) + this.f60734e.hashCode()) * 31;
        d dVar = this.f60735f;
        int i10 = 0;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        c cVar = this.f60736g;
        if (cVar != null) {
            i10 = cVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        long j10 = this.f60730a;
        a aVar = this.f60731b;
        String str = this.f60732c;
        String str2 = this.f60733d;
        String str3 = this.f60734e;
        d dVar = this.f60735f;
        c cVar = this.f60736g;
        return "OnboardingFeature(durationMs=" + j10 + ", framing=" + aVar + ", title=" + str + ", category=" + str2 + ", analyticsId=" + str3 + ", video=" + dVar + ", image=" + cVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(long j10, a aVar, String str, String str2, String str3, d dVar, c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, aVar, str, str2, str3, (i10 & 32) != 0 ? null : dVar, (i10 & 64) != 0 ? null : cVar);
    }
}
