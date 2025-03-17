package D4;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"LD4/g;", "", "LD4/v;", "refresh", "prepend", "append", "LD4/w;", "source", "mediator", "<init>", "(LD4/v;LD4/v;LD4/v;LD4/w;LD4/w;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "LD4/v;", "d", "()LD4/v;", "b", "c", "LD4/w;", "e", "()LD4/w;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: D4.g  reason: case insensitive filesystem */
public final class C6433g {

    /* renamed from: a  reason: collision with root package name */
    private final C6447v f34342a;

    /* renamed from: b  reason: collision with root package name */
    private final C6447v f34343b;

    /* renamed from: c  reason: collision with root package name */
    private final C6447v f34344c;

    /* renamed from: d  reason: collision with root package name */
    private final C6448w f34345d;

    /* renamed from: e  reason: collision with root package name */
    private final C6448w f34346e;

    public C6433g(C6447v vVar, C6447v vVar2, C6447v vVar3, C6448w wVar, C6448w wVar2) {
        C17542s.j(vVar, "refresh");
        C17542s.j(vVar2, "prepend");
        C17542s.j(vVar3, "append");
        C17542s.j(wVar, "source");
        this.f34342a = vVar;
        this.f34343b = vVar2;
        this.f34344c = vVar3;
        this.f34345d = wVar;
        this.f34346e = wVar2;
    }

    public final C6447v a() {
        return this.f34344c;
    }

    public final C6448w b() {
        return this.f34346e;
    }

    public final C6447v c() {
        return this.f34343b;
    }

    public final C6447v d() {
        return this.f34342a;
    }

    public final C6448w e() {
        return this.f34345d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17542s.e(C6433g.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17542s.h(obj, "null cannot be cast to non-null type androidx.paging.CombinedLoadStates");
        C6433g gVar = (C6433g) obj;
        return C17542s.e(this.f34342a, gVar.f34342a) && C17542s.e(this.f34343b, gVar.f34343b) && C17542s.e(this.f34344c, gVar.f34344c) && C17542s.e(this.f34345d, gVar.f34345d) && C17542s.e(this.f34346e, gVar.f34346e);
    }

    public int hashCode() {
        int hashCode = ((((((this.f34342a.hashCode() * 31) + this.f34343b.hashCode()) * 31) + this.f34344c.hashCode()) * 31) + this.f34345d.hashCode()) * 31;
        C6448w wVar = this.f34346e;
        return hashCode + (wVar != null ? wVar.hashCode() : 0);
    }

    public String toString() {
        return "CombinedLoadStates(refresh=" + this.f34342a + ", prepend=" + this.f34343b + ", append=" + this.f34344c + ", source=" + this.f34345d + ", mediator=" + this.f34346e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6433g(C6447v vVar, C6447v vVar2, C6447v vVar3, C6448w wVar, C6448w wVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(vVar, vVar2, vVar3, wVar, (i10 & 16) != 0 ? null : wVar2);
    }
}
