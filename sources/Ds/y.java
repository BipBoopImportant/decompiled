package Ds;

import IC.C13023e;
import Ps.f;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import xB.C15201a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010'\u001a\u00020\"8\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"LDs/y;", "LxB/a;", "LPs/f;", "setting", "LIC/e;", "title", "description", "", "sortValue", "<init>", "(LPs/f;LIC/e;LIC/e;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LPs/f;", "h", "()LPs/f;", "b", "LIC/e;", "getTitle", "()LIC/e;", "c", "g", "d", "I", "i", "", "e", "J", "f", "()J", "stableId", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final f f80308a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f80309b;

    /* renamed from: c  reason: collision with root package name */
    private final C13023e f80310c;

    /* renamed from: d  reason: collision with root package name */
    private final int f80311d;

    /* renamed from: e  reason: collision with root package name */
    private final long f80312e;

    public y(f fVar, C13023e eVar, C13023e eVar2, int i10) {
        C17542s.j(fVar, "setting");
        C17542s.j(eVar, "title");
        C17542s.j(eVar2, "description");
        this.f80308a = fVar;
        this.f80309b = eVar;
        this.f80310c = eVar2;
        this.f80311d = i10;
        Integer valueOf = Integer.valueOf(i10);
        Object[] objArr = {eVar, eVar2, Integer.valueOf(i10)};
        U u10 = new U(3);
        u10.a(P.b(y.class));
        u10.a(valueOf);
        u10.b(objArr);
        this.f80312e = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return C17542s.e(this.f80308a, yVar.f80308a) && C17542s.e(this.f80309b, yVar.f80309b) && C17542s.e(this.f80310c, yVar.f80310c) && this.f80311d == yVar.f80311d;
    }

    public long f() {
        return this.f80312e;
    }

    public final C13023e g() {
        return this.f80310c;
    }

    public final C13023e getTitle() {
        return this.f80309b;
    }

    public final f h() {
        return this.f80308a;
    }

    public int hashCode() {
        return (((((this.f80308a.hashCode() * 31) + this.f80309b.hashCode()) * 31) + this.f80310c.hashCode()) * 31) + Integer.hashCode(this.f80311d);
    }

    public final int i() {
        return this.f80311d;
    }

    public String toString() {
        f fVar = this.f80308a;
        C13023e eVar = this.f80309b;
        C13023e eVar2 = this.f80310c;
        int i10 = this.f80311d;
        return "NotificationSettingUi(setting=" + fVar + ", title=" + eVar + ", description=" + eVar2 + ", sortValue=" + i10 + ")";
    }
}
