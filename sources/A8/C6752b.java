package a8;

import a8.g;
import a8.k;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Marker;

/* renamed from: a8.b  reason: case insensitive filesystem */
class C6752b {

    /* renamed from: a  reason: collision with root package name */
    private f f41548a;

    /* renamed from: b  reason: collision with root package name */
    private u f41549b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f41550c;

    /* renamed from: a8.b$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41551a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f41552b;

        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|(3:59|60|62)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|62) */
        /* JADX WARNING: Can't wrap try/catch for region: R(57:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|62) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|62) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|62) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0131 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x013b */
        static {
            /*
                a8.b$j[] r0 = a8.C6752b.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f41552b = r0
                r1 = 1
                a8.b$j r2 = a8.C6752b.j.first_child     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f41552b     // Catch:{ NoSuchFieldError -> 0x001d }
                a8.b$j r3 = a8.C6752b.j.last_child     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x0028 }
                a8.b$j r4 = a8.C6752b.j.only_child     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x0033 }
                a8.b$j r4 = a8.C6752b.j.first_of_type     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x003e }
                a8.b$j r4 = a8.C6752b.j.last_of_type     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x0049 }
                a8.b$j r4 = a8.C6752b.j.only_of_type     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x0054 }
                a8.b$j r4 = a8.C6752b.j.root     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r5 = 7
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x0060 }
                a8.b$j r4 = a8.C6752b.j.empty     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r5 = 8
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x006c }
                a8.b$j r4 = a8.C6752b.j.nth_child     // Catch:{ NoSuchFieldError -> 0x006c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r5 = 9
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x0078 }
                a8.b$j r4 = a8.C6752b.j.nth_last_child     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r5 = 10
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x0084 }
                a8.b$j r4 = a8.C6752b.j.nth_of_type     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r5 = 11
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x0090 }
                a8.b$j r4 = a8.C6752b.j.nth_last_of_type     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r5 = 12
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x009c }
                a8.b$j r4 = a8.C6752b.j.not     // Catch:{ NoSuchFieldError -> 0x009c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r5 = 13
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                a8.b$j r4 = a8.C6752b.j.target     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r5 = 14
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                a8.b$j r4 = a8.C6752b.j.lang     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r5 = 15
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                a8.b$j r4 = a8.C6752b.j.link     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r5 = 16
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x00cc }
                a8.b$j r4 = a8.C6752b.j.visited     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r5 = 17
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                a8.b$j r4 = a8.C6752b.j.hover     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r5 = 18
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x00e4 }
                a8.b$j r4 = a8.C6752b.j.active     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r5 = 19
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x00f0 }
                a8.b$j r4 = a8.C6752b.j.focus     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r5 = 20
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x00fc }
                a8.b$j r4 = a8.C6752b.j.enabled     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r5 = 21
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x0108 }
                a8.b$j r4 = a8.C6752b.j.disabled     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r5 = 22
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x0114 }
                a8.b$j r4 = a8.C6752b.j.checked     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r5 = 23
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r3 = f41552b     // Catch:{ NoSuchFieldError -> 0x0120 }
                a8.b$j r4 = a8.C6752b.j.indeterminate     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r5 = 24
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                a8.b$c[] r3 = a8.C6752b.c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f41551a = r3
                a8.b$c r4 = a8.C6752b.c.EQUALS     // Catch:{ NoSuchFieldError -> 0x0131 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0131 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0131 }
            L_0x0131:
                int[] r1 = f41551a     // Catch:{ NoSuchFieldError -> 0x013b }
                a8.b$c r3 = a8.C6752b.c.INCLUDES     // Catch:{ NoSuchFieldError -> 0x013b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x013b }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x013b }
            L_0x013b:
                int[] r0 = f41551a     // Catch:{ NoSuchFieldError -> 0x0145 }
                a8.b$c r1 = a8.C6752b.c.DASHMATCH     // Catch:{ NoSuchFieldError -> 0x0145 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0145 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0145 }
            L_0x0145:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a8.C6752b.a.<clinit>():void");
        }
    }

    /* renamed from: a8.b$b  reason: collision with other inner class name */
    private static class C0734b {

        /* renamed from: a  reason: collision with root package name */
        public final String f41553a;

        /* renamed from: b  reason: collision with root package name */
        final c f41554b;

        /* renamed from: c  reason: collision with root package name */
        public final String f41555c;

        C0734b(String str, c cVar, String str2) {
            this.f41553a = str;
            this.f41554b = cVar;
            this.f41555c = str2;
        }
    }

    /* renamed from: a8.b$c */
    private enum c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    /* renamed from: a8.b$d */
    private static class d extends k.i {

        /* renamed from: a8.b$d$a */
        private static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f41556a;

            /* renamed from: b  reason: collision with root package name */
            public int f41557b;

            a(int i10, int i11) {
                this.f41556a = i10;
                this.f41557b = i11;
            }
        }

        d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        private int C(int i10) {
            if (i10 >= 48 && i10 <= 57) {
                return i10 - 48;
            }
            if (i10 >= 65 && i10 <= 70) {
                return i10 - 55;
            }
            if (i10 < 97 || i10 > 102) {
                return -1;
            }
            return i10 - 87;
        }

        private a D() {
            a aVar;
            C6753c cVar;
            if (h()) {
                return null;
            }
            int i10 = this.f41876b;
            if (!f('(')) {
                return null;
            }
            A();
            int i11 = 1;
            if (g("odd")) {
                aVar = new a(2, 1);
            } else {
                int i12 = 0;
                if (g("even")) {
                    aVar = new a(2, 0);
                } else {
                    int i13 = (!f('+') && f('-')) ? -1 : 1;
                    C6753c c10 = C6753c.c(this.f41875a, this.f41876b, this.f41877c, false);
                    if (c10 != null) {
                        this.f41876b = c10.a();
                    }
                    if (f('n') || f('N')) {
                        if (c10 == null) {
                            c10 = new C6753c(1, this.f41876b);
                        }
                        A();
                        boolean f10 = f('+');
                        if (!f10 && (f10 = f('-'))) {
                            i11 = -1;
                        }
                        if (f10) {
                            A();
                            cVar = C6753c.c(this.f41875a, this.f41876b, this.f41877c, false);
                            if (cVar != null) {
                                this.f41876b = cVar.a();
                            } else {
                                this.f41876b = i10;
                                return null;
                            }
                        } else {
                            cVar = null;
                        }
                        int i14 = i11;
                        i11 = i13;
                        i13 = i14;
                    } else {
                        cVar = c10;
                        c10 = null;
                    }
                    int d10 = c10 == null ? 0 : i11 * c10.d();
                    if (cVar != null) {
                        i12 = i13 * cVar.d();
                    }
                    aVar = new a(d10, i12);
                }
            }
            A();
            if (f(')')) {
                return aVar;
            }
            this.f41876b = i10;
            return null;
        }

        private String E() {
            if (h()) {
                return null;
            }
            String q10 = q();
            return q10 != null ? q10 : H();
        }

        private List<String> G() {
            if (h()) {
                return null;
            }
            int i10 = this.f41876b;
            if (!f('(')) {
                return null;
            }
            A();
            ArrayList arrayList = null;
            do {
                String H10 = H();
                if (H10 == null) {
                    this.f41876b = i10;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(H10);
                A();
            } while (z());
            if (f(')')) {
                return arrayList;
            }
            this.f41876b = i10;
            return null;
        }

        private List<s> K() {
            List<t> list;
            List<g> list2;
            if (h()) {
                return null;
            }
            int i10 = this.f41876b;
            if (!f('(')) {
                return null;
            }
            A();
            List<s> L10 = L();
            if (L10 == null) {
                this.f41876b = i10;
                return null;
            } else if (!f(')')) {
                this.f41876b = i10;
                return null;
            } else {
                Iterator<s> it = L10.iterator();
                while (it.hasNext() && (list = it.next().f41573a) != null) {
                    Iterator<t> it2 = list.iterator();
                    while (it2.hasNext() && (list2 = it2.next().f41578d) != null) {
                        Iterator<g> it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (it3.next() instanceof k) {
                                    return null;
                                }
                            }
                        }
                    }
                }
                return L10;
            }
        }

