package XK;

import HJ.C15835a;
import HJ.C15854t;
import WK.C16762E;
import WK.C16772g;
import WK.C16777l;
import WK.Q;
import XH.C16796C;
import XH.C16807N;
import YH.C16877v;
import YH.X;
import bI.C17035a;
import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.O;
import nI.C17642l;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0017\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001f\u001a\u00020\u001d*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u001d*\u00020\u0010H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010$\u001a\u00020\u0005*\u00020\u00102\u0006\u0010#\u001a\u00020\u0005H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010&\u001a\u0004\u0018\u00010\u0005*\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b&\u0010%\u001a\u0017\u0010(\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001cH\u0000¢\u0006\u0004\b(\u0010)\u001a!\u0010,\u001a\u0004\u0018\u00010\u001c2\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019H\u0000¢\u0006\u0004\b,\u0010-\"\u0018\u00101\u001a\u00020.*\u00020\u00198BX\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"LWK/E;", "zipPath", "LWK/l;", "fileSystem", "Lkotlin/Function1;", "LXK/k;", "", "predicate", "LWK/Q;", "i", "(LWK/E;LWK/l;LnI/l;)LWK/Q;", "", "entries", "", "e", "(Ljava/util/List;)Ljava/util/Map;", "LWK/g;", "l", "(LWK/g;)LXK/k;", "LXK/f;", "o", "(LWK/g;)LXK/f;", "regularRecord", "t", "(LWK/g;LXK/f;)LXK/f;", "", "extraSize", "Lkotlin/Function2;", "", "LXH/N;", "block", "p", "(LWK/g;ILnI/p;)V", "u", "(LWK/g;)V", "centralDirectoryZipEntry", "q", "(LWK/g;LXK/k;)LXK/k;", "r", "filetime", "g", "(J)J", "date", "time", "f", "(II)Ljava/lang/Long;", "", "h", "(I)Ljava/lang/String;", "hex", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(((k) t10).b(), ((k) t11).b());
        }
    }

    private static final Map<C16762E, k> e(List<k> list) {
        C16762E e10 = C16762E.a.e(C16762E.f139592b, "/", false, 1, (Object) null);
        Map<C16762E, k> p10 = X.p(C16796C.a(e10, new k(e10, true, (String) null, 0, 0, 0, 0, 0, 0, 0, (Long) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, 65532, (DefaultConstructorMarker) null)));
        Iterator it = C16877v.g1(list, new a()).iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (p10.put(kVar.b(), kVar) == null) {
                while (true) {
                    C16762E D10 = kVar.b().D();
                    if (D10 == null) {
                        break;
                    }
                    k kVar2 = p10.get(D10);
                    if (kVar2 != null) {
                        kVar2.c().add(kVar.b());
                        break;
                    }
                    Iterator it2 = it;
                    k kVar3 = r4;
                    k kVar4 = new k(D10, true, (String) null, 0, 0, 0, 0, 0, 0, 0, (Long) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, 65532, (DefaultConstructorMarker) null);
                    p10.put(D10, kVar3);
                    kVar3.c().add(kVar.b());
                    kVar = kVar3;
                    it = it2;
                }
            }
        }
        return p10;
    }

    public static final Long f(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        return Long.valueOf(q.a(((i10 >> 9) & 127) + 1980, (i10 >> 5) & 15, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1));
    }

    public static final long g(long j10) {
        return (j10 / ((long) 10000)) - 11644473600000L;
    }

    private static final String h(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        String num = Integer.toString(i10, C15835a.a(16));
        C17542s.i(num, "toString(...)");
        sb2.append(num);
        return sb2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r4.close();
        r0 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x017d, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r11.close();
        r5 = r5 - ((long) 20);
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        if (r5 <= 0) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        r5 = WK.y.d(r4.v(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0069, code lost:
        if (r5.K2() != 117853008) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        r0 = r5.K2();
        r12 = r5.l1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0078, code lost:
        if (r5.K2() != 1) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        if (r0 != 0) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        r6 = WK.y.d(r4.v(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r0 = r6.K2();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        if (r0 != 101075792) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
        r9 = t(r6, r9);
        r0 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (r6 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        r12 = r9;
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c7, code lost:
        throw new java.io.IOException("bad zip: expected " + h(101075792) + " but was " + h(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c8, code lost:
        if (r6 != null) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r6.close();
        r0 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        XH.C16816g.a(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d6, code lost:
        r6 = r0;
        r9 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00df, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e0, code lost:
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e9, code lost:
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f6, code lost:
        if (r5 != null) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r5.close();
        r0 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0107, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010c, code lost:
        r5 = new java.util.ArrayList();
        r6 = WK.y.d(r4.v(r9.a()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r12 = r9.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0123, code lost:
        if (r7 < r12) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0125, code lost:
        r0 = l(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0133, code lost:
        if (r0.i() < r9.a()) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x013f, code lost:
        if (r3.invoke(r0).booleanValue() != false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0141, code lost:
        r5.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0145, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0146, code lost:
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0148, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0153, code lost:
        throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0154, code lost:
        r0 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0156, code lost:
        if (r6 != null) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x015c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015d, code lost:
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x015f, code lost:
        if (r6 != null) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r6.close();
        r0 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0167, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        XH.C16816g.a(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x016b, code lost:
        if (r11 == null) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x016d, code lost:
        r3 = new WK.Q(r1, r2, e(r5), r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0176, code lost:
        if (r4 != null) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        r9 = o(r11);
        r10 = r11.B1((long) r9.b());
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00de A[SYNTHETIC, Splitter:B:45:0x00de] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ee A[SYNTHETIC, Splitter:B:53:0x00ee] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010a A[Catch:{ all -> 0x017f, all -> 0x00fe, all -> 0x0103 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010b A[Catch:{ all -> 0x017f, all -> 0x00fe, all -> 0x0103 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final WK.Q i(WK.C16762E r18, WK.C16777l r19, nI.C17642l<? super XK.k, java.lang.Boolean> r20) {
        /*
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r0 = "zipPath"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "fileSystem"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            WK.j r4 = r2.u(r1)
            long r5 = r4.size()     // Catch:{ all -> 0x0103 }
            r0 = 22
            long r7 = (long) r0     // Catch:{ all -> 0x0103 }
            long r5 = r5 - r7
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0199
            r9 = 65536(0x10000, double:3.2379E-319)
            long r9 = r5 - r9
            long r9 = java.lang.Math.max(r9, r7)     // Catch:{ all -> 0x0103 }
        L_0x0030:
            WK.N r0 = r4.v(r5)     // Catch:{ all -> 0x0103 }
            WK.g r11 = WK.y.d(r0)     // Catch:{ all -> 0x0103 }
            int r0 = r11.K2()     // Catch:{ all -> 0x017f }
            r12 = 101010256(0x6054b50, float:2.506985E-35)
            if (r0 != r12) goto L_0x0181
            XK.f r9 = o(r11)     // Catch:{ all -> 0x017f }
            int r0 = r9.b()     // Catch:{ all -> 0x017f }
            long r12 = (long) r0     // Catch:{ all -> 0x017f }
            java.lang.String r10 = r11.B1(r12)     // Catch:{ all -> 0x017f }
            r11.close()     // Catch:{ all -> 0x0103 }
            r0 = 20
            long r11 = (long) r0     // Catch:{ all -> 0x0103 }
            long r5 = r5 - r11
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r11 = 0
            if (r0 <= 0) goto L_0x010c
            WK.N r0 = r4.v(r5)     // Catch:{ all -> 0x0103 }
            WK.g r5 = WK.y.d(r0)     // Catch:{ all -> 0x0103 }
            int r0 = r5.K2()     // Catch:{ all -> 0x00df }
            r6 = 117853008(0x7064b50, float:1.0103172E-34)
            if (r0 != r6) goto L_0x00ea
            int r0 = r5.K2()     // Catch:{ all -> 0x00df }
            long r12 = r5.l1()     // Catch:{ all -> 0x00df }
            int r6 = r5.K2()     // Catch:{ all -> 0x00df }
            r14 = 1
            if (r6 != r14) goto L_0x00e2
            if (r0 != 0) goto L_0x00e2
            WK.N r0 = r4.v(r12)     // Catch:{ all -> 0x00df }
            WK.g r6 = WK.y.d(r0)     // Catch:{ all -> 0x00df }
            int r0 = r6.K2()     // Catch:{ all -> 0x009d }
            r12 = 101075792(0x6064b50, float:2.525793E-35)
            if (r0 != r12) goto L_0x00a1
            XK.f r9 = t(r6, r9)     // Catch:{ all -> 0x009d }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x009d }
            if (r6 == 0) goto L_0x009b
            r6.close()     // Catch:{ all -> 0x0099 }
            goto L_0x009b
        L_0x0099:
            r0 = move-exception
            goto L_0x00db
        L_0x009b:
            r0 = r11
            goto L_0x00db
        L_0x009d:
            r0 = move-exception
            r12 = r9
            r9 = r0
            goto L_0x00c8
        L_0x00a1:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ all -> 0x009d }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x009d }
            r14.<init>()     // Catch:{ all -> 0x009d }
            java.lang.String r15 = "bad zip: expected "
            r14.append(r15)     // Catch:{ all -> 0x009d }
            java.lang.String r12 = h(r12)     // Catch:{ all -> 0x009d }
            r14.append(r12)     // Catch:{ all -> 0x009d }
            java.lang.String r12 = " but was "
            r14.append(r12)     // Catch:{ all -> 0x009d }
            java.lang.String r0 = h(r0)     // Catch:{ all -> 0x009d }
            r14.append(r0)     // Catch:{ all -> 0x009d }
            java.lang.String r0 = r14.toString()     // Catch:{ all -> 0x009d }
            r13.<init>(r0)     // Catch:{ all -> 0x009d }
            throw r13     // Catch:{ all -> 0x009d }
        L_0x00c8:
            if (r6 == 0) goto L_0x00d9
            r6.close()     // Catch:{ all -> 0x00d0 }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x00d0 }
            goto L_0x00d9
        L_0x00d0:
            r0 = move-exception
            XH.C16816g.a(r9, r0)     // Catch:{ all -> 0x00d5 }
            goto L_0x00d9
        L_0x00d5:
            r0 = move-exception
            r6 = r0
            r9 = r12
            goto L_0x00f6
        L_0x00d9:
            r0 = r9
            r9 = r12
        L_0x00db:
            if (r0 != 0) goto L_0x00de
            goto L_0x00ea
        L_0x00de:
            throw r0     // Catch:{ all -> 0x00df }
        L_0x00df:
            r0 = move-exception
            r6 = r0
            goto L_0x00f6
        L_0x00e2:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00df }
            java.lang.String r6 = "unsupported zip: spanned"
            r0.<init>(r6)     // Catch:{ all -> 0x00df }
            throw r0     // Catch:{ all -> 0x00df }
        L_0x00ea:
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x00df }
            if (r5 == 0) goto L_0x00f4
            r5.close()     // Catch:{ all -> 0x00f2 }
            goto L_0x00f4
        L_0x00f2:
            r0 = move-exception
            goto L_0x0108
        L_0x00f4:
            r0 = r11
            goto L_0x0108
        L_0x00f6:
            if (r5 == 0) goto L_0x0107
            r5.close()     // Catch:{ all -> 0x00fe }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x00fe }
            goto L_0x0107
        L_0x00fe:
            r0 = move-exception
            XH.C16816g.a(r6, r0)     // Catch:{ all -> 0x0103 }
            goto L_0x0107
        L_0x0103:
            r0 = move-exception
            r1 = r0
            goto L_0x01b4
        L_0x0107:
            r0 = r6
        L_0x0108:
            if (r0 != 0) goto L_0x010b
            goto L_0x010c
        L_0x010b:
            throw r0     // Catch:{ all -> 0x0103 }
        L_0x010c:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0103 }
            r5.<init>()     // Catch:{ all -> 0x0103 }
            long r12 = r9.a()     // Catch:{ all -> 0x0103 }
            WK.N r0 = r4.v(r12)     // Catch:{ all -> 0x0103 }
            WK.g r6 = WK.y.d(r0)     // Catch:{ all -> 0x0103 }
            long r12 = r9.c()     // Catch:{ all -> 0x0145 }
        L_0x0121:
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0154
            XK.k r0 = l(r6)     // Catch:{ all -> 0x0145 }
            long r14 = r0.i()     // Catch:{ all -> 0x0145 }
            long r16 = r9.a()     // Catch:{ all -> 0x0145 }
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x014c
            java.lang.Object r14 = r3.invoke(r0)     // Catch:{ all -> 0x0145 }
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ all -> 0x0145 }
            boolean r14 = r14.booleanValue()     // Catch:{ all -> 0x0145 }
            if (r14 == 0) goto L_0x0148
            r5.add(r0)     // Catch:{ all -> 0x0145 }
            goto L_0x0148
        L_0x0145:
            r0 = move-exception
            r11 = r0
            goto L_0x015f
        L_0x0148:
            r14 = 1
            long r7 = r7 + r14
            goto L_0x0121
        L_0x014c:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0145 }
            java.lang.String r3 = "bad zip: local file header offset >= central directory offset"
            r0.<init>(r3)     // Catch:{ all -> 0x0145 }
            throw r0     // Catch:{ all -> 0x0145 }
        L_0x0154:
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0145 }
            if (r6 == 0) goto L_0x016b
            r6.close()     // Catch:{ all -> 0x015c }
            goto L_0x016b
        L_0x015c:
            r0 = move-exception
            r11 = r0
            goto L_0x016b
        L_0x015f:
            if (r6 == 0) goto L_0x016b
            r6.close()     // Catch:{ all -> 0x0167 }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0167 }
            goto L_0x016b
        L_0x0167:
            r0 = move-exception
            XH.C16816g.a(r11, r0)     // Catch:{ all -> 0x0103 }
        L_0x016b:
            if (r11 != 0) goto L_0x017e
            java.util.Map r0 = e(r5)     // Catch:{ all -> 0x0103 }
            WK.Q r3 = new WK.Q     // Catch:{ all -> 0x0103 }
            r3.<init>(r1, r2, r0, r10)     // Catch:{ all -> 0x0103 }
            if (r4 == 0) goto L_0x017d
            r4.close()     // Catch:{ all -> 0x017d }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x017d }
        L_0x017d:
            return r3
        L_0x017e:
            throw r11     // Catch:{ all -> 0x0103 }
        L_0x017f:
            r0 = move-exception
            goto L_0x0195
        L_0x0181:
            r11.close()     // Catch:{ all -> 0x0103 }
            r11 = -1
            long r5 = r5 + r11
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x018d
            goto L_0x0030
        L_0x018d:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0103 }
            java.lang.String r1 = "not a zip: end of central directory signature not found"
            r0.<init>(r1)     // Catch:{ all -> 0x0103 }
            throw r0     // Catch:{ all -> 0x0103 }
        L_0x0195:
            r11.close()     // Catch:{ all -> 0x0103 }
            throw r0     // Catch:{ all -> 0x0103 }
        L_0x0199:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0103 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0103 }
            r1.<init>()     // Catch:{ all -> 0x0103 }
            java.lang.String r2 = "not a zip: size="
            r1.append(r2)     // Catch:{ all -> 0x0103 }
            long r2 = r4.size()     // Catch:{ all -> 0x0103 }
            r1.append(r2)     // Catch:{ all -> 0x0103 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0103 }
            r0.<init>(r1)     // Catch:{ all -> 0x0103 }
            throw r0     // Catch:{ all -> 0x0103 }
        L_0x01b4:
            if (r4 == 0) goto L_0x01c0
            r4.close()     // Catch:{ all -> 0x01bc }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x01bc }
            goto L_0x01c0
        L_0x01bc:
            r0 = move-exception
            XH.C16816g.a(r1, r0)
        L_0x01c0:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: XK.p.i(WK.E, WK.l, nI.l):WK.Q");
    }

    public static /* synthetic */ Q j(C16762E e10, C16777l lVar, C17642l lVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            new o
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r2v2 ? I:XK.o) =  call: XK.o.<init>():void type: CONSTRUCTOR in method: XK.p.j(WK.E, WK.l, nI.l, int, java.lang.Object):WK.Q, dex: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v2 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                r3 = r3 & 4
                if (r3 == 0) goto L_0x0009
                XK.o r2 = new XK.o
                r2.<init>()
            L_0x0009:
                WK.Q r0 = i(r0, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: XK.p.j(WK.E, WK.l, nI.l, int, java.lang.Object):WK.Q");
        }

        /* access modifiers changed from: private */
        public static final boolean k(k kVar) {
            C17542s.j(kVar, "it");
            return true;
        }

        public static final k l(C16772g gVar) {
            C16772g gVar2 = gVar;
            C17542s.j(gVar2, "<this>");
            int K22 = gVar.K2();
            if (K22 == 33639248) {
                gVar2.M(4);
                short i12 = gVar.i1();
                short s10 = i12 & 65535;
                if ((i12 & 1) == 0) {
                    short i13 = gVar.i1() & 65535;
                    short i14 = gVar.i1() & 65535;
                    short i15 = gVar.i1() & 65535;
                    long K23 = ((long) gVar.K2()) & 4294967295L;
                    N n10 = new N();
                    n10.f144347a = ((long) gVar.K2()) & 4294967295L;
                    N n11 = new N();
                    n11.f144347a = ((long) gVar.K2()) & 4294967295L;
                    short i16 = gVar.i1() & 65535;
                    short i17 = gVar.i1() & 65535;
                    gVar2.M(8);
                    N n12 = new N();
                    n12.f144347a = ((long) gVar.K2()) & 4294967295L;
                    String B12 = gVar2.B1((long) (gVar.i1() & 65535));
                    if (!C15854t.c0(B12, 0, false, 2, (Object) null)) {
                        long j10 = n11.f144347a == 4294967295L ? (long) 8 : 0;
                        if (n10.f144347a == 4294967295L) {
                            j10 += (long) 8;
                        }
                        if (n12.f144347a == 4294967295L) {
                            j10 += (long) 8;
                        }
                        long j11 = j10;
                        O o10 = new O();
                        O o11 = new O();
                        O o12 = new O();
                        K k10 = new K();
                        m mVar = r0;
                        K k11 = k10;
                        O o13 = o12;
                        O o14 = o11;
                        N n13 = n11;
                        O o15 = o10;
                        String str = B12;
                        N n14 = n12;
                        short s11 = i17;
                        m mVar2 = new m(k10, j11, n11, gVar, n10, n12, o15, o14, o13);
                        p(gVar2, i16, mVar);
                        if (j11 <= 0 || k11.f144344a) {
                            String str2 = str;
                            return new k(C16762E.a.e(C16762E.f139592b, "/", false, 1, (Object) null).G(str2), C15854t.G(str2, "/", false, 2, (Object) null), gVar2.B1((long) s11), K23, n10.f144347a, n13.f144347a, i13, n14.f144347a, i15, i14, (Long) o15.f144348a, (Long) o14.f144348a, (Long) o13.f144348a, (Integer) null, (Integer) null, (Integer) null, 57344, (DefaultConstructorMarker) null);
                        }
                        throw new IOException("bad zip: zip64 extra required but absent");
                    }
                    throw new IOException("bad zip: filename contains 0x00");
                }
                throw new IOException("unsupported zip: general purpose bit flag=" + h(s10));
            }
            throw new IOException("bad zip: expected " + h(33639248) + " but was " + h(K22));
        }

        /* access modifiers changed from: private */
        public static final C16807N m(K k10, long j10, N n10, C16772g gVar, N n11, N n12, O o10, O o11, O o12, int i10, long j11) {
            if (i10 != 1) {
                if (i10 == 10) {
                    if (j11 >= 4) {
                        gVar.M(4);
                        p(gVar, (int) (j11 - 4), new n(o10, gVar, o11, o12));
                    } else {
                        throw new IOException("bad zip: NTFS extra too short");
                    }
                }
            } else if (!k10.f144344a) {
                k10.f144344a = true;
                if (j11 >= j10) {
                    long j12 = n10.f144347a;
                    if (j12 == 4294967295L) {
                        j12 = gVar.l1();
                    }
                    n10.f144347a = j12;
                    long j13 = 0;
                    n11.f144347a = n11.f144347a == 4294967295L ? gVar.l1() : 0;
                    if (n12.f144347a == 4294967295L) {
                        j13 = gVar.l1();
                    }
                    n12.f144347a = j13;
                } else {
                    throw new IOException("bad zip: zip64 extra too short");
                }
            } else {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N n(O o10, C16772g gVar, O o11, O o12, int i10, long j10) {
            if (i10 == 1) {
                if (o10.f144348a != null) {
                    throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                } else if (j10 == 24) {
                    o10.f144348a = Long.valueOf(gVar.l1());
                    o11.f144348a = Long.valueOf(gVar.l1());
                    o12.f144348a = Long.valueOf(gVar.l1());
                } else {
                    throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                }
            }
            return C16807N.f139792a;
        }

        private static final C16839f o(C16772g gVar) {
            short i12 = gVar.i1() & 65535;
            short i13 = gVar.i1() & 65535;
            long i14 = (long) (gVar.i1() & 65535);
            if (i14 == ((long) (gVar.i1() & 65535)) && i12 == 0 && i13 == 0) {
                gVar.M(4);
                return new C16839f(i14, 4294967295L & ((long) gVar.K2()), gVar.i1() & 65535);
            }
            throw new IOException("unsupported zip: spanned");
        }

        private static final void p(C16772g gVar, int i10, nI.p<? super Integer, ? super Long, C16807N> pVar) {
            long j10 = (long) i10;
            while (j10 != 0) {
                if (j10 >= 4) {
                    short i12 = gVar.i1() & 65535;
                    long i13 = ((long) gVar.i1()) & 65535;
                    long j11 = j10 - ((long) 4);
                    if (j11 >= i13) {
                        gVar.t1(i13);
                        long size = gVar.p().size();
                        pVar.invoke(Integer.valueOf(i12), Long.valueOf(i13));
                        long size2 = (gVar.p().size() + i13) - size;
                        int i11 = (size2 > 0 ? 1 : (size2 == 0 ? 0 : -1));
                        if (i11 >= 0) {
                            if (i11 > 0) {
                                gVar.p().M(size2);
                            }
                            j10 = j11 - i13;
                        } else {
                            throw new IOException("unsupported zip: too many bytes processed for " + i12);
                        }
                    } else {
                        throw new IOException("bad zip: truncated value in extra field");
                    }
                } else {
                    throw new IOException("bad zip: truncated header in extra field");
                }
            }
        }

        public static final k q(C16772g gVar, k kVar) {
            C17542s.j(gVar, "<this>");
            C17542s.j(kVar, "centralDirectoryZipEntry");
            k r10 = r(gVar, kVar);
            C17542s.g(r10);
            return r10;
        }

        private static final k r(C16772g gVar, k kVar) {
            int K22 = gVar.K2();
            if (K22 == 67324752) {
                gVar.M(2);
                short i12 = gVar.i1();
                short s10 = i12 & 65535;
                if ((i12 & 1) == 0) {
                    gVar.M(18);
                    short i13 = gVar.i1() & 65535;
                    gVar.M(((long) gVar.i1()) & 65535);
                    if (kVar == null) {
                        gVar.M((long) i13);
                        return null;
                    }
                    O o10 = new O();
                    O o11 = new O();
                    O o12 = new O();
                    p(gVar, i13, new l(gVar, o10, o11, o12));
                    return kVar.a((Integer) o10.f144348a, (Integer) o11.f144348a, (Integer) o12.f144348a);
                }
                throw new IOException("unsupported zip: general purpose bit flag=" + h(s10));
            }
            throw new IOException("bad zip: expected " + h(67324752) + " but was " + h(K22));
        }

        /* access modifiers changed from: private */
        public static final C16807N s(C16772g gVar, O o10, O o11, O o12, int i10, long j10) {
            if (i10 == 21589) {
                long j11 = 1;
                if (j10 >= 1) {
                    byte readByte = gVar.readByte();
                    boolean z10 = false;
                    boolean z11 = (readByte & 1) == 1;
                    boolean z12 = (readByte & 2) == 2;
                    if ((readByte & 4) == 4) {
                        z10 = true;
                    }
                    if (z11) {
                        j11 = 5;
                    }
                    if (z12) {
                        j11 += 4;
                    }
                    if (z10) {
                        j11 += 4;
                    }
                    if (j10 >= j11) {
                        if (z11) {
                            o10.f144348a = Integer.valueOf(gVar.K2());
                        }
                        if (z12) {
                            o11.f144348a = Integer.valueOf(gVar.K2());
                        }
                        if (z10) {
                            o12.f144348a = Integer.valueOf(gVar.K2());
                        }
                    } else {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                } else {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
            }
            return C16807N.f139792a;
        }

        private static final C16839f t(C16772g gVar, C16839f fVar) {
            gVar.M(12);
            int K22 = gVar.K2();
            int K23 = gVar.K2();
            long l12 = gVar.l1();
            if (l12 == gVar.l1() && K22 == 0 && K23 == 0) {
                gVar.M(8);
                return new C16839f(l12, gVar.l1(), fVar.b());
            }
            throw new IOException("unsupported zip: spanned");
        }

        public static final void u(C16772g gVar) {
            C17542s.j(gVar, "<this>");
            r(gVar, (k) null);
        }
    }
