package pz;

import HJ.C15854t;
import QL.x;
import XH.C16807N;
import XH.y;
import com.ingka.ikea.scanandgo.datalayer.impl.settings.datasource.remote.ScanAndGoSettingsRemote;
import com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nz.C14866a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fJ8\u0010\u0013\u001a\u0004\u0018\u00010\n2$\u0010\u0012\u001a \b\u0001\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00110\rH@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u0015\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lpz/c;", "Lpz/b;", "Lpz/a;", "endpoint", "Lnz/a;", "dataSourceMapper", "<init>", "(Lpz/a;Lnz/a;)V", "", "storeId", "Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;", "d", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lkotlin/Function1;", "LdI/e;", "LQL/x;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/settings/datasource/remote/ScanAndGoSettingsRemote;", "", "block", "e", "(LnI/l;LdI/e;)Ljava/lang/Object;", "a", "Lpz/a;", "b", "Lnz/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C14929a f130358a;

    /* renamed from: b  reason: collision with root package name */
    private final C14866a f130359b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQL/x;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/settings/datasource/remote/ScanAndGoSettingsRemote;", "<anonymous>", "()LQL/x;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.settings.datasource.remote.ScanAndGoSettingsRemoteDataSourceImpl$fetchAndParseSettings$3", f = "ScanAndGoSettingsRemoteDataSource.kt", l = {47}, m = "invokeSuspend")
    static final class a extends l implements C17642l<C17164e<? super x<ScanAndGoSettingsRemote>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f130360c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f130361d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f130362e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, String str, C17164e<? super a> eVar) {
            super(1, eVar);
            this.f130361d = cVar;
            this.f130362e = str;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new a(this.f130361d, this.f130362e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super x<ScanAndGoSettingsRemote>> eVar) {
            return ((a) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f130360c;
            if (i10 == 0) {
                y.b(obj);
                C14929a b10 = this.f130361d.f130358a;
                String str = this.f130362e;
                this.f130360c = 1;
                obj = b10.a(str, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.settings.datasource.remote.ScanAndGoSettingsRemoteDataSourceImpl", f = "ScanAndGoSettingsRemoteDataSource.kt", l = {34}, m = "fetchScanAndGoSettings")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f130363c;

        /* renamed from: d  reason: collision with root package name */
        Object f130364d;

        /* renamed from: e  reason: collision with root package name */
        Object f130365e;

        /* renamed from: f  reason: collision with root package name */
        Object f130366f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f130367g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f130368h;

        /* renamed from: i  reason: collision with root package name */
        int f130369i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f130368h = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f130367g = obj;
            this.f130369i |= Integer.MIN_VALUE;
            return this.f130368h.a((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.settings.datasource.remote.ScanAndGoSettingsRemoteDataSourceImpl", f = "ScanAndGoSettingsRemoteDataSource.kt", l = {55}, m = "parseResult")
    /* renamed from: pz.c$c  reason: collision with other inner class name */
    static final class C3219c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f130370c;

        /* renamed from: d  reason: collision with root package name */
        Object f130371d;

        /* renamed from: e  reason: collision with root package name */
        Object f130372e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f130373f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f130374g;

        /* renamed from: h  reason: collision with root package name */
        int f130375h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3219c(c cVar, C17164e<? super C3219c> eVar) {
            super(eVar);
            this.f130374g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f130373f = obj;
            this.f130375h |= Integer.MIN_VALUE;
            return this.f130374g.e((C17642l<? super C17164e<? super x<ScanAndGoSettingsRemote>>, ? extends Object>) null, this);
        }
    }

    public c(C14929a aVar, C14866a aVar2) {
        C17542s.j(aVar, "endpoint");
        C17542s.j(aVar2, "dataSourceMapper");
        this.f130358a = aVar;
        this.f130359b = aVar2;
    }

    private final Object d(String str, C17164e<? super ScanAndGoSettings> eVar) {
        if (str.length() != 0) {
            return e(new a(this, str, (C17164e<? super a>) null), eVar);
        }
        IllegalStateException illegalStateException = new IllegalStateException();
        e eVar2 = e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar2, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Tried to call settings api with empty storeID", illegalStateException);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = c.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar2, str5, false, illegalStateException, str4);
            str2 = str4;
            str3 = str5;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(nI.C17642l<? super dI.C17164e<? super QL.x<com.ingka.ikea.scanandgo.datalayer.impl.settings.datasource.remote.ScanAndGoSettingsRemote>>, ? extends java.lang.Object> r6, dI.C17164e<? super com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof pz.c.C3219c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            pz.c$c r0 = (pz.c.C3219c) r0
            int r1 = r0.f130375h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f130375h = r1
            goto L_0x0018
        L_0x0013:
            pz.c$c r0 = new pz.c$c
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f130373f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f130375h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f130372e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f130371d
            nI.l r6 = (nI.C17642l) r6
            java.lang.Object r6 = r0.f130370c
            pz.c r6 = (pz.c) r6
            XH.y.b(r1)
            goto L_0x004f
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            r0.f130370c = r5
            r0.f130371d = r6
            r0.f130372e = r7
            r0.f130375h = r4
            java.lang.Object r1 = r6.invoke(r0)
            if (r1 != r2) goto L_0x004f
            return r2
        L_0x004f:
            QL.x r1 = (QL.x) r1
            boolean r6 = r1.e()
            r7 = 0
            if (r6 == 0) goto L_0x0064
            java.lang.Object r6 = r1.a()
            com.ingka.ikea.scanandgo.datalayer.impl.settings.datasource.remote.ScanAndGoSettingsRemote r6 = (com.ingka.ikea.scanandgo.datalayer.impl.settings.datasource.remote.ScanAndGoSettingsRemote) r6
            if (r6 == 0) goto L_0x0064
            com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r7 = r6.toLocal()
        L_0x0064:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pz.c.e(nI.l, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r7, dI.C17164e<? super com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof pz.c.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            pz.c$b r0 = (pz.c.b) r0
            int r1 = r0.f130369i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f130369i = r1
            goto L_0x0018
        L_0x0013:
            pz.c$b r0 = new pz.c$b
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f130367g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f130369i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r7 = r0.f130366f
            nz.a r7 = (nz.C14866a) r7
            java.lang.Object r8 = r0.f130365e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f130364d
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.f130363c
            pz.c r8 = (pz.c) r8
            XH.y.b(r1)
            goto L_0x005a
        L_0x0039:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0041:
            XH.y.b(r1)
            nz.a r1 = r6.f130359b
            r0.f130363c = r6
            r0.f130364d = r7
            r0.f130365e = r8
            r0.f130366f = r1
            r0.f130369i = r4
            java.lang.Object r7 = r6.d(r7, r0)
            if (r7 != r2) goto L_0x0057
            return r2
        L_0x0057:
            r5 = r1
            r1 = r7
            r7 = r5
        L_0x005a:
            com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r1 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r1
            com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r7 = r7.a(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pz.c.a(java.lang.String, dI.e):java.lang.Object");
    }
}
