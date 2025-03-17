package yH;

import io.ktor.utils.io.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pH.C17746a;
import qH.C17777b;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LyH/a;", "LqH/b;", "LpH/a;", "client", "Lio/ktor/utils/io/g;", "content", "originCall", "<init>", "(LpH/a;Lio/ktor/utils/io/g;LqH/b;)V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: yH.a  reason: case insensitive filesystem */
public final class C18711a extends C17777b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18711a(C17746a aVar, g gVar, C17777b bVar) {
        super(aVar);
        C17542s.j(aVar, "client");
        C17542s.j(gVar, "content");
        C17542s.j(bVar, "originCall");
        i(new C18713c(this, bVar.e()));
        j(new C18714d(this, gVar, bVar.f()));
    }
}
