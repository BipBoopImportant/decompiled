package com.ingka.ikea.pushnotification.impl.repo.network;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import tw.h;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/pushnotification/impl/repo/network/c;", "Lcom/ingka/ikea/pushnotification/impl/repo/network/b;", "Ltw/h;", "secureNetworkService", "<init>", "(Ltw/h;)V", "", "clientId", "fcmToken", "buildType", "LXH/N;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Ltw/h;", "Lcom/ingka/ikea/pushnotification/impl/repo/network/a;", "b", "()Lcom/ingka/ikea/pushnotification/impl/repo/network/a;", "endpoint", "pushnotification-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final h f119615a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.pushnotification.impl.repo.network.NotificationRemoteDataSourceImpl", f = "NotificationRemoteDataSourceImpl.kt", l = {31}, m = "registerDeviceWithToken")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f119616c;

        /* renamed from: d  reason: collision with root package name */
        Object f119617d;

        /* renamed from: e  reason: collision with root package name */
        Object f119618e;

        /* renamed from: f  reason: collision with root package name */
        Object f119619f;

        /* renamed from: g  reason: collision with root package name */
        Object f119620g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f119621h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ c f119622i;

        /* renamed from: j  reason: collision with root package name */
        int f119623j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f119622i = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f119621h = obj;
            this.f119623j |= Integer.MIN_VALUE;
            return this.f119622i.a((String) null, (String) null, (String) null, this);
        }
    }

    public c(h hVar) {
        C17542s.j(hVar, "secureNetworkService");
        this.f119615a = hVar;
    }

    private final a b() {
        return (a) this.f119615a.b(a.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r6, java.lang.String r7, java.lang.String r8, dI.C17164e<? super XH.C16807N> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.ingka.ikea.pushnotification.impl.repo.network.c.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.ingka.ikea.pushnotification.impl.repo.network.c$a r0 = (com.ingka.ikea.pushnotification.impl.repo.network.c.a) r0
            int r1 = r0.f119623j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f119623j = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.pushnotification.impl.repo.network.c$a r0 = new com.ingka.ikea.pushnotification.impl.repo.network.c$a
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f119621h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f119623j
            r4 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            java.lang.Object r6 = r0.f119620g
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f119619f
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f119618e
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f119617d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f119616c
            com.ingka.ikea.pushnotification.impl.repo.network.c r6 = (com.ingka.ikea.pushnotification.impl.repo.network.c) r6
            XH.y.b(r1)
            goto L_0x0064
        L_0x003d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0045:
            XH.y.b(r1)
            com.ingka.ikea.pushnotification.impl.repo.network.a r1 = r5.b()
            com.ingka.ikea.pushnotification.impl.repo.network.FCMTokenBody r3 = new com.ingka.ikea.pushnotification.impl.repo.network.FCMTokenBody
            r3.<init>(r7, r8)
            r0.f119616c = r5
            r0.f119617d = r6
            r0.f119618e = r7
            r0.f119619f = r8
            r0.f119620g = r9
            r0.f119623j = r4
            java.lang.Object r1 = r1.a(r6, r3, r0)
            if (r1 != r2) goto L_0x0064
            return r2
        L_0x0064:
            QL.x r1 = (QL.x) r1
            boolean r6 = r1.e()
            if (r6 == 0) goto L_0x006f
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x006f:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Could not register token"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.pushnotification.impl.repo.network.c.a(java.lang.String, java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }
}
