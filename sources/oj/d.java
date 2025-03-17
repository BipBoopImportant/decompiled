package oj;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Loj/d;", "Loj/b;", "", "icon", "", "text", "title", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "g", "b", "Ljava/lang/String;", "h", "c", "i", "", "d", "J", "f", "()J", "stableId", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements C11681b {

    /* renamed from: a  reason: collision with root package name */
    private final int f100410a;

    /* renamed from: b  reason: collision with root package name */
    private final String f100411b;

    /* renamed from: c  reason: collision with root package name */
    private final String f100412c;

    /* renamed from: d  reason: collision with root package name */
    private final long f100413d;

    public d(int i10, String str, String str2) {
        C17542s.j(str, "text");
        this.f100410a = i10;
        this.f100411b = str;
        this.f100412c = str2;
        Integer valueOf = Integer.valueOf(i10);
        Object[] objArr = {str2, str};
        U u10 = new U(3);
        u10.a(P.b(d.class));
        u10.a(valueOf);
        u10.b(objArr);
        this.f100413d = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f100410a == dVar.f100410a && C17542s.e(this.f100411b, dVar.f100411b) && C17542s.e(this.f100412c, dVar.f100412c);
    }

    public long f() {
        return this.f100413d;
    }

    public final int g() {
        return this.f100410a;
    }

    public final String h() {
        return this.f100411b;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f100410a) * 31) + this.f100411b.hashCode()) * 31;
        String str = this.f100412c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String i() {
        return this.f100412c;
    }

    public String toString() {
        int i10 = this.f100410a;
        String str = this.f100411b;
        String str2 = this.f100412c;
        return "GeneralErrorMessageModel(icon=" + i10 + ", text=" + str + ", title=" + str2 + ")";
    }
}
