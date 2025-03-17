package xH;

import BH.C15458c;
import EH.C15618c;
import YH.C16877v;
import bI.C17035a;
import dI.C17164e;
import io.ktor.utils.io.g;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\n\u001a\u00020\t*\u00060\u0000j\u0002`\u00012\u001e\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00030\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\t*\u00060\u0000j\u0002`\u00012\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a9\u0010\u0017\u001a\u00020\t2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u001d\u001a\u00020\t2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "", "", "", "headers", "LxH/l;", "sanitizedHeaders", "LXH/N;", "b", "(Ljava/lang/Appendable;Ljava/util/Set;Ljava/util/List;)V", "key", "value", "a", "(Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "log", "LBH/c;", "response", "LxH/b;", "level", "d", "(Ljava/lang/StringBuilder;LBH/c;LxH/b;Ljava/util/List;)V", "LEH/c;", "contentType", "Lio/ktor/utils/io/g;", "content", "c", "(Ljava/lang/StringBuilder;LEH/c;Lio/ktor/utils/io/g;LdI/e;)Ljava/lang/Object;", "ktor-client-logging"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: xH.i  reason: case insensitive filesystem */
public final class C18595i {

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: xH.i$a */
    public static final class a<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e((String) ((Map.Entry) t10).getKey(), (String) ((Map.Entry) t11).getKey());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.client.plugins.logging.LoggingUtilsKt", f = "LoggingUtils.kt", l = {71}, m = "logResponseBody")
    /* renamed from: xH.i$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f152253c;

        /* renamed from: d  reason: collision with root package name */
        Object f152254d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f152255e;

        /* renamed from: f  reason: collision with root package name */
        int f152256f;

