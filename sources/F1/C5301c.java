package f1;

import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.o1;
import U0.p1;
import XH.C16807N;
import g1.C5352u;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u001ac\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001ai\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00012\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aE\u0010\u0011\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\r0\u0004\"\u0004\b\u0000\u0010\u00012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0016\u001a\u00020\u0015*\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002XD¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"", "T", "", "inputs", "Lf1/k;", "saver", "", "key", "Lkotlin/Function0;", "init", "e", "([Ljava/lang/Object;Lf1/k;Ljava/lang/String;LnI/a;LU0/m;II)Ljava/lang/Object;", "stateSaver", "LU0/r0;", "d", "([Ljava/lang/Object;Lf1/k;Ljava/lang/String;LnI/a;LU0/m;II)LU0/r0;", "inner", "c", "(Lf1/k;)Lf1/k;", "Lf1/h;", "value", "LXH/N;", "f", "(Lf1/h;Ljava/lang/Object;)V", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "", "a", "I", "MaxSupportedRadix", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: f1.c  reason: case insensitive filesystem */
public final class C5301c {

    /* renamed from: a  reason: collision with root package name */
    private static final int f23242a = 36;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lf1/m;", "LU0/r0;", "state", "", "a", "(Lf1/m;LU0/r0;)LU0/r0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: f1.c$a */
    static final class a extends C17544u implements p<m, C4899r0<T>, C4899r0<Object>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5309k<T, Object> f23243c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5309k<T, Object> kVar) {
            super(2);
            this.f23243c = kVar;
        }

        /* renamed from: a */
        public final C4899r0<Object> invoke(m mVar, C4899r0<T> r0Var) {
            if (r0Var instanceof C5352u) {
                Object b10 = this.f23243c.b(mVar, r0Var.getValue());
                if (b10 == null) {
                    return null;
                }
                o1 c10 = ((C5352u) r0Var).c();
                C17542s.h(c10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return p1.i(b10, c10);
            }
            throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LU0/r0;", "", "it", "a", "(LU0/r0;)LU0/r0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: f1.c$b */
    static final class b extends C17544u implements C17642l<C4899r0<Object>, C4899r0<T>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5309k<T, Object> f23244c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5309k<T, Object> kVar) {
            super(1);
            this.f23244c = kVar;
        }

        /* renamed from: a */
        public final C4899r0<T> invoke(C4899r0<Object> r0Var) {
            T t10;
            if (r0Var instanceof C5352u) {
                if (r0Var.getValue() != null) {
                    C5309k<T, Object> kVar = this.f23244c;
                    Object value = r0Var.getValue();
                    C17542s.g(value);
                    t10 = kVar.a(value);
                } else {
                    t10 = null;
                }
                o1 c10 = ((C5352u) r0Var).c();
                C17542s.h(c10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3?>");
                C4899r0<T> i10 = p1.i(t10, c10);
                C17542s.h(i10, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3>");
                return i10;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: f1.c$c  reason: collision with other inner class name */
    static final class C0375c extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5302d<T> f23245c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5309k<T, ? extends Object> f23246d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5306h f23247e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f23248f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ T f23249g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Object[] f23250h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0375c(C5302d<T> dVar, C5309k<T, ? extends Object> kVar, C5306h hVar, String str, T t10, Object[] objArr) {
            super(0);
            this.f23245c = dVar;
            this.f23246d = kVar;
            this.f23247e = hVar;
            this.f23248f = str;
            this.f23249g = t10;
            this.f23250h = objArr;
        }

        public final void invoke() {
            this.f23245c.f(this.f23246d, this.f23247e, this.f23248f, this.f23249g, this.f23250h);
        }
    }

    public static final String b(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    private static final <T> C5309k<C4899r0<T>, C4899r0<Object>> c(C5309k<T, ? extends Object> kVar) {
        C17542s.h(kVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return C5310l.a(new a(kVar), new b(kVar));
    }

    public static final <T> C4899r0<T> d(Object[] objArr, C5309k<T, ? extends Object> kVar, String str, C17631a<? extends C4899r0<T>> aVar, C4889m mVar, int i10, int i11) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if (C4895p.J()) {
            C4895p.S(-202053668, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:127)");
        }
        C4899r0<T> r0Var = (C4899r0) e(Arrays.copyOf(objArr, objArr.length), c(kVar), str2, aVar, mVar, i10 & 8064, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        return r0Var;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [nI.a<? extends T>, nI.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bb, code lost:
        if (r0 == r7.a()) goto L_0x00bd;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T e(java.lang.Object[] r9, f1.C5309k<T, ? extends java.lang.Object> r10, java.lang.String r11, nI.C17631a<? extends T> r12, U0.C4889m r13, int r14, int r15) {
        /*
            r0 = r15 & 2
            if (r0 == 0) goto L_0x0008
            f1.k r10 = f1.C5310l.b()
        L_0x0008:
            r15 = r15 & 4
            r0 = 0
            if (r15 == 0) goto L_0x000e
            r11 = r0
        L_0x000e:
            boolean r15 = U0.C4895p.J()
            if (r15 == 0) goto L_0x001d
            r15 = -1
            java.lang.String r1 = "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)"
            r2 = 441892779(0x1a56bfab, float:4.440899E-23)
            U0.C4895p.S(r2, r14, r15, r1)
        L_0x001d:
            r15 = 0
            int r1 = U0.C4883j.a(r13, r15)
            if (r11 == 0) goto L_0x002a
            int r2 = r11.length()
            if (r2 != 0) goto L_0x0039
        L_0x002a:
            int r11 = f23242a
            int r11 = HJ.C15835a.a(r11)
            java.lang.String r11 = java.lang.Integer.toString(r1, r11)
            java.lang.String r1 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.C17542s.i(r11, r1)
        L_0x0039:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>"
            kotlin.jvm.internal.C17542s.h(r10, r1)
            U0.I0 r1 = f1.C5308j.d()
            java.lang.Object r1 = r13.Q(r1)
            r6 = r1
            f1.h r6 = (f1.C5306h) r6
            java.lang.Object r1 = r13.D()
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r2 = r7.a()
            if (r1 != r2) goto L_0x0076
            if (r6 == 0) goto L_0x0061
            java.lang.Object r1 = r6.e(r11)
            if (r1 == 0) goto L_0x0061
            java.lang.Object r0 = r10.a(r1)
        L_0x0061:
            if (r0 != 0) goto L_0x0067
            java.lang.Object r0 = r12.invoke()
        L_0x0067:
            r4 = r0
            f1.d r8 = new f1.d
            r0 = r8
            r1 = r10
            r2 = r6
            r3 = r11
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r13.u(r8)
            r1 = r8
        L_0x0076:
            f1.d r1 = (f1.C5302d) r1
            java.lang.Object r0 = r1.d(r9)
            if (r0 != 0) goto L_0x0082
            java.lang.Object r0 = r12.invoke()
        L_0x0082:
            r12 = r0
            boolean r0 = r13.F(r1)
            r2 = r14 & 112(0x70, float:1.57E-43)
            r2 = r2 ^ 48
            r3 = 32
            if (r2 <= r3) goto L_0x0095
            boolean r2 = r13.F(r10)
            if (r2 != 0) goto L_0x0099
        L_0x0095:
            r14 = r14 & 48
            if (r14 != r3) goto L_0x009b
        L_0x0099:
            r14 = 1
            goto L_0x009c
        L_0x009b:
            r14 = r15
        L_0x009c:
            r14 = r14 | r0
            boolean r0 = r13.F(r6)
            r14 = r14 | r0
            boolean r0 = r13.V(r11)
            r14 = r14 | r0
            boolean r0 = r13.F(r12)
            r14 = r14 | r0
            boolean r0 = r13.F(r9)
            r14 = r14 | r0
            java.lang.Object r0 = r13.D()
            if (r14 != 0) goto L_0x00bd
            java.lang.Object r14 = r7.a()
            if (r0 != r14) goto L_0x00cb
        L_0x00bd:
            f1.c$c r14 = new f1.c$c
            r0 = r14
            r2 = r10
            r3 = r6
            r4 = r11
            r5 = r12
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r13.u(r14)
        L_0x00cb:
            nI.a r0 = (nI.C17631a) r0
            U0.P.i(r0, r13, r15)
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00d9
            U0.C4895p.R()
        L_0x00d9:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.C5301c.e(java.lang.Object[], f1.k, java.lang.String, nI.a, U0.m, int, int):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final void f(C5306h hVar, Object obj) {
        String str;
        if (obj != null && !hVar.a(obj)) {
            if (obj instanceof C5352u) {
                C5352u uVar = (C5352u) obj;
                if (uVar.c() == p1.k() || uVar.c() == p1.s() || uVar.c() == p1.p()) {
                    str = "MutableState containing " + uVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                str = b(obj);
            }
            throw new IllegalArgumentException(str);
        }
    }
}
