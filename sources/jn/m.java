package Jn;

import HJ.C15854t;
import XH.t;
import com.ingka.ikea.app.caasremote.models.e;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pp.C11769c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LJn/m;", "Lpp/c;", "", "Lcom/ingka/ikea/app/caasremote/models/e;", "<init>", "()V", "remote", "b", "(Lcom/ingka/ikea/app/caasremote/models/e;)Ljava/lang/String;", "a", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements C11769c<String, e> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f82651a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJn/m$a;", "", "<init>", "()V", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f82652a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.ingka.ikea.app.caasremote.models.e[] r0 = com.ingka.ikea.app.caasremote.models.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.app.caasremote.models.e r1 = com.ingka.ikea.app.caasremote.models.e.ART     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.app.caasremote.models.e r1 = com.ingka.ikea.app.caasremote.models.e.SPR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f82652a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Jn.m.b.<clinit>():void");
        }
    }

    /* renamed from: b */
    public String a(e eVar) {
        int i10 = eVar == null ? -1 : b.f82652a[eVar.ordinal()];
        if (i10 == -1) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Item type is null, default to ART");
            qv.e eVar2 = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar2, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        return "ART";
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = m.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar2, str4, false, illegalArgumentException, str3);
                str = str3;
                str2 = str4;
            }
            return "ART";
        } else if (i10 == 1) {
            return "ART";
        } else {
            if (i10 == 2) {
                return "SPR";
            }
            throw new t();
        }
    }
}
