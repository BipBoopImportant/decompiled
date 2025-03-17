package Ct;

import HJ.C15854t;
import XH.t;
import XH.x;
import am.C11070a;
import com.sugarcube.core.logger.DslKt;
import cp.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0013"}, d2 = {"LCt/k;", "LCt/j;", "Lam/a;", "appApi", "Lcp/e;", "uriParser", "<init>", "(Lam/a;Lcp/e;)V", "Lcp/e$a;", "", "b", "(Lcp/e$a;)Z", "", "url", "a", "(Ljava/lang/String;)Z", "Lam/a;", "Lcp/e;", "c", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f79770c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f79771d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C11070a f79772a;

    /* renamed from: b  reason: collision with root package name */
    private final e f79773b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LCt/k$a;", "", "<init>", "()V", "", "FOOD_MOBILE_HOST", "Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public k(C11070a aVar, e eVar) {
        C17542s.j(aVar, "appApi");
        C17542s.j(eVar, "uriParser");
        this.f79772a = aVar;
        this.f79773b = eVar;
    }

    private final boolean b(e.a aVar) {
        return H2.e.f7056c.matcher(aVar.b()).matches() && C17542s.e(C15854t.O0(aVar.a(), "www."), "foodmobile.ikea.com");
    }

    public boolean a(String str) {
        boolean z10 = false;
        if (str == null || str.length() == 0) {
            return false;
        }
        Object a10 = this.f79773b.a(str);
        if (x.e(a10) == null) {
            z10 = b((e.a) a10);
        }
        if (!z10) {
            qv.e eVar = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a11 = C11818a.a("Invalid url received, " + str, (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str2 = C11820c.a(a11);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = k.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, (Throwable) null, str4);
                str2 = str4;
                str3 = str5;
            }
        }
        boolean b10 = this.f79772a.b();
        if (b10) {
            return true;
        }
        if (!b10) {
            return z10;
        }
        throw new t();
    }
}
