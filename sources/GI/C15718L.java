package GI;

import DI.C15568o;
import DI.Z;
import DI.b0;
import DI.u0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import uJ.C18096U;

/* renamed from: GI.L  reason: case insensitive filesystem */
public class C15718L extends C15716J implements b0 {

    /* renamed from: m  reason: collision with root package name */
    private C18096U f134549m;

    /* renamed from: n  reason: collision with root package name */
    private final b0 f134550n;

    /* JADX WARNING: type inference failed for: r21v0, types: [DI.b0] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15718L(DI.a0 r13, EI.C15649h r14, DI.C15535F r15, DI.C15574u r16, boolean r17, boolean r18, boolean r19, DI.C15555b.a r20, DI.b0 r21, DI.i0 r22) {
        /*
            r12 = this;
            if (r13 != 0) goto L_0x0006
            r0 = 0
            S(r0)
        L_0x0006:
            if (r14 != 0) goto L_0x000c
            r0 = 1
            S(r0)
        L_0x000c:
            if (r15 != 0) goto L_0x0012
            r0 = 2
            S(r0)
        L_0x0012:
            if (r16 != 0) goto L_0x0018
            r0 = 3
            S(r0)
        L_0x0018:
            if (r20 != 0) goto L_0x001e
            r0 = 4
            S(r0)
        L_0x001e:
            if (r22 != 0) goto L_0x0024
            r0 = 5
            S(r0)
        L_0x0024:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<get-"
            r0.append(r1)
            cJ.f r1 = r13.getName()
            r0.append(r1)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            cJ.f r6 = cJ.C17069f.D(r0)
            r1 = r12
            r2 = r15
            r3 = r16
            r4 = r13
            r5 = r14
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r21 == 0) goto L_0x005b
            r1 = r12
            r0 = r21
            goto L_0x005d
        L_0x005b:
            r0 = r12
            r1 = r0
        L_0x005d:
            r1.f134550n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: GI.C15718L.<init>(DI.a0, EI.h, DI.F, DI.u, boolean, boolean, boolean, DI.b$a, DI.b0, DI.i0):void");
    }

    private static /* synthetic */ void S(int i10) {
        String str = (i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3)];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i10 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i10 == 6 || i10 == 7 || i10 == 8)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i10 == 6 || i10 == 7 || i10 == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: P0 */
    public b0 a() {
        b0 b0Var = this.f134550n;
        if (b0Var == null) {
            S(8);
        }
        return b0Var;
    }

    public void Q0(C18096U u10) {
        if (u10 == null) {
            u10 = W().getType();
        }
        this.f134549m = u10;
    }

    public <R, D> R a0(C15568o<R, D> oVar, D d10) {
        return oVar.a(this, d10);
    }

    public Collection<? extends b0> e() {
        Collection<Z> L02 = super.L0(true);
        if (L02 == null) {
            S(6);
        }
        return L02;
    }

    public C18096U getReturnType() {
        return this.f134549m;
    }

    public List<u0> j() {
        List<u0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            S(7);
        }
        return emptyList;
    }
}
