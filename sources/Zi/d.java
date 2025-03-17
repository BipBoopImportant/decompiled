package ZI;

import XH.C16795B;
import XH.t;
import XI.o;
import XI.p;
import YH.C16877v;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final p f140840a;

    /* renamed from: b  reason: collision with root package name */
    private final o f140841b;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f140842a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                XI.o$c$c[] r0 = XI.o.c.C3436c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                XI.o$c$c r1 = XI.o.c.C3436c.CLASS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                XI.o$c$c r1 = XI.o.c.C3436c.PACKAGE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                XI.o$c$c r1 = XI.o.c.C3436c.LOCAL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f140842a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ZI.d.a.<clinit>():void");
        }
    }

    public d(p pVar, o oVar) {
        C17542s.j(pVar, "strings");
        C17542s.j(oVar, "qualifiedNames");
        this.f140840a = pVar;
        this.f140841b = oVar;
    }

    private final C16795B<List<String>, List<String>, Boolean> c(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            o.c q10 = this.f140841b.q(i10);
            String q11 = this.f140840a.q(q10.u());
            o.c.C3436c s10 = q10.s();
            C17542s.g(s10);
            int i11 = a.f140842a[s10.ordinal()];
            if (i11 == 1) {
                linkedList2.addFirst(q11);
            } else if (i11 == 2) {
                linkedList.addFirst(q11);
            } else if (i11 == 3) {
                linkedList2.addFirst(q11);
                z10 = true;
            } else {
                throw new t();
            }
            i10 = q10.t();
        }
        return new C16795B<>(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    public boolean a(int i10) {
        return c(i10).f().booleanValue();
    }

    public String b(int i10) {
        C16795B<List<String>, List<String>, Boolean> c10 = c(i10);
        List a10 = c10.a();
        String G02 = C16877v.G0(c10.b(), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
        if (a10.isEmpty()) {
            return G02;
        }
        return C16877v.G0(a10, "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null) + '/' + G02;
    }

    public String getString(int i10) {
        String q10 = this.f140840a.q(i10);
        C17542s.i(q10, "getString(...)");
        return q10;
    }
}
