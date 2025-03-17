package vH;

import AH.C15412c;
import AH.C15415f;
import BH.C15459d;
import BH.C15461f;
import EH.C15618c;
import EH.C15620e;
import EH.C15628m;
import EH.C15631p;
import EH.C15634s;
import EH.C15635t;
import EH.C15638w;
import HJ.C15838d;
import JH.C15954a;
import NH.e;
import OH.C16158a;
import QH.C16246a;
import RH.k;
import RH.n;
import RH.w;
import XH.C16807N;
import XH.v;
import XH.y;
import bI.C17035a;
import dI.C17164e;
import eI.C17187b;
import io.ktor.utils.io.g;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.C17642l;
import nI.q;
import org.slf4j.Logger;
import pH.C17746a;
import qH.C17777b;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0002\u001f!BO\b\u0000\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\n\u0010\n\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\n\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010$\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#¨\u0006%"}, d2 = {"LvH/o;", "", "", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charsets", "", "", "charsetQuality", "sendCharset", "responseCharsetFallback", "<init>", "(Ljava/util/Set;Ljava/util/Map;Ljava/nio/charset/Charset;Ljava/nio/charset/Charset;)V", "LAH/c;", "request", "", "content", "LEH/c;", "requestContentType", "e", "(LAH/c;Ljava/lang/String;LEH/c;)Ljava/lang/Object;", "LqH/b;", "call", "LRH/n;", "body", "d", "(LqH/b;LRH/n;)Ljava/lang/String;", "context", "LXH/N;", "c", "(LAH/c;)V", "a", "Ljava/nio/charset/Charset;", "b", "requestCharset", "Ljava/lang/String;", "acceptCharsetHeader", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: vH.o  reason: case insensitive filesystem */
public final class C18176o {

    /* renamed from: d  reason: collision with root package name */
    public static final b f148942d = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C15954a<C18176o> f148943e = new C15954a<>("HttpPlainText");

    /* renamed from: a  reason: collision with root package name */
    private final Charset f148944a;

    /* renamed from: b  reason: collision with root package name */
    private final Charset f148945b;

