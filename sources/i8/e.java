package I8;

import D8.c;
import HJ.C15854t;
import YH.C16877v;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import y8.C8993b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a!\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\t\"\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ly8/b;", "", "a", "(Ly8/b;)Z", "", "", "validUrls", "b", "(Ly8/b;Ljava/util/List;)Z", "Ljava/util/List;", "urlsExcluded", "urlsAllowed", "LD8/c;", "c", "LD8/c;", "logger", "error-analysis_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f37104a = C16877v.q("csq.io", "contentsquare.net", "csqtrk.net");

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f37105b = C16877v.e("qa-mock-server.contentsquare.net");

    /* renamed from: c  reason: collision with root package name */
    private static final c f37106c = new c("NetworkEventFilter");

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f A[Catch:{ URISyntaxException -> 0x0018 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050 A[Catch:{ URISyntaxException -> 0x0018 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(y8.C8993b r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            r0 = 1
            java.util.List<java.lang.String> r1 = f37105b     // Catch:{ URISyntaxException -> 0x0018 }
            boolean r2 = r1 instanceof java.util.Collection     // Catch:{ URISyntaxException -> 0x0018 }
            r3 = 0
            r4 = 2
            java.lang.String r5 = ""
            r6 = 0
            if (r2 == 0) goto L_0x001a
            boolean r2 = r1.isEmpty()     // Catch:{ URISyntaxException -> 0x0018 }
            if (r2 == 0) goto L_0x001a
            goto L_0x0042
        L_0x0018:
            r1 = move-exception
            goto L_0x0079
        L_0x001a:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ URISyntaxException -> 0x0018 }
        L_0x001e:
            boolean r2 = r1.hasNext()     // Catch:{ URISyntaxException -> 0x0018 }
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r1.next()     // Catch:{ URISyntaxException -> 0x0018 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ URISyntaxException -> 0x0018 }
            java.net.URI r7 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0018 }
            java.lang.String r8 = r10.E()     // Catch:{ URISyntaxException -> 0x0018 }
            r7.<init>(r8)     // Catch:{ URISyntaxException -> 0x0018 }
            java.lang.String r7 = r7.getHost()     // Catch:{ URISyntaxException -> 0x0018 }
            if (r7 != 0) goto L_0x003a
            r7 = r5
        L_0x003a:
            boolean r2 = HJ.C15854t.G(r7, r2, r6, r4, r3)     // Catch:{ URISyntaxException -> 0x0018 }
            if (r2 == 0) goto L_0x001e
            r1 = r0
            goto L_0x0043
        L_0x0042:
            r1 = r6
        L_0x0043:
            java.util.List<java.lang.String> r2 = f37104a     // Catch:{ URISyntaxException -> 0x0018 }
            boolean r7 = r2 instanceof java.util.Collection     // Catch:{ URISyntaxException -> 0x0018 }
            if (r7 == 0) goto L_0x0050
            boolean r7 = r2.isEmpty()     // Catch:{ URISyntaxException -> 0x0018 }
            if (r7 == 0) goto L_0x0050
            goto L_0x0077
        L_0x0050:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ URISyntaxException -> 0x0018 }
        L_0x0054:
            boolean r7 = r2.hasNext()     // Catch:{ URISyntaxException -> 0x0018 }
            if (r7 == 0) goto L_0x0077
            java.lang.Object r7 = r2.next()     // Catch:{ URISyntaxException -> 0x0018 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ URISyntaxException -> 0x0018 }
            java.net.URI r8 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0018 }
            java.lang.String r9 = r10.E()     // Catch:{ URISyntaxException -> 0x0018 }
            r8.<init>(r9)     // Catch:{ URISyntaxException -> 0x0018 }
            java.lang.String r8 = r8.getHost()     // Catch:{ URISyntaxException -> 0x0018 }
            if (r8 != 0) goto L_0x0070
            r8 = r5
        L_0x0070:
            boolean r7 = HJ.C15854t.G(r8, r7, r6, r4, r3)     // Catch:{ URISyntaxException -> 0x0018 }
            if (r7 == 0) goto L_0x0054
            r0 = r6
        L_0x0077:
            r0 = r0 | r1
            goto L_0x0090
        L_0x0079:
            D8.c r2 = f37106c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot parse url: "
            r3.<init>(r4)
            java.lang.String r10 = r10.E()
            r3.append(r10)
            java.lang.String r10 = r3.toString()
            r2.g(r1, r10)
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I8.e.a(y8.b):boolean");
    }

    public static final boolean b(C8993b bVar, List<String> list) {
        C17542s.j(bVar, "<this>");
        if (list == null) {
            return false;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            for (T next : list) {
                if (((String) next).length() > 0) {
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            for (String d02 : arrayList) {
                if (C15854t.d0(R8.e.d(bVar.E()), d02, false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        } catch (URISyntaxException e10) {
            c cVar = f37106c;
            cVar.g(e10, "Cannot parse url: " + bVar.E());
            return false;
        }
    }
}
