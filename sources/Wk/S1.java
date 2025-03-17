package wK;

import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.p1;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5601g;
import n0.C5602h;
import p1.C5747v0;
import zK.C18762g;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b)\b\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001f\u0010 J5\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\"\u0010#J/\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u0019H\u0007¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00192\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010/\u001a\u0004\b2\u00101R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010/\u001a\u0004\b3\u00101R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u00104\u001a\u0004\b5\u00106R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b7\u00101R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u00101R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010/\u001a\u0004\b;\u00101R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\b=\u00106R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010/\u001a\u0004\b:\u00101R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010/\u001a\u0004\b@\u00101R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010/\u001a\u0004\bB\u00101R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bC\u00104\u001a\u0004\bD\u00106R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010/\u001a\u0004\bF\u00101R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b8\u0010IR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010/\u001a\u0004\bK\u00101R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u0010/\u001a\u0004\bM\u00101R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u0010/\u001a\u0004\bO\u00101R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bP\u00104\u001a\u0004\bQ\u00106¨\u0006R"}, d2 = {"LwK/S1;", "", "Lp1/v0;", "defaultBackgroundColor", "defaultContentColor", "defaultBorderColor", "Lc2/h;", "defaultBorderThickness", "disabledBackgroundColor", "disabledContentColor", "disabledBorderColor", "disabledBorderThickness", "pressedBackgroundColor", "pressedContentColor", "pressedBorderColor", "pressedBorderThickness", "focusedBackgroundColor", "LzK/g;", "focusedBorderType", "hoverBackgroundColor", "hoverContentColor", "hoverBorderColor", "hoverBorderThickness", "<init>", "(JJJFJJJFJJJFJLzK/g;JJJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "pressed", "hover", "LU0/A1;", "Ln0/g;", "b", "(ZZZLU0/m;I)LU0/A1;", "focused", "a", "(ZZZZLU0/m;I)LU0/A1;", "c", "(ZZZLU0/m;II)LU0/A1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "d", "()J", "getDefaultContentColor-0d7_KjU", "getDefaultBorderColor-0d7_KjU", "F", "e", "()F", "getDisabledBackgroundColor-0d7_KjU", "f", "getDisabledContentColor-0d7_KjU", "g", "getDisabledBorderColor-0d7_KjU", "h", "getDisabledBorderThickness-D9Ej5fM", "i", "j", "getPressedContentColor-0d7_KjU", "k", "getPressedBorderColor-0d7_KjU", "l", "getPressedBorderThickness-D9Ej5fM", "m", "getFocusedBackgroundColor-0d7_KjU", "n", "LzK/g;", "()LzK/g;", "o", "getHoverBackgroundColor-0d7_KjU", "p", "getHoverContentColor-0d7_KjU", "q", "getHoverBorderColor-0d7_KjU", "r", "getHoverBorderThickness-D9Ej5fM", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class S1 {

    /* renamed from: a  reason: collision with root package name */
    private final long f150104a;

    /* renamed from: b  reason: collision with root package name */
    private final long f150105b;

    /* renamed from: c  reason: collision with root package name */
    private final long f150106c;

    /* renamed from: d  reason: collision with root package name */
    private final float f150107d;

    /* renamed from: e  reason: collision with root package name */
    private final long f150108e;

    /* renamed from: f  reason: collision with root package name */
    private final long f150109f;

    /* renamed from: g  reason: collision with root package name */
    private final long f150110g;

    /* renamed from: h  reason: collision with root package name */
    private final float f150111h;

    /* renamed from: i  reason: collision with root package name */
    private final long f150112i;

    /* renamed from: j  reason: collision with root package name */
    private final long f150113j;

    /* renamed from: k  reason: collision with root package name */
    private final long f150114k;

    /* renamed from: l  reason: collision with root package name */
    private final float f150115l;

    /* renamed from: m  reason: collision with root package name */
    private final long f150116m;

    /* renamed from: n  reason: collision with root package name */
    private final C18762g f150117n;

    /* renamed from: o  reason: collision with root package name */
    private final long f150118o;

    /* renamed from: p  reason: collision with root package name */
    private final long f150119p;

    /* renamed from: q  reason: collision with root package name */
    private final long f150120q;

    /* renamed from: r  reason: collision with root package name */
    private final float f150121r;

    public /* synthetic */ S1(long j10, long j11, long j12, float f10, long j13, long j14, long j15, float f11, long j16, long j17, long j18, float f12, long j19, C18762g gVar, long j20, long j21, long j22, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, f10, j13, j14, j15, f11, j16, j17, j18, f12, j19, gVar, j20, j21, j22, f13);
    }

    public final A1<C5747v0> a(boolean z10, boolean z11, boolean z12, boolean z13, C4889m mVar, int i10) {
        mVar.W(-703624343);
        if (C4895p.J()) {
            C4895p.S(-703624343, i10, -1, "net.ikea.skapa.ui.components.ComponentStateColors.backgroundColor (ComponentStateColors.kt:68)");
        }
        A1<C5747v0> q10 = p1.q(C5747v0.k(!z10 ? this.f150108e : z11 ? this.f150112i : z12 ? this.f150116m : z13 ? this.f150118o : this.f150104a), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return q10;
    }

    public final A1<C5601g> b(boolean z10, boolean z11, boolean z12, C4889m mVar, int i10) {
        mVar.W(-459178662);
        if (C4895p.J()) {
            C4895p.S(-459178662, i10, -1, "net.ikea.skapa.ui.components.ComponentStateColors.borderStroke (ComponentStateColors.kt:57)");
        }
        A1<C5601g> q10 = p1.q(!z10 ? C5602h.a(this.f150111h, this.f150110g) : z11 ? C5602h.a(this.f150115l, this.f150114k) : z12 ? C5602h.a(this.f150121r, this.f150120q) : C5602h.a(this.f150107d, this.f150106c), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return q10;
    }

    public final A1<C5747v0> c(boolean z10, boolean z11, boolean z12, C4889m mVar, int i10, int i11) {
        mVar.W(-1056622156);
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        if (C4895p.J()) {
            C4895p.S(-1056622156, i10, -1, "net.ikea.skapa.ui.components.ComponentStateColors.contentColor (ComponentStateColors.kt:80)");
        }
        A1<C5747v0> q10 = p1.q(C5747v0.k(!z10 ? this.f150109f : z11 ? this.f150113j : z12 ? this.f150119p : this.f150105b), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return q10;
    }

    public final long d() {
        return this.f150104a;
    }

    public final float e() {
        return this.f150107d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S1)) {
            return false;
        }
        S1 s12 = (S1) obj;
        return C5747v0.q(this.f150104a, s12.f150104a) && C5747v0.q(this.f150105b, s12.f150105b) && C5747v0.q(this.f150106c, s12.f150106c) && h.D(this.f150107d, s12.f150107d) && C5747v0.q(this.f150108e, s12.f150108e) && C5747v0.q(this.f150109f, s12.f150109f) && C5747v0.q(this.f150110g, s12.f150110g) && h.D(this.f150111h, s12.f150111h) && C5747v0.q(this.f150112i, s12.f150112i) && C5747v0.q(this.f150113j, s12.f150113j) && C5747v0.q(this.f150114k, s12.f150114k) && h.D(this.f150115l, s12.f150115l) && C5747v0.q(this.f150116m, s12.f150116m) && this.f150117n == s12.f150117n && C5747v0.q(this.f150118o, s12.f150118o) && C5747v0.q(this.f150119p, s12.f150119p) && C5747v0.q(this.f150120q, s12.f150120q) && h.D(this.f150121r, s12.f150121r);
    }

    public final C18762g f() {
        return this.f150117n;
    }

    public final long g() {
        return this.f150112i;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((C5747v0.w(this.f150104a) * 31) + C5747v0.w(this.f150105b)) * 31) + C5747v0.w(this.f150106c)) * 31) + h.E(this.f150107d)) * 31) + C5747v0.w(this.f150108e)) * 31) + C5747v0.w(this.f150109f)) * 31) + C5747v0.w(this.f150110g)) * 31) + h.E(this.f150111h)) * 31) + C5747v0.w(this.f150112i)) * 31) + C5747v0.w(this.f150113j)) * 31) + C5747v0.w(this.f150114k)) * 31) + h.E(this.f150115l)) * 31) + C5747v0.w(this.f150116m)) * 31) + this.f150117n.hashCode()) * 31) + C5747v0.w(this.f150118o)) * 31) + C5747v0.w(this.f150119p)) * 31) + C5747v0.w(this.f150120q)) * 31) + h.E(this.f150121r);
    }

    public String toString() {
        String x10 = C5747v0.x(this.f150104a);
        String x11 = C5747v0.x(this.f150105b);
        String x12 = C5747v0.x(this.f150106c);
        String F10 = h.F(this.f150107d);
        String x13 = C5747v0.x(this.f150108e);
        String x14 = C5747v0.x(this.f150109f);
        String x15 = C5747v0.x(this.f150110g);
        String F11 = h.F(this.f150111h);
        String x16 = C5747v0.x(this.f150112i);
        String x17 = C5747v0.x(this.f150113j);
        String x18 = C5747v0.x(this.f150114k);
        String F12 = h.F(this.f150115l);
        String x19 = C5747v0.x(this.f150116m);
        C18762g gVar = this.f150117n;
        String x20 = C5747v0.x(this.f150118o);
        String x21 = C5747v0.x(this.f150119p);
        String x22 = C5747v0.x(this.f150120q);
        String F13 = h.F(this.f150121r);
        return "ComponentStateColors(defaultBackgroundColor=" + x10 + ", defaultContentColor=" + x11 + ", defaultBorderColor=" + x12 + ", defaultBorderThickness=" + F10 + ", disabledBackgroundColor=" + x13 + ", disabledContentColor=" + x14 + ", disabledBorderColor=" + x15 + ", disabledBorderThickness=" + F11 + ", pressedBackgroundColor=" + x16 + ", pressedContentColor=" + x17 + ", pressedBorderColor=" + x18 + ", pressedBorderThickness=" + F12 + ", focusedBackgroundColor=" + x19 + ", focusedBorderType=" + gVar + ", hoverBackgroundColor=" + x20 + ", hoverContentColor=" + x21 + ", hoverBorderColor=" + x22 + ", hoverBorderThickness=" + F13 + ")";
    }

    private S1(long j10, long j11, long j12, float f10, long j13, long j14, long j15, float f11, long j16, long j17, long j18, float f12, long j19, C18762g gVar, long j20, long j21, long j22, float f13) {
        C18762g gVar2 = gVar;
        C17542s.j(gVar2, "focusedBorderType");
        this.f150104a = j10;
        this.f150105b = j11;
        this.f150106c = j12;
        this.f150107d = f10;
        this.f150108e = j13;
        this.f150109f = j14;
        this.f150110g = j15;
        this.f150111h = f11;
        this.f150112i = j16;
        this.f150113j = j17;
        this.f150114k = j18;
        this.f150115l = f12;
        this.f150116m = j19;
        this.f150117n = gVar2;
        this.f150118o = j20;
        this.f150119p = j21;
        this.f150120q = j22;
        this.f150121r = f13;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ S1(long r37, long r39, long r41, float r43, long r44, long r46, long r48, float r50, long r51, long r53, long r55, float r57, long r58, zK.C18762g r60, long r61, long r63, long r65, float r67, int r68, kotlin.jvm.internal.DefaultConstructorMarker r69) {
        /*
            r36 = this;
            r0 = r68
            r1 = r0 & 4
            if (r1 == 0) goto L_0x000e
            p1.v0$a r1 = p1.C5747v0.f27350b
            long r1 = r1.h()
            r8 = r1
            goto L_0x0010
        L_0x000e:
            r8 = r41
        L_0x0010:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x001c
            float r1 = (float) r2
            float r1 = c2.h.B(r1)
            r10 = r1
            goto L_0x001e
        L_0x001c:
            r10 = r43
        L_0x001e:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0025
            r11 = r37
            goto L_0x0027
        L_0x0025:
            r11 = r44
        L_0x0027:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002e
            r13 = r39
            goto L_0x0030
        L_0x002e:
            r13 = r46
        L_0x0030:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x003c
            p1.v0$a r1 = p1.C5747v0.f27350b
            long r3 = r1.h()
            r15 = r3
            goto L_0x003e
        L_0x003c:
            r15 = r48
        L_0x003e:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x004a
            float r1 = (float) r2
            float r1 = c2.h.B(r1)
            r17 = r1
            goto L_0x004c
        L_0x004a:
            r17 = r50
        L_0x004c:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0053
            r18 = r37
            goto L_0x0055
        L_0x0053:
            r18 = r51
        L_0x0055:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x005c
            r20 = r39
            goto L_0x005e
        L_0x005c:
            r20 = r53
        L_0x005e:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x006b
            p1.v0$a r1 = p1.C5747v0.f27350b
            long r3 = r1.h()
            r22 = r3
            goto L_0x006d
        L_0x006b:
            r22 = r55
        L_0x006d:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0079
            float r1 = (float) r2
            float r1 = c2.h.B(r1)
            r24 = r1
            goto L_0x007b
        L_0x0079:
            r24 = r57
        L_0x007b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0082
            r25 = r37
            goto L_0x0084
        L_0x0082:
            r25 = r58
        L_0x0084:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x008d
            zK.g r1 = zK.C18762g.Default
            r27 = r1
            goto L_0x008f
        L_0x008d:
            r27 = r60
        L_0x008f:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0096
            r28 = r37
            goto L_0x0098
        L_0x0096:
            r28 = r61
        L_0x0098:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a1
            r30 = r39
            goto L_0x00a3
        L_0x00a1:
            r30 = r63
        L_0x00a3:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00ab
            r32 = r8
            goto L_0x00ad
        L_0x00ab:
            r32 = r65
        L_0x00ad:
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00b5
            r34 = r10
            goto L_0x00b7
        L_0x00b5:
            r34 = r67
        L_0x00b7:
            r35 = 0
            r3 = r36
            r4 = r37
            r6 = r39
            r3.<init>(r4, r6, r8, r10, r11, r13, r15, r17, r18, r20, r22, r24, r25, r27, r28, r30, r32, r34, r35)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.S1.<init>(long, long, long, float, long, long, long, float, long, long, long, float, long, zK.g, long, long, long, float, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
