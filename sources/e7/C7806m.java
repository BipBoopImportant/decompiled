package e7;

import c7.C7100a;
import kotlin.Metadata;
import r7.C8708j;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Le7/m;", "Lc7/a;", "Lr7/j;", "<init>", "()V", "a", "(LdI/e;)Ljava/lang/Object;", "b", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: e7.m  reason: case insensitive filesystem */
public final class C7806m implements C7100a<C8708j> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le7/m$a;", "Lr7/j$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: e7.m$a */
    public static final class a extends C8708j.a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f50889a = new a();

        private a() {
        }

        public String toString() {
            return "Resources missing log-list.json file";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le7/m$b;", "Lr7/j$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: e7.m$b */
    public static final class b extends C8708j.a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f50890a = new b();

        private b() {
        }

        public String toString() {
            return "Resources missing log-list.sig file";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        jI.C17416c.a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003e, code lost:
        jI.C17416c.a(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super r7.C8708j> r4) {
        /*
            r3 = this;
            java.lang.Class<e7.m> r4 = e7.C7806m.class
            java.lang.ClassLoader r4 = r4.getClassLoader()
            java.lang.String r0 = "log_list.json"
            java.io.InputStream r0 = r4.getResourceAsStream(r0)
            if (r0 == 0) goto L_0x0042
            byte[] r1 = jI.C17415b.c(r0)     // Catch:{ all -> 0x003b }
            r2 = 0
            jI.C17416c.a(r0, r2)
            if (r1 != 0) goto L_0x0019
            goto L_0x0042
        L_0x0019:
            java.lang.String r0 = "log_list.sig"
            java.io.InputStream r4 = r4.getResourceAsStream(r0)
            if (r4 == 0) goto L_0x0038
            byte[] r0 = jI.C17415b.c(r4)     // Catch:{ all -> 0x0031 }
            jI.C17416c.a(r4, r2)
            if (r0 != 0) goto L_0x002b
            goto L_0x0038
        L_0x002b:
            r7.j$b r4 = new r7.j$b
            r4.<init>(r1, r0)
            return r4
        L_0x0031:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r1 = move-exception
            jI.C17416c.a(r4, r0)
            throw r1
        L_0x0038:
            e7.m$b r4 = e7.C7806m.b.f50890a
            return r4
        L_0x003b:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x003d }
        L_0x003d:
            r1 = move-exception
            jI.C17416c.a(r0, r4)
            throw r1
        L_0x0042:
            e7.m$a r4 = e7.C7806m.a.f50889a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.C7806m.a(dI.e):java.lang.Object");
    }
}
