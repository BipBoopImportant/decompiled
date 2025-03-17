package U0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "", "it", "a", "(J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
/* renamed from: U0.i0  reason: case insensitive filesystem */
public final class C4882i0 extends C17544u implements C17642l<Long, Object> {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C17642l<Long, Object> f13997c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4882i0(C17642l<? super Long, Object> lVar) {
        super(1);
        this.f13997c = lVar;
    }

    public final Object a(long j10) {
        return this.f13997c.invoke(Long.valueOf(j10 / 1000000));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).longValue());
    }
}
