package RB;

import EB.C12832d;
import FB.C12860a;
import FB.C12864e;
import HJ.C15854t;
import PB.g;
import RB.C13512i;
import XH.C16807N;
import XH.t;
import XH.x;
import XH.y;
import com.ingka.ikea.store.datalayer.StorageType;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17170k;
import eI.C17187b;
import java.util.ArrayList;
import kD.C14674a;
import kD.C14675b;
import kD.l;
import kD.m;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0018\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0019\u001a\u00020\u00182\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"LRB/j;", "LRB/i;", "LFB/a;", "localStoreSelectionRepository", "LRB/l;", "updateProfileStoreUseCase", "LFB/e;", "storeSelectionMemoryRepository", "LOz/b;", "scanAndGoCleanupUseCase", "<init>", "(LFB/a;LRB/l;LFB/e;LOz/b;)V", "Lcom/ingka/ikea/store/datalayer/StorageType;", "storage", "LEB/d;", "selection", "LXH/N;", "c", "(Lcom/ingka/ikea/store/datalayer/StorageType;LEB/d;LdI/e;)Ljava/lang/Object;", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "LRB/i$a;", "onFailure", "RB/j$b", "b", "(LnI/a;LnI/l;)LRB/j$b;", "LPB/g;", "storeItem", "a", "(Lcom/ingka/ikea/store/datalayer/StorageType;LPB/g;LdI/e;)Ljava/lang/Object;", "LFB/a;", "LRB/l;", "LFB/e;", "d", "LOz/b;", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: RB.j  reason: case insensitive filesystem */
public final class C13513j implements C13512i {

    /* renamed from: a  reason: collision with root package name */
    private final C12860a f115283a;

    /* renamed from: b  reason: collision with root package name */
    private final C13515l f115284b;

    /* renamed from: c  reason: collision with root package name */
    private final C12864e f115285c;

    /* renamed from: d  reason: collision with root package name */
    private final Oz.b f115286d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: RB.j$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f115287a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.ingka.ikea.store.datalayer.StorageType[] r0 = com.ingka.ikea.store.datalayer.StorageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.store.datalayer.StorageType r1 = com.ingka.ikea.store.datalayer.StorageType.PROFILE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.store.datalayer.StorageType r1 = com.ingka.ikea.store.datalayer.StorageType.LOCAL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.store.datalayer.StorageType r1 = com.ingka.ikea.store.datalayer.StorageType.NO_STORAGE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f115287a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: RB.C13513j.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"RB/j$b", "Lkotlin/Function1;", "LkD/l;", "LXH/N;", "Lcom/ingka/ikea/useraccount/model/StateListener;", "state", "a", "(LkD/l;)V", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: RB.j$b */
    public static final class b implements C17642l<l, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f115288a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C13512i.a, C16807N> f115289b;

        b(C17631a<C16807N> aVar, C17642l<? super C13512i.a, C16807N> lVar) {
            this.f115288a = aVar;
            this.f115289b = lVar;
        }

