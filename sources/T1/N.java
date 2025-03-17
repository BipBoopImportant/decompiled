package T1;

import N1.C4669d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"LT1/N;", "LT1/i;", "LN1/d;", "annotatedString", "", "newCursorPosition", "<init>", "(LN1/d;I)V", "", "text", "(Ljava/lang/String;I)V", "LT1/l;", "buffer", "LXH/N;", "a", "(LT1/l;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "LN1/d;", "getAnnotatedString", "()LN1/d;", "b", "I", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class N implements C4840i {

    /* renamed from: a  reason: collision with root package name */
    private final C4669d f13533a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13534b;

    public N(C4669d dVar, int i10) {
        this.f13533a = dVar;
        this.f13534b = i10;
    }

    public void a(C4843l lVar) {
        if (lVar.l()) {
            int f10 = lVar.f();
            lVar.m(lVar.f(), lVar.e(), c());
            if (c().length() > 0) {
                lVar.n(f10, c().length() + f10);
            }
        } else {
            int k10 = lVar.k();
            lVar.m(lVar.k(), lVar.j(), c());
            if (c().length() > 0) {
                lVar.n(k10, c().length() + k10);
            }
        }
        int g10 = lVar.g();
        int i10 = this.f13534b;
        lVar.o(C17978n.m(i10 > 0 ? (g10 + i10) - 1 : (g10 + i10) - c().length(), 0, lVar.h()));
    }

    public final int b() {
        return this.f13534b;
    }

    public final String c() {
        return this.f13533a.j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return C17542s.e(c(), n10.c()) && this.f13534b == n10.f13534b;
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.f13534b;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + c() + "', newCursorPosition=" + this.f13534b + ')';
    }

    public N(String str, int i10) {
        this(new C4669d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), i10);
    }
}
