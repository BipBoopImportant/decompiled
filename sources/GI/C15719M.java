package GI;

import DI.C15568o;
import DI.Z;
import DI.c0;
import DI.i0;
import DI.u0;
import EI.C15649h;
import cJ.C17071h;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kJ.C17506e;
import uJ.C18096U;
import uJ.C18113f0;

/* renamed from: GI.M  reason: case insensitive filesystem */
public class C15719M extends C15716J implements c0 {

    /* renamed from: m  reason: collision with root package name */
    private u0 f134551m;

    /* renamed from: n  reason: collision with root package name */
    private final c0 f134552n;

    /* JADX WARNING: type inference failed for: r21v0, types: [DI.c0] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15719M(DI.a0 r13, EI.C15649h r14, DI.C15535F r15, DI.C15574u r16, boolean r17, boolean r18, boolean r19, DI.C15555b.a r20, DI.c0 r21, DI.i0 r22) {
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
            java.lang.String r1 = "<set-"
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
            r1.f134552n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: GI.C15719M.<init>(DI.a0, EI.h, DI.F, DI.u, boolean, boolean, boolean, DI.b$a, DI.c0, DI.i0):void");
    }

    public static C15727V P0(c0 c0Var, C18096U u10, C15649h hVar) {
        if (c0Var == null) {
            S(7);
        }
        if (u10 == null) {
            S(8);
        }
        if (hVar == null) {
            S(9);
        }
        return new C15727V(c0Var, (u0) null, 0, hVar, C17071h.f141276o, u10, false, false, false, (C18096U) null, i0.f133841a);
    }

    private static /* synthetic */ void S(int i10) {
        String str;
        int i11;
        Throwable th2;
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i10) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i10) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    /* renamed from: Q0 */
    public c0 a() {
        c0 c0Var = this.f134552n;
        if (c0Var == null) {
            S(13);
        }
        return c0Var;
    }

    public void R0(u0 u0Var) {
        if (u0Var == null) {
            S(6);
        }
        this.f134551m = u0Var;
    }

    public <R, D> R a0(C15568o<R, D> oVar, D d10) {
        return oVar.j(this, d10);
    }

    public Collection<? extends c0> e() {
        Collection<Z> L02 = super.L0(false);
        if (L02 == null) {
            S(10);
        }
        return L02;
    }

    public C18096U getReturnType() {
        C18113f0 a02 = C17506e.m(this).a0();
        if (a02 == null) {
            S(12);
        }
        return a02;
    }

    public List<u0> j() {
        u0 u0Var = this.f134551m;
        if (u0Var != null) {
            List<u0> singletonList = Collections.singletonList(u0Var);
            if (singletonList == null) {
                S(11);
            }
            return singletonList;
        }
        throw new IllegalStateException();
    }
}
