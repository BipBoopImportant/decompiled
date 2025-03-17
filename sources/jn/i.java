package Jn;

import Fn.a;
import HJ.C15854t;
import XH.t;
import XH.v;
import com.ingka.ikea.app.caasremote.models.NullableDisplayUnitRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableImperialRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableMetricRemoteModel;
import com.ingka.ikea.app.caasremote.models.d;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b*\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LJn/i;", "Lpp/c;", "LFn/a$c$a;", "Lcom/ingka/ikea/app/caasremote/models/NullableDisplayUnitRemoteModel;", "LIl/a;", "appConfigApi", "<init>", "(LIl/a;)V", "LXH/v;", "", "b", "(Lcom/ingka/ikea/app/caasremote/models/NullableDisplayUnitRemoteModel;)LXH/v;", "remote", "c", "(Lcom/ingka/ikea/app/caasremote/models/NullableDisplayUnitRemoteModel;)LFn/a$c$a;", "a", "LIl/a;", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements C11769c<a.c.C1554a, NullableDisplayUnitRemoteModel> {

    /* renamed from: a  reason: collision with root package name */
    private final Il.a f82642a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f82643a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f82644b;

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|21|22|23|24|25|26|27|29) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|21|22|23|24|25|26|27|29) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0057 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005f */
        static {
            /*
                com.ingka.ikea.app.caasremote.models.d[] r0 = com.ingka.ikea.app.caasremote.models.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.ingka.ikea.app.caasremote.models.d r2 = com.ingka.ikea.app.caasremote.models.d.MULTIPACK     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.ingka.ikea.app.caasremote.models.d r3 = com.ingka.ikea.app.caasremote.models.d.AREA     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                com.ingka.ikea.app.caasremote.models.d r4 = com.ingka.ikea.app.caasremote.models.d.METERWARE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.ingka.ikea.app.caasremote.models.d r4 = com.ingka.ikea.app.caasremote.models.d.PIECE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r5 = 4
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.ingka.ikea.app.caasremote.models.d r4 = com.ingka.ikea.app.caasremote.models.d.VOLUME     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r5 = 5
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.ingka.ikea.app.caasremote.models.d r4 = com.ingka.ikea.app.caasremote.models.d.WEIGHT     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r5 = 6
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.ingka.ikea.app.caasremote.models.d r4 = com.ingka.ikea.app.caasremote.models.d.WEIGHTWARE     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r5 = 7
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f82643a = r0
                Rl.g[] r0 = Rl.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Rl.g r4 = Rl.g.METRIC_IMPERIAL     // Catch:{ NoSuchFieldError -> 0x0057 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0057 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0057 }
            L_0x0057:
                Rl.g r1 = Rl.g.METRIC     // Catch:{ NoSuchFieldError -> 0x005f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                Rl.g r1 = Rl.g.IMPERIAL     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                f82644b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Jn.i.a.<clinit>():void");
        }
    }

    public i(Il.a aVar) {
        C17542s.j(aVar, "appConfigApi");
        this.f82642a = aVar;
    }

    private final v<String, String> b(NullableDisplayUnitRemoteModel nullableDisplayUnitRemoteModel) {
        int i10 = a.f82644b[this.f82642a.u().ordinal()];
        if (i10 == 1 || i10 == 2) {
            NullableMetricRemoteModel c10 = nullableDisplayUnitRemoteModel.c();
            if (c10 != null) {
                return new v<>(c10.a(), c10.b());
            }
            return null;
        } else if (i10 == 3) {
            NullableImperialRemoteModel b10 = nullableDisplayUnitRemoteModel.b();
            if (b10 != null) {
                return new v<>(b10.a(), b10.b());
            }
            return null;
        } else {
            throw new t();
        }
    }

    /* renamed from: c */
    public a.c.C1554a a(NullableDisplayUnitRemoteModel nullableDisplayUnitRemoteModel) {
        a.c.C1554a.C1555a aVar;
        C17542s.j(nullableDisplayUnitRemoteModel, "remote");
        d d10 = nullableDisplayUnitRemoteModel.d();
        switch (d10 == null ? -1 : a.f82643a[d10.ordinal()]) {
            case -1:
                aVar = null;
                break;
            case 1:
                aVar = a.c.C1554a.C1555a.MULTIPACK;
                break;
            case 2:
                aVar = a.c.C1554a.C1555a.AREA;
                break;
            case 3:
                aVar = a.c.C1554a.C1555a.METERWARE;
                break;
            case 4:
                aVar = a.c.C1554a.C1555a.PIECE;
                break;
            case 5:
                aVar = a.c.C1554a.C1555a.VOLUME;
                break;
            case 6:
                aVar = a.c.C1554a.C1555a.WEIGHT;
                break;
            case 7:
                aVar = a.c.C1554a.C1555a.WEIGHTWARE;
                break;
            default:
                throw new t();
        }
        if (aVar == null) {
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("No display unit type defined", (Throwable) null);
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
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            return null;
        }
        v<String, String> b10 = b(nullableDisplayUnitRemoteModel);
        if (b10 == null) {
            return null;
        }
        String a11 = b10.a();
        String b11 = b10.b();
        if (a11 == null || C15854t.v0(a11) || b11 == null || C15854t.v0(b11)) {
            return null;
        }
        return new a.c.C1554a(aVar, b11, a11);
    }
}