        /* access modifiers changed from: private */
        public List<s> L() {
            if (h()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            s sVar = new s((a) null);
            while (!h() && M(sVar)) {
                if (z()) {
                    arrayList.add(sVar);
                    sVar = new s((a) null);
                }
            }
            if (!sVar.f()) {
                arrayList.add(sVar);
            }
            return arrayList;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: a8.b$h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: a8.b$k} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: a8.b$h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: a8.b$h} */
        /* JADX WARNING: type inference failed for: r2v4, types: [a8.b$m] */
        /* JADX WARNING: type inference failed for: r2v7, types: [a8.b$m] */
        /* JADX WARNING: type inference failed for: r2v8, types: [a8.b$n] */
        /* JADX WARNING: type inference failed for: r2v9, types: [a8.b$i] */
        /* JADX WARNING: type inference failed for: r2v16, types: [a8.b$o] */
        /* JADX WARNING: type inference failed for: r2v17, types: [a8.b$l] */
        /* JADX WARNING: type inference failed for: r2v18, types: [a8.b$l] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 7 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void O(a8.C6752b.s r21, a8.C6752b.t r22) {
            /*
                r20 = this;
                r0 = r22
                java.lang.String r1 = r20.H()
                if (r1 == 0) goto L_0x0144
                a8.b$j r2 = a8.C6752b.j.a(r1)
                int[] r3 = a8.C6752b.a.f41552b
                int r4 = r2.ordinal()
                r3 = r3[r4]
                java.lang.String r4 = "Invalid or missing parameter section for pseudo class: "
                r5 = 1
                r6 = 0
                r7 = 0
                switch(r3) {
                    case 1: goto L_0x012c;
                    case 2: goto L_0x011b;
                    case 3: goto L_0x0110;
                    case 4: goto L_0x00fb;
                    case 5: goto L_0x00e9;
                    case 6: goto L_0x00dc;
                    case 7: goto L_0x00d0;
                    case 8: goto L_0x00c4;
                    case 9: goto L_0x007f;
                    case 10: goto L_0x007f;
                    case 11: goto L_0x007f;
                    case 12: goto L_0x007f;
                    case 13: goto L_0x0054;
                    case 14: goto L_0x004a;
                    case 15: goto L_0x003d;
                    case 16: goto L_0x0033;
                    case 17: goto L_0x0033;
                    case 18: goto L_0x0033;
                    case 19: goto L_0x0033;
                    case 20: goto L_0x0033;
                    case 21: goto L_0x0033;
                    case 22: goto L_0x0033;
                    case 23: goto L_0x0033;
                    case 24: goto L_0x0033;
                    default: goto L_0x001c;
                }
            L_0x001c:
                a8.a r0 = new a8.a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unsupported pseudo class: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x0033:
                a8.b$l r2 = new a8.b$l
                r2.<init>(r1)
                r21.b()
                goto L_0x0140
            L_0x003d:
                r20.G()
                a8.b$l r2 = new a8.b$l
                r2.<init>(r1)
                r21.b()
                goto L_0x0140
            L_0x004a:
                a8.b$o r2 = new a8.b$o
                r2.<init>(r7)
                r21.b()
                goto L_0x0140
            L_0x0054:
                java.util.List r2 = r20.K()
                if (r2 == 0) goto L_0x006a
                a8.b$k r1 = new a8.b$k
                r1.<init>(r2)
                int r2 = r1.b()
                r3 = r21
                r3.f41574b = r2
            L_0x0067:
                r2 = r1
                goto L_0x0140
            L_0x006a:
                a8.a r0 = new a8.a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r4)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x007f:
                r3 = r21
                a8.b$j r7 = a8.C6752b.j.nth_child
                if (r2 == r7) goto L_0x008c
                a8.b$j r7 = a8.C6752b.j.nth_of_type
                if (r2 != r7) goto L_0x008a
                goto L_0x008c
            L_0x008a:
                r11 = r6
                goto L_0x008d
            L_0x008c:
                r11 = r5
            L_0x008d:
                a8.b$j r7 = a8.C6752b.j.nth_of_type
                if (r2 == r7) goto L_0x0098
                a8.b$j r7 = a8.C6752b.j.nth_last_of_type
                if (r2 != r7) goto L_0x0096
                goto L_0x0098
            L_0x0096:
                r12 = r6
                goto L_0x0099
            L_0x0098:
                r12 = r5
            L_0x0099:
                a8.b$d$a r2 = r20.D()
                if (r2 == 0) goto L_0x00af
                a8.b$h r1 = new a8.b$h
                int r9 = r2.f41556a
                int r10 = r2.f41557b
                java.lang.String r13 = r0.f41576b
                r8 = r1
                r8.<init>(r9, r10, r11, r12, r13)
                r21.b()
                goto L_0x0067
            L_0x00af:
                a8.a r0 = new a8.a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r4)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x00c4:
                r3 = r21
                a8.b$i r2 = new a8.b$i
                r2.<init>(r7)
                r21.b()
                goto L_0x0140
            L_0x00d0:
                r3 = r21
                a8.b$n r2 = new a8.b$n
                r2.<init>(r7)
                r21.b()
                goto L_0x0140
            L_0x00dc:
                r3 = r21
                a8.b$m r2 = new a8.b$m
                java.lang.String r1 = r0.f41576b
                r2.<init>(r5, r1)
                r21.b()
                goto L_0x0140
            L_0x00e9:
                r3 = r21
                a8.b$h r2 = new a8.b$h
                r10 = 1
                java.lang.String r11 = r0.f41576b
                r7 = 0
                r8 = 1
                r9 = 0
                r6 = r2
                r6.<init>(r7, r8, r9, r10, r11)
                r21.b()
                goto L_0x0140
            L_0x00fb:
                r3 = r21
                a8.b$h r2 = new a8.b$h
                r16 = 1
                java.lang.String r1 = r0.f41576b
                r13 = 0
                r14 = 1
                r15 = 1
                r12 = r2
                r17 = r1
                r12.<init>(r13, r14, r15, r16, r17)
                r21.b()
                goto L_0x0140
            L_0x0110:
                r3 = r21
                a8.b$m r2 = new a8.b$m
                r2.<init>(r6, r7)
                r21.b()
                goto L_0x0140
            L_0x011b:
                r3 = r21
                a8.b$h r2 = new a8.b$h
                r12 = 0
                r13 = 0
                r9 = 0
                r10 = 1
                r11 = 0
                r8 = r2
                r8.<init>(r9, r10, r11, r12, r13)
                r21.b()
                goto L_0x0140
            L_0x012c:
                r3 = r21
                a8.b$h r2 = new a8.b$h
                r18 = 0
                r19 = 0
                r15 = 0
                r16 = 1
                r17 = 1
                r14 = r2
                r14.<init>(r15, r16, r17, r18, r19)
                r21.b()
            L_0x0140:
                r0.b(r2)
                return
            L_0x0144:
                a8.a r0 = new a8.a
                java.lang.String r1 = "Invalid pseudo class"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: a8.C6752b.d.O(a8.b$s, a8.b$t):void");
        }

        private int P() {
            int i10;
            if (h()) {
                return this.f41876b;
            }
            int i11 = this.f41876b;
            int charAt = this.f41875a.charAt(i11);
            if (charAt == 45) {
                charAt = a();
            }
            if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                i10 = i11;
            } else {
                int a10 = a();
                while (true) {
                    if ((a10 < 65 || a10 > 90) && ((a10 < 97 || a10 > 122) && !((a10 >= 48 && a10 <= 57) || a10 == 45 || a10 == 95))) {
                        break;
                    }
                    a10 = a();
                }
                i10 = this.f41876b;
            }
            this.f41876b = i11;
            return i10;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
            r2 = l().intValue();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String F() {
            /*
                r8 = this;
                boolean r0 = r8.h()
                r1 = 0
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                java.lang.String r0 = r8.f41875a
                int r2 = r8.f41876b
                char r0 = r0.charAt(r2)
                r2 = 39
                if (r0 == r2) goto L_0x0019
                r2 = 34
                if (r0 == r2) goto L_0x0019
                return r1
            L_0x0019:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r2 = r8.f41876b
                r3 = 1
                int r2 = r2 + r3
                r8.f41876b = r2
                java.lang.Integer r2 = r8.l()
                int r2 = r2.intValue()
            L_0x002c:
                r4 = -1
                if (r2 == r4) goto L_0x0087
                if (r2 == r0) goto L_0x0087
                r5 = 92
                if (r2 != r5) goto L_0x007a
                java.lang.Integer r2 = r8.l()
                int r2 = r2.intValue()
                if (r2 != r4) goto L_0x0040
                goto L_0x002c
            L_0x0040:
                r5 = 10
                if (r2 == r5) goto L_0x0071
                r5 = 13
                if (r2 == r5) goto L_0x0071
                r5 = 12
                if (r2 != r5) goto L_0x004d
                goto L_0x0071
            L_0x004d:
                int r5 = r8.C(r2)
                if (r5 == r4) goto L_0x007a
                r6 = r3
            L_0x0054:
                r7 = 5
                if (r6 > r7) goto L_0x006c
                java.lang.Integer r2 = r8.l()
                int r2 = r2.intValue()
                int r7 = r8.C(r2)
                if (r7 != r4) goto L_0x0066
                goto L_0x006c
            L_0x0066:
                int r5 = r5 * 16
                int r5 = r5 + r7
                int r6 = r6 + 1
                goto L_0x0054
            L_0x006c:
                char r4 = (char) r5
                r1.append(r4)
                goto L_0x002c
            L_0x0071:
                java.lang.Integer r2 = r8.l()
                int r2 = r2.intValue()
                goto L_0x002c
            L_0x007a:
                char r2 = (char) r2
                r1.append(r2)
                java.lang.Integer r2 = r8.l()
                int r2 = r2.intValue()
                goto L_0x002c
            L_0x0087:
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: a8.C6752b.d.F():java.lang.String");
        }

        /* access modifiers changed from: package-private */
        public String H() {
            int P10 = P();
            int i10 = this.f41876b;
            if (P10 == i10) {
                return null;
            }
            String substring = this.f41875a.substring(i10, P10);
            this.f41876b = P10;
            return substring;
        }

