package n2;

import m2.e;
import m2.g;
import o2.b;
import p2.j;

public class g extends e {

    /* renamed from: A0  reason: collision with root package name */
    private String f26553A0;

    /* renamed from: B0  reason: collision with root package name */
    private String f26554B0;

    /* renamed from: C0  reason: collision with root package name */
    private String f26555C0;

    /* renamed from: D0  reason: collision with root package name */
    private String f26556D0;

    /* renamed from: E0  reason: collision with root package name */
    private int f26557E0;

    /* renamed from: q0  reason: collision with root package name */
    private b f26558q0;

    /* renamed from: r0  reason: collision with root package name */
    private int f26559r0 = 0;

    /* renamed from: s0  reason: collision with root package name */
    private int f26560s0 = 0;

    /* renamed from: t0  reason: collision with root package name */
    private int f26561t0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    private int f26562u0 = 0;

    /* renamed from: v0  reason: collision with root package name */
    private int f26563v0;

    /* renamed from: w0  reason: collision with root package name */
    private int f26564w0;

    /* renamed from: x0  reason: collision with root package name */
    private int f26565x0;

    /* renamed from: y0  reason: collision with root package name */
    private float f26566y0;

    /* renamed from: z0  reason: collision with root package name */
    private float f26567z0;

    public g(m2.g gVar, g.d dVar) {
        super(gVar, dVar);
        if (dVar == g.d.ROW) {
            this.f26564w0 = 1;
        } else if (dVar == g.d.COLUMN) {
            this.f26565x0 = 1;
        }
    }

    public void A0(float f10) {
        this.f26566y0 = f10;
    }

    public void B0(int i10) {
        this.f26563v0 = i10;
    }

    public void C0(int i10) {
        this.f26562u0 = i10;
    }

    public void D0(int i10) {
        this.f26560s0 = i10;
    }

    public void E0(int i10) {
        this.f26559r0 = i10;
    }

    public void F0(int i10) {
        this.f26561t0 = i10;
    }

    public void G0(String str) {
        this.f26553A0 = str;
    }

    public void H0(int i10) {
        if (super.v0() != g.d.COLUMN) {
            this.f26564w0 = i10;
        }
    }

    public void I0(String str) {
        this.f26556D0 = str;
    }

    public void J0(String str) {
        this.f26555C0 = str;
    }

    public void K0(float f10) {
        this.f26567z0 = f10;
    }

    public void apply() {
        u0();
        this.f26558q0.v2(this.f26563v0);
        int i10 = this.f26564w0;
        if (i10 != 0) {
            this.f26558q0.x2(i10);
        }
        int i11 = this.f26565x0;
        if (i11 != 0) {
            this.f26558q0.s2(i11);
        }
        float f10 = this.f26566y0;
        if (f10 != 0.0f) {
            this.f26558q0.u2(f10);
        }
        float f11 = this.f26567z0;
        if (f11 != 0.0f) {
            this.f26558q0.A2(f11);
        }
        String str = this.f26553A0;
        if (str != null && !str.isEmpty()) {
            this.f26558q0.w2(this.f26553A0);
        }
        String str2 = this.f26554B0;
        if (str2 != null && !str2.isEmpty()) {
            this.f26558q0.r2(this.f26554B0);
        }
        String str3 = this.f26555C0;
        if (str3 != null && !str3.isEmpty()) {
            this.f26558q0.z2(this.f26555C0);
        }
        String str4 = this.f26556D0;
        if (str4 != null && !str4.isEmpty()) {
            this.f26558q0.y2(this.f26556D0);
        }
        this.f26558q0.t2(this.f26557E0);
        this.f26558q0.R1(this.f26559r0);
        this.f26558q0.O1(this.f26560s0);
        this.f26558q0.S1(this.f26561t0);
        this.f26558q0.N1(this.f26562u0);
        t0();
    }

    public j u0() {
        if (this.f26558q0 == null) {
            this.f26558q0 = new b();
        }
        return this.f26558q0;
    }

    public void w0(String str) {
        this.f26554B0 = str;
    }

    public void x0(int i10) {
        if (super.v0() != g.d.ROW) {
            this.f26565x0 = i10;
        }
    }

    public void y0(int i10) {
        this.f26557E0 = i10;
    }

    public void z0(String str) {
        if (!str.isEmpty()) {
            String[] split = str.split("\\|");
            this.f26557E0 = 0;
            for (String lowerCase : split) {
                String lowerCase2 = lowerCase.toLowerCase();
                lowerCase2.hashCode();
                if (lowerCase2.equals("subgridbycolrow")) {
                    this.f26557E0 |= 1;
                } else if (lowerCase2.equals("spansrespectwidgetorder")) {
                    this.f26557E0 |= 2;
                }
            }
        }
    }
}
