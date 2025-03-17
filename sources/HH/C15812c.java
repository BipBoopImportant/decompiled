package HH;

import EH.C15618c;
import EH.C15620e;
import EH.C15638w;
import FH.C15683a;
import FH.d;
import GH.C15704c;
import OH.C16158a;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import fK.C17246D;
import fK.C17248a;
import fK.C17262o;
import io.ktor.utils.io.g;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import nI.p;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\bH@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001e\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"LHH/c;", "LGH/c;", "LfK/o;", "format", "<init>", "(LfK/o;)V", "Lkotlinx/serialization/KSerializer;", "serializer", "", "value", "LEH/c;", "contentType", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "LFH/d$a;", "c", "(Lkotlinx/serialization/KSerializer;LfK/o;Ljava/lang/Object;LEH/c;Ljava/nio/charset/Charset;)LFH/d$a;", "LOH/a;", "typeInfo", "LFH/d;", "b", "(LEH/c;Ljava/nio/charset/Charset;LOH/a;Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "Lio/ktor/utils/io/g;", "content", "a", "(Ljava/nio/charset/Charset;LOH/a;Lio/ktor/utils/io/g;LdI/e;)Ljava/lang/Object;", "LfK/o;", "", "LHH/e;", "Ljava/util/List;", "extensions", "ktor-serialization-kotlinx"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: HH.c  reason: case insensitive filesystem */
public final class C15812c implements C15704c {

    /* renamed from: a  reason: collision with root package name */
    private final C17262o f135221a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C15814e> f135222b;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: HH.c$a */
    public static final class a implements C16532g<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f135223a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Charset f135224b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16158a f135225c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f135226d;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: HH.c$a$a  reason: collision with other inner class name */
        public static final class C3325a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f135227a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Charset f135228b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C16158a f135229c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ g f135230d;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1$2", f = "KotlinxSerializationConverter.kt", l = {224, 223}, m = "emit")
            /* renamed from: HH.c$a$a$a  reason: collision with other inner class name */
            public static final class C3326a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f135231c;

                /* renamed from: d  reason: collision with root package name */
                int f135232d;

