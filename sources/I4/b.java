package I4;

import QJ.Y;
import XH.C16807N;
import androidx.concurrent.futures.c;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import ob.C10101e;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "LQJ/Y;", "", "tag", "Lob/e;", "b", "(LQJ/Y;Ljava/lang/Object;)Lob/e;", "ads-adservices-java_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c.a<T> f36855c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Y<T> f36856d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c.a<T> aVar, Y<? extends T> y10) {
            super(1);
            this.f36855c = aVar;
            this.f36856d = y10;
        }

        public final void a(Throwable th2) {
            if (th2 == null) {
                this.f36855c.c(this.f36856d.o());
            } else if (th2 instanceof CancellationException) {
                this.f36855c.d();
            } else {
                this.f36855c.f(th2);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    public static final <T> C10101e<T> b(Y<? extends T> y10, Object obj) {
        C17542s.j(y10, "<this>");
        C10101e<T> a10 = c.a(new a(y10, obj));
        C17542s.i(a10, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return a10;
    }

    public static /* synthetic */ C10101e c(Y y10, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(y10, obj);
    }

    /* access modifiers changed from: private */
    public static final Object d(Y y10, Object obj, c.a aVar) {
        C17542s.j(y10, "$this_asListenableFuture");
        C17542s.j(aVar, "completer");
        y10.s(new a(aVar, y10));
        return obj;
    }
}
