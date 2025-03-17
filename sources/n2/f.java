package n2;

import java.util.HashMap;
import m2.e;
import m2.g;
import p2.g;
import p2.j;

public class f extends e {

    /* renamed from: A0  reason: collision with root package name */
    protected int f26528A0 = -1;

    /* renamed from: B0  reason: collision with root package name */
    protected int f26529B0 = 2;

    /* renamed from: C0  reason: collision with root package name */
    protected int f26530C0 = 2;

    /* renamed from: D0  reason: collision with root package name */
    protected int f26531D0 = 0;

    /* renamed from: E0  reason: collision with root package name */
    protected int f26532E0 = 0;

    /* renamed from: F0  reason: collision with root package name */
    protected int f26533F0 = 0;

    /* renamed from: G0  reason: collision with root package name */
    protected int f26534G0 = 0;

    /* renamed from: H0  reason: collision with root package name */
    protected int f26535H0 = 0;

    /* renamed from: I0  reason: collision with root package name */
    protected int f26536I0 = 0;

    /* renamed from: J0  reason: collision with root package name */
    protected int f26537J0 = -1;

    /* renamed from: K0  reason: collision with root package name */
    protected int f26538K0 = 0;

    /* renamed from: L0  reason: collision with root package name */
    protected float f26539L0 = 0.5f;

    /* renamed from: M0  reason: collision with root package name */
    protected float f26540M0 = 0.5f;

    /* renamed from: N0  reason: collision with root package name */
    protected float f26541N0 = 0.5f;

    /* renamed from: O0  reason: collision with root package name */
    protected float f26542O0 = 0.5f;

    /* renamed from: q0  reason: collision with root package name */
    protected g f26543q0;

    /* renamed from: r0  reason: collision with root package name */
    protected HashMap<String, Float> f26544r0;

    /* renamed from: s0  reason: collision with root package name */
    protected HashMap<String, Float> f26545s0;

    /* renamed from: t0  reason: collision with root package name */
    protected HashMap<String, Float> f26546t0;

    /* renamed from: u0  reason: collision with root package name */
    protected int f26547u0 = 0;

    /* renamed from: v0  reason: collision with root package name */
    protected int f26548v0 = -1;

    /* renamed from: w0  reason: collision with root package name */
    protected int f26549w0 = -1;

    /* renamed from: x0  reason: collision with root package name */
    protected int f26550x0 = -1;

    /* renamed from: y0  reason: collision with root package name */
    protected int f26551y0 = -1;

    /* renamed from: z0  reason: collision with root package name */
    protected int f26552z0 = -1;

    public f(m2.g gVar, g.d dVar) {
        super(gVar, dVar);
        if (dVar == g.d.VERTICAL_FLOW) {
            this.f26538K0 = 1;
        }
    }

    public void A0(int i10) {
        this.f26549w0 = i10;
    }

    public void B0(int i10) {
        this.f26530C0 = i10;
    }

    public void C0(int i10) {
        this.f26532E0 = i10;
    }

    public void D0(int i10) {
        this.f26551y0 = i10;
    }

    public void E0(float f10) {
        this.f26542O0 = f10;
    }

    public void F0(int i10) {
        this.f26528A0 = i10;
    }

    public void G0(float f10) {
        this.f26540M0 = f10;
    }

    public void H0(int i10) {
        this.f26550x0 = i10;
    }

    public void I0(int i10) {
        this.f26537J0 = i10;
    }

    public void J0(int i10) {
        this.f26538K0 = i10;
    }

    public void K0(int i10) {
        this.f26536I0 = i10;
    }

    public void L0(int i10) {
        this.f26533F0 = i10;
    }

    public void M0(int i10) {
        this.f26534G0 = i10;
    }

    public void N0(int i10) {
        this.f26535H0 = i10;
    }

    public void O0(int i10) {
        this.f26529B0 = i10;
    }

    public void P0(int i10) {
        this.f26531D0 = i10;
    }

