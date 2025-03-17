package YH;

import GJ.C15767j;
import GJ.C15768k;
import XH.C16807N;
import dI.C17164e;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aO\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u0007\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "size", "step", "LXH/N;", "a", "(II)V", "T", "", "iterator", "", "partialWindows", "reuseBuffer", "", "b", "(Ljava/util/Iterator;IIZZ)Ljava/util/Iterator;", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k0 {

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LGJ/j;", "", "LXH/N;", "<anonymous>", "(LGJ/j;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, 49, 55, 58}, m = "invokeSuspend")
    static final class a extends k implements p<C15767j<? super List<? extends T>>, C17164e<? super C16807N>, Object> {

        /* renamed from: d  reason: collision with root package name */
        Object f140452d;

        /* renamed from: e  reason: collision with root package name */
        Object f140453e;

        /* renamed from: f  reason: collision with root package name */
        int f140454f;

        /* renamed from: g  reason: collision with root package name */
        int f140455g;

        /* renamed from: h  reason: collision with root package name */
        private /* synthetic */ Object f140456h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f140457i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f140458j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Iterator<T> f140459k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ boolean f140460l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f140461m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i10, int i11, Iterator<? extends T> it, boolean z10, boolean z11, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f140457i = i10;
            this.f140458j = i11;
            this.f140459k = it;
            this.f140460l = z10;
            this.f140461m = z11;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f140457i, this.f140458j, this.f140459k, this.f140460l, this.f140461m, eVar);
            aVar.f140456h = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(C15767j<? super List<? extends T>> jVar, C17164e<? super C16807N> eVar) {
            return ((a) create(jVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0124  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x012e  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0120 A[SYNTHETIC] */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r10.f140455g
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L_0x0057
                if (r1 == r6) goto L_0x0044
                if (r1 == r5) goto L_0x003f
                if (r1 == r4) goto L_0x002e
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                goto L_0x003f
            L_0x0019:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0021:
                java.lang.Object r1 = r10.f140452d
                YH.f0 r1 = (YH.f0) r1
                java.lang.Object r4 = r10.f140456h
                GJ.j r4 = (GJ.C15767j) r4
                XH.y.b(r11)
                goto L_0x0148
            L_0x002e:
                java.lang.Object r1 = r10.f140453e
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r5 = r10.f140452d
                YH.f0 r5 = (YH.f0) r5
                java.lang.Object r6 = r10.f140456h
                GJ.j r6 = (GJ.C15767j) r6
                XH.y.b(r11)
                goto L_0x011a
            L_0x003f:
                XH.y.b(r11)
                goto L_0x0163
            L_0x0044:
                int r1 = r10.f140454f
                java.lang.Object r2 = r10.f140453e
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r3 = r10.f140452d
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                java.lang.Object r4 = r10.f140456h
                GJ.j r4 = (GJ.C15767j) r4
                XH.y.b(r11)
            L_0x0055:
                r11 = r1
                goto L_0x00a5
            L_0x0057:
                XH.y.b(r11)
                java.lang.Object r11 = r10.f140456h
                GJ.j r11 = (GJ.C15767j) r11
                int r1 = r10.f140457i
                r8 = 1024(0x400, float:1.435E-42)
                int r1 = tI.C17978n.i(r1, r8)
                int r8 = r10.f140458j
                int r9 = r10.f140457i
                int r8 = r8 - r9
                if (r8 < 0) goto L_0x00d8
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r1)
                java.util.Iterator<T> r1 = r10.f140459k
                r3 = 0
                r4 = r11
                r11 = r3
                r3 = r2
                r2 = r1
                r1 = r8
            L_0x007a:
                boolean r8 = r2.hasNext()
                if (r8 == 0) goto L_0x00b7
                java.lang.Object r8 = r2.next()
                if (r11 <= 0) goto L_0x0089
                int r11 = r11 + -1
                goto L_0x007a
            L_0x0089:
                r3.add(r8)
                int r8 = r3.size()
                int r9 = r10.f140457i
                if (r8 != r9) goto L_0x007a
                r10.f140456h = r4
                r10.f140452d = r3
                r10.f140453e = r2
                r10.f140454f = r1
                r10.f140455g = r6
                java.lang.Object r11 = r4.d(r3, r10)
                if (r11 != r0) goto L_0x0055
                return r0
            L_0x00a5:
                boolean r1 = r10.f140460l
                if (r1 == 0) goto L_0x00ad
                r3.clear()
                goto L_0x00b5
            L_0x00ad:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r10.f140457i
                r1.<init>(r3)
                r3 = r1
            L_0x00b5:
                r1 = r11
                goto L_0x007a
            L_0x00b7:
                boolean r11 = r3.isEmpty()
                if (r11 != 0) goto L_0x0163
                boolean r11 = r10.f140461m
                if (r11 != 0) goto L_0x00c9
                int r11 = r3.size()
                int r1 = r10.f140457i
                if (r11 != r1) goto L_0x0163
            L_0x00c9:
                r10.f140456h = r7
                r10.f140452d = r7
                r10.f140453e = r7
                r10.f140455g = r5
                java.lang.Object r11 = r4.d(r3, r10)
                if (r11 != r0) goto L_0x0163
                return r0
            L_0x00d8:
                YH.f0 r5 = new YH.f0
                r5.<init>(r1)
                java.util.Iterator<T> r1 = r10.f140459k
                r6 = r11
            L_0x00e0:
                boolean r11 = r1.hasNext()
                if (r11 == 0) goto L_0x0120
                java.lang.Object r11 = r1.next()
                r5.q(r11)
                boolean r11 = r5.t()
                if (r11 == 0) goto L_0x00e0
                int r11 = r5.size()
                int r8 = r10.f140457i
                if (r11 >= r8) goto L_0x0100
                YH.f0 r5 = r5.s(r8)
                goto L_0x00e0
            L_0x0100:
                boolean r11 = r10.f140460l
                if (r11 == 0) goto L_0x0106
                r11 = r5
                goto L_0x010b
            L_0x0106:
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>(r5)
            L_0x010b:
                r10.f140456h = r6
                r10.f140452d = r5
                r10.f140453e = r1
                r10.f140455g = r4
                java.lang.Object r11 = r6.d(r11, r10)
                if (r11 != r0) goto L_0x011a
                return r0
            L_0x011a:
                int r11 = r10.f140458j
                r5.x(r11)
                goto L_0x00e0
            L_0x0120:
                boolean r11 = r10.f140461m
                if (r11 == 0) goto L_0x0163
                r1 = r5
                r4 = r6
            L_0x0126:
                int r11 = r1.size()
                int r5 = r10.f140458j
                if (r11 <= r5) goto L_0x014e
                boolean r11 = r10.f140460l
                if (r11 == 0) goto L_0x0134
                r11 = r1
                goto L_0x0139
            L_0x0134:
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>(r1)
            L_0x0139:
                r10.f140456h = r4
                r10.f140452d = r1
                r10.f140453e = r7
                r10.f140455g = r3
                java.lang.Object r11 = r4.d(r11, r10)
                if (r11 != r0) goto L_0x0148
                return r0
            L_0x0148:
                int r11 = r10.f140458j
                r1.x(r11)
                goto L_0x0126
            L_0x014e:
                boolean r11 = r1.isEmpty()
                if (r11 != 0) goto L_0x0163
                r10.f140456h = r7
                r10.f140452d = r7
                r10.f140453e = r7
                r10.f140455g = r2
                java.lang.Object r11 = r4.d(r1, r10)
                if (r11 != r0) goto L_0x0163
                return r0
            L_0x0163:
                XH.N r11 = XH.C16807N.f139792a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: YH.k0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(int i10, int i11) {
        String str;
        if (i10 <= 0 || i11 <= 0) {
            if (i10 != i11) {
                str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
            } else {
                str = "size " + i10 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public static final <T> Iterator<List<T>> b(Iterator<? extends T> it, int i10, int i11, boolean z10, boolean z11) {
        C17542s.j(it, "iterator");
        return !it.hasNext() ? C16852I.f140417a : C15768k.a(new a(i10, i11, it, z11, z10, (C17164e<? super a>) null));
    }
}
