package g1;

import GJ.C15767j;
import GJ.C15768k;
import XH.C16807N;
import YH.C16870n;
import YH.C16877v;
import dI.C17164e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import oI.C17693a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB+\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lg1/n;", "", "", "", "upperSet", "lowerSet", "lowerBound", "", "belowBound", "<init>", "(JJI[I)V", "bit", "", "t", "(I)Z", "B", "(I)Lg1/n;", "s", "bits", "q", "(Lg1/n;)Lg1/n;", "A", "", "iterator", "()Ljava/util/Iterator;", "default", "x", "(I)I", "", "toString", "()Ljava/lang/String;", "a", "J", "b", "c", "I", "d", "[I", "e", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.n  reason: case insensitive filesystem */
public final class C5345n implements Iterable<Integer>, C17693a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f23408e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C5345n f23409f = new C5345n(0, 0, 0, (int[]) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final long f23410a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final long f23411b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f23412c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int[] f23413d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg1/n$a;", "", "<init>", "()V", "Lg1/n;", "EMPTY", "Lg1/n;", "a", "()Lg1/n;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g1.n$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5345n a() {
            return C5345n.f23409f;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGJ/j;", "", "LXH/N;", "<anonymous>", "(LGJ/j;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {295, 300, 307}, m = "invokeSuspend")
    /* renamed from: g1.n$b */
    static final class b extends k implements p<C15767j<? super Integer>, C17164e<? super C16807N>, Object> {

        /* renamed from: d  reason: collision with root package name */
        Object f23414d;

        /* renamed from: e  reason: collision with root package name */
        int f23415e;

        /* renamed from: f  reason: collision with root package name */
        int f23416f;

        /* renamed from: g  reason: collision with root package name */
        int f23417g;

        /* renamed from: h  reason: collision with root package name */
        private /* synthetic */ Object f23418h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C5345n f23419i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5345n nVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f23419i = nVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f23419i, eVar);
            bVar.f23418h = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(C15767j<? super Integer> jVar, C17164e<? super C16807N> eVar) {
            return ((b) create(jVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f23417g
                r3 = 0
                r4 = 1
                r6 = 3
                r7 = 2
                r8 = 64
                r10 = 0
                r12 = 1
                if (r2 == 0) goto L_0x0048
                if (r2 == r12) goto L_0x0038
                if (r2 == r7) goto L_0x002d
                if (r2 != r6) goto L_0x0025
                int r2 = r0.f23415e
                java.lang.Object r7 = r0.f23418h
                GJ.j r7 = (GJ.C15767j) r7
                XH.y.b(r20)
                goto L_0x00e9
            L_0x0025:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x002d:
                int r2 = r0.f23415e
                java.lang.Object r13 = r0.f23418h
                GJ.j r13 = (GJ.C15767j) r13
                XH.y.b(r20)
                goto L_0x00ae
            L_0x0038:
                int r2 = r0.f23416f
                int r13 = r0.f23415e
                java.lang.Object r14 = r0.f23414d
                int[] r14 = (int[]) r14
                java.lang.Object r15 = r0.f23418h
                GJ.j r15 = (GJ.C15767j) r15
                XH.y.b(r20)
                goto L_0x0075
            L_0x0048:
                XH.y.b(r20)
                java.lang.Object r2 = r0.f23418h
                GJ.j r2 = (GJ.C15767j) r2
                g1.n r13 = r0.f23419i
                int[] r13 = r13.f23413d
                if (r13 == 0) goto L_0x0078
                int r14 = r13.length
                r15 = r2
                r2 = r14
                r14 = r13
                r13 = 0
            L_0x005c:
                if (r13 >= r2) goto L_0x0077
                r16 = r14[r13]
                java.lang.Integer r9 = kotlin.coroutines.jvm.internal.b.e(r16)
                r0.f23418h = r15
                r0.f23414d = r14
                r0.f23415e = r13
                r0.f23416f = r2
                r0.f23417g = r12
                java.lang.Object r9 = r15.d(r9, r0)
                if (r9 != r1) goto L_0x0075
                return r1
            L_0x0075:
                int r13 = r13 + r12
                goto L_0x005c
            L_0x0077:
                r2 = r15
            L_0x0078:
                g1.n r9 = r0.f23419i
                long r13 = r9.f23411b
                int r9 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
                if (r9 == 0) goto L_0x00b1
                r13 = r2
                r2 = 0
            L_0x0084:
                if (r2 >= r8) goto L_0x00b0
                g1.n r9 = r0.f23419i
                long r14 = r9.f23411b
                long r17 = r4 << r2
                long r14 = r14 & r17
                int r9 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
                if (r9 == 0) goto L_0x00ae
                g1.n r9 = r0.f23419i
                int r9 = r9.f23412c
                int r9 = r9 + r2
                java.lang.Integer r9 = kotlin.coroutines.jvm.internal.b.e(r9)
                r0.f23418h = r13
                r0.f23414d = r3
                r0.f23415e = r2
                r0.f23417g = r7
                java.lang.Object r9 = r13.d(r9, r0)
                if (r9 != r1) goto L_0x00ae
                return r1
            L_0x00ae:
                int r2 = r2 + r12
                goto L_0x0084
            L_0x00b0:
                r2 = r13
            L_0x00b1:
                g1.n r7 = r0.f23419i
                long r13 = r7.f23410a
                int r7 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
                if (r7 == 0) goto L_0x00ec
                r7 = r2
                r9 = 0
            L_0x00bd:
                if (r9 >= r8) goto L_0x00ec
                g1.n r2 = r0.f23419i
                long r13 = r2.f23410a
                long r15 = r4 << r9
                long r13 = r13 & r15
                int r2 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
                if (r2 == 0) goto L_0x00ea
                int r2 = r9 + 64
                g1.n r13 = r0.f23419i
                int r13 = r13.f23412c
                int r2 = r2 + r13
                java.lang.Integer r2 = kotlin.coroutines.jvm.internal.b.e(r2)
                r0.f23418h = r7
                r0.f23414d = r3
                r0.f23415e = r9
                r0.f23417g = r6
                java.lang.Object r2 = r7.d(r2, r0)
                if (r2 != r1) goto L_0x00e8
                return r1
            L_0x00e8:
                r2 = r9
            L_0x00e9:
                r9 = r2
            L_0x00ea:
                int r9 = r9 + r12
                goto L_0x00bd
            L_0x00ec:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: g1.C5345n.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private C5345n(long j10, long j11, int i10, int[] iArr) {
        this.f23410a = j10;
        this.f23411b = j11;
        this.f23412c = i10;
        this.f23413d = iArr;
    }

    public final C5345n A(C5345n nVar) {
        C5345n nVar2;
        int[] iArr;
        C5345n nVar3 = f23409f;
        if (nVar == nVar3) {
            return this;
        }
        if (this == nVar3) {
            return nVar;
        }
        int i10 = nVar.f23412c;
        int i11 = this.f23412c;
        if (i10 == i11 && nVar.f23413d == (iArr = this.f23413d)) {
            return new C5345n(this.f23410a | nVar.f23410a, this.f23411b | nVar.f23411b, i11, iArr);
        }
        int i12 = 0;
        if (this.f23413d == null) {
            int[] b10 = this.f23413d;
            if (b10 != null) {
                for (int B10 : b10) {
                    nVar = nVar.B(B10);
                }
            }
            if (this.f23411b != 0) {
                for (int i13 = 0; i13 < 64; i13++) {
                    if ((this.f23411b & (1 << i13)) != 0) {
                        nVar = nVar.B(this.f23412c + i13);
                    }
                }
            }
            if (this.f23410a != 0) {
                while (i12 < 64) {
                    if ((this.f23410a & (1 << i12)) != 0) {
                        nVar = nVar.B(i12 + 64 + this.f23412c);
                    }
                    i12++;
                }
            }
            return nVar;
        }
        int[] b11 = nVar.f23413d;
        if (b11 != null) {
            nVar2 = this;
            for (int B11 : b11) {
                nVar2 = nVar2.B(B11);
            }
        } else {
            nVar2 = this;
        }
        if (nVar.f23411b != 0) {
            for (int i14 = 0; i14 < 64; i14++) {
                if ((nVar.f23411b & (1 << i14)) != 0) {
                    nVar2 = nVar2.B(nVar.f23412c + i14);
                }
            }
        }
        if (nVar.f23410a != 0) {
            while (i12 < 64) {
                if ((nVar.f23410a & (1 << i12)) != 0) {
                    nVar2 = nVar2.B(i12 + 64 + nVar.f23412c);
                }
                i12++;
            }
        }
        return nVar2;
    }

    public final C5345n B(int i10) {
        int i11;
        int[] iArr;
        int i12 = i10;
        int i13 = this.f23412c;
        int i14 = i12 - i13;
        long j10 = 0;
        if (i14 >= 0 && i14 < 64) {
            long j11 = 1 << i14;
            long j12 = this.f23411b;
            if ((j12 & j11) == 0) {
                return new C5345n(this.f23410a, j12 | j11, i13, this.f23413d);
            }
        } else if (i14 >= 64 && i14 < 128) {
            long j13 = 1 << (i14 - 64);
            long j14 = this.f23410a;
            if ((j14 & j13) == 0) {
                return new C5345n(j14 | j13, this.f23411b, i13, this.f23413d);
            }
        } else if (i14 < 128) {
            int[] iArr2 = this.f23413d;
            if (iArr2 == null) {
                return new C5345n(this.f23410a, this.f23411b, i13, new int[]{i10});
            }
            int a10 = C5346o.a(iArr2, i12);
            if (a10 < 0) {
                int i15 = -(a10 + 1);
                int length = iArr2.length;
                int[] iArr3 = new int[(length + 1)];
                C16870n.l(iArr2, iArr3, 0, 0, i15);
                C16870n.l(iArr2, iArr3, i15 + 1, i15, length);
                iArr3[i15] = i12;
                return new C5345n(this.f23410a, this.f23411b, this.f23412c, iArr3);
            }
        } else if (!t(i10)) {
            long j15 = this.f23410a;
            long j16 = this.f23411b;
            int i16 = this.f23412c;
            int i17 = ((i12 + 1) / 64) * 64;
            ArrayList arrayList = null;
            long j17 = j16;
            long j18 = j15;
            while (true) {
                if (i16 >= i17) {
                    i11 = i16;
                    break;
                }
                if (j17 != j10) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr4 = this.f23413d;
                        if (iArr4 != null) {
                            for (int valueOf : iArr4) {
                                arrayList.add(Integer.valueOf(valueOf));
                            }
                        }
                    }
                    for (int i18 = 0; i18 < 64; i18++) {
                        if (((1 << i18) & j17) != 0) {
                            arrayList.add(Integer.valueOf(i18 + i16));
                        }
                    }
                    j10 = 0;
                }
                if (j18 == j10) {
                    i11 = i17;
                    j17 = j10;
                    break;
                }
                i16 += 64;
                j17 = j18;
                j18 = j10;
            }
            if (arrayList == null || (iArr = C16877v.s1(arrayList)) == null) {
                iArr = this.f23413d;
            }
            return new C5345n(j18, j17, i11, iArr).B(i12);
        }
        return this;
    }

    public Iterator<Integer> iterator() {
        return C15768k.b(new b(this, (C17164e<? super b>) null)).iterator();
    }

    public final C5345n q(C5345n nVar) {
        C5345n nVar2;
        int[] iArr;
        C5345n nVar3 = f23409f;
        if (nVar == nVar3) {
            return this;
        }
        if (this == nVar3) {
            return nVar3;
        }
        int i10 = nVar.f23412c;
        int i11 = this.f23412c;
        if (i10 == i11 && nVar.f23413d == (iArr = this.f23413d)) {
            return new C5345n(this.f23410a & (~nVar.f23410a), this.f23411b & (~nVar.f23411b), i11, iArr);
        }
        int[] b10 = nVar.f23413d;
        if (b10 != null) {
            nVar2 = this;
            for (int s10 : b10) {
                nVar2 = nVar2.s(s10);
            }
        } else {
            nVar2 = this;
        }
        if (nVar.f23411b != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((nVar.f23411b & (1 << i12)) != 0) {
                    nVar2 = nVar2.s(nVar.f23412c + i12);
                }
            }
        }
        if (nVar.f23410a != 0) {
            for (int i13 = 0; i13 < 64; i13++) {
                if ((nVar.f23410a & (1 << i13)) != 0) {
                    nVar2 = nVar2.s(i13 + 64 + nVar.f23412c);
                }
            }
        }
        return nVar2;
    }

    public final C5345n s(int i10) {
        int[] iArr;
        int a10;
        int i11 = i10;
        int i12 = this.f23412c;
        int i13 = i11 - i12;
        if (i13 >= 0 && i13 < 64) {
            long j10 = 1 << i13;
            long j11 = this.f23411b;
            if ((j11 & j10) != 0) {
                return new C5345n(this.f23410a, j11 & (~j10), i12, this.f23413d);
            }
        } else if (i13 >= 64 && i13 < 128) {
            long j12 = 1 << (i13 - 64);
            long j13 = this.f23410a;
            if ((j13 & j12) != 0) {
                return new C5345n(j13 & (~j12), this.f23411b, i12, this.f23413d);
            }
        } else if (i13 < 0 && (iArr = this.f23413d) != null && (a10 = C5346o.a(iArr, i11)) >= 0) {
            int length = iArr.length;
            int i14 = length - 1;
            if (i14 == 0) {
                return new C5345n(this.f23410a, this.f23411b, this.f23412c, (int[]) null);
            }
            int[] iArr2 = new int[i14];
            if (a10 > 0) {
                C16870n.l(iArr, iArr2, 0, 0, a10);
            }
            if (a10 < i14) {
                C16870n.l(iArr, iArr2, a10, a10 + 1, length);
            }
            return new C5345n(this.f23410a, this.f23411b, this.f23412c, iArr2);
        }
        return this;
    }

    public final boolean t(int i10) {
        int[] iArr;
        int i11 = i10 - this.f23412c;
        boolean z10 = true;
        if (i11 >= 0 && i11 < 64) {
            return ((1 << i11) & this.f23411b) != 0;
        }
        if (i11 >= 64 && i11 < 128) {
            return ((1 << (i11 - 64)) & this.f23410a) != 0;
        }
        if (i11 > 0 || (iArr = this.f23413d) == null) {
            return false;
        }
        if (C5346o.a(iArr, i10) < 0) {
            z10 = false;
        }
        return z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(C16877v.y(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        sb2.append(C5333b.d(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 63, (Object) null));
        sb2.append(']');
        return sb2.toString();
    }

    public final int x(int i10) {
        int[] iArr = this.f23413d;
        if (iArr != null) {
            return iArr[0];
        }
        long j10 = this.f23411b;
        if (j10 != 0) {
            return this.f23412c + Long.numberOfTrailingZeros(j10);
        }
        long j11 = this.f23410a;
        return j11 != 0 ? this.f23412c + 64 + Long.numberOfTrailingZeros(j11) : i10;
    }
}
