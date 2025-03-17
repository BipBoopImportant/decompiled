package a9;

import H2.j;
import YH.C16877v;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.contentsquare.android.api.bridge.flutter.a;
import com.contentsquare.android.sdk.C7153u;
import com.contentsquare.android.sdk.C7159x;
import com.contentsquare.android.sdk.E;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import w8.C8933a;

/* renamed from: a9.f0  reason: case insensitive filesystem */
public final class C6822f0 {

    /* renamed from: a  reason: collision with root package name */
    public final j<View> f42546a;

    /* renamed from: b  reason: collision with root package name */
    public final M3<C8933a> f42547b;

    public C6822f0(M3 m32) {
        j<View> jVar = G1.f42018e;
        C17542s.j(jVar, "filterOutViews");
        C17542s.j(m32, "composeInterfaceProvider");
        this.f42546a = jVar;
        this.f42547b = m32;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final a9.C6912q2 a(android.view.ViewGroup r18, l8.C8537a[] r19, com.contentsquare.android.sdk.E r20, a9.W3 r21, a9.K2 r22, nI.p<? super android.view.View, ? super a9.W3, ? extends a9.C6984z3> r23, nI.p<? super android.view.View, ? super com.contentsquare.android.sdk.C7153u, XH.C16807N> r24) {
        /*
            r17 = this;
            r6 = r17
            r0 = r18
            r1 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            java.lang.String r2 = "view"
            kotlin.jvm.internal.C17542s.j(r0, r2)
            java.lang.String r2 = "cVars"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            java.lang.String r2 = "externalViewsProcessor"
            kotlin.jvm.internal.C17542s.j(r7, r2)
            java.lang.String r3 = "viewBitmapProviderResult"
            kotlin.jvm.internal.C17542s.j(r8, r3)
            java.lang.String r4 = "screenGraphParameters"
            kotlin.jvm.internal.C17542s.j(r9, r4)
            java.lang.String r5 = "composeScreenGraphGenerator"
            kotlin.jvm.internal.C17542s.j(r10, r5)
            java.lang.String r12 = "itemProcessCallback"
            kotlin.jvm.internal.C17542s.j(r11, r12)
            a9.q2 r13 = new a9.q2
            r13.<init>()
            java.lang.String r14 = "<set-?>"
            kotlin.jvm.internal.C17542s.j(r1, r14)
            r13.f42807c = r1
            java.lang.String r1 = "viewGroup"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlin.jvm.internal.C17542s.j(r7, r2)
            kotlin.jvm.internal.C17542s.j(r8, r3)
            kotlin.jvm.internal.C17542s.j(r9, r4)
            kotlin.jvm.internal.C17542s.j(r11, r12)
            kotlin.jvm.internal.C17542s.j(r10, r5)
            a9.M3<w8.a> r1 = r6.f42547b
            java.lang.Object r1 = r1.get()
            w8.a r1 = (w8.C8933a) r1
            com.contentsquare.android.sdk.u r12 = com.contentsquare.android.sdk.C7159x.a(r0, r8, r9, r1)
            java.util.LinkedList r15 = new java.util.LinkedList
            r15.<init>()
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r0, r12)
            r15.add(r1)
        L_0x006c:
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x0155
            java.lang.Object r0 = r15.remove()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r1 = r0.second
            r5 = r1
            com.contentsquare.android.sdk.u r5 = (com.contentsquare.android.sdk.C7153u) r5
            java.lang.Object r0 = r0.first
            r4 = r0
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.String r0 = "group"
            kotlin.jvm.internal.C17542s.i(r4, r0)
            java.lang.Object r0 = r10.invoke(r4, r8)
            r3 = r0
            a9.z3 r3 = (a9.C6984z3) r3
            boolean r0 = r3 instanceof a9.C6984z3.b
            if (r0 == 0) goto L_0x012b
            GJ.h r0 = I2.C4610g0.b(r4)
            a9.M3<w8.a> r1 = r6.f42547b
            java.lang.Object r1 = r1.get()
            w8.a r1 = (w8.C8933a) r1
            if (r1 != 0) goto L_0x00a7
        L_0x00a0:
            r16 = r3
            r19 = r4
            r7 = r5
            goto L_0x0116
        L_0x00a7:
            java.util.Iterator r0 = r0.iterator()
        L_0x00ab:
            boolean r16 = r0.hasNext()
            if (r16 == 0) goto L_0x00c0
            java.lang.Object r16 = r0.next()
            r2 = r16
            android.view.View r2 = (android.view.View) r2
            boolean r2 = r1.d(r2)
            if (r2 == 0) goto L_0x00ab
            goto L_0x00c2
        L_0x00c0:
            r16 = 0
        L_0x00c2:
            r0 = r16
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x00a0
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x00d0
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2 = r0
            goto L_0x00d1
        L_0x00d0:
            r2 = 0
        L_0x00d1:
            if (r2 == 0) goto L_0x00a0
            a9.M3<w8.a> r0 = r6.f42547b
            java.lang.Object r0 = r0.get()
            w8.a r0 = (w8.C8933a) r0
            com.contentsquare.android.sdk.u r1 = com.contentsquare.android.sdk.C7159x.a(r2, r8, r9, r0)
            org.json.JSONObject r0 = r1.f47644f
            r19 = r3
            java.lang.String r3 = "bitmap"
            r0.remove(r3)
            org.json.JSONObject r0 = r1.f47644f
            java.lang.String r3 = "background"
            r0.remove(r3)
            org.json.JSONObject r0 = r1.f47644f
            r3 = 0
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r18 = r1
            java.lang.String r1 = "viewAlpha"
            r0.put(r1, r3)
            r0 = r17
            r3 = r18
            r1 = r15
            r16 = r19
            r6 = r3
            r3 = r20
            r19 = r4
            r4 = r21
            r7 = r5
            r5 = r22
            java.util.List r0 = r0.b(r1, r2, r3, r4, r5)
            r6.f47641c = r0
            r2 = r6
            goto L_0x0117
        L_0x0116:
            r2 = 0
        L_0x0117:
            if (r2 != 0) goto L_0x0120
            r3 = r16
            a9.z3$b r3 = (a9.C6984z3.b) r3
            java.util.List<com.contentsquare.android.sdk.u> r0 = r3.f42984a
            goto L_0x013d
        L_0x0120:
            r3 = r16
            a9.z3$b r3 = (a9.C6984z3.b) r3
            java.util.List<com.contentsquare.android.sdk.u> r0 = r3.f42984a
            java.util.List r0 = YH.C16877v.W0(r0, r2)
            goto L_0x013d
        L_0x012b:
            r19 = r4
            r7 = r5
            r0 = r17
            r1 = r15
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            java.util.List r0 = r0.b(r1, r2, r3, r4, r5)
        L_0x013d:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0145
            r7.f47641c = r0
        L_0x0145:
            java.lang.String r0 = "groupJsonObj"
            kotlin.jvm.internal.C17542s.i(r7, r0)
            r0 = r19
            r11.invoke(r0, r7)
            r6 = r17
            r7 = r20
            goto L_0x006c
        L_0x0155:
            java.util.List r0 = YH.C16877v.e(r12)
            kotlin.jvm.internal.C17542s.j(r0, r14)
            r13.f42808d = r0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C6822f0.a(android.view.ViewGroup, l8.a[], com.contentsquare.android.sdk.E, a9.W3, a9.K2, nI.p, nI.p):a9.q2");
    }

    public final List b(LinkedList linkedList, ViewGroup viewGroup, E e10, W3 w32, K2 k22) {
        int childCount = viewGroup.getChildCount();
        if (childCount <= 0) {
            return C16877v.n();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (!this.f42546a.test(childAt)) {
                C17542s.i(childAt, "child");
                C7153u a10 = C7159x.a(childAt, w32, k22, this.f42547b.get());
                arrayList.add(a10);
                if (childAt instanceof ViewGroup) {
                    linkedList.add(new Pair(childAt, a10));
                }
                e10.getClass();
                C17542s.j(childAt, "view");
                C17542s.j(a10, "jsonView");
                if (childAt instanceof WebView) {
                    e10.f46949e.put(childAt, a10);
                } else {
                    a aVar = E.f46944g.get(childAt);
                    if (aVar != null) {
                        e10.f46950f.put(childAt, new E.b(a10, aVar));
                    }
                }
            }
        }
        return arrayList;
    }
}
