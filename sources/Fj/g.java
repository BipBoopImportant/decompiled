package Fj;

import HJ.C15854t;
import Vi.j0;
import XH.t;
import YH.C16877v;
import com.sugarcube.core.logger.DslKt;
import el.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import rz.C15026t;
import rz.I;
import rz.O;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LFj/g;", "", "<init>", "()V", "Lrz/I;", "scanAndGoProduct", "Lrz/O;", "scanType", "", "a", "(Lrz/I;Lrz/O;)Ljava/util/List;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f80877a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LFj/g$a;", "", "<init>", "()V", "", "DIVIDER_DEFAULT_MARGIN", "I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final List<Object> a(I i10, O o10) {
        C17542s.j(i10, "scanAndGoProduct");
        C17542s.j(o10, "scanType");
        if (o10 == O.AS_IS) {
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("No locations added for ASIS products", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = g.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            return C16877v.n();
        }
        b bVar2 = new b("", (Integer) null, (Integer) null, 24, 6, (DefaultConstructorMarker) null);
        List c10 = C16877v.c();
        C15026t i11 = i10.i();
        if (i11 instanceof C15026t.a) {
            C15026t.a aVar = (C15026t.a) i11;
            c10.add(new j0(aVar.c(), aVar.a(), aVar.b()));
            c10.add(bVar2);
        } else if (i11 instanceof C15026t.b) {
            c10.add(new j0(((C15026t.b) i11).b(), (String) null, (String) null, 6, (DefaultConstructorMarker) null));
            c10.add(bVar2);
        } else if (!(i11 instanceof C15026t.c)) {
            throw new t();
        }
        return C16877v.a(c10);
    }
}
