package Zz;

import GK.C15805x;
import QL.h;
import SL.C16454c;
import Yz.b;
import com.optimizely.ab.config.FeatureVariable;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LZz/a;", "", "a", "serialization_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2950a f118449a = C2950a.f118450a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LZz/a$a;", "", "<init>", "()V", "LkK/c;", "b", "()LkK/c;", "json", "LQL/h$a;", "a", "(LkK/c;)LQL/h$a;", "serialization_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zz.a$a  reason: collision with other inner class name */
    public static final class C2950a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C2950a f118450a = new C2950a();

        private C2950a() {
        }

        public final h.a a(C17514c cVar) {
            C17542s.j(cVar, FeatureVariable.JSON_TYPE);
            return C16454c.a(cVar, C15805x.f135130e.a("application/json"));
        }

        public final C17514c b() {
            return b.f118278a.b();
        }
    }
}
