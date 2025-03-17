package ZJ;

import QJ.C16297b0;
import XH.C16807N;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.W;
import nI.q;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8F¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"LZJ/b;", "", "", "timeMillis", "<init>", "(J)V", "LZJ/k;", "select", "ignoredParam", "LXH/N;", "d", "(LZJ/k;Ljava/lang/Object;)V", "a", "J", "LZJ/e;", "c", "()LZJ/e;", "getSelectClause$annotations", "()V", "selectClause", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZJ.b  reason: case insensitive filesystem */
final class C17007b {

    /* renamed from: a  reason: collision with root package name */
    private final long f140849a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZJ.b$a */
    /* synthetic */ class a extends C17540p implements q<C17007b, C17016k<?>, Object, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f140850a = new a();

        a() {
            super(3, C17007b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            t((C17007b) obj, (C17016k) obj2, obj3);
            return C16807N.f139792a;
        }

        public final void t(C17007b bVar, C17016k<?> kVar, Object obj) {
            bVar.d(kVar, obj);
        }
    }

    public C17007b(long j10) {
        this.f140849a = j10;
    }

    /* access modifiers changed from: private */
    public final void d(C17016k<?> kVar, Object obj) {
        if (this.f140849a <= 0) {
            kVar.c(C16807N.f139792a);
            return;
        }
        C17006a aVar = new C17006a(kVar, this);
        C17542s.h(kVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        C17015j jVar = (C17015j) kVar;
        C17168i context = jVar.getContext();
        jVar.n(C16297b0.d(context).u(this.f140849a, aVar, context));
    }

    /* access modifiers changed from: private */
    public static final void e(C17016k kVar, C17007b bVar) {
        kVar.f(bVar, C16807N.f139792a);
    }

    public final C17010e c() {
        a aVar = a.f140850a;
        C17542s.h(aVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new C17011f(this, (q) W.g(aVar, 3), (q) null, 4, (DefaultConstructorMarker) null);
    }
}
