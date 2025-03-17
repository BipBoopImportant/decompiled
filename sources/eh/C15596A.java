package EH;

import JH.v;
import XH.C16807N;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LEH/A;", "LJH/v;", "b", "a", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.A  reason: case insensitive filesystem */
public interface C15596A extends v {

    /* renamed from: b  reason: collision with root package name */
    public static final a f133921b = a.f133922a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LEH/A$a;", "", "<init>", "()V", "LEH/A;", "b", "LEH/A;", "a", "()LEH/A;", "Empty", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: EH.A$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f133922a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final C15596A f133923b = C15622g.f134023c;

        private a() {
        }

        public final C15596A a() {
            return f133923b;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: EH.A$b */
    public static final class b {
        public static void a(C15596A a10, p<? super String, ? super List<String>, C16807N> pVar) {
            C17542s.j(pVar, "body");
            v.a.a(a10, pVar);
        }
    }
}
