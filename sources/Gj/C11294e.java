package gj;

import HJ.C15854t;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lgj/e;", "", "<init>", "()V", "", "", "key", "a", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;", "", "format", "rawValue", "LXH/x;", "Lgj/j$d;", "b", "(ILjava/lang/String;)Ljava/lang/Object;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gj.e  reason: case insensitive filesystem */
public final class C11294e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f97538a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lgj/e$a;", "", "<init>", "()V", "", "PTAG_IDENTIFIER", "Ljava/lang/String;", "PARAM_DELIMITER", "", "ARG_DELIMITER", "C", "STORE_ID_PARAM", "PRODUCT_ID_PARAM", "PRODUCT_TYPE_PARAM", "PTAG_SIZE_PARAM", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gj.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final String a(List<String> list, String str) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C15854t.W((String) obj, str, false, 2, (Object) null)) {
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return null;
        }
        int m02 = C15854t.m0(str2);
        while (true) {
            if (-1 < m02) {
                if (str2.charAt(m02) == '=') {
                    str2 = str2.substring(m02 + 1);
                    C17542s.i(str2, "substring(...)");
                    break;
                }
                m02--;
            } else {
                break;
            }
        }
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        return str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b A[Catch:{ all -> 0x0026 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0081 A[Catch:{ all -> 0x0026 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(int r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r0 = "rawValue"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            XH.x$a r0 = XH.x.f139812b     // Catch:{ all -> 0x0026 }
            java.lang.String r0 = "ptag-info"
            r1 = 2
            r2 = 0
            r3 = 0
            boolean r0 = HJ.C15854t.d0(r14, r0, r3, r1, r2)     // Catch:{ all -> 0x0026 }
            java.lang.String r1 = "Failed requirement."
            if (r0 == 0) goto L_0x0087
            java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x0026 }
            r0.<init>(r14)     // Catch:{ all -> 0x0026 }
            java.lang.String r4 = r0.getQuery()     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x0028
            int r0 = r4.length()     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0029
            goto L_0x0028
        L_0x0026:
            r13 = move-exception
            goto L_0x008d
        L_0x0028:
            r3 = 1
        L_0x0029:
            if (r3 != 0) goto L_0x0081
            java.lang.String r0 = "&"
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0026 }
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            java.util.List r0 = HJ.C15854t.Y0(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0026 }
            java.lang.String r1 = "cc"
            java.lang.String r8 = r12.a(r0, r1)     // Catch:{ all -> 0x0026 }
            java.lang.String r1 = "Required value was null."
            if (r8 == 0) goto L_0x007b
            java.lang.String r2 = "in"
            java.lang.String r5 = r12.a(r0, r2)     // Catch:{ all -> 0x0026 }
            if (r5 == 0) goto L_0x0075
            java.lang.String r2 = "it"
            java.lang.String r6 = r12.a(r0, r2)     // Catch:{ all -> 0x0026 }
            if (r6 == 0) goto L_0x006f
            java.lang.String r1 = "t"
            java.lang.String r0 = r12.a(r0, r1)     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = ""
        L_0x005d:
            r7 = r0
            gj.j$d r0 = new gj.j$d     // Catch:{ all -> 0x0026 }
            r10 = 64
            r11 = 0
            r9 = 0
            r2 = r0
            r3 = r13
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0026 }
            java.lang.Object r13 = XH.x.b(r0)     // Catch:{ all -> 0x0026 }
            goto L_0x0097
        L_0x006f:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0026 }
            r13.<init>(r1)     // Catch:{ all -> 0x0026 }
            throw r13     // Catch:{ all -> 0x0026 }
        L_0x0075:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0026 }
            r13.<init>(r1)     // Catch:{ all -> 0x0026 }
            throw r13     // Catch:{ all -> 0x0026 }
        L_0x007b:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0026 }
            r13.<init>(r1)     // Catch:{ all -> 0x0026 }
            throw r13     // Catch:{ all -> 0x0026 }
        L_0x0081:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0026 }
            r13.<init>(r1)     // Catch:{ all -> 0x0026 }
            throw r13     // Catch:{ all -> 0x0026 }
        L_0x0087:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0026 }
            r13.<init>(r1)     // Catch:{ all -> 0x0026 }
            throw r13     // Catch:{ all -> 0x0026 }
        L_0x008d:
            XH.x$a r14 = XH.x.f139812b
            java.lang.Object r13 = XH.y.a(r13)
            java.lang.Object r13 = XH.x.b(r13)
        L_0x0097:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: gj.C11294e.b(int, java.lang.String):java.lang.Object");
    }
}
