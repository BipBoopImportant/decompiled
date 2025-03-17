package com.ingka.ikea.assemblyservice.impl.data.network;

import com.ingka.ikea.assemblyservice.impl.data.network.a;
import dI.C17164e;
import gm.C11312a;
import gm.C11313b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/assemblyservice/impl/data/network/b;", "Lcom/ingka/ikea/assemblyservice/impl/data/network/a;", "Lgm/a;", "mapper", "Lgm/b;", "errorMapper", "Lcom/ingka/ikea/assemblyservice/impl/data/network/AssemblyEndpoint;", "endpoint", "<init>", "(Lgm/a;Lgm/b;Lcom/ingka/ikea/assemblyservice/impl/data/network/AssemblyEndpoint;)V", "", "zipCode", "", "Lcom/ingka/ikea/assemblyservice/impl/data/network/a$a;", "items", "Lfm/a;", "a", "(Ljava/lang/String;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "Lgm/a;", "b", "Lgm/b;", "c", "Lcom/ingka/ikea/assemblyservice/impl/data/network/AssemblyEndpoint;", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final C11312a f93051a;

    /* renamed from: b  reason: collision with root package name */
    private final C11313b f93052b;

    /* renamed from: c  reason: collision with root package name */
    private final AssemblyEndpoint f93053c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.assemblyservice.impl.data.network.AssemblyServiceRemoteSourceImpl", f = "AssemblyServiceRemoteSourceImpl.kt", l = {24}, m = "fetchAssemblyServiceDetails")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f93054c;

        /* renamed from: d  reason: collision with root package name */
        Object f93055d;

        /* renamed from: e  reason: collision with root package name */
        Object f93056e;

        /* renamed from: f  reason: collision with root package name */
        Object f93057f;

        /* renamed from: g  reason: collision with root package name */
        Object f93058g;

        /* renamed from: h  reason: collision with root package name */
        Object f93059h;

        /* renamed from: i  reason: collision with root package name */
        Object f93060i;

        /* renamed from: j  reason: collision with root package name */
        Object f93061j;

        /* renamed from: k  reason: collision with root package name */
        Object f93062k;

        /* renamed from: l  reason: collision with root package name */
        Object f93063l;

        /* renamed from: m  reason: collision with root package name */
        Object f93064m;

        /* renamed from: n  reason: collision with root package name */
        Object f93065n;

        /* renamed from: o  reason: collision with root package name */
        Object f93066o;

        /* renamed from: p  reason: collision with root package name */
        int f93067p;

        /* renamed from: q  reason: collision with root package name */
        int f93068q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f93069r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ b f93070s;

        /* renamed from: t  reason: collision with root package name */
        int f93071t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f93070s = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f93069r = obj;
            this.f93071t |= Integer.MIN_VALUE;
            return this.f93070s.a((String) null, (List<a.C2069a>) null, this);
        }
    }

    public b(C11312a aVar, C11313b bVar, AssemblyEndpoint assemblyEndpoint) {
        C17542s.j(aVar, "mapper");
        C17542s.j(bVar, "errorMapper");
        C17542s.j(assemblyEndpoint, "endpoint");
        this.f93051a = aVar;
        this.f93052b = bVar;
        this.f93053c = assemblyEndpoint;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r13, java.util.List<com.ingka.ikea.assemblyservice.impl.data.network.a.C2069a> r14, dI.C17164e<? super fm.C11273a> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.ingka.ikea.assemblyservice.impl.data.network.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.ingka.ikea.assemblyservice.impl.data.network.b$a r0 = (com.ingka.ikea.assemblyservice.impl.data.network.b.a) r0
            int r1 = r0.f93071t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f93071t = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.assemblyservice.impl.data.network.b$a r0 = new com.ingka.ikea.assemblyservice.impl.data.network.b$a
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f93069r
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f93071t
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0066
            if (r3 != r5) goto L_0x005e
            java.lang.Object r13 = r0.f93066o
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r0.f93065n
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r13 = r0.f93064m
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r13 = r0.f93063l
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r0.f93062k
            com.ingka.ikea.assemblyservice.impl.data.network.AssemblyEndpoint r13 = (com.ingka.ikea.assemblyservice.impl.data.network.AssemblyEndpoint) r13
            java.lang.Object r13 = r0.f93061j
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r13 = r0.f93060i
            java.util.Collection r13 = (java.util.Collection) r13
            java.lang.Object r13 = r0.f93059h
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r13 = r0.f93058g
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r13 = r0.f93057f
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f93056e
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r13 = r0.f93055d
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r0.f93054c
            com.ingka.ikea.assemblyservice.impl.data.network.b r13 = (com.ingka.ikea.assemblyservice.impl.data.network.b) r13
            XH.y.b(r1)
            goto L_0x00c7
        L_0x005e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0066:
            XH.y.b(r1)
            com.ingka.ikea.assemblyservice.impl.data.network.AssemblyEndpoint r1 = r12.f93053c
            r3 = r14
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = YH.C16877v.y(r3, r7)
            r6.<init>(r7)
            java.util.Iterator r7 = r3.iterator()
        L_0x007d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x009a
            java.lang.Object r8 = r7.next()
            com.ingka.ikea.assemblyservice.impl.data.network.a$a r8 = (com.ingka.ikea.assemblyservice.impl.data.network.a.C2069a) r8
            com.ingka.ikea.assemblyservice.impl.data.network.AssemblyEndpoint$AssemblyRequestBody$RequestItem r9 = new com.ingka.ikea.assemblyservice.impl.data.network.AssemblyEndpoint$AssemblyRequestBody$RequestItem
            java.lang.String r10 = r8.a()
            int r8 = r8.b()
            r9.<init>(r10, r8)
            r6.add(r9)
            goto L_0x007d
        L_0x009a:
            com.ingka.ikea.assemblyservice.impl.data.network.AssemblyEndpoint$AssemblyRequestBody r8 = new com.ingka.ikea.assemblyservice.impl.data.network.AssemblyEndpoint$AssemblyRequestBody
            r8.<init>(r13, r6)
            r0.f93054c = r12
            r0.f93055d = r13
            r0.f93056e = r14
            r0.f93057f = r15
            r0.f93058g = r3
            r0.f93059h = r3
            r0.f93060i = r6
            r0.f93061j = r7
            r0.f93062k = r1
            r0.f93063l = r13
            r0.f93064m = r6
            r0.f93065n = r6
            r0.f93066o = r13
            r0.f93067p = r4
            r0.f93068q = r4
            r0.f93071t = r5
            java.lang.Object r1 = r1.a(r8, r0)
            if (r1 != r2) goto L_0x00c6
            return r2
        L_0x00c6:
            r13 = r12
        L_0x00c7:
            QL.x r1 = (QL.x) r1
            boolean r14 = r1.e()
            if (r14 == 0) goto L_0x00e3
            java.lang.Object r14 = r1.a()
            com.ingka.ikea.assemblyservice.impl.data.network.model.AssemblyServiceDetailsRemote r14 = (com.ingka.ikea.assemblyservice.impl.data.network.model.AssemblyServiceDetailsRemote) r14
            if (r14 == 0) goto L_0x00e0
            gm.a r13 = r13.f93051a
            fm.a r13 = r13.a(r14)
            if (r13 == 0) goto L_0x00e0
            return r13
        L_0x00e0:
            com.ingka.ikea.assemblyservice.impl.data.network.a$b$a r13 = com.ingka.ikea.assemblyservice.impl.data.network.a.b.C2070a.f93049a
            throw r13
        L_0x00e3:
            r14 = 0
            GK.E r15 = r1.d()     // Catch:{ Exception -> 0x0105 }
            if (r15 == 0) goto L_0x01a8
            java.lang.String r15 = r15.l()     // Catch:{ Exception -> 0x0105 }
            if (r15 == 0) goto L_0x01a8
            Yz.b r0 = Yz.b.f118278a     // Catch:{ Exception -> 0x0105 }
            kK.c r0 = r0.b()     // Catch:{ Exception -> 0x0105 }
            r0.a()     // Catch:{ Exception -> 0x0105 }
            com.ingka.ikea.assemblyservice.impl.data.network.model.AssemblyServiceErrorRemote$a r1 = com.ingka.ikea.assemblyservice.impl.data.network.model.AssemblyServiceErrorRemote.Companion     // Catch:{ Exception -> 0x0105 }
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch:{ Exception -> 0x0105 }
            java.lang.Object r14 = r0.c(r1, r15)     // Catch:{ Exception -> 0x0105 }
            goto L_0x01a8
        L_0x0105:
            r15 = move-exception
            qv.e r0 = qv.e.DEBUG
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0119:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0130
            java.lang.Object r3 = r1.next()
            r6 = r3
            qv.b r6 = (qv.C11819b) r6
            boolean r6 = r6.b(r0, r4)
            if (r6 == 0) goto L_0x0119
            r2.add(r3)
            goto L_0x0119
        L_0x0130:
            java.util.Iterator r1 = r2.iterator()
            r2 = r14
            r3 = r2
        L_0x0136:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01a8
            java.lang.Object r4 = r1.next()
            r6 = r4
            qv.b r6 = (qv.C11819b) r6
            if (r2 != 0) goto L_0x0151
            java.lang.String r2 = "Exception when parsing errorBody"
            java.lang.String r2 = qv.C11818a.a(r2, r15)
            if (r2 == 0) goto L_0x01a8
            java.lang.String r2 = qv.C11820c.a(r2)
        L_0x0151:
            if (r3 != 0) goto L_0x019f
            java.lang.Class<QL.x> r3 = QL.x.class
            java.lang.String r3 = r3.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            r4 = 36
            r7 = 2
            java.lang.String r4 = HJ.C15854t.s1(r3, r4, r14, r7, r14)
            r8 = 46
            java.lang.String r4 = HJ.C15854t.o1(r4, r8, r14, r7, r14)
            int r7 = r4.length()
            if (r7 != 0) goto L_0x0170
            goto L_0x0176
        L_0x0170:
            java.lang.String r3 = "Kt"
            java.lang.String r3 = HJ.C15854t.P0(r4, r3)
        L_0x0176:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.String r7 = "main"
            boolean r4 = HJ.C15854t.b0(r4, r7, r5)
            if (r4 == 0) goto L_0x0189
            java.lang.String r4 = "m"
            goto L_0x018b
        L_0x0189:
            java.lang.String r4 = "b"
        L_0x018b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = "|"
            r7.append(r4)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
        L_0x019f:
            r9 = 0
            r7 = r0
            r8 = r3
            r10 = r15
            r11 = r2
            r6.a(r7, r8, r9, r10, r11)
            goto L_0x0136
        L_0x01a8:
            com.ingka.ikea.assemblyservice.impl.data.network.model.AssemblyServiceErrorRemote r14 = (com.ingka.ikea.assemblyservice.impl.data.network.model.AssemblyServiceErrorRemote) r14
            gm.b r13 = r13.f93052b
            com.ingka.ikea.assemblyservice.impl.data.network.a$b r13 = r13.a(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.assemblyservice.impl.data.network.b.a(java.lang.String, java.util.List, dI.e):java.lang.Object");
    }
}
