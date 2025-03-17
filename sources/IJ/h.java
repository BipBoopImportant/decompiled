package Ij;

import TJ.C16509F;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"LIj/h;", "", "LIj/i;", "scannerBarcodeEmitter", "<init>", "(LIj/i;)V", "", "LIj/h$a;", "barcodes", "LXH/N;", "a", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "LIj/i;", "LTJ/F;", "b", "LTJ/F;", "()LTJ/F;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final i f81792a;

    /* renamed from: b  reason: collision with root package name */
    private final C16509F<a> f81793b;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0014"}, d2 = {"LIj/h$a;", "", "", "rawValue", "", "format", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f81794a;

        /* renamed from: b  reason: collision with root package name */
        private final int f81795b;

        public a(String str, int i10) {
            this.f81794a = str;
            this.f81795b = i10;
        }

        public final int a() {
            return this.f81795b;
        }

        public final String b() {
            return this.f81794a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f81794a, aVar.f81794a) && this.f81795b == aVar.f81795b;
        }

        public int hashCode() {
            String str = this.f81794a;
            return ((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.f81795b);
        }

        public String toString() {
            String str = this.f81794a;
            int i10 = this.f81795b;
            return "BarcodeResult(rawValue=" + str + ", format=" + i10 + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ScannerBarcodeAnalyzer", f = "ScannerBarcodeAnalyzer.kt", l = {24}, m = "analyze")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f81796c;

        /* renamed from: d  reason: collision with root package name */
        Object f81797d;

        /* renamed from: e  reason: collision with root package name */
        Object f81798e;

        /* renamed from: f  reason: collision with root package name */
        Object f81799f;

        /* renamed from: g  reason: collision with root package name */
        Object f81800g;

        /* renamed from: h  reason: collision with root package name */
        Object f81801h;

        /* renamed from: i  reason: collision with root package name */
        Object f81802i;

        /* renamed from: j  reason: collision with root package name */
        Object f81803j;

        /* renamed from: k  reason: collision with root package name */
        int f81804k;

        /* renamed from: l  reason: collision with root package name */
        int f81805l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f81806m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ h f81807n;

        /* renamed from: o  reason: collision with root package name */
        int f81808o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f81807n = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f81806m = obj;
            this.f81808o |= Integer.MIN_VALUE;
            return this.f81807n.a((List<a>) null, this);
        }
    }

    public h(i iVar) {
        C17542s.j(iVar, "scannerBarcodeEmitter");
        this.f81792a = iVar;
        this.f81793b = iVar.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.util.List<Ij.h.a> r14, dI.C17164e<? super XH.C16807N> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof Ij.h.b
            if (r0 == 0) goto L_0x0013
            r0 = r15
            Ij.h$b r0 = (Ij.h.b) r0
            int r1 = r0.f81808o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f81808o = r1
            goto L_0x0018
        L_0x0013:
            Ij.h$b r0 = new Ij.h$b
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f81806m
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f81808o
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0058
            if (r3 != r5) goto L_0x0050
            int r14 = r0.f81804k
            java.lang.Object r15 = r0.f81803j
            Ij.h$a r15 = (Ij.h.a) r15
            java.lang.Object r15 = r0.f81801h
            java.util.Iterator r15 = (java.util.Iterator) r15
            java.lang.Object r3 = r0.f81800g
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Object r6 = r0.f81799f
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r0.f81798e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r8 = r0.f81797d
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.f81796c
            Ij.h r9 = (Ij.h) r9
            XH.y.b(r1)
            r1 = r15
            r15 = r14
            r14 = r8
            r12 = r3
            r3 = r0
            r0 = r7
            r7 = r6
            r6 = r12
            goto L_0x0096
        L_0x0050:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0058:
            XH.y.b(r1)
            if (r14 == 0) goto L_0x00c2
            r1 = r14
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0069:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x008c
            java.lang.Object r6 = r1.next()
            r7 = r6
            Ij.h$a r7 = (Ij.h.a) r7
            java.lang.String r7 = r7.b()
            if (r7 == 0) goto L_0x0085
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r7 = r4
            goto L_0x0086
        L_0x0085:
            r7 = r5
        L_0x0086:
            if (r7 != 0) goto L_0x0069
            r3.add(r6)
            goto L_0x0069
        L_0x008c:
            java.util.Iterator r1 = r3.iterator()
            r9 = r13
            r6 = r3
            r7 = r6
            r3 = r0
            r0 = r15
            r15 = r4
        L_0x0096:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x00c2
            java.lang.Object r8 = r1.next()
            r10 = r8
            Ij.h$a r10 = (Ij.h.a) r10
            Ij.i r11 = r9.f81792a
            r3.f81796c = r9
            r3.f81797d = r14
            r3.f81798e = r0
            r3.f81799f = r7
            r3.f81800g = r6
            r3.f81801h = r1
            r3.f81802i = r8
            r3.f81803j = r10
            r3.f81804k = r15
            r3.f81805l = r4
            r3.f81808o = r5
            java.lang.Object r8 = r11.b(r10, r3)
            if (r8 != r2) goto L_0x0096
            return r2
        L_0x00c2:
            XH.N r14 = XH.C16807N.f139792a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Ij.h.a(java.util.List, dI.e):java.lang.Object");
    }

    public final C16509F<a> b() {
        return this.f81793b;
    }
}
