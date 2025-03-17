package sL;

import YH.C16869m;
import gL.C17295a;
import java.util.ArrayList;
import kL.C17520a;
import kL.C17524e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import mL.C17618b;
import nI.C17631a;
import nL.C17685b;
import nL.C17686c;
import pL.C17770a;
import qL.C17844a;
import uI.C18055d;
import uL.C18149a;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJA\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\u0004\u0018\u0001`\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JN\u0010\u001a\u001a\u0004\b\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\u0004\u0018\u0001`\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJC\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\u0004\u0018\u0001`\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010 \u001a\u00020\u001f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002¢\u0006\u0004\b \u0010!JE\u0010\"\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\"\u0010\u001eJC\u0010#\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b#\u0010\u001eJ\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b*\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\u000b\u001a\u00020\n8\u0000X\u0004¢\u0006\u0012\n\u0004\b\"\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R$\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u000003j\b\u0012\u0004\u0012\u00020\u0000`48\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u00105R*\u0010=\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b,\u00107\u0012\u0004\b<\u00102\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\u000103j\b\u0012\u0004\u0012\u00020\u0001`48\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u00105R<\u0010F\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130@0?j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130@`A8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010B\u0012\u0004\bE\u00102\u001a\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010+\u0002\u0004\n\u0002\b9¨\u0006H"}, d2 = {"LsL/a;", "", "Lorg/koin/mp/Lockable;", "LqL/a;", "scopeQualifier", "", "Lorg/koin/core/scope/ScopeID;", "id", "", "isRoot", "LgL/a;", "_koin", "<init>", "(LqL/a;Ljava/lang/String;ZLgL/a;)V", "T", "qualifier", "LuI/d;", "clazz", "Lkotlin/Function0;", "LpL/a;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameterDef", "g", "(LqL/a;LuI/d;LnI/a;)Ljava/lang/Object;", "LmL/b;", "instanceContext", "h", "(LqL/a;LuI/d;LmL/b;LnI/a;)Ljava/lang/Object;", "parameters", "a", "(LuI/d;LqL/a;LnI/a;)Ljava/lang/Object;", "", "i", "(LqL/a;LuI/d;)Ljava/lang/Void;", "d", "b", "toString", "()Ljava/lang/String;", "LqL/a;", "e", "()LqL/a;", "Ljava/lang/String;", "c", "Z", "f", "()Z", "LgL/a;", "get_koin", "()LgL/a;", "get_koin$annotations", "()V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "linkedScopes", "Ljava/lang/Object;", "get_source", "()Ljava/lang/Object;", "set_source", "(Ljava/lang/Object;)V", "get_source$annotations", "_source", "_callbacks", "Ljava/lang/ThreadLocal;", "LYH/m;", "Lorg/koin/mp/ThreadLocal;", "Ljava/lang/ThreadLocal;", "get_parameterStackLocal", "()Ljava/lang/ThreadLocal;", "get_parameterStackLocal$annotations", "_parameterStackLocal", "_closed", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sL.a  reason: case insensitive filesystem */
public final class C17952a {

    /* renamed from: a  reason: collision with root package name */
    private final C17844a f147179a;

    /* renamed from: b  reason: collision with root package name */
    private final String f147180b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f147181c;

    /* renamed from: d  reason: collision with root package name */
    private final C17295a f147182d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList<C17952a> f147183e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private Object f147184f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<Object> f147185g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private final ThreadLocal<C16869m<C17770a>> f147186h = new ThreadLocal<>();

    /* renamed from: i  reason: collision with root package name */
    private boolean f147187i;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: sL.a$a  reason: collision with other inner class name */
    static final class C4280a extends C17544u implements C17631a<String> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17770a f147188c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4280a(C17770a aVar) {
            super(0);
            this.f147188c = aVar;
        }

