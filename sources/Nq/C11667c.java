package nq;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, d2 = {"Lnq/c;", "Lnq/d;", "", "text", "url", "contentDescription", "Lkotlin/Function0;", "LXH/N;", "onClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LnI/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "getUrl", "d", "LnI/a;", "()LnI/a;", "energylabel-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nq.c  reason: case insensitive filesystem */
public final class C11667c extends C11668d {

    /* renamed from: a  reason: collision with root package name */
    private final String f99984a;

    /* renamed from: b  reason: collision with root package name */
    private final String f99985b;

    /* renamed from: c  reason: collision with root package name */
    private final String f99986c;

    /* renamed from: d  reason: collision with root package name */
    private final C17631a<C16807N> f99987d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11667c(String str, String str2, String str3, C17631a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, aVar);
    }

    public final String a() {
        return this.f99986c;
    }

    public final C17631a<C16807N> b() {
        return this.f99987d;
    }

    public final String c() {
        return this.f99984a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11667c)) {
            return false;
        }
        C11667c cVar = (C11667c) obj;
        return C17542s.e(this.f99984a, cVar.f99984a) && C17542s.e(this.f99985b, cVar.f99985b) && C17542s.e(this.f99986c, cVar.f99986c) && C17542s.e(this.f99987d, cVar.f99987d);
    }

    public int hashCode() {
        int hashCode = ((this.f99984a.hashCode() * 31) + this.f99985b.hashCode()) * 31;
        String str = this.f99986c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f99987d.hashCode();
    }

    public String toString() {
        String str = this.f99984a;
        String str2 = this.f99985b;
        String str3 = this.f99986c;
        C17631a<C16807N> aVar = this.f99987d;
        return "InfoLinkModel(text=" + str + ", url=" + str2 + ", contentDescription=" + str3 + ", onClick=" + aVar + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11667c(String str, String str2, String str3, C17631a<C16807N> aVar) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "text");
        C17542s.j(str2, "url");
        C17542s.j(aVar, "onClick");
        this.f99984a = str;
        this.f99985b = str2;
        this.f99986c = str3;
        this.f99987d = aVar;
    }
}