    /* renamed from: c  reason: collision with root package name */
    private final String f148946c;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0007\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000b\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR*\u0010\u0010\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\r0\f8\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0007\u0010\u000fR*\u0010\u0017\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u0019\u001a\u00060\u0005j\u0002`\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014\"\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"LvH/o$a;", "", "<init>", "()V", "", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "a", "Ljava/util/Set;", "b", "()Ljava/util/Set;", "charsets", "", "", "Ljava/util/Map;", "()Ljava/util/Map;", "charsetQuality", "c", "Ljava/nio/charset/Charset;", "d", "()Ljava/nio/charset/Charset;", "setSendCharset", "(Ljava/nio/charset/Charset;)V", "sendCharset", "setResponseCharsetFallback", "responseCharsetFallback", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vH.o$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Charset> f148947a = new LinkedHashSet();

        /* renamed from: b  reason: collision with root package name */
        private final Map<Charset, Float> f148948b = new LinkedHashMap();

        /* renamed from: c  reason: collision with root package name */
        private Charset f148949c;

        /* renamed from: d  reason: collision with root package name */
        private Charset f148950d = C15838d.f135279b;

        public final Map<Charset, Float> a() {
            return this.f148948b;
        }

        public final Set<Charset> b() {
            return this.f148947a;
        }

        public final Charset c() {
            return this.f148950d;
        }

        public final Charset d() {
            return this.f148949c;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LvH/o$b;", "LvH/m;", "LvH/o$a;", "LvH/o;", "<init>", "()V", "Lkotlin/Function1;", "LXH/N;", "block", "d", "(LnI/l;)LvH/o;", "plugin", "LpH/a;", "scope", "c", "(LvH/o;LpH/a;)V", "LJH/a;", "key", "LJH/a;", "getKey", "()LJH/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vH.o$b */
    public static final class b implements C18174m<a, C18176o> {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNH/e;", "", "LAH/c;", "content", "LXH/N;", "<anonymous>", "(LNH/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "io.ktor.client.plugins.HttpPlainText$Plugin$install$1", f = "HttpPlainText.kt", l = {130}, m = "invokeSuspend")
        /* renamed from: vH.o$b$a */
        static final class a extends l implements q<e<Object, C15412c>, Object, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f148951c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f148952d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f148953e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C18176o f148954f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C18176o oVar, C17164e<? super a> eVar) {
                super(3, eVar);
                this.f148954f = oVar;
            }

            /* renamed from: i */
            public final Object invoke(e<Object, C15412c> eVar, Object obj, C17164e<? super C16807N> eVar2) {
                a aVar = new a(this.f148954f, eVar2);
                aVar.f148952d = eVar;
                aVar.f148953e = obj;
                return aVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f148951c;
                if (i10 == 0) {
                    y.b(obj);
                    e eVar = (e) this.f148952d;
                    Object obj2 = this.f148953e;
                    this.f148954f.c((C15412c) eVar.b());
                    if (!(obj2 instanceof String)) {
                        return C16807N.f139792a;
                    }
                    C15618c d10 = C15635t.d((C15634s) eVar.b());
                    if (d10 != null && !C17542s.e(d10.e(), C15618c.C3303c.f134012a.a().e())) {
                        return C16807N.f139792a;
                    }
                    Object b10 = this.f148954f.e((C15412c) eVar.b(), (String) obj2, d10);
                    this.f148952d = null;
                    this.f148951c = 1;
                    if (eVar.f(b10, this) == f10) {
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

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNH/e;", "LBH/d;", "LqH/b;", "<name for destructuring parameter 0>", "LXH/N;", "<anonymous>", "(LNH/e;LBH/d;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "io.ktor.client.plugins.HttpPlainText$Plugin$install$2", f = "HttpPlainText.kt", l = {136, 138}, m = "invokeSuspend")
        /* renamed from: vH.o$b$b  reason: collision with other inner class name */
        static final class C4294b extends l implements q<e<C15459d, C17777b>, C15459d, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f148955c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f148956d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f148957e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C18176o f148958f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4294b(C18176o oVar, C17164e<? super C4294b> eVar) {
                super(3, eVar);
                this.f148958f = oVar;
            }

            /* renamed from: i */
            public final Object invoke(e<C15459d, C17777b> eVar, C15459d dVar, C17164e<? super C16807N> eVar2) {
                C4294b bVar = new C4294b(this.f148958f, eVar2);
                bVar.f148956d = eVar;
                bVar.f148957e = dVar;
                return bVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                e eVar;
                C16158a aVar;
                Object f10 = C17187b.f();
                int i10 = this.f148955c;
                if (i10 == 0) {
                    y.b(obj);
                    e eVar2 = (e) this.f148956d;
                    C15459d dVar = (C15459d) this.f148957e;
                    C16158a a10 = dVar.a();
                    Object b10 = dVar.b();
                    if (!C17542s.e(a10.b(), P.b(String.class)) || !(b10 instanceof g)) {
                        return C16807N.f139792a;
                    }
                    this.f148956d = eVar2;
                    this.f148957e = a10;
                    this.f148955c = 1;
                    Object a11 = g.b.a((g) b10, 0, this, 1, (Object) null);
                    if (a11 == f10) {
                        return f10;
                    }
                    eVar = eVar2;
                    obj = a11;
                    aVar = a10;
                } else if (i10 == 1) {
                    aVar = (C16158a) this.f148957e;
                    eVar = (e) this.f148956d;
                    y.b(obj);
                } else if (i10 == 2) {
                    y.b(obj);
                    return C16807N.f139792a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C15459d dVar2 = new C15459d(aVar, this.f148958f.d((C17777b) eVar.b(), (k) obj));
                this.f148956d = null;
                this.f148957e = null;
                this.f148955c = 2;
                if (eVar.f(dVar2, this) == f10) {
                    return f10;
                }
                return C16807N.f139792a;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public void b(C18176o oVar, C17746a aVar) {
            C17542s.j(oVar, "plugin");
            C17542s.j(aVar, "scope");
            aVar.i().l(C15415f.f132953h.b(), new a(oVar, (C17164e<? super a>) null));
            aVar.l().l(C15461f.f133245h.c(), new C4294b(oVar, (C17164e<? super C4294b>) null));
        }

        /* renamed from: d */
        public C18176o a(C17642l<? super a, C16807N> lVar) {
            C17542s.j(lVar, "block");
            a aVar = new a();
            lVar.invoke(aVar);
            return new C18176o(aVar.b(), aVar.a(), aVar.d(), aVar.c());
        }

        public C15954a<C18176o> getKey() {
            return C18176o.f148943e;
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: vH.o$c */
    public static final class c<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(C16246a.i((Charset) t10), C16246a.i((Charset) t11));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: vH.o$d */
    public static final class d<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e((Float) ((v) t11).d(), (Float) ((v) t10).d());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.nio.charset.Charset} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18176o(java.util.Set<? extends java.nio.charset.Charset> r9, java.util.Map<java.nio.charset.Charset, java.lang.Float> r10, java.nio.charset.Charset r11, java.nio.charset.Charset r12) {
        /*
            r8 = this;
            java.lang.String r0 = "charsets"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "charsetQuality"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "responseCharsetFallback"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            r8.<init>()
            r8.f148944a = r12
            java.util.List r12 = YH.X.B(r10)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            vH.o$d r0 = new vH.o$d
            r0.<init>()
            java.util.List r12 = YH.C16877v.g1(r12, r0)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x002e:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r9.next()
            r2 = r1
            java.nio.charset.Charset r2 = (java.nio.charset.Charset) r2
            boolean r2 = r10.containsKey(r2)
            if (r2 != 0) goto L_0x002e
            r0.add(r1)
            goto L_0x002e
        L_0x0045:
            vH.o$c r9 = new vH.o$c
            r9.<init>()
            java.util.List r9 = YH.C16877v.g1(r0, r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r0 = r9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x005a:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = ","
            if (r1 == 0) goto L_0x0079
            java.lang.Object r1 = r0.next()
            java.nio.charset.Charset r1 = (java.nio.charset.Charset) r1
            int r3 = r10.length()
            if (r3 <= 0) goto L_0x0071
            r10.append(r2)
        L_0x0071:
            java.lang.String r1 = QH.C16246a.i(r1)
            r10.append(r1)
            goto L_0x005a
        L_0x0079:
            r0 = r12
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0080:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00e2
            java.lang.Object r1 = r0.next()
            XH.v r1 = (XH.v) r1
            java.lang.Object r3 = r1.a()
            java.nio.charset.Charset r3 = (java.nio.charset.Charset) r3
            java.lang.Object r1 = r1.b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r4 = r10.length()
            if (r4 <= 0) goto L_0x00a5
            r10.append(r2)
        L_0x00a5:
            double r4 = (double) r1
            r6 = 0
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x00da
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x00da
            r4 = 100
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = pI.C17752b.e(r4)
            double r4 = (double) r1
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 / r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = QH.C16246a.i(r3)
            r1.append(r3)
            java.lang.String r3 = ";q="
            r1.append(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r10.append(r1)
            goto L_0x0080
        L_0x00da:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Check failed."
            r9.<init>(r10)
            throw r9
        L_0x00e2:
            int r0 = r10.length()
            if (r0 != 0) goto L_0x00f1
            java.nio.charset.Charset r0 = r8.f148944a
            java.lang.String r0 = QH.C16246a.i(r0)
            r10.append(r0)
        L_0x00f1:
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.C17542s.i(r10, r0)
            r8.f148946c = r10
            if (r11 != 0) goto L_0x011d
            java.lang.Object r9 = YH.C16877v.y0(r9)
            r11 = r9
            java.nio.charset.Charset r11 = (java.nio.charset.Charset) r11
            if (r11 != 0) goto L_0x011d
            java.lang.Object r9 = YH.C16877v.y0(r12)
            XH.v r9 = (XH.v) r9
            if (r9 == 0) goto L_0x0117
            java.lang.Object r9 = r9.c()
            java.nio.charset.Charset r9 = (java.nio.charset.Charset) r9
        L_0x0115:
            r11 = r9
            goto L_0x0119
        L_0x0117:
            r9 = 0
            goto L_0x0115
        L_0x0119:
            if (r11 != 0) goto L_0x011d
            java.nio.charset.Charset r11 = HJ.C15838d.f135279b
        L_0x011d:
            r8.f148945b = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vH.C18176o.<init>(java.util.Set, java.util.Map, java.nio.charset.Charset, java.nio.charset.Charset):void");
    }

    /* access modifiers changed from: private */
    public final Object e(C15412c cVar, String str, C15618c cVar2) {
        Charset charset;
        C15618c a10 = cVar2 == null ? C15618c.C3303c.f134012a.a() : cVar2;
        if (cVar2 == null || (charset = C15620e.a(cVar2)) == null) {
            charset = this.f148945b;
        }
        Logger a11 = C18177p.f148959a;
        a11.trace("Sending request body to " + cVar.i() + " as text/plain with charset " + charset);
        return new FH.e(str, C15620e.b(a10, charset), (C15638w) null, 4, (DefaultConstructorMarker) null);
    }

    public final void c(C15412c cVar) {
        C17542s.j(cVar, "context");
        C15628m a10 = cVar.a();
        C15631p pVar = C15631p.f134088a;
        if (a10.j(pVar.d()) == null) {
            Logger a11 = C18177p.f148959a;
            a11.trace("Adding Accept-Charset=" + this.f148946c + " to " + cVar.i());
            cVar.a().m(pVar.d(), this.f148946c);
        }
    }

    public final String d(C17777b bVar, n nVar) {
        C17542s.j(bVar, "call");
        C17542s.j(nVar, "body");
        Charset a10 = C15635t.a(bVar.f());
        if (a10 == null) {
            a10 = this.f148944a;
        }
        Logger a11 = C18177p.f148959a;
        a11.trace("Reading response body for " + bVar.e().getUrl() + " as String with charset " + a10);
        return w.e(nVar, a10, 0, 2, (Object) null);
    }
}
