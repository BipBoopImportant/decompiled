package Ii;

import D4.K;
import D4.L;
import D4.M;
import D4.P;
import Il.a;
import Li.C10765a;
import Li.b;
import Li.c;
import Mi.C10774i;
import TJ.C16532g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LIi/d;", "LLi/a;", "LLi/b;", "reviewsRepository", "LIl/a;", "appConfigApi", "<init>", "(LLi/b;LIl/a;)V", "", "itemNo", "LLi/c;", "sortingData", "LTJ/g;", "LD4/M;", "LMi/i;", "a", "(Ljava/lang/String;LLi/c;)LTJ/g;", "LLi/b;", "b", "LIl/a;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ii.d  reason: case insensitive filesystem */
public final class C10733d implements C10765a {

    /* renamed from: a  reason: collision with root package name */
    private final b f81786a;

    /* renamed from: b  reason: collision with root package name */
    private final a f81787b;

    public C10733d(b bVar, a aVar) {
        C17542s.j(bVar, "reviewsRepository");
        C17542s.j(aVar, "appConfigApi");
        this.f81786a = bVar;
        this.f81787b = aVar;
    }

    /* access modifiers changed from: private */
    public static final P c(C10733d dVar, String str, c cVar) {
        return new C10731b(dVar.f81786a, str, cVar, dVar.f81787b.i(), dVar.f81787b.a());
    }

    public C16532g<M<C10774i>> a(String str, c cVar) {
        C17542s.j(str, "itemNo");
        return new K(new L(5, 0, false, 5, 0, 0, 50, (DefaultConstructorMarker) null), new C10730a(0), new C10732c(this, str, cVar)).a();
    }
}
