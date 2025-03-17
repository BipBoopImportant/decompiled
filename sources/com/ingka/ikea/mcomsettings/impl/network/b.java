package com.ingka.ikea.mcomsettings.impl.network;

import HJ.C15854t;
import VL.C16704f;
import VL.C16709k;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dp.C11216a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import tw.g;
import tw.h;
import vv.C12270c;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/b;", "Lcom/ingka/ikea/mcomsettings/impl/network/a;", "Ltw/h;", "networkService", "Ltw/g;", "networkParameters", "<init>", "(Ltw/h;Ltw/g;)V", "Lcom/ingka/ikea/mcomsettings/impl/network/ConfigModel;", "configModel", "", "retailCode", "languageCode", "Lvv/c;", "c", "(Lcom/ingka/ikea/mcomsettings/impl/network/ConfigModel;Ljava/lang/String;Ljava/lang/String;)Lvv/c;", "a", "(LdI/e;)Ljava/lang/Object;", "Ltw/h;", "b", "Ltw/g;", "Lcom/ingka/ikea/mcomsettings/impl/network/b$a;", "()Lcom/ingka/ikea/mcomsettings/impl/network/b$a;", "endpoint", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final h f96736a;

    /* renamed from: b  reason: collision with root package name */
    private final g f96737b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/b$a;", "", "Lcom/ingka/ikea/mcomsettings/impl/network/ConfigModel;", "a", "(LdI/e;)Ljava/lang/Object;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private interface a {
        @C11216a
        @C16709k({"Content-Type: application/json"})
        @C16704f("configuration/v6/{cc}/{lc}/marketsettings/mcommerce")
        Object a(C17164e<? super ConfigModel> eVar);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.mcomsettings.impl.network.MComConfigRemoteDataSourceImpl", f = "MComConfigRemoteDataSourceImpl.kt", l = {37}, m = "getRemoteConfig")
    /* renamed from: com.ingka.ikea.mcomsettings.impl.network.b$b  reason: collision with other inner class name */
    static final class C2140b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f96738c;

        /* renamed from: d  reason: collision with root package name */
        Object f96739d;

        /* renamed from: e  reason: collision with root package name */
        Object f96740e;

        /* renamed from: f  reason: collision with root package name */
        Object f96741f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f96742g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f96743h;

        /* renamed from: i  reason: collision with root package name */
        int f96744i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2140b(b bVar, C17164e<? super C2140b> eVar) {
            super(eVar);
            this.f96743h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f96742g = obj;
            this.f96744i |= Integer.MIN_VALUE;
            return this.f96743h.a(this);
        }
    }

    public b(h hVar, g gVar) {
        C17542s.j(hVar, "networkService");
        C17542s.j(gVar, "networkParameters");
        this.f96736a = hVar;
        this.f96737b = gVar;
    }

    private final a b() {
        return (a) this.f96736a.b(a.class);
    }

    private final C12270c c(ConfigModel configModel, String str, String str2) {
        C12270c b10 = configModel.b(str, str2);
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str3 = null;
        String str4 = null;
        for (C11819b bVar : arrayList) {
            if (str3 == null) {
                String a10 = C11818a.a("Response: " + configModel, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str3 = C11820c.a(a10);
            }
            String str5 = str3;
            if (str4 == null) {
                String name = b.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str6 = str4;
            bVar.a(eVar, str6, false, (Throwable) null, str5);
            str3 = str5;
            str4 = str6;
        }
        return b10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super vv.C12270c> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.ingka.ikea.mcomsettings.impl.network.b.C2140b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.ingka.ikea.mcomsettings.impl.network.b$b r0 = (com.ingka.ikea.mcomsettings.impl.network.b.C2140b) r0
            int r1 = r0.f96744i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f96744i = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.mcomsettings.impl.network.b$b r0 = new com.ingka.ikea.mcomsettings.impl.network.b$b
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f96742g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f96744i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r7 = r0.f96741f
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r0.f96740e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.f96739d
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r0 = r0.f96738c
            com.ingka.ikea.mcomsettings.impl.network.b r0 = (com.ingka.ikea.mcomsettings.impl.network.b) r0
            XH.y.b(r1)
            goto L_0x0069
        L_0x0039:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0041:
            XH.y.b(r1)
            tw.g r1 = r6.f96737b
            java.lang.String r1 = r1.i()
            tw.g r3 = r6.f96737b
            java.lang.String r3 = r3.a()
            com.ingka.ikea.mcomsettings.impl.network.b$a r5 = r6.b()
            r0.f96738c = r6
            r0.f96739d = r7
            r0.f96740e = r1
            r0.f96741f = r3
            r0.f96744i = r4
            java.lang.Object r7 = r5.a(r0)
            if (r7 != r2) goto L_0x0065
            return r2
        L_0x0065:
            r0 = r6
            r2 = r1
            r1 = r7
            r7 = r3
        L_0x0069:
            com.ingka.ikea.mcomsettings.impl.network.ConfigModel r1 = (com.ingka.ikea.mcomsettings.impl.network.ConfigModel) r1
            vv.c r7 = r0.c(r1, r2, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.mcomsettings.impl.network.b.a(dI.e):java.lang.Object");
    }
}
