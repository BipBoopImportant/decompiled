package OD;

import HJ.C15854t;
import MD.C13204a;
import PD.C13338c;
import android.webkit.CookieManager;
import com.optimizely.ab.config.FeatureVariable;
import com.sugarcube.core.logger.DslKt;
import fK.z;
import java.util.ArrayList;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ>\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0006\"\u000e\b\u0001\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"LOD/c;", "LPD/c;", "LkK/c;", "json", "<init>", "(LkK/c;)V", "D", "LMD/a;", "remote", "b", "(LMD/a;)Ljava/lang/Object;", "", "cookies", "c", "(Ljava/lang/String;)Ljava/lang/String;", "T", "url", "Ljava/lang/Class;", "clazz", "a", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "LkK/c;", "webview-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: OD.c  reason: case insensitive filesystem */
public final class C13305c implements C13338c {

    /* renamed from: a  reason: collision with root package name */
    private final C17514c f112781a;

    public C13305c(C17514c cVar) {
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        this.f112781a = cVar;
    }

    private final <D> D b(C13204a<D> aVar) {
        if (aVar == null) {
            return null;
        }
        try {
            return aVar.a();
        } catch (IllegalArgumentException e10) {
            e eVar = e.ERROR;
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
                    String a10 = C11818a.a("Failed to convert remote data into local", e10);
                    if (a10 == null) {
                        return null;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = C13305c.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, e10, str3);
                str = str3;
                str2 = str4;
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
        if (r15.length() > 0) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String c(java.lang.String r15) {
        /*
            r14 = this;
            r0 = 0
            if (r15 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = ";"
            java.lang.String[] r3 = new java.lang.String[]{r1}
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            r2 = r15
            java.util.List r15 = HJ.C15854t.Y0(r2, r3, r4, r5, r6, r7)
            java.util.Iterator r15 = r15.iterator()
        L_0x0017:
            boolean r1 = r15.hasNext()
            r2 = 0
            r3 = 2
            if (r1 == 0) goto L_0x004b
            java.lang.Object r1 = r15.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = HJ.C15854t.z1(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "ikeaapp-to-app"
            boolean r4 = HJ.C15854t.W(r1, r4, r2, r3, r0)
            if (r4 == 0) goto L_0x0017
            int r15 = r1.length()
            r4 = 15
            java.lang.String r15 = r1.substring(r4, r15)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.C17542s.i(r15, r1)
            int r1 = r15.length()
            if (r1 <= 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r15 = r0
        L_0x004c:
            if (r15 == 0) goto L_0x0117
            byte[] r1 = android.util.Base64.decode(r15, r2)     // Catch:{ IllegalArgumentException -> 0x005d }
            java.lang.String r2 = "decode(...)"
            kotlin.jvm.internal.C17542s.i(r1, r2)     // Catch:{ IllegalArgumentException -> 0x005d }
            java.lang.String r0 = HJ.C15854t.B(r1)     // Catch:{ IllegalArgumentException -> 0x005d }
            goto L_0x0117
        L_0x005d:
            r1 = move-exception
            qv.e r2 = qv.e.WARN
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0071:
            boolean r6 = r4.hasNext()
            r10 = 0
            if (r6 == 0) goto L_0x0089
            java.lang.Object r6 = r4.next()
            r7 = r6
            qv.b r7 = (qv.C11819b) r7
            boolean r7 = r7.b(r2, r10)
            if (r7 == 0) goto L_0x0071
            r5.add(r6)
            goto L_0x0071
        L_0x0089:
            java.util.Iterator r11 = r5.iterator()
            r4 = r0
            r5 = r4
        L_0x008f:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x0117
            java.lang.Object r6 = r11.next()
            qv.b r6 = (qv.C11819b) r6
            if (r4 != 0) goto L_0x00ba
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "Failed to decode cookieValue "
            r4.append(r7)
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = qv.C11818a.a(r4, r1)
            if (r4 != 0) goto L_0x00b6
            goto L_0x0117
        L_0x00b6:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x00ba:
            r12 = r4
            if (r5 != 0) goto L_0x0109
            java.lang.Class<OD.c> r4 = OD.C13305c.class
            java.lang.String r4 = r4.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            r5 = 36
            java.lang.String r5 = HJ.C15854t.s1(r4, r5, r0, r3, r0)
            r7 = 46
            java.lang.String r5 = HJ.C15854t.o1(r5, r7, r0, r3, r0)
            int r7 = r5.length()
            if (r7 != 0) goto L_0x00d9
            goto L_0x00df
        L_0x00d9:
            java.lang.String r4 = "Kt"
            java.lang.String r4 = HJ.C15854t.P0(r5, r4)
        L_0x00df:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            java.lang.String r7 = "main"
            r8 = 1
            boolean r5 = HJ.C15854t.b0(r5, r7, r8)
            if (r5 == 0) goto L_0x00f3
            java.lang.String r5 = "m"
            goto L_0x00f5
        L_0x00f3:
            java.lang.String r5 = "b"
        L_0x00f5:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = "|"
            r7.append(r5)
            r7.append(r4)
            java.lang.String r5 = r7.toString()
        L_0x0109:
            r13 = r5
            r4 = r6
            r5 = r2
            r6 = r13
            r7 = r10
            r8 = r1
            r9 = r12
            r4.a(r5, r6, r7, r8, r9)
            r4 = r12
            r5 = r13
            goto L_0x008f
        L_0x0117:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: OD.C13305c.c(java.lang.String):java.lang.String");
    }

    public <D, T extends C13204a<D>> D a(String str, Class<T> cls) {
        C17542s.j(str, "url");
        C17542s.j(cls, "clazz");
        String c10 = c(CookieManager.getInstance().getCookie(str));
        C13204a aVar = null;
        if (c10 == null) {
            return null;
        }
        try {
            Object c11 = this.f112781a.c(z.b(cls), c10);
            if (c11 instanceof C13204a) {
                aVar = (C13204a) c11;
            }
        } catch (IllegalArgumentException e10) {
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a("Failed to parse cookie " + c10 + " into class " + cls, e10);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = C13305c.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, e10, str4);
                str2 = str4;
                str3 = str5;
            }
        }
        return b(aVar);
    }
}
