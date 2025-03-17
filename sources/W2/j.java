package W2;

import T2.c;
import V2.d;
import V2.f;
import V2.g;
import V2.h;
import W2.f;
import WK.C16771f;
import WK.C16772g;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import androidx.datastore.preferences.protobuf.C5154g;
import androidx.datastore.preferences.protobuf.C5170x;
import dI.C17164e;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LW2/j;", "LT2/c;", "LW2/f;", "<init>", "()V", "", "value", "LV2/h;", "f", "(Ljava/lang/Object;)LV2/h;", "", "name", "LW2/c;", "mutablePreferences", "LXH/N;", "d", "(Ljava/lang/String;LV2/h;LW2/c;)V", "LWK/g;", "source", "a", "(LWK/g;LdI/e;)Ljava/lang/Object;", "t", "LWK/f;", "sink", "g", "(LW2/f;LWK/f;LdI/e;)Ljava/lang/Object;", "e", "()LW2/f;", "defaultValue", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j implements c<f> {

    /* renamed from: a  reason: collision with root package name */
    public static final j f14663a = new j();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14664a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(2:17|18)|19|21) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                V2.h$b[] r0 = V2.h.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                V2.h$b r1 = V2.h.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                V2.h$b r1 = V2.h.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                V2.h$b r1 = V2.h.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                V2.h$b r1 = V2.h.b.INTEGER     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                V2.h$b r1 = V2.h.b.LONG     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                V2.h$b r1 = V2.h.b.STRING     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                V2.h$b r1 = V2.h.b.STRING_SET     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                V2.h$b r1 = V2.h.b.BYTES     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                V2.h$b r1 = V2.h.b.VALUE_NOT_SET     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                f14664a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: W2.j.a.<clinit>():void");
        }
    }

    private j() {
    }

    private final void d(String str, h hVar, c cVar) {
        h.b g02 = hVar.g0();
        switch (g02 == null ? -1 : a.f14664a[g02.ordinal()]) {
            case -1:
                throw new R2.c("Value case is null.", (Throwable) null, 2, (DefaultConstructorMarker) null);
            case 1:
                cVar.j(h.a(str), Boolean.valueOf(hVar.X()));
                return;
            case 2:
                cVar.j(h.d(str), Float.valueOf(hVar.b0()));
                return;
            case 3:
                cVar.j(h.c(str), Double.valueOf(hVar.a0()));
                return;
            case 4:
                cVar.j(h.e(str), Integer.valueOf(hVar.c0()));
                return;
            case 5:
                cVar.j(h.f(str), Long.valueOf(hVar.d0()));
                return;
            case 6:
                f.a<String> g10 = h.g(str);
                String e02 = hVar.e0();
                C17542s.i(e02, "value.string");
                cVar.j(g10, e02);
                return;
            case 7:
                f.a<Set<String>> h10 = h.h(str);
                List<String> S10 = hVar.f0().S();
                C17542s.i(S10, "value.stringSet.stringsList");
                cVar.j(h10, C16877v.y1(S10));
                return;
            case 8:
                f.a<byte[]> b10 = h.b(str);
                byte[] D10 = hVar.Y().D();
                C17542s.i(D10, "value.bytes.toByteArray()");
                cVar.j(b10, D10);
                return;
            case 9:
                throw new R2.c("Value not set.", (Throwable) null, 2, (DefaultConstructorMarker) null);
            default:
                throw new t();
        }
    }

    private final h f(Object obj) {
        if (obj instanceof Boolean) {
            C5170x j10 = h.h0().y(((Boolean) obj).booleanValue()).g();
            C17542s.i(j10, "newBuilder().setBoolean(value).build()");
            return (h) j10;
        } else if (obj instanceof Float) {
            C5170x j11 = h.h0().C(((Number) obj).floatValue()).g();
            C17542s.i(j11, "newBuilder().setFloat(value).build()");
            return (h) j11;
        } else if (obj instanceof Double) {
            C5170x j12 = h.h0().A(((Number) obj).doubleValue()).g();
            C17542s.i(j12, "newBuilder().setDouble(value).build()");
            return (h) j12;
        } else if (obj instanceof Integer) {
            C5170x j13 = h.h0().D(((Number) obj).intValue()).g();
            C17542s.i(j13, "newBuilder().setInteger(value).build()");
            return (h) j13;
        } else if (obj instanceof Long) {
            C5170x j14 = h.h0().E(((Number) obj).longValue()).g();
            C17542s.i(j14, "newBuilder().setLong(value).build()");
            return (h) j14;
        } else if (obj instanceof String) {
            C5170x j15 = h.h0().G((String) obj).g();
            C17542s.i(j15, "newBuilder().setString(value).build()");
            return (h) j15;
        } else if (obj instanceof Set) {
            h.a h02 = h.h0();
            g.a T10 = g.T();
            C17542s.h(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            C5170x j16 = h02.H(T10.y((Set) obj)).g();
            C17542s.i(j16, "newBuilder().setStringSe…                ).build()");
            return (h) j16;
        } else if (obj instanceof byte[]) {
            C5170x j17 = h.h0().z(C5154g.m((byte[]) obj)).g();
            C17542s.i(j17, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return (h) j17;
        } else {
            throw new IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
        }
    }

    public Object a(C16772g gVar, C17164e<? super f> eVar) {
        V2.f a10 = d.f14607a.a(gVar.q3());
        c b10 = g.b(new f.b[0]);
        Map<String, h> Q10 = a10.Q();
        C17542s.i(Q10, "preferencesProto.preferencesMap");
        for (Map.Entry next : Q10.entrySet()) {
            String str = (String) next.getKey();
            h hVar = (h) next.getValue();
            j jVar = f14663a;
            C17542s.i(str, "name");
            C17542s.i(hVar, "value");
            jVar.d(str, hVar, b10);
        }
        return b10.d();
    }

    /* renamed from: e */
    public f c() {
        return g.a();
    }

    /* renamed from: g */
    public Object b(f fVar, C16771f fVar2, C17164e<? super C16807N> eVar) {
        Map<f.a<?>, Object> a10 = fVar.a();
        f.a T10 = V2.f.T();
        for (Map.Entry next : a10.entrySet()) {
            T10.y(((f.a) next.getKey()).a(), f(next.getValue()));
        }
        ((V2.f) T10.g()).i(fVar2.o3());
        return C16807N.f139792a;
    }
}
