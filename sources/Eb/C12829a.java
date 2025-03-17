package EB;

import HJ.C15854t;
import com.sugarcube.core.logger.DslKt;
import fI.C17220a;
import fI.C17221b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"LEB/a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "m", "()Z", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "DIGIT", "FFP", "PAOP", "SHOP", "SMALL", "STORE", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: EB.a  reason: case insensitive filesystem */
public enum C12829a {
    DIGIT("DIGIT"),
    FFP("FFP"),
    PAOP("PAOP"),
    SHOP("SHOP"),
    SMALL("SMALL"),
    STORE("STORE");
    
    public static final C2612a Companion = null;
    private final String value;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LEB/a$a;", "", "<init>", "()V", "", "code", "LEB/a;", "a", "(Ljava/lang/String;)LEB/a;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: EB.a$a  reason: collision with other inner class name */
    public static final class C2612a {
        public /* synthetic */ C2612a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C12829a a(String str) {
            T t10;
            Iterator<T> it = C12829a.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (C17542s.e(((C12829a) t10).j(), str)) {
                    break;
                }
            }
            C12829a aVar = (C12829a) t10;
            if (aVar != null) {
                return aVar;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown code received " + str);
            e eVar = e.ERROR;
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
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = C2612a.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalArgumentException, str4);
                str2 = str4;
                str3 = str5;
            }
            return C12829a.STORE;
        }

        private C2612a() {
        }
    }

    static {
        C12829a[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new C2612a((DefaultConstructorMarker) null);
    }

    private C12829a(String str) {
        this.value = str;
    }

    public static C17220a<C12829a> b() {
        return $ENTRIES;
    }

    public final String j() {
        return this.value;
    }

    public final boolean m() {
        return this == SHOP || this == SMALL;
    }
}
