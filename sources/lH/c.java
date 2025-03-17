package Lh;

import XH.x;
import XH.y;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003H¦@¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LLh/c;", "T", "", "LXH/x;", "LLh/b;", "b", "(LdI/e;)Ljava/lang/Object;", "LLh/a;", "poi", "", "a", "(LLh/a;)Ljava/util/List;", "pointofinterest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c<T> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static <T> Object a(c<T> cVar, String str) {
            C17542s.j(str, "msg");
            x.a aVar = x.f139812b;
            return x.b(y.a(new IllegalStateException(str)));
        }

        public static <T> Object b(c<T> cVar, List<a<T>> list, a<T> aVar) {
            C17542s.j(list, "points");
            C17542s.j(aVar, "selected");
            x.a aVar2 = x.f139812b;
            return x.b(new b(list, aVar));
        }
    }

    List<Object> a(a<T> aVar);

    Object b(C17164e<? super x<b<T>>> eVar);
}
