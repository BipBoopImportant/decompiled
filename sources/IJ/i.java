package Ij;

import Ij.h;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16509F;
import TJ.C16511H;
import YH.C16856M;
import dI.C17164e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004HB¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\n\u0010\u000fR&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"LIj/i;", "", "<init>", "()V", "LIj/h$a;", "barcode", "LXH/N;", "b", "(LIj/h$a;LdI/e;)Ljava/lang/Object;", "LTJ/A;", "a", "LTJ/A;", "_barcodes", "LTJ/F;", "LTJ/F;", "()LTJ/F;", "barcodes", "", "c", "Ljava/util/List;", "getDetections", "()Ljava/util/List;", "getDetections$annotations", "detections", "d", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* renamed from: d  reason: collision with root package name */
    public static final a f81809d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f81810e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C16504A<h.a> f81811a;

    /* renamed from: b  reason: collision with root package name */
    private final C16509F<h.a> f81812b;

    /* renamed from: c  reason: collision with root package name */
    private final List<h.a> f81813c = new ArrayList();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LIj/i$a;", "", "<init>", "()V", "", "MAX_SIZE_OF_DETECTIONS", "I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ij/i$b", "LYH/M;", "", "b", "()Ljava/util/Iterator;", "element", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16856M<h.a, String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterable f81814a;

        public b(Iterable iterable) {
            this.f81814a = iterable;
        }

        public String a(h.a aVar) {
            return aVar.b();
        }

        public Iterator<h.a> b() {
            return this.f81814a.iterator();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ScannerBarcodeEmitter", f = "ScannerBarcodeAnalyzer.kt", l = {60}, m = "invoke")
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f81815c;

        /* renamed from: d  reason: collision with root package name */
        Object f81816d;

        /* renamed from: e  reason: collision with root package name */
        Object f81817e;

        /* renamed from: f  reason: collision with root package name */
        Object f81818f;

        /* renamed from: g  reason: collision with root package name */
        Object f81819g;

        /* renamed from: h  reason: collision with root package name */
        Object f81820h;

        /* renamed from: i  reason: collision with root package name */
        Object f81821i;

        /* renamed from: j  reason: collision with root package name */
        int f81822j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f81823k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ i f81824l;

        /* renamed from: m  reason: collision with root package name */
        int f81825m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f81824l = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f81823k = obj;
            this.f81825m |= Integer.MIN_VALUE;
            return this.f81824l.b((h.a) null, this);
        }
    }

    public i() {
        C16504A<h.a> b10 = C16511H.b(0, 0, (C16428d) null, 7, (Object) null);
        this.f81811a = b10;
        this.f81812b = b10;
    }

    public final C16509F<h.a> a() {
        return this.f81812b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: Ij.h$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: Ij.h$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: Ij.h$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: Ij.h$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(Ij.h.a r14, dI.C17164e<? super XH.C16807N> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof Ij.i.c
            if (r0 == 0) goto L_0x0013
            r0 = r15
            Ij.i$c r0 = (Ij.i.c) r0
            int r1 = r0.f81825m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f81825m = r1
            goto L_0x0018
        L_0x0013:
            Ij.i$c r0 = new Ij.i$c
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f81823k
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f81825m
            r4 = 1
            if (r3 == 0) goto L_0x004e
            if (r3 != r4) goto L_0x0046
            java.lang.Object r14 = r0.f81821i
            Ij.h$a r14 = (Ij.h.a) r14
            java.lang.Object r14 = r0.f81820h
            Ij.h$a r14 = (Ij.h.a) r14
            java.lang.Object r14 = r0.f81819g
            Ij.h$a r14 = (Ij.h.a) r14
            java.lang.Object r14 = r0.f81818f
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r14 = r0.f81817e
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r0.f81816d
            Ij.h$a r14 = (Ij.h.a) r14
            java.lang.Object r14 = r0.f81815c
            Ij.i r14 = (Ij.i) r14
            XH.y.b(r1)
            goto L_0x01b6
        L_0x0046:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x004e:
            XH.y.b(r1)
            java.util.List<Ij.h$a> r1 = r13.f81813c
            int r1 = r1.size()
            r3 = 5
            r5 = 0
            r6 = 0
            if (r1 >= r3) goto L_0x011e
            qv.e r15 = qv.e.DEBUG
            qv.d r0 = qv.d.f102012a
            java.util.List r0 = r0.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x006f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0086
            java.lang.Object r2 = r0.next()
            r3 = r2
            qv.b r3 = (qv.C11819b) r3
            boolean r3 = r3.b(r15, r5)
            if (r3 == 0) goto L_0x006f
            r1.add(r2)
            goto L_0x006f
        L_0x0086:
            java.util.Iterator r0 = r1.iterator()
            r1 = r6
            r2 = r1
        L_0x008c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0113
            java.lang.Object r3 = r0.next()
            r7 = r3
            qv.b r7 = (qv.C11819b) r7
            r11 = 0
            if (r1 != 0) goto L_0x00bc
            java.lang.String r1 = r14.b()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "BARCODE: "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = qv.C11818a.a(r1, r11)
            if (r1 != 0) goto L_0x00b8
            goto L_0x0113
        L_0x00b8:
            java.lang.String r1 = qv.C11820c.a(r1)
        L_0x00bc:
            if (r2 != 0) goto L_0x010a
            java.lang.Class<Ij.i> r2 = Ij.i.class
            java.lang.String r2 = r2.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r3 = 36
            r5 = 2
            java.lang.String r3 = HJ.C15854t.s1(r2, r3, r6, r5, r6)
            r8 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r8, r6, r5, r6)
            int r5 = r3.length()
            if (r5 != 0) goto L_0x00db
            goto L_0x00e1
        L_0x00db:
            java.lang.String r2 = "Kt"
            java.lang.String r2 = HJ.C15854t.P0(r3, r2)
        L_0x00e1:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.String r5 = "main"
            boolean r3 = HJ.C15854t.b0(r3, r5, r4)
            if (r3 == 0) goto L_0x00f4
            java.lang.String r3 = "m"
            goto L_0x00f6
        L_0x00f4:
            java.lang.String r3 = "b"
        L_0x00f6:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = "|"
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
        L_0x010a:
            r10 = 0
            r8 = r15
            r9 = r2
            r12 = r1
            r7.a(r8, r9, r10, r11, r12)
            goto L_0x008c
        L_0x0113:
            java.util.List<Ij.h$a> r15 = r13.f81813c
            boolean r14 = r15.add(r14)
            kotlin.coroutines.jvm.internal.b.a(r14)
            goto L_0x01bb
        L_0x011e:
            java.util.List<Ij.h$a> r1 = r13.f81813c
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            Ij.i$b r3 = new Ij.i$b
            r3.<init>(r1)
            java.util.Map r1 = YH.N.a(r3)
            java.util.Set r1 = r1.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01be
            java.lang.Object r3 = r1.next()
            boolean r7 = r1.hasNext()
            if (r7 != 0) goto L_0x0146
            goto L_0x016e
        L_0x0146:
            r7 = r3
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
        L_0x0153:
            java.lang.Object r8 = r1.next()
            r9 = r8
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r9 = r9.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r7 >= r9) goto L_0x0168
            r3 = r8
            r7 = r9
        L_0x0168:
            boolean r8 = r1.hasNext()
            if (r8 != 0) goto L_0x0153
        L_0x016e:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r1 = r3.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.util.List<Ij.h$a> r3 = r13.f81813c
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x017e:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0196
            java.lang.Object r7 = r3.next()
            r8 = r7
            Ij.h$a r8 = (Ij.h.a) r8
            java.lang.String r8 = r8.b()
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r1)
            if (r8 == 0) goto L_0x017e
            r6 = r7
        L_0x0196:
            Ij.h$a r6 = (Ij.h.a) r6
            if (r6 == 0) goto L_0x01b5
            TJ.A<Ij.h$a> r3 = r13.f81811a
            r0.f81815c = r13
            r0.f81816d = r14
            r0.f81817e = r15
            r0.f81818f = r1
            r0.f81819g = r6
            r0.f81820h = r6
            r0.f81821i = r6
            r0.f81822j = r5
            r0.f81825m = r4
            java.lang.Object r14 = r3.emit(r6, r0)
            if (r14 != r2) goto L_0x01b5
            return r2
        L_0x01b5:
            r14 = r13
        L_0x01b6:
            java.util.List<Ij.h$a> r14 = r14.f81813c
            r14.clear()
        L_0x01bb:
            XH.N r14 = XH.C16807N.f139792a
            return r14
        L_0x01be:
            java.util.NoSuchElementException r14 = new java.util.NoSuchElementException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Ij.i.b(Ij.h$a, dI.e):java.lang.Object");
    }
}