        /* renamed from: b */
        public final String invoke() {
            return "| >> parameters " + this.f147188c + ' ';
        }
    }

    public C17952a(C17844a aVar, String str, boolean z10, C17295a aVar2) {
        C17542s.j(aVar, "scopeQualifier");
        C17542s.j(str, "id");
        C17542s.j(aVar2, "_koin");
        this.f147179a = aVar;
        this.f147180b = str;
        this.f147181c = z10;
        this.f147182d = aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0007 A[LOOP:0: B:1:0x0007->B:4:0x0017, LOOP_START, PHI: r1 
      PHI: (r1v1 T) = (r1v0 T), (r1v5 T) binds: [B:0:0x0000, B:4:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> T a(uI.C18055d<?> r4, qL.C17844a r5, nI.C17631a<? extends pL.C17770a> r6) {
        /*
            r3 = this;
            java.util.ArrayList<sL.a> r0 = r3.f147183e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0007:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0019
            java.lang.Object r1 = r0.next()
            sL.a r1 = (sL.C17952a) r1
            java.lang.Object r1 = r1.d(r4, r5, r6)
            if (r1 == 0) goto L_0x0007
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sL.C17952a.a(uI.d, qL.a, nI.a):java.lang.Object");
    }

    private final <T> T g(C17844a aVar, C18055d<?> dVar, C17631a<? extends C17770a> aVar2) {
        if (!this.f147187i) {
            C16869m mVar = null;
            C17770a aVar3 = aVar2 != null ? (C17770a) aVar2.invoke() : null;
            if (aVar3 != null) {
                this.f147182d.c().g(C17685b.DEBUG, new C4280a(aVar3));
                mVar = this.f147186h.get();
                if (mVar == null) {
                    mVar = new C16869m();
                    this.f147186h.set(mVar);
                }
                mVar.addFirst(aVar3);
            }
            T h10 = h(aVar, dVar, new C17618b(this.f147182d.c(), this, aVar3), aVar2);
            if (mVar != null) {
                this.f147182d.c().a("| << parameters");
                mVar.D();
            }
            return h10;
        }
        throw new C17520a("Scope '" + this.f147180b + "' is closed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0044, code lost:
        r8 = (pL.C17770a) r8.q();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> T h(qL.C17844a r6, uI.C18055d<?> r7, mL.C17618b r8, nI.C17631a<? extends pL.C17770a> r9) {
        /*
            r5 = this;
            gL.a r0 = r5.f147182d
            rL.a r0 = r0.b()
            qL.a r1 = r5.f147179a
            java.lang.Object r8 = r0.g(r6, r7, r1, r8)
            if (r8 != 0) goto L_0x00dc
            gL.a r8 = r5.f147182d
            nL.c r8 = r8.c()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "|- ? t:'"
            r0.append(r1)
            java.lang.String r2 = uL.C18149a.a(r7)
            r0.append(r2)
            java.lang.String r2 = "' - q:'"
            r0.append(r2)
            r0.append(r6)
            java.lang.String r3 = "' look in injected parameters"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r8.a(r0)
            java.lang.ThreadLocal<YH.m<pL.a>> r8 = r5.f147186h
            java.lang.Object r8 = r8.get()
            YH.m r8 = (YH.C16869m) r8
            r0 = 0
            if (r8 == 0) goto L_0x0051
            java.lang.Object r8 = r8.q()
            pL.a r8 = (pL.C17770a) r8
            if (r8 == 0) goto L_0x0051
            java.lang.Object r8 = r8.c(r7)
            goto L_0x0052
        L_0x0051:
            r8 = r0
        L_0x0052:
            if (r8 != 0) goto L_0x00dc
            boolean r8 = r5.f147181c
            if (r8 != 0) goto L_0x0091
            gL.a r8 = r5.f147182d
            nL.c r8 = r8.c()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r4 = uL.C18149a.a(r7)
            r3.append(r4)
            r3.append(r2)
            r3.append(r6)
            java.lang.String r4 = "' look at scope source"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r8.a(r3)
            java.lang.Object r8 = r5.f147184f
            if (r8 == 0) goto L_0x0091
            boolean r8 = r7.s(r8)
            if (r8 == 0) goto L_0x0091
            if (r6 != 0) goto L_0x0091
            java.lang.Object r8 = r5.f147184f
            if (r8 != 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r0 = r8
        L_0x0091:
            r8 = r0
            if (r8 != 0) goto L_0x00dc
            gL.a r8 = r5.f147182d
            nL.c r8 = r8.c()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = uL.C18149a.a(r7)
            r0.append(r1)
            r0.append(r2)
            r0.append(r6)
            java.lang.String r1 = "' look in other scopes"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.a(r0)
            java.lang.Object r8 = r5.a(r7, r6, r9)
            if (r8 != 0) goto L_0x00dc
            if (r9 == 0) goto L_0x00d3
            java.lang.ThreadLocal<YH.m<pL.a>> r8 = r5.f147186h
            r8.remove()
            gL.a r8 = r5.f147182d
            nL.c r8 = r8.c()
            java.lang.String r9 = "|- << parameters"
            r8.a(r9)
        L_0x00d3:
            r5.i(r6, r7)
            XH.k r6 = new XH.k
            r6.<init>()
            throw r6
        L_0x00dc:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sL.C17952a.h(qL.a, uI.d, mL.b, nI.a):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r5 == null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Void i(qL.C17844a r5, uI.C18055d<?> r6) {
        /*
            r4 = this;
            r0 = 39
            if (r5 == 0) goto L_0x001a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " and qualifier '"
            r1.append(r2)
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            if (r5 != 0) goto L_0x001c
        L_0x001a:
            java.lang.String r5 = ""
        L_0x001c:
            kL.e r1 = new kL.e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No definition found for type '"
            r2.append(r3)
            java.lang.String r6 = uL.C18149a.a(r6)
            r2.append(r6)
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = ". Check your Modules configuration and add missing type and/or qualifier!"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sL.C17952a.i(qL.a, uI.d):java.lang.Void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        if (r3 == null) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T b(uI.C18055d<?> r9, qL.C17844a r10, nI.C17631a<? extends pL.C17770a> r11) {
        /*
            r8 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            gL.a r0 = r8.f147182d
            nL.c r0 = r0.c()
            nL.b r1 = nL.C17685b.DEBUG
            boolean r0 = r0.e(r1)
            if (r0 == 0) goto L_0x00b9
            java.lang.String r0 = ""
            r2 = 39
            if (r10 == 0) goto L_0x002f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = " with qualifier '"
            r3.append(r4)
            r3.append(r10)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L_0x0030
        L_0x002f:
            r3 = r0
        L_0x0030:
            boolean r4 = r8.f147181c
            if (r4 == 0) goto L_0x0035
            goto L_0x0048
        L_0x0035:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "- scope:'"
            r0.append(r4)
            java.lang.String r4 = r8.f147180b
            r0.append(r4)
            java.lang.String r0 = r0.toString()
        L_0x0048:
            gL.a r4 = r8.f147182d
            nL.c r4 = r4.c()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "|- '"
            r5.append(r6)
            java.lang.String r7 = uL.C18149a.a(r9)
            r5.append(r7)
            r5.append(r2)
            r5.append(r3)
            r2 = 32
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = "..."
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r4.b(r1, r0)
            vL.a r0 = vL.C18206a.f149084a
            long r2 = r0.a()
            java.lang.Object r10 = r8.g(r10, r9, r11)
            long r4 = r0.a()
            long r4 = r4 - r2
            double r2 = (double) r4
            r4 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r2 = r2 / r4
            gL.a r11 = r8.f147182d
            nL.c r11 = r11.c()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r9 = uL.C18149a.a(r9)
            r0.append(r9)
            java.lang.String r9 = "' in "
            r0.append(r9)
            r0.append(r2)
            java.lang.String r9 = " ms"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r11.b(r1, r9)
            goto L_0x00bd
        L_0x00b9:
            java.lang.Object r10 = r8.g(r10, r9, r11)
        L_0x00bd:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: sL.C17952a.b(uI.d, qL.a, nI.a):java.lang.Object");
    }

    public final String c() {
        return this.f147180b;
    }

    public final <T> T d(C18055d<?> dVar, C17844a aVar, C17631a<? extends C17770a> aVar2) {
        C17542s.j(dVar, "clazz");
        try {
            return b(dVar, aVar, aVar2);
        } catch (C17520a unused) {
            C17686c c10 = this.f147182d.c();
            c10.a("* Scope closed - no instance found for " + C18149a.a(dVar) + " on scope " + this);
            return null;
        } catch (C17524e unused2) {
            C17686c c11 = this.f147182d.c();
            c11.a("* No instance found for type '" + C18149a.a(dVar) + "' on scope '" + this + '\'');
            return null;
        }
    }

    public final C17844a e() {
        return this.f147179a;
    }

    public final boolean f() {
        return this.f147181c;
    }

    public String toString() {
        return "['" + this.f147180b + "']";
    }
}
