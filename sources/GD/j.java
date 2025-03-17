package GD;

import GD.k;
import IC.C13023e;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jt\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b*\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b%\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b.\u0010\u0017R\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\u0006068\u0006¢\u0006\f\n\u0004\b#\u00107\u001a\u0004\b4\u00108¨\u0006:"}, d2 = {"LGD/j;", "", "LGD/g;", "navigateTo", "LIC/e;", "userMessage", "LGD/f;", "profileCards", "prepaidCards", "rewardsCards", "LGD/k$b$f;", "pendingRemoval", "", "showDetachPrepaidCardConfirmation", "LGD/e;", "attachCardState", "", "scrollToRedemptionCode", "<init>", "(LGD/g;LIC/e;LGD/f;LGD/f;LGD/f;LGD/k$b$f;ZLGD/e;Ljava/lang/String;)V", "a", "(LGD/g;LIC/e;LGD/f;LGD/f;LGD/f;LGD/k$b$f;ZLGD/e;Ljava/lang/String;)LGD/j;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LGD/g;", "d", "()LGD/g;", "b", "LIC/e;", "j", "()LIC/e;", "c", "LGD/f;", "getProfileCards", "()LGD/f;", "f", "e", "getRewardsCards", "LGD/k$b$f;", "()LGD/k$b$f;", "g", "Z", "h", "()Z", "LGD/e;", "()LGD/e;", "i", "Ljava/lang/String;", "", "Ljava/util/List;", "()Ljava/util/List;", "sourcesInPriorityOrder", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final C12934g f110392a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f110393b;

    /* renamed from: c  reason: collision with root package name */
    private final C12933f f110394c;

    /* renamed from: d  reason: collision with root package name */
    private final C12933f f110395d;

    /* renamed from: e  reason: collision with root package name */
    private final C12933f f110396e;

    /* renamed from: f  reason: collision with root package name */
    private final k.b.f f110397f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f110398g;

    /* renamed from: h  reason: collision with root package name */
    private final C12932e f110399h;

    /* renamed from: i  reason: collision with root package name */
    private final String f110400i;

    /* renamed from: j  reason: collision with root package name */
    private final List<C12933f> f110401j;

    public j() {
        this((C12934g) null, (C13023e) null, (C12933f) null, (C12933f) null, (C12933f) null, (k.b.f) null, false, (C12932e) null, (String) null, 511, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ j b(j jVar, C12934g gVar, C13023e eVar, C12933f fVar, C12933f fVar2, C12933f fVar3, k.b.f fVar4, boolean z10, C12932e eVar2, String str, int i10, Object obj) {
        j jVar2 = jVar;
        int i11 = i10;
        return jVar.a((i11 & 1) != 0 ? jVar2.f110392a : gVar, (i11 & 2) != 0 ? jVar2.f110393b : eVar, (i11 & 4) != 0 ? jVar2.f110394c : fVar, (i11 & 8) != 0 ? jVar2.f110395d : fVar2, (i11 & 16) != 0 ? jVar2.f110396e : fVar3, (i11 & 32) != 0 ? jVar2.f110397f : fVar4, (i11 & 64) != 0 ? jVar2.f110398g : z10, (i11 & 128) != 0 ? jVar2.f110399h : eVar2, (i11 & 256) != 0 ? jVar2.f110400i : str);
    }

    public final j a(C12934g gVar, C13023e eVar, C12933f fVar, C12933f fVar2, C12933f fVar3, k.b.f fVar4, boolean z10, C12932e eVar2, String str) {
        C17542s.j(fVar, "profileCards");
        C17542s.j(fVar2, "prepaidCards");
        C12933f fVar5 = fVar3;
        C17542s.j(fVar5, "rewardsCards");
        return new j(gVar, eVar, fVar, fVar2, fVar5, fVar4, z10, eVar2, str);
    }

    public final C12932e c() {
        return this.f110399h;
    }

    public final C12934g d() {
        return this.f110392a;
    }

    public final k.b.f e() {
        return this.f110397f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return C17542s.e(this.f110392a, jVar.f110392a) && C17542s.e(this.f110393b, jVar.f110393b) && C17542s.e(this.f110394c, jVar.f110394c) && C17542s.e(this.f110395d, jVar.f110395d) && C17542s.e(this.f110396e, jVar.f110396e) && C17542s.e(this.f110397f, jVar.f110397f) && this.f110398g == jVar.f110398g && C17542s.e(this.f110399h, jVar.f110399h) && C17542s.e(this.f110400i, jVar.f110400i);
    }

    public final C12933f f() {
        return this.f110395d;
    }

    public final String g() {
        return this.f110400i;
    }

    public final boolean h() {
        return this.f110398g;
    }

    public int hashCode() {
        C12934g gVar = this.f110392a;
        int i10 = 0;
        int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        C13023e eVar = this.f110393b;
        int hashCode2 = (((((((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f110394c.hashCode()) * 31) + this.f110395d.hashCode()) * 31) + this.f110396e.hashCode()) * 31;
        k.b.f fVar = this.f110397f;
        int hashCode3 = (((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + Boolean.hashCode(this.f110398g)) * 31;
        C12932e eVar2 = this.f110399h;
        int hashCode4 = (hashCode3 + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        String str = this.f110400i;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode4 + i10;
    }

    public final List<C12933f> i() {
        return this.f110401j;
    }

    public final C13023e j() {
        return this.f110393b;
    }

    public String toString() {
        C12934g gVar = this.f110392a;
        C13023e eVar = this.f110393b;
        C12933f fVar = this.f110394c;
        C12933f fVar2 = this.f110395d;
        C12933f fVar3 = this.f110396e;
        k.b.f fVar4 = this.f110397f;
        boolean z10 = this.f110398g;
        C12932e eVar2 = this.f110399h;
        String str = this.f110400i;
        return "ViewModelState(navigateTo=" + gVar + ", userMessage=" + eVar + ", profileCards=" + fVar + ", prepaidCards=" + fVar2 + ", rewardsCards=" + fVar3 + ", pendingRemoval=" + fVar4 + ", showDetachPrepaidCardConfirmation=" + z10 + ", attachCardState=" + eVar2 + ", scrollToRedemptionCode=" + str + ")";
    }

    public j(C12934g gVar, C13023e eVar, C12933f fVar, C12933f fVar2, C12933f fVar3, k.b.f fVar4, boolean z10, C12932e eVar2, String str) {
        C17542s.j(fVar, "profileCards");
        C17542s.j(fVar2, "prepaidCards");
        C17542s.j(fVar3, "rewardsCards");
        this.f110392a = gVar;
        this.f110393b = eVar;
        this.f110394c = fVar;
        this.f110395d = fVar2;
        this.f110396e = fVar3;
        this.f110397f = fVar4;
        this.f110398g = z10;
        this.f110399h = eVar2;
        this.f110400i = str;
        this.f110401j = C16877v.q(fVar, fVar3, fVar2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ j(GD.C12934g r11, IC.C13023e r12, GD.C12933f r13, GD.C12933f r14, GD.C12933f r15, GD.k.b.f r16, boolean r17, GD.C12932e r18, java.lang.String r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            r5 = 1
            if (r4 == 0) goto L_0x001c
            GD.f$d r4 = new GD.f$d
            r4.<init>(r2, r5, r2)
            goto L_0x001d
        L_0x001c:
            r4 = r13
        L_0x001d:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0027
            GD.f$d r6 = new GD.f$d
            r6.<init>(r2, r5, r2)
            goto L_0x0028
        L_0x0027:
            r6 = r14
        L_0x0028:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0032
            GD.f$d r7 = new GD.f$d
            r7.<init>(r2, r5, r2)
            goto L_0x0033
        L_0x0032:
            r7 = r15
        L_0x0033:
            r5 = r0 & 32
            if (r5 == 0) goto L_0x0039
            r5 = r2
            goto L_0x003b
        L_0x0039:
            r5 = r16
        L_0x003b:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0041
            r8 = 0
            goto L_0x0043
        L_0x0041:
            r8 = r17
        L_0x0043:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0049
            r9 = r2
            goto L_0x004b
        L_0x0049:
            r9 = r18
        L_0x004b:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r2 = r19
        L_0x0052:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r6
            r16 = r7
            r17 = r5
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: GD.j.<init>(GD.g, IC.e, GD.f, GD.f, GD.f, GD.k$b$f, boolean, GD.e, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
