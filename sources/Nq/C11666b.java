package nq;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lnq/b;", "Lnq/d;", "", "url", "contentDescription", "Lkotlin/Function0;", "LXH/N;", "onClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;LnI/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "LnI/a;", "()LnI/a;", "energylabel-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nq.b  reason: case insensitive filesystem */
public final class C11666b extends C11668d {

    /* renamed from: a  reason: collision with root package name */
    private final String f99981a;

    /* renamed from: b  reason: collision with root package name */
    private final String f99982b;

    /* renamed from: c  reason: collision with root package name */
    private final C17631a<C16807N> f99983c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11666b(String str, String str2, C17631a<C16807N> aVar) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "url");
        C17542s.j(aVar, "onClick");
        this.f99981a = str;
        this.f99982b = str2;
        this.f99983c = aVar;
    }

    public final String a() {
        return this.f99982b;
    }

    public final C17631a<C16807N> b() {
        return this.f99983c;
    }

    public final String c() {
        return this.f99981a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11666b)) {
            return false;
        }
        C11666b bVar = (C11666b) obj;
        return C17542s.e(this.f99981a, bVar.f99981a) && C17542s.e(this.f99982b, bVar.f99982b) && C17542s.e(this.f99983c, bVar.f99983c);
    }

    public int hashCode() {
        int hashCode = this.f99981a.hashCode() * 31;
        String str = this.f99982b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f99983c.hashCode();
    }

    public String toString() {
        String str = this.f99981a;
        String str2 = this.f99982b;
        C17631a<C16807N> aVar = this.f99983c;
        return "EnergyLabelModel(url=" + str + ", contentDescription=" + str2 + ", onClick=" + aVar + ")";
    }
}