                /* renamed from: e  reason: collision with root package name */
                Object f135233e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C3325a f135234f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3326a(C3325a aVar, C17164e eVar) {
                    super(eVar);
                    this.f135234f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f135231c = obj;
                    this.f135232d |= Integer.MIN_VALUE;
                    return this.f135234f.emit((Object) null, this);
                }
            }

            public C3325a(C16533h hVar, Charset charset, C16158a aVar, g gVar) {
                this.f135227a = hVar;
                this.f135228b = charset;
                this.f135229c = aVar;
                this.f135230d = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0062 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r9, dI.C17164e r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof HH.C15812c.a.C3325a.C3326a
                    if (r0 == 0) goto L_0x0013
                    r0 = r10
                    HH.c$a$a$a r0 = (HH.C15812c.a.C3325a.C3326a) r0
                    int r1 = r0.f135232d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f135232d = r1
                    goto L_0x0018
                L_0x0013:
                    HH.c$a$a$a r0 = new HH.c$a$a$a
                    r0.<init>(r8, r10)
                L_0x0018:
                    java.lang.Object r10 = r0.f135231c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f135232d
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
                    java.lang.Object r9 = r0.f135233e
                    TJ.h r9 = (TJ.C16533h) r9
                    XH.y.b(r10)
                    goto L_0x0057
                L_0x003c:
                    XH.y.b(r10)
                    TJ.h r10 = r8.f135227a
                    HH.e r9 = (HH.C15814e) r9
                    java.nio.charset.Charset r2 = r8.f135228b
                    OH.a r5 = r8.f135229c
                    io.ktor.utils.io.g r6 = r8.f135230d
                    r0.f135233e = r10
                    r0.f135232d = r4
                    java.lang.Object r9 = r9.a(r2, r5, r6, r0)
                    if (r9 != r1) goto L_0x0054
                    return r1
                L_0x0054:
                    r7 = r10
                    r10 = r9
                    r9 = r7
                L_0x0057:
                    r2 = 0
                    r0.f135233e = r2
                    r0.f135232d = r3
                    java.lang.Object r9 = r9.emit(r10, r0)
                    if (r9 != r1) goto L_0x0063
                    return r1
                L_0x0063:
                    XH.N r9 = XH.C16807N.f139792a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: HH.C15812c.a.C3325a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, Charset charset, C16158a aVar, g gVar2) {
            this.f135223a = gVar;
            this.f135224b = charset;
            this.f135225c = aVar;
            this.f135226d = gVar2;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f135223a.collect(new C3325a(hVar, this.f135224b, this.f135225c, this.f135226d), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", f = "KotlinxSerializationConverter.kt", l = {74, 78}, m = "deserialize")
    /* renamed from: HH.c$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f135235c;

        /* renamed from: d  reason: collision with root package name */
        Object f135236d;

        /* renamed from: e  reason: collision with root package name */
        Object f135237e;

        /* renamed from: f  reason: collision with root package name */
        Object f135238f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f135239g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C15812c f135240h;

        /* renamed from: i  reason: collision with root package name */
        int f135241i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C15812c cVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f135240h = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f135239g = obj;
            this.f135241i |= Integer.MIN_VALUE;
            return this.f135240h.a((Charset) null, (C16158a) null, (g) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$fromExtension$2", f = "KotlinxSerializationConverter.kt", l = {}, m = "invokeSuspend")
    /* renamed from: HH.c$c  reason: collision with other inner class name */
    static final class C3327c extends l implements p<Object, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f135242c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f135243d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f135244e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3327c(g gVar, C17164e<? super C3327c> eVar) {
            super(2, eVar);
            this.f135244e = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C3327c cVar = new C3327c(this.f135244e, eVar);
            cVar.f135243d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(Object obj, C17164e<? super Boolean> eVar) {
            return ((C3327c) create(obj, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f135242c == 0) {
                y.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f135243d != null || this.f135244e.m());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: HH.c$d */
    public static final class d implements C16532g<FH.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f135245a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15618c f135246b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Charset f135247c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16158a f135248d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f135249e;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: HH.c$d$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f135250a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C15618c f135251b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Charset f135252c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C16158a f135253d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Object f135254e;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serializeNullable$$inlined$map$1$2", f = "KotlinxSerializationConverter.kt", l = {224, 223}, m = "emit")
            /* renamed from: HH.c$d$a$a  reason: collision with other inner class name */
            public static final class C3328a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f135255c;

                /* renamed from: d  reason: collision with root package name */
                int f135256d;

                /* renamed from: e  reason: collision with root package name */
                Object f135257e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ a f135258f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3328a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f135258f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f135255c = obj;
                    this.f135256d |= Integer.MIN_VALUE;
                    return this.f135258f.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C15618c cVar, Charset charset, C16158a aVar, Object obj) {
                this.f135250a = hVar;
                this.f135251b = cVar;
                this.f135252c = charset;
                this.f135253d = aVar;
                this.f135254e = obj;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0067 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r11, dI.C17164e r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof HH.C15812c.d.a.C3328a
                    if (r0 == 0) goto L_0x0013
                    r0 = r12
                    HH.c$d$a$a r0 = (HH.C15812c.d.a.C3328a) r0
                    int r1 = r0.f135256d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f135256d = r1
                    goto L_0x0018
                L_0x0013:
                    HH.c$d$a$a r0 = new HH.c$d$a$a
                    r0.<init>(r10, r12)
                L_0x0018:
                    java.lang.Object r12 = r0.f135255c
                    java.lang.Object r7 = eI.C17187b.f()
                    int r1 = r0.f135256d
                    r8 = 2
                    r2 = 1
                    if (r1 == 0) goto L_0x003c
                    if (r1 == r2) goto L_0x0034
                    if (r1 != r8) goto L_0x002c
                    XH.y.b(r12)
                    goto L_0x0068
                L_0x002c:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L_0x0034:
                    java.lang.Object r11 = r0.f135257e
                    TJ.h r11 = (TJ.C16533h) r11
                    XH.y.b(r12)
                    goto L_0x005c
                L_0x003c:
                    XH.y.b(r12)
                    TJ.h r12 = r10.f135250a
                    r1 = r11
                    HH.e r1 = (HH.C15814e) r1
                    EH.c r11 = r10.f135251b
                    java.nio.charset.Charset r3 = r10.f135252c
                    OH.a r4 = r10.f135253d
                    java.lang.Object r5 = r10.f135254e
                    r0.f135257e = r12
                    r0.f135256d = r2
                    r2 = r11
                    r6 = r0
                    java.lang.Object r11 = r1.b(r2, r3, r4, r5, r6)
                    if (r11 != r7) goto L_0x0059
                    return r7
                L_0x0059:
                    r9 = r12
                    r12 = r11
                    r11 = r9
                L_0x005c:
                    r1 = 0
                    r0.f135257e = r1
                    r0.f135256d = r8
                    java.lang.Object r11 = r11.emit(r12, r0)
                    if (r11 != r7) goto L_0x0068
                    return r7
                L_0x0068:
                    XH.N r11 = XH.C16807N.f139792a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: HH.C15812c.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar, C15618c cVar, Charset charset, C16158a aVar, Object obj) {
            this.f135245a = gVar;
            this.f135246b = cVar;
            this.f135247c = charset;
            this.f135248d = aVar;
            this.f135249e = obj;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f135245a.collect(new a(hVar, this.f135246b, this.f135247c, this.f135248d, this.f135249e), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", f = "KotlinxSerializationConverter.kt", l = {59}, m = "serializeNullable")
    /* renamed from: HH.c$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f135259c;

        /* renamed from: d  reason: collision with root package name */
        Object f135260d;

        /* renamed from: e  reason: collision with root package name */
        Object f135261e;

        /* renamed from: f  reason: collision with root package name */
        Object f135262f;

        /* renamed from: g  reason: collision with root package name */
        Object f135263g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f135264h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C15812c f135265i;

        /* renamed from: j  reason: collision with root package name */
        int f135266j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C15812c cVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f135265i = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f135264h = obj;
            this.f135266j |= Integer.MIN_VALUE;
            return this.f135265i.b((C15618c) null, (Charset) null, (C16158a) null, (Object) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LFH/d;", "it", "", "<anonymous>", "(LFH/d;)Z"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serializeNullable$fromExtension$2", f = "KotlinxSerializationConverter.kt", l = {}, m = "invokeSuspend")
    /* renamed from: HH.c$f */
    static final class f extends l implements p<FH.d, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f135267c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f135268d;

        f(C17164e<? super f> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(eVar);
            fVar.f135268d = obj;
            return fVar;
        }

        /* renamed from: i */
        public final Object invoke(FH.d dVar, C17164e<? super Boolean> eVar) {
            return ((f) create(dVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f135267c == 0) {
                y.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(((FH.d) this.f135268d) != null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C15812c(C17262o oVar) {
        C17542s.j(oVar, "format");
        this.f135221a = oVar;
        this.f135222b = C15811b.a(oVar);
        if (!(oVar instanceof C17248a) && !(oVar instanceof C17246D)) {
            throw new IllegalArgumentException(("Only binary and string formats are supported, " + oVar + " is not supported.").toString());
        }
    }

    private final d.a c(KSerializer<?> kSerializer, C17262o oVar, Object obj, C15618c cVar, Charset charset) {
        if (oVar instanceof C17246D) {
            C17542s.h(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            return new FH.e(((C17246D) oVar).b(kSerializer, obj), C15620e.c(cVar, charset), (C15638w) null, 4, (DefaultConstructorMarker) null);
        } else if (oVar instanceof C17248a) {
            C17542s.h(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            return new C15683a(((C17248a) oVar).e(kSerializer, obj), cVar, (C15638w) null, 4, (DefaultConstructorMarker) null);
        } else {
            throw new IllegalStateException(("Unsupported format " + oVar).toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: io.ktor.utils.io.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: OH.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c3 A[Catch:{ all -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d0 A[Catch:{ all -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.nio.charset.Charset r12, OH.C16158a r13, io.ktor.utils.io.g r14, dI.C17164e<java.lang.Object> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof HH.C15812c.b
            if (r0 == 0) goto L_0x0014
            r0 = r15
            HH.c$b r0 = (HH.C15812c.b) r0
            int r1 = r0.f135241i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f135241i = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            HH.c$b r0 = new HH.c$b
            r0.<init>(r11, r15)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r15 = r4.f135239g
            java.lang.Object r0 = eI.C17187b.f()
            int r1 = r4.f135241i
            r7 = 2
            r8 = 1
            r9 = 0
            if (r1 == 0) goto L_0x005d
            if (r1 == r8) goto L_0x0044
            if (r1 != r7) goto L_0x003c
            java.lang.Object r12 = r4.f135237e
            kotlinx.serialization.KSerializer r12 = (kotlinx.serialization.KSerializer) r12
            java.lang.Object r13 = r4.f135236d
            java.nio.charset.Charset r13 = (java.nio.charset.Charset) r13
            java.lang.Object r14 = r4.f135235c
            HH.c r14 = (HH.C15812c) r14
            XH.y.b(r15)
            goto L_0x00ba
        L_0x003c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0044:
            java.lang.Object r12 = r4.f135238f
            r14 = r12
            io.ktor.utils.io.g r14 = (io.ktor.utils.io.g) r14
            java.lang.Object r12 = r4.f135237e
            r13 = r12
            OH.a r13 = (OH.C16158a) r13
            java.lang.Object r12 = r4.f135236d
            java.nio.charset.Charset r12 = (java.nio.charset.Charset) r12
            java.lang.Object r1 = r4.f135235c
            HH.c r1 = (HH.C15812c) r1
            XH.y.b(r15)
            r10 = r1
            r1 = r14
            r14 = r10
            goto L_0x0085
        L_0x005d:
            XH.y.b(r15)
            java.util.List<HH.e> r15 = r11.f135222b
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            TJ.g r15 = TJ.C16534i.a(r15)
            HH.c$a r1 = new HH.c$a
            r1.<init>(r15, r12, r13, r14)
            HH.c$c r15 = new HH.c$c
            r15.<init>(r14, r9)
            r4.f135235c = r11
            r4.f135236d = r12
            r4.f135237e = r13
            r4.f135238f = r14
            r4.f135241i = r8
            java.lang.Object r15 = TJ.C16534i.E(r1, r15, r4)
            if (r15 != r0) goto L_0x0083
            return r0
        L_0x0083:
            r1 = r14
            r14 = r11
        L_0x0085:
            java.util.List<HH.e> r2 = r14.f135222b
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0098
            if (r15 != 0) goto L_0x0097
            boolean r2 = r1.m()
            if (r2 == 0) goto L_0x0098
        L_0x0097:
            return r15
        L_0x0098:
            fK.o r15 = r14.f135221a
            mK.d r15 = r15.a()
            kotlinx.serialization.KSerializer r13 = HH.C15816g.d(r15, r13)
            r4.f135235c = r14
            r4.f135236d = r12
            r4.f135237e = r13
            r4.f135238f = r9
            r4.f135241i = r7
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r15 = io.ktor.utils.io.g.b.a(r1, r2, r4, r5, r6)
            if (r15 != r0) goto L_0x00b7
            return r0
        L_0x00b7:
            r10 = r13
            r13 = r12
            r12 = r10
        L_0x00ba:
            RH.k r15 = (RH.k) r15
            fK.o r0 = r14.f135221a     // Catch:{ all -> 0x00ce }
            boolean r1 = r0 instanceof fK.C17246D     // Catch:{ all -> 0x00ce }
            r2 = 0
            if (r1 == 0) goto L_0x00d0
            fK.D r0 = (fK.C17246D) r0     // Catch:{ all -> 0x00ce }
            java.lang.String r13 = RH.w.e(r15, r13, r2, r7, r9)     // Catch:{ all -> 0x00ce }
            java.lang.Object r12 = r0.c(r12, r13)     // Catch:{ all -> 0x00ce }
            goto L_0x00de
        L_0x00ce:
            r12 = move-exception
            goto L_0x00ff
        L_0x00d0:
            boolean r13 = r0 instanceof fK.C17248a     // Catch:{ all -> 0x00ce }
            if (r13 == 0) goto L_0x00df
            fK.a r0 = (fK.C17248a) r0     // Catch:{ all -> 0x00ce }
            byte[] r13 = RH.w.c(r15, r2, r8, r9)     // Catch:{ all -> 0x00ce }
            java.lang.Object r12 = r0.d(r12, r13)     // Catch:{ all -> 0x00ce }
        L_0x00de:
            return r12
        L_0x00df:
            RH.p.a(r15)     // Catch:{ all -> 0x00ce }
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ce }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r13.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r15 = "Unsupported format "
            r13.append(r15)     // Catch:{ all -> 0x00ce }
            fK.o r14 = r14.f135221a     // Catch:{ all -> 0x00ce }
            r13.append(r14)     // Catch:{ all -> 0x00ce }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x00ce }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x00ce }
            r12.<init>(r13)     // Catch:{ all -> 0x00ce }
            throw r12     // Catch:{ all -> 0x00ce }
        L_0x00ff:
            GH.e r13 = new GH.e
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Illegal input: "
            r14.append(r15)
            java.lang.String r15 = r12.getMessage()
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14, r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: HH.C15812c.a(java.nio.charset.Charset, OH.a, io.ktor.utils.io.g, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: OH.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.nio.charset.Charset} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080 A[SYNTHETIC, Splitter:B:19:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(EH.C15618c r11, java.nio.charset.Charset r12, OH.C16158a r13, java.lang.Object r14, dI.C17164e<? super FH.d> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof HH.C15812c.e
            if (r0 == 0) goto L_0x0013
            r0 = r15
            HH.c$e r0 = (HH.C15812c.e) r0
            int r1 = r0.f135266j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f135266j = r1
            goto L_0x0018
        L_0x0013:
            HH.c$e r0 = new HH.c$e
            r0.<init>(r10, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f135264h
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f135266j
            r3 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 != r3) goto L_0x0041
            java.lang.Object r14 = r0.f135263g
            java.lang.Object r11 = r0.f135262f
            r13 = r11
            OH.a r13 = (OH.C16158a) r13
            java.lang.Object r11 = r0.f135261e
            r12 = r11
            java.nio.charset.Charset r12 = (java.nio.charset.Charset) r12
            java.lang.Object r11 = r0.f135260d
            EH.c r11 = (EH.C15618c) r11
            java.lang.Object r0 = r0.f135259c
            HH.c r0 = (HH.C15812c) r0
            XH.y.b(r15)
            r6 = r11
            r7 = r12
            r5 = r14
            r2 = r0
            goto L_0x007b
        L_0x0041:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0049:
            XH.y.b(r15)
            java.util.List<HH.e> r15 = r10.f135222b
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            TJ.g r5 = TJ.C16534i.a(r15)
            HH.c$d r15 = new HH.c$d
            r4 = r15
            r6 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            HH.c$f r2 = new HH.c$f
            r4 = 0
            r2.<init>(r4)
            r0.f135259c = r10
            r0.f135260d = r11
            r0.f135261e = r12
            r0.f135262f = r13
            r0.f135263g = r14
            r0.f135266j = r3
            java.lang.Object r15 = TJ.C16534i.E(r15, r2, r0)
            if (r15 != r1) goto L_0x0077
            return r1
        L_0x0077:
            r2 = r10
            r6 = r11
            r7 = r12
            r5 = r14
        L_0x007b:
            FH.d r15 = (FH.d) r15
            if (r15 == 0) goto L_0x0080
            return r15
        L_0x0080:
            fK.o r11 = r2.f135221a     // Catch:{ q -> 0x008c }
            mK.d r11 = r11.a()     // Catch:{ q -> 0x008c }
            kotlinx.serialization.KSerializer r11 = HH.C15816g.d(r11, r13)     // Catch:{ q -> 0x008c }
        L_0x008a:
            r3 = r11
            goto L_0x0097
        L_0x008c:
            fK.o r11 = r2.f135221a
            mK.d r11 = r11.a()
            kotlinx.serialization.KSerializer r11 = HH.C15816g.b(r5, r11)
            goto L_0x008a
        L_0x0097:
            fK.o r4 = r2.f135221a
            FH.d$a r11 = r2.c(r3, r4, r5, r6, r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: HH.C15812c.b(EH.c, java.nio.charset.Charset, OH.a, java.lang.Object, dI.e):java.lang.Object");
    }
}
