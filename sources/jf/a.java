package Jf;

import GK.C15786e;
import GK.C15804w;
import GK.z;
import HJ.C15854t;
import QL.C16362e;
import QL.h;
import QL.y;
import VK.C16697a;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 62\u00020\u0001:\u0001\u0019BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020!0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R0\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010.\u001a\u0004\b/\u00100R\u001b\u00105\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u00104R\u001b\u00107\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b6\u00104¨\u00068"}, d2 = {"LJf/a;", "", "", "baseUrl", "LGK/z$a;", "okHttpClientBuilder", "LGK/e$a;", "callFactory", "", "LQL/e$a;", "callAdapterFactories", "LQL/h$a;", "converterFactories", "<init>", "(Ljava/lang/String;LGK/z$a;LGK/e$a;Ljava/util/List;Ljava/util/List;)V", "LXH/N;", "n", "()V", "S", "Ljava/lang/Class;", "serviceClass", "h", "(Ljava/lang/Class;)Ljava/lang/Object;", "a", "Ljava/lang/String;", "b", "LGK/z$a;", "c", "LGK/e$a;", "d", "Ljava/util/List;", "e", "", "LGK/w;", "f", "Ljava/util/Map;", "apiAuthorizations", "Lkotlin/Function1;", "g", "LnI/l;", "l", "()LnI/l;", "setLogger", "(LnI/l;)V", "logger", "LQL/y$b;", "LXH/o;", "m", "()LQL/y$b;", "retrofitBuilder", "i", "j", "()LGK/z$a;", "clientBuilder", "k", "defaultClientBuilder", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* renamed from: k  reason: collision with root package name */
    public static final b f61271k = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final String f61272l = "com.ingka.ikea.app.caasremote.baseUrl";
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final C16824o<String> f61273m = C16825p.b(C1014a.f61284c);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f61274a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final z.a f61275b;

    /* renamed from: c  reason: collision with root package name */
    private final C15786e.a f61276c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final List<C16362e.a> f61277d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final List<h.a> f61278e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, C15804w> f61279f;

    /* renamed from: g  reason: collision with root package name */
    private C17642l<? super String, C16807N> f61280g;

    /* renamed from: h  reason: collision with root package name */
    private final C16824o f61281h;

    /* renamed from: i  reason: collision with root package name */
    private final C16824o f61282i;

    /* renamed from: j  reason: collision with root package name */
    private final C16824o f61283j;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "kotlin.jvm.PlatformType", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: Jf.a$a  reason: collision with other inner class name */
    static final class C1014a extends C17544u implements C17631a<String> {

        /* renamed from: c  reason: collision with root package name */
        public static final C1014a f61284c = new C1014a();

        C1014a() {
            super(0);
        }

        /* renamed from: b */
        public final String invoke() {
            return System.getProperties().getProperty(a.i(), "https://stage.cart.caas.selling.ingka.com");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0004XD¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR!\u0010\u000e\u001a\u00020\u00048FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\b¨\u0006\u000f"}, d2 = {"LJf/a$b;", "", "<init>", "()V", "", "baseUrlKey", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "getBaseUrlKey$annotations", "defaultBasePath$delegate", "LXH/o;", "b", "getDefaultBasePath$annotations", "defaultBasePath", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: protected */
        public final String a() {
            return a.f61272l;
        }

        public final String b() {
            Object value = a.f61273m.getValue();
            C17542s.i(value, "getValue(...)");
            return (String) value;
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LGK/z$a;", "b", "()LGK/z$a;"}, k = 3, mv = {1, 9, 0})
    static final class c extends C17544u implements C17631a<z.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f61285c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.f61285c = aVar;
        }

        /* renamed from: b */
        public final z.a invoke() {
            z.a g10 = this.f61285c.f61275b;
            return g10 == null ? this.f61285c.k() : g10;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LGK/z$a;", "b", "()LGK/z$a;"}, k = 3, mv = {1, 9, 0})
    static final class d extends C17544u implements C17631a<z.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f61286c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.f61286c = aVar;
        }

        /* access modifiers changed from: private */
        public static final void c(a aVar, String str) {
            C17542s.j(aVar, "this$0");
            C17542s.j(str, "message");
            C17642l<String, C16807N> l10 = aVar.l();
            if (l10 != null) {
                l10.invoke(str);
            }
        }

        /* renamed from: b */
        public final z.a invoke() {
            z.a H10 = new z().H();
            C16697a aVar = new C16697a(new b(this.f61286c));
            aVar.b(C16697a.C3418a.BODY);
            return H10.a(aVar);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQL/y$b;", "kotlin.jvm.PlatformType", "b", "()LQL/y$b;"}, k = 3, mv = {1, 9, 0})
    static final class e extends C17544u implements C17631a<y.b> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f61287c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(0);
            this.f61287c = aVar;
        }

        /* renamed from: b */
        public final y.b invoke() {
            y.b d10 = new y.b().d(this.f61287c.f61274a);
            for (C16362e.a a10 : this.f61287c.f61277d) {
                d10.a(a10);
            }
            for (h.a b10 : this.f61287c.f61278e) {
                d10.b(b10);
            }
            return d10;
        }
    }

    public a(String str, z.a aVar, C15786e.a aVar2, List<? extends C16362e.a> list, List<? extends h.a> list2) {
        C17542s.j(str, "baseUrl");
        C17542s.j(list, "callAdapterFactories");
        C17542s.j(list2, "converterFactories");
        this.f61274a = str;
        this.f61275b = aVar;
        this.f61276c = aVar2;
        this.f61277d = list;
        this.f61278e = list2;
        this.f61279f = new LinkedHashMap();
        this.f61281h = C16825p.b(new e(this));
        this.f61282i = C16825p.b(new c(this));
        this.f61283j = C16825p.b(new d(this));
        n();
    }

    protected static final String i() {
        return f61271k.a();
    }

    private final z.a j() {
        return (z.a) this.f61282i.getValue();
    }

    /* access modifiers changed from: private */
    public final z.a k() {
        return (z.a) this.f61283j.getValue();
    }

    private final y.b m() {
        Object value = this.f61281h.getValue();
        C17542s.i(value, "getValue(...)");
        return (y.b) value;
    }

    private final void n() {
        if (!C15854t.G(this.f61274a, "/", false, 2, (Object) null)) {
            String str = this.f61274a;
            this.f61274a = str + "/";
        }
    }

    public final <S> S h(Class<S> cls) {
        C17542s.j(cls, "serviceClass");
        C15786e.a aVar = this.f61276c;
        if (aVar == null) {
            aVar = j().c();
        }
        return m().f(aVar).e().b(cls);
    }

    public final C17642l<String, C16807N> l() {
        return this.f61280g;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(java.lang.String r8, GK.z.a r9, GK.C15786e.a r10, java.util.List r11, java.util.List r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r7 = this;
            r14 = 2
            r0 = 1
            r1 = r13 & 1
            if (r1 == 0) goto L_0x000c
            Jf.a$b r8 = f61271k
            java.lang.String r8 = r8.b()
        L_0x000c:
            r2 = r8
            r8 = r13 & 2
            r1 = 0
            if (r8 == 0) goto L_0x0014
            r3 = r1
            goto L_0x0015
        L_0x0014:
            r3 = r9
        L_0x0015:
            r8 = r13 & 4
            if (r8 == 0) goto L_0x001b
            r4 = r1
            goto L_0x001c
        L_0x001b:
            r4 = r10
        L_0x001c:
            r8 = r13 & 8
            if (r8 == 0) goto L_0x0024
            java.util.List r11 = YH.C16877v.n()
        L_0x0024:
            r5 = r11
            r8 = r13 & 16
            if (r8 == 0) goto L_0x004d
            UL.k r8 = UL.k.f()
            java.lang.String r9 = "create(...)"
            kotlin.jvm.internal.C17542s.i(r8, r9)
            kK.c r9 = Jf.k.b()
            GK.x$a r10 = GK.C15805x.f135130e
            java.lang.String r11 = "application/json"
            GK.x r10 = r10.a(r11)
            QL.h$a r9 = SL.C16454c.a(r9, r10)
            QL.h$a[] r10 = new QL.h.a[r14]
            r11 = 0
            r10[r11] = r8
            r10[r0] = r9
            java.util.List r12 = YH.C16877v.q(r10)
        L_0x004d:
            r6 = r12
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Jf.a.<init>(java.lang.String, GK.z$a, GK.e$a, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
