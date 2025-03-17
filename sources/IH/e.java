package IH;

import EH.C15618c;
import EH.C15620e;
import EH.C15638w;
import FH.C15684b;
import HH.C15814e;
import HH.C15816g;
import HJ.C15838d;
import OH.C16158a;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import io.ktor.utils.io.g;
import io.ktor.utils.io.j;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import nI.p;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001d\u001a\u0004\u0018\u00010\u00162\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR$\u0010#\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020!0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"LIH/e;", "LHH/e;", "LkK/c;", "format", "<init>", "(LkK/c;)V", "T", "LTJ/g;", "Lkotlinx/serialization/KSerializer;", "serializer", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "Lio/ktor/utils/io/j;", "channel", "LXH/N;", "e", "(LTJ/g;Lkotlinx/serialization/KSerializer;Ljava/nio/charset/Charset;Lio/ktor/utils/io/j;LdI/e;)Ljava/lang/Object;", "LEH/c;", "contentType", "LOH/a;", "typeInfo", "", "value", "LFH/d;", "b", "(LEH/c;Ljava/nio/charset/Charset;LOH/a;Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "Lio/ktor/utils/io/g;", "content", "a", "(Ljava/nio/charset/Charset;LOH/a;Lio/ktor/utils/io/g;LdI/e;)Ljava/lang/Object;", "LkK/c;", "", "LIH/a;", "Ljava/util/Map;", "jsonArraySymbolsMap", "ktor-serialization-kotlinx-json"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements C15814e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C17514c f135446a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Charset, C15890a> f135447b = new LinkedHashMap();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions", f = "KotlinxSerializationJsonExtensions.kt", l = {66}, m = "deserialize")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f135448c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f135449d;

        /* renamed from: e  reason: collision with root package name */
        int f135450e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, C17164e<? super a> eVar2) {
            super(eVar2);
            this.f135449d = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f135448c = obj;
            this.f135450e |= Integer.MIN_VALUE;
            return this.f135449d.a((Charset) null, (C16158a) null, (g) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"IH/e$b", "LTJ/h;", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "", "a", "I", "index", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements C16533h<T> {

        /* renamed from: a  reason: collision with root package name */
        private int f135451a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f135452b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C15890a f135453c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f135454d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ KSerializer f135455e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Charset f135456f;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @f(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1", f = "KotlinxSerializationJsonExtensions.kt", l = {124, 127}, m = "emit")
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f135457c;

            /* renamed from: d  reason: collision with root package name */
            int f135458d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ b f135459e;

            /* renamed from: f  reason: collision with root package name */
            Object f135460f;

            /* renamed from: g  reason: collision with root package name */
            Object f135461g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, C17164e eVar) {
                super(eVar);
                this.f135459e = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f135457c = obj;
                this.f135458d |= Integer.MIN_VALUE;
                return this.f135459e.emit(null, this);
            }
        }

        public b(j jVar, C15890a aVar, e eVar, KSerializer kSerializer, Charset charset) {
            this.f135452b = jVar;
            this.f135453c = aVar;
            this.f135454d = eVar;
            this.f135455e = kSerializer;
            this.f135456f = charset;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(T r8, dI.C17164e<? super XH.C16807N> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof IH.e.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                IH.e$b$a r0 = (IH.e.b.a) r0
                int r1 = r0.f135458d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f135458d = r1
                goto L_0x0018
            L_0x0013:
                IH.e$b$a r0 = new IH.e$b$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f135457c
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f135458d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0043
                if (r2 == r4) goto L_0x0039
                if (r2 != r3) goto L_0x0031
                java.lang.Object r8 = r0.f135460f
                IH.e$b r8 = (IH.e.b) r8
                XH.y.b(r9)
                goto L_0x00aa
            L_0x0031:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0039:
                java.lang.Object r8 = r0.f135461g
                java.lang.Object r2 = r0.f135460f
                IH.e$b r2 = (IH.e.b) r2
                XH.y.b(r9)
                goto L_0x0066
            L_0x0043:
                XH.y.b(r9)
                int r9 = r7.f135451a
                int r2 = r9 + 1
                r7.f135451a = r2
                if (r9 < 0) goto L_0x00b2
                if (r9 <= 0) goto L_0x0069
                io.ktor.utils.io.j r9 = r7.f135452b
                IH.a r2 = r7.f135453c
                byte[] r2 = r2.c()
                r0.f135460f = r7
                r0.f135461g = r8
                r0.f135458d = r4
                java.lang.Object r9 = io.ktor.utils.io.k.b(r9, r2, r0)
                if (r9 != r1) goto L_0x0065
                return r1
            L_0x0065:
                r2 = r7
            L_0x0066:
                r9 = r8
                r8 = r2
                goto L_0x006b
            L_0x0069:
                r9 = r8
                r8 = r7
            L_0x006b:
                IH.e r2 = r8.f135454d
                kK.c r2 = r2.f135446a
                kotlinx.serialization.KSerializer r4 = r8.f135455e
                java.lang.String r9 = r2.b(r4, r9)
                io.ktor.utils.io.j r2 = r8.f135452b
                java.nio.charset.Charset r4 = r8.f135456f
                java.nio.charset.Charset r5 = HJ.C15838d.f135279b
                boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
                if (r4 == 0) goto L_0x0088
                byte[] r9 = HJ.C15854t.E(r9)
                goto L_0x009c
            L_0x0088:
                java.nio.charset.Charset r4 = r8.f135456f
                java.nio.charset.CharsetEncoder r4 = r4.newEncoder()
                java.lang.String r5 = "charset.newEncoder()"
                kotlin.jvm.internal.C17542s.i(r4, r5)
                r5 = 0
                int r6 = r9.length()
                byte[] r9 = QH.C16246a.g(r4, r9, r5, r6)
            L_0x009c:
                r0.f135460f = r8
                r4 = 0
                r0.f135461g = r4
                r0.f135458d = r3
                java.lang.Object r9 = io.ktor.utils.io.k.b(r2, r9, r0)
                if (r9 != r1) goto L_0x00aa
                return r1
            L_0x00aa:
                io.ktor.utils.io.j r8 = r8.f135452b
                r8.flush()
                XH.N r8 = XH.C16807N.f139792a
                return r8
            L_0x00b2:
                java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
                java.lang.String r9 = "Index overflow has happened"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: IH.e.b.emit(java.lang.Object, dI.e):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/j;", "LXH/N;", "<anonymous>", "(Lio/ktor/utils/io/j;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$2", f = "KotlinxSerializationJsonExtensions.kt", l = {51}, m = "invokeSuspend")
    static final class c extends l implements p<j, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f135462c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f135463d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f135464e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f135465f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ KSerializer<?> f135466g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Charset f135467h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar, Object obj, KSerializer<?> kSerializer, Charset charset, C17164e<? super c> eVar2) {
            super(2, eVar2);
            this.f135464e = eVar;
            this.f135465f = obj;
            this.f135466g = kSerializer;
            this.f135467h = charset;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f135464e, this.f135465f, this.f135466g, this.f135467h, eVar);
            cVar.f135463d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(j jVar, C17164e<? super C16807N> eVar) {
            return ((c) create(jVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f135462c;
            if (i10 == 0) {
                y.b(obj);
                e eVar = this.f135464e;
                Object obj2 = this.f135465f;
                C17542s.h(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<*>");
                C16532g gVar = (C16532g) obj2;
                KSerializer<?> kSerializer = this.f135466g;
                C17542s.h(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
                Charset charset = this.f135467h;
                this.f135462c = 1;
                if (eVar.e(gVar, kSerializer, charset, (j) this.f135463d, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions", f = "KotlinxSerializationJsonExtensions.kt", l = {80, 121, 89}, m = "serialize")
    static final class d<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f135468c;

        /* renamed from: d  reason: collision with root package name */
        Object f135469d;

        /* renamed from: e  reason: collision with root package name */
        Object f135470e;

        /* renamed from: f  reason: collision with root package name */
        Object f135471f;

        /* renamed from: g  reason: collision with root package name */
        Object f135472g;

        /* renamed from: h  reason: collision with root package name */
        Object f135473h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f135474i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ e f135475j;

        /* renamed from: k  reason: collision with root package name */
        int f135476k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar, C17164e<? super d> eVar2) {
            super(eVar2);
            this.f135475j = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f135474i = obj;
            this.f135476k |= Integer.MIN_VALUE;
            return this.f135475j.e((C16532g) null, (KSerializer) null, (Charset) null, (j) null, this);
        }
    }

    public e(C17514c cVar) {
        C17542s.j(cVar, "format");
        this.f135446a = cVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> java.lang.Object e(TJ.C16532g<? extends T> r19, kotlinx.serialization.KSerializer<T> r20, java.nio.charset.Charset r21, io.ktor.utils.io.j r22, dI.C17164e<? super XH.C16807N> r23) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            r2 = r22
            r3 = r23
            boolean r4 = r3 instanceof IH.e.d
            if (r4 == 0) goto L_0x001b
            r4 = r3
            IH.e$d r4 = (IH.e.d) r4
            int r5 = r4.f135476k
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f135476k = r5
            goto L_0x0020
        L_0x001b:
            IH.e$d r4 = new IH.e$d
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.f135474i
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r4.f135476k
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            if (r6 == 0) goto L_0x006f
            if (r6 == r9) goto L_0x004e
            if (r6 == r8) goto L_0x0041
            if (r6 != r7) goto L_0x0039
            XH.y.b(r3)
            goto L_0x00d5
        L_0x0039:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0041:
            java.lang.Object r1 = r4.f135469d
            IH.a r1 = (IH.C15890a) r1
            java.lang.Object r2 = r4.f135468c
            io.ktor.utils.io.j r2 = (io.ktor.utils.io.j) r2
            XH.y.b(r3)
            goto L_0x00c4
        L_0x004e:
            java.lang.Object r1 = r4.f135473h
            IH.a r1 = (IH.C15890a) r1
            java.lang.Object r2 = r4.f135472g
            io.ktor.utils.io.j r2 = (io.ktor.utils.io.j) r2
            java.lang.Object r6 = r4.f135471f
            java.nio.charset.Charset r6 = (java.nio.charset.Charset) r6
            java.lang.Object r9 = r4.f135470e
            kotlinx.serialization.KSerializer r9 = (kotlinx.serialization.KSerializer) r9
            java.lang.Object r11 = r4.f135469d
            TJ.g r11 = (TJ.C16532g) r11
            java.lang.Object r12 = r4.f135468c
            IH.e r12 = (IH.e) r12
            XH.y.b(r3)
            r17 = r6
            r16 = r9
            r15 = r12
            goto L_0x00a7
        L_0x006f:
            XH.y.b(r3)
            java.util.Map<java.nio.charset.Charset, IH.a> r3 = r0.f135447b
            java.lang.Object r6 = r3.get(r1)
            if (r6 != 0) goto L_0x0082
            IH.a r6 = new IH.a
            r6.<init>(r1)
            r3.put(r1, r6)
        L_0x0082:
            IH.a r6 = (IH.C15890a) r6
            byte[] r3 = r6.a()
            r4.f135468c = r0
            r11 = r19
            r4.f135469d = r11
            r12 = r20
            r4.f135470e = r12
            r4.f135471f = r1
            r4.f135472g = r2
            r4.f135473h = r6
            r4.f135476k = r9
            java.lang.Object r3 = io.ktor.utils.io.k.b(r2, r3, r4)
            if (r3 != r5) goto L_0x00a1
            return r5
        L_0x00a1:
            r15 = r0
            r17 = r1
            r1 = r6
            r16 = r12
        L_0x00a7:
            IH.e$b r3 = new IH.e$b
            r12 = r3
            r13 = r2
            r14 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r4.f135468c = r2
            r4.f135469d = r1
            r4.f135470e = r10
            r4.f135471f = r10
            r4.f135472g = r10
            r4.f135473h = r10
            r4.f135476k = r8
            java.lang.Object r3 = r11.collect(r3, r4)
            if (r3 != r5) goto L_0x00c4
            return r5
        L_0x00c4:
            byte[] r1 = r1.b()
            r4.f135468c = r10
            r4.f135469d = r10
            r4.f135476k = r7
            java.lang.Object r1 = io.ktor.utils.io.k.b(r2, r1, r4)
            if (r1 != r5) goto L_0x00d5
            return r5
        L_0x00d5:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: IH.e.e(TJ.g, kotlinx.serialization.KSerializer, java.nio.charset.Charset, io.ktor.utils.io.j, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.nio.charset.Charset r5, OH.C16158a r6, io.ktor.utils.io.g r7, dI.C17164e<java.lang.Object> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof IH.e.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            IH.e$a r0 = (IH.e.a) r0
            int r1 = r0.f135450e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f135450e = r1
            goto L_0x0018
        L_0x0013:
            IH.e$a r0 = new IH.e$a
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f135448c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f135450e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            XH.y.b(r8)     // Catch:{ all -> 0x0029 }
            goto L_0x005a
        L_0x0029:
            r5 = move-exception
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            XH.y.b(r8)
            java.nio.charset.Charset r8 = HJ.C15838d.f135279b
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r8)
            if (r5 == 0) goto L_0x0076
            uI.d r5 = r6.b()
            java.lang.Class<GJ.h> r8 = GJ.C15765h.class
            uI.d r8 = kotlin.jvm.internal.P.b(r8)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r8)
            if (r5 != 0) goto L_0x004f
            goto L_0x0076
        L_0x004f:
            kK.c r5 = r4.f135446a     // Catch:{ all -> 0x0029 }
            r0.f135450e = r3     // Catch:{ all -> 0x0029 }
            java.lang.Object r8 = IH.C15891b.a(r5, r7, r6, r0)     // Catch:{ all -> 0x0029 }
            if (r8 != r1) goto L_0x005a
            return r1
        L_0x005a:
            return r8
        L_0x005b:
            GH.e r6 = new GH.e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Illegal input: "
            r7.append(r8)
            java.lang.String r8 = r5.getMessage()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7, r5)
            throw r6
        L_0x0076:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: IH.e.a(java.nio.charset.Charset, OH.a, io.ktor.utils.io.g, dI.e):java.lang.Object");
    }

    public Object b(C15618c cVar, Charset charset, C16158a aVar, Object obj, C17164e<? super FH.d> eVar) {
        if (!C17542s.e(charset, C15838d.f135279b) || !C17542s.e(aVar.b(), P.b(C16532g.class))) {
            return null;
        }
        return new C15684b(new c(this, obj, C15816g.d(this.f135446a.a(), f.a(aVar)), charset, (C17164e<? super c>) null), C15620e.c(cVar, charset), (C15638w) null, (Long) null, 12, (DefaultConstructorMarker) null);
    }
}
