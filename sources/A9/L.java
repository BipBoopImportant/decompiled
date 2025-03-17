package a9;

import GJ.C15767j;
import XH.C16807N;
import dI.C17164e;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import nI.p;

@f(c = "com.contentsquare.android.internal.features.srm.SrmPayloadSplitter$split$1", f = "SrmPayloadSplitter.kt", l = {26, 36}, m = "invokeSuspend")
public final class L extends k implements p<C15767j<? super byte[]>, C17164e<? super C16807N>, Object> {

    /* renamed from: d  reason: collision with root package name */
    public C6890n4 f42110d;

    /* renamed from: e  reason: collision with root package name */
    public int f42111e;

    /* renamed from: f  reason: collision with root package name */
    public int f42112f;

    /* renamed from: g  reason: collision with root package name */
    public /* synthetic */ Object f42113g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f42114h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ S f42115i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ List<C6782a0> f42116j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public L(int i10, S s10, ArrayList arrayList, C17164e eVar) {
        super(2, eVar);
        this.f42114h = i10;
        this.f42115i = s10;
        this.f42116j = arrayList;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        L l10 = new L(this.f42114h, this.f42115i, (ArrayList) this.f42116j, eVar);
        l10.f42113g = obj;
        return l10;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((C15767j) obj, (C17164e) obj2)).invokeSuspend(C16807N.f139792a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f42112f
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x002b
            if (r2 == r5) goto L_0x001d
            if (r2 != r4) goto L_0x0015
            XH.y.b(r17)
            goto L_0x0160
        L_0x0015:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x001d:
            int r2 = r0.f42111e
            a9.n4 r6 = r0.f42110d
            java.lang.Object r7 = r0.f42113g
            GJ.j r7 = (GJ.C15767j) r7
            XH.y.b(r17)
            r4 = r5
            goto L_0x0113
        L_0x002b:
            XH.y.b(r17)
            java.lang.Object r2 = r0.f42113g
            GJ.j r2 = (GJ.C15767j) r2
            a9.n4 r6 = new a9.n4
            int r7 = r0.f42114h
            a9.S r8 = r0.f42115i
            java.lang.String r9 = r8.f42268a
            int r8 = r8.f42269b
            r6.<init>(r7, r8, r9)
            r7 = r2
            r2 = 0
        L_0x0041:
            java.util.List<a9.a0> r8 = r0.f42116j
            int r8 = r8.size()
            if (r2 >= r8) goto L_0x0147
            java.util.List<a9.a0> r8 = r0.f42116j
            java.lang.Object r8 = r8.get(r2)
            a9.a0 r8 = (a9.C6782a0) r8
            java.lang.String r10 = "item"
            kotlin.jvm.internal.C17542s.j(r8, r10)
            java.util.ArrayList r10 = r6.f42740d
            r10.add(r8)
            java.util.ArrayList r10 = r6.f42740d
            int r11 = r6.f42737a
            java.lang.String r12 = r6.f42738b
            G8.i r13 = G8.i.f36274a
            e9.g$a r14 = e9.C7816g.f50897b
            e9.d$a r15 = e9.C7813d.r()
            java.lang.String r3 = "newBuilder()"
            kotlin.jvm.internal.C17542s.i(r15, r3)
            e9.g r14 = r14.a(r15)
            r14.f(r11)
            e9.b r11 = e9.C7811b.PLATFORM_ANDROID
            r14.e(r11)
            java.lang.String r11 = "4.36.0"
            r14.g(r11)
            r14.d(r12)
            jd.a r11 = r14.c()
            java.util.ArrayList r12 = new java.util.ArrayList
            r15 = 10
            int r15 = YH.C16877v.y(r10, r15)
            r12.<init>(r15)
            java.util.Iterator r10 = r10.iterator()
        L_0x0095:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L_0x00d0
            java.lang.Object r15 = r10.next()
            a9.a0 r15 = (a9.C6782a0) r15
            e9.f$a r5 = e9.C7815f.f50895b
            e9.c$a r4 = e9.C7812c.l()
            kotlin.jvm.internal.C17542s.i(r4, r3)
            e9.f r4 = r5.a(r4)
            java.lang.String r5 = r15.f42429a
            r4.c(r5)
            byte[] r5 = r15.f42430b
            com.google.protobuf.h r5 = com.google.protobuf.C9575h.m(r5)
            java.lang.String r9 = "copyFrom(srmResource.data)"
            kotlin.jvm.internal.C17542s.i(r5, r9)
            r4.d(r5)
            java.lang.String r5 = r15.f42431c
            r4.b(r5)
            e9.c r4 = r4.a()
            r12.add(r4)
            r4 = 2
            r5 = 1
            goto L_0x0095
        L_0x00d0:
            r14.b(r11, r12)
            e9.d r3 = r14.a()
            byte[] r3 = r3.toByteArray()
            java.lang.String r4 = "this@toGZippedProto.toPr…appVersion).toByteArray()"
            kotlin.jvm.internal.C17542s.i(r3, r4)
            r4 = 2
            r5 = 0
            byte[] r3 = G8.i.b(r13, r3, r5, r4, r5)
            int r4 = r3.length
            int r5 = r6.f42739c
            if (r4 > r5) goto L_0x00f0
            r6.f42741e = r3
            r3 = 0
            r4 = 1
            goto L_0x0144
        L_0x00f0:
            java.util.ArrayList r3 = r6.f42740d
            int r4 = YH.C16877v.p(r3)
            r3.remove(r4)
            java.util.ArrayList r3 = r6.f42740d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0121
            byte[] r3 = r6.f42741e
            r0.f42113g = r7
            r0.f42110d = r6
            r0.f42111e = r2
            r4 = 1
            r0.f42112f = r4
            java.lang.Object r3 = r7.d(r3, r0)
            if (r3 != r1) goto L_0x0113
            return r1
        L_0x0113:
            java.util.ArrayList r3 = r6.f42740d
            r3.clear()
            r3 = 0
            byte[] r5 = new byte[r3]
            r6.f42741e = r5
        L_0x011d:
            r5 = r4
            r4 = 2
            goto L_0x0041
        L_0x0121:
            r3 = 0
            r4 = 1
            a9.S r5 = r0.f42115i
            D8.c r9 = r5.f42270c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Could not send resource '"
            r10.<init>(r11)
            java.lang.String r8 = r8.f42429a
            r10.append(r8)
            java.lang.String r8 = "', size greater than "
            r10.append(r8)
            int r5 = r5.f42269b
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            r9.h(r5)
        L_0x0144:
            int r2 = r2 + 1
            goto L_0x011d
        L_0x0147:
            java.util.ArrayList r2 = r6.f42740d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0160
            byte[] r2 = r6.f42741e
            r3 = 0
            r0.f42113g = r3
            r0.f42110d = r3
            r3 = 2
            r0.f42112f = r3
            java.lang.Object r2 = r7.d(r2, r0)
            if (r2 != r1) goto L_0x0160
            return r1
        L_0x0160:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.L.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
