package Uc;

import U0.C4899r0;
import U0.o1;
import Uc.C9288a0;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import qa.d;
import qa.e;
import qa.h;
import qa.k;
import qa.l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b'\b\u0001\u0018\u00002\u00020\u0001B\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016RG\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dRG\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dRG\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dRG\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dRG\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028F@FX\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001dRG\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0019\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dRG\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0019\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dRG\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0019\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dRG\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0019\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dRG\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0002¢\u0006\u0012\n\u0004\b.\u0010\u0019\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dRG\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0002¢\u0006\u0012\n\u0004\b0\u0010\u0019\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u0010\u001d¨\u00064"}, d2 = {"LUc/y;", "LUc/a0;", "Lkotlin/Function1;", "Lqa/d;", "LXH/N;", "onCircleClick", "Lqa/e;", "onGroundOverlayClick", "Lqa/k;", "onPolygonClick", "Lqa/l;", "onPolylineClick", "Lqa/h;", "", "onMarkerClick", "onInfoWindowClick", "onInfoWindowClose", "onInfoWindowLongClick", "onMarkerDrag", "onMarkerDragEnd", "onMarkerDragStart", "<init>", "(LnI/l;LnI/l;LnI/l;LnI/l;LnI/l;LnI/l;LnI/l;LnI/l;LnI/l;LnI/l;LnI/l;)V", "<set-?>", "a", "LU0/r0;", "d", "()LnI/l;", "setOnCircleClick", "(LnI/l;)V", "b", "e", "setOnGroundOverlayClick", "c", "m", "setOnPolygonClick", "n", "setOnPolylineClick", "i", "setOnMarkerClick", "f", "setOnInfoWindowClick", "g", "setOnInfoWindowClose", "h", "setOnInfoWindowLongClick", "j", "setOnMarkerDrag", "k", "setOnMarkerDragEnd", "l", "setOnMarkerDragStart", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Uc.y  reason: case insensitive filesystem */
public final class C9338y implements C9288a0 {

    /* renamed from: a  reason: collision with root package name */
    private final C4899r0 f64453a;

    /* renamed from: b  reason: collision with root package name */
    private final C4899r0 f64454b;

    /* renamed from: c  reason: collision with root package name */
    private final C4899r0 f64455c;

    /* renamed from: d  reason: collision with root package name */
    private final C4899r0 f64456d;

    /* renamed from: e  reason: collision with root package name */
    private final C4899r0 f64457e;

    /* renamed from: f  reason: collision with root package name */
    private final C4899r0 f64458f;

    /* renamed from: g  reason: collision with root package name */
    private final C4899r0 f64459g;

    /* renamed from: h  reason: collision with root package name */
    private final C4899r0 f64460h;

    /* renamed from: i  reason: collision with root package name */
    private final C4899r0 f64461i;

    /* renamed from: j  reason: collision with root package name */
    private final C4899r0 f64462j;

    /* renamed from: k  reason: collision with root package name */
    private final C4899r0 f64463k;

    public C9338y() {
        this((C17642l) null, (C17642l) null, (C17642l) null, (C17642l) null, (C17642l) null, (C17642l) null, (C17642l) null, (C17642l) null, (C17642l) null, (C17642l) null, (C17642l) null, 2047, (DefaultConstructorMarker) null);
    }

    public void a() {
        C9288a0.a.b(this);
    }

    public void b() {
        C9288a0.a.a(this);
    }

    public void c() {
        C9288a0.a.c(this);
    }

    public final C17642l<d, C16807N> d() {
        return (C17642l) this.f64453a.getValue();
    }

    public final C17642l<e, C16807N> e() {
        return (C17642l) this.f64454b.getValue();
    }

    public final C17642l<h, C16807N> f() {
        return (C17642l) this.f64458f.getValue();
    }

    public final C17642l<h, C16807N> g() {
        return (C17642l) this.f64459g.getValue();
    }

    public final C17642l<h, C16807N> h() {
        return (C17642l) this.f64460h.getValue();
    }

    public final C17642l<h, Boolean> i() {
        return (C17642l) this.f64457e.getValue();
    }

    public final C17642l<h, C16807N> j() {
        return (C17642l) this.f64461i.getValue();
    }

    public final C17642l<h, C16807N> k() {
        return (C17642l) this.f64462j.getValue();
    }

    public final C17642l<h, C16807N> l() {
        return (C17642l) this.f64463k.getValue();
    }

    public final C17642l<k, C16807N> m() {
        return (C17642l) this.f64455c.getValue();
    }

    public final C17642l<l, C16807N> n() {
        return (C17642l) this.f64456d.getValue();
    }

    public C9338y(C17642l<? super d, C16807N> lVar, C17642l<? super e, C16807N> lVar2, C17642l<? super k, C16807N> lVar3, C17642l<? super l, C16807N> lVar4, C17642l<? super h, Boolean> lVar5, C17642l<? super h, C16807N> lVar6, C17642l<? super h, C16807N> lVar7, C17642l<? super h, C16807N> lVar8, C17642l<? super h, C16807N> lVar9, C17642l<? super h, C16807N> lVar10, C17642l<? super h, C16807N> lVar11) {
        this.f64453a = u1.e(lVar, (o1) null, 2, (Object) null);
        this.f64454b = u1.e(lVar2, (o1) null, 2, (Object) null);
        this.f64455c = u1.e(lVar3, (o1) null, 2, (Object) null);
        this.f64456d = u1.e(lVar4, (o1) null, 2, (Object) null);
        this.f64457e = u1.e(lVar5, (o1) null, 2, (Object) null);
        this.f64458f = u1.e(lVar6, (o1) null, 2, (Object) null);
        this.f64459g = u1.e(lVar7, (o1) null, 2, (Object) null);
        this.f64460h = u1.e(lVar8, (o1) null, 2, (Object) null);
        this.f64461i = u1.e(lVar9, (o1) null, 2, (Object) null);
        this.f64462j = u1.e(lVar10, (o1) null, 2, (Object) null);
        this.f64463k = u1.e(lVar11, (o1) null, 2, (Object) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C9338y(nI.C17642l r13, nI.C17642l r14, nI.C17642l r15, nI.C17642l r16, nI.C17642l r17, nI.C17642l r18, nI.C17642l r19, nI.C17642l r20, nI.C17642l r21, nI.C17642l r22, nI.C17642l r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r12 = this;
            r0 = r24
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r13
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r14
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r15
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x0020
        L_0x001e:
            r5 = r16
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0028
        L_0x0026:
            r6 = r17
        L_0x0028:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002e
            r7 = r2
            goto L_0x0030
        L_0x002e:
            r7 = r18
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r2
            goto L_0x0038
        L_0x0036:
            r8 = r19
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003e
            r9 = r2
            goto L_0x0040
        L_0x003e:
            r9 = r20
        L_0x0040:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0046
            r10 = r2
            goto L_0x0048
        L_0x0046:
            r10 = r21
        L_0x0048:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004e
            r11 = r2
            goto L_0x0050
        L_0x004e:
            r11 = r22
        L_0x0050:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r2 = r23
        L_0x0057:
            r13 = r12
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Uc.C9338y.<init>(nI.l, nI.l, nI.l, nI.l, nI.l, nI.l, nI.l, nI.l, nI.l, nI.l, nI.l, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
