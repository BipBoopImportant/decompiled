package com.ingka.ikea.zipselector.impl.network;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import lE.C14765b;
import lE.C14766c;
import tw.h;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/zipselector/impl/network/a;", "LlE/c;", "Ltw/h;", "networkService", "<init>", "(Ltw/h;)V", "T", "LQL/x;", "Lcom/ingka/ikea/zipselector/impl/network/StateLookupApiError;", "c", "(LQL/x;)Lcom/ingka/ikea/zipselector/impl/network/StateLookupApiError;", "", "postalCode", "", "LlE/a;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Ltw/h;", "LlE/b;", "b", "()LlE/b;", "endpoint", "zipselector-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements C14766c {

    /* renamed from: a  reason: collision with root package name */
    private final h f120748a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.zipselector.impl.network.StateLookupRemoteDataSourceImpl", f = "StateLookupRemoteDataSourceImpl.kt", l = {36}, m = "fetchStates")
    /* renamed from: com.ingka.ikea.zipselector.impl.network.a$a  reason: collision with other inner class name */
    static final class C3011a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f120749c;

        /* renamed from: d  reason: collision with root package name */
        Object f120750d;

        /* renamed from: e  reason: collision with root package name */
        Object f120751e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f120752f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f120753g;

        /* renamed from: h  reason: collision with root package name */
        int f120754h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3011a(a aVar, C17164e<? super C3011a> eVar) {
            super(eVar);
            this.f120753g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f120752f = obj;
            this.f120754h |= Integer.MIN_VALUE;
            return this.f120753g.a((String) null, this);
        }
    }

    public a(h hVar) {
        C17542s.j(hVar, "networkService");
        this.f120748a = hVar;
    }

    private final C14765b b() {
        return (C14765b) this.f120748a.b(C14765b.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> com.ingka.ikea.zipselector.impl.network.StateLookupApiError c(QL.x<T> r14) {
        /*
            r13 = this;
            r0 = 0
            GK.E r1 = r14.d()     // Catch:{ Exception -> 0x0022 }
            if (r1 == 0) goto L_0x00cf
            java.lang.String r1 = r1.l()     // Catch:{ Exception -> 0x0022 }
            if (r1 == 0) goto L_0x00cf
            Yz.b r2 = Yz.b.f118278a     // Catch:{ Exception -> 0x0022 }
            kK.c r2 = r2.b()     // Catch:{ Exception -> 0x0022 }
            r2.a()     // Catch:{ Exception -> 0x0022 }
            com.ingka.ikea.zipselector.impl.network.StateLookupApiError$Remote$a r3 = com.ingka.ikea.zipselector.impl.network.StateLookupApiError.Remote.Companion     // Catch:{ Exception -> 0x0022 }
            kotlinx.serialization.KSerializer r3 = r3.serializer()     // Catch:{ Exception -> 0x0022 }
            java.lang.Object r14 = r2.c(r3, r1)     // Catch:{ Exception -> 0x0022 }
            goto L_0x00d0
        L_0x0022:
            r1 = move-exception
            qv.e r8 = qv.e.DEBUG
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0036:
            boolean r4 = r2.hasNext()
            r9 = 0
            if (r4 == 0) goto L_0x004e
            java.lang.Object r4 = r2.next()
            r5 = r4
            qv.b r5 = (qv.C11819b) r5
            boolean r5 = r5.b(r8, r9)
            if (r5 == 0) goto L_0x0036
            r3.add(r4)
            goto L_0x0036
        L_0x004e:
            java.util.Iterator r10 = r3.iterator()
            r2 = r0
            r3 = r2
        L_0x0054:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x00cf
            java.lang.Object r4 = r10.next()
            qv.b r4 = (qv.C11819b) r4
            if (r2 != 0) goto L_0x0070
            java.lang.String r2 = "Exception when parsing errorBody"
            java.lang.String r2 = qv.C11818a.a(r2, r1)
            if (r2 != 0) goto L_0x006c
            goto L_0x00cf
        L_0x006c:
            java.lang.String r2 = qv.C11820c.a(r2)
        L_0x0070:
            r11 = r2
            if (r3 != 0) goto L_0x00c2
            java.lang.Class r2 = r14.getClass()
            java.lang.String r2 = r2.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r3 = 36
            r5 = 2
            java.lang.String r3 = HJ.C15854t.s1(r2, r3, r0, r5, r0)
            r6 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r6, r0, r5, r0)
            int r5 = r3.length()
            if (r5 != 0) goto L_0x0092
            goto L_0x0098
        L_0x0092:
            java.lang.String r2 = "Kt"
            java.lang.String r2 = HJ.C15854t.P0(r3, r2)
        L_0x0098:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.String r5 = "main"
            r6 = 1
            boolean r3 = HJ.C15854t.b0(r3, r5, r6)
            if (r3 == 0) goto L_0x00ac
            java.lang.String r3 = "m"
            goto L_0x00ae
        L_0x00ac:
            java.lang.String r3 = "b"
        L_0x00ae:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = "|"
            r5.append(r3)
            r5.append(r2)
            java.lang.String r3 = r5.toString()
        L_0x00c2:
            r12 = r3
            r2 = r4
            r3 = r8
            r4 = r12
            r5 = r9
            r6 = r1
            r7 = r11
            r2.a(r3, r4, r5, r6, r7)
            r2 = r11
            r3 = r12
            goto L_0x0054
        L_0x00cf:
            r14 = r0
        L_0x00d0:
            com.ingka.ikea.zipselector.impl.network.StateLookupApiError$Remote r14 = (com.ingka.ikea.zipselector.impl.network.StateLookupApiError.Remote) r14
            if (r14 == 0) goto L_0x00d8
            java.lang.String r0 = r14.a()
        L_0x00d8:
            if (r0 == 0) goto L_0x00e7
            boolean r14 = HJ.C15854t.v0(r0)
            if (r14 == 0) goto L_0x00e1
            goto L_0x00e7
        L_0x00e1:
            com.ingka.ikea.zipselector.impl.network.StateLookupApiError$a r14 = new com.ingka.ikea.zipselector.impl.network.StateLookupApiError$a
            r14.<init>(r0)
            goto L_0x00e9
        L_0x00e7:
            com.ingka.ikea.zipselector.impl.network.StateLookupApiError$b r14 = com.ingka.ikea.zipselector.impl.network.StateLookupApiError.b.f120747a
        L_0x00e9:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.zipselector.impl.network.a.c(QL.x):com.ingka.ikea.zipselector.impl.network.StateLookupApiError");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r6, dI.C17164e<? super java.util.List<lE.C14764a>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.ingka.ikea.zipselector.impl.network.a.C3011a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.ingka.ikea.zipselector.impl.network.a$a r0 = (com.ingka.ikea.zipselector.impl.network.a.C3011a) r0
            int r1 = r0.f120754h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f120754h = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.zipselector.impl.network.a$a r0 = new com.ingka.ikea.zipselector.impl.network.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f120752f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f120754h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f120751e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f120750d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f120749c
            com.ingka.ikea.zipselector.impl.network.a r6 = (com.ingka.ikea.zipselector.impl.network.a) r6
            XH.y.b(r1)
            goto L_0x0059
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            lE.b r1 = r5.b()
            com.ingka.ikea.zipselector.impl.network.RequestStatedBody r3 = new com.ingka.ikea.zipselector.impl.network.RequestStatedBody
            r3.<init>(r6)
            r0.f120749c = r5
            r0.f120750d = r6
            r0.f120751e = r7
            r0.f120754h = r4
            java.lang.Object r1 = r1.a(r3, r0)
            if (r1 != r2) goto L_0x0058
            return r2
        L_0x0058:
            r6 = r5
        L_0x0059:
            QL.x r1 = (QL.x) r1
            boolean r7 = r1.e()
            if (r7 == 0) goto L_0x008e
            java.lang.Object r6 = r1.a()
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x008b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0074:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x008a
            java.lang.Object r0 = r6.next()
            com.ingka.ikea.zipselector.impl.network.PostalCodeStateRemote r0 = (com.ingka.ikea.zipselector.impl.network.PostalCodeStateRemote) r0
            lE.a r0 = r0.a()
            if (r0 == 0) goto L_0x0074
            r7.add(r0)
            goto L_0x0074
        L_0x008a:
            return r7
        L_0x008b:
            com.ingka.ikea.zipselector.impl.network.StateLookupApiError$b r6 = com.ingka.ikea.zipselector.impl.network.StateLookupApiError.b.f120747a
            throw r6
        L_0x008e:
            com.ingka.ikea.zipselector.impl.network.StateLookupApiError r6 = r6.c(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.zipselector.impl.network.a.a(java.lang.String, dI.e):java.lang.Object");
    }
}
