package qJ;

import DI.C15555b;
import DI.C15573t;
import DI.C15574u;
import XI.j;
import XI.x;
import kotlin.jvm.internal.C17542s;

/* renamed from: qJ.P  reason: case insensitive filesystem */
public final class C17803P {

    /* renamed from: qJ.P$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f146522a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f146523b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f146524c;

        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|37|38|39|41) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|41) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0075 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0086 */
        static {
            /*
                XI.j[] r0 = XI.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                XI.j r2 = XI.j.DECLARATION     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                XI.j r3 = XI.j.FAKE_OVERRIDE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                XI.j r4 = XI.j.DELEGATION     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                XI.j r5 = XI.j.SYNTHESIZED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f146522a = r0
                DI.b$a[] r0 = DI.C15555b.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                DI.b$a r5 = DI.C15555b.a.DECLARATION     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                DI.b$a r5 = DI.C15555b.a.FAKE_OVERRIDE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                DI.b$a r5 = DI.C15555b.a.DELEGATION     // Catch:{ NoSuchFieldError -> 0x004c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r5] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                DI.b$a r5 = DI.C15555b.a.SYNTHESIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                f146523b = r0
                XI.x[] r0 = XI.x.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                XI.x r5 = XI.x.INTERNAL     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                XI.x r1 = XI.x.PRIVATE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                XI.x r1 = XI.x.PRIVATE_TO_THIS     // Catch:{ NoSuchFieldError -> 0x0075 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0075 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0075 }
            L_0x0075:
                XI.x r1 = XI.x.PROTECTED     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                XI.x r1 = XI.x.PUBLIC     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                XI.x r1 = XI.x.LOCAL     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                f146524c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qJ.C17803P.a.<clinit>():void");
        }
    }

    public static final C15574u a(C17802O o10, x xVar) {
        C17542s.j(o10, "<this>");
        switch (xVar == null ? -1 : a.f146524c[xVar.ordinal()]) {
            case 1:
                C15574u uVar = C15573t.f133852d;
                C17542s.i(uVar, "INTERNAL");
                return uVar;
            case 2:
                C15574u uVar2 = C15573t.f133849a;
                C17542s.i(uVar2, "PRIVATE");
                return uVar2;
            case 3:
                C15574u uVar3 = C15573t.f133850b;
                C17542s.i(uVar3, "PRIVATE_TO_THIS");
                return uVar3;
            case 4:
                C15574u uVar4 = C15573t.f133851c;
                C17542s.i(uVar4, "PROTECTED");
                return uVar4;
            case 5:
                C15574u uVar5 = C15573t.f133853e;
                C17542s.i(uVar5, "PUBLIC");
                return uVar5;
            case 6:
                C15574u uVar6 = C15573t.f133854f;
                C17542s.i(uVar6, "LOCAL");
                return uVar6;
            default:
                C15574u uVar7 = C15573t.f133849a;
                C17542s.i(uVar7, "PRIVATE");
                return uVar7;
        }
    }

    public static final C15555b.a b(C17802O o10, j jVar) {
        C17542s.j(o10, "<this>");
        int i10 = jVar == null ? -1 : a.f146522a[jVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? C15555b.a.DECLARATION : C15555b.a.SYNTHESIZED : C15555b.a.DELEGATION : C15555b.a.FAKE_OVERRIDE : C15555b.a.DECLARATION;
    }
}
