package ip;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import qI.C17785b;
import uI.C18064m;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "initialValue", "Lkotlin/Function1;", "LXH/N;", "onChange", "LqI/b;", "a", "(Ljava/lang/Object;LnI/l;)LqI/b;", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ip/m$a", "LqI/b;", "LuI/m;", "property", "oldValue", "newValue", "LXH/N;", "c", "(LuI/m;Ljava/lang/Object;Ljava/lang/Object;)V", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C17785b<T> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f98544b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(T t10, C17642l<? super T, C16807N> lVar) {
            super(t10);
            this.f98544b = lVar;
        }

        /* access modifiers changed from: protected */
        public void c(C18064m<?> mVar, T t10, T t11) {
            C17542s.j(mVar, "property");
            if (!C17542s.e(t10, t11)) {
                this.f98544b.invoke(t11);
            }
        }
    }

    public static final <T> C17785b<T> a(T t10, C17642l<? super T, C16807N> lVar) {
        C17542s.j(lVar, "onChange");
        return new a(t10, lVar);
    }
}
