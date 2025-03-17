package ul;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
/* renamed from: ul.a  reason: case insensitive filesystem */
public final class C12064a extends C17544u implements C17642l<Integer, Object> {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C17642l f103840c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List f103841d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12064a(C17642l lVar, List list) {
        super(1);
        this.f103840c = lVar;
        this.f103841d = list;
    }

    public final Object a(int i10) {
        return this.f103840c.invoke(this.f103841d.get(i10));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).intValue());
    }
}
