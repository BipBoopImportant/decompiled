package Jn;

import Fn.c;
import HJ.C15854t;
import XH.u;
import com.ingka.ikea.app.caasremote.models.DiscountCodeRemoteModel;
import com.ingka.ikea.app.caasremote.models.i;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LJn/h;", "Lpp/c;", "LFn/c;", "Lcom/ingka/ikea/app/caasremote/models/DiscountCodeRemoteModel;", "<init>", "()V", "Lcom/ingka/ikea/app/caasremote/models/i;", "LFn/c$a;", "b", "(Lcom/ingka/ikea/app/caasremote/models/i;)LFn/c$a;", "remote", "c", "(Lcom/ingka/ikea/app/caasremote/models/DiscountCodeRemoteModel;)LFn/c;", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements C11769c<c, DiscountCodeRemoteModel> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f82641a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.ingka.ikea.app.caasremote.models.i[] r0 = com.ingka.ikea.app.caasremote.models.i.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.app.caasremote.models.i r1 = com.ingka.ikea.app.caasremote.models.i.VALID     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.app.caasremote.models.i r1 = com.ingka.ikea.app.caasremote.models.i.EXPIRED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.app.caasremote.models.i r1 = com.ingka.ikea.app.caasremote.models.i.NOT_STARTED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.ingka.ikea.app.caasremote.models.i r1 = com.ingka.ikea.app.caasremote.models.i.REDEEMED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.ingka.ikea.app.caasremote.models.i r1 = com.ingka.ikea.app.caasremote.models.i.INVALID     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.ingka.ikea.app.caasremote.models.i r1 = com.ingka.ikea.app.caasremote.models.i.INVALID_CONTEXT     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.ingka.ikea.app.caasremote.models.i r1 = com.ingka.ikea.app.caasremote.models.i.FAMILY_ONLY     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f82641a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Jn.h.a.<clinit>():void");
        }
    }

    private final c.a b(i iVar) {
        switch (a.f82641a[iVar.ordinal()]) {
            case 1:
                return null;
            case 2:
                return c.a.EXPIRED;
            case 3:
                return c.a.NOT_STARTED;
            case 4:
                return c.a.REDEEMED;
            case 5:
                return c.a.INVALID;
            case 6:
                return c.a.INVALID_CONTEXT;
            case 7:
                return c.a.FAMILY_ONLY;
            default:
                u uVar = new u("No mapping for " + iVar.name());
                e eVar = e.WARN;
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
                        String a10 = C11818a.a((String) null, uVar);
                        if (a10 == null) {
                            return null;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = i.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, uVar, str3);
                    str = str3;
                    str2 = str4;
                }
                return null;
        }
    }

    /* renamed from: c */
    public c a(DiscountCodeRemoteModel discountCodeRemoteModel) {
        C17542s.j(discountCodeRemoteModel, "remote");
        String b10 = discountCodeRemoteModel.b();
        String c10 = discountCodeRemoteModel.c();
        i d10 = discountCodeRemoteModel.d();
        return new c(b10, c10, d10 != null ? b(d10) : null);
    }
}
