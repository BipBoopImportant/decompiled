package EH;

import JH.v;
import XH.C16807N;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LEH/l;", "LJH/v;", "a", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.l  reason: case insensitive filesystem */
public interface C15627l extends v {

    /* renamed from: a  reason: collision with root package name */
    public static final a f134034a = a.f134035a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"LEH/l$a;", "", "<init>", "()V", "LEH/l;", "b", "LEH/l;", "a", "()LEH/l;", "getEmpty$annotations", "Empty", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: EH.l$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f134035a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final C15627l f134036b = C15621f.f134022c;

        private a() {
        }

        public final C15627l a() {
            return f134036b;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: EH.l$b */
    public static final class b {
        public static void a(C15627l lVar, p<? super String, ? super List<String>, C16807N> pVar) {
            C17542s.j(pVar, "body");
            v.a.a(lVar, pVar);
        }

        public static String b(C15627l lVar, String str) {
            C17542s.j(str, "name");
            return v.a.b(lVar, str);
        }
    }
}