        b(C17164e<? super b> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f152255e = obj;
            this.f152256f |= Integer.MIN_VALUE;
            return C18595i.c((StringBuilder) null, (C15618c) null, (g) null, this);
        }
    }

    public static final void a(Appendable appendable, String str, String str2) {
        C17542s.j(appendable, "<this>");
        C17542s.j(str, "key");
        C17542s.j(str2, "value");
        Appendable append = appendable.append("-> " + str + ": " + str2);
        C17542s.i(append, "append(value)");
        C17542s.i(append.append(10), "append('\\n')");
    }

    public static final void b(Appendable appendable, Set<? extends Map.Entry<String, ? extends List<String>>> set, List<C18598l> list) {
        String str;
        Object obj;
        Appendable appendable2 = appendable;
        Set<? extends Map.Entry<String, ? extends List<String>>> set2 = set;
        List<C18598l> list2 = list;
        C17542s.j(appendable2, "<this>");
        C17542s.j(set2, "headers");
        C17542s.j(list2, "sanitizedHeaders");
        for (Map.Entry entry : C16877v.g1(C16877v.t1(set2), new a())) {
            String str2 = (String) entry.getKey();
            List list3 = (List) entry.getValue();
            Iterator it = list2.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C18598l) obj).b().invoke(str2).booleanValue()) {
                    break;
                }
            }
            C18598l lVar = (C18598l) obj;
            if (lVar != null) {
                str = lVar.a();
            }
            if (str == null) {
                str = C16877v.G0(list3, "; ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
            }
            a(appendable2, str2, str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(java.lang.StringBuilder r12, EH.C15618c r13, io.ktor.utils.io.g r14, dI.C17164e<? super XH.C16807N> r15) {
        /*
            boolean r0 = r15 instanceof xH.C18595i.b
            if (r0 == 0) goto L_0x0014
            r0 = r15
            xH.i$b r0 = (xH.C18595i.b) r0
            int r1 = r0.f152256f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f152256f = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            xH.i$b r0 = new xH.i$b
            r0.<init>(r15)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r15 = r4.f152255e
            java.lang.Object r0 = eI.C17187b.f()
            int r1 = r4.f152256f
            r7 = 0
            r2 = 1
            java.lang.String r8 = "append('\\n')"
            r9 = 10
            java.lang.String r10 = "append(value)"
            if (r1 == 0) goto L_0x0044
            if (r1 != r2) goto L_0x003c
            java.lang.Object r12 = r4.f152254d
            java.nio.charset.Charset r12 = (java.nio.charset.Charset) r12
            java.lang.Object r13 = r4.f152253c
            java.lang.StringBuilder r13 = (java.lang.StringBuilder) r13
            XH.y.b(r15)     // Catch:{ all -> 0x003a }
            goto L_0x0091
        L_0x003a:
            r12 = r13
            goto L_0x009a
        L_0x003c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0044:
            XH.y.b(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r1 = "BODY Content-Type: "
            r15.append(r1)
            r15.append(r13)
            java.lang.String r15 = r15.toString()
            r12.append(r15)
            kotlin.jvm.internal.C17542s.i(r12, r10)
            r12.append(r9)
            kotlin.jvm.internal.C17542s.i(r12, r8)
            java.lang.String r15 = "BODY START"
            r12.append(r15)
            kotlin.jvm.internal.C17542s.i(r12, r10)
            r12.append(r9)
            kotlin.jvm.internal.C17542s.i(r12, r8)
            if (r13 == 0) goto L_0x007a
            java.nio.charset.Charset r13 = EH.C15620e.a(r13)
            if (r13 != 0) goto L_0x007c
        L_0x007a:
            java.nio.charset.Charset r13 = HJ.C15838d.f135279b
        L_0x007c:
            r4.f152253c = r12     // Catch:{ all -> 0x009a }
            r4.f152254d = r13     // Catch:{ all -> 0x009a }
            r4.f152256f = r2     // Catch:{ all -> 0x009a }
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r14
            java.lang.Object r15 = io.ktor.utils.io.g.b.a(r1, r2, r4, r5, r6)     // Catch:{ all -> 0x009a }
            if (r15 != r0) goto L_0x008e
            return r0
        L_0x008e:
            r11 = r13
            r13 = r12
            r12 = r11
        L_0x0091:
            RH.n r15 = (RH.n) r15     // Catch:{ all -> 0x003a }
            r14 = 0
            r0 = 2
            java.lang.String r7 = RH.w.e(r15, r12, r14, r0, r7)     // Catch:{ all -> 0x003a }
            goto L_0x009b
        L_0x009a:
            r13 = r12
        L_0x009b:
            if (r7 != 0) goto L_0x009f
            java.lang.String r7 = "[response body omitted]"
        L_0x009f:
            r13.append(r7)
            kotlin.jvm.internal.C17542s.i(r13, r10)
            r13.append(r9)
            kotlin.jvm.internal.C17542s.i(r13, r8)
            java.lang.String r12 = "BODY END"
            r13.append(r12)
            XH.N r12 = XH.C16807N.f139792a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: xH.C18595i.c(java.lang.StringBuilder, EH.c, io.ktor.utils.io.g, dI.e):java.lang.Object");
    }

    public static final void d(StringBuilder sb2, C15458c cVar, C18588b bVar, List<C18598l> list) {
        C17542s.j(sb2, "log");
        C17542s.j(cVar, "response");
        C17542s.j(bVar, "level");
        C17542s.j(list, "sanitizedHeaders");
        if (bVar.m()) {
            sb2.append("RESPONSE: " + cVar.f());
            C17542s.i(sb2, "append(value)");
            sb2.append(10);
            C17542s.i(sb2, "append('\\n')");
            sb2.append("METHOD: " + cVar.h0().e().U());
            C17542s.i(sb2, "append(value)");
            sb2.append(10);
            C17542s.i(sb2, "append('\\n')");
            sb2.append("FROM: " + cVar.h0().e().getUrl());
            C17542s.i(sb2, "append(value)");
            sb2.append(10);
            C17542s.i(sb2, "append('\\n')");
        }
        if (bVar.j()) {
            sb2.append("COMMON HEADERS");
            C17542s.i(sb2, "append(value)");
            sb2.append(10);
            C17542s.i(sb2, "append('\\n')");
            b(sb2, cVar.a().a(), list);
        }
    }
}