    public void Q0(int i10) {
        this.f26548v0 = i10;
    }

    public void R0(int i10) {
        this.f26547u0 = i10;
    }

    public void apply() {
        u0();
        b(this.f26543q0);
        this.f26543q0.H2(this.f26538K0);
        this.f26543q0.M2(this.f26547u0);
        int i10 = this.f26537J0;
        if (i10 != -1) {
            this.f26543q0.G2(i10);
        }
        int i11 = this.f26533F0;
        if (i11 != 0) {
            this.f26543q0.P1(i11);
        }
        int i12 = this.f26535H0;
        if (i12 != 0) {
            this.f26543q0.S1(i12);
        }
        int i13 = this.f26534G0;
        if (i13 != 0) {
            this.f26543q0.Q1(i13);
        }
        int i14 = this.f26536I0;
        if (i14 != 0) {
            this.f26543q0.N1(i14);
        }
        int i15 = this.f26532E0;
        if (i15 != 0) {
            this.f26543q0.A2(i15);
        }
        int i16 = this.f26531D0;
        if (i16 != 0) {
            this.f26543q0.K2(i16);
        }
        float f10 = this.f26094i;
        if (f10 != 0.5f) {
            this.f26543q0.z2(f10);
        }
        float f11 = this.f26541N0;
        if (f11 != 0.5f) {
            this.f26543q0.u2(f11);
        }
        float f12 = this.f26542O0;
        if (f12 != 0.5f) {
            this.f26543q0.C2(f12);
        }
        float f13 = this.f26096j;
        if (f13 != 0.5f) {
            this.f26543q0.J2(f13);
        }
        float f14 = this.f26539L0;
        if (f14 != 0.5f) {
            this.f26543q0.w2(f14);
        }
        float f15 = this.f26540M0;
        if (f15 != 0.5f) {
            this.f26543q0.E2(f15);
        }
        int i17 = this.f26530C0;
        if (i17 != 2) {
            this.f26543q0.y2(i17);
        }
        int i18 = this.f26529B0;
        if (i18 != 2) {
            this.f26543q0.I2(i18);
        }
        int i19 = this.f26548v0;
        if (i19 != -1) {
            this.f26543q0.L2(i19);
        }
        int i20 = this.f26549w0;
        if (i20 != -1) {
            this.f26543q0.x2(i20);
        }
        int i21 = this.f26550x0;
        if (i21 != -1) {
            this.f26543q0.F2(i21);
        }
        int i22 = this.f26551y0;
        if (i22 != -1) {
            this.f26543q0.B2(i22);
        }
        int i23 = this.f26552z0;
        if (i23 != -1) {
            this.f26543q0.v2(i23);
        }
        int i24 = this.f26528A0;
        if (i24 != -1) {
            this.f26543q0.D2(i24);
        }
        t0();
    }

    public j u0() {
        if (this.f26543q0 == null) {
            this.f26543q0 = new p2.g();
        }
        return this.f26543q0;
    }

    public void w0(String str, float f10, float f11, float f12) {
        super.s0(str);
        if (!Float.isNaN(f10)) {
            if (this.f26544r0 == null) {
                this.f26544r0 = new HashMap<>();
            }
            this.f26544r0.put(str, Float.valueOf(f10));
        }
        if (!Float.isNaN(f11)) {
            if (this.f26545s0 == null) {
                this.f26545s0 = new HashMap<>();
            }
            this.f26545s0.put(str, Float.valueOf(f11));
        }
        if (!Float.isNaN(f12)) {
            if (this.f26546t0 == null) {
                this.f26546t0 = new HashMap<>();
            }
            this.f26546t0.put(str, Float.valueOf(f12));
        }
    }

    public void x0(float f10) {
        this.f26541N0 = f10;
    }

    public void y0(int i10) {
        this.f26552z0 = i10;
    }

    public void z0(float f10) {
        this.f26539L0 = f10;
    }
}
