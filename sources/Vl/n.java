package vl;

import IC.C13023e;
import N1.C4669d;
import SC.C13569b1;
import SC.C13573c1;
import SC.C13589g1;
import TC.C13679b;
import U0.C4889m;
import XH.C16807N;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import nI.C17631a;
import nI.p;
import xB.C15201a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0001\u0002\u0015\u0016¨\u0006\u0017"}, d2 = {"Lvl/n;", "LxB/a;", "<init>", "()V", "", "getId", "()Ljava/lang/String;", "id", "h", "testTag", "Lkotlin/Function0;", "LXH/N;", "g", "()LnI/a;", "onBind", "", "f", "()J", "stableId", "b", "a", "Lvl/n$a;", "Lvl/n$b;", "uicomposables_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class n implements C15201a {

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u0017\u0010-\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b+\u0010,R\u0017\u00102\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lvl/n$a;", "Lvl/n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "id", "b", "h", "testTag", "LSC/g1;", "c", "LSC/g1;", "n", "()LSC/g1;", "size", "d", "Z", "getEnabled", "()Z", "enabled", "Lkotlin/Function0;", "LXH/N;", "e", "LnI/a;", "j", "()LnI/a;", "onClick", "f", "g", "onBind", "LN1/d;", "LN1/d;", "i", "()LN1/d;", "annotatedString", "LTC/b;", "LTC/b;", "o", "()LTC/b;", "textStyle", "uicomposables_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends n {

        /* renamed from: a  reason: collision with root package name */
        private final String f105169a;

        /* renamed from: b  reason: collision with root package name */
        private final String f105170b;

        /* renamed from: c  reason: collision with root package name */
        private final C13589g1 f105171c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f105172d;

        /* renamed from: e  reason: collision with root package name */
        private final C17631a<C16807N> f105173e;

        /* renamed from: f  reason: collision with root package name */
        private final C17631a<C16807N> f105174f;

        /* renamed from: g  reason: collision with root package name */
        private final C4669d f105175g;

        /* renamed from: h  reason: collision with root package name */
        private final C13679b f105176h;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f105169a, aVar.f105169a) && C17542s.e(this.f105170b, aVar.f105170b) && this.f105171c == aVar.f105171c && this.f105172d == aVar.f105172d && C17542s.e(this.f105173e, aVar.f105173e) && C17542s.e(this.f105174f, aVar.f105174f) && C17542s.e(this.f105175g, aVar.f105175g) && C17542s.e(this.f105176h, aVar.f105176h);
        }

        public C17631a<C16807N> g() {
            return this.f105174f;
        }

        public String getId() {
            return this.f105169a;
        }

        public String h() {
            return this.f105170b;
        }

        public int hashCode() {
            int hashCode = this.f105169a.hashCode() * 31;
            String str = this.f105170b;
            int i10 = 0;
            int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f105171c.hashCode()) * 31) + Boolean.hashCode(this.f105172d)) * 31;
            C17631a<C16807N> aVar = this.f105173e;
            int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            C17631a<C16807N> aVar2 = this.f105174f;
            if (aVar2 != null) {
                i10 = aVar2.hashCode();
            }
            return ((((hashCode3 + i10) * 31) + this.f105175g.hashCode()) * 31) + this.f105176h.hashCode();
        }

        public final C4669d i() {
            return this.f105175g;
        }

        public C17631a<C16807N> j() {
            return this.f105173e;
        }

        public C13589g1 n() {
            return this.f105171c;
        }

        public final C13679b o() {
            return this.f105176h;
        }

        public String toString() {
            String str = this.f105169a;
            String str2 = this.f105170b;
            C13589g1 g1Var = this.f105171c;
            boolean z10 = this.f105172d;
            C17631a<C16807N> aVar = this.f105173e;
            C17631a<C16807N> aVar2 = this.f105174f;
            C4669d dVar = this.f105175g;
            C13679b bVar = this.f105176h;
            return "Annotated(id=" + str + ", testTag=" + str2 + ", size=" + g1Var + ", enabled=" + z10 + ", onClick=" + aVar + ", onBind=" + aVar2 + ", annotatedString=" + dVar + ", textStyle=" + bVar + ")";
        }
    }

    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public long f() {
        String id2 = getId();
        U u10 = new U(3);
        u10.a(P.b(n.class));
        u10.a(id2);
        u10.b(new Object[0]);
        return (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public abstract C17631a<C16807N> g();

    public abstract String getId();

    public abstract String h();

    private n() {
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b'\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016X\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016X\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b%\u00104\u001a\u0004\b7\u00106R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b7\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b?\u0010+\u001a\u0004\b@\u0010-R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b8\u0010C¨\u0006D"}, d2 = {"Lvl/n$b;", "Lvl/n;", "", "id", "testTag", "LSC/g1;", "size", "", "enabled", "Lkotlin/Function0;", "LXH/N;", "onClick", "onBind", "LIC/e;", "title", "description", "LSC/c1;", "leadingImage", "LSC/b1;", "trailingControl", "emphasised", "addons", "<init>", "(Ljava/lang/String;Ljava/lang/String;LSC/g1;ZLnI/a;LnI/a;LIC/e;LIC/e;LSC/c1;LSC/b1;ZLnI/p;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "h", "c", "LSC/g1;", "r", "()LSC/g1;", "d", "Z", "o", "()Z", "e", "LnI/a;", "q", "()LnI/a;", "f", "g", "LIC/e;", "getTitle", "()LIC/e;", "j", "i", "LSC/c1;", "p", "()LSC/c1;", "LSC/b1;", "s", "()LSC/b1;", "k", "n", "l", "LnI/p;", "()LnI/p;", "uicomposables_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends n {

        /* renamed from: m  reason: collision with root package name */
        public static final int f105177m;

        /* renamed from: a  reason: collision with root package name */
        private final String f105178a;

        /* renamed from: b  reason: collision with root package name */
        private final String f105179b;

        /* renamed from: c  reason: collision with root package name */
        private final C13589g1 f105180c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f105181d;

        /* renamed from: e  reason: collision with root package name */
        private final C17631a<C16807N> f105182e;

        /* renamed from: f  reason: collision with root package name */
        private final C17631a<C16807N> f105183f;

        /* renamed from: g  reason: collision with root package name */
        private final C13023e f105184g;

        /* renamed from: h  reason: collision with root package name */
        private final C13023e f105185h;

        /* renamed from: i  reason: collision with root package name */
        private final C13573c1 f105186i;

        /* renamed from: j  reason: collision with root package name */
        private final C13569b1 f105187j;

        /* renamed from: k  reason: collision with root package name */
        private final boolean f105188k;

        /* renamed from: l  reason: collision with root package name */
        private final p<C4889m, Integer, C16807N> f105189l;

        static {
            int i10 = C13569b1.f116141a | C13573c1.f116163a;
            int i11 = C13023e.f110931a;
            f105177m = i10 | i11 | i11;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ b(java.lang.String r17, java.lang.String r18, SC.C13589g1 r19, boolean r20, nI.C17631a r21, nI.C17631a r22, IC.C13023e r23, IC.C13023e r24, SC.C13573c1 r25, SC.C13569b1 r26, boolean r27, nI.p r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
            /*
                r16 = this;
                r0 = r29
                r1 = r0 & 2
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r5 = r2
                goto L_0x000b
            L_0x0009:
                r5 = r18
            L_0x000b:
                r1 = r0 & 4
                if (r1 == 0) goto L_0x0013
                SC.g1 r1 = SC.C13589g1.Medium
                r6 = r1
                goto L_0x0015
            L_0x0013:
                r6 = r19
            L_0x0015:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x001c
                r1 = 1
                r7 = r1
                goto L_0x001e
            L_0x001c:
                r7 = r20
            L_0x001e:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0024
                r9 = r2
                goto L_0x0026
            L_0x0024:
                r9 = r22
            L_0x0026:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x002c
                r11 = r2
                goto L_0x002e
            L_0x002c:
                r11 = r24
            L_0x002e:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x0036
                SC.c1$c r1 = SC.C13573c1.c.f116171b
                r12 = r1
                goto L_0x0038
            L_0x0036:
                r12 = r25
            L_0x0038:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x0040
                SC.b1$g r1 = SC.C13569b1.g.f116154b
                r13 = r1
                goto L_0x0042
            L_0x0040:
                r13 = r26
            L_0x0042:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L_0x0049
                r1 = 0
                r14 = r1
                goto L_0x004b
            L_0x0049:
                r14 = r27
            L_0x004b:
                r0 = r0 & 2048(0x800, float:2.87E-42)
                if (r0 == 0) goto L_0x0051
                r15 = r2
                goto L_0x0053
            L_0x0051:
                r15 = r28
            L_0x0053:
                r3 = r16
                r4 = r17
                r8 = r21
                r10 = r23
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vl.n.b.<init>(java.lang.String, java.lang.String, SC.g1, boolean, nI.a, nI.a, IC.e, IC.e, SC.c1, SC.b1, boolean, nI.p, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f105178a, bVar.f105178a) && C17542s.e(this.f105179b, bVar.f105179b) && this.f105180c == bVar.f105180c && this.f105181d == bVar.f105181d && C17542s.e(this.f105182e, bVar.f105182e) && C17542s.e(this.f105183f, bVar.f105183f) && C17542s.e(this.f105184g, bVar.f105184g) && C17542s.e(this.f105185h, bVar.f105185h) && C17542s.e(this.f105186i, bVar.f105186i) && C17542s.e(this.f105187j, bVar.f105187j) && this.f105188k == bVar.f105188k && C17542s.e(this.f105189l, bVar.f105189l);
        }

        public C17631a<C16807N> g() {
            return this.f105183f;
        }

        public String getId() {
            return this.f105178a;
        }

        public final C13023e getTitle() {
            return this.f105184g;
        }

        public String h() {
            return this.f105179b;
        }

        public int hashCode() {
            int hashCode = this.f105178a.hashCode() * 31;
            String str = this.f105179b;
            int i10 = 0;
            int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f105180c.hashCode()) * 31) + Boolean.hashCode(this.f105181d)) * 31;
            C17631a<C16807N> aVar = this.f105182e;
            int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            C17631a<C16807N> aVar2 = this.f105183f;
            int hashCode4 = (((hashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31) + this.f105184g.hashCode()) * 31;
            C13023e eVar = this.f105185h;
            int hashCode5 = (((((((hashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f105186i.hashCode()) * 31) + this.f105187j.hashCode()) * 31) + Boolean.hashCode(this.f105188k)) * 31;
            p<C4889m, Integer, C16807N> pVar = this.f105189l;
            if (pVar != null) {
                i10 = pVar.hashCode();
            }
            return hashCode5 + i10;
        }

        public final p<C4889m, Integer, C16807N> i() {
            return this.f105189l;
        }

        public final C13023e j() {
            return this.f105185h;
        }

        public final boolean n() {
            return this.f105188k;
        }

        public boolean o() {
            return this.f105181d;
        }

        public final C13573c1 p() {
            return this.f105186i;
        }

        public C17631a<C16807N> q() {
            return this.f105182e;
        }

        public C13589g1 r() {
            return this.f105180c;
        }

        public final C13569b1 s() {
            return this.f105187j;
        }

        public String toString() {
            String str = this.f105178a;
            String str2 = this.f105179b;
            C13589g1 g1Var = this.f105180c;
            boolean z10 = this.f105181d;
            C17631a<C16807N> aVar = this.f105182e;
            C17631a<C16807N> aVar2 = this.f105183f;
            C13023e eVar = this.f105184g;
            C13023e eVar2 = this.f105185h;
            C13573c1 c1Var = this.f105186i;
            C13569b1 b1Var = this.f105187j;
            boolean z11 = this.f105188k;
            p<C4889m, Integer, C16807N> pVar = this.f105189l;
            return "Regular(id=" + str + ", testTag=" + str2 + ", size=" + g1Var + ", enabled=" + z10 + ", onClick=" + aVar + ", onBind=" + aVar2 + ", title=" + eVar + ", description=" + eVar2 + ", leadingImage=" + c1Var + ", trailingControl=" + b1Var + ", emphasised=" + z11 + ", addons=" + pVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, C13589g1 g1Var, boolean z10, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C13023e eVar, C13023e eVar2, C13573c1 c1Var, C13569b1 b1Var, boolean z11, p<? super C4889m, ? super Integer, C16807N> pVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "id");
            C17542s.j(g1Var, "size");
            C17542s.j(eVar, "title");
            C17542s.j(c1Var, "leadingImage");
            C17542s.j(b1Var, "trailingControl");
            this.f105178a = str;
            this.f105179b = str2;
            this.f105180c = g1Var;
            this.f105181d = z10;
            this.f105182e = aVar;
            this.f105183f = aVar2;
            this.f105184g = eVar;
            this.f105185h = eVar2;
            this.f105186i = c1Var;
            this.f105187j = b1Var;
            this.f105188k = z11;
            this.f105189l = pVar;
        }
    }
}
