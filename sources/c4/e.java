package C4;

import C4.c;
import HJ.C15850p;
import HJ.C15854t;
import fK.z;
import hK.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import uI.C18068q;
import x4.F;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lx4/F;", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lx4/F;", "LC4/d;", "d", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)LC4/d;", "Ljava/lang/Class;", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/lang/Class;", "LuI/q;", "kType", "", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;LuI/q;)Z", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f33702a;

        /* JADX WARNING: Can't wrap try/catch for region: R(45:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|45) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0096 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00be */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                C4.d[] r0 = C4.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                C4.d r1 = C4.d.INT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                C4.d r1 = C4.d.BOOL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                C4.d r1 = C4.d.FLOAT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                C4.d r1 = C4.d.LONG     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                C4.d r1 = C4.d.STRING     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                C4.d r1 = C4.d.STRING_NULLABLE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                C4.d r1 = C4.d.ENUM     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                C4.d r1 = C4.d.INT_NULLABLE     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                C4.d r1 = C4.d.BOOL_NULLABLE     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                C4.d r1 = C4.d.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                C4.d r1 = C4.d.DOUBLE_NULLABLE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                C4.d r1 = C4.d.FLOAT_NULLABLE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                C4.d r1 = C4.d.LONG_NULLABLE     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                C4.d r1 = C4.d.INT_ARRAY     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                C4.d r1 = C4.d.BOOL_ARRAY     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                C4.d r1 = C4.d.DOUBLE_ARRAY     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                C4.d r1 = C4.d.FLOAT_ARRAY     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                C4.d r1 = C4.d.LONG_ARRAY     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                C4.d r1 = C4.d.ARRAY     // Catch:{ NoSuchFieldError -> 0x00be }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
            L_0x00be:
                C4.d r1 = C4.d.LIST     // Catch:{ NoSuchFieldError -> 0x00c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c8 }
            L_0x00c8:
                C4.d r1 = C4.d.ENUM_NULLABLE     // Catch:{ NoSuchFieldError -> 0x00d2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
            L_0x00d2:
                f33702a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: C4.e.a.<clinit>():void");
        }
    }

    private static final Class<?> a(SerialDescriptor serialDescriptor) {
        String Q10 = C15854t.Q(serialDescriptor.i(), "?", "", false, 4, (Object) null);
        try {
            Class<?> cls = Class.forName(Q10);
            C17542s.i(cls, "forName(className)");
            return cls;
        } catch (ClassNotFoundException unused) {
            while (C15854t.d0(Q10, ".", false, 2, (Object) null)) {
                Q10 = new C15850p("(\\.+)(?!.*\\.)").j(Q10, "\\$");
                Class<?> cls2 = Class.forName(Q10);
                C17542s.i(cls2, "forName(className)");
                return cls2;
            }
            throw new IllegalArgumentException("Cannot find class with name \"" + serialDescriptor.i() + "\". Ensure that the serialName for this argument is the default fully qualified name");
        }
    }

    public static final F<?> b(SerialDescriptor serialDescriptor) {
        F<?> fVar;
        C17542s.j(serialDescriptor, "<this>");
        d d10 = d(serialDescriptor);
        int[] iArr = a.f33702a;
        switch (iArr[d10.ordinal()]) {
            case 1:
                return F.f57429d;
            case 2:
                return F.f57439n;
            case 3:
                return F.f57436k;
            case 4:
                return F.f57433h;
            case 5:
                return c.f33687a.h();
            case 6:
                return F.f57442q;
            case 7:
                F<?> d11 = F.f57428c.d(a(serialDescriptor), false);
                return d11 == null ? l.f33728t : d11;
            case 8:
                return c.f33687a.f();
            case 9:
                return c.f33687a.a();
            case 10:
                return c.f33687a.d();
            case 11:
                return c.f33687a.c();
            case 12:
                return c.f33687a.e();
            case 13:
                return c.f33687a.g();
            case 14:
                return F.f57431f;
            case 15:
                return F.f57440o;
            case 16:
                return c.f33687a.b();
            case 17:
                return F.f57437l;
            case 18:
                return F.f57434i;
            case 19:
                return d(serialDescriptor.g(0)) == d.STRING ? F.f57443r : l.f33728t;
            case 20:
                switch (iArr[d(serialDescriptor.g(0)).ordinal()]) {
                    case 1:
                        return F.f57432g;
                    case 2:
                        return F.f57441p;
                    case 3:
                        return F.f57438m;
                    case 4:
                        return F.f57435j;
                    case 5:
                        return F.f57444s;
                    case 6:
                        return c.f33687a.i();
                    case 7:
                        Class<?> a10 = a(serialDescriptor.g(0));
                        C17542s.h(a10, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
                        fVar = new c.f<>(a10);
                        break;
                    default:
                        return l.f33728t;
                }
            case 21:
                Class<?> a11 = a(serialDescriptor);
                if (Enum.class.isAssignableFrom(a11)) {
                    C17542s.h(a11, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>?>");
                    fVar = new c.g<>(a11);
                    break;
                } else {
                    return l.f33728t;
                }
            default:
                return l.f33728t;
        }
        return fVar;
    }

    public static final boolean c(SerialDescriptor serialDescriptor, C18068q qVar) {
        C17542s.j(serialDescriptor, "<this>");
        C17542s.j(qVar, "kType");
        if (serialDescriptor.b() != qVar.k()) {
            return false;
        }
        KSerializer<Object> i10 = z.i(qVar);
        if (i10 != null) {
            return C17542s.e(serialDescriptor, i10.getDescriptor());
        }
        throw new IllegalStateException("Custom serializers declared directly on a class field via @Serializable(with = ...) is currently not supported by safe args for both custom types and third-party types. Please use @Serializable or @Serializable(with = ...) on the class or object declaration.");
    }

    private static final d d(SerialDescriptor serialDescriptor) {
        String Q10 = C15854t.Q(serialDescriptor.i(), "?", "", false, 4, (Object) null);
        return C17542s.e(serialDescriptor.h(), l.b.f143469a) ? serialDescriptor.b() ? d.ENUM_NULLABLE : d.ENUM : C17542s.e(Q10, "kotlin.Int") ? serialDescriptor.b() ? d.INT_NULLABLE : d.INT : C17542s.e(Q10, "kotlin.Boolean") ? serialDescriptor.b() ? d.BOOL_NULLABLE : d.BOOL : C17542s.e(Q10, "kotlin.Double") ? serialDescriptor.b() ? d.DOUBLE_NULLABLE : d.DOUBLE : C17542s.e(Q10, "kotlin.Double") ? d.DOUBLE : C17542s.e(Q10, "kotlin.Float") ? serialDescriptor.b() ? d.FLOAT_NULLABLE : d.FLOAT : C17542s.e(Q10, "kotlin.Long") ? serialDescriptor.b() ? d.LONG_NULLABLE : d.LONG : C17542s.e(Q10, "kotlin.String") ? serialDescriptor.b() ? d.STRING_NULLABLE : d.STRING : C17542s.e(Q10, "kotlin.IntArray") ? d.INT_ARRAY : C17542s.e(Q10, "kotlin.DoubleArray") ? d.DOUBLE_ARRAY : C17542s.e(Q10, "kotlin.BooleanArray") ? d.BOOL_ARRAY : C17542s.e(Q10, "kotlin.FloatArray") ? d.FLOAT_ARRAY : C17542s.e(Q10, "kotlin.LongArray") ? d.LONG_ARRAY : C17542s.e(Q10, "kotlin.Array") ? d.ARRAY : C15854t.W(Q10, "kotlin.collections.ArrayList", false, 2, (Object) null) ? d.LIST : d.UNKNOWN;
    }
}