        public void a(l lVar) {
            char c10;
            String str;
            l lVar2 = lVar;
            C17542s.j(lVar2, "state");
            if (C17542s.e(lVar2, m.f128647a)) {
                this.f115288a.invoke();
                return;
            }
            boolean z10 = lVar2 instanceof C14675b;
            String str2 = DslKt.INDICATOR_BACKGROUND;
            Class<b> cls = b.class;
            if (z10) {
                qv.e eVar = qv.e.WARN;
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
                        String a10 = C11818a.a("Save store selection failure " + lVar2, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str3 = C11820c.a(a10);
                    }
                    if (str4 == null) {
                        String name = cls.getName();
                        C17542s.g(name);
                        str = str2;
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name;
                    } else {
                        str = str2;
                    }
                    String str5 = str4;
                    bVar.a(eVar, str5, false, (Throwable) null, str3);
                    str4 = str5;
                    str2 = str;
                }
                this.f115289b.invoke(new C13512i.a());
                return;
            }
            String str6 = str2;
            if (C17542s.e(lVar2, C14674a.f128619a)) {
                qv.e eVar2 = qv.e.WARN;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str7 = null;
                String str8 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str7 == null) {
                        String a11 = C11818a.a("Unable to save store, EmailVerificationNeeded", (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str7 = C11820c.a(a11);
                    }
                    if (str8 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        c10 = 2;
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str6) + DslKt.INDICATOR_SEPARATOR + name2;
                    } else {
                        c10 = 2;
                    }
                    char c11 = c10;
                    bVar2.a(eVar2, str8, false, (Throwable) null, str7);
                }
                this.f115289b.invoke(new C13512i.a());
            } else if (!C17542s.e(lVar2, kD.e.f128625a)) {
                throw new t();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((l) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.store.storepicker.impl.usecase.SaveStoreSelectionUseCaseImpl", f = "SaveStoreSelectionUseCase.kt", l = {55, 56}, m = "save")
    /* renamed from: RB.j$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f115290c;

        /* renamed from: d  reason: collision with root package name */
        Object f115291d;

        /* renamed from: e  reason: collision with root package name */
        Object f115292e;

        /* renamed from: f  reason: collision with root package name */
        Object f115293f;

        /* renamed from: g  reason: collision with root package name */
        Object f115294g;

        /* renamed from: h  reason: collision with root package name */
        Object f115295h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f115296i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C13513j f115297j;

        /* renamed from: k  reason: collision with root package name */
        int f115298k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C13513j jVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f115297j = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f115296i = obj;
            this.f115298k |= Integer.MIN_VALUE;
            return this.f115297j.a((StorageType) null, (g) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: RB.j$d */
    static final class d implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17164e<C16807N> f115299a;

        d(C17164e<? super C16807N> eVar) {
            this.f115299a = eVar;
        }

        public final void a() {
            C17164e<C16807N> eVar = this.f115299a;
            x.a aVar = x.f139812b;
            eVar.resumeWith(x.b(C16807N.f139792a));
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: RB.j$e */
    static final class e implements C17642l<C13512i.a, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17164e<C16807N> f115300a;

        e(C17164e<? super C16807N> eVar) {
            this.f115300a = eVar;
        }

        public final void a(C13512i.a aVar) {
            C17542s.j(aVar, "it");
            C17164e<C16807N> eVar = this.f115300a;
            x.a aVar2 = x.f139812b;
            eVar.resumeWith(x.b(y.a(aVar)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C13512i.a) obj);
            return C16807N.f139792a;
        }
    }

    public C13513j(C12860a aVar, C13515l lVar, C12864e eVar, Oz.b bVar) {
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(lVar, "updateProfileStoreUseCase");
        C17542s.j(eVar, "storeSelectionMemoryRepository");
        C17542s.j(bVar, "scanAndGoCleanupUseCase");
        this.f115283a = aVar;
        this.f115284b = lVar;
        this.f115285c = eVar;
        this.f115286d = bVar;
    }

    private final b b(C17631a<C16807N> aVar, C17642l<? super C13512i.a, C16807N> lVar) {
        return new b(aVar, lVar);
    }

    private final Object c(StorageType storageType, C12832d dVar, C17164e<? super C16807N> eVar) {
        C17170k kVar = new C17170k(C17187b.c(eVar));
        b b10 = b(new d(kVar), new e(kVar));
        int i10 = a.f115287a[storageType.ordinal()];
        if (i10 == 1) {
            this.f115284b.b(dVar, b10);
        } else if (i10 == 2) {
            this.f115283a.a(dVar);
            b10.a(m.f128647a);
        } else if (i10 == 3) {
            this.f115285c.a(dVar);
            b10.a(m.f128647a);
        } else {
            throw new t();
        }
        Object a10 = kVar.a();
        if (a10 == C17187b.f()) {
            h.c(eVar);
        }
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: dI.e<? super XH.N>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(com.ingka.ikea.store.datalayer.StorageType r13, PB.g r14, dI.C17164e<? super XH.C16807N> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof RB.C13513j.c
            if (r0 == 0) goto L_0x0013
            r0 = r15
            RB.j$c r0 = (RB.C13513j.c) r0
            int r1 = r0.f115298k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f115298k = r1
            goto L_0x0018
        L_0x0013:
            RB.j$c r0 = new RB.j$c
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f115296i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f115298k
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0068
            if (r3 == r5) goto L_0x004d
            if (r3 != r4) goto L_0x0045
            java.lang.Object r13 = r0.f115295h
            EB.d r13 = (EB.C12832d) r13
            java.lang.Object r13 = r0.f115294g
            EB.d r13 = (EB.C12832d) r13
            java.lang.Object r13 = r0.f115293f
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f115292e
            PB.g r13 = (PB.g) r13
            java.lang.Object r13 = r0.f115291d
            com.ingka.ikea.store.datalayer.StorageType r13 = (com.ingka.ikea.store.datalayer.StorageType) r13
            java.lang.Object r13 = r0.f115290c
            RB.j r13 = (RB.C13513j) r13
            XH.y.b(r1)
            goto L_0x00be
        L_0x0045:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x004d:
            java.lang.Object r13 = r0.f115294g
            EB.d r13 = (EB.C12832d) r13
            java.lang.Object r14 = r0.f115293f
            r15 = r14
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r14 = r0.f115292e
            PB.g r14 = (PB.g) r14
            java.lang.Object r3 = r0.f115291d
            com.ingka.ikea.store.datalayer.StorageType r3 = (com.ingka.ikea.store.datalayer.StorageType) r3
            java.lang.Object r5 = r0.f115290c
            RB.j r5 = (RB.C13513j) r5
            XH.y.b(r1)
            r1 = r13
            r13 = r3
            goto L_0x0099
        L_0x0068:
            XH.y.b(r1)
            EB.d r1 = new EB.d
            java.lang.String r7 = r14.j()
            java.lang.String r8 = r14.h()
            java.lang.String r9 = r14.c()
            boolean r10 = r14.k()
            EB.a r11 = r14.d()
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.f115290c = r12
            r0.f115291d = r13
            r0.f115292e = r14
            r0.f115293f = r15
            r0.f115294g = r1
            r0.f115298k = r5
            java.lang.Object r3 = r12.c(r13, r1, r0)
            if (r3 != r2) goto L_0x0098
            return r2
        L_0x0098:
            r5 = r12
        L_0x0099:
            Oz.b r3 = r5.f115286d
            FB.a r6 = r5.f115283a
            EB.d r6 = FB.C12861b.a(r6)
            if (r6 == 0) goto L_0x00a8
            java.lang.String r7 = r6.e()
            goto L_0x00a9
        L_0x00a8:
            r7 = 0
        L_0x00a9:
            r0.f115290c = r5
            r0.f115291d = r13
            r0.f115292e = r14
            r0.f115293f = r15
            r0.f115294g = r1
            r0.f115295h = r6
            r0.f115298k = r4
            java.lang.Object r13 = r3.a(r7, r0)
            if (r13 != r2) goto L_0x00be
            return r2
        L_0x00be:
            XH.N r13 = XH.C16807N.f139792a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: RB.C13513j.a(com.ingka.ikea.store.datalayer.StorageType, PB.g, dI.e):java.lang.Object");
    }
}