        /* access modifiers changed from: package-private */
        public String I() {
            char charAt;
            int C10;
            StringBuilder sb2 = new StringBuilder();
            while (!h() && (charAt = this.f41875a.charAt(this.f41876b)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !k(charAt) && !Character.isISOControl(charAt)) {
                this.f41876b++;
                if (charAt == '\\') {
                    if (!h()) {
                        String str = this.f41875a;
                        int i10 = this.f41876b;
                        this.f41876b = i10 + 1;
                        charAt = str.charAt(i10);
                        if (!(charAt == 10 || charAt == 13 || charAt == 12)) {
                            int C11 = C(charAt);
                            if (C11 != -1) {
                                for (int i11 = 1; i11 <= 5 && !h() && (C10 = C(this.f41875a.charAt(this.f41876b))) != -1; i11++) {
                                    this.f41876b++;
                                    C11 = (C11 * 16) + C10;
                                }
                                sb2.append((char) C11);
                            }
                        }
                    }
                }
                sb2.append((char) charAt);
            }
            if (sb2.length() == 0) {
                return null;
            }
            return sb2.toString();
        }

        /* access modifiers changed from: package-private */
        public String J() {
            if (h()) {
                return null;
            }
            int i10 = this.f41876b;
            int charAt = this.f41875a.charAt(i10);
            int i11 = i10;
            while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && !j(charAt)) {
                if (!k(charAt)) {
                    i11 = this.f41876b + 1;
                }
                charAt = a();
            }
            if (this.f41876b > i10) {
                return this.f41875a.substring(i10, i11);
            }
            this.f41876b = i10;
            return null;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x012e  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0133  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean M(a8.C6752b.s r11) {
            /*
                r10 = this;
                boolean r0 = r10.h()
                r1 = 0
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                int r0 = r10.f41876b
                boolean r2 = r11.f()
                r3 = 0
                if (r2 != 0) goto L_0x002d
                r2 = 62
                boolean r2 = r10.f(r2)
                if (r2 == 0) goto L_0x001f
                a8.b$e r2 = a8.C6752b.e.CHILD
                r10.A()
                goto L_0x002e
            L_0x001f:
                r2 = 43
                boolean r2 = r10.f(r2)
                if (r2 == 0) goto L_0x002d
                a8.b$e r2 = a8.C6752b.e.FOLLOWS
                r10.A()
                goto L_0x002e
            L_0x002d:
                r2 = r3
            L_0x002e:
                r4 = 42
                boolean r4 = r10.f(r4)
                if (r4 == 0) goto L_0x003c
                a8.b$t r4 = new a8.b$t
                r4.<init>(r2, r3)
                goto L_0x004d
            L_0x003c:
                java.lang.String r4 = r10.H()
                if (r4 == 0) goto L_0x004c
                a8.b$t r5 = new a8.b$t
                r5.<init>(r2, r4)
                r11.c()
                r4 = r5
                goto L_0x004d
            L_0x004c:
                r4 = r3
            L_0x004d:
                boolean r5 = r10.h()
                if (r5 != 0) goto L_0x012c
                r5 = 46
                boolean r5 = r10.f(r5)
                if (r5 == 0) goto L_0x007b
                if (r4 != 0) goto L_0x0062
                a8.b$t r4 = new a8.b$t
                r4.<init>(r2, r3)
            L_0x0062:
                java.lang.String r5 = r10.H()
                if (r5 == 0) goto L_0x0073
                java.lang.String r6 = "class"
                a8.b$c r7 = a8.C6752b.c.EQUALS
                r4.a(r6, r7, r5)
                r11.b()
                goto L_0x004d
            L_0x0073:
                a8.a r11 = new a8.a
                java.lang.String r0 = "Invalid \".class\" simpleSelectors"
                r11.<init>(r0)
                throw r11
            L_0x007b:
                r5 = 35
                boolean r5 = r10.f(r5)
                if (r5 == 0) goto L_0x00a3
                if (r4 != 0) goto L_0x008a
                a8.b$t r4 = new a8.b$t
                r4.<init>(r2, r3)
            L_0x008a:
                java.lang.String r5 = r10.H()
                if (r5 == 0) goto L_0x009b
                java.lang.String r6 = "id"
                a8.b$c r7 = a8.C6752b.c.EQUALS
                r4.a(r6, r7, r5)
                r11.d()
                goto L_0x004d
            L_0x009b:
                a8.a r11 = new a8.a
                java.lang.String r0 = "Invalid \"#id\" simpleSelectors"
                r11.<init>(r0)
                throw r11
            L_0x00a3:
                r5 = 91
                boolean r5 = r10.f(r5)
                if (r5 == 0) goto L_0x0118
                if (r4 != 0) goto L_0x00b2
                a8.b$t r4 = new a8.b$t
                r4.<init>(r2, r3)
            L_0x00b2:
                r10.A()
                java.lang.String r5 = r10.H()
                java.lang.String r6 = "Invalid attribute simpleSelectors"
                if (r5 == 0) goto L_0x0112
                r10.A()
                r7 = 61
                boolean r7 = r10.f(r7)
                if (r7 == 0) goto L_0x00cb
                a8.b$c r7 = a8.C6752b.c.EQUALS
                goto L_0x00e2
            L_0x00cb:
                java.lang.String r7 = "~="
                boolean r7 = r10.g(r7)
                if (r7 == 0) goto L_0x00d6
                a8.b$c r7 = a8.C6752b.c.INCLUDES
                goto L_0x00e2
            L_0x00d6:
                java.lang.String r7 = "|="
                boolean r7 = r10.g(r7)
                if (r7 == 0) goto L_0x00e1
                a8.b$c r7 = a8.C6752b.c.DASHMATCH
                goto L_0x00e2
            L_0x00e1:
                r7 = r3
            L_0x00e2:
                if (r7 == 0) goto L_0x00f7
                r10.A()
                java.lang.String r8 = r10.E()
                if (r8 == 0) goto L_0x00f1
                r10.A()
                goto L_0x00f8
            L_0x00f1:
                a8.a r11 = new a8.a
                r11.<init>(r6)
                throw r11
            L_0x00f7:
                r8 = r3
            L_0x00f8:
                r9 = 93
                boolean r9 = r10.f(r9)
                if (r9 == 0) goto L_0x010c
                if (r7 != 0) goto L_0x0104
                a8.b$c r7 = a8.C6752b.c.EXISTS
            L_0x0104:
                r4.a(r5, r7, r8)
                r11.b()
                goto L_0x004d
            L_0x010c:
                a8.a r11 = new a8.a
                r11.<init>(r6)
                throw r11
            L_0x0112:
                a8.a r11 = new a8.a
                r11.<init>(r6)
                throw r11
            L_0x0118:
                r5 = 58
                boolean r5 = r10.f(r5)
                if (r5 == 0) goto L_0x012c
                if (r4 != 0) goto L_0x0127
                a8.b$t r4 = new a8.b$t
                r4.<init>(r2, r3)
            L_0x0127:
                r10.O(r11, r4)
                goto L_0x004d
            L_0x012c:
                if (r4 == 0) goto L_0x0133
                r11.a(r4)
                r11 = 1
                return r11
            L_0x0133:
                r10.f41876b = r0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: a8.C6752b.d.M(a8.b$s):boolean");
        }

        /* access modifiers changed from: package-private */
        public String N() {
            if (h()) {
                return null;
            }
            int i10 = this.f41876b;
            if (!g("url(")) {
                return null;
            }
            A();
            String F10 = F();
            if (F10 == null) {
                F10 = I();
            }
            if (F10 == null) {
                this.f41876b = i10;
                return null;
            }
            A();
            if (h() || g(")")) {
                return F10;
            }
            this.f41876b = i10;
            return null;
        }
    }

    /* renamed from: a8.b$e */
    private enum e {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    /* renamed from: a8.b$f */
    enum f {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    /* renamed from: a8.b$g */
    private interface g {
        boolean a(q qVar, g.L l10);
    }

    /* renamed from: a8.b$h */
    private static class h implements g {

        /* renamed from: a  reason: collision with root package name */
        private int f41559a;

        /* renamed from: b  reason: collision with root package name */
        private int f41560b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f41561c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f41562d;

        /* renamed from: e  reason: collision with root package name */
        private String f41563e;

        h(int i10, int i11, boolean z10, boolean z11, String str) {
            this.f41559a = i10;
            this.f41560b = i11;
            this.f41561c = z10;
            this.f41562d = z11;
            this.f41563e = str;
        }

        public boolean a(q qVar, g.L l10) {
            int i10;
            int i11;
            String o10 = (!this.f41562d || this.f41563e != null) ? this.f41563e : l10.o();
            g.J j10 = l10.f41682b;
            if (j10 != null) {
                Iterator<g.N> it = j10.e().iterator();
                i11 = 0;
                i10 = 0;
                while (it.hasNext()) {
                    g.L l11 = (g.L) it.next();
                    if (l11 == l10) {
                        i11 = i10;
                    }
                    if (o10 == null || l11.o().equals(o10)) {
                        i10++;
                    }
                }
            } else {
                i11 = 0;
                i10 = 1;
            }
            int i12 = this.f41561c ? i11 + 1 : i10 - i11;
            int i13 = this.f41559a;
            if (i13 == 0) {
                return i12 == this.f41560b;
            }
            int i14 = this.f41560b;
            if ((i12 - i14) % i13 == 0) {
                return Integer.signum(i12 - i14) == 0 || Integer.signum(i12 - this.f41560b) == Integer.signum(this.f41559a);
            }
            return false;
        }

        public String toString() {
            String str = this.f41561c ? "" : "last-";
            return this.f41562d ? String.format("nth-%schild(%dn%+d of type <%s>)", new Object[]{str, Integer.valueOf(this.f41559a), Integer.valueOf(this.f41560b), this.f41563e}) : String.format("nth-%schild(%dn%+d)", new Object[]{str, Integer.valueOf(this.f41559a), Integer.valueOf(this.f41560b)});
        }
    }

    /* renamed from: a8.b$i */
    private static class i implements g {
        private i() {
        }

        public boolean a(q qVar, g.L l10) {
            return !(l10 instanceof g.J) || ((g.J) l10).e().size() == 0;
        }

        public String toString() {
            return "empty";
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    /* renamed from: a8.b$j */
    private enum j {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;
        
        private static final Map<String, j> cache = null;

        static {
            cache = new HashMap();
            for (j jVar : values()) {
                if (jVar != UNSUPPORTED) {
                    cache.put(jVar.name().replace('_', '-'), jVar);
                }
            }
        }

        public static j a(String str) {
            j jVar = cache.get(str);
            return jVar != null ? jVar : UNSUPPORTED;
        }
    }

    /* renamed from: a8.b$k */
    private static class k implements g {

        /* renamed from: a  reason: collision with root package name */
        private List<s> f41564a;

        k(List<s> list) {
            this.f41564a = list;
        }

        public boolean a(q qVar, g.L l10) {
            for (s l11 : this.f41564a) {
                if (C6752b.l(qVar, l11, l10)) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            int i10 = Integer.MIN_VALUE;
            for (s sVar : this.f41564a) {
                int i11 = sVar.f41574b;
                if (i11 > i10) {
                    i10 = i11;
                }
            }
            return i10;
        }

        public String toString() {
            return "not(" + this.f41564a + ")";
        }
    }

    /* renamed from: a8.b$l */
    private static class l implements g {

        /* renamed from: a  reason: collision with root package name */
        private String f41565a;

        l(String str) {
            this.f41565a = str;
        }

        public boolean a(q qVar, g.L l10) {
            return false;
        }

        public String toString() {
            return this.f41565a;
        }
    }

    /* renamed from: a8.b$m */
    private static class m implements g {

        /* renamed from: a  reason: collision with root package name */
        private boolean f41566a;

        /* renamed from: b  reason: collision with root package name */
        private String f41567b;

        public m(boolean z10, String str) {
            this.f41566a = z10;
            this.f41567b = str;
        }

        public boolean a(q qVar, g.L l10) {
            int i10;
            String o10 = (!this.f41566a || this.f41567b != null) ? this.f41567b : l10.o();
            g.J j10 = l10.f41682b;
            if (j10 != null) {
                Iterator<g.N> it = j10.e().iterator();
                i10 = 0;
                while (it.hasNext()) {
                    g.L l11 = (g.L) it.next();
                    if (o10 == null || l11.o().equals(o10)) {
                        i10++;
                    }
                }
            } else {
                i10 = 1;
            }
            return i10 == 1;
        }

        public String toString() {
            return this.f41566a ? String.format("only-of-type <%s>", new Object[]{this.f41567b}) : String.format("only-child", new Object[0]);
        }
    }

    /* renamed from: a8.b$n */
    private static class n implements g {
        private n() {
        }

        public boolean a(q qVar, g.L l10) {
            return l10.f41682b == null;
        }

        public String toString() {
            return "root";
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    /* renamed from: a8.b$o */
    private static class o implements g {
        private o() {
        }

        public boolean a(q qVar, g.L l10) {
            return qVar != null && l10 == qVar.f41571a;
        }

        public String toString() {
            return "target";
        }

        /* synthetic */ o(a aVar) {
            this();
        }
    }

    /* renamed from: a8.b$p */
    static class p {

        /* renamed from: a  reason: collision with root package name */
        s f41568a;

        /* renamed from: b  reason: collision with root package name */
        g.E f41569b;

        /* renamed from: c  reason: collision with root package name */
        u f41570c;

        p(s sVar, g.E e10, u uVar) {
            this.f41568a = sVar;
            this.f41569b = e10;
            this.f41570c = uVar;
        }

        public String toString() {
            return String.valueOf(this.f41568a) + " {...} (src=" + this.f41570c + ")";
        }
    }

    /* renamed from: a8.b$q */
    static class q {

        /* renamed from: a  reason: collision with root package name */
        g.L f41571a;

        q() {
        }

        public String toString() {
            g.L l10 = this.f41571a;
            return l10 != null ? String.format("<%s id=\"%s\">", new Object[]{l10.o(), this.f41571a.f41672c}) : "";
        }
    }

    /* renamed from: a8.b$r */
    static class r {

        /* renamed from: a  reason: collision with root package name */
        private List<p> f41572a = null;

        r() {
        }

        /* access modifiers changed from: package-private */
        public void a(p pVar) {
            if (this.f41572a == null) {
                this.f41572a = new ArrayList();
            }
            for (int i10 = 0; i10 < this.f41572a.size(); i10++) {
                if (this.f41572a.get(i10).f41568a.f41574b > pVar.f41568a.f41574b) {
                    this.f41572a.add(i10, pVar);
                    return;
                }
            }
            this.f41572a.add(pVar);
        }

        /* access modifiers changed from: package-private */
        public void b(r rVar) {
            if (rVar.f41572a != null) {
                if (this.f41572a == null) {
                    this.f41572a = new ArrayList(rVar.f41572a.size());
                }
                for (p a10 : rVar.f41572a) {
                    a(a10);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public List<p> c() {
            return this.f41572a;
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            List<p> list = this.f41572a;
            return list == null || list.isEmpty();
        }

        /* access modifiers changed from: package-private */
        public void e(u uVar) {
            List<p> list = this.f41572a;
            if (list != null) {
                Iterator<p> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().f41570c == uVar) {
                        it.remove();
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public int f() {
            List<p> list = this.f41572a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.f41572a == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            for (p pVar : this.f41572a) {
                sb2.append(pVar.toString());
                sb2.append(10);
            }
            return sb2.toString();
        }
    }

    /* renamed from: a8.b$t */
    private static class t {

        /* renamed from: a  reason: collision with root package name */
        e f41575a = null;

        /* renamed from: b  reason: collision with root package name */
        String f41576b = null;

        /* renamed from: c  reason: collision with root package name */
        List<C0734b> f41577c = null;

        /* renamed from: d  reason: collision with root package name */
        List<g> f41578d = null;

        t(e eVar, String str) {
            this.f41575a = eVar == null ? e.DESCENDANT : eVar;
            this.f41576b = str;
        }

        /* access modifiers changed from: package-private */
        public void a(String str, c cVar, String str2) {
            if (this.f41577c == null) {
                this.f41577c = new ArrayList();
            }
            this.f41577c.add(new C0734b(str, cVar, str2));
        }

        /* access modifiers changed from: package-private */
        public void b(g gVar) {
            if (this.f41578d == null) {
                this.f41578d = new ArrayList();
            }
            this.f41578d.add(gVar);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            e eVar = this.f41575a;
            if (eVar == e.CHILD) {
                sb2.append("> ");
            } else if (eVar == e.FOLLOWS) {
                sb2.append("+ ");
            }
            String str = this.f41576b;
            if (str == null) {
                str = Marker.ANY_MARKER;
            }
            sb2.append(str);
            List<C0734b> list = this.f41577c;
            if (list != null) {
                for (C0734b next : list) {
                    sb2.append('[');
                    sb2.append(next.f41553a);
                    int i10 = a.f41551a[next.f41554b.ordinal()];
                    if (i10 == 1) {
                        sb2.append('=');
                        sb2.append(next.f41555c);
                    } else if (i10 == 2) {
                        sb2.append("~=");
                        sb2.append(next.f41555c);
                    } else if (i10 == 3) {
                        sb2.append("|=");
                        sb2.append(next.f41555c);
                    }
                    sb2.append(']');
                }
            }
            List<g> list2 = this.f41578d;
            if (list2 != null) {
                for (g append : list2) {
                    sb2.append(':');
                    sb2.append(append);
                }
            }
            return sb2.toString();
        }
    }

    /* renamed from: a8.b$u */
    enum u {
        Document,
        RenderOptions
    }

    C6752b(u uVar) {
        this(f.screen, uVar);
    }

    private static int a(List<g.J> list, int i10, g.L l10) {
        int i11 = 0;
        if (i10 < 0) {
            return 0;
        }
        g.J j10 = list.get(i10);
        g.J j11 = l10.f41682b;
        if (j10 != j11) {
            return -1;
        }
        for (g.N n10 : j11.e()) {
            if (n10 == l10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    static boolean b(String str, f fVar) {
        d dVar = new d(str);
        dVar.A();
        return c(h(dVar), fVar);
    }

    private static boolean c(List<f> list, f fVar) {
        for (f next : list) {
            if (next == f.all) {
                return true;
            }
            if (next == fVar) {
                return true;
            }
        }
        return false;
    }

    private void e(r rVar, d dVar) {
        String H10 = dVar.H();
        dVar.A();
        if (H10 != null) {
            if (!this.f41550c && H10.equals("media")) {
                List<f> h10 = h(dVar);
                if (dVar.f('{')) {
                    dVar.A();
                    if (c(h10, this.f41548a)) {
                        this.f41550c = true;
                        rVar.b(j(dVar));
                        this.f41550c = false;
                    } else {
                        j(dVar);
                    }
                    if (!dVar.h() && !dVar.f('}')) {
                        throw new C6751a("Invalid @media rule: expected '}' at end of rule set");
                    }
                } else {
                    throw new C6751a("Invalid @media rule: missing rule set");
                }
            } else if (this.f41550c || !H10.equals("import")) {
                p("Ignoring @%s rule", H10);
                o(dVar);
            } else {
                String N10 = dVar.N();
                if (N10 == null) {
                    N10 = dVar.F();
                }
                if (N10 != null) {
                    dVar.A();
                    List<f> h11 = h(dVar);
                    if (!dVar.h() && !dVar.f(';')) {
                        throw new C6751a("Invalid @media rule: expected '}' at end of rule set");
                    } else if (g.k() != null && c(h11, this.f41548a)) {
                        String b10 = g.k().b(N10);
                        if (b10 != null) {
                            rVar.b(d(b10));
                        } else {
                            return;
                        }
                    }
                } else {
                    throw new C6751a("Invalid @import rule: expected string or url()");
                }
            }
            dVar.A();
            return;
        }
        throw new C6751a("Invalid '@' rule");
    }

    public static List<String> f(String str) {
        d dVar = new d(str);
        ArrayList arrayList = null;
        while (!dVar.h()) {
            String r10 = dVar.r();
            if (r10 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(r10);
                dVar.A();
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private a8.g.E g(a8.C6752b.d r5) {
        /*
            r4 = this;
            a8.g$E r0 = new a8.g$E
            r0.<init>()
        L_0x0005:
            java.lang.String r1 = r5.H()
            r5.A()
            r2 = 58
            boolean r2 = r5.f(r2)
            if (r2 == 0) goto L_0x0061
            r5.A()
            java.lang.String r2 = r5.J()
            if (r2 == 0) goto L_0x0059
            r5.A()
            r3 = 33
            boolean r3 = r5.f(r3)
            if (r3 == 0) goto L_0x003f
            r5.A()
            java.lang.String r3 = "important"
            boolean r3 = r5.g(r3)
            if (r3 == 0) goto L_0x0037
            r5.A()
            goto L_0x003f
        L_0x0037:
            a8.a r5 = new a8.a
            java.lang.String r0 = "Malformed rule set: found unexpected '!'"
            r5.<init>(r0)
            throw r5
        L_0x003f:
            r3 = 59
            r5.f(r3)
            a8.k.S0(r0, r1, r2)
            r5.A()
            boolean r1 = r5.h()
            if (r1 != 0) goto L_0x0058
            r1 = 125(0x7d, float:1.75E-43)
            boolean r1 = r5.f(r1)
            if (r1 == 0) goto L_0x0005
        L_0x0058:
            return r0
        L_0x0059:
            a8.a r5 = new a8.a
            java.lang.String r0 = "Expected property value"
            r5.<init>(r0)
            throw r5
        L_0x0061:
            a8.a r5 = new a8.a
            java.lang.String r0 = "Expected ':'"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.C6752b.g(a8.b$d):a8.g$E");
    }

    private static List<f> h(d dVar) {
        String w10;
        ArrayList arrayList = new ArrayList();
        while (!dVar.h() && (w10 = dVar.w()) != null) {
            try {
                arrayList.add(f.valueOf(w10));
            } catch (IllegalArgumentException unused) {
            }
            if (!dVar.z()) {
                break;
            }
        }
        return arrayList;
    }

    private boolean i(r rVar, d dVar) {
        List<s> B10 = dVar.L();
        if (B10 == null || B10.isEmpty()) {
            return false;
        }
        if (dVar.f('{')) {
            dVar.A();
            g.E g10 = g(dVar);
            dVar.A();
            for (s pVar : B10) {
                rVar.a(new p(pVar, g10, this.f41549b));
            }
            return true;
        }
        throw new C6751a("Malformed rule block: expected '{'");
    }

    private r j(d dVar) {
        r rVar = new r();
        while (!dVar.h()) {
            try {
                if (!dVar.g("<!--")) {
                    if (!dVar.g("-->")) {
                        if (!dVar.f('@')) {
                            if (!i(rVar, dVar)) {
                                break;
                            }
                        } else {
                            e(rVar, dVar);
                        }
                    }
                }
            } catch (C6751a e10) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e10.getMessage());
            }
        }
        return rVar;
    }

    private static boolean k(q qVar, s sVar, int i10, List<g.J> list, int i11, g.L l10) {
        t e10 = sVar.e(i10);
        if (!n(qVar, e10, list, i11, l10)) {
            return false;
        }
        e eVar = e10.f41575a;
        if (eVar == e.DESCENDANT) {
            if (i10 == 0) {
                return true;
            }
            while (i11 >= 0) {
                if (m(qVar, sVar, i10 - 1, list, i11)) {
                    return true;
                }
                i11--;
            }
            return false;
        } else if (eVar == e.CHILD) {
            return m(qVar, sVar, i10 - 1, list, i11);
        } else {
            int a10 = a(list, i11, l10);
            if (a10 <= 0) {
                return false;
            }
            return k(qVar, sVar, i10 - 1, list, i11, (g.L) l10.f41682b.e().get(a10 - 1));
        }
    }

    static boolean l(q qVar, s sVar, g.L l10) {
        ArrayList arrayList = new ArrayList();
        for (g.J j10 = l10.f41682b; j10 != null; j10 = ((g.N) j10).f41682b) {
            arrayList.add(0, j10);
        }
        int size = arrayList.size() - 1;
        if (sVar.g() == 1) {
            return n(qVar, sVar.e(0), arrayList, size, l10);
        }
        return k(qVar, sVar, sVar.g() - 1, arrayList, size, l10);
    }

    private static boolean m(q qVar, s sVar, int i10, List<g.J> list, int i11) {
        t e10 = sVar.e(i10);
        g.L l10 = (g.L) list.get(i11);
        if (!n(qVar, e10, list, i11, l10)) {
            return false;
        }
        e eVar = e10.f41575a;
        if (eVar == e.DESCENDANT) {
            if (i10 == 0) {
                return true;
            }
            while (i11 > 0) {
                i11--;
                if (m(qVar, sVar, i10 - 1, list, i11)) {
                    return true;
                }
            }
            return false;
        } else if (eVar == e.CHILD) {
            return m(qVar, sVar, i10 - 1, list, i11 - 1);
        } else {
            int a10 = a(list, i11, l10);
            if (a10 <= 0) {
                return false;
            }
            return k(qVar, sVar, i10 - 1, list, i11, (g.L) l10.f41682b.e().get(a10 - 1));
        }
    }

    private static boolean n(q qVar, t tVar, List<g.J> list, int i10, g.L l10) {
        List<String> list2;
        String str = tVar.f41576b;
        if (str != null && !str.equals(l10.o().toLowerCase(Locale.US))) {
            return false;
        }
        List<C0734b> list3 = tVar.f41577c;
        if (list3 != null) {
            for (C0734b next : list3) {
                String str2 = next.f41553a;
                str2.hashCode();
                if (!str2.equals("id")) {
                    if (!str2.equals("class") || (list2 = l10.f41676g) == null || !list2.contains(next.f41555c)) {
                        return false;
                    }
                } else if (!next.f41555c.equals(l10.f41672c)) {
                    return false;
                }
            }
        }
        List<g> list4 = tVar.f41578d;
        if (list4 == null) {
            return true;
        }
        for (g a10 : list4) {
            if (!a10.a(qVar, l10)) {
                return false;
            }
        }
        return true;
    }

    private void o(d dVar) {
        int i10 = 0;
        while (!dVar.h()) {
            int intValue = dVar.l().intValue();
            if (intValue != 59 || i10 != 0) {
                if (intValue == 123) {
                    i10++;
                } else if (intValue == 125 && i10 > 0 && i10 - 1 == 0) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private static void p(String str, Object... objArr) {
        Log.w("CSSParser", String.format(str, objArr));
    }

    /* access modifiers changed from: package-private */
    public r d(String str) {
        d dVar = new d(str);
        dVar.A();
        return j(dVar);
    }

    C6752b(f fVar, u uVar) {
        this.f41550c = false;
        this.f41548a = fVar;
        this.f41549b = uVar;
    }

    /* renamed from: a8.b$s */
    private static class s {

        /* renamed from: a  reason: collision with root package name */
        List<t> f41573a;

        /* renamed from: b  reason: collision with root package name */
        int f41574b;

        private s() {
            this.f41573a = null;
            this.f41574b = 0;
        }

        /* access modifiers changed from: package-private */
        public void a(t tVar) {
            if (this.f41573a == null) {
                this.f41573a = new ArrayList();
            }
            this.f41573a.add(tVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f41574b += 1000;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f41574b++;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f41574b += 1000000;
        }

        /* access modifiers changed from: package-private */
        public t e(int i10) {
            return this.f41573a.get(i10);
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            List<t> list = this.f41573a;
            return list == null || list.isEmpty();
        }

        /* access modifiers changed from: package-private */
        public int g() {
            List<t> list = this.f41573a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            for (t append : this.f41573a) {
                sb2.append(append);
                sb2.append(' ');
            }
            sb2.append('[');
            sb2.append(this.f41574b);
            sb2.append(']');
            return sb2.toString();
        }

        /* synthetic */ s(a aVar) {
            this();
        }
    }
}
