package PB;

import IC.C13023e;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\"\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b2\u00100R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00100R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b6\u00100R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010/\u001a\u0004\b7\u00100R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b1\u00100R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b5\u00100R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b2\u00109\u001a\u0004\b*\u0010:R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b4\u0010;\u001a\u0004\b3\u0010<R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b$\u0010=\u001a\u0004\b8\u0010>¨\u0006?"}, d2 = {"LPB/f;", "", "LIC/e;", "title", "LPB/h;", "userMessage", "LPB/c;", "navigateTo", "", "disableElements", "showScanAndGoHeader", "showStockDisclaimerHeader", "isScanAndGoActive", "showRequestPermissionButton", "doLocationPermissionRequest", "hideDetailsButton", "LPB/b;", "content", "LPB/d;", "fabData", "LPB/e;", "searchResult", "<init>", "(LIC/e;LPB/h;LPB/c;ZZZZZZZLPB/b;LPB/d;LPB/e;)V", "a", "(LIC/e;LPB/h;LPB/c;ZZZZZZZLPB/b;LPB/d;LPB/e;)LPB/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LIC/e;", "m", "()LIC/e;", "b", "LPB/h;", "n", "()LPB/h;", "c", "LPB/c;", "h", "()LPB/c;", "d", "Z", "()Z", "e", "k", "f", "l", "g", "o", "j", "i", "LPB/b;", "()LPB/b;", "LPB/d;", "()LPB/d;", "LPB/e;", "()LPB/e;", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* renamed from: n  reason: collision with root package name */
    public static final int f113851n = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final C13023e f113852a;

    /* renamed from: b  reason: collision with root package name */
    private final h f113853b;

    /* renamed from: c  reason: collision with root package name */
    private final C13334c f113854c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f113855d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f113856e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f113857f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f113858g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f113859h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f113860i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f113861j;

    /* renamed from: k  reason: collision with root package name */
    private final C13333b f113862k;

    /* renamed from: l  reason: collision with root package name */
    private final d f113863l;

    /* renamed from: m  reason: collision with root package name */
    private final e f113864m;

    public f() {
        this((C13023e) null, (h) null, (C13334c) null, false, false, false, false, false, false, false, (C13333b) null, (d) null, (e) null, 8191, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ f b(f fVar, C13023e eVar, h hVar, C13334c cVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, C13333b bVar, d dVar, e eVar2, int i10, Object obj) {
        f fVar2 = fVar;
        int i11 = i10;
        return fVar.a((i11 & 1) != 0 ? fVar2.f113852a : eVar, (i11 & 2) != 0 ? fVar2.f113853b : hVar, (i11 & 4) != 0 ? fVar2.f113854c : cVar, (i11 & 8) != 0 ? fVar2.f113855d : z10, (i11 & 16) != 0 ? fVar2.f113856e : z11, (i11 & 32) != 0 ? fVar2.f113857f : z12, (i11 & 64) != 0 ? fVar2.f113858g : z13, (i11 & 128) != 0 ? fVar2.f113859h : z14, (i11 & 256) != 0 ? fVar2.f113860i : z15, (i11 & 512) != 0 ? fVar2.f113861j : z16, (i11 & 1024) != 0 ? fVar2.f113862k : bVar, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? fVar2.f113863l : dVar, (i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? fVar2.f113864m : eVar2);
    }

    public final f a(C13023e eVar, h hVar, C13334c cVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, C13333b bVar, d dVar, e eVar2) {
        C13023e eVar3 = eVar;
        C17542s.j(eVar3, "title");
        C13333b bVar2 = bVar;
        C17542s.j(bVar2, "content");
        return new f(eVar3, hVar, cVar, z10, z11, z12, z13, z14, z15, z16, bVar2, dVar, eVar2);
    }

    public final C13333b c() {
        return this.f113862k;
    }

    public final boolean d() {
        return this.f113855d;
    }

    public final boolean e() {
        return this.f113860i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return C17542s.e(this.f113852a, fVar.f113852a) && C17542s.e(this.f113853b, fVar.f113853b) && C17542s.e(this.f113854c, fVar.f113854c) && this.f113855d == fVar.f113855d && this.f113856e == fVar.f113856e && this.f113857f == fVar.f113857f && this.f113858g == fVar.f113858g && this.f113859h == fVar.f113859h && this.f113860i == fVar.f113860i && this.f113861j == fVar.f113861j && C17542s.e(this.f113862k, fVar.f113862k) && C17542s.e(this.f113863l, fVar.f113863l) && C17542s.e(this.f113864m, fVar.f113864m);
    }

    public final d f() {
        return this.f113863l;
    }

    public final boolean g() {
        return this.f113861j;
    }

    public final C13334c h() {
        return this.f113854c;
    }

    public int hashCode() {
        int hashCode = this.f113852a.hashCode() * 31;
        h hVar = this.f113853b;
        int i10 = 0;
        int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        C13334c cVar = this.f113854c;
        int hashCode3 = (((((((((((((((((hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31) + Boolean.hashCode(this.f113855d)) * 31) + Boolean.hashCode(this.f113856e)) * 31) + Boolean.hashCode(this.f113857f)) * 31) + Boolean.hashCode(this.f113858g)) * 31) + Boolean.hashCode(this.f113859h)) * 31) + Boolean.hashCode(this.f113860i)) * 31) + Boolean.hashCode(this.f113861j)) * 31) + this.f113862k.hashCode()) * 31;
        d dVar = this.f113863l;
        int hashCode4 = (hashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e eVar = this.f113864m;
        if (eVar != null) {
            i10 = eVar.hashCode();
        }
        return hashCode4 + i10;
    }

    public final e i() {
        return this.f113864m;
    }

    public final boolean j() {
        return this.f113859h;
    }

    public final boolean k() {
        return this.f113856e;
    }

    public final boolean l() {
        return this.f113857f;
    }

    public final C13023e m() {
        return this.f113852a;
    }

    public final h n() {
        return this.f113853b;
    }

    public final boolean o() {
        return this.f113858g;
    }

    public String toString() {
        C13023e eVar = this.f113852a;
        h hVar = this.f113853b;
        C13334c cVar = this.f113854c;
        boolean z10 = this.f113855d;
        boolean z11 = this.f113856e;
        boolean z12 = this.f113857f;
        boolean z13 = this.f113858g;
        boolean z14 = this.f113859h;
        boolean z15 = this.f113860i;
        boolean z16 = this.f113861j;
        C13333b bVar = this.f113862k;
        d dVar = this.f113863l;
        e eVar2 = this.f113864m;
        return "State(title=" + eVar + ", userMessage=" + hVar + ", navigateTo=" + cVar + ", disableElements=" + z10 + ", showScanAndGoHeader=" + z11 + ", showStockDisclaimerHeader=" + z12 + ", isScanAndGoActive=" + z13 + ", showRequestPermissionButton=" + z14 + ", doLocationPermissionRequest=" + z15 + ", hideDetailsButton=" + z16 + ", content=" + bVar + ", fabData=" + dVar + ", searchResult=" + eVar2 + ")";
    }

    public f(C13023e eVar, h hVar, C13334c cVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, C13333b bVar, d dVar, e eVar2) {
        C17542s.j(eVar, "title");
        C17542s.j(bVar, "content");
        this.f113852a = eVar;
        this.f113853b = hVar;
        this.f113854c = cVar;
        this.f113855d = z10;
        this.f113856e = z11;
        this.f113857f = z12;
        this.f113858g = z13;
        this.f113859h = z14;
        this.f113860i = z15;
        this.f113861j = z16;
        this.f113862k = bVar;
        this.f113863l = dVar;
        this.f113864m = eVar2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ f(IC.C13023e r15, PB.h r16, PB.C13334c r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, PB.C13333b r25, PB.d r26, PB.e r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r14 = this;
            r0 = r28
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            int r1 = iC.C14551a.f127545r
            IC.e r1 = IC.C13026h.a(r1)
            goto L_0x000e
        L_0x000d:
            r1 = r15
        L_0x000e:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0015
            r2 = r3
            goto L_0x0017
        L_0x0015:
            r2 = r16
        L_0x0017:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001d
            r4 = r3
            goto L_0x001f
        L_0x001d:
            r4 = r17
        L_0x001f:
            r5 = r0 & 8
            r6 = 0
            if (r5 == 0) goto L_0x0026
            r5 = r6
            goto L_0x0028
        L_0x0026:
            r5 = r18
        L_0x0028:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002e
            r7 = r6
            goto L_0x0030
        L_0x002e:
            r7 = r19
        L_0x0030:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0036
            r8 = r6
            goto L_0x0038
        L_0x0036:
            r8 = r20
        L_0x0038:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003e
            r9 = r6
            goto L_0x0040
        L_0x003e:
            r9 = r21
        L_0x0040:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0046
            r10 = r6
            goto L_0x0048
        L_0x0046:
            r10 = r22
        L_0x0048:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004e
            r11 = r6
            goto L_0x0050
        L_0x004e:
            r11 = r23
        L_0x0050:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r6 = r24
        L_0x0057:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005e
            PB.b$b r12 = PB.C13333b.C2799b.f113833a
            goto L_0x0060
        L_0x005e:
            r12 = r25
        L_0x0060:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0066
            r13 = r3
            goto L_0x0068
        L_0x0066:
            r13 = r26
        L_0x0068:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r3 = r27
        L_0x006f:
            r15 = r14
            r16 = r1
            r17 = r2
            r18 = r4
            r19 = r5
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r6
            r26 = r12
            r27 = r13
            r28 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: PB.f.<init>(IC.e, PB.h, PB.c, boolean, boolean, boolean, boolean, boolean, boolean, boolean, PB.b, PB.d, PB.e, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
