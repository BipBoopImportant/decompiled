package Sh;

import Ax.c;
import Uh.s;
import Wk.d;
import bi.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LSh/a;", "", "a", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1092a f63422a = new C1092a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LSh/a$a;", "", "<init>", "()V", "LAx/c;", "productRemoteDataSource", "LWk/d;", "stockRepository", "LAx/a;", "productDetailsRemoteDataSource", "Lbi/a;", "b", "(LAx/c;LWk/d;LAx/a;)Lbi/a;", "LZw/a;", "a", "()LZw/a;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Sh.a$a  reason: collision with other inner class name */
    public static final class C1092a {
        public /* synthetic */ C1092a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Zw.a a() {
            return new s();
        }

        public final bi.a b(c cVar, d dVar, Ax.a aVar) {
            C17542s.j(cVar, "productRemoteDataSource");
            C17542s.j(dVar, "stockRepository");
            C17542s.j(aVar, "productDetailsRemoteDataSource");
            return new b(cVar, dVar, aVar);
        }

        private C1092a() {
        }
    }
}
