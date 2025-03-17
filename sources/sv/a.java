package Sv;

import IC.C13023e;
import IC.C13026h;
import Rv.c;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import xB.C15201a;
import yv.C9008m;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u000bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u001a\u0010#\u001a\u00020\u001e8\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b$\u0010\u001aR\u0019\u0010*\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)¨\u0006+"}, d2 = {"LSv/a;", "LxB/a;", "", "id", "LIC/e;", "title", "imageUrl", "applink", "<init>", "(Ljava/lang/String;LIC/e;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "LIC/e;", "getTitle", "()LIC/e;", "c", "h", "d", "", "e", "J", "f", "()J", "stableId", "l", "label", "LRv/c$a$a;", "g", "LRv/c$a$a;", "()LRv/c$a$a;", "clickEvent", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements C15201a {

    /* renamed from: h  reason: collision with root package name */
    public static final int f39931h = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final String f39932a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f39933b;

    /* renamed from: c  reason: collision with root package name */
    private final String f39934c;

    /* renamed from: d  reason: collision with root package name */
    private final String f39935d;

    /* renamed from: e  reason: collision with root package name */
    private final long f39936e;

    /* renamed from: f  reason: collision with root package name */
    private final C13023e f39937f = C13026h.a(C9008m.f58142O);

    /* renamed from: g  reason: collision with root package name */
    private final c.a.C0640a f39938g;

    public a(String str, C13023e eVar, String str2, String str3) {
        C17542s.j(str, "id");
        C17542s.j(eVar, "title");
        C17542s.j(str2, "imageUrl");
        this.f39932a = str;
        this.f39933b = eVar;
        this.f39934c = str2;
        this.f39935d = str3;
        U u10 = new U(3);
        u10.a(P.b(a.class));
        u10.a(str);
        u10.b(new Object[0]);
        this.f39936e = (long) Objects.hash(u10.d(new Object[u10.c()]));
        this.f39938g = str3 != null ? new c.a.C0640a(str, str3) : null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f39932a, aVar.f39932a) && C17542s.e(this.f39933b, aVar.f39933b) && C17542s.e(this.f39934c, aVar.f39934c) && C17542s.e(this.f39935d, aVar.f39935d);
    }

    public long f() {
        return this.f39936e;
    }

    public final c.a.C0640a g() {
        return this.f39938g;
    }

    public final C13023e getTitle() {
        return this.f39933b;
    }

    public final String h() {
        return this.f39934c;
    }

    public int hashCode() {
        int hashCode = ((((this.f39932a.hashCode() * 31) + this.f39933b.hashCode()) * 31) + this.f39934c.hashCode()) * 31;
        String str = this.f39935d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final C13023e l() {
        return this.f39937f;
    }

    public String toString() {
        String str = this.f39932a;
        C13023e eVar = this.f39933b;
        String str2 = this.f39934c;
        String str3 = this.f39935d;
        return "BenefitUiModel(id=" + str + ", title=" + eVar + ", imageUrl=" + str2 + ", applink=" + str3 + ")";
    }
}
