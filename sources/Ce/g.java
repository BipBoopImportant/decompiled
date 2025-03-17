package Ce;

import HJ.C15854t;
import android.content.Context;
import b8.i;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l8.C8542f;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018¨\u0006\u0019"}, d2 = {"LCe/g;", "LCe/f;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LXH/N;", "f", "()V", "", "name", "a", "(Ljava/lang/String;)V", "value", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "transactionId", "", "price", "currency", "b", "(Ljava/lang/String;DLjava/lang/String;)V", "d", "e", "Landroid/content/Context;", "contentsquare-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f58988a;

    public g(Context context) {
        C17542s.j(context, "context");
        this.f58988a = context;
    }

    public void a(String str) {
        C17542s.j(str, "name");
        i.l(str);
    }

    public void b(String str, double d10, String str2) {
        String str3 = str;
        String str4 = str2;
        C17542s.j(str3, "transactionId");
        C17542s.j(str4, "currency");
        int d11 = j8.i.f54089a.d(str4);
        if (d11 == -1) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str4 + " not found in contentsquare Currencies");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str5 = null;
            String str6 = null;
            for (C11819b bVar : arrayList) {
                if (str5 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str5 = C11820c.a(a10);
                }
                String str7 = str5;
                if (str6 == null) {
                    String name = g.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str8 = str6;
                bVar.a(eVar, str8, false, illegalArgumentException, str7);
                str5 = str7;
                str6 = str8;
            }
        }
        i.o(C8542f.f54809d.a((float) d10, d11).e(str3).a());
    }

    public void c(String str, String str2) {
        C17542s.j(str, "name");
        C17542s.j(str2, "value");
        i.n(str, str2);
    }

    public void d() {
        i.j(this.f58988a);
    }

    public void e() {
        i.k(this.f58988a);
    }

    public void f() {
        i.p(this.f58988a);
    }
}
