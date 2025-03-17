package lK;

import GJ.C15765h;
import GJ.C15768k;
import com.optimizely.ab.config.FeatureVariable;
import fK.C17251d;
import fK.r;
import java.util.Iterator;
import kK.C17513b;
import kK.C17514c;
import kK.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001aC\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"T", "LkK/c;", "json", "LlK/v;", "writer", "LfK/r;", "serializer", "value", "LXH/N;", "b", "(LkK/c;LlK/v;LfK/r;Ljava/lang/Object;)V", "LlK/u;", "reader", "LfK/d;", "deserializer", "LkK/b;", "format", "LGJ/h;", "a", "(LkK/c;LlK/u;LfK/d;LkK/b;)LGJ/h;", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class M {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"lK/M$a", "LGJ/h;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C15765h<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f144434a;

        public a(Iterator it) {
            this.f144434a = it;
        }

        public Iterator<T> iterator() {
            return this.f144434a;
        }
    }

    public static final <T> C15765h<T> a(C17514c cVar, C17589u uVar, C17251d<? extends T> dVar, C17513b bVar) {
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(uVar, "reader");
        C17542s.j(dVar, "deserializer");
        C17542s.j(bVar, "format");
        return C15768k.i(new a(C17564E.a(bVar, cVar, Y.a(cVar, uVar, new char[16384]), dVar)));
    }

    public static final <T> void b(C17514c cVar, C17590v vVar, r<? super T> rVar, T t10) {
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(vVar, "writer");
        C17542s.j(rVar, "serializer");
        new b0(vVar, cVar, k0.OBJ, new s[k0.b().size()]).n(rVar, t10);
    }
}
