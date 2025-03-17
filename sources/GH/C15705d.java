package GH;

import EH.C15623h;
import EH.C15627l;
import EH.C15630o;
import EH.C15631p;
import HJ.C15838d;
import OH.C16158a;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import io.ktor.utils.io.g;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import org.slf4j.Marker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00060\u0001j\u0002`\u0002*\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u0006\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a9\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\r\u001a\u00060\u0001j\u0002`\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"LEH/l;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "defaultCharset", "b", "(LEH/l;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "d", "", "LGH/c;", "Lio/ktor/utils/io/g;", "body", "LOH/a;", "typeInfo", "charset", "", "a", "(Ljava/util/List;Lio/ktor/utils/io/g;LOH/a;Ljava/nio/charset/Charset;LdI/e;)Ljava/lang/Object;", "ktor-serialization"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: GH.d  reason: case insensitive filesystem */
public final class C15705d {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GH.d$a */
    public static final class a implements C16532g<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f134459a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Charset f134460b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16158a f134461c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f134462d;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: GH.d$a$a  reason: collision with other inner class name */
        public static final class C3312a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f134463a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Charset f134464b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C16158a f134465c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ g f134466d;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @f(c = "io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2", f = "ContentConverter.kt", l = {224, 223}, m = "emit")
            /* renamed from: GH.d$a$a$a  reason: collision with other inner class name */
            public static final class C3313a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f134467c;

                /* renamed from: d  reason: collision with root package name */
                int f134468d;

                /* renamed from: e  reason: collision with root package name */
                Object f134469e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C3312a f134470f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3313a(C3312a aVar, C17164e eVar) {
                    super(eVar);
                    this.f134470f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f134467c = obj;
                    this.f134468d |= Integer.MIN_VALUE;
                    return this.f134470f.emit((Object) null, this);
                }
            }

            public C3312a(C16533h hVar, Charset charset, C16158a aVar, g gVar) {
                this.f134463a = hVar;
                this.f134464b = charset;
                this.f134465c = aVar;
                this.f134466d = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0062 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r9, dI.C17164e r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof GH.C15705d.a.C3312a.C3313a
                    if (r0 == 0) goto L_0x0013
                    r0 = r10
                    GH.d$a$a$a r0 = (GH.C15705d.a.C3312a.C3313a) r0
                    int r1 = r0.f134468d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f134468d = r1
                    goto L_0x0018
                L_0x0013:
                    GH.d$a$a$a r0 = new GH.d$a$a$a
                    r0.<init>(r8, r10)
                L_0x0018:
                    java.lang.Object r10 = r0.f134467c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f134468d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003c
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    XH.y.b(r10)
                    goto L_0x0063
                L_0x002c:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L_0x0034:
                    java.lang.Object r9 = r0.f134469e
                    TJ.h r9 = (TJ.C16533h) r9
                    XH.y.b(r10)
                    goto L_0x0057
                L_0x003c:
                    XH.y.b(r10)
                    TJ.h r10 = r8.f134463a
                    GH.c r9 = (GH.C15704c) r9
                    java.nio.charset.Charset r2 = r8.f134464b
                    OH.a r5 = r8.f134465c
                    io.ktor.utils.io.g r6 = r8.f134466d
                    r0.f134469e = r10
                    r0.f134468d = r4
                    java.lang.Object r9 = r9.a(r2, r5, r6, r0)
                    if (r9 != r1) goto L_0x0054
                    return r1
                L_0x0054:
                    r7 = r10
                    r10 = r9
                    r9 = r7
                L_0x0057:
                    r2 = 0
                    r0.f134469e = r2
                    r0.f134468d = r3
                    java.lang.Object r9 = r9.emit(r10, r0)
                    if (r9 != r1) goto L_0x0063
                    return r1
                L_0x0063:
                    XH.N r9 = XH.C16807N.f139792a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: GH.C15705d.a.C3312a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, Charset charset, C16158a aVar, g gVar2) {
            this.f134459a = gVar;
            this.f134460b = charset;
            this.f134461c = aVar;
            this.f134462d = gVar2;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f134459a.collect(new C3312a(hVar, this.f134460b, this.f134461c, this.f134462d), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.serialization.ContentConverterKt", f = "ContentConverter.kt", l = {123}, m = "deserialize")
    /* renamed from: GH.d$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f134471c;

        /* renamed from: d  reason: collision with root package name */
        Object f134472d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f134473e;

        /* renamed from: f  reason: collision with root package name */
        int f134474f;

        b(C17164e<? super b> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f134473e = obj;
            this.f134474f |= Integer.MIN_VALUE;
            return C15705d.a((List<? extends C15704c>) null, (g) null, (C16158a) null, (Charset) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.serialization.ContentConverterKt$deserialize$result$2", f = "ContentConverter.kt", l = {}, m = "invokeSuspend")
    /* renamed from: GH.d$c */
    static final class c extends l implements p<Object, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f134475c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f134476d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f134477e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f134477e = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f134477e, eVar);
            cVar.f134476d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(Object obj, C17164e<? super Boolean> eVar) {
            return ((c) create(obj, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f134475c == 0) {
                y.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f134476d != null || this.f134477e.m());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: OH.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: io.ktor.utils.io.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(java.util.List<? extends GH.C15704c> r5, io.ktor.utils.io.g r6, OH.C16158a r7, java.nio.charset.Charset r8, dI.C17164e<java.lang.Object> r9) {
        /*
            boolean r0 = r9 instanceof GH.C15705d.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            GH.d$b r0 = (GH.C15705d.b) r0
            int r1 = r0.f134474f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f134474f = r1
            goto L_0x0018
        L_0x0013:
            GH.d$b r0 = new GH.d$b
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f134473e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f134474f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r5 = r0.f134472d
            r7 = r5
            OH.a r7 = (OH.C16158a) r7
            java.lang.Object r5 = r0.f134471c
            r6 = r5
            io.ktor.utils.io.g r6 = (io.ktor.utils.io.g) r6
            XH.y.b(r9)
            goto L_0x005c
        L_0x0034:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003c:
            XH.y.b(r9)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            TJ.g r5 = TJ.C16534i.a(r5)
            GH.d$a r9 = new GH.d$a
            r9.<init>(r5, r8, r7, r6)
            GH.d$c r5 = new GH.d$c
            r5.<init>(r6, r3)
            r0.f134471c = r6
            r0.f134472d = r7
            r0.f134474f = r4
            java.lang.Object r9 = TJ.C16534i.E(r9, r5, r0)
            if (r9 != r1) goto L_0x005c
            return r1
        L_0x005c:
            if (r9 != 0) goto L_0x008c
            boolean r5 = r6.m()
            if (r5 != 0) goto L_0x0065
            goto L_0x008d
        L_0x0065:
            uI.q r5 = r7.a()
            if (r5 == 0) goto L_0x0074
            boolean r5 = r5.k()
            if (r5 != r4) goto L_0x0074
            FH.c r6 = FH.c.f134396a
            goto L_0x008d
        L_0x0074:
            GH.b r5 = new GH.b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "No suitable converter found for "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 2
            r5.<init>(r6, r3, r7, r3)
            throw r5
        L_0x008c:
            r6 = r9
        L_0x008d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: GH.C15705d.a(java.util.List, io.ktor.utils.io.g, OH.a, java.nio.charset.Charset, dI.e):java.lang.Object");
    }

    public static final Charset b(C15627l lVar, Charset charset) {
        C17542s.j(lVar, "<this>");
        C17542s.j(charset, "defaultCharset");
        Charset d10 = d(lVar, charset);
        return d10 == null ? charset : d10;
    }

    public static /* synthetic */ Charset c(C15627l lVar, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C15838d.f135279b;
        }
        return b(lVar, charset);
    }

    public static final Charset d(C15627l lVar, Charset charset) {
        C17542s.j(lVar, "<this>");
        C17542s.j(charset, "defaultCharset");
        for (C15623h a10 : C15630o.b(lVar.get(C15631p.f134088a.d()))) {
            String a11 = a10.a();
            if (C17542s.e(a11, Marker.ANY_MARKER)) {
                return charset;
            }
            if (Charset.isSupported(a11)) {
                return Charset.forName(a11);
            }
        }
        return null;
    }
}
