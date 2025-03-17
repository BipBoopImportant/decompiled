package D4;

import QJ.C16339x;
import QJ.C16343z;
import QJ.F0;
import XH.C16807N;
import bK.C17052a;
import bK.g;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import nI.r;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B:\u0012.\u0010\b\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR?\u0010\b\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00048\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00110\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"LD4/c0;", "T1", "T2", "", "Lkotlin/Function4;", "LD4/f;", "LdI/e;", "LXH/N;", "send", "<init>", "(LnI/r;)V", "", "index", "value", "a", "(ILjava/lang/Object;LdI/e;)Ljava/lang/Object;", "LnI/r;", "LQJ/x;", "b", "LQJ/x;", "initialDispatched", "LbK/a;", "c", "LbK/a;", "lock", "", "d", "[LQJ/x;", "valueReceived", "e", "[Ljava/lang/Object;", "values", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c0<T1, T2> {

    /* renamed from: a  reason: collision with root package name */
    private final r<T1, T2, C6432f, C17164e<? super C16807N>, Object> f34317a;

    /* renamed from: b  reason: collision with root package name */
    private final C16339x<C16807N> f34318b = C16343z.b((F0) null, 1, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private final C17052a f34319c;

    /* renamed from: d  reason: collision with root package name */
    private final C16339x<C16807N>[] f34320d;

    /* renamed from: e  reason: collision with root package name */
    private final Object[] f34321e;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.paging.UnbatchedFlowCombiner", f = "FlowExt.kt", l = {191, 230, 208}, m = "onNext")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f34322c;

        /* renamed from: d  reason: collision with root package name */
        Object f34323d;

        /* renamed from: e  reason: collision with root package name */
        Object f34324e;

        /* renamed from: f  reason: collision with root package name */
        int f34325f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f34326g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c0<T1, T2> f34327h;

        /* renamed from: i  reason: collision with root package name */
        int f34328i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c0<T1, T2> c0Var, C17164e<? super a> eVar) {
            super(eVar);
            this.f34327h = c0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f34326g = obj;
            this.f34328i |= Integer.MIN_VALUE;
            return this.f34327h.a(0, (Object) null, this);
        }
    }

    public c0(r<? super T1, ? super T2, ? super C6432f, ? super C17164e<? super C16807N>, ? extends Object> rVar) {
        C17542s.j(rVar, "send");
        this.f34317a = rVar;
        this.f34319c = g.b(false, 1, (Object) null);
        C16339x<C16807N>[] xVarArr = new C16339x[2];
        for (int i10 = 0; i10 < 2; i10++) {
            xVarArr[i10] = C16343z.b((F0) null, 1, (Object) null);
        }
        this.f34320d = xVarArr;
        Object[] objArr = new Object[2];
        for (int i11 = 0; i11 < 2; i11++) {
            objArr[i11] = C6439m.f34386a;
        }
        this.f34321e = objArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: bK.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b2 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ca A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d8 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00db A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r17, java.lang.Object r18, dI.C17164e<? super XH.C16807N> r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r19
            r3 = 1
            boolean r4 = r2 instanceof D4.c0.a
            if (r4 == 0) goto L_0x001a
            r4 = r2
            D4.c0$a r4 = (D4.c0.a) r4
            int r5 = r4.f34328i
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001a
            int r5 = r5 - r6
            r4.f34328i = r5
            goto L_0x001f
        L_0x001a:
            D4.c0$a r4 = new D4.c0$a
            r4.<init>(r1, r2)
        L_0x001f:
            java.lang.Object r2 = r4.f34326g
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r4.f34328i
            r7 = 3
            r8 = 2
            r9 = 0
            if (r6 == 0) goto L_0x0069
            if (r6 == r3) goto L_0x005d
            if (r6 == r8) goto L_0x004b
            if (r6 != r7) goto L_0x0043
            java.lang.Object r0 = r4.f34323d
            r3 = r0
            bK.a r3 = (bK.C17052a) r3
            java.lang.Object r0 = r4.f34322c
            D4.c0 r0 = (D4.c0) r0
            XH.y.b(r2)     // Catch:{ all -> 0x0040 }
            goto L_0x00fa
        L_0x0040:
            r0 = move-exception
            goto L_0x0109
        L_0x0043:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004b:
            int r0 = r4.f34325f
            java.lang.Object r6 = r4.f34324e
            bK.a r6 = (bK.C17052a) r6
            java.lang.Object r8 = r4.f34323d
            java.lang.Object r10 = r4.f34322c
            D4.c0 r10 = (D4.c0) r10
            XH.y.b(r2)
        L_0x005a:
            r2 = r0
            r0 = r10
            goto L_0x00ab
        L_0x005d:
            int r0 = r4.f34325f
            java.lang.Object r6 = r4.f34323d
            java.lang.Object r10 = r4.f34322c
            D4.c0 r10 = (D4.c0) r10
            XH.y.b(r2)
            goto L_0x0095
        L_0x0069:
            XH.y.b(r2)
            QJ.x<XH.N>[] r2 = r1.f34320d
            r2 = r2[r0]
            boolean r2 = r2.h()
            if (r2 == 0) goto L_0x0089
            QJ.x<XH.N> r2 = r1.f34318b
            r4.f34322c = r1
            r6 = r18
            r4.f34323d = r6
            r4.f34325f = r0
            r4.f34328i = r3
            java.lang.Object r2 = r2.f(r4)
            if (r2 != r5) goto L_0x0094
            return r5
        L_0x0089:
            r6 = r18
            QJ.x<XH.N>[] r2 = r1.f34320d
            r2 = r2[r0]
            XH.N r10 = XH.C16807N.f139792a
            r2.J(r10)
        L_0x0094:
            r10 = r1
        L_0x0095:
            bK.a r2 = r10.f34319c
            r4.f34322c = r10
            r4.f34323d = r6
            r4.f34324e = r2
            r4.f34325f = r0
            r4.f34328i = r8
            java.lang.Object r8 = r2.e(r9, r4)
            if (r8 != r5) goto L_0x00a8
            return r5
        L_0x00a8:
            r8 = r6
            r6 = r2
            goto L_0x005a
        L_0x00ab:
            java.lang.Object[] r10 = r0.f34321e     // Catch:{ all -> 0x00be }
            int r11 = r10.length     // Catch:{ all -> 0x00be }
            r12 = 0
            r13 = r12
        L_0x00b0:
            if (r13 >= r11) goto L_0x00c1
            r14 = r10[r13]     // Catch:{ all -> 0x00be }
            java.lang.Object r15 = D4.C6439m.f34386a     // Catch:{ all -> 0x00be }
            if (r14 != r15) goto L_0x00bc
            r10 = r3
            goto L_0x00c2
        L_0x00bc:
            int r13 = r13 + r3
            goto L_0x00b0
        L_0x00be:
            r0 = move-exception
            r3 = r6
            goto L_0x0109
        L_0x00c1:
            r10 = r12
        L_0x00c2:
            java.lang.Object[] r11 = r0.f34321e     // Catch:{ all -> 0x00be }
            r11[r2] = r8     // Catch:{ all -> 0x00be }
            int r8 = r11.length     // Catch:{ all -> 0x00be }
            r13 = r12
        L_0x00c8:
            if (r13 >= r8) goto L_0x00d6
            r14 = r11[r13]     // Catch:{ all -> 0x00be }
            java.lang.Object r15 = D4.C6439m.f34386a     // Catch:{ all -> 0x00be }
            if (r14 != r15) goto L_0x00d4
            r3 = r6
            goto L_0x0101
        L_0x00d4:
            int r13 = r13 + r3
            goto L_0x00c8
        L_0x00d6:
            if (r10 == 0) goto L_0x00db
            D4.f r2 = D4.C6432f.INITIAL     // Catch:{ all -> 0x00be }
            goto L_0x00e2
        L_0x00db:
            if (r2 != 0) goto L_0x00e0
            D4.f r2 = D4.C6432f.RECEIVER     // Catch:{ all -> 0x00be }
            goto L_0x00e2
        L_0x00e0:
            D4.f r2 = D4.C6432f.OTHER     // Catch:{ all -> 0x00be }
        L_0x00e2:
            nI.r<T1, T2, D4.f, dI.e<? super XH.N>, java.lang.Object> r8 = r0.f34317a     // Catch:{ all -> 0x00be }
            java.lang.Object[] r10 = r0.f34321e     // Catch:{ all -> 0x00be }
            r11 = r10[r12]     // Catch:{ all -> 0x00be }
            r3 = r10[r3]     // Catch:{ all -> 0x00be }
            r4.f34322c = r0     // Catch:{ all -> 0x00be }
            r4.f34323d = r6     // Catch:{ all -> 0x00be }
            r4.f34324e = r9     // Catch:{ all -> 0x00be }
            r4.f34328i = r7     // Catch:{ all -> 0x00be }
            java.lang.Object r2 = r8.l(r11, r3, r2, r4)     // Catch:{ all -> 0x00be }
            if (r2 != r5) goto L_0x00f9
            return r5
        L_0x00f9:
            r3 = r6
        L_0x00fa:
            QJ.x<XH.N> r0 = r0.f34318b     // Catch:{ all -> 0x0040 }
            XH.N r2 = XH.C16807N.f139792a     // Catch:{ all -> 0x0040 }
            r0.J(r2)     // Catch:{ all -> 0x0040 }
        L_0x0101:
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0040 }
            r3.d(r9)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x0109:
            r3.d(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.c0.a(int, java.lang.Object, dI.e):java.lang.Object");
    }
}
