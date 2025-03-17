package lz;

import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import dI.C17164e;
import dz.C14369a;
import eI.C17187b;
import fz.C14488a;
import gz.c;
import iz.C14588b;
import iz.C14594h;
import iz.C14602p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kz.C14738a;
import rz.C15014g;
import rz.C15032z;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0015H@¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H@¢\u0006\u0004\b\u001a\u0010\u0019J\u001b\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00120\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010$\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H@¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001eH@¢\u0006\u0004\b&\u0010'J\u001e\u0010)\u001a\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H@¢\u0006\u0004\b)\u0010\u0017J \u0010*\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H@¢\u0006\u0004\b*\u0010+J \u0010-\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\"H@¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\b\u0012\u0004\u0012\u00020 0\u001bH\u0016¢\u0006\u0004\b/\u0010\u001dJ\u001a\u00100\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH@¢\u0006\u0004\b0\u0010'J\u001e\u00102\u001a\u00020\u00152\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0012H@¢\u0006\u0004\b2\u0010\u0017J\u001e\u00105\u001a\u00020\u00152\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0012H@¢\u0006\u0004\b5\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010:¨\u0006;"}, d2 = {"Llz/a;", "Lkz/a;", "Ldz/a;", "database", "Liz/h;", "cartProductMapper", "Lfz/a;", "cartDao", "Liz/p;", "skippedBarcodeMapper", "Liz/b;", "barcodesNotRepresentedInRemoteMapper", "<init>", "(Ldz/a;Liz/h;Lfz/a;Liz/p;Liz/b;)V", "Lgz/c;", "Lrz/g;", "p", "(Lgz/c;)Lrz/g;", "", "Lrz/z;", "productList", "LXH/N;", "q", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "f", "(LdI/e;)Ljava/lang/Object;", "h", "LTJ/g;", "i", "()LTJ/g;", "", "barcode", "", "quantity", "", "collect", "g", "(Ljava/lang/String;IZLdI/e;)Ljava/lang/Object;", "e", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "cartItems", "l", "k", "(Ljava/lang/String;ILdI/e;)Ljava/lang/Object;", "collected", "c", "(Ljava/lang/String;ZLdI/e;)Ljava/lang/Object;", "a", "b", "skippedBarcodes", "d", "Lgz/c$b;", "updaters", "j", "Ldz/a;", "Liz/h;", "Lfz/a;", "Liz/p;", "Liz/b;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lz.a  reason: case insensitive filesystem */
public final class C14777a implements C14738a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C14369a f129020a;

    /* renamed from: b  reason: collision with root package name */
    private final C14594h f129021b;

    /* renamed from: c  reason: collision with root package name */
    private final C14488a f129022c;

    /* renamed from: d  reason: collision with root package name */
    private final C14602p f129023d;

    /* renamed from: e  reason: collision with root package name */
    private final C14588b f129024e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CartSourceLocalImpl", f = "CartSourceLocalImpl.kt", l = {57}, m = "addItemToCart")
    /* renamed from: lz.a$a  reason: collision with other inner class name */
    static final class C3176a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f129025c;

        /* renamed from: d  reason: collision with root package name */
        Object f129026d;

        /* renamed from: e  reason: collision with root package name */
        Object f129027e;

        /* renamed from: f  reason: collision with root package name */
        Object f129028f;

        /* renamed from: g  reason: collision with root package name */
        Object f129029g;

        /* renamed from: h  reason: collision with root package name */
        int f129030h;

        /* renamed from: i  reason: collision with root package name */
        int f129031i;

        /* renamed from: j  reason: collision with root package name */
        int f129032j;

        /* renamed from: k  reason: collision with root package name */
        boolean f129033k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f129034l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C14777a f129035m;

        /* renamed from: n  reason: collision with root package name */
        int f129036n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3176a(C14777a aVar, C17164e<? super C3176a> eVar) {
            super(eVar);
            this.f129035m = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129034l = obj;
            this.f129036n |= Integer.MIN_VALUE;
            return this.f129035m.g((String) null, 0, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CartSourceLocalImpl", f = "CartSourceLocalImpl.kt", l = {96}, m = "getCartItem")
    /* renamed from: lz.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f129037c;

        /* renamed from: d  reason: collision with root package name */
        Object f129038d;

        /* renamed from: e  reason: collision with root package name */
        Object f129039e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f129040f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C14777a f129041g;

        /* renamed from: h  reason: collision with root package name */
        int f129042h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C14777a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f129041g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129040f = obj;
            this.f129042h |= Integer.MIN_VALUE;
            return this.f129041g.b((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CartSourceLocalImpl", f = "CartSourceLocalImpl.kt", l = {32}, m = "getLocalCart")
    /* renamed from: lz.a$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f129043c;

        /* renamed from: d  reason: collision with root package name */
        Object f129044d;

        /* renamed from: e  reason: collision with root package name */
        Object f129045e;

        /* renamed from: f  reason: collision with root package name */
        Object f129046f;

        /* renamed from: g  reason: collision with root package name */
        int f129047g;

        /* renamed from: h  reason: collision with root package name */
        int f129048h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f129049i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C14777a f129050j;

        /* renamed from: k  reason: collision with root package name */
        int f129051k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C14777a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f129050j = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129049i = obj;
            this.f129051k |= Integer.MIN_VALUE;
            return this.f129050j.h(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lz.a$d */
    public static final class d implements C16532g<List<? extends C15014g>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f129052a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C14777a f129053b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lz.a$d$a  reason: collision with other inner class name */
        public static final class C3177a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f129054a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C14777a f129055b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CartSourceLocalImpl$getLocalCartFlow$$inlined$map$1$2", f = "CartSourceLocalImpl.kt", l = {50}, m = "emit")
            /* renamed from: lz.a$d$a$a  reason: collision with other inner class name */
            public static final class C3178a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f129056c;

                /* renamed from: d  reason: collision with root package name */
                int f129057d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C3177a f129058e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3178a(C3177a aVar, C17164e eVar) {
                    super(eVar);
                    this.f129058e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f129056c = obj;
                    this.f129057d |= Integer.MIN_VALUE;
                    return this.f129058e.emit((Object) null, this);
                }
            }

            public C3177a(C16533h hVar, C14777a aVar) {
                this.f129054a = hVar;
                this.f129055b = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof lz.C14777a.d.C3177a.C3178a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    lz.a$d$a$a r0 = (lz.C14777a.d.C3177a.C3178a) r0
                    int r1 = r0.f129057d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f129057d = r1
                    goto L_0x0018
                L_0x0013:
                    lz.a$d$a$a r0 = new lz.a$d$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f129056c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f129057d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x0070
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f129054a
                    java.util.List r7 = (java.util.List) r7
                    lz.g r2 = lz.g.f129232a
                    java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch:{ CancellationException -> 0x0065, IllegalArgumentException -> 0x0063, Exception -> 0x0061 }
                    java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x0065, IllegalArgumentException -> 0x0063, Exception -> 0x0061 }
                    r4 = 10
                    int r4 = YH.C16877v.y(r7, r4)     // Catch:{ CancellationException -> 0x0065, IllegalArgumentException -> 0x0063, Exception -> 0x0061 }
                    r2.<init>(r4)     // Catch:{ CancellationException -> 0x0065, IllegalArgumentException -> 0x0063, Exception -> 0x0061 }
                    java.util.Iterator r7 = r7.iterator()     // Catch:{ CancellationException -> 0x0065, IllegalArgumentException -> 0x0063, Exception -> 0x0061 }
                L_0x004b:
                    boolean r4 = r7.hasNext()     // Catch:{ CancellationException -> 0x0065, IllegalArgumentException -> 0x0063, Exception -> 0x0061 }
                    if (r4 == 0) goto L_0x0067
                    java.lang.Object r4 = r7.next()     // Catch:{ CancellationException -> 0x0065, IllegalArgumentException -> 0x0063, Exception -> 0x0061 }
                    gz.c r4 = (gz.c) r4     // Catch:{ CancellationException -> 0x0065, IllegalArgumentException -> 0x0063, Exception -> 0x0061 }
                    lz.a r5 = r6.f129055b     // Catch:{ CancellationException -> 0x0065, IllegalArgumentException -> 0x0063, Exception -> 0x0061 }
                    rz.g r4 = r5.p(r4)     // Catch:{ CancellationException -> 0x0065, IllegalArgumentException -> 0x0063, Exception -> 0x0061 }
                    r2.add(r4)     // Catch:{ CancellationException -> 0x0065, IllegalArgumentException -> 0x0063, Exception -> 0x0061 }
                    goto L_0x004b
                L_0x0061:
                    r7 = move-exception
                    goto L_0x0073
                L_0x0063:
                    r7 = move-exception
                    goto L_0x007f
                L_0x0065:
                    r7 = move-exception
                    goto L_0x008a
                L_0x0067:
                    r0.f129057d = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L_0x0070
                    return r1
                L_0x0070:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                L_0x0073:
                    hp.b r8 = new hp.b
                    java.lang.String r0 = "Unknown problem while mapping"
                    java.lang.String r7 = lz.f.a(r7, r0)
                    r8.<init>(r7)
                    throw r8
                L_0x007f:
                    hp.b r8 = new hp.b
                    r0 = 0
                    java.lang.String r7 = lz.f.b(r7, r0, r3, r0)
                    r8.<init>(r7)
                    throw r8
                L_0x008a:
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: lz.C14777a.d.C3177a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar, C14777a aVar) {
            this.f129052a = gVar;
            this.f129053b = aVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f129052a.collect(new C3177a(hVar, this.f129053b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CartSourceLocalImpl", f = "CartSourceLocalImpl.kt", l = {89}, m = "markItemAsCollected")
    /* renamed from: lz.a$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f129059c;

        /* renamed from: d  reason: collision with root package name */
        Object f129060d;

        /* renamed from: e  reason: collision with root package name */
        Object f129061e;

        /* renamed from: f  reason: collision with root package name */
        Object f129062f;

        /* renamed from: g  reason: collision with root package name */
        Object f129063g;

        /* renamed from: h  reason: collision with root package name */
        boolean f129064h;

        /* renamed from: i  reason: collision with root package name */
        int f129065i;

        /* renamed from: j  reason: collision with root package name */
        int f129066j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f129067k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C14777a f129068l;

        /* renamed from: m  reason: collision with root package name */
        int f129069m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C14777a aVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f129068l = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129067k = obj;
            this.f129069m |= Integer.MIN_VALUE;
            return this.f129068l.c((String) null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CartSourceLocalImpl", f = "CartSourceLocalImpl.kt", l = {67}, m = "removeItemFromCart")
    /* renamed from: lz.a$f */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f129070c;

        /* renamed from: d  reason: collision with root package name */
        Object f129071d;

        /* renamed from: e  reason: collision with root package name */
        Object f129072e;

        /* renamed from: f  reason: collision with root package name */
        Object f129073f;

        /* renamed from: g  reason: collision with root package name */
        Object f129074g;

        /* renamed from: h  reason: collision with root package name */
        int f129075h;

        /* renamed from: i  reason: collision with root package name */
        int f129076i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f129077j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C14777a f129078k;

        /* renamed from: l  reason: collision with root package name */
        int f129079l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C14777a aVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f129078k = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129077j = obj;
            this.f129079l |= Integer.MIN_VALUE;
            return this.f129078k.e((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CartSourceLocalImpl", f = "CartSourceLocalImpl.kt", l = {105, 108, 110, 119}, m = "update")
    /* renamed from: lz.a$g */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f129080c;

        /* renamed from: d  reason: collision with root package name */
        Object f129081d;

        /* renamed from: e  reason: collision with root package name */
        Object f129082e;

        /* renamed from: f  reason: collision with root package name */
        Object f129083f;

        /* renamed from: g  reason: collision with root package name */
        Object f129084g;

        /* renamed from: h  reason: collision with root package name */
        Object f129085h;

        /* renamed from: i  reason: collision with root package name */
        Object f129086i;

        /* renamed from: j  reason: collision with root package name */
        Object f129087j;

        /* renamed from: k  reason: collision with root package name */
        Object f129088k;

        /* renamed from: l  reason: collision with root package name */
        int f129089l;

        /* renamed from: m  reason: collision with root package name */
        int f129090m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f129091n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C14777a f129092o;

        /* renamed from: p  reason: collision with root package name */
        int f129093p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C14777a aVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f129092o = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129091n = obj;
            this.f129093p |= Integer.MIN_VALUE;
            return this.f129092o.j((List<c.b>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CartSourceLocalImpl", f = "CartSourceLocalImpl.kt", l = {139}, m = "updateCartItemPriceLabel")
    /* renamed from: lz.a$h */
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f129094c;

        /* renamed from: d  reason: collision with root package name */
        Object f129095d;

        /* renamed from: e  reason: collision with root package name */
        Object f129096e;

        /* renamed from: f  reason: collision with root package name */
        Object f129097f;

        /* renamed from: g  reason: collision with root package name */
        Object f129098g;

        /* renamed from: h  reason: collision with root package name */
        Object f129099h;

        /* renamed from: i  reason: collision with root package name */
        Object f129100i;

        /* renamed from: j  reason: collision with root package name */
        Object f129101j;

        /* renamed from: k  reason: collision with root package name */
        Object f129102k;

        /* renamed from: l  reason: collision with root package name */
        int f129103l;

        /* renamed from: m  reason: collision with root package name */
        int f129104m;

        /* renamed from: n  reason: collision with root package name */
        int f129105n;

        /* renamed from: o  reason: collision with root package name */
        int f129106o;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f129107p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ C14777a f129108q;

        /* renamed from: r  reason: collision with root package name */
        int f129109r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C14777a aVar, C17164e<? super h> eVar) {
            super(eVar);
            this.f129108q = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129107p = obj;
            this.f129109r |= Integer.MIN_VALUE;
            return this.f129108q.q((List<C15032z>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CartSourceLocalImpl", f = "CartSourceLocalImpl.kt", l = {80}, m = "updateItemQuantity")
    /* renamed from: lz.a$i */
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f129110c;

        /* renamed from: d  reason: collision with root package name */
        Object f129111d;

        /* renamed from: e  reason: collision with root package name */
        Object f129112e;

        /* renamed from: f  reason: collision with root package name */
        Object f129113f;

        /* renamed from: g  reason: collision with root package name */
        Object f129114g;

        /* renamed from: h  reason: collision with root package name */
        int f129115h;

        /* renamed from: i  reason: collision with root package name */
        int f129116i;

        /* renamed from: j  reason: collision with root package name */
        int f129117j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f129118k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C14777a f129119l;

        /* renamed from: m  reason: collision with root package name */
        int f129120m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C14777a aVar, C17164e<? super i> eVar) {
            super(eVar);
            this.f129119l = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129118k = obj;
            this.f129120m |= Integer.MIN_VALUE;
            return this.f129119l.k((String) null, 0, this);
        }
    }

    public C14777a(C14369a aVar, C14594h hVar, C14488a aVar2, C14602p pVar, C14588b bVar) {
        C17542s.j(aVar, "database");
        C17542s.j(hVar, "cartProductMapper");
        C17542s.j(aVar2, "cartDao");
        C17542s.j(pVar, "skippedBarcodeMapper");
        C17542s.j(bVar, "barcodesNotRepresentedInRemoteMapper");
        this.f129020a = aVar;
        this.f129021b = hVar;
        this.f129022c = aVar2;
        this.f129023d = pVar;
        this.f129024e = bVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
        r6 = r6.d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rz.C15014g p(gz.c r12) {
        /*
            r11 = this;
            iz.h r0 = r11.f129021b
            java.lang.String r1 = r12.c()
            double r2 = r12.f()
            com.ingka.ikea.core.remotemodel.product.ProductLiteRemote r4 = r12.h()
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel r5 = r12.i()
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel r6 = r12.i()
            if (r6 == 0) goto L_0x0023
            java.lang.Integer r6 = r6.d()
            if (r6 == 0) goto L_0x0023
            int r6 = r6.intValue()
            goto L_0x0024
        L_0x0023:
            r6 = 0
        L_0x0024:
            boolean r7 = r12.d()
            rz.y r8 = r12.k()
            gz.a r9 = r12.g()
            boolean r10 = r12.l()
            rz.g r12 = r0.a(r1, r2, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.C14777a.p(gz.c):rz.g");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0093 A[Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q(java.util.List<rz.C15032z> r18, dI.C17164e<? super XH.C16807N> r19) {
        /*
            r17 = this;
            r0 = r19
            boolean r1 = r0 instanceof lz.C14777a.h
            if (r1 == 0) goto L_0x0017
            r1 = r0
            lz.a$h r1 = (lz.C14777a.h) r1
            int r2 = r1.f129109r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f129109r = r2
            r2 = r17
            goto L_0x001e
        L_0x0017:
            lz.a$h r1 = new lz.a$h
            r2 = r17
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r3 = r1.f129107p
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r1.f129109r
            r6 = 1
            if (r5 == 0) goto L_0x0074
            if (r5 != r6) goto L_0x006c
            int r0 = r1.f129105n
            int r5 = r1.f129104m
            int r8 = r1.f129103l
            java.lang.Object r9 = r1.f129102k
            rz.z r9 = (rz.C15032z) r9
            java.lang.Object r9 = r1.f129100i
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r1.f129099h
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r11 = r1.f129098g
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r12 = r1.f129097f
            lz.m r12 = (lz.m) r12
            java.lang.Object r13 = r1.f129096e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r14 = r1.f129095d
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r15 = r1.f129094c
            lz.a r15 = (lz.C14777a) r15
            XH.y.b(r3)     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            r3 = r0
            r0 = r14
            r16 = r5
            r5 = r1
            r1 = r13
            r13 = r12
            r12 = r10
            r10 = r8
            r8 = r11
            r11 = r9
            r9 = r16
            goto L_0x00d4
        L_0x0063:
            r0 = move-exception
            goto L_0x00db
        L_0x0066:
            r0 = move-exception
            goto L_0x00ef
        L_0x0069:
            r0 = move-exception
            goto L_0x00fd
        L_0x006c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0074:
            XH.y.b(r3)
            lz.m r3 = lz.m.f129322a
            r5 = r18
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            java.util.Iterator r8 = r5.iterator()     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            r15 = r2
            r13 = r3
            r12 = r5
            r11 = r8
            r3 = 0
            r9 = 0
            r10 = 0
            r5 = r1
            r8 = r5
            r1 = r0
            r0 = r18
        L_0x008d:
            boolean r14 = r11.hasNext()     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            if (r14 == 0) goto L_0x00d8
            java.lang.Object r14 = r11.next()     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            r6 = r14
            rz.z r6 = (rz.C15032z) r6     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            dz.a r7 = r15.f129020a     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            java.lang.String r2 = r6.a()     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            r19 = r2
            r18 = r3
            double r2 = r6.b()     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            r5.f129094c = r15     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            r5.f129095d = r0     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            r5.f129096e = r1     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            r5.f129097f = r13     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            r5.f129098g = r8     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            r5.f129099h = r12     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            r5.f129100i = r11     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            r5.f129101j = r14     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            r5.f129102k = r6     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            r5.f129103l = r10     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            r5.f129104m = r9     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            r6 = r18
            r5.f129105n = r6     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            r14 = 0
            r5.f129106o = r14     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            r14 = 1
            r5.f129109r = r14     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            r14 = r19
            java.lang.Object r2 = r7.l(r14, r2, r5)     // Catch:{ CancellationException -> 0x0069, NullPointerException -> 0x0066, Exception -> 0x0063 }
            if (r2 != r4) goto L_0x00d3
            return r4
        L_0x00d3:
            r3 = r6
        L_0x00d4:
            r2 = r17
            r6 = 1
            goto L_0x008d
        L_0x00d8:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x00db:
            hp.a r1 = new hp.a
            hp.a$a r2 = hp.C11375a.C2209a.UNKNOWN
            java.lang.String r3 = r0.getMessage()
            if (r3 != 0) goto L_0x00e7
            java.lang.String r3 = "Could not get error message from exception"
        L_0x00e7:
            java.lang.String r0 = lz.f.a(r0, r3)
            r1.<init>(r2, r0)
            throw r1
        L_0x00ef:
            hp.a r1 = new hp.a
            hp.a$a r2 = hp.C11375a.C2209a.ITEM_NOT_FOUND
            r3 = 0
            r4 = 1
            java.lang.String r0 = lz.f.b(r0, r3, r4, r3)
            r1.<init>(r2, r0)
            throw r1
        L_0x00fd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.C14777a.q(java.util.List, dI.e):java.lang.Object");
    }

    public C16532g<Integer> a() {
        return this.f129020a.i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.String r6, dI.C17164e<? super rz.C15014g> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof lz.C14777a.b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            lz.a$b r0 = (lz.C14777a.b) r0
            int r1 = r0.f129042h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f129042h = r1
            goto L_0x0018
        L_0x0013:
            lz.a$b r0 = new lz.a$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f129040f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f129042h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f129039e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f129038d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f129037c
            lz.a r6 = (lz.C14777a) r6
            XH.y.b(r1)
            goto L_0x0052
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            dz.a r1 = r5.f129020a
            r0.f129037c = r5
            r0.f129038d = r6
            r0.f129039e = r7
            r0.f129042h = r4
            java.lang.Object r1 = r1.b(r6, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            r6 = r5
        L_0x0052:
            gz.c r1 = (gz.c) r1
            if (r1 == 0) goto L_0x005b
            rz.g r6 = r6.p(r1)
            goto L_0x005c
        L_0x005b:
            r6 = 0
        L_0x005c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.C14777a.b(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.lang.String r7, boolean r8, dI.C17164e<? super XH.C16807N> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof lz.C14777a.e
            if (r0 == 0) goto L_0x0013
            r0 = r9
            lz.a$e r0 = (lz.C14777a.e) r0
            int r1 = r0.f129069m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f129069m = r1
            goto L_0x0018
        L_0x0013:
            lz.a$e r0 = new lz.a$e
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f129067k
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f129069m
            r4 = 1
            if (r3 == 0) goto L_0x004b
            if (r3 != r4) goto L_0x0043
            java.lang.Object r7 = r0.f129063g
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f129062f
            lz.m r7 = (lz.m) r7
            java.lang.Object r7 = r0.f129061e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f129060d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f129059c
            lz.a r7 = (lz.C14777a) r7
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            goto L_0x006e
        L_0x003d:
            r7 = move-exception
            goto L_0x0071
        L_0x003f:
            r7 = move-exception
            goto L_0x0085
        L_0x0041:
            r7 = move-exception
            goto L_0x0092
        L_0x0043:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x004b:
            XH.y.b(r1)
            lz.m r1 = lz.m.f129322a
            dz.a r3 = r6.f129020a     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r5 = 0
            r0.f129059c = r6     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129060d = r7     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129061e = r9     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129062f = r1     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129063g = r0     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129064h = r8     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129065i = r5     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129066j = r5     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129069m = r4     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            java.lang.Object r7 = r3.c(r7, r8, r0)     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            if (r7 != r2) goto L_0x006e
            return r2
        L_0x006e:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        L_0x0071:
            hp.a r8 = new hp.a
            hp.a$a r9 = hp.C11375a.C2209a.UNKNOWN
            java.lang.String r0 = r7.getMessage()
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = "Could not get error message from exception"
        L_0x007d:
            java.lang.String r7 = lz.f.a(r7, r0)
            r8.<init>(r9, r7)
            throw r8
        L_0x0085:
            hp.a r8 = new hp.a
            hp.a$a r9 = hp.C11375a.C2209a.ITEM_NOT_FOUND
            r0 = 0
            java.lang.String r7 = lz.f.b(r7, r0, r4, r0)
            r8.<init>(r9, r7)
            throw r8
        L_0x0092:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.C14777a.c(java.lang.String, boolean, dI.e):java.lang.Object");
    }

    public Object d(List<String> list, C17164e<? super C16807N> eVar) {
        Object d10 = this.f129020a.d(list, eVar);
        return d10 == C17187b.f() ? d10 : C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(java.lang.String r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof lz.C14777a.f
            if (r0 == 0) goto L_0x0013
            r0 = r7
            lz.a$f r0 = (lz.C14777a.f) r0
            int r1 = r0.f129079l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f129079l = r1
            goto L_0x0018
        L_0x0013:
            lz.a$f r0 = new lz.a$f
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f129077j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f129079l
            r4 = 1
            if (r3 == 0) goto L_0x004b
            if (r3 != r4) goto L_0x0043
            java.lang.Object r6 = r0.f129074g
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f129073f
            lz.m r6 = (lz.m) r6
            java.lang.Object r6 = r0.f129072e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f129071d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f129070c
            lz.a r6 = (lz.C14777a) r6
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            goto L_0x006c
        L_0x003d:
            r6 = move-exception
            goto L_0x006f
        L_0x003f:
            r6 = move-exception
            goto L_0x0083
        L_0x0041:
            r6 = move-exception
            goto L_0x0090
        L_0x0043:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x004b:
            XH.y.b(r1)
            lz.m r1 = lz.m.f129322a
            dz.a r3 = r5.f129020a     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129070c = r5     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129071d = r6     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129072e = r7     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129073f = r1     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129074g = r0     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r7 = 0
            r0.f129075h = r7     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129076i = r7     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129079l = r4     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            java.lang.Object r6 = r3.e(r6, r0)     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            if (r6 != r2) goto L_0x006c
            return r2
        L_0x006c:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x006f:
            hp.a r7 = new hp.a
            hp.a$a r0 = hp.C11375a.C2209a.UNKNOWN
            java.lang.String r1 = r6.getMessage()
            if (r1 != 0) goto L_0x007b
            java.lang.String r1 = "Could not get error message from exception"
        L_0x007b:
            java.lang.String r6 = lz.f.a(r6, r1)
            r7.<init>(r0, r6)
            throw r7
        L_0x0083:
            hp.a r7 = new hp.a
            hp.a$a r0 = hp.C11375a.C2209a.ITEM_NOT_FOUND
            r1 = 0
            java.lang.String r6 = lz.f.b(r6, r1, r4, r1)
            r7.<init>(r0, r6)
            throw r7
        L_0x0090:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.C14777a.e(java.lang.String, dI.e):java.lang.Object");
    }

    public Object f(C17164e<? super C16807N> eVar) {
        Object f10 = this.f129020a.f(eVar);
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(java.lang.String r7, int r8, boolean r9, dI.C17164e<? super XH.C16807N> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof lz.C14777a.C3176a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            lz.a$a r0 = (lz.C14777a.C3176a) r0
            int r1 = r0.f129036n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f129036n = r1
            goto L_0x0018
        L_0x0013:
            lz.a$a r0 = new lz.a$a
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r1 = r0.f129034l
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f129036n
            r4 = 1
            if (r3 == 0) goto L_0x004b
            if (r3 != r4) goto L_0x0043
            java.lang.Object r7 = r0.f129029g
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f129028f
            lz.m r7 = (lz.m) r7
            java.lang.Object r7 = r0.f129027e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f129026d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f129025c
            lz.a r7 = (lz.C14777a) r7
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            goto L_0x0070
        L_0x003d:
            r7 = move-exception
            goto L_0x0073
        L_0x003f:
            r7 = move-exception
            goto L_0x0087
        L_0x0041:
            r7 = move-exception
            goto L_0x0094
        L_0x0043:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x004b:
            XH.y.b(r1)
            lz.m r1 = lz.m.f129322a
            dz.a r3 = r6.f129020a     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r5 = 0
            r0.f129025c = r6     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129026d = r7     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129027e = r10     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129028f = r1     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129029g = r0     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129030h = r8     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129033k = r9     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129031i = r5     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129032j = r5     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129036n = r4     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            java.lang.Object r7 = r3.g(r7, r8, r9, r0)     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            if (r7 != r2) goto L_0x0070
            return r2
        L_0x0070:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        L_0x0073:
            hp.a r8 = new hp.a
            hp.a$a r9 = hp.C11375a.C2209a.UNKNOWN
            java.lang.String r10 = r7.getMessage()
            if (r10 != 0) goto L_0x007f
            java.lang.String r10 = "Could not get error message from exception"
        L_0x007f:
            java.lang.String r7 = lz.f.a(r7, r10)
            r8.<init>(r9, r7)
            throw r8
        L_0x0087:
            hp.a r8 = new hp.a
            hp.a$a r9 = hp.C11375a.C2209a.ITEM_NOT_FOUND
            r10 = 0
            java.lang.String r7 = lz.f.b(r7, r10, r4, r10)
            r8.<init>(r9, r7)
            throw r8
        L_0x0094:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.C14777a.g(java.lang.String, int, boolean, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0086 A[Catch:{ CancellationException -> 0x0098, IllegalArgumentException -> 0x0096, Exception -> 0x0094, CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }, LOOP:0: B:26:0x0080->B:28:0x0086, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object h(dI.C17164e<? super java.util.List<rz.C15014g>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof lz.C14777a.c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            lz.a$c r0 = (lz.C14777a.c) r0
            int r1 = r0.f129051k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f129051k = r1
            goto L_0x0018
        L_0x0013:
            lz.a$c r0 = new lz.a$c
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f129049i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f129051k
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x004b
            if (r3 != r5) goto L_0x0043
            java.lang.Object r7 = r0.f129046f
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f129045e
            lz.m r7 = (lz.m) r7
            java.lang.Object r7 = r0.f129044d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f129043c
            lz.a r7 = (lz.C14777a) r7
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
            goto L_0x006b
        L_0x003a:
            r7 = move-exception
            goto L_0x00b2
        L_0x003d:
            r7 = move-exception
            goto L_0x00c6
        L_0x0040:
            r7 = move-exception
            goto L_0x00d2
        L_0x0043:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x004b:
            XH.y.b(r1)
            lz.m r1 = lz.m.f129322a
            dz.a r3 = r6.f129020a     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
            r0.f129043c = r6     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
            r0.f129044d = r7     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
            r0.f129045e = r1     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
            r0.f129046f = r0     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
            r7 = 0
            r0.f129047g = r7     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
            r0.f129048h = r7     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
            r0.f129051k = r5     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
            java.lang.Object r1 = r3.o(r0)     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
            if (r1 != r2) goto L_0x006a
            return r2
        L_0x006a:
            r7 = r6
        L_0x006b:
            java.util.List r1 = (java.util.List) r1     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
            lz.g r0 = lz.g.f129232a     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ CancellationException -> 0x0098, IllegalArgumentException -> 0x0096, Exception -> 0x0094 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x0098, IllegalArgumentException -> 0x0096, Exception -> 0x0094 }
            r2 = 10
            int r2 = YH.C16877v.y(r1, r2)     // Catch:{ CancellationException -> 0x0098, IllegalArgumentException -> 0x0096, Exception -> 0x0094 }
            r0.<init>(r2)     // Catch:{ CancellationException -> 0x0098, IllegalArgumentException -> 0x0096, Exception -> 0x0094 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ CancellationException -> 0x0098, IllegalArgumentException -> 0x0096, Exception -> 0x0094 }
        L_0x0080:
            boolean r2 = r1.hasNext()     // Catch:{ CancellationException -> 0x0098, IllegalArgumentException -> 0x0096, Exception -> 0x0094 }
            if (r2 == 0) goto L_0x009a
            java.lang.Object r2 = r1.next()     // Catch:{ CancellationException -> 0x0098, IllegalArgumentException -> 0x0096, Exception -> 0x0094 }
            gz.c r2 = (gz.c) r2     // Catch:{ CancellationException -> 0x0098, IllegalArgumentException -> 0x0096, Exception -> 0x0094 }
            rz.g r2 = r7.p(r2)     // Catch:{ CancellationException -> 0x0098, IllegalArgumentException -> 0x0096, Exception -> 0x0094 }
            r0.add(r2)     // Catch:{ CancellationException -> 0x0098, IllegalArgumentException -> 0x0096, Exception -> 0x0094 }
            goto L_0x0080
        L_0x0094:
            r7 = move-exception
            goto L_0x009b
        L_0x0096:
            r7 = move-exception
            goto L_0x00a7
        L_0x0098:
            r7 = move-exception
            goto L_0x00b1
        L_0x009a:
            return r0
        L_0x009b:
            hp.b r0 = new hp.b     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
            java.lang.String r1 = "Unknown problem while mapping"
            java.lang.String r7 = lz.f.a(r7, r1)     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
            r0.<init>(r7)     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
            throw r0     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
        L_0x00a7:
            hp.b r0 = new hp.b     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
            java.lang.String r7 = lz.f.b(r7, r4, r5, r4)     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
            r0.<init>(r7)     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
            throw r0     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
        L_0x00b1:
            throw r7     // Catch:{ CancellationException -> 0x0040, NullPointerException -> 0x003d, Exception -> 0x003a }
        L_0x00b2:
            hp.a r0 = new hp.a
            hp.a$a r1 = hp.C11375a.C2209a.UNKNOWN
            java.lang.String r2 = r7.getMessage()
            if (r2 != 0) goto L_0x00be
            java.lang.String r2 = "Could not get error message from exception"
        L_0x00be:
            java.lang.String r7 = lz.f.a(r7, r2)
            r0.<init>(r1, r7)
            throw r0
        L_0x00c6:
            hp.a r0 = new hp.a
            hp.a$a r1 = hp.C11375a.C2209a.ITEM_NOT_FOUND
            java.lang.String r7 = lz.f.b(r7, r4, r5, r4)
            r0.<init>(r1, r7)
            throw r0
        L_0x00d2:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.C14777a.h(dI.e):java.lang.Object");
    }

    public C16532g<List<C15014g>> i() {
        return new d(this.f129020a.n(), this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: dI.e<? super XH.N>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ce A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010c A[LOOP:1: B:33:0x0106->B:35:0x010c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x013e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object j(java.util.List<gz.c.b> r13, dI.C17164e<? super XH.C16807N> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof lz.C14777a.g
            if (r0 == 0) goto L_0x0013
            r0 = r14
            lz.a$g r0 = (lz.C14777a.g) r0
            int r1 = r0.f129093p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f129093p = r1
            goto L_0x0018
        L_0x0013:
            lz.a$g r0 = new lz.a$g
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f129091n
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f129093p
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L_0x00ab
            if (r3 == r7) goto L_0x009a
            if (r3 == r6) goto L_0x0087
            if (r3 == r5) goto L_0x005e
            if (r3 != r4) goto L_0x0056
            int r13 = r0.f129089l
            java.lang.Object r14 = r0.f129088k
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r14 = r0.f129086i
            java.util.Iterator r14 = (java.util.Iterator) r14
            java.lang.Object r3 = r0.f129085h
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Object r5 = r0.f129084g
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r0.f129083f
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r0.f129082e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r9 = r0.f129081d
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r0.f129080c
            lz.a r10 = (lz.C14777a) r10
            XH.y.b(r1)
            goto L_0x0155
        L_0x0056:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x005e:
            java.lang.Object r13 = r0.f129088k
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r13 = r0.f129087j
            java.util.Collection r13 = (java.util.Collection) r13
            java.lang.Object r13 = r0.f129086i
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r13 = r0.f129085h
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r13 = r0.f129084g
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r14 = r0.f129083f
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r3 = r0.f129082e
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r5 = r0.f129081d
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r0.f129080c
            lz.a r6 = (lz.C14777a) r6
            XH.y.b(r1)
            goto L_0x0141
        L_0x0087:
            java.lang.Object r13 = r0.f129082e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r14 = r0.f129081d
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r3 = r0.f129080c
            lz.a r3 = (lz.C14777a) r3
            XH.y.b(r1)
            r6 = r3
            r3 = r13
            r13 = r14
            goto L_0x00d1
        L_0x009a:
            java.lang.Object r13 = r0.f129082e
            r14 = r13
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r13 = r0.f129081d
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r3 = r0.f129080c
            lz.a r3 = (lz.C14777a) r3
            XH.y.b(r1)
            goto L_0x00c0
        L_0x00ab:
            XH.y.b(r1)
            fz.a r1 = r12.f129022c
            r0.f129080c = r12
            r0.f129081d = r13
            r0.f129082e = r14
            r0.f129093p = r7
            java.lang.Object r1 = r1.g(r13, r0)
            if (r1 != r2) goto L_0x00bf
            return r2
        L_0x00bf:
            r3 = r12
        L_0x00c0:
            r0.f129080c = r3
            r0.f129081d = r13
            r0.f129082e = r14
            r0.f129093p = r6
            java.lang.Object r1 = r3.h(r0)
            if (r1 != r2) goto L_0x00cf
            return r2
        L_0x00cf:
            r6 = r3
            r3 = r14
        L_0x00d1:
            r14 = r1
            java.util.List r14 = (java.util.List) r14
            r1 = r14
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00e0:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x00f7
            java.lang.Object r9 = r1.next()
            r10 = r9
            rz.g r10 = (rz.C15014g) r10
            boolean r10 = r10.b()
            if (r10 == 0) goto L_0x00e0
            r7.add(r9)
            goto L_0x00e0
        L_0x00f7:
            java.util.ArrayList r1 = new java.util.ArrayList
            r9 = 10
            int r9 = YH.C16877v.y(r7, r9)
            r1.<init>(r9)
            java.util.Iterator r9 = r7.iterator()
        L_0x0106:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x011a
            java.lang.Object r10 = r9.next()
            rz.g r10 = (rz.C15014g) r10
            java.lang.String r10 = r10.a()
            r1.add(r10)
            goto L_0x0106
        L_0x011a:
            iz.p r10 = r6.f129023d
            java.util.List r10 = r10.a(r13, r1)
            r0.f129080c = r6
            r0.f129081d = r13
            r0.f129082e = r3
            r0.f129083f = r14
            r0.f129084g = r1
            r0.f129085h = r7
            r0.f129086i = r7
            r0.f129087j = r1
            r0.f129088k = r9
            r0.f129089l = r8
            r0.f129090m = r8
            r0.f129093p = r5
            java.lang.Object r5 = r6.d(r10, r0)
            if (r5 != r2) goto L_0x013f
            return r2
        L_0x013f:
            r5 = r13
            r13 = r1
        L_0x0141:
            iz.b r1 = r6.f129024e
            java.util.List r1 = r1.a(r5, r14)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r7 = r1.iterator()
            r9 = r5
            r10 = r6
            r5 = r13
            r6 = r14
            r14 = r7
            r13 = r8
            r7 = r3
            r3 = r1
        L_0x0155:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0181
            java.lang.Object r1 = r14.next()
            r11 = r1
            java.lang.String r11 = (java.lang.String) r11
            r0.f129080c = r10
            r0.f129081d = r9
            r0.f129082e = r7
            r0.f129083f = r6
            r0.f129084g = r5
            r0.f129085h = r3
            r0.f129086i = r14
            r0.f129087j = r1
            r0.f129088k = r11
            r0.f129089l = r13
            r0.f129090m = r8
            r0.f129093p = r4
            java.lang.Object r1 = r10.e(r11, r0)
            if (r1 != r2) goto L_0x0155
            return r2
        L_0x0181:
            XH.N r13 = XH.C16807N.f139792a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.C14777a.j(java.util.List, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object k(java.lang.String r6, int r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof lz.C14777a.i
            if (r0 == 0) goto L_0x0013
            r0 = r8
            lz.a$i r0 = (lz.C14777a.i) r0
            int r1 = r0.f129120m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f129120m = r1
            goto L_0x0018
        L_0x0013:
            lz.a$i r0 = new lz.a$i
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f129118k
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f129120m
            r4 = 1
            if (r3 == 0) goto L_0x004b
            if (r3 != r4) goto L_0x0043
            java.lang.Object r6 = r0.f129114g
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f129113f
            lz.m r6 = (lz.m) r6
            java.lang.Object r6 = r0.f129112e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f129111d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f129110c
            lz.a r6 = (lz.C14777a) r6
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            goto L_0x006e
        L_0x003d:
            r6 = move-exception
            goto L_0x0071
        L_0x003f:
            r6 = move-exception
            goto L_0x0085
        L_0x0041:
            r6 = move-exception
            goto L_0x0092
        L_0x0043:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x004b:
            XH.y.b(r1)
            lz.m r1 = lz.m.f129322a
            dz.a r3 = r5.f129020a     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129110c = r5     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129111d = r6     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129112e = r8     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129113f = r1     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129114g = r0     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129115h = r7     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r8 = 0
            r0.f129116i = r8     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129117j = r8     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            r0.f129120m = r4     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            java.lang.Object r6 = r3.m(r6, r7, r0)     // Catch:{ CancellationException -> 0x0041, NullPointerException -> 0x003f, Exception -> 0x003d }
            if (r6 != r2) goto L_0x006e
            return r2
        L_0x006e:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x0071:
            hp.a r7 = new hp.a
            hp.a$a r8 = hp.C11375a.C2209a.UNKNOWN
            java.lang.String r0 = r6.getMessage()
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = "Could not get error message from exception"
        L_0x007d:
            java.lang.String r6 = lz.f.a(r6, r0)
            r7.<init>(r8, r6)
            throw r7
        L_0x0085:
            hp.a r7 = new hp.a
            hp.a$a r8 = hp.C11375a.C2209a.ITEM_NOT_FOUND
            r0 = 0
            java.lang.String r6 = lz.f.b(r6, r0, r4, r0)
            r7.<init>(r8, r6)
            throw r7
        L_0x0092:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.C14777a.k(java.lang.String, int, dI.e):java.lang.Object");
    }

    public Object l(List<C15032z> list, C17164e<? super C16807N> eVar) {
        Object q10 = q(list, eVar);
        return q10 == C17187b.f() ? q10 : C16807N.f139792a;
    }
}
