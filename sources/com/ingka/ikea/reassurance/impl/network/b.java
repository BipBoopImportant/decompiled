package com.ingka.ikea.reassurance.impl.network;

import VL.C16704f;
import YH.C16877v;
import cy.C14325a;
import cy.C14326b;
import cy.e;
import dI.C17164e;
import dy.C14356k;
import dy.C14357l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import tw.g;
import tw.h;
import uK.C18146a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/ingka/ikea/reassurance/impl/network/b;", "Lcom/ingka/ikea/reassurance/impl/network/a;", "Ltw/h;", "networkService", "Ltw/g;", "networkParameters", "<init>", "(Ltw/h;Ltw/g;)V", "Lcy/d;", "reassurance", "", "Ldy/l;", "b", "(Lcy/d;)Ljava/util/List;", "Lcom/ingka/ikea/reassurance/impl/network/ReassuranceModel;", "reassuranceResponse", "d", "(Lcom/ingka/ikea/reassurance/impl/network/ReassuranceModel;)Lcy/d;", "", "", "e", "(Ljava/lang/String;)I", "a", "(LdI/e;)Ljava/lang/Object;", "Ltw/h;", "Ltw/g;", "Lcom/ingka/ikea/reassurance/impl/network/b$a;", "c", "()Lcom/ingka/ikea/reassurance/impl/network/b$a;", "endpoint", "reassurance-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final h f119678a;

    /* renamed from: b  reason: collision with root package name */
    private final g f119679b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ingka/ikea/reassurance/impl/network/b$a;", "", "Lcom/ingka/ikea/reassurance/impl/network/ReassuranceModel;", "a", "(LdI/e;)Ljava/lang/Object;", "reassurance-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private interface a {
        @C16704f("range/v6/{cc}/{lc}/salesorder/reassurance")
        Object a(C17164e<? super ReassuranceModel> eVar);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.reassurance.impl.network.ReassuranceRemoteDataSourceImpl", f = "ReassuranceRemoteDataSourceImpl.kt", l = {57}, m = "getReassurance")
    /* renamed from: com.ingka.ikea.reassurance.impl.network.b$b  reason: collision with other inner class name */
    static final class C2989b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f119680c;

        /* renamed from: d  reason: collision with root package name */
        Object f119681d;

        /* renamed from: e  reason: collision with root package name */
        Object f119682e;

        /* renamed from: f  reason: collision with root package name */
        Object f119683f;

        /* renamed from: g  reason: collision with root package name */
        Object f119684g;

        /* renamed from: h  reason: collision with root package name */
        Object f119685h;

        /* renamed from: i  reason: collision with root package name */
        Object f119686i;

        /* renamed from: j  reason: collision with root package name */
        Object f119687j;

        /* renamed from: k  reason: collision with root package name */
        Object f119688k;

        /* renamed from: l  reason: collision with root package name */
        Object f119689l;

        /* renamed from: m  reason: collision with root package name */
        Object f119690m;

        /* renamed from: n  reason: collision with root package name */
        int f119691n;

        /* renamed from: o  reason: collision with root package name */
        int f119692o;

        /* renamed from: p  reason: collision with root package name */
        int f119693p;

        /* renamed from: q  reason: collision with root package name */
        int f119694q;

        /* renamed from: r  reason: collision with root package name */
        int f119695r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f119696s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ b f119697t;

        /* renamed from: u  reason: collision with root package name */
        int f119698u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2989b(b bVar, C17164e<? super C2989b> eVar) {
            super(eVar);
            this.f119697t = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f119696s = obj;
            this.f119698u |= Integer.MIN_VALUE;
            return this.f119697t.a(this);
        }
    }

    public b(h hVar, g gVar) {
        C17542s.j(hVar, "networkService");
        C17542s.j(gVar, "networkParameters");
        this.f119678a = hVar;
        this.f119679b = gVar;
    }

    private final List<C14357l> b(cy.d dVar) {
        Iterable<e> a10 = dVar.a();
        ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
        for (e eVar : a10) {
            for (C14325a aVar : eVar.a()) {
                if (C17542s.e(aVar.b(), "heading-1")) {
                    for (C14326b bVar : aVar.a()) {
                        if (C17542s.e(bVar.b(), "text")) {
                            String c10 = bVar.c();
                            ArrayList<C14325a> arrayList2 = new ArrayList<>();
                            for (Object next : eVar.a()) {
                                if (C17542s.e(((C14325a) next).b(), "paragraph")) {
                                    arrayList2.add(next);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(C16877v.y(arrayList2, 10));
                            for (C14325a a11 : arrayList2) {
                                C14326b bVar2 = (C14326b) C16877v.w0(a11.a());
                                arrayList3.add((!C17542s.e(bVar2.b(), "hyperlink") || bVar2.a() == null) ? new C14356k.a(bVar2.c()) : new C14356k.b(bVar2.c(), bVar2.a()));
                            }
                            arrayList.add(new C14357l(e(eVar.b()), c10, arrayList3));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return arrayList;
    }

    private final a c() {
        return (a) this.f119678a.b(a.class);
    }

    private final cy.d d(ReassuranceModel reassuranceModel) {
        cy.d b10;
        if (reassuranceModel != null && (b10 = reassuranceModel.b()) != null) {
            return b10;
        }
        throw new IOException("Invalid reassurance response");
    }

    private final int e(String str) {
        switch (str.hashCode()) {
            case -1286343257:
                if (str.equals("https://shop.static.ingka.ikea.com/reassurance/icon_glyph_truck_black.png")) {
                    return C18146a.f148385c3;
                }
                break;
            case -1184753251:
                if (str.equals("https://shop.static.ingka.ikea.com/reassurance/icon_glyph_member_card_black.png")) {
                    return C18146a.f148067H2;
                }
                break;
            case -725218427:
                if (str.equals("https://shop.static.ingka.ikea.com/reassurance/icon_glyph_return_heart_black.png")) {
                    return C18146a.f148344Z9;
                }
                break;
            case -300475216:
                if (str.equals("https://storage.googleapis.com/images-ikea-payments/prepaidcard-brands/Giftcard.png")) {
                    return C18146a.f148234S4;
                }
                break;
            case -80626789:
                if (str.equals("https://shop.static.ingka.ikea.com/reassurance/icon_glyph_recycle_black.png")) {
                    return C18146a.f148194P9;
                }
                break;
            case 640757902:
                if (str.equals("https://shop.static.ingka.ikea.com/reassurance/icon_glyph_security_black.png")) {
                    return C18146a.f148176O6;
                }
                break;
            case 1443802438:
                if (str.equals("https://shop.static.ingka.ikea.com/reassurance/icon_more_help_black.png")) {
                    return C18146a.f147999C9;
                }
                break;
        }
        return C18146a.f148160N5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super java.util.List<dy.C14357l>> r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            boolean r2 = r1 instanceof com.ingka.ikea.reassurance.impl.network.b.C2989b
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.ingka.ikea.reassurance.impl.network.b$b r2 = (com.ingka.ikea.reassurance.impl.network.b.C2989b) r2
            int r3 = r2.f119698u
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f119698u = r3
            goto L_0x001c
        L_0x0017:
            com.ingka.ikea.reassurance.impl.network.b$b r2 = new com.ingka.ikea.reassurance.impl.network.b$b
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f119696s
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f119698u
            r6 = 1
            if (r5 == 0) goto L_0x005e
            if (r5 != r6) goto L_0x0056
            java.lang.Object r1 = r2.f119689l
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r2.f119688k
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r2.f119687j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f119686i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f119685h
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r2.f119684g
            com.ingka.ikea.reassurance.impl.network.b r1 = (com.ingka.ikea.reassurance.impl.network.b) r1
            java.lang.Object r1 = r2.f119683f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f119682e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f119681d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f119680c
            com.ingka.ikea.reassurance.impl.network.b r1 = (com.ingka.ikea.reassurance.impl.network.b) r1
            XH.y.b(r3)
            goto L_0x016e
        L_0x0056:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005e:
            XH.y.b(r3)
            qv.e r3 = qv.e.DEBUG
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0074:
            boolean r7 = r5.hasNext()
            r14 = 0
            if (r7 == 0) goto L_0x008c
            java.lang.Object r7 = r5.next()
            r8 = r7
            qv.b r8 = (qv.C11819b) r8
            boolean r8 = r8.b(r3, r14)
            if (r8 == 0) goto L_0x0074
            r13.add(r7)
            goto L_0x0074
        L_0x008c:
            java.util.Iterator r5 = r13.iterator()
            r9 = r13
            r7 = 0
            r8 = 0
        L_0x0093:
            boolean r10 = r5.hasNext()
            java.lang.String r11 = "|"
            java.lang.String r12 = "b"
            java.lang.String r16 = "m"
            java.lang.String r14 = "main"
            java.lang.String r6 = "Kt"
            java.lang.Class<com.ingka.ikea.reassurance.impl.network.b> r17 = com.ingka.ikea.reassurance.impl.network.b.class
            if (r10 == 0) goto L_0x0123
            java.lang.Object r18 = r5.next()
            r9 = r18
            qv.b r9 = (qv.C11819b) r9
            r10 = 0
            if (r7 != 0) goto L_0x00c2
            java.lang.String r15 = "Get reassurance"
            java.lang.String r15 = qv.C11818a.a(r15, r10)
            if (r15 != 0) goto L_0x00be
            r19 = r12
            r9 = r18
            goto L_0x0125
        L_0x00be:
            java.lang.String r7 = qv.C11820c.a(r15)
        L_0x00c2:
            r15 = r7
            if (r8 != 0) goto L_0x0111
            java.lang.String r7 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r7)
            r19 = r12
            r8 = 0
            r10 = 36
            r12 = 2
            java.lang.String r10 = HJ.C15854t.s1(r7, r10, r8, r12, r8)
            r17 = r7
            r7 = 46
            java.lang.String r7 = HJ.C15854t.o1(r10, r7, r8, r12, r8)
            int r8 = r7.length()
            if (r8 != 0) goto L_0x00e7
            r7 = r17
            goto L_0x00eb
        L_0x00e7:
            java.lang.String r7 = HJ.C15854t.P0(r7, r6)
        L_0x00eb:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r8 = 1
            boolean r6 = HJ.C15854t.b0(r6, r14, r8)
            if (r6 == 0) goto L_0x00fd
            r12 = r16
            goto L_0x00ff
        L_0x00fd:
            r12 = r19
        L_0x00ff:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r12)
            r6.append(r11)
            r6.append(r7)
            java.lang.String r8 = r6.toString()
        L_0x0111:
            r6 = r8
            r10 = 0
            r7 = r9
            r8 = r3
            r9 = r6
            r11 = 0
            r12 = r15
            r7.a(r8, r9, r10, r11, r12)
            r8 = r6
            r7 = r15
            r9 = r18
            r6 = 1
            r14 = 0
            goto L_0x0093
        L_0x0123:
            r19 = r12
        L_0x0125:
            tw.g r10 = r0.f119679b
            java.lang.String r10 = r10.i()
            tw.g r12 = r0.f119679b
            java.lang.String r12 = r12.a()
            boolean r15 = HJ.C15854t.v0(r10)
            if (r15 != 0) goto L_0x0179
            boolean r15 = HJ.C15854t.v0(r12)
            if (r15 == 0) goto L_0x013e
            goto L_0x0179
        L_0x013e:
            com.ingka.ikea.reassurance.impl.network.b$a r6 = r26.c()
            r2.f119680c = r0
            r2.f119681d = r1
            r2.f119682e = r10
            r2.f119683f = r12
            r2.f119684g = r0
            r2.f119685h = r3
            r2.f119686i = r7
            r2.f119687j = r8
            r2.f119688k = r13
            r2.f119689l = r5
            r2.f119690m = r9
            r1 = 0
            r2.f119691n = r1
            r2.f119692o = r1
            r2.f119693p = r1
            r2.f119694q = r1
            r2.f119695r = r1
            r1 = 1
            r2.f119698u = r1
            java.lang.Object r3 = r6.a(r2)
            if (r3 != r4) goto L_0x016d
            return r4
        L_0x016d:
            r1 = r0
        L_0x016e:
            com.ingka.ikea.reassurance.impl.network.ReassuranceModel r3 = (com.ingka.ikea.reassurance.impl.network.ReassuranceModel) r3
            cy.d r2 = r1.d(r3)
            java.util.List r1 = r1.b(r2)
            return r1
        L_0x0179:
            qv.e r1 = qv.e.WARN
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x018c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01a4
            java.lang.Object r4 = r2.next()
            r5 = r4
            qv.b r5 = (qv.C11819b) r5
            r7 = 0
            boolean r5 = r5.b(r1, r7)
            if (r5 == 0) goto L_0x018c
            r3.add(r4)
            goto L_0x018c
        L_0x01a4:
            java.util.Iterator r2 = r3.iterator()
            r3 = 0
            r8 = 0
        L_0x01aa:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0226
            java.lang.Object r4 = r2.next()
            r20 = r4
            qv.b r20 = (qv.C11819b) r20
            r4 = 0
            if (r8 != 0) goto L_0x01c8
            java.lang.String r5 = "Unable to get reassurance, no market set"
            java.lang.String r5 = qv.C11818a.a(r5, r4)
            if (r5 == 0) goto L_0x0226
            java.lang.String r5 = qv.C11820c.a(r5)
            r8 = r5
        L_0x01c8:
            if (r3 != 0) goto L_0x0211
            java.lang.String r3 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            r5 = 0
            r7 = 36
            r9 = 2
            java.lang.String r10 = HJ.C15854t.s1(r3, r7, r5, r9, r5)
            r12 = 46
            java.lang.String r10 = HJ.C15854t.o1(r10, r12, r5, r9, r5)
            int r13 = r10.length()
            if (r13 != 0) goto L_0x01e6
            goto L_0x01ea
        L_0x01e6:
            java.lang.String r3 = HJ.C15854t.P0(r10, r6)
        L_0x01ea:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r10 = r10.getName()
            r13 = 1
            boolean r10 = HJ.C15854t.b0(r10, r14, r13)
            if (r10 == 0) goto L_0x01fc
            r10 = r16
            goto L_0x01fe
        L_0x01fc:
            r10 = r19
        L_0x01fe:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r10)
            r15.append(r11)
            r15.append(r3)
            java.lang.String r3 = r15.toString()
            goto L_0x0218
        L_0x0211:
            r5 = 0
            r7 = 36
            r9 = 2
            r12 = 46
            r13 = 1
        L_0x0218:
            r23 = 0
            r21 = r1
            r22 = r3
            r24 = r4
            r25 = r8
            r20.a(r21, r22, r23, r24, r25)
            goto L_0x01aa
        L_0x0226:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Unable to get reassurance"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.reassurance.impl.network.b.a(dI.e):java.lang.Object");
    }
}
