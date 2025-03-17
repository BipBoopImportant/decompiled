package com.google.crypto.tink.shaded.protobuf;

import com.google.ar.core.ImageFormat;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.C9522e;
import com.google.crypto.tink.shaded.protobuf.C9525h;
import com.google.crypto.tink.shaded.protobuf.K;
import com.google.crypto.tink.shaded.protobuf.v0;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class V<T> implements h0<T> {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f67939r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    private static final Unsafe f67940s = s0.D();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f67941a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f67942b;

    /* renamed from: c  reason: collision with root package name */
    private final int f67943c;

    /* renamed from: d  reason: collision with root package name */
    private final int f67944d;

    /* renamed from: e  reason: collision with root package name */
    private final S f67945e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f67946f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f67947g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f67948h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f67949i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f67950j;

    /* renamed from: k  reason: collision with root package name */
    private final int f67951k;

    /* renamed from: l  reason: collision with root package name */
    private final int f67952l;

    /* renamed from: m  reason: collision with root package name */
    private final X f67953m;

    /* renamed from: n  reason: collision with root package name */
    private final H f67954n;

    /* renamed from: o  reason: collision with root package name */
    private final o0<?, ?> f67955o;

    /* renamed from: p  reason: collision with root package name */
    private final C9534q<?> f67956p;

    /* renamed from: q  reason: collision with root package name */
    private final M f67957q;

    private V(int[] iArr, Object[] objArr, int i10, int i11, S s10, boolean z10, boolean z11, int[] iArr2, int i12, int i13, X x10, H h10, o0<?, ?> o0Var, C9534q<?> qVar, M m10) {
        S s11 = s10;
        C9534q<?> qVar2 = qVar;
        this.f67941a = iArr;
        this.f67942b = objArr;
        this.f67943c = i10;
        this.f67944d = i11;
        this.f67947g = s11 instanceof C9541y;
        this.f67948h = z10;
        this.f67946f = qVar2 != null && qVar2.e(s10);
        this.f67949i = z11;
        this.f67950j = iArr2;
        this.f67951k = i12;
        this.f67952l = i13;
        this.f67953m = x10;
        this.f67954n = h10;
        this.f67955o = o0Var;
        this.f67956p = qVar2;
        this.f67945e = s11;
        this.f67957q = m10;
    }

    private static <T> int A(T t10, long j10) {
        return s0.z(t10, j10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0(T r11, com.google.crypto.tink.shaded.protobuf.v0 r12) {
        /*
            r10 = this;
            com.google.crypto.tink.shaded.protobuf.o0<?, ?> r0 = r10.f67955o
            r10.D0(r0, r11, r12)
            boolean r0 = r10.f67946f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            com.google.crypto.tink.shaded.protobuf.q<?> r0 = r10.f67956p
            com.google.crypto.tink.shaded.protobuf.u r0 = r0.c(r11)
            boolean r2 = r0.m()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.g()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f67941a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x058c
            int r4 = r10.x0(r3)
            int r5 = r10.X(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            com.google.crypto.tink.shaded.protobuf.q<?> r6 = r10.f67956p
            int r6 = r6.a(r2)
            if (r6 <= r5) goto L_0x0050
            com.google.crypto.tink.shaded.protobuf.q<?> r6 = r10.f67956p
            r6.j(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = w0(r4)
            r7 = 0
            r8 = 1
            switch(r6) {
                case 0: goto L_0x0577;
                case 1: goto L_0x0565;
                case 2: goto L_0x0553;
                case 3: goto L_0x0541;
                case 4: goto L_0x052f;
                case 5: goto L_0x051d;
                case 6: goto L_0x050b;
                case 7: goto L_0x04f8;
                case 8: goto L_0x04e5;
                case 9: goto L_0x04ce;
                case 10: goto L_0x04b9;
                case 11: goto L_0x04a6;
                case 12: goto L_0x0493;
                case 13: goto L_0x0480;
                case 14: goto L_0x046d;
                case 15: goto L_0x045a;
                case 16: goto L_0x0447;
                case 17: goto L_0x0430;
                case 18: goto L_0x041d;
                case 19: goto L_0x040a;
                case 20: goto L_0x03f7;
                case 21: goto L_0x03e4;
                case 22: goto L_0x03d1;
                case 23: goto L_0x03be;
                case 24: goto L_0x03ab;
                case 25: goto L_0x0398;
                case 26: goto L_0x0385;
                case 27: goto L_0x036e;
                case 28: goto L_0x035b;
                case 29: goto L_0x0348;
                case 30: goto L_0x0335;
                case 31: goto L_0x0322;
                case 32: goto L_0x030f;
                case 33: goto L_0x02fc;
                case 34: goto L_0x02e9;
                case 35: goto L_0x02d6;
                case 36: goto L_0x02c3;
                case 37: goto L_0x02b0;
                case 38: goto L_0x029d;
                case 39: goto L_0x028a;
                case 40: goto L_0x0277;
                case 41: goto L_0x0264;
                case 42: goto L_0x0251;
                case 43: goto L_0x023e;
                case 44: goto L_0x022b;
                case 45: goto L_0x0218;
                case 46: goto L_0x0205;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01df;
                case 49: goto L_0x01c8;
                case 50: goto L_0x01bb;
                case 51: goto L_0x01a8;
                case 52: goto L_0x0195;
                case 53: goto L_0x0182;
                case 54: goto L_0x016f;
                case 55: goto L_0x015c;
                case 56: goto L_0x0149;
                case 57: goto L_0x0136;
                case 58: goto L_0x0123;
                case 59: goto L_0x0110;
                case 60: goto L_0x00f9;
                case 61: goto L_0x00e4;
                case 62: goto L_0x00d1;
                case 63: goto L_0x00be;
                case 64: goto L_0x00ab;
                case 65: goto L_0x0098;
                case 66: goto L_0x0085;
                case 67: goto L_0x0072;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0588
        L_0x005b:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            com.google.crypto.tink.shaded.protobuf.h0 r6 = r10.v(r3)
            r12.K(r5, r4, r6)
            goto L_0x0588
        L_0x0072:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            long r6 = d0(r11, r6)
            r12.m(r5, r6)
            goto L_0x0588
        L_0x0085:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            int r4 = c0(r11, r6)
            r12.H(r5, r4)
            goto L_0x0588
        L_0x0098:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            long r6 = d0(r11, r6)
            r12.i(r5, r6)
            goto L_0x0588
        L_0x00ab:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            int r4 = c0(r11, r6)
            r12.w(r5, r4)
            goto L_0x0588
        L_0x00be:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            int r4 = c0(r11, r6)
            r12.E(r5, r4)
            goto L_0x0588
        L_0x00d1:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            int r4 = c0(r11, r6)
            r12.o(r5, r4)
            goto L_0x0588
        L_0x00e4:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            com.google.crypto.tink.shaded.protobuf.h r4 = (com.google.crypto.tink.shaded.protobuf.C9525h) r4
            r12.M(r5, r4)
            goto L_0x0588
        L_0x00f9:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            com.google.crypto.tink.shaded.protobuf.h0 r6 = r10.v(r3)
            r12.N(r5, r4, r6)
            goto L_0x0588
        L_0x0110:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            r10.C0(r5, r4, r12)
            goto L_0x0588
        L_0x0123:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            boolean r4 = Z(r11, r6)
            r12.v(r5, r4)
            goto L_0x0588
        L_0x0136:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            int r4 = c0(r11, r6)
            r12.c(r5, r4)
            goto L_0x0588
        L_0x0149:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            long r6 = d0(r11, r6)
            r12.s(r5, r6)
            goto L_0x0588
        L_0x015c:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            int r4 = c0(r11, r6)
            r12.h(r5, r4)
            goto L_0x0588
        L_0x016f:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            long r6 = d0(r11, r6)
            r12.f(r5, r6)
            goto L_0x0588
        L_0x0182:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            long r6 = d0(r11, r6)
            r12.u(r5, r6)
            goto L_0x0588
        L_0x0195:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            float r4 = b0(r11, r6)
            r12.B(r5, r4)
            goto L_0x0588
        L_0x01a8:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            double r6 = a0(r11, r6)
            r12.p(r5, r6)
            goto L_0x0588
        L_0x01bb:
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            r10.B0(r12, r5, r4, r3)
            goto L_0x0588
        L_0x01c8:
            int r5 = r10.X(r3)
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.h0 r6 = r10.v(r3)
            com.google.crypto.tink.shaded.protobuf.j0.U(r5, r4, r12, r6)
            goto L_0x0588
        L_0x01df:
            int r5 = r10.X(r3)
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.b0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x01f2:
            int r5 = r10.X(r3)
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.a0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0205:
            int r5 = r10.X(r3)
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.Z(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0218:
            int r5 = r10.X(r3)
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.Y(r5, r4, r12, r8)
            goto L_0x0588
        L_0x022b:
            int r5 = r10.X(r3)
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.Q(r5, r4, r12, r8)
            goto L_0x0588
        L_0x023e:
            int r5 = r10.X(r3)
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.d0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0251:
            int r5 = r10.X(r3)
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.N(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0264:
            int r5 = r10.X(r3)
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.R(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0277:
            int r5 = r10.X(r3)
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.S(r5, r4, r12, r8)
            goto L_0x0588
        L_0x028a:
            int r5 = r10.X(r3)
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.V(r5, r4, r12, r8)
            goto L_0x0588
        L_0x029d:
            int r5 = r10.X(r3)
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.e0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02b0:
            int r5 = r10.X(r3)
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.W(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02c3:
            int r5 = r10.X(r3)
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.T(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02d6:
            int r5 = r10.X(r3)
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.P(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02e9:
            int r5 = r10.X(r3)
            long r8 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.b0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02fc:
            int r5 = r10.X(r3)
            long r8 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.a0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x030f:
            int r5 = r10.X(r3)
            long r8 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.Z(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0322:
            int r5 = r10.X(r3)
            long r8 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.Y(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0335:
            int r5 = r10.X(r3)
            long r8 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.Q(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0348:
            int r5 = r10.X(r3)
            long r8 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.d0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x035b:
            int r5 = r10.X(r3)
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.O(r5, r4, r12)
            goto L_0x0588
        L_0x036e:
            int r5 = r10.X(r3)
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.h0 r6 = r10.v(r3)
            com.google.crypto.tink.shaded.protobuf.j0.X(r5, r4, r12, r6)
            goto L_0x0588
        L_0x0385:
            int r5 = r10.X(r3)
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.c0(r5, r4, r12)
            goto L_0x0588
        L_0x0398:
            int r5 = r10.X(r3)
            long r8 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.N(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03ab:
            int r5 = r10.X(r3)
            long r8 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.R(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03be:
            int r5 = r10.X(r3)
            long r8 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.S(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03d1:
            int r5 = r10.X(r3)
            long r8 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.V(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03e4:
            int r5 = r10.X(r3)
            long r8 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.e0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03f7:
            int r5 = r10.X(r3)
            long r8 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.W(r5, r4, r12, r7)
            goto L_0x0588
        L_0x040a:
            int r5 = r10.X(r3)
            long r8 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.T(r5, r4, r12, r7)
            goto L_0x0588
        L_0x041d:
            int r5 = r10.X(r3)
            long r8 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0.P(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0430:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            com.google.crypto.tink.shaded.protobuf.h0 r6 = r10.v(r3)
            r12.K(r5, r4, r6)
            goto L_0x0588
        L_0x0447:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            long r6 = M(r11, r6)
            r12.m(r5, r6)
            goto L_0x0588
        L_0x045a:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            int r4 = A(r11, r6)
            r12.H(r5, r4)
            goto L_0x0588
        L_0x046d:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            long r6 = M(r11, r6)
            r12.i(r5, r6)
            goto L_0x0588
        L_0x0480:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            int r4 = A(r11, r6)
            r12.w(r5, r4)
            goto L_0x0588
        L_0x0493:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            int r4 = A(r11, r6)
            r12.E(r5, r4)
            goto L_0x0588
        L_0x04a6:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            int r4 = A(r11, r6)
            r12.o(r5, r4)
            goto L_0x0588
        L_0x04b9:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            com.google.crypto.tink.shaded.protobuf.h r4 = (com.google.crypto.tink.shaded.protobuf.C9525h) r4
            r12.M(r5, r4)
            goto L_0x0588
        L_0x04ce:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            com.google.crypto.tink.shaded.protobuf.h0 r6 = r10.v(r3)
            r12.N(r5, r4, r6)
            goto L_0x0588
        L_0x04e5:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.s0.C(r11, r6)
            r10.C0(r5, r4, r12)
            goto L_0x0588
        L_0x04f8:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            boolean r4 = l(r11, r6)
            r12.v(r5, r4)
            goto L_0x0588
        L_0x050b:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            int r4 = A(r11, r6)
            r12.c(r5, r4)
            goto L_0x0588
        L_0x051d:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            long r6 = M(r11, r6)
            r12.s(r5, r6)
            goto L_0x0588
        L_0x052f:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            int r4 = A(r11, r6)
            r12.h(r5, r4)
            goto L_0x0588
        L_0x0541:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            long r6 = M(r11, r6)
            r12.f(r5, r6)
            goto L_0x0588
        L_0x0553:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            long r6 = M(r11, r6)
            r12.u(r5, r6)
            goto L_0x0588
        L_0x0565:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            float r4 = s(r11, r6)
            r12.B(r5, r4)
            goto L_0x0588
        L_0x0577:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Y(r4)
            double r6 = o(r11, r6)
            r12.p(r5, r6)
        L_0x0588:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x058c:
            if (r2 == 0) goto L_0x05a3
            com.google.crypto.tink.shaded.protobuf.q<?> r11 = r10.f67956p
            r11.j(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x05a1
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x058c
        L_0x05a1:
            r2 = r1
            goto L_0x058c
        L_0x05a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.V.A0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.v0):void");
    }

    private static boolean B(int i10) {
        return (i10 & 536870912) != 0;
    }

    private <K, V> void B0(v0 v0Var, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f67957q.b(u(i11));
            v0Var.J(i10, (K.a) null, this.f67957q.e(obj));
        }
    }

    private boolean C(T t10, int i10) {
        int l02 = l0(i10);
        long j10 = (long) (1048575 & l02);
        if (j10 == 1048575) {
            int x02 = x0(i10);
            long Y10 = Y(x02);
            switch (w0(x02)) {
                case 0:
                    return Double.doubleToRawLongBits(s0.x(t10, Y10)) != 0;
                case 1:
                    return Float.floatToRawIntBits(s0.y(t10, Y10)) != 0;
                case 2:
                    return s0.A(t10, Y10) != 0;
                case 3:
                    return s0.A(t10, Y10) != 0;
                case 4:
                    return s0.z(t10, Y10) != 0;
                case 5:
                    return s0.A(t10, Y10) != 0;
                case 6:
                    return s0.z(t10, Y10) != 0;
                case 7:
                    return s0.r(t10, Y10);
                case 8:
                    Object C10 = s0.C(t10, Y10);
                    if (C10 instanceof String) {
                        return !((String) C10).isEmpty();
                    }
                    if (C10 instanceof C9525h) {
                        return !C9525h.f67987b.equals(C10);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return s0.C(t10, Y10) != null;
                case 10:
                    return !C9525h.f67987b.equals(s0.C(t10, Y10));
                case 11:
                    return s0.z(t10, Y10) != 0;
                case 12:
                    return s0.z(t10, Y10) != 0;
                case 13:
                    return s0.z(t10, Y10) != 0;
                case 14:
                    return s0.A(t10, Y10) != 0;
                case 15:
                    return s0.z(t10, Y10) != 0;
                case 16:
                    return s0.A(t10, Y10) != 0;
                case 17:
                    return s0.C(t10, Y10) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (s0.z(t10, j10) & (1 << (l02 >>> 20))) != 0;
        }
    }

    private void C0(int i10, Object obj, v0 v0Var) {
        if (obj instanceof String) {
            v0Var.e(i10, (String) obj);
        } else {
            v0Var.M(i10, (C9525h) obj);
        }
    }

    private boolean D(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? C(t10, i10) : (i12 & i13) != 0;
    }

    private <UT, UB> void D0(o0<UT, UB> o0Var, T t10, v0 v0Var) {
        o0Var.t(o0Var.g(t10), v0Var);
    }

    private static boolean E(Object obj, int i10, h0 h0Var) {
        return h0Var.g(s0.C(obj, Y(i10)));
    }

    private <N> boolean F(Object obj, int i10, int i11) {
        List list = (List) s0.C(obj, Y(i10));
        if (list.isEmpty()) {
            return true;
        }
        h0 v10 = v(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!v10.g(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean G(T t10, int i10, int i11) {
        if (this.f67957q.e(s0.C(t10, Y(i10))).isEmpty()) {
            return true;
        }
        this.f67957q.b(u(i11));
        throw null;
    }

    private static boolean H(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C9541y) {
            return ((C9541y) obj).A();
        }
        return true;
    }

    private boolean I(T t10, T t11, int i10) {
        long l02 = (long) (l0(i10) & 1048575);
        return s0.z(t10, l02) == s0.z(t11, l02);
    }

    private boolean J(T t10, int i10, int i11) {
        return s0.z(t10, (long) (l0(i11) & 1048575)) == i10;
    }

    private static boolean K(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static List<?> L(Object obj, long j10) {
        return (List) s0.C(obj, j10);
    }

    private static <T> long M(T t10, long j10) {
        return s0.A(t10, j10);
    }

    /* JADX WARNING: type inference failed for: r12v65, types: [boolean] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00fc, code lost:
        r13 = r6;
        r14 = r7;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0110, code lost:
        r12 = r5;
        r13 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0112, code lost:
        r14 = r7;
        r12 = r12;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x064f A[Catch:{ all -> 0x0675 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0677  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x06b5 A[LOOP:6: B:204:0x06b1->B:206:0x06b5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x06ca  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.C9537u.b<ET>> void N(com.google.crypto.tink.shaded.protobuf.o0<UT, UB> r19, com.google.crypto.tink.shaded.protobuf.C9534q<ET> r20, T r21, com.google.crypto.tink.shaded.protobuf.g0 r22, com.google.crypto.tink.shaded.protobuf.C9533p r23) {
        /*
            r18 = this;
            r8 = r18
            r7 = r19
            r15 = r21
            r0 = r22
            r6 = r23
            r17 = 0
            r5 = r17
            r9 = r5
        L_0x000f:
            int r2 = r22.A()     // Catch:{ all -> 0x06a9 }
            int r3 = r8.j0(r2)     // Catch:{ all -> 0x06a9 }
            if (r3 >= 0) goto L_0x00bb
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x003e
            int r0 = r8.f67951k
            r4 = r5
        L_0x0021:
            int r1 = r8.f67952l
            if (r0 >= r1) goto L_0x0038
            int[] r1 = r8.f67950j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.q(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0021
        L_0x0038:
            if (r4 == 0) goto L_0x003d
            r7.o(r15, r4)
        L_0x003d:
            return
        L_0x003e:
            boolean r1 = r8.f67946f     // Catch:{ all -> 0x00b8 }
            if (r1 != 0) goto L_0x0047
            r4 = r20
            r12 = r17
            goto L_0x0050
        L_0x0047:
            com.google.crypto.tink.shaded.protobuf.S r1 = r8.f67945e     // Catch:{ all -> 0x00b8 }
            r4 = r20
            java.lang.Object r1 = r4.b(r6, r1, r2)     // Catch:{ all -> 0x00b8 }
            r12 = r1
        L_0x0050:
            if (r12 == 0) goto L_0x0078
            if (r9 != 0) goto L_0x005e
            com.google.crypto.tink.shaded.protobuf.u r1 = r20.d(r21)     // Catch:{ all -> 0x0059 }
            goto L_0x005f
        L_0x0059:
            r0 = move-exception
        L_0x005a:
            r14 = r7
            r10 = r15
            goto L_0x06ad
        L_0x005e:
            r1 = r9
        L_0x005f:
            r9 = r20
            r10 = r21
            r11 = r22
            r13 = r23
            r14 = r1
            r3 = r15
            r15 = r5
            r16 = r19
            java.lang.Object r5 = r9.g(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0073 }
            r9 = r1
        L_0x0071:
            r15 = r3
            goto L_0x000f
        L_0x0073:
            r0 = move-exception
            r10 = r3
        L_0x0075:
            r14 = r7
            goto L_0x06ad
        L_0x0078:
            r3 = r15
            boolean r1 = r7.q(r0)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0086
            boolean r1 = r22.D()     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0094
        L_0x0085:
            goto L_0x0071
        L_0x0086:
            if (r5 != 0) goto L_0x008d
            java.lang.Object r1 = r7.f(r3)     // Catch:{ all -> 0x0073 }
            r5 = r1
        L_0x008d:
            boolean r1 = r7.m(r5, r0)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0094
            goto L_0x0085
        L_0x0094:
            int r0 = r8.f67951k
            r4 = r5
        L_0x0097:
            int r1 = r8.f67952l
            if (r0 >= r1) goto L_0x00b1
            int[] r1 = r8.f67950j
            r5 = r1[r0]
            r1 = r18
            r2 = r21
            r10 = r3
            r3 = r5
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.q(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            r3 = r10
            goto L_0x0097
        L_0x00b1:
            r10 = r3
            if (r4 == 0) goto L_0x00b7
            r7.o(r10, r4)
        L_0x00b7:
            return
        L_0x00b8:
            r0 = move-exception
            r10 = r15
            goto L_0x0075
        L_0x00bb:
            r4 = r20
            r10 = r15
            int r11 = r8.x0(r3)     // Catch:{ all -> 0x0281 }
            int r1 = w0(r11)     // Catch:{ a -> 0x0285 }
            switch(r1) {
                case 0: goto L_0x0636;
                case 1: goto L_0x0624;
                case 2: goto L_0x0612;
                case 3: goto L_0x0600;
                case 4: goto L_0x05ee;
                case 5: goto L_0x05db;
                case 6: goto L_0x05c8;
                case 7: goto L_0x05b5;
                case 8: goto L_0x05aa;
                case 9: goto L_0x0595;
                case 10: goto L_0x0582;
                case 11: goto L_0x056f;
                case 12: goto L_0x0549;
                case 13: goto L_0x0536;
                case 14: goto L_0x0523;
                case 15: goto L_0x0510;
                case 16: goto L_0x04fd;
                case 17: goto L_0x04e8;
                case 18: goto L_0x04d6;
                case 19: goto L_0x04c4;
                case 20: goto L_0x04b2;
                case 21: goto L_0x04a0;
                case 22: goto L_0x048e;
                case 23: goto L_0x047c;
                case 24: goto L_0x046a;
                case 25: goto L_0x0458;
                case 26: goto L_0x0450;
                case 27: goto L_0x043b;
                case 28: goto L_0x0429;
                case 29: goto L_0x0417;
                case 30: goto L_0x03f6;
                case 31: goto L_0x03e4;
                case 32: goto L_0x03d2;
                case 33: goto L_0x03c0;
                case 34: goto L_0x03ae;
                case 35: goto L_0x039c;
                case 36: goto L_0x038a;
                case 37: goto L_0x0378;
                case 38: goto L_0x0366;
                case 39: goto L_0x0354;
                case 40: goto L_0x0342;
                case 41: goto L_0x0330;
                case 42: goto L_0x031e;
                case 43: goto L_0x030c;
                case 44: goto L_0x02eb;
                case 45: goto L_0x02d9;
                case 46: goto L_0x02c7;
                case 47: goto L_0x02b5;
                case 48: goto L_0x02a3;
                case 49: goto L_0x0288;
                case 50: goto L_0x0264;
                case 51: goto L_0x0250;
                case 52: goto L_0x023c;
                case 53: goto L_0x0228;
                case 54: goto L_0x0214;
                case 55: goto L_0x0200;
                case 56: goto L_0x01ec;
                case 57: goto L_0x01d8;
                case 58: goto L_0x01c4;
                case 59: goto L_0x01bc;
                case 60: goto L_0x01aa;
                case 61: goto L_0x019a;
                case 62: goto L_0x0186;
                case 63: goto L_0x0161;
                case 64: goto L_0x014e;
                case 65: goto L_0x013b;
                case 66: goto L_0x0128;
                case 67: goto L_0x0115;
                case 68: goto L_0x0100;
                default: goto L_0x00c9;
            }
        L_0x00c9:
            if (r5 != 0) goto L_0x00d6
            java.lang.Object r5 = r7.f(r10)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x00d6
        L_0x00d0:
            r0 = move-exception
            goto L_0x0075
        L_0x00d2:
            r13 = r6
            r14 = r7
            goto L_0x0649
        L_0x00d6:
            boolean r1 = r7.m(r5, r0)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            if (r1 != 0) goto L_0x00fc
            int r0 = r8.f67951k
            r4 = r5
        L_0x00df:
            int r1 = r8.f67952l
            if (r0 >= r1) goto L_0x00f6
            int[] r1 = r8.f67950j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.q(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x00df
        L_0x00f6:
            if (r4 == 0) goto L_0x00fb
            r7.o(r10, r4)
        L_0x00fb:
            return
        L_0x00fc:
            r13 = r6
            r14 = r7
            goto L_0x06a4
        L_0x0100:
            java.lang.Object r1 = r8.T(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.S r1 = (com.google.crypto.tink.shaded.protobuf.S) r1     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.h0 r11 = r8.v(r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r0.J(r1, r11, r6)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.v0(r10, r2, r3, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
        L_0x0110:
            r12 = r5
            r13 = r6
        L_0x0112:
            r14 = r7
            goto L_0x0647
        L_0x0115:
            long r11 = Y(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            long r13 = r22.y()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.s0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0128:
            long r11 = Y(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            int r1 = r22.l()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.s0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x013b:
            long r11 = Y(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            long r13 = r22.f()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.s0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x014e:
            long r11 = Y(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            int r1 = r22.E()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.s0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0161:
            int r1 = r22.k()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.A$e r12 = r8.t(r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            if (r12 == 0) goto L_0x0177
            boolean r12 = r12.a(r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            if (r12 == 0) goto L_0x0172
            goto L_0x0177
        L_0x0172:
            java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.j0.L(r10, r2, r1, r5, r7)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x00fc
        L_0x0177:
            long r11 = Y(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.s0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0186:
            long r11 = Y(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            int r1 = r22.h()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.s0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x019a:
            long r11 = Y(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.h r1 = r22.o()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.s0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x01aa:
            java.lang.Object r1 = r8.T(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.S r1 = (com.google.crypto.tink.shaded.protobuf.S) r1     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.h0 r11 = r8.v(r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r0.M(r1, r11, r6)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.v0(r10, r2, r3, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x01bc:
            r8.o0(r10, r11, r0)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.s0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x01c4:
            long r11 = Y(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            boolean r1 = r22.e()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.s0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x01d8:
            long r11 = Y(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            int r1 = r22.u()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.s0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x01ec:
            long r11 = Y(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            long r13 = r22.b()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.s0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0200:
            long r11 = Y(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            int r1 = r22.p()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.s0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0214:
            long r11 = Y(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            long r13 = r22.s()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.s0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0228:
            long r11 = Y(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            long r13 = r22.H()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.s0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x023c:
            long r11 = Y(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            float r1 = r22.readFloat()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.s0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0250:
            long r11 = Y(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            double r13 = r22.readDouble()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Double r1 = java.lang.Double.valueOf(r13)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.crypto.tink.shaded.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.s0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0264:
            java.lang.Object r11 = r8.u(r3)     // Catch:{ a -> 0x0285 }
            r1 = r18
            r2 = r21
            r4 = r11
            r12 = r5
            r5 = r23
            r13 = r6
            r6 = r22
            r1.O(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x027d, all -> 0x0278 }
            goto L_0x0112
        L_0x0278:
            r0 = move-exception
            r14 = r7
        L_0x027a:
            r5 = r12
            goto L_0x06ad
        L_0x027d:
            r14 = r7
        L_0x027e:
            r5 = r12
            goto L_0x0649
        L_0x0281:
            r0 = move-exception
            r12 = r5
            goto L_0x0075
        L_0x0285:
            r12 = r5
            goto L_0x00d2
        L_0x0288:
            r12 = r5
            r13 = r6
            long r4 = Y(r11)     // Catch:{ a -> 0x027d, all -> 0x0278 }
            com.google.crypto.tink.shaded.protobuf.h0 r6 = r8.v(r3)     // Catch:{ a -> 0x027d, all -> 0x0278 }
            r1 = r18
            r2 = r21
            r3 = r4
            r5 = r22
            r14 = r7
            r7 = r23
            r1.m0(r2, r3, r5, r6, r7)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x02a1:
            r0 = move-exception
            goto L_0x027a
        L_0x02a3:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.d(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x02b5:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.r(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x02c7:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.v(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x02d9:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.c(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x02eb:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r4 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r4 = r1.e(r10, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.j(r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.A$e r5 = r8.t(r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r1 = r21
            r3 = r4
            r4 = r5
            r5 = r12
            r6 = r19
            java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.j0.A(r1, r2, r3, r4, r5, r6)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x06a4
        L_0x030c:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.t(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x031e:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.m(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0330:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.x(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0342:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.q(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0354:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.w(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0366:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.g(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0378:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.i(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x038a:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.C(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x039c:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.G(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x03ae:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.d(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x03c0:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.r(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x03d2:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.v(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x03e4:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.c(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x03f6:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r4 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r4 = r1.e(r10, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.j(r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.A$e r5 = r8.t(r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r1 = r21
            r3 = r4
            r4 = r5
            r5 = r12
            r6 = r19
            java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.j0.A(r1, r2, r3, r4, r5, r6)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x06a4
        L_0x0417:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.t(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0429:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.F(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x043b:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.h0 r5 = r8.v(r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r1 = r18
            r2 = r21
            r3 = r11
            r4 = r22
            r6 = r23
            r1.n0(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0450:
            r12 = r5
            r13 = r6
            r14 = r7
            r8.p0(r10, r11, r0)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0458:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.m(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x046a:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.x(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x047c:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.q(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x048e:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.w(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x04a0:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.g(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x04b2:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.i(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x04c4:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.C(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x04d6:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.crypto.tink.shaded.protobuf.H r1 = r8.f67954n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.G(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x04e8:
            r12 = r5
            r13 = r6
            r14 = r7
            java.lang.Object r1 = r8.S(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.S r1 = (com.google.crypto.tink.shaded.protobuf.S) r1     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.h0 r2 = r8.v(r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.J(r1, r2, r13)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.u0(r10, r3, r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x04fd:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r4 = r22.y()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.s0.Q(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.r0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0510:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            int r4 = r22.l()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.s0.P(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.r0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0523:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r4 = r22.f()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.s0.Q(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.r0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0536:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            int r4 = r22.E()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.s0.P(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.r0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0549:
            r12 = r5
            r13 = r6
            r14 = r7
            int r1 = r22.k()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.A$e r4 = r8.t(r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            if (r4 == 0) goto L_0x0563
            boolean r4 = r4.a(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            if (r4 == 0) goto L_0x055d
            goto L_0x0563
        L_0x055d:
            java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.j0.L(r10, r2, r1, r12, r14)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x06a4
        L_0x0563:
            long r4 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.s0.P(r10, r4, r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.r0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x056f:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            int r4 = r22.h()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.s0.P(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.r0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0582:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.h r4 = r22.o()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.s0.R(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.r0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0595:
            r12 = r5
            r13 = r6
            r14 = r7
            java.lang.Object r1 = r8.S(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.S r1 = (com.google.crypto.tink.shaded.protobuf.S) r1     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.h0 r2 = r8.v(r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.M(r1, r2, r13)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.u0(r10, r3, r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x05aa:
            r12 = r5
            r13 = r6
            r14 = r7
            r8.o0(r10, r11, r0)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.r0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x05b5:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            boolean r4 = r22.e()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.s0.H(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.r0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x05c8:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            int r4 = r22.u()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.s0.P(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.r0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x05db:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r4 = r22.b()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.s0.Q(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.r0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x05ee:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            int r4 = r22.p()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.s0.P(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.r0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0600:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r4 = r22.s()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.s0.Q(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.r0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0612:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r4 = r22.H()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.s0.Q(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.r0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0624:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            float r4 = r22.readFloat()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.s0.O(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.r0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0636:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Y(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            double r4 = r22.readDouble()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.crypto.tink.shaded.protobuf.s0.N(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.r0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
        L_0x0647:
            r5 = r12
            goto L_0x06a4
        L_0x0649:
            boolean r1 = r14.q(r0)     // Catch:{ all -> 0x0675 }
            if (r1 == 0) goto L_0x0677
            boolean r1 = r22.D()     // Catch:{ all -> 0x0675 }
            if (r1 != 0) goto L_0x06a4
            int r0 = r8.f67951k
            r4 = r5
        L_0x0658:
            int r1 = r8.f67952l
            if (r0 >= r1) goto L_0x066f
            int[] r1 = r8.f67950j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.q(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0658
        L_0x066f:
            if (r4 == 0) goto L_0x0674
            r14.o(r10, r4)
        L_0x0674:
            return
        L_0x0675:
            r0 = move-exception
            goto L_0x06ad
        L_0x0677:
            if (r5 != 0) goto L_0x067e
            java.lang.Object r1 = r14.f(r10)     // Catch:{ all -> 0x0675 }
            r5 = r1
        L_0x067e:
            boolean r1 = r14.m(r5, r0)     // Catch:{ all -> 0x0675 }
            if (r1 != 0) goto L_0x06a4
            int r0 = r8.f67951k
            r4 = r5
        L_0x0687:
            int r1 = r8.f67952l
            if (r0 >= r1) goto L_0x069e
            int[] r1 = r8.f67950j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.q(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0687
        L_0x069e:
            if (r4 == 0) goto L_0x06a3
            r14.o(r10, r4)
        L_0x06a3:
            return
        L_0x06a4:
            r15 = r10
            r6 = r13
            r7 = r14
            goto L_0x000f
        L_0x06a9:
            r0 = move-exception
            r12 = r5
            goto L_0x005a
        L_0x06ad:
            int r1 = r8.f67951k
            r7 = r1
            r4 = r5
        L_0x06b1:
            int r1 = r8.f67952l
            if (r7 >= r1) goto L_0x06c8
            int[] r1 = r8.f67950j
            r3 = r1[r7]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.q(r2, r3, r4, r5, r6)
            int r7 = r7 + 1
            goto L_0x06b1
        L_0x06c8:
            if (r4 == 0) goto L_0x06cd
            r14.o(r10, r4)
        L_0x06cd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.V.N(com.google.crypto.tink.shaded.protobuf.o0, com.google.crypto.tink.shaded.protobuf.q, java.lang.Object, com.google.crypto.tink.shaded.protobuf.g0, com.google.crypto.tink.shaded.protobuf.p):void");
    }

    private final <K, V> void O(Object obj, int i10, Object obj2, C9533p pVar, g0 g0Var) {
        long Y10 = Y(x0(i10));
        Object C10 = s0.C(obj, Y10);
        if (C10 == null) {
            C10 = this.f67957q.d(obj2);
            s0.R(obj, Y10, C10);
        } else if (this.f67957q.h(C10)) {
            Object d10 = this.f67957q.d(obj2);
            this.f67957q.a(d10, C10);
            s0.R(obj, Y10, d10);
            C10 = d10;
        }
        Map<?, ?> c10 = this.f67957q.c(C10);
        this.f67957q.b(obj2);
        g0Var.L(c10, (K.a) null, pVar);
    }

    private void P(T t10, T t11, int i10) {
        if (C(t11, i10)) {
            long Y10 = Y(x0(i10));
            Unsafe unsafe = f67940s;
            Object object = unsafe.getObject(t11, Y10);
            if (object != null) {
                h0 v10 = v(i10);
                if (!C(t10, i10)) {
                    if (!H(object)) {
                        unsafe.putObject(t10, Y10, object);
                    } else {
                        Object e10 = v10.e();
                        v10.a(e10, object);
                        unsafe.putObject(t10, Y10, e10);
                    }
                    r0(t10, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t10, Y10);
                if (!H(object2)) {
                    Object e11 = v10.e();
                    v10.a(e11, object2);
                    unsafe.putObject(t10, Y10, e11);
                    object2 = e11;
                }
                v10.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + X(i10) + " is present but null: " + t11);
        }
    }

    private void Q(T t10, T t11, int i10) {
        int X10 = X(i10);
        if (J(t11, X10, i10)) {
            long Y10 = Y(x0(i10));
            Unsafe unsafe = f67940s;
            Object object = unsafe.getObject(t11, Y10);
            if (object != null) {
                h0 v10 = v(i10);
                if (!J(t10, X10, i10)) {
                    if (!H(object)) {
                        unsafe.putObject(t10, Y10, object);
                    } else {
                        Object e10 = v10.e();
                        v10.a(e10, object);
                        unsafe.putObject(t10, Y10, e10);
                    }
                    s0(t10, X10, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t10, Y10);
                if (!H(object2)) {
                    Object e11 = v10.e();
                    v10.a(e11, object2);
                    unsafe.putObject(t10, Y10, e11);
                    object2 = e11;
                }
                v10.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + X(i10) + " is present but null: " + t11);
        }
    }

    private void R(T t10, T t11, int i10) {
        int x02 = x0(i10);
        long Y10 = Y(x02);
        int X10 = X(i10);
        switch (w0(x02)) {
            case 0:
                if (C(t11, i10)) {
                    s0.N(t10, Y10, s0.x(t11, Y10));
                    r0(t10, i10);
                    return;
                }
                return;
            case 1:
                if (C(t11, i10)) {
                    s0.O(t10, Y10, s0.y(t11, Y10));
                    r0(t10, i10);
                    return;
                }
                return;
            case 2:
                if (C(t11, i10)) {
                    s0.Q(t10, Y10, s0.A(t11, Y10));
                    r0(t10, i10);
                    return;
                }
                return;
            case 3:
                if (C(t11, i10)) {
                    s0.Q(t10, Y10, s0.A(t11, Y10));
                    r0(t10, i10);
                    return;
                }
                return;
            case 4:
                if (C(t11, i10)) {
                    s0.P(t10, Y10, s0.z(t11, Y10));
                    r0(t10, i10);
                    return;
                }
                return;
            case 5:
                if (C(t11, i10)) {
                    s0.Q(t10, Y10, s0.A(t11, Y10));
                    r0(t10, i10);
                    return;
                }
                return;
            case 6:
                if (C(t11, i10)) {
                    s0.P(t10, Y10, s0.z(t11, Y10));
                    r0(t10, i10);
                    return;
                }
                return;
            case 7:
                if (C(t11, i10)) {
                    s0.H(t10, Y10, s0.r(t11, Y10));
                    r0(t10, i10);
                    return;
                }
                return;
            case 8:
                if (C(t11, i10)) {
                    s0.R(t10, Y10, s0.C(t11, Y10));
                    r0(t10, i10);
                    return;
                }
                return;
            case 9:
                P(t10, t11, i10);
                return;
            case 10:
                if (C(t11, i10)) {
                    s0.R(t10, Y10, s0.C(t11, Y10));
                    r0(t10, i10);
                    return;
                }
                return;
            case 11:
                if (C(t11, i10)) {
                    s0.P(t10, Y10, s0.z(t11, Y10));
                    r0(t10, i10);
                    return;
                }
                return;
            case 12:
                if (C(t11, i10)) {
                    s0.P(t10, Y10, s0.z(t11, Y10));
                    r0(t10, i10);
                    return;
                }
                return;
            case 13:
                if (C(t11, i10)) {
                    s0.P(t10, Y10, s0.z(t11, Y10));
                    r0(t10, i10);
                    return;
                }
                return;
            case 14:
                if (C(t11, i10)) {
                    s0.Q(t10, Y10, s0.A(t11, Y10));
                    r0(t10, i10);
                    return;
                }
                return;
            case 15:
                if (C(t11, i10)) {
                    s0.P(t10, Y10, s0.z(t11, Y10));
                    r0(t10, i10);
                    return;
                }
                return;
            case 16:
                if (C(t11, i10)) {
                    s0.Q(t10, Y10, s0.A(t11, Y10));
                    r0(t10, i10);
                    return;
                }
                return;
            case 17:
                P(t10, t11, i10);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case BuildConfig.MIN_SDK_VERSION /*24*/:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case BuildConfig.TARGET_SDK_VERSION /*33*/:
            case 34:
            case ImageFormat.YUV_420_888:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f67954n.d(t10, t11, Y10);
                return;
            case 50:
                j0.F(this.f67957q, t10, t11, Y10);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (J(t11, X10, i10)) {
                    s0.R(t10, Y10, s0.C(t11, Y10));
                    s0(t10, X10, i10);
                    return;
                }
                return;
            case 60:
                Q(t10, t11, i10);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (J(t11, X10, i10)) {
                    s0.R(t10, Y10, s0.C(t11, Y10));
                    s0(t10, X10, i10);
                    return;
                }
                return;
            case 68:
                Q(t10, t11, i10);
                return;
            default:
                return;
        }
    }

    private Object S(T t10, int i10) {
        h0 v10 = v(i10);
        long Y10 = Y(x0(i10));
        if (!C(t10, i10)) {
            return v10.e();
        }
        Object object = f67940s.getObject(t10, Y10);
        if (H(object)) {
            return object;
        }
        Object e10 = v10.e();
        if (object != null) {
            v10.a(e10, object);
        }
        return e10;
    }

    private Object T(T t10, int i10, int i11) {
        h0 v10 = v(i11);
        if (!J(t10, i10, i11)) {
            return v10.e();
        }
        Object object = f67940s.getObject(t10, Y(x0(i11)));
        if (H(object)) {
            return object;
        }
        Object e10 = v10.e();
        if (object != null) {
            v10.a(e10, object);
        }
        return e10;
    }

    static <T> V<T> U(Class<T> cls, P p10, X x10, H h10, o0<?, ?> o0Var, C9534q<?> qVar, M m10) {
        return p10 instanceof f0 ? W((f0) p10, x10, h10, o0Var, qVar, m10) : V((l0) p10, x10, h10, o0Var, qVar, m10);
    }

    static <T> V<T> V(l0 l0Var, X x10, H h10, o0<?, ?> o0Var, C9534q<?> qVar, M m10) {
        boolean z10 = l0Var.c() == c0.PROTO3;
        C9536t[] e10 = l0Var.e();
        if (e10.length == 0) {
            int length = e10.length;
            int[] iArr = new int[(length * 3)];
            Object[] objArr = new Object[(length * 2)];
            if (e10.length <= 0) {
                int[] d10 = l0Var.d();
                if (d10 == null) {
                    d10 = f67939r;
                }
                if (e10.length <= 0) {
                    int[] iArr2 = f67939r;
                    int[] iArr3 = f67939r;
                    int[] iArr4 = new int[(d10.length + iArr2.length + iArr3.length)];
                    System.arraycopy(d10, 0, iArr4, 0, d10.length);
                    System.arraycopy(iArr2, 0, iArr4, d10.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, d10.length + iArr2.length, iArr3.length);
                    return new V(iArr, objArr, 0, 0, l0Var.b(), z10, true, iArr4, d10.length, d10.length + iArr2.length, x10, h10, o0Var, qVar, m10);
                }
                C9536t tVar = e10[0];
                throw null;
            }
            C9536t tVar2 = e10[0];
            throw null;
        }
        C9536t tVar3 = e10[0];
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x036d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.crypto.tink.shaded.protobuf.V<T> W(com.google.crypto.tink.shaded.protobuf.f0 r33, com.google.crypto.tink.shaded.protobuf.X r34, com.google.crypto.tink.shaded.protobuf.H r35, com.google.crypto.tink.shaded.protobuf.o0<?, ?> r36, com.google.crypto.tink.shaded.protobuf.C9534q<?> r37, com.google.crypto.tink.shaded.protobuf.M r38) {
        /*
            com.google.crypto.tink.shaded.protobuf.c0 r0 = r33.c()
            com.google.crypto.tink.shaded.protobuf.c0 r1 = com.google.crypto.tink.shaded.protobuf.c0.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = r2
        L_0x000c:
            java.lang.String r0 = r33.e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0028
            r4 = 1
        L_0x001e:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0029
            r4 = r6
            goto L_0x001e
        L_0x0028:
            r6 = 1
        L_0x0029:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0048
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0035:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0045
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0035
        L_0x0045:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0048:
            if (r6 != 0) goto L_0x0058
            int[] r6 = f67939r
            r8 = r2
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r16 = r14
            r13 = r6
            r6 = r16
            goto L_0x0162
        L_0x0058:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0077
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0064:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0074
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0064
        L_0x0074:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0077:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0096
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0083:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0093
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0083
        L_0x0093:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0096:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b5
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a2:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a2
        L_0x00b2:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b5:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d4
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c1:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c1
        L_0x00d1:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d4:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f3
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00e0:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00f0
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00e0
        L_0x00f0:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f3:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0112
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ff:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010f
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ff
        L_0x010f:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0112:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0133
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011e:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012f
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011e
        L_0x012f:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0133:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0156
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013f:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0151
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013f
        L_0x0151:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0156:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 * 2
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
        L_0x0162:
            sun.misc.Unsafe r15 = f67940s
            java.lang.Object[] r17 = r33.d()
            com.google.crypto.tink.shaded.protobuf.S r18 = r33.b()
            java.lang.Class r2 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 * 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r20 = r14 + r12
            r22 = r14
            r23 = r20
            r12 = 0
            r21 = 0
        L_0x0181:
            if (r4 >= r1) goto L_0x03bb
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01a9
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x0191:
            int r26 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01a3
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r26
            goto L_0x0191
        L_0x01a3:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r26
            goto L_0x01ab
        L_0x01a9:
            r3 = r24
        L_0x01ab:
            int r24 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01d8
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01b9:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01d2
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r3 = r3 | r1
            int r24 = r24 + 13
            r5 = r27
            r1 = r28
            goto L_0x01b9
        L_0x01d2:
            int r1 = r5 << r24
            r3 = r3 | r1
            r1 = r27
            goto L_0x01dc
        L_0x01d8:
            r28 = r1
            r1 = r24
        L_0x01dc:
            r5 = r3 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01e9
            int r14 = r12 + 1
            r13[r12] = r21
            r12 = r14
        L_0x01e9:
            r14 = 51
            r30 = r12
            if (r5 < r14) goto L_0x0289
            int r14 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0218
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r31 = 13
        L_0x01fe:
            int r32 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r12) goto L_0x0213
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r31
            r1 = r1 | r12
            int r31 = r31 + 13
            r14 = r32
            r12 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01fe
        L_0x0213:
            int r12 = r14 << r31
            r1 = r1 | r12
            r14 = r32
        L_0x0218:
            int r12 = r5 + -51
            r31 = r14
            r14 = 9
            if (r12 == r14) goto L_0x023a
            r14 = 17
            if (r12 != r14) goto L_0x0225
            goto L_0x023a
        L_0x0225:
            r14 = 12
            if (r12 != r14) goto L_0x0247
            if (r10 != 0) goto L_0x0247
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0237:
            r16 = r14
            goto L_0x0247
        L_0x023a:
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0237
        L_0x0247:
            int r1 = r1 * 2
            r12 = r17[r1]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0255
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
        L_0x0251:
            r14 = r8
            r32 = r9
            goto L_0x025e
        L_0x0255:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = q0(r2, r12)
            r17[r1] = r12
            goto L_0x0251
        L_0x025e:
            long r8 = r15.objectFieldOffset(r12)
            int r8 = (int) r8
            int r1 = r1 + 1
            r9 = r17[r1]
            boolean r12 = r9 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x026f
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
        L_0x026d:
            r1 = r8
            goto L_0x0278
        L_0x026f:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = q0(r2, r9)
            r17[r1] = r9
            goto L_0x026d
        L_0x0278:
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r29 = r0
            r9 = r8
            r0 = r10
            r27 = r31
            r25 = 1
            r8 = r1
            r1 = 0
            goto L_0x0384
        L_0x0289:
            r14 = r8
            r32 = r9
            int r8 = r16 + 1
            r9 = r17[r16]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = q0(r2, r9)
            r12 = 9
            if (r5 == r12) goto L_0x029e
            r12 = 17
            if (r5 != r12) goto L_0x02a2
        L_0x029e:
            r25 = 1
            goto L_0x0305
        L_0x02a2:
            r12 = 27
            if (r5 == r12) goto L_0x02aa
            r12 = 49
            if (r5 != r12) goto L_0x02ad
        L_0x02aa:
            r25 = 1
            goto L_0x02f8
        L_0x02ad:
            r12 = 12
            if (r5 == r12) goto L_0x02e5
            r12 = 30
            if (r5 == r12) goto L_0x02e5
            r12 = 44
            if (r5 != r12) goto L_0x02ba
            goto L_0x02e5
        L_0x02ba:
            r12 = 50
            if (r5 != r12) goto L_0x02da
            int r12 = r22 + 1
            r13[r22] = r21
            int r22 = r21 / 3
            int r22 = r22 * 2
            int r27 = r16 + 2
            r8 = r17[r8]
            r11[r22] = r8
            r8 = r3 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02de
            int r22 = r22 + 1
            int r8 = r16 + 3
            r16 = r17[r27]
            r11[r22] = r16
            r22 = r12
        L_0x02da:
            r25 = 1
        L_0x02dc:
            r12 = r8
            goto L_0x0312
        L_0x02de:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x0312
        L_0x02e5:
            if (r10 != 0) goto L_0x02da
            int r12 = r21 / 3
            int r12 = r12 * 2
            r25 = 1
            int r12 = r12 + 1
            int r16 = r16 + 2
            r8 = r17[r8]
            r11[r12] = r8
        L_0x02f5:
            r12 = r16
            goto L_0x0312
        L_0x02f8:
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            int r16 = r16 + 2
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x02f5
        L_0x0305:
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            java.lang.Class r16 = r9.getType()
            r11[r12] = r16
            goto L_0x02dc
        L_0x0312:
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r9 = r3 & 4096(0x1000, float:5.74E-42)
            r16 = r12
            r12 = 4096(0x1000, float:5.74E-42)
            if (r9 != r12) goto L_0x036d
            r9 = 17
            if (r5 > r9) goto L_0x036d
            int r9 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0348
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x0332:
            int r27 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r12) goto L_0x0344
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r26
            r1 = r1 | r9
            int r26 = r26 + 13
            r9 = r27
            goto L_0x0332
        L_0x0344:
            int r9 = r9 << r26
            r1 = r1 | r9
            goto L_0x034a
        L_0x0348:
            r27 = r9
        L_0x034a:
            int r9 = r6 * 2
            int r26 = r1 / 32
            int r9 = r9 + r26
            r12 = r17[r9]
            r29 = r0
            boolean r0 = r12 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x035c
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
        L_0x035a:
            r0 = r10
            goto L_0x0365
        L_0x035c:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = q0(r2, r12)
            r17[r9] = r12
            goto L_0x035a
        L_0x0365:
            long r9 = r15.objectFieldOffset(r12)
            int r9 = (int) r9
            int r1 = r1 % 32
            goto L_0x0376
        L_0x036d:
            r29 = r0
            r0 = r10
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r27 = r1
            r1 = 0
        L_0x0376:
            r10 = 18
            if (r5 < r10) goto L_0x0384
            r10 = 49
            if (r5 > r10) goto L_0x0384
            int r10 = r23 + 1
            r13[r23] = r8
            r23 = r10
        L_0x0384:
            int r10 = r21 + 1
            r7[r21] = r4
            int r4 = r21 + 2
            r12 = r3 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0391
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0392
        L_0x0391:
            r12 = 0
        L_0x0392:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0399
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x039a
        L_0x0399:
            r3 = 0
        L_0x039a:
            r3 = r3 | r12
            int r5 = r5 << 20
            r3 = r3 | r5
            r3 = r3 | r8
            r7[r10] = r3
            int r21 = r21 + 3
            int r1 = r1 << 20
            r1 = r1 | r9
            r7[r4] = r1
            r10 = r0
            r8 = r14
            r14 = r24
            r4 = r27
            r1 = r28
            r0 = r29
            r12 = r30
            r9 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0181
        L_0x03bb:
            r32 = r9
            r0 = r10
            r24 = r14
            r14 = r8
            com.google.crypto.tink.shaded.protobuf.V r1 = new com.google.crypto.tink.shaded.protobuf.V
            com.google.crypto.tink.shaded.protobuf.S r9 = r33.b()
            r2 = 0
            r4 = r1
            r5 = r7
            r6 = r11
            r7 = r14
            r8 = r32
            r11 = r2
            r12 = r13
            r13 = r24
            r14 = r20
            r15 = r34
            r16 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.V.W(com.google.crypto.tink.shaded.protobuf.f0, com.google.crypto.tink.shaded.protobuf.X, com.google.crypto.tink.shaded.protobuf.H, com.google.crypto.tink.shaded.protobuf.o0, com.google.crypto.tink.shaded.protobuf.q, com.google.crypto.tink.shaded.protobuf.M):com.google.crypto.tink.shaded.protobuf.V");
    }

    private int X(int i10) {
        return this.f67941a[i10];
    }

    private static long Y(int i10) {
        return (long) (i10 & 1048575);
    }

    private static <T> boolean Z(T t10, long j10) {
        return ((Boolean) s0.C(t10, j10)).booleanValue();
    }

    private static <T> double a0(T t10, long j10) {
        return ((Double) s0.C(t10, j10)).doubleValue();
    }

    private static <T> float b0(T t10, long j10) {
        return ((Float) s0.C(t10, j10)).floatValue();
    }

    private static <T> int c0(T t10, long j10) {
        return ((Integer) s0.C(t10, j10)).intValue();
    }

    private static <T> long d0(T t10, long j10) {
        return ((Long) s0.C(t10, j10)).longValue();
    }

    private <K, V> int e0(T t10, byte[] bArr, int i10, int i11, int i12, long j10, C9522e.b bVar) {
        T t11 = t10;
        long j11 = j10;
        Unsafe unsafe = f67940s;
        int i13 = i12;
        Object u10 = u(i12);
        Object object = unsafe.getObject(t10, j11);
        if (this.f67957q.h(object)) {
            Object d10 = this.f67957q.d(u10);
            this.f67957q.a(d10, object);
            unsafe.putObject(t10, j11, d10);
            object = d10;
        }
        this.f67957q.b(u10);
        return n(bArr, i10, i11, (K.a) null, this.f67957q.c(object), bVar);
    }

    private int f0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, C9522e.b bVar) {
        T t11 = t10;
        byte[] bArr2 = bArr;
        int i18 = i10;
        int i19 = i12;
        int i20 = i13;
        int i21 = i14;
        long j11 = j10;
        int i22 = i17;
        C9522e.b bVar2 = bVar;
        Unsafe unsafe = f67940s;
        long j12 = (long) (this.f67941a[i22 + 2] & 1048575);
        switch (i16) {
            case 51:
                if (i21 == 1) {
                    unsafe.putObject(t11, j11, Double.valueOf(C9522e.d(bArr, i10)));
                    int i23 = i18 + 8;
                    unsafe.putInt(t11, j12, i20);
                    return i23;
                }
                break;
            case 52:
                if (i21 == 5) {
                    unsafe.putObject(t11, j11, Float.valueOf(C9522e.l(bArr, i10)));
                    int i24 = i18 + 4;
                    unsafe.putInt(t11, j12, i20);
                    return i24;
                }
                break;
            case 53:
            case 54:
                if (i21 == 0) {
                    int L10 = C9522e.L(bArr2, i18, bVar2);
                    unsafe.putObject(t11, j11, Long.valueOf(bVar2.f67974b));
                    unsafe.putInt(t11, j12, i20);
                    return L10;
                }
                break;
            case 55:
            case 62:
                if (i21 == 0) {
                    int I10 = C9522e.I(bArr2, i18, bVar2);
                    unsafe.putObject(t11, j11, Integer.valueOf(bVar2.f67973a));
                    unsafe.putInt(t11, j12, i20);
                    return I10;
                }
                break;
            case 56:
            case 65:
                if (i21 == 1) {
                    unsafe.putObject(t11, j11, Long.valueOf(C9522e.j(bArr, i10)));
                    int i25 = i18 + 8;
                    unsafe.putInt(t11, j12, i20);
                    return i25;
                }
                break;
            case 57:
            case 64:
                if (i21 == 5) {
                    unsafe.putObject(t11, j11, Integer.valueOf(C9522e.h(bArr, i10)));
                    int i26 = i18 + 4;
                    unsafe.putInt(t11, j12, i20);
                    return i26;
                }
                break;
            case 58:
                if (i21 == 0) {
                    int L11 = C9522e.L(bArr2, i18, bVar2);
                    unsafe.putObject(t11, j11, Boolean.valueOf(bVar2.f67974b != 0));
                    unsafe.putInt(t11, j12, i20);
                    return L11;
                }
                break;
            case 59:
                if (i21 == 2) {
                    int I11 = C9522e.I(bArr2, i18, bVar2);
                    int i27 = bVar2.f67973a;
                    if (i27 == 0) {
                        unsafe.putObject(t11, j11, "");
                    } else if ((i15 & 536870912) == 0 || t0.n(bArr2, I11, I11 + i27)) {
                        unsafe.putObject(t11, j11, new String(bArr2, I11, i27, A.f67907b));
                        I11 += i27;
                    } else {
                        throw B.d();
                    }
                    unsafe.putInt(t11, j12, i20);
                    return I11;
                }
                break;
            case 60:
                if (i21 == 2) {
                    Object T10 = T(t11, i20, i22);
                    int O10 = C9522e.O(T10, v(i22), bArr, i10, i11, bVar);
                    v0(t11, i20, i22, T10);
                    return O10;
                }
                break;
            case 61:
                if (i21 == 2) {
                    int b10 = C9522e.b(bArr2, i18, bVar2);
                    unsafe.putObject(t11, j11, bVar2.f67975c);
                    unsafe.putInt(t11, j12, i20);
                    return b10;
                }
                break;
            case 63:
                if (i21 == 0) {
                    int I12 = C9522e.I(bArr2, i18, bVar2);
                    int i28 = bVar2.f67973a;
                    A.e t12 = t(i22);
                    if (t12 == null || t12.a(i28)) {
                        unsafe.putObject(t11, j11, Integer.valueOf(i28));
                        unsafe.putInt(t11, j12, i20);
                    } else {
                        w(t10).n(i19, Long.valueOf((long) i28));
                    }
                    return I12;
                }
                break;
            case 66:
                if (i21 == 0) {
                    int I13 = C9522e.I(bArr2, i18, bVar2);
                    unsafe.putObject(t11, j11, Integer.valueOf(C9526i.b(bVar2.f67973a)));
                    unsafe.putInt(t11, j12, i20);
                    return I13;
                }
                break;
            case 67:
                if (i21 == 0) {
                    int L12 = C9522e.L(bArr2, i18, bVar2);
                    unsafe.putObject(t11, j11, Long.valueOf(C9526i.c(bVar2.f67974b)));
                    unsafe.putInt(t11, j12, i20);
                    return L12;
                }
                break;
            case 68:
                if (i21 == 3) {
                    Object T11 = T(t11, i20, i22);
                    int N10 = C9522e.N(T11, v(i22), bArr, i10, i11, (i19 & -8) | 4, bVar);
                    v0(t11, i20, i22, T11);
                    return N10;
                }
                break;
        }
        return i18;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02e8, code lost:
        if (r0 != r15) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0307, code lost:
        if (r0 != r15) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        r18 = r32;
        r11 = r34;
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
        r10 = r4;
        r32 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d3, code lost:
        r6 = r6 | r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d5, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e9, code lost:
        r6 = r6 | r20;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0141, code lost:
        r6 = r32 | r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0144, code lost:
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x019a, code lost:
        r0 = r10 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0203, code lost:
        r6 = r32;
        r27 = r8;
        r28 = r9;
        r2 = r10;
        r19 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0298, code lost:
        if (r0 != r15) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02b2, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int h0(T r30, byte[] r31, int r32, int r33, com.google.crypto.tink.shaded.protobuf.C9522e.b r34) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            m(r30)
            sun.misc.Unsafe r9 = f67940s
            r16 = 0
            r8 = -1
            r0 = r32
            r1 = r8
            r2 = r16
            r6 = r2
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001b:
            if (r0 >= r13) goto L_0x0329
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002d
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.H(r0, r12, r3, r11)
            int r3 = r11.f67973a
            r4 = r0
            r17 = r3
            goto L_0x0030
        L_0x002d:
            r17 = r0
            r4 = r3
        L_0x0030:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003e
            int r2 = r2 / 3
            int r0 = r15.k0(r5, r2)
        L_0x003c:
            r2 = r0
            goto L_0x0043
        L_0x003e:
            int r0 = r15.j0(r5)
            goto L_0x003c
        L_0x0043:
            if (r2 != r8) goto L_0x0050
            r2 = r4
            r18 = r5
            r19 = r8
            r28 = r9
            r27 = r16
            goto L_0x030a
        L_0x0050:
            int[] r0 = r15.f67941a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = w0(r1)
            long r10 = Y(r1)
            r8 = 17
            r32 = r5
            if (r0 > r8) goto L_0x020e
            int[] r8 = r15.f67941a
            int r20 = r2 + 2
            r8 = r8[r20]
            int r20 = r8 >>> 20
            r5 = 1
            int r20 = r5 << r20
            r22 = r10
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r8 & r10
            if (r8 == r7) goto L_0x0088
            if (r7 == r10) goto L_0x0080
            long r10 = (long) r7
            r9.putInt(r14, r10, r6)
            r10 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0080:
            if (r8 == r10) goto L_0x0087
            long r6 = (long) r8
            int r6 = r9.getInt(r14, r6)
        L_0x0087:
            r7 = r8
        L_0x0088:
            r8 = 5
            switch(r0) {
                case 0: goto L_0x01ee;
                case 1: goto L_0x01d6;
                case 2: goto L_0x01b3;
                case 3: goto L_0x01b3;
                case 4: goto L_0x019d;
                case 5: goto L_0x0180;
                case 6: goto L_0x016a;
                case 7: goto L_0x0147;
                case 8: goto L_0x0122;
                case 9: goto L_0x0101;
                case 10: goto L_0x00ed;
                case 11: goto L_0x019d;
                case 12: goto L_0x00d7;
                case 13: goto L_0x016a;
                case 14: goto L_0x0180;
                case 15: goto L_0x00bd;
                case 16: goto L_0x0096;
                default: goto L_0x008c;
            }
        L_0x008c:
            r18 = r32
            r11 = r34
            r8 = r2
        L_0x0091:
            r10 = r4
            r32 = r6
            goto L_0x0203
        L_0x0096:
            if (r3 != 0) goto L_0x008c
            r11 = r34
            r0 = r22
            int r8 = com.google.crypto.tink.shaded.protobuf.C9522e.L(r12, r4, r11)
            long r3 = r11.f67974b
            long r4 = com.google.crypto.tink.shaded.protobuf.C9526i.c(r3)
            r0 = r9
            r1 = r30
            r17 = r8
            r8 = r2
            r2 = r22
            r18 = r32
            r0.putLong(r1, r2, r4)
            r6 = r6 | r20
            r2 = r8
            r0 = r17
        L_0x00b8:
            r1 = r18
            r8 = -1
            goto L_0x001b
        L_0x00bd:
            r18 = r32
            r11 = r34
            r8 = r2
            if (r3 != 0) goto L_0x0091
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.I(r12, r4, r11)
            int r1 = r11.f67973a
            int r1 = com.google.crypto.tink.shaded.protobuf.C9526i.b(r1)
            r2 = r22
            r9.putInt(r14, r2, r1)
        L_0x00d3:
            r6 = r6 | r20
        L_0x00d5:
            r2 = r8
            goto L_0x00b8
        L_0x00d7:
            r18 = r32
            r11 = r34
            r8 = r2
            r0 = r22
            if (r3 != 0) goto L_0x0091
            int r2 = com.google.crypto.tink.shaded.protobuf.C9522e.I(r12, r4, r11)
            int r3 = r11.f67973a
            r9.putInt(r14, r0, r3)
        L_0x00e9:
            r6 = r6 | r20
            r0 = r2
            goto L_0x00d5
        L_0x00ed:
            r18 = r32
            r11 = r34
            r8 = r2
            r0 = r22
            r2 = 2
            if (r3 != r2) goto L_0x0091
            int r2 = com.google.crypto.tink.shaded.protobuf.C9522e.b(r12, r4, r11)
            java.lang.Object r3 = r11.f67975c
            r9.putObject(r14, r0, r3)
            goto L_0x00e9
        L_0x0101:
            r18 = r32
            r11 = r34
            r8 = r2
            r2 = 2
            if (r3 != r2) goto L_0x0091
            java.lang.Object r5 = r15.S(r14, r8)
            com.google.crypto.tink.shaded.protobuf.h0 r1 = r15.v(r8)
            r0 = r5
            r2 = r31
            r3 = r4
            r4 = r33
            r10 = r5
            r5 = r34
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.O(r0, r1, r2, r3, r4, r5)
            r15.u0(r14, r8, r10)
            goto L_0x00d3
        L_0x0122:
            r18 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            r0 = 2
            if (r3 != r0) goto L_0x0144
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0138
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.C(r12, r4, r11)
            goto L_0x013c
        L_0x0138:
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.F(r12, r4, r11)
        L_0x013c:
            java.lang.Object r1 = r11.f67975c
            r9.putObject(r14, r5, r1)
        L_0x0141:
            r6 = r32 | r20
            goto L_0x00d5
        L_0x0144:
            r10 = r4
            goto L_0x0203
        L_0x0147:
            r18 = r32
            r11 = r34
            r8 = r2
            r0 = r5
            r32 = r6
            r5 = r22
            if (r3 != 0) goto L_0x0144
            int r1 = com.google.crypto.tink.shaded.protobuf.C9522e.L(r12, r4, r11)
            long r2 = r11.f67974b
            r23 = 0
            int r2 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r2 == 0) goto L_0x0160
            goto L_0x0162
        L_0x0160:
            r0 = r16
        L_0x0162:
            com.google.crypto.tink.shaded.protobuf.s0.H(r14, r5, r0)
            r6 = r32 | r20
            r0 = r1
            goto L_0x00d5
        L_0x016a:
            r18 = r32
            r11 = r34
            r32 = r6
            r0 = r8
            r5 = r22
            r8 = r2
            if (r3 != r0) goto L_0x0144
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.h(r12, r4)
            r9.putInt(r14, r5, r0)
            int r0 = r4 + 4
            goto L_0x0141
        L_0x0180:
            r18 = r32
            r11 = r34
            r8 = r2
            r0 = r5
            r32 = r6
            r5 = r22
            if (r3 != r0) goto L_0x0144
            long r23 = com.google.crypto.tink.shaded.protobuf.C9522e.j(r12, r4)
            r0 = r9
            r1 = r30
            r2 = r5
            r10 = r4
            r4 = r23
            r0.putLong(r1, r2, r4)
        L_0x019a:
            int r0 = r10 + 8
            goto L_0x0141
        L_0x019d:
            r18 = r32
            r11 = r34
            r8 = r2
            r10 = r4
            r32 = r6
            r5 = r22
            if (r3 != 0) goto L_0x0203
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.I(r12, r10, r11)
            int r1 = r11.f67973a
            r9.putInt(r14, r5, r1)
            goto L_0x0141
        L_0x01b3:
            r18 = r32
            r11 = r34
            r8 = r2
            r10 = r4
            r32 = r6
            r5 = r22
            if (r3 != 0) goto L_0x0203
            int r10 = com.google.crypto.tink.shaded.protobuf.C9522e.L(r12, r10, r11)
            long r2 = r11.f67974b
            r0 = r9
            r1 = r30
            r23 = r2
            r2 = r5
            r4 = r23
            r0.putLong(r1, r2, r4)
            r6 = r32 | r20
            r2 = r8
            r0 = r10
            goto L_0x00b8
        L_0x01d6:
            r18 = r32
            r11 = r34
            r10 = r4
            r32 = r6
            r0 = r8
            r5 = r22
            r8 = r2
            if (r3 != r0) goto L_0x0203
            float r0 = com.google.crypto.tink.shaded.protobuf.C9522e.l(r12, r10)
            com.google.crypto.tink.shaded.protobuf.s0.O(r14, r5, r0)
            int r0 = r10 + 4
            goto L_0x0141
        L_0x01ee:
            r18 = r32
            r11 = r34
            r8 = r2
            r10 = r4
            r0 = r5
            r32 = r6
            r5 = r22
            if (r3 != r0) goto L_0x0203
            double r0 = com.google.crypto.tink.shaded.protobuf.C9522e.d(r12, r10)
            com.google.crypto.tink.shaded.protobuf.s0.N(r14, r5, r0)
            goto L_0x019a
        L_0x0203:
            r6 = r32
            r27 = r8
            r28 = r9
            r2 = r10
            r19 = -1
            goto L_0x030a
        L_0x020e:
            r18 = r32
            r8 = r2
            r20 = r6
            r5 = r10
            r11 = r34
            r10 = r4
            r2 = 27
            if (r0 != r2) goto L_0x0261
            r2 = 2
            if (r3 != r2) goto L_0x0254
            java.lang.Object r0 = r9.getObject(r14, r5)
            com.google.crypto.tink.shaded.protobuf.A$i r0 = (com.google.crypto.tink.shaded.protobuf.A.i) r0
            boolean r1 = r0.u()
            if (r1 != 0) goto L_0x023c
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0233
            r1 = 10
            goto L_0x0235
        L_0x0233:
            int r1 = r1 * 2
        L_0x0235:
            com.google.crypto.tink.shaded.protobuf.A$i r0 = r0.f(r1)
            r9.putObject(r14, r5, r0)
        L_0x023c:
            r5 = r0
            com.google.crypto.tink.shaded.protobuf.h0 r0 = r15.v(r8)
            r1 = r17
            r2 = r31
            r3 = r10
            r4 = r33
            r10 = r20
            r6 = r34
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.q(r0, r1, r2, r3, r4, r5, r6)
            r2 = r8
            r6 = r10
            goto L_0x00b8
        L_0x0254:
            r22 = r7
            r27 = r8
            r28 = r9
            r15 = r10
            r26 = r20
            r19 = -1
            goto L_0x02eb
        L_0x0261:
            r4 = r20
            r2 = 49
            if (r0 > r2) goto L_0x02b9
            long r1 = (long) r1
            r32 = r0
            r0 = r29
            r20 = r1
            r1 = r30
            r2 = r31
            r23 = r3
            r3 = r10
            r15 = r4
            r4 = r33
            r24 = r5
            r5 = r17
            r6 = r18
            r26 = r15
            r15 = r7
            r7 = r23
            r27 = r8
            r19 = -1
            r28 = r9
            r22 = r15
            r15 = r10
            r9 = r20
            r11 = r32
            r12 = r24
            r14 = r34
            int r0 = r0.i0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02b2
        L_0x029a:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r1 = r18
            r8 = r19
            r7 = r22
            r6 = r26
        L_0x02ac:
            r2 = r27
            r9 = r28
            goto L_0x001b
        L_0x02b2:
            r2 = r0
        L_0x02b3:
            r7 = r22
            r6 = r26
            goto L_0x030a
        L_0x02b9:
            r32 = r0
            r23 = r3
            r26 = r4
            r24 = r5
            r22 = r7
            r27 = r8
            r28 = r9
            r15 = r10
            r19 = -1
            r0 = 50
            r9 = r32
            if (r9 != r0) goto L_0x02ed
            r7 = r23
            r0 = 2
            if (r7 != r0) goto L_0x02eb
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r27
            r6 = r24
            r8 = r34
            int r0 = r0.e0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02b2
            goto L_0x029a
        L_0x02eb:
            r2 = r15
            goto L_0x02b3
        L_0x02ed:
            r7 = r23
            r0 = r29
            r8 = r1
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r17
            r6 = r18
            r10 = r24
            r12 = r27
            r13 = r34
            int r0 = r0.f0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02b2
            goto L_0x029a
        L_0x030a:
            com.google.crypto.tink.shaded.protobuf.p0 r4 = w(r30)
            r0 = r17
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.G(r0, r1, r2, r3, r4, r5)
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r1 = r18
            r8 = r19
            goto L_0x02ac
        L_0x0329:
            r26 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x033c
            long r1 = (long) r7
            r3 = r30
            r6 = r26
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x033c:
            r1 = r33
            if (r0 != r1) goto L_0x0341
            return r0
        L_0x0341:
            com.google.crypto.tink.shaded.protobuf.B r0 = com.google.crypto.tink.shaded.protobuf.B.h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.V.h0(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    private int i0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, C9522e.b bVar) {
        int i17;
        T t11 = t10;
        byte[] bArr2 = bArr;
        int i18 = i10;
        int i19 = i14;
        int i20 = i15;
        long j12 = j11;
        C9522e.b bVar2 = bVar;
        Unsafe unsafe = f67940s;
        A.i iVar = (A.i) unsafe.getObject(t10, j12);
        if (!iVar.u()) {
            int size = iVar.size();
            iVar = iVar.f(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j12, iVar);
        }
        switch (i16) {
            case 18:
            case ImageFormat.YUV_420_888:
                if (i19 == 2) {
                    return C9522e.s(bArr, i18, iVar, bVar2);
                }
                if (i19 == 1) {
                    return C9522e.e(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 19:
            case 36:
                if (i19 == 2) {
                    return C9522e.v(bArr, i18, iVar, bVar2);
                }
                if (i19 == 5) {
                    return C9522e.m(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i19 == 2) {
                    return C9522e.z(bArr, i18, iVar, bVar2);
                }
                if (i19 == 0) {
                    return C9522e.M(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i19 == 2) {
                    return C9522e.y(bArr, i18, iVar, bVar2);
                }
                if (i19 == 0) {
                    return C9522e.J(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case 32:
            case 40:
            case 46:
                if (i19 == 2) {
                    return C9522e.u(bArr, i18, iVar, bVar2);
                }
                if (i19 == 1) {
                    return C9522e.k(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case BuildConfig.MIN_SDK_VERSION /*24*/:
            case 31:
            case 41:
            case 45:
                if (i19 == 2) {
                    return C9522e.t(bArr, i18, iVar, bVar2);
                }
                if (i19 == 5) {
                    return C9522e.i(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 25:
            case 42:
                if (i19 == 2) {
                    return C9522e.r(bArr, i18, iVar, bVar2);
                }
                if (i19 == 0) {
                    return C9522e.a(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 26:
                if (i19 == 2) {
                    return (j10 & 536870912) == 0 ? C9522e.D(i12, bArr, i10, i11, iVar, bVar) : C9522e.E(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 27:
                if (i19 == 2) {
                    return C9522e.q(v(i20), i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 28:
                if (i19 == 2) {
                    return C9522e.c(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 30:
            case 44:
                if (i19 == 2) {
                    i17 = C9522e.y(bArr, i18, iVar, bVar2);
                } else if (i19 == 0) {
                    i17 = C9522e.J(i12, bArr, i10, i11, iVar, bVar);
                }
                j0.A(t10, i13, iVar, t(i20), null, this.f67955o);
                return i17;
            case BuildConfig.TARGET_SDK_VERSION /*33*/:
            case 47:
                if (i19 == 2) {
                    return C9522e.w(bArr, i18, iVar, bVar2);
                }
                if (i19 == 0) {
                    return C9522e.A(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 34:
            case 48:
                if (i19 == 2) {
                    return C9522e.x(bArr, i18, iVar, bVar2);
                }
                if (i19 == 0) {
                    return C9522e.B(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 49:
                if (i19 == 3) {
                    return C9522e.o(v(i20), i12, bArr, i10, i11, iVar, bVar);
                }
                break;
        }
        return i18;
    }

    private int j0(int i10) {
        if (i10 < this.f67943c || i10 > this.f67944d) {
            return -1;
        }
        return t0(i10, 0);
    }

    private boolean k(T t10, T t11, int i10) {
        return C(t10, i10) == C(t11, i10);
    }

    private int k0(int i10, int i11) {
        if (i10 < this.f67943c || i10 > this.f67944d) {
            return -1;
        }
        return t0(i10, i11);
    }

    private static <T> boolean l(T t10, long j10) {
        return s0.r(t10, j10);
    }

    private int l0(int i10) {
        return this.f67941a[i10 + 2];
    }

    private static void m(Object obj) {
        if (!H(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    private <E> void m0(Object obj, long j10, g0 g0Var, h0<E> h0Var, C9533p pVar) {
        g0Var.P(this.f67954n.e(obj, j10), h0Var, pVar);
    }

    private <K, V> int n(byte[] bArr, int i10, int i11, K.a<K, V> aVar, Map<K, V> map, C9522e.b bVar) {
        int I10 = C9522e.I(bArr, i10, bVar);
        int i12 = bVar.f67973a;
        if (i12 < 0 || i12 > i11 - I10) {
            throw B.m();
        }
        throw null;
    }

    private <E> void n0(Object obj, int i10, g0 g0Var, h0<E> h0Var, C9533p pVar) {
        g0Var.N(this.f67954n.e(obj, Y(i10)), h0Var, pVar);
    }

    private static <T> double o(T t10, long j10) {
        return s0.x(t10, j10);
    }

    private void o0(Object obj, int i10, g0 g0Var) {
        if (B(i10)) {
            s0.R(obj, Y(i10), g0Var.I());
        } else if (this.f67947g) {
            s0.R(obj, Y(i10), g0Var.z());
        } else {
            s0.R(obj, Y(i10), g0Var.o());
        }
    }

    private boolean p(T t10, T t11, int i10) {
        int x02 = x0(i10);
        long Y10 = Y(x02);
        switch (w0(x02)) {
            case 0:
                return k(t10, t11, i10) && Double.doubleToLongBits(s0.x(t10, Y10)) == Double.doubleToLongBits(s0.x(t11, Y10));
            case 1:
                return k(t10, t11, i10) && Float.floatToIntBits(s0.y(t10, Y10)) == Float.floatToIntBits(s0.y(t11, Y10));
            case 2:
                return k(t10, t11, i10) && s0.A(t10, Y10) == s0.A(t11, Y10);
            case 3:
                return k(t10, t11, i10) && s0.A(t10, Y10) == s0.A(t11, Y10);
            case 4:
                return k(t10, t11, i10) && s0.z(t10, Y10) == s0.z(t11, Y10);
            case 5:
                return k(t10, t11, i10) && s0.A(t10, Y10) == s0.A(t11, Y10);
            case 6:
                return k(t10, t11, i10) && s0.z(t10, Y10) == s0.z(t11, Y10);
            case 7:
                return k(t10, t11, i10) && s0.r(t10, Y10) == s0.r(t11, Y10);
            case 8:
                return k(t10, t11, i10) && j0.K(s0.C(t10, Y10), s0.C(t11, Y10));
            case 9:
                return k(t10, t11, i10) && j0.K(s0.C(t10, Y10), s0.C(t11, Y10));
            case 10:
                return k(t10, t11, i10) && j0.K(s0.C(t10, Y10), s0.C(t11, Y10));
            case 11:
                return k(t10, t11, i10) && s0.z(t10, Y10) == s0.z(t11, Y10);
            case 12:
                return k(t10, t11, i10) && s0.z(t10, Y10) == s0.z(t11, Y10);
            case 13:
                return k(t10, t11, i10) && s0.z(t10, Y10) == s0.z(t11, Y10);
            case 14:
                return k(t10, t11, i10) && s0.A(t10, Y10) == s0.A(t11, Y10);
            case 15:
                return k(t10, t11, i10) && s0.z(t10, Y10) == s0.z(t11, Y10);
            case 16:
                return k(t10, t11, i10) && s0.A(t10, Y10) == s0.A(t11, Y10);
            case 17:
                return k(t10, t11, i10) && j0.K(s0.C(t10, Y10), s0.C(t11, Y10));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case BuildConfig.MIN_SDK_VERSION /*24*/:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case BuildConfig.TARGET_SDK_VERSION /*33*/:
            case 34:
            case ImageFormat.YUV_420_888:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return j0.K(s0.C(t10, Y10), s0.C(t11, Y10));
            case 50:
                return j0.K(s0.C(t10, Y10), s0.C(t11, Y10));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return I(t10, t11, i10) && j0.K(s0.C(t10, Y10), s0.C(t11, Y10));
            default:
                return true;
        }
    }

    private void p0(Object obj, int i10, g0 g0Var) {
        if (B(i10)) {
            g0Var.n(this.f67954n.e(obj, Y(i10)));
        } else {
            g0Var.B(this.f67954n.e(obj, Y(i10)));
        }
    }

    private <UT, UB> UB q(Object obj, int i10, UB ub2, o0<UT, UB> o0Var, Object obj2) {
        A.e t10;
        int X10 = X(i10);
        Object C10 = s0.C(obj, Y(x0(i10)));
        if (C10 == null || (t10 = t(i10)) == null) {
            return ub2;
        }
        return r(i10, X10, this.f67957q.c(C10), t10, ub2, o0Var, obj2);
    }

    private static Field q0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private <K, V, UT, UB> UB r(int i10, int i11, Map<K, V> map, A.e eVar, UB ub2, o0<UT, UB> o0Var, Object obj) {
        this.f67957q.b(u(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = o0Var.f(obj);
                }
                C9525h.C1176h y10 = C9525h.y(K.b((K.a) null, next.getKey(), next.getValue()));
                try {
                    K.d(y10.b(), (K.a) null, next.getKey(), next.getValue());
                    o0Var.d(ub2, i11, y10.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private void r0(T t10, int i10) {
        int l02 = l0(i10);
        long j10 = (long) (1048575 & l02);
        if (j10 != 1048575) {
            s0.P(t10, j10, (1 << (l02 >>> 20)) | s0.z(t10, j10));
        }
    }

    private static <T> float s(T t10, long j10) {
        return s0.y(t10, j10);
    }

    private void s0(T t10, int i10, int i11) {
        s0.P(t10, (long) (l0(i11) & 1048575), i10);
    }

    private A.e t(int i10) {
        return (A.e) this.f67942b[((i10 / 3) * 2) + 1];
    }

    private int t0(int i10, int i11) {
        int length = (this.f67941a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int X10 = X(i13);
            if (i10 == X10) {
                return i13;
            }
            if (i10 < X10) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private Object u(int i10) {
        return this.f67942b[(i10 / 3) * 2];
    }

    private void u0(T t10, int i10, Object obj) {
        f67940s.putObject(t10, Y(x0(i10)), obj);
        r0(t10, i10);
    }

    private h0 v(int i10) {
        int i11 = (i10 / 3) * 2;
        h0 h0Var = (h0) this.f67942b[i11];
        if (h0Var != null) {
            return h0Var;
        }
        h0 c10 = d0.a().c((Class) this.f67942b[i11 + 1]);
        this.f67942b[i11] = c10;
        return c10;
    }

    private void v0(T t10, int i10, int i11, Object obj) {
        f67940s.putObject(t10, Y(x0(i11)), obj);
        s0(t10, i10, i11);
    }

    static p0 w(Object obj) {
        C9541y yVar = (C9541y) obj;
        p0 p0Var = yVar.unknownFields;
        if (p0Var != p0.c()) {
            return p0Var;
        }
        p0 k10 = p0.k();
        yVar.unknownFields = k10;
        return k10;
    }

    private static int w0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x034c, code lost:
        r6 = r6 + r3;
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x051b, code lost:
        r5 = r5 + 3;
        r4 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ae, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01bb, code lost:
        r4 = (r4 + r9) + r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int x(T r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f67940s
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r4
            r5 = 0
            r6 = 0
            r8 = 0
        L_0x000d:
            int[] r9 = r0.f67941a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x0522
            int r9 = r0.x0(r5)
            int r10 = r0.X(r5)
            int r11 = w0(r9)
            r12 = 17
            r13 = 1
            if (r11 > r12) goto L_0x0038
            int[] r12 = r0.f67941a
            int r14 = r5 + 2
            r12 = r12[r14]
            r14 = r12 & r4
            int r15 = r12 >>> 20
            int r15 = r13 << r15
            if (r14 == r7) goto L_0x0057
            long r7 = (long) r14
            int r8 = r2.getInt(r1, r7)
            r7 = r14
            goto L_0x0057
        L_0x0038:
            boolean r12 = r0.f67949i
            if (r12 == 0) goto L_0x0055
            com.google.crypto.tink.shaded.protobuf.v r12 = com.google.crypto.tink.shaded.protobuf.C9538v.DOUBLE_LIST_PACKED
            int r12 = r12.a()
            if (r11 < r12) goto L_0x0055
            com.google.crypto.tink.shaded.protobuf.v r12 = com.google.crypto.tink.shaded.protobuf.C9538v.SINT64_LIST_PACKED
            int r12 = r12.a()
            if (r11 > r12) goto L_0x0055
            int[] r12 = r0.f67941a
            int r14 = r5 + 2
            r12 = r12[r14]
            r12 = r12 & r4
        L_0x0053:
            r15 = 0
            goto L_0x0057
        L_0x0055:
            r12 = 0
            goto L_0x0053
        L_0x0057:
            long r13 = Y(r9)
            r9 = 0
            r3 = 0
            switch(r11) {
                case 0: goto L_0x050f;
                case 1: goto L_0x0505;
                case 2: goto L_0x04f7;
                case 3: goto L_0x04e9;
                case 4: goto L_0x04db;
                case 5: goto L_0x04d1;
                case 6: goto L_0x04c6;
                case 7: goto L_0x04bb;
                case 8: goto L_0x049f;
                case 9: goto L_0x048d;
                case 10: goto L_0x047d;
                case 11: goto L_0x046f;
                case 12: goto L_0x0461;
                case 13: goto L_0x0456;
                case 14: goto L_0x044c;
                case 15: goto L_0x043e;
                case 16: goto L_0x0430;
                case 17: goto L_0x041c;
                case 18: goto L_0x040f;
                case 19: goto L_0x0402;
                case 20: goto L_0x03f5;
                case 21: goto L_0x03e8;
                case 22: goto L_0x03db;
                case 23: goto L_0x03ce;
                case 24: goto L_0x03c1;
                case 25: goto L_0x03b5;
                case 26: goto L_0x03a9;
                case 27: goto L_0x0399;
                case 28: goto L_0x038d;
                case 29: goto L_0x0380;
                case 30: goto L_0x0374;
                case 31: goto L_0x0368;
                case 32: goto L_0x035c;
                case 33: goto L_0x0350;
                case 34: goto L_0x0341;
                case 35: goto L_0x0323;
                case 36: goto L_0x0305;
                case 37: goto L_0x02e7;
                case 38: goto L_0x02c9;
                case 39: goto L_0x02ab;
                case 40: goto L_0x028d;
                case 41: goto L_0x026f;
                case 42: goto L_0x0251;
                case 43: goto L_0x0233;
                case 44: goto L_0x0216;
                case 45: goto L_0x01f9;
                case 46: goto L_0x01dc;
                case 47: goto L_0x01bf;
                case 48: goto L_0x019f;
                case 49: goto L_0x018f;
                case 50: goto L_0x017f;
                case 51: goto L_0x0171;
                case 52: goto L_0x0165;
                case 53: goto L_0x0155;
                case 54: goto L_0x0145;
                case 55: goto L_0x0135;
                case 56: goto L_0x0129;
                case 57: goto L_0x011d;
                case 58: goto L_0x0110;
                case 59: goto L_0x00f2;
                case 60: goto L_0x00df;
                case 61: goto L_0x00ce;
                case 62: goto L_0x00bf;
                case 63: goto L_0x00b0;
                case 64: goto L_0x00a3;
                case 65: goto L_0x0098;
                case 66: goto L_0x0089;
                case 67: goto L_0x007a;
                case 68: goto L_0x0062;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x0077
        L_0x0062:
            boolean r3 = r0.J(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.S r3 = (com.google.crypto.tink.shaded.protobuf.S) r3
            com.google.crypto.tink.shaded.protobuf.h0 r4 = r0.v(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.s(r10, r3, r4)
        L_0x0076:
            int r6 = r6 + r3
        L_0x0077:
            r11 = 0
            goto L_0x051b
        L_0x007a:
            boolean r3 = r0.J(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            long r3 = d0(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.P(r10, r3)
            goto L_0x0076
        L_0x0089:
            boolean r3 = r0.J(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            int r3 = c0(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.N(r10, r3)
            goto L_0x0076
        L_0x0098:
            boolean r9 = r0.J(r1, r10, r5)
            if (r9 == 0) goto L_0x0077
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.L(r10, r3)
            goto L_0x0076
        L_0x00a3:
            boolean r3 = r0.J(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            r3 = 0
            int r4 = com.google.crypto.tink.shaded.protobuf.C9528k.J(r10, r3)
        L_0x00ae:
            int r6 = r6 + r4
            goto L_0x0077
        L_0x00b0:
            boolean r3 = r0.J(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            int r3 = c0(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.k(r10, r3)
            goto L_0x0076
        L_0x00bf:
            boolean r3 = r0.J(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            int r3 = c0(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.U(r10, r3)
            goto L_0x0076
        L_0x00ce:
            boolean r3 = r0.J(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.h r3 = (com.google.crypto.tink.shaded.protobuf.C9525h) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.g(r10, r3)
            goto L_0x0076
        L_0x00df:
            boolean r3 = r0.J(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.h0 r4 = r0.v(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.o(r10, r3, r4)
            goto L_0x0076
        L_0x00f2:
            boolean r3 = r0.J(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.crypto.tink.shaded.protobuf.C9525h
            if (r4 == 0) goto L_0x0108
            com.google.crypto.tink.shaded.protobuf.h r3 = (com.google.crypto.tink.shaded.protobuf.C9525h) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.g(r10, r3)
            goto L_0x0076
        L_0x0108:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.R(r10, r3)
            goto L_0x0076
        L_0x0110:
            boolean r3 = r0.J(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            r3 = 1
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.d(r10, r3)
            goto L_0x0076
        L_0x011d:
            boolean r3 = r0.J(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            r3 = 0
            int r4 = com.google.crypto.tink.shaded.protobuf.C9528k.m(r10, r3)
            goto L_0x00ae
        L_0x0129:
            boolean r9 = r0.J(r1, r10, r5)
            if (r9 == 0) goto L_0x0077
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.o(r10, r3)
            goto L_0x0076
        L_0x0135:
            boolean r3 = r0.J(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            int r3 = c0(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.v(r10, r3)
            goto L_0x0076
        L_0x0145:
            boolean r3 = r0.J(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            long r3 = d0(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.W(r10, r3)
            goto L_0x0076
        L_0x0155:
            boolean r3 = r0.J(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            long r3 = d0(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.x(r10, r3)
            goto L_0x0076
        L_0x0165:
            boolean r3 = r0.J(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.q(r10, r9)
            goto L_0x0076
        L_0x0171:
            boolean r3 = r0.J(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            r3 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.i(r10, r3)
            goto L_0x0076
        L_0x017f:
            com.google.crypto.tink.shaded.protobuf.M r3 = r0.f67957q
            java.lang.Object r4 = r2.getObject(r1, r13)
            java.lang.Object r9 = r0.u(r5)
            int r3 = r3.g(r10, r4, r9)
            goto L_0x0076
        L_0x018f:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.crypto.tink.shaded.protobuf.h0 r4 = r0.v(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.j(r10, r3, r4)
            goto L_0x0076
        L_0x019f:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.t(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f67949i
            if (r4 == 0) goto L_0x01b3
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x01b3:
            int r4 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r3)
        L_0x01bb:
            int r4 = r4 + r9
            int r4 = r4 + r3
            goto L_0x00ae
        L_0x01bf:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.r(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f67949i
            if (r4 == 0) goto L_0x01d3
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x01d3:
            int r4 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r3)
            goto L_0x01bb
        L_0x01dc:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.i(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f67949i
            if (r4 == 0) goto L_0x01f0
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x01f0:
            int r4 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r3)
            goto L_0x01bb
        L_0x01f9:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.g(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f67949i
            if (r4 == 0) goto L_0x020d
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x020d:
            int r4 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r3)
            goto L_0x01bb
        L_0x0216:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.e(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f67949i
            if (r4 == 0) goto L_0x022a
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x022a:
            int r4 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r3)
            goto L_0x01bb
        L_0x0233:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.w(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f67949i
            if (r4 == 0) goto L_0x0247
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x0247:
            int r4 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r3)
            goto L_0x01bb
        L_0x0251:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.b(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f67949i
            if (r4 == 0) goto L_0x0265
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x0265:
            int r4 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r3)
            goto L_0x01bb
        L_0x026f:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.g(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f67949i
            if (r4 == 0) goto L_0x0283
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x0283:
            int r4 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r3)
            goto L_0x01bb
        L_0x028d:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.i(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f67949i
            if (r4 == 0) goto L_0x02a1
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x02a1:
            int r4 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r3)
            goto L_0x01bb
        L_0x02ab:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.l(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f67949i
            if (r4 == 0) goto L_0x02bf
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x02bf:
            int r4 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r3)
            goto L_0x01bb
        L_0x02c9:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.y(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f67949i
            if (r4 == 0) goto L_0x02dd
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x02dd:
            int r4 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r3)
            goto L_0x01bb
        L_0x02e7:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.n(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f67949i
            if (r4 == 0) goto L_0x02fb
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x02fb:
            int r4 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r3)
            goto L_0x01bb
        L_0x0305:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.g(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f67949i
            if (r4 == 0) goto L_0x0319
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x0319:
            int r4 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r3)
            goto L_0x01bb
        L_0x0323:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.i(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f67949i
            if (r4 == 0) goto L_0x0337
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x0337:
            int r4 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r3)
            goto L_0x01bb
        L_0x0341:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.s(r10, r3, r4)
        L_0x034c:
            int r6 = r6 + r3
            r11 = r4
            goto L_0x051b
        L_0x0350:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.q(r10, r3, r4)
            goto L_0x034c
        L_0x035c:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.h(r10, r3, r4)
            goto L_0x034c
        L_0x0368:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.f(r10, r3, r4)
            goto L_0x034c
        L_0x0374:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.d(r10, r3, r4)
            goto L_0x034c
        L_0x0380:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.v(r10, r3, r4)
            goto L_0x0076
        L_0x038d:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.c(r10, r3)
            goto L_0x0076
        L_0x0399:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.crypto.tink.shaded.protobuf.h0 r4 = r0.v(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.p(r10, r3, r4)
            goto L_0x0076
        L_0x03a9:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.u(r10, r3)
            goto L_0x0076
        L_0x03b5:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.a(r10, r3, r4)
            goto L_0x034c
        L_0x03c1:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.f(r10, r3, r4)
            goto L_0x034c
        L_0x03ce:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.h(r10, r3, r4)
            goto L_0x034c
        L_0x03db:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.k(r10, r3, r4)
            goto L_0x034c
        L_0x03e8:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.x(r10, r3, r4)
            goto L_0x034c
        L_0x03f5:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.m(r10, r3, r4)
            goto L_0x034c
        L_0x0402:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.f(r10, r3, r4)
            goto L_0x034c
        L_0x040f:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.h(r10, r3, r4)
            goto L_0x0076
        L_0x041c:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.S r3 = (com.google.crypto.tink.shaded.protobuf.S) r3
            com.google.crypto.tink.shaded.protobuf.h0 r4 = r0.v(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.s(r10, r3, r4)
            goto L_0x0076
        L_0x0430:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.P(r10, r3)
            goto L_0x0076
        L_0x043e:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.N(r10, r3)
            goto L_0x0076
        L_0x044c:
            r11 = r8 & r15
            if (r11 == 0) goto L_0x0077
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.L(r10, r3)
            goto L_0x0076
        L_0x0456:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            r3 = 0
            int r4 = com.google.crypto.tink.shaded.protobuf.C9528k.J(r10, r3)
            goto L_0x00ae
        L_0x0461:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.k(r10, r3)
            goto L_0x0076
        L_0x046f:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.U(r10, r3)
            goto L_0x0076
        L_0x047d:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.h r3 = (com.google.crypto.tink.shaded.protobuf.C9525h) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.g(r10, r3)
            goto L_0x0076
        L_0x048d:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.h0 r4 = r0.v(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.j0.o(r10, r3, r4)
            goto L_0x0076
        L_0x049f:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.crypto.tink.shaded.protobuf.C9525h
            if (r4 == 0) goto L_0x04b3
            com.google.crypto.tink.shaded.protobuf.h r3 = (com.google.crypto.tink.shaded.protobuf.C9525h) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.g(r10, r3)
            goto L_0x0076
        L_0x04b3:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.R(r10, r3)
            goto L_0x0076
        L_0x04bb:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            r3 = 1
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.d(r10, r3)
            goto L_0x0076
        L_0x04c6:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            r11 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.m(r10, r11)
        L_0x04cf:
            int r6 = r6 + r3
            goto L_0x051b
        L_0x04d1:
            r11 = 0
            r9 = r8 & r15
            if (r9 == 0) goto L_0x051b
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.o(r10, r3)
            goto L_0x04cf
        L_0x04db:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x051b
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.v(r10, r3)
            goto L_0x04cf
        L_0x04e9:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x051b
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.W(r10, r3)
            goto L_0x04cf
        L_0x04f7:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x051b
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.x(r10, r3)
            goto L_0x04cf
        L_0x0505:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x051b
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.q(r10, r9)
            goto L_0x04cf
        L_0x050f:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x051b
            r3 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.C9528k.i(r10, r3)
            goto L_0x04cf
        L_0x051b:
            int r5 = r5 + 3
            r4 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000d
        L_0x0522:
            com.google.crypto.tink.shaded.protobuf.o0<?, ?> r2 = r0.f67955o
            int r2 = r0.z(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f67946f
            if (r2 == 0) goto L_0x0538
            com.google.crypto.tink.shaded.protobuf.q<?> r2 = r0.f67956p
            com.google.crypto.tink.shaded.protobuf.u r1 = r2.c(r1)
            int r1 = r1.l()
            int r6 = r6 + r1
        L_0x0538:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.V.x(java.lang.Object):int");
    }

    private int x0(int i10) {
        return this.f67941a[i10 + 1];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int y(T r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f67940s
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x0008:
            int[] r6 = r0.f67941a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x04ed
            int r6 = r15.x0(r4)
            int r7 = w0(r6)
            int r8 = r15.X(r4)
            long r9 = Y(r6)
            com.google.crypto.tink.shaded.protobuf.v r6 = com.google.crypto.tink.shaded.protobuf.C9538v.DOUBLE_LIST_PACKED
            int r6 = r6.a()
            if (r7 < r6) goto L_0x0038
            com.google.crypto.tink.shaded.protobuf.v r6 = com.google.crypto.tink.shaded.protobuf.C9538v.SINT64_LIST_PACKED
            int r6 = r6.a()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.f67941a
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L_0x0039
        L_0x0038:
            r6 = r3
        L_0x0039:
            r13 = 0
            r14 = 1
            r11 = 0
            switch(r7) {
                case 0: goto L_0x04db;
                case 1: goto L_0x04cf;
                case 2: goto L_0x04bf;
                case 3: goto L_0x04af;
                case 4: goto L_0x049f;
                case 5: goto L_0x0493;
                case 6: goto L_0x0487;
                case 7: goto L_0x047b;
                case 8: goto L_0x045d;
                case 9: goto L_0x0449;
                case 10: goto L_0x0437;
                case 11: goto L_0x0427;
                case 12: goto L_0x0417;
                case 13: goto L_0x040b;
                case 14: goto L_0x03ff;
                case 15: goto L_0x03ef;
                case 16: goto L_0x03df;
                case 17: goto L_0x03c9;
                case 18: goto L_0x03bf;
                case 19: goto L_0x03b5;
                case 20: goto L_0x03ab;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0397;
                case 23: goto L_0x038d;
                case 24: goto L_0x0383;
                case 25: goto L_0x0379;
                case 26: goto L_0x036f;
                case 27: goto L_0x0361;
                case 28: goto L_0x0357;
                case 29: goto L_0x034d;
                case 30: goto L_0x0343;
                case 31: goto L_0x0339;
                case 32: goto L_0x032f;
                case 33: goto L_0x0325;
                case 34: goto L_0x031b;
                case 35: goto L_0x02fd;
                case 36: goto L_0x02df;
                case 37: goto L_0x02c1;
                case 38: goto L_0x02a3;
                case 39: goto L_0x0285;
                case 40: goto L_0x0267;
                case 41: goto L_0x0249;
                case 42: goto L_0x022b;
                case 43: goto L_0x020d;
                case 44: goto L_0x01f0;
                case 45: goto L_0x01d3;
                case 46: goto L_0x01b6;
                case 47: goto L_0x0199;
                case 48: goto L_0x0179;
                case 49: goto L_0x016b;
                case 50: goto L_0x015b;
                case 51: goto L_0x014d;
                case 52: goto L_0x0141;
                case 53: goto L_0x0131;
                case 54: goto L_0x0121;
                case 55: goto L_0x0111;
                case 56: goto L_0x0105;
                case 57: goto L_0x00f9;
                case 58: goto L_0x00ed;
                case 59: goto L_0x00cf;
                case 60: goto L_0x00bc;
                case 61: goto L_0x00ab;
                case 62: goto L_0x009c;
                case 63: goto L_0x008d;
                case 64: goto L_0x0082;
                case 65: goto L_0x0077;
                case 66: goto L_0x0068;
                case 67: goto L_0x0059;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x04e9
        L_0x0042:
            boolean r6 = r15.J(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r1, r9)
            com.google.crypto.tink.shaded.protobuf.S r6 = (com.google.crypto.tink.shaded.protobuf.S) r6
            com.google.crypto.tink.shaded.protobuf.h0 r7 = r15.v(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.s(r8, r6, r7)
        L_0x0056:
            int r5 = r5 + r6
            goto L_0x04e9
        L_0x0059:
            boolean r6 = r15.J(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = d0(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.P(r8, r6)
            goto L_0x0056
        L_0x0068:
            boolean r6 = r15.J(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = c0(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.N(r8, r6)
            goto L_0x0056
        L_0x0077:
            boolean r6 = r15.J(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.L(r8, r11)
            goto L_0x0056
        L_0x0082:
            boolean r6 = r15.J(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.J(r8, r3)
            goto L_0x0056
        L_0x008d:
            boolean r6 = r15.J(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = c0(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.k(r8, r6)
            goto L_0x0056
        L_0x009c:
            boolean r6 = r15.J(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = c0(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.U(r8, r6)
            goto L_0x0056
        L_0x00ab:
            boolean r6 = r15.J(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r1, r9)
            com.google.crypto.tink.shaded.protobuf.h r6 = (com.google.crypto.tink.shaded.protobuf.C9525h) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.g(r8, r6)
            goto L_0x0056
        L_0x00bc:
            boolean r6 = r15.J(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r1, r9)
            com.google.crypto.tink.shaded.protobuf.h0 r7 = r15.v(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.j0.o(r8, r6, r7)
            goto L_0x0056
        L_0x00cf:
            boolean r6 = r15.J(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r1, r9)
            boolean r7 = r6 instanceof com.google.crypto.tink.shaded.protobuf.C9525h
            if (r7 == 0) goto L_0x00e5
            com.google.crypto.tink.shaded.protobuf.h r6 = (com.google.crypto.tink.shaded.protobuf.C9525h) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.g(r8, r6)
            goto L_0x0056
        L_0x00e5:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.R(r8, r6)
            goto L_0x0056
        L_0x00ed:
            boolean r6 = r15.J(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.d(r8, r14)
            goto L_0x0056
        L_0x00f9:
            boolean r6 = r15.J(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.m(r8, r3)
            goto L_0x0056
        L_0x0105:
            boolean r6 = r15.J(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.o(r8, r11)
            goto L_0x0056
        L_0x0111:
            boolean r6 = r15.J(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = c0(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.v(r8, r6)
            goto L_0x0056
        L_0x0121:
            boolean r6 = r15.J(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = d0(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.W(r8, r6)
            goto L_0x0056
        L_0x0131:
            boolean r6 = r15.J(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = d0(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.x(r8, r6)
            goto L_0x0056
        L_0x0141:
            boolean r6 = r15.J(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.q(r8, r13)
            goto L_0x0056
        L_0x014d:
            boolean r6 = r15.J(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            r6 = 0
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.i(r8, r6)
            goto L_0x0056
        L_0x015b:
            com.google.crypto.tink.shaded.protobuf.M r6 = r0.f67957q
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.s0.C(r1, r9)
            java.lang.Object r9 = r15.u(r4)
            int r6 = r6.g(r8, r7, r9)
            goto L_0x0056
        L_0x016b:
            java.util.List r6 = L(r1, r9)
            com.google.crypto.tink.shaded.protobuf.h0 r7 = r15.v(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.j0.j(r8, r6, r7)
            goto L_0x0056
        L_0x0179:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.j0.t(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f67949i
            if (r9 == 0) goto L_0x018d
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x018d:
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r7)
        L_0x0195:
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x0056
        L_0x0199:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.j0.r(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f67949i
            if (r9 == 0) goto L_0x01ad
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01ad:
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r7)
            goto L_0x0195
        L_0x01b6:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.j0.i(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f67949i
            if (r9 == 0) goto L_0x01ca
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01ca:
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r7)
            goto L_0x0195
        L_0x01d3:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.j0.g(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f67949i
            if (r9 == 0) goto L_0x01e7
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01e7:
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r7)
            goto L_0x0195
        L_0x01f0:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.j0.e(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f67949i
            if (r9 == 0) goto L_0x0204
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0204:
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r7)
            goto L_0x0195
        L_0x020d:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.j0.w(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f67949i
            if (r9 == 0) goto L_0x0221
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0221:
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r7)
            goto L_0x0195
        L_0x022b:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.j0.b(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f67949i
            if (r9 == 0) goto L_0x023f
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x023f:
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r7)
            goto L_0x0195
        L_0x0249:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.j0.g(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f67949i
            if (r9 == 0) goto L_0x025d
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x025d:
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r7)
            goto L_0x0195
        L_0x0267:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.j0.i(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f67949i
            if (r9 == 0) goto L_0x027b
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x027b:
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r7)
            goto L_0x0195
        L_0x0285:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.j0.l(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f67949i
            if (r9 == 0) goto L_0x0299
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0299:
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r7)
            goto L_0x0195
        L_0x02a3:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.j0.y(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f67949i
            if (r9 == 0) goto L_0x02b7
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02b7:
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r7)
            goto L_0x0195
        L_0x02c1:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.j0.n(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f67949i
            if (r9 == 0) goto L_0x02d5
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02d5:
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r7)
            goto L_0x0195
        L_0x02df:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.j0.g(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f67949i
            if (r9 == 0) goto L_0x02f3
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02f3:
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r7)
            goto L_0x0195
        L_0x02fd:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.j0.i(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f67949i
            if (r9 == 0) goto L_0x0311
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0311:
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.T(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.C9528k.V(r7)
            goto L_0x0195
        L_0x031b:
            java.util.List r6 = L(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.j0.s(r8, r6, r3)
            goto L_0x0056
        L_0x0325:
            java.util.List r6 = L(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.j0.q(r8, r6, r3)
            goto L_0x0056
        L_0x032f:
            java.util.List r6 = L(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.j0.h(r8, r6, r3)
            goto L_0x0056
        L_0x0339:
            java.util.List r6 = L(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.j0.f(r8, r6, r3)
            goto L_0x0056
        L_0x0343:
            java.util.List r6 = L(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.j0.d(r8, r6, r3)
            goto L_0x0056
        L_0x034d:
            java.util.List r6 = L(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.j0.v(r8, r6, r3)
            goto L_0x0056
        L_0x0357:
            java.util.List r6 = L(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.j0.c(r8, r6)
            goto L_0x0056
        L_0x0361:
            java.util.List r6 = L(r1, r9)
            com.google.crypto.tink.shaded.protobuf.h0 r7 = r15.v(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.j0.p(r8, r6, r7)
            goto L_0x0056
        L_0x036f:
            java.util.List r6 = L(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.j0.u(r8, r6)
            goto L_0x0056
        L_0x0379:
            java.util.List r6 = L(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.j0.a(r8, r6, r3)
            goto L_0x0056
        L_0x0383:
            java.util.List r6 = L(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.j0.f(r8, r6, r3)
            goto L_0x0056
        L_0x038d:
            java.util.List r6 = L(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.j0.h(r8, r6, r3)
            goto L_0x0056
        L_0x0397:
            java.util.List r6 = L(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.j0.k(r8, r6, r3)
            goto L_0x0056
        L_0x03a1:
            java.util.List r6 = L(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.j0.x(r8, r6, r3)
            goto L_0x0056
        L_0x03ab:
            java.util.List r6 = L(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.j0.m(r8, r6, r3)
            goto L_0x0056
        L_0x03b5:
            java.util.List r6 = L(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.j0.f(r8, r6, r3)
            goto L_0x0056
        L_0x03bf:
            java.util.List r6 = L(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.j0.h(r8, r6, r3)
            goto L_0x0056
        L_0x03c9:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r1, r9)
            com.google.crypto.tink.shaded.protobuf.S r6 = (com.google.crypto.tink.shaded.protobuf.S) r6
            com.google.crypto.tink.shaded.protobuf.h0 r7 = r15.v(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.s(r8, r6, r7)
            goto L_0x0056
        L_0x03df:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = com.google.crypto.tink.shaded.protobuf.s0.A(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.P(r8, r6)
            goto L_0x0056
        L_0x03ef:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.crypto.tink.shaded.protobuf.s0.z(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.N(r8, r6)
            goto L_0x0056
        L_0x03ff:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.L(r8, r11)
            goto L_0x0056
        L_0x040b:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.J(r8, r3)
            goto L_0x0056
        L_0x0417:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.crypto.tink.shaded.protobuf.s0.z(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.k(r8, r6)
            goto L_0x0056
        L_0x0427:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.crypto.tink.shaded.protobuf.s0.z(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.U(r8, r6)
            goto L_0x0056
        L_0x0437:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r1, r9)
            com.google.crypto.tink.shaded.protobuf.h r6 = (com.google.crypto.tink.shaded.protobuf.C9525h) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.g(r8, r6)
            goto L_0x0056
        L_0x0449:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r1, r9)
            com.google.crypto.tink.shaded.protobuf.h0 r7 = r15.v(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.j0.o(r8, r6, r7)
            goto L_0x0056
        L_0x045d:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r1, r9)
            boolean r7 = r6 instanceof com.google.crypto.tink.shaded.protobuf.C9525h
            if (r7 == 0) goto L_0x0473
            com.google.crypto.tink.shaded.protobuf.h r6 = (com.google.crypto.tink.shaded.protobuf.C9525h) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.g(r8, r6)
            goto L_0x0056
        L_0x0473:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.R(r8, r6)
            goto L_0x0056
        L_0x047b:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.d(r8, r14)
            goto L_0x0056
        L_0x0487:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.m(r8, r3)
            goto L_0x0056
        L_0x0493:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.o(r8, r11)
            goto L_0x0056
        L_0x049f:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.crypto.tink.shaded.protobuf.s0.z(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.v(r8, r6)
            goto L_0x0056
        L_0x04af:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = com.google.crypto.tink.shaded.protobuf.s0.A(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.W(r8, r6)
            goto L_0x0056
        L_0x04bf:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = com.google.crypto.tink.shaded.protobuf.s0.A(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.x(r8, r6)
            goto L_0x0056
        L_0x04cf:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.q(r8, r13)
            goto L_0x0056
        L_0x04db:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x04e9
            r6 = 0
            int r6 = com.google.crypto.tink.shaded.protobuf.C9528k.i(r8, r6)
            goto L_0x0056
        L_0x04e9:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x04ed:
            com.google.crypto.tink.shaded.protobuf.o0<?, ?> r2 = r0.f67955o
            int r1 = r15.z(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.V.y(java.lang.Object):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void y0(T r18, com.google.crypto.tink.shaded.protobuf.v0 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f67946f
            if (r3 == 0) goto L_0x0021
            com.google.crypto.tink.shaded.protobuf.q<?> r3 = r0.f67956p
            com.google.crypto.tink.shaded.protobuf.u r3 = r3.c(r1)
            boolean r5 = r3.m()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.s()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f67941a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f67940s
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r8
            r10 = 0
            r12 = 0
        L_0x002e:
            if (r10 >= r6) goto L_0x048d
            int r13 = r0.x0(r10)
            int r14 = r0.X(r10)
            int r15 = w0(r13)
            r4 = 17
            if (r15 > r4) goto L_0x0056
            int[] r4 = r0.f67941a
            int r16 = r10 + 2
            r4 = r4[r16]
            r9 = r4 & r8
            if (r9 == r11) goto L_0x0050
            long r11 = (long) r9
            int r12 = r7.getInt(r1, r11)
            r11 = r9
        L_0x0050:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            if (r5 == 0) goto L_0x0075
            com.google.crypto.tink.shaded.protobuf.q<?> r9 = r0.f67956p
            int r9 = r9.a(r5)
            if (r9 > r14) goto L_0x0075
            com.google.crypto.tink.shaded.protobuf.q<?> r9 = r0.f67956p
            r9.j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0073
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0057
        L_0x0073:
            r5 = 0
            goto L_0x0057
        L_0x0075:
            long r8 = Y(r13)
            switch(r15) {
                case 0: goto L_0x047b;
                case 1: goto L_0x046f;
                case 2: goto L_0x0463;
                case 3: goto L_0x0457;
                case 4: goto L_0x044b;
                case 5: goto L_0x043f;
                case 6: goto L_0x0433;
                case 7: goto L_0x0427;
                case 8: goto L_0x041b;
                case 9: goto L_0x040a;
                case 10: goto L_0x03fb;
                case 11: goto L_0x03ee;
                case 12: goto L_0x03e1;
                case 13: goto L_0x03d4;
                case 14: goto L_0x03c7;
                case 15: goto L_0x03ba;
                case 16: goto L_0x03ad;
                case 17: goto L_0x039c;
                case 18: goto L_0x038c;
                case 19: goto L_0x037c;
                case 20: goto L_0x036c;
                case 21: goto L_0x035c;
                case 22: goto L_0x034c;
                case 23: goto L_0x033c;
                case 24: goto L_0x032c;
                case 25: goto L_0x031c;
                case 26: goto L_0x030d;
                case 27: goto L_0x02fa;
                case 28: goto L_0x02eb;
                case 29: goto L_0x02db;
                case 30: goto L_0x02cb;
                case 31: goto L_0x02bb;
                case 32: goto L_0x02ab;
                case 33: goto L_0x029b;
                case 34: goto L_0x028b;
                case 35: goto L_0x027b;
                case 36: goto L_0x026b;
                case 37: goto L_0x025b;
                case 38: goto L_0x024b;
                case 39: goto L_0x023b;
                case 40: goto L_0x022b;
                case 41: goto L_0x021b;
                case 42: goto L_0x020b;
                case 43: goto L_0x01fb;
                case 44: goto L_0x01eb;
                case 45: goto L_0x01db;
                case 46: goto L_0x01cb;
                case 47: goto L_0x01bb;
                case 48: goto L_0x01ab;
                case 49: goto L_0x0198;
                case 50: goto L_0x018f;
                case 51: goto L_0x0180;
                case 52: goto L_0x0171;
                case 53: goto L_0x0162;
                case 54: goto L_0x0153;
                case 55: goto L_0x0144;
                case 56: goto L_0x0135;
                case 57: goto L_0x0126;
                case 58: goto L_0x0117;
                case 59: goto L_0x0108;
                case 60: goto L_0x00f5;
                case 61: goto L_0x00e5;
                case 62: goto L_0x00d7;
                case 63: goto L_0x00c9;
                case 64: goto L_0x00bb;
                case 65: goto L_0x00ad;
                case 66: goto L_0x009f;
                case 67: goto L_0x0091;
                case 68: goto L_0x007f;
                default: goto L_0x007c;
            }
        L_0x007c:
            r13 = 0
            goto L_0x0486
        L_0x007f:
            boolean r4 = r0.J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.h0 r8 = r0.v(r10)
            r2.K(r14, r4, r8)
            goto L_0x007c
        L_0x0091:
            boolean r4 = r0.J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = d0(r1, r8)
            r2.m(r14, r8)
            goto L_0x007c
        L_0x009f:
            boolean r4 = r0.J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = c0(r1, r8)
            r2.H(r14, r4)
            goto L_0x007c
        L_0x00ad:
            boolean r4 = r0.J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = d0(r1, r8)
            r2.i(r14, r8)
            goto L_0x007c
        L_0x00bb:
            boolean r4 = r0.J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = c0(r1, r8)
            r2.w(r14, r4)
            goto L_0x007c
        L_0x00c9:
            boolean r4 = r0.J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = c0(r1, r8)
            r2.E(r14, r4)
            goto L_0x007c
        L_0x00d7:
            boolean r4 = r0.J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = c0(r1, r8)
            r2.o(r14, r4)
            goto L_0x007c
        L_0x00e5:
            boolean r4 = r0.J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.h r4 = (com.google.crypto.tink.shaded.protobuf.C9525h) r4
            r2.M(r14, r4)
            goto L_0x007c
        L_0x00f5:
            boolean r4 = r0.J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.h0 r8 = r0.v(r10)
            r2.N(r14, r4, r8)
            goto L_0x007c
        L_0x0108:
            boolean r4 = r0.J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.C0(r14, r4, r2)
            goto L_0x007c
        L_0x0117:
            boolean r4 = r0.J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            boolean r4 = Z(r1, r8)
            r2.v(r14, r4)
            goto L_0x007c
        L_0x0126:
            boolean r4 = r0.J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = c0(r1, r8)
            r2.c(r14, r4)
            goto L_0x007c
        L_0x0135:
            boolean r4 = r0.J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = d0(r1, r8)
            r2.s(r14, r8)
            goto L_0x007c
        L_0x0144:
            boolean r4 = r0.J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = c0(r1, r8)
            r2.h(r14, r4)
            goto L_0x007c
        L_0x0153:
            boolean r4 = r0.J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = d0(r1, r8)
            r2.f(r14, r8)
            goto L_0x007c
        L_0x0162:
            boolean r4 = r0.J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = d0(r1, r8)
            r2.u(r14, r8)
            goto L_0x007c
        L_0x0171:
            boolean r4 = r0.J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            float r4 = b0(r1, r8)
            r2.B(r14, r4)
            goto L_0x007c
        L_0x0180:
            boolean r4 = r0.J(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            double r8 = a0(r1, r8)
            r2.p(r14, r8)
            goto L_0x007c
        L_0x018f:
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.B0(r2, r14, r4, r10)
            goto L_0x007c
        L_0x0198:
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.h0 r9 = r0.v(r10)
            com.google.crypto.tink.shaded.protobuf.j0.U(r4, r8, r2, r9)
            goto L_0x007c
        L_0x01ab:
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.crypto.tink.shaded.protobuf.j0.b0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01bb:
            r13 = 1
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.a0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01cb:
            r13 = 1
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.Z(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01db:
            r13 = 1
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.Y(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01eb:
            r13 = 1
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.Q(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01fb:
            r13 = 1
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.d0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x020b:
            r13 = 1
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.N(r4, r8, r2, r13)
            goto L_0x007c
        L_0x021b:
            r13 = 1
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.R(r4, r8, r2, r13)
            goto L_0x007c
        L_0x022b:
            r13 = 1
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.S(r4, r8, r2, r13)
            goto L_0x007c
        L_0x023b:
            r13 = 1
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.V(r4, r8, r2, r13)
            goto L_0x007c
        L_0x024b:
            r13 = 1
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.e0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x025b:
            r13 = 1
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.W(r4, r8, r2, r13)
            goto L_0x007c
        L_0x026b:
            r13 = 1
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.T(r4, r8, r2, r13)
            goto L_0x007c
        L_0x027b:
            r13 = 1
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.P(r4, r8, r2, r13)
            goto L_0x007c
        L_0x028b:
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.crypto.tink.shaded.protobuf.j0.b0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x029b:
            r13 = 0
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.a0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02ab:
            r13 = 0
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.Z(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02bb:
            r13 = 0
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.Y(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02cb:
            r13 = 0
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.Q(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02db:
            r13 = 0
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.d0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02eb:
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.O(r4, r8, r2)
            goto L_0x007c
        L_0x02fa:
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.h0 r9 = r0.v(r10)
            com.google.crypto.tink.shaded.protobuf.j0.X(r4, r8, r2, r9)
            goto L_0x007c
        L_0x030d:
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.c0(r4, r8, r2)
            goto L_0x007c
        L_0x031c:
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.crypto.tink.shaded.protobuf.j0.N(r4, r8, r2, r13)
            goto L_0x0486
        L_0x032c:
            r13 = 0
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.R(r4, r8, r2, r13)
            goto L_0x0486
        L_0x033c:
            r13 = 0
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.S(r4, r8, r2, r13)
            goto L_0x0486
        L_0x034c:
            r13 = 0
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.V(r4, r8, r2, r13)
            goto L_0x0486
        L_0x035c:
            r13 = 0
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.e0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x036c:
            r13 = 0
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.W(r4, r8, r2, r13)
            goto L_0x0486
        L_0x037c:
            r13 = 0
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.T(r4, r8, r2, r13)
            goto L_0x0486
        L_0x038c:
            r13 = 0
            int r4 = r0.X(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0.P(r4, r8, r2, r13)
            goto L_0x0486
        L_0x039c:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.h0 r8 = r0.v(r10)
            r2.K(r14, r4, r8)
            goto L_0x0486
        L_0x03ad:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.m(r14, r8)
            goto L_0x0486
        L_0x03ba:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.H(r14, r4)
            goto L_0x0486
        L_0x03c7:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.i(r14, r8)
            goto L_0x0486
        L_0x03d4:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.w(r14, r4)
            goto L_0x0486
        L_0x03e1:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.E(r14, r4)
            goto L_0x0486
        L_0x03ee:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.o(r14, r4)
            goto L_0x0486
        L_0x03fb:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.h r4 = (com.google.crypto.tink.shaded.protobuf.C9525h) r4
            r2.M(r14, r4)
            goto L_0x0486
        L_0x040a:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.h0 r8 = r0.v(r10)
            r2.N(r14, r4, r8)
            goto L_0x0486
        L_0x041b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.C0(r14, r4, r2)
            goto L_0x0486
        L_0x0427:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            boolean r4 = l(r1, r8)
            r2.v(r14, r4)
            goto L_0x0486
        L_0x0433:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.c(r14, r4)
            goto L_0x0486
        L_0x043f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.s(r14, r8)
            goto L_0x0486
        L_0x044b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.h(r14, r4)
            goto L_0x0486
        L_0x0457:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.f(r14, r8)
            goto L_0x0486
        L_0x0463:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.u(r14, r8)
            goto L_0x0486
        L_0x046f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            float r4 = s(r1, r8)
            r2.B(r14, r4)
            goto L_0x0486
        L_0x047b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            double r8 = o(r1, r8)
            r2.p(r14, r8)
        L_0x0486:
            int r10 = r10 + 3
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x002e
        L_0x048d:
            if (r5 == 0) goto L_0x04a4
            com.google.crypto.tink.shaded.protobuf.q<?> r4 = r0.f67956p
            r4.j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a2
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x048d
        L_0x04a2:
            r5 = 0
            goto L_0x048d
        L_0x04a4:
            com.google.crypto.tink.shaded.protobuf.o0<?, ?> r3 = r0.f67955o
            r0.D0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.V.y0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.v0):void");
    }

    private <UT, UB> int z(o0<UT, UB> o0Var, T t10) {
        return o0Var.h(o0Var.g(t10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void z0(T r13, com.google.crypto.tink.shaded.protobuf.v0 r14) {
        /*
            r12 = this;
            boolean r0 = r12.f67946f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            com.google.crypto.tink.shaded.protobuf.q<?> r0 = r12.f67956p
            com.google.crypto.tink.shaded.protobuf.u r0 = r0.c(r13)
            boolean r2 = r0.m()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.s()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.f67941a
            int r3 = r3.length
            r4 = 0
            r5 = r4
        L_0x0023:
            if (r5 >= r3) goto L_0x0586
            int r6 = r12.x0(r5)
            int r7 = r12.X(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            com.google.crypto.tink.shaded.protobuf.q<?> r8 = r12.f67956p
            int r8 = r8.a(r2)
            if (r8 > r7) goto L_0x004b
            com.google.crypto.tink.shaded.protobuf.q<?> r8 = r12.f67956p
            r8.j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = w0(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0571;
                case 1: goto L_0x055f;
                case 2: goto L_0x054d;
                case 3: goto L_0x053b;
                case 4: goto L_0x0529;
                case 5: goto L_0x0517;
                case 6: goto L_0x0505;
                case 7: goto L_0x04f2;
                case 8: goto L_0x04df;
                case 9: goto L_0x04c8;
                case 10: goto L_0x04b3;
                case 11: goto L_0x04a0;
                case 12: goto L_0x048d;
                case 13: goto L_0x047a;
                case 14: goto L_0x0467;
                case 15: goto L_0x0454;
                case 16: goto L_0x0441;
                case 17: goto L_0x042a;
                case 18: goto L_0x0417;
                case 19: goto L_0x0404;
                case 20: goto L_0x03f1;
                case 21: goto L_0x03de;
                case 22: goto L_0x03cb;
                case 23: goto L_0x03b8;
                case 24: goto L_0x03a5;
                case 25: goto L_0x0392;
                case 26: goto L_0x037f;
                case 27: goto L_0x0368;
                case 28: goto L_0x0355;
                case 29: goto L_0x0342;
                case 30: goto L_0x032f;
                case 31: goto L_0x031c;
                case 32: goto L_0x0309;
                case 33: goto L_0x02f6;
                case 34: goto L_0x02e3;
                case 35: goto L_0x02d0;
                case 36: goto L_0x02bd;
                case 37: goto L_0x02aa;
                case 38: goto L_0x0297;
                case 39: goto L_0x0284;
                case 40: goto L_0x0271;
                case 41: goto L_0x025e;
                case 42: goto L_0x024b;
                case 43: goto L_0x0238;
                case 44: goto L_0x0225;
                case 45: goto L_0x0212;
                case 46: goto L_0x01ff;
                case 47: goto L_0x01ec;
                case 48: goto L_0x01d9;
                case 49: goto L_0x01c2;
                case 50: goto L_0x01b5;
                case 51: goto L_0x01a2;
                case 52: goto L_0x018f;
                case 53: goto L_0x017c;
                case 54: goto L_0x0169;
                case 55: goto L_0x0156;
                case 56: goto L_0x0143;
                case 57: goto L_0x0130;
                case 58: goto L_0x011d;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f3;
                case 61: goto L_0x00de;
                case 62: goto L_0x00cb;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00a5;
                case 65: goto L_0x0092;
                case 66: goto L_0x007f;
                case 67: goto L_0x006c;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0582
        L_0x0055:
            boolean r8 = r12.J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            com.google.crypto.tink.shaded.protobuf.h0 r8 = r12.v(r5)
            r14.K(r7, r6, r8)
            goto L_0x0582
        L_0x006c:
            boolean r8 = r12.J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            long r8 = d0(r13, r8)
            r14.m(r7, r8)
            goto L_0x0582
        L_0x007f:
            boolean r8 = r12.J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            int r6 = c0(r13, r8)
            r14.H(r7, r6)
            goto L_0x0582
        L_0x0092:
            boolean r8 = r12.J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            long r8 = d0(r13, r8)
            r14.i(r7, r8)
            goto L_0x0582
        L_0x00a5:
            boolean r8 = r12.J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            int r6 = c0(r13, r8)
            r14.w(r7, r6)
            goto L_0x0582
        L_0x00b8:
            boolean r8 = r12.J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            int r6 = c0(r13, r8)
            r14.E(r7, r6)
            goto L_0x0582
        L_0x00cb:
            boolean r8 = r12.J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            int r6 = c0(r13, r8)
            r14.o(r7, r6)
            goto L_0x0582
        L_0x00de:
            boolean r8 = r12.J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            com.google.crypto.tink.shaded.protobuf.h r6 = (com.google.crypto.tink.shaded.protobuf.C9525h) r6
            r14.M(r7, r6)
            goto L_0x0582
        L_0x00f3:
            boolean r8 = r12.J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            com.google.crypto.tink.shaded.protobuf.h0 r8 = r12.v(r5)
            r14.N(r7, r6, r8)
            goto L_0x0582
        L_0x010a:
            boolean r8 = r12.J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            r12.C0(r7, r6, r14)
            goto L_0x0582
        L_0x011d:
            boolean r8 = r12.J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            boolean r6 = Z(r13, r8)
            r14.v(r7, r6)
            goto L_0x0582
        L_0x0130:
            boolean r8 = r12.J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            int r6 = c0(r13, r8)
            r14.c(r7, r6)
            goto L_0x0582
        L_0x0143:
            boolean r8 = r12.J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            long r8 = d0(r13, r8)
            r14.s(r7, r8)
            goto L_0x0582
        L_0x0156:
            boolean r8 = r12.J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            int r6 = c0(r13, r8)
            r14.h(r7, r6)
            goto L_0x0582
        L_0x0169:
            boolean r8 = r12.J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            long r8 = d0(r13, r8)
            r14.f(r7, r8)
            goto L_0x0582
        L_0x017c:
            boolean r8 = r12.J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            long r8 = d0(r13, r8)
            r14.u(r7, r8)
            goto L_0x0582
        L_0x018f:
            boolean r8 = r12.J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            float r6 = b0(r13, r8)
            r14.B(r7, r6)
            goto L_0x0582
        L_0x01a2:
            boolean r8 = r12.J(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            double r8 = a0(r13, r8)
            r14.p(r7, r8)
            goto L_0x0582
        L_0x01b5:
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            r12.B0(r14, r7, r6, r5)
            goto L_0x0582
        L_0x01c2:
            int r7 = r12.X(r5)
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.h0 r8 = r12.v(r5)
            com.google.crypto.tink.shaded.protobuf.j0.U(r7, r6, r14, r8)
            goto L_0x0582
        L_0x01d9:
            int r7 = r12.X(r5)
            long r10 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.b0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ec:
            int r7 = r12.X(r5)
            long r10 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.a0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ff:
            int r7 = r12.X(r5)
            long r10 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.Z(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0212:
            int r7 = r12.X(r5)
            long r10 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.Y(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0225:
            int r7 = r12.X(r5)
            long r10 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.Q(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0238:
            int r7 = r12.X(r5)
            long r10 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.d0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x024b:
            int r7 = r12.X(r5)
            long r10 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.N(r7, r6, r14, r9)
            goto L_0x0582
        L_0x025e:
            int r7 = r12.X(r5)
            long r10 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.R(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0271:
            int r7 = r12.X(r5)
            long r10 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.S(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0284:
            int r7 = r12.X(r5)
            long r10 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.V(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0297:
            int r7 = r12.X(r5)
            long r10 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.e0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02aa:
            int r7 = r12.X(r5)
            long r10 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.W(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02bd:
            int r7 = r12.X(r5)
            long r10 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.T(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02d0:
            int r7 = r12.X(r5)
            long r10 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.P(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02e3:
            int r7 = r12.X(r5)
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.b0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x02f6:
            int r7 = r12.X(r5)
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.a0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0309:
            int r7 = r12.X(r5)
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.Z(r7, r6, r14, r4)
            goto L_0x0582
        L_0x031c:
            int r7 = r12.X(r5)
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.Y(r7, r6, r14, r4)
            goto L_0x0582
        L_0x032f:
            int r7 = r12.X(r5)
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.Q(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0342:
            int r7 = r12.X(r5)
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.d0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0355:
            int r7 = r12.X(r5)
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.O(r7, r6, r14)
            goto L_0x0582
        L_0x0368:
            int r7 = r12.X(r5)
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.h0 r8 = r12.v(r5)
            com.google.crypto.tink.shaded.protobuf.j0.X(r7, r6, r14, r8)
            goto L_0x0582
        L_0x037f:
            int r7 = r12.X(r5)
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.c0(r7, r6, r14)
            goto L_0x0582
        L_0x0392:
            int r7 = r12.X(r5)
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.N(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03a5:
            int r7 = r12.X(r5)
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.R(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03b8:
            int r7 = r12.X(r5)
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.S(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03cb:
            int r7 = r12.X(r5)
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.V(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03de:
            int r7 = r12.X(r5)
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.e0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03f1:
            int r7 = r12.X(r5)
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.W(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0404:
            int r7 = r12.X(r5)
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.T(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0417:
            int r7 = r12.X(r5)
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0.P(r7, r6, r14, r4)
            goto L_0x0582
        L_0x042a:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            com.google.crypto.tink.shaded.protobuf.h0 r8 = r12.v(r5)
            r14.K(r7, r6, r8)
            goto L_0x0582
        L_0x0441:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            long r8 = M(r13, r8)
            r14.m(r7, r8)
            goto L_0x0582
        L_0x0454:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            int r6 = A(r13, r8)
            r14.H(r7, r6)
            goto L_0x0582
        L_0x0467:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            long r8 = M(r13, r8)
            r14.i(r7, r8)
            goto L_0x0582
        L_0x047a:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            int r6 = A(r13, r8)
            r14.w(r7, r6)
            goto L_0x0582
        L_0x048d:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            int r6 = A(r13, r8)
            r14.E(r7, r6)
            goto L_0x0582
        L_0x04a0:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            int r6 = A(r13, r8)
            r14.o(r7, r6)
            goto L_0x0582
        L_0x04b3:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            com.google.crypto.tink.shaded.protobuf.h r6 = (com.google.crypto.tink.shaded.protobuf.C9525h) r6
            r14.M(r7, r6)
            goto L_0x0582
        L_0x04c8:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            com.google.crypto.tink.shaded.protobuf.h0 r8 = r12.v(r5)
            r14.N(r7, r6, r8)
            goto L_0x0582
        L_0x04df:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.s0.C(r13, r8)
            r12.C0(r7, r6, r14)
            goto L_0x0582
        L_0x04f2:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            boolean r6 = l(r13, r8)
            r14.v(r7, r6)
            goto L_0x0582
        L_0x0505:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            int r6 = A(r13, r8)
            r14.c(r7, r6)
            goto L_0x0582
        L_0x0517:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            long r8 = M(r13, r8)
            r14.s(r7, r8)
            goto L_0x0582
        L_0x0529:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            int r6 = A(r13, r8)
            r14.h(r7, r6)
            goto L_0x0582
        L_0x053b:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            long r8 = M(r13, r8)
            r14.f(r7, r8)
            goto L_0x0582
        L_0x054d:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            long r8 = M(r13, r8)
            r14.u(r7, r8)
            goto L_0x0582
        L_0x055f:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            float r6 = s(r13, r8)
            r14.B(r7, r6)
            goto L_0x0582
        L_0x0571:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Y(r6)
            double r8 = o(r13, r8)
            r14.p(r7, r8)
        L_0x0582:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0586:
            if (r2 == 0) goto L_0x059c
            com.google.crypto.tink.shaded.protobuf.q<?> r3 = r12.f67956p
            r3.j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x059a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0586
        L_0x059a:
            r2 = r1
            goto L_0x0586
        L_0x059c:
            com.google.crypto.tink.shaded.protobuf.o0<?, ?> r0 = r12.f67955o
            r12.D0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.V.z0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.v0):void");
    }

    public void a(T t10, T t11) {
        m(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.f67941a.length; i10 += 3) {
            R(t10, t11, i10);
        }
        j0.G(this.f67955o, t10, t11);
        if (this.f67946f) {
            j0.E(this.f67956p, t10, t11);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016b, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0229, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f67941a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022d
            int r3 = r8.x0(r1)
            int r4 = r8.X(r1)
            long r5 = Y(r3)
            int r3 = w0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020d;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f5;
                case 4: goto L_0x01ed;
                case 5: goto L_0x01e1;
                case 6: goto L_0x01d9;
                case 7: goto L_0x01cd;
                case 8: goto L_0x01bf;
                case 9: goto L_0x01b4;
                case 10: goto L_0x01a8;
                case 11: goto L_0x01a0;
                case 12: goto L_0x0198;
                case 13: goto L_0x0190;
                case 14: goto L_0x0184;
                case 15: goto L_0x017c;
                case 16: goto L_0x0170;
                case 17: goto L_0x0161;
                case 18: goto L_0x0155;
                case 19: goto L_0x0155;
                case 20: goto L_0x0155;
                case 21: goto L_0x0155;
                case 22: goto L_0x0155;
                case 23: goto L_0x0155;
                case 24: goto L_0x0155;
                case 25: goto L_0x0155;
                case 26: goto L_0x0155;
                case 27: goto L_0x0155;
                case 28: goto L_0x0155;
                case 29: goto L_0x0155;
                case 30: goto L_0x0155;
                case 31: goto L_0x0155;
                case 32: goto L_0x0155;
                case 33: goto L_0x0155;
                case 34: goto L_0x0155;
                case 35: goto L_0x0155;
                case 36: goto L_0x0155;
                case 37: goto L_0x0155;
                case 38: goto L_0x0155;
                case 39: goto L_0x0155;
                case 40: goto L_0x0155;
                case 41: goto L_0x0155;
                case 42: goto L_0x0155;
                case 43: goto L_0x0155;
                case 44: goto L_0x0155;
                case 45: goto L_0x0155;
                case 46: goto L_0x0155;
                case 47: goto L_0x0155;
                case 48: goto L_0x0155;
                case 49: goto L_0x0155;
                case 50: goto L_0x0149;
                case 51: goto L_0x0133;
                case 52: goto L_0x0121;
                case 53: goto L_0x010f;
                case 54: goto L_0x00fd;
                case 55: goto L_0x00ef;
                case 56: goto L_0x00dd;
                case 57: goto L_0x00cf;
                case 58: goto L_0x00bd;
                case 59: goto L_0x00a9;
                case 60: goto L_0x0098;
                case 61: goto L_0x0087;
                case 62: goto L_0x007a;
                case 63: goto L_0x006d;
                case 64: goto L_0x0060;
                case 65: goto L_0x004f;
                case 66: goto L_0x0042;
                case 67: goto L_0x0031;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0229
        L_0x001e:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.s0.C(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
        L_0x002e:
            int r2 = r2 + r3
            goto L_0x0229
        L_0x0031:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = d0(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.A.f(r3)
            goto L_0x002e
        L_0x0042:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = c0(r9, r5)
            goto L_0x002e
        L_0x004f:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = d0(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.A.f(r3)
            goto L_0x002e
        L_0x0060:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = c0(r9, r5)
            goto L_0x002e
        L_0x006d:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = c0(r9, r5)
            goto L_0x002e
        L_0x007a:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = c0(r9, r5)
            goto L_0x002e
        L_0x0087:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.s0.C(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0098:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.s0.C(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x00a9:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.s0.C(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x00bd:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            boolean r3 = Z(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.A.c(r3)
            goto L_0x002e
        L_0x00cf:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = c0(r9, r5)
            goto L_0x002e
        L_0x00dd:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = d0(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.A.f(r3)
            goto L_0x002e
        L_0x00ef:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = c0(r9, r5)
            goto L_0x002e
        L_0x00fd:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = d0(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.A.f(r3)
            goto L_0x002e
        L_0x010f:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = d0(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.A.f(r3)
            goto L_0x002e
        L_0x0121:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            float r3 = b0(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x002e
        L_0x0133:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            double r3 = a0(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.A.f(r3)
            goto L_0x002e
        L_0x0149:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.s0.C(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0155:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.s0.C(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0161:
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.s0.C(r9, r5)
            if (r3 == 0) goto L_0x016b
            int r7 = r3.hashCode()
        L_0x016b:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0229
        L_0x0170:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.s0.A(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.A.f(r3)
            goto L_0x002e
        L_0x017c:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.s0.z(r9, r5)
            goto L_0x002e
        L_0x0184:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.s0.A(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.A.f(r3)
            goto L_0x002e
        L_0x0190:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.s0.z(r9, r5)
            goto L_0x002e
        L_0x0198:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.s0.z(r9, r5)
            goto L_0x002e
        L_0x01a0:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.s0.z(r9, r5)
            goto L_0x002e
        L_0x01a8:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.s0.C(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x01b4:
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.s0.C(r9, r5)
            if (r3 == 0) goto L_0x016b
            int r7 = r3.hashCode()
            goto L_0x016b
        L_0x01bf:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.s0.C(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x01cd:
            int r2 = r2 * 53
            boolean r3 = com.google.crypto.tink.shaded.protobuf.s0.r(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.A.c(r3)
            goto L_0x002e
        L_0x01d9:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.s0.z(r9, r5)
            goto L_0x002e
        L_0x01e1:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.s0.A(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.A.f(r3)
            goto L_0x002e
        L_0x01ed:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.s0.z(r9, r5)
            goto L_0x002e
        L_0x01f5:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.s0.A(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.A.f(r3)
            goto L_0x002e
        L_0x0201:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.s0.A(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.A.f(r3)
            goto L_0x002e
        L_0x020d:
            int r2 = r2 * 53
            float r3 = com.google.crypto.tink.shaded.protobuf.s0.y(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x002e
        L_0x0219:
            int r2 = r2 * 53
            double r3 = com.google.crypto.tink.shaded.protobuf.s0.x(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.A.f(r3)
            goto L_0x002e
        L_0x0229:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022d:
            int r2 = r2 * 53
            com.google.crypto.tink.shaded.protobuf.o0<?, ?> r0 = r8.f67955o
            java.lang.Object r0 = r0.g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f67946f
            if (r0 == 0) goto L_0x024b
            int r2 = r2 * 53
            com.google.crypto.tink.shaded.protobuf.q<?> r0 = r8.f67956p
            com.google.crypto.tink.shaded.protobuf.u r9 = r0.c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.V.b(java.lang.Object):int");
    }

    public boolean c(T t10, T t11) {
        int length = this.f67941a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!p(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f67955o.g(t10).equals(this.f67955o.g(t11))) {
            return false;
        }
        if (this.f67946f) {
            return this.f67956p.c(t10).equals(this.f67956p.c(t11));
        }
        return true;
    }

    public void d(T t10, byte[] bArr, int i10, int i11, C9522e.b bVar) {
        if (this.f67948h) {
            h0(t10, bArr, i10, i11, bVar);
        } else {
            g0(t10, bArr, i10, i11, 0, bVar);
        }
    }

    public T e() {
        return this.f67953m.a(this.f67945e);
    }

    public void f(T t10) {
        if (H(t10)) {
            if (t10 instanceof C9541y) {
                C9541y yVar = (C9541y) t10;
                yVar.l();
                yVar.k();
                yVar.C();
            }
            int length = this.f67941a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int x02 = x0(i10);
                long Y10 = Y(x02);
                int w02 = w0(x02);
                if (w02 != 9) {
                    switch (w02) {
                        case 17:
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                        case BuildConfig.MIN_SDK_VERSION /*24*/:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case BuildConfig.TARGET_SDK_VERSION /*33*/:
                        case 34:
                        case ImageFormat.YUV_420_888:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f67954n.c(t10, Y10);
                            continue;
                        case 50:
                            Unsafe unsafe = f67940s;
                            Object object = unsafe.getObject(t10, Y10);
                            if (object != null) {
                                unsafe.putObject(t10, Y10, this.f67957q.f(object));
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                if (C(t10, i10)) {
                    v(i10).f(f67940s.getObject(t10, Y10));
                }
            }
            this.f67955o.j(t10);
            if (this.f67946f) {
                this.f67956p.f(t10);
            }
        }
    }

    public final boolean g(T t10) {
        int i10;
        int i11;
        T t11 = t10;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f67951k) {
            int i15 = this.f67950j[i14];
            int X10 = X(i15);
            int x02 = x0(i15);
            int i16 = this.f67941a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = f67940s.getInt(t11, (long) i17);
                }
                i10 = i13;
                i11 = i17;
            } else {
                i11 = i12;
                i10 = i13;
            }
            if (K(x02) && !D(t10, i15, i11, i10, i18)) {
                return false;
            }
            int w02 = w0(x02);
            if (w02 != 9 && w02 != 17) {
                if (w02 != 27) {
                    if (w02 == 60 || w02 == 68) {
                        if (J(t11, X10, i15) && !E(t11, x02, v(i15))) {
                            return false;
                        }
                    } else if (w02 != 49) {
                        if (w02 == 50 && !G(t11, x02, i15)) {
                            return false;
                        }
                    }
                }
                if (!F(t11, x02, i15)) {
                    return false;
                }
            } else if (D(t10, i15, i11, i10, i18) && !E(t11, x02, v(i15))) {
                return false;
            }
            i14++;
            i12 = i11;
            i13 = i10;
        }
        return !this.f67946f || this.f67956p.c(t11).o();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.google.crypto.tink.shaded.protobuf.p0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v48, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v50, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v51, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v86, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x037b, code lost:
        if (r0 != r15) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0397, code lost:
        r2 = r0;
        r8 = r20;
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03cd, code lost:
        if (r0 != r15) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03f0, code lost:
        if (r0 != r15) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009a, code lost:
        r8 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d6, code lost:
        r13 = r4;
        r33 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0120, code lost:
        r1 = r7 | r20;
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0123, code lost:
        r3 = r11;
        r2 = r12;
        r8 = -1;
        r11 = r6;
        r12 = r10;
        r6 = r1;
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012d, code lost:
        r13 = r4;
        r33 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0130, code lost:
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0166, code lost:
        r12 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01ac, code lost:
        r1 = r7 | r20;
        r7 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01b4, code lost:
        r13 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0228, code lost:
        r3 = r11;
        r2 = r12;
        r1 = r24;
        r11 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x022f, code lost:
        r13 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x024d, code lost:
        r0 = r13 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x024f, code lost:
        r6 = r7 | r20;
        r7 = r33;
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02d3, code lost:
        r25 = r33;
        r0 = r35;
        r19 = r7;
        r26 = r9;
        r8 = r11;
        r27 = r12;
        r2 = r13;
        r18 = -1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0426  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int g0(T r31, byte[] r32, int r33, int r34, int r35, com.google.crypto.tink.shaded.protobuf.C9522e.b r36) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r36
            m(r31)
            sun.misc.Unsafe r9 = f67940s
            r16 = 0
            r8 = -1
            r0 = r33
            r1 = r8
            r2 = r16
            r3 = r2
            r6 = r3
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001c:
            if (r0 >= r13) goto L_0x0443
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002d
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.H(r0, r12, r3, r11)
            int r3 = r11.f67973a
            r4 = r0
            r5 = r3
            goto L_0x002f
        L_0x002d:
            r5 = r0
            r4 = r3
        L_0x002f:
            int r3 = r5 >>> 3
            r0 = r5 & 7
            r10 = 3
            if (r3 <= r1) goto L_0x003d
            int r2 = r2 / r10
            int r1 = r15.k0(r3, r2)
        L_0x003b:
            r2 = r1
            goto L_0x0042
        L_0x003d:
            int r1 = r15.j0(r3)
            goto L_0x003b
        L_0x0042:
            if (r2 != r8) goto L_0x0056
            r0 = r35
            r24 = r3
            r2 = r4
            r19 = r6
            r25 = r7
            r18 = r8
            r26 = r9
            r27 = r16
            r8 = r5
            goto L_0x03f3
        L_0x0056:
            int[] r1 = r15.f67941a
            int r18 = r2 + 1
            r1 = r1[r18]
            int r10 = w0(r1)
            long r11 = Y(r1)
            r8 = 17
            r19 = r5
            if (r10 > r8) goto L_0x02e3
            int[] r8 = r15.f67941a
            int r20 = r2 + 2
            r8 = r8[r20]
            int r20 = r8 >>> 20
            r5 = 1
            int r20 = r5 << r20
            r22 = r11
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r8 & r11
            if (r8 == r7) goto L_0x008a
            if (r7 == r11) goto L_0x0083
            long r11 = (long) r7
            r9.putInt(r14, r11, r6)
        L_0x0083:
            long r6 = (long) r8
            int r6 = r9.getInt(r14, r6)
        L_0x0088:
            r7 = r6
            goto L_0x008c
        L_0x008a:
            r8 = r7
            goto L_0x0088
        L_0x008c:
            r6 = 5
            switch(r10) {
                case 0: goto L_0x02ba;
                case 1: goto L_0x02a0;
                case 2: goto L_0x0270;
                case 3: goto L_0x0270;
                case 4: goto L_0x0256;
                case 5: goto L_0x0232;
                case 6: goto L_0x020c;
                case 7: goto L_0x01db;
                case 8: goto L_0x01b7;
                case 9: goto L_0x0186;
                case 10: goto L_0x016e;
                case 11: goto L_0x0256;
                case 12: goto L_0x0133;
                case 13: goto L_0x020c;
                case 14: goto L_0x0232;
                case 15: goto L_0x0106;
                case 16: goto L_0x00da;
                case 17: goto L_0x009e;
                default: goto L_0x0090;
            }
        L_0x0090:
            r10 = r32
            r12 = r2
            r24 = r3
            r13 = r4
            r33 = r8
            r11 = r19
        L_0x009a:
            r8 = r36
            goto L_0x02d3
        L_0x009e:
            r1 = 3
            if (r0 != r1) goto L_0x00cf
            java.lang.Object r10 = r15.S(r14, r2)
            int r0 = r3 << 3
            r5 = r0 | 4
            com.google.crypto.tink.shaded.protobuf.h0 r1 = r15.v(r2)
            r0 = r10
            r12 = r2
            r2 = r32
            r24 = r3
            r3 = r4
            r4 = r34
            r11 = r19
            r6 = r36
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.N(r0, r1, r2, r3, r4, r5, r6)
            r15.u0(r14, r12, r10)
            r6 = r7 | r20
            r7 = r8
            r3 = r11
            r2 = r12
            r1 = r24
            r8 = -1
            r12 = r32
            r11 = r36
            goto L_0x001c
        L_0x00cf:
            r12 = r2
            r24 = r3
            r11 = r19
            r10 = r32
        L_0x00d6:
            r13 = r4
            r33 = r8
            goto L_0x009a
        L_0x00da:
            r12 = r2
            r24 = r3
            r11 = r19
            r10 = r32
            if (r0 != 0) goto L_0x00d6
            r6 = r36
            r2 = r22
            int r19 = com.google.crypto.tink.shaded.protobuf.C9522e.L(r10, r4, r6)
            long r0 = r6.f67974b
            long r4 = com.google.crypto.tink.shaded.protobuf.C9526i.c(r0)
            r0 = r9
            r1 = r31
            r0.putLong(r1, r2, r4)
            r0 = r7 | r20
            r7 = r8
            r3 = r11
            r2 = r12
            r1 = r24
            r8 = -1
            r11 = r6
            r12 = r10
            r6 = r0
            r0 = r19
            goto L_0x001c
        L_0x0106:
            r10 = r32
            r6 = r36
            r12 = r2
            r24 = r3
            r11 = r19
            r2 = r22
            if (r0 != 0) goto L_0x012d
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.I(r10, r4, r6)
            int r1 = r6.f67973a
            int r1 = com.google.crypto.tink.shaded.protobuf.C9526i.b(r1)
            r9.putInt(r14, r2, r1)
        L_0x0120:
            r1 = r7 | r20
            r7 = r8
        L_0x0123:
            r3 = r11
            r2 = r12
            r8 = -1
            r11 = r6
            r12 = r10
            r6 = r1
            r1 = r24
            goto L_0x001c
        L_0x012d:
            r13 = r4
            r33 = r8
        L_0x0130:
            r8 = r6
            goto L_0x02d3
        L_0x0133:
            r10 = r32
            r6 = r36
            r12 = r2
            r24 = r3
            r11 = r19
            r2 = r22
            if (r0 != 0) goto L_0x012d
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.I(r10, r4, r6)
            int r1 = r6.f67973a
            com.google.crypto.tink.shaded.protobuf.A$e r4 = r15.t(r12)
            if (r4 == 0) goto L_0x016a
            boolean r4 = r4.a(r1)
            if (r4 == 0) goto L_0x0153
            goto L_0x016a
        L_0x0153:
            com.google.crypto.tink.shaded.protobuf.p0 r2 = w(r31)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.n(r11, r1)
            r3 = r11
            r2 = r12
            r1 = r24
            r11 = r6
            r6 = r7
            r7 = r8
        L_0x0166:
            r12 = r10
        L_0x0167:
            r8 = -1
            goto L_0x001c
        L_0x016a:
            r9.putInt(r14, r2, r1)
            goto L_0x0120
        L_0x016e:
            r10 = r32
            r6 = r36
            r12 = r2
            r24 = r3
            r11 = r19
            r2 = r22
            r1 = 2
            if (r0 != r1) goto L_0x012d
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.b(r10, r4, r6)
            java.lang.Object r1 = r6.f67975c
            r9.putObject(r14, r2, r1)
            goto L_0x0120
        L_0x0186:
            r10 = r32
            r6 = r36
            r12 = r2
            r24 = r3
            r11 = r19
            r1 = 2
            if (r0 != r1) goto L_0x01b2
            java.lang.Object r5 = r15.S(r14, r12)
            com.google.crypto.tink.shaded.protobuf.h0 r1 = r15.v(r12)
            r0 = r5
            r2 = r32
            r3 = r4
            r4 = r34
            r33 = r8
            r8 = r5
            r5 = r36
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.O(r0, r1, r2, r3, r4, r5)
            r15.u0(r14, r12, r8)
        L_0x01ac:
            r1 = r7 | r20
            r7 = r33
            goto L_0x0123
        L_0x01b2:
            r33 = r8
        L_0x01b4:
            r13 = r4
            goto L_0x0130
        L_0x01b7:
            r10 = r32
            r6 = r36
            r12 = r2
            r24 = r3
            r33 = r8
            r11 = r19
            r2 = r22
            r5 = 2
            if (r0 != r5) goto L_0x01b4
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x01d1
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.C(r10, r4, r6)
            goto L_0x01d5
        L_0x01d1:
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.F(r10, r4, r6)
        L_0x01d5:
            java.lang.Object r1 = r6.f67975c
            r9.putObject(r14, r2, r1)
            goto L_0x01ac
        L_0x01db:
            r10 = r32
            r6 = r36
            r12 = r2
            r24 = r3
            r33 = r8
            r11 = r19
            r2 = r22
            if (r0 != 0) goto L_0x01b4
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.L(r10, r4, r6)
            r4 = r0
            long r0 = r6.f67974b
            r21 = 0
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 == 0) goto L_0x01f8
            goto L_0x01fa
        L_0x01f8:
            r5 = r16
        L_0x01fa:
            com.google.crypto.tink.shaded.protobuf.s0.H(r14, r2, r5)
            r0 = r7 | r20
            r7 = r33
            r3 = r11
            r2 = r12
            r1 = r24
            r8 = -1
            r11 = r6
            r12 = r10
            r6 = r0
            r0 = r4
            goto L_0x001c
        L_0x020c:
            r10 = r32
            r12 = r2
            r24 = r3
            r33 = r8
            r11 = r19
            r2 = r22
            r8 = r36
            if (r0 != r6) goto L_0x022f
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.h(r10, r4)
            r9.putInt(r14, r2, r0)
            int r0 = r4 + 4
            r6 = r7 | r20
            r7 = r33
        L_0x0228:
            r3 = r11
            r2 = r12
            r1 = r24
            r11 = r8
            goto L_0x0166
        L_0x022f:
            r13 = r4
            goto L_0x02d3
        L_0x0232:
            r10 = r32
            r12 = r2
            r24 = r3
            r33 = r8
            r11 = r19
            r2 = r22
            r8 = r36
            if (r0 != r5) goto L_0x022f
            long r5 = com.google.crypto.tink.shaded.protobuf.C9522e.j(r10, r4)
            r0 = r9
            r1 = r31
            r13 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
        L_0x024d:
            int r0 = r13 + 8
        L_0x024f:
            r6 = r7 | r20
            r7 = r33
            r13 = r34
            goto L_0x0228
        L_0x0256:
            r10 = r32
            r12 = r2
            r24 = r3
            r13 = r4
            r33 = r8
            r11 = r19
            r2 = r22
            r8 = r36
            if (r0 != 0) goto L_0x02d3
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.I(r10, r13, r8)
            int r1 = r8.f67973a
            r9.putInt(r14, r2, r1)
            goto L_0x024f
        L_0x0270:
            r10 = r32
            r12 = r2
            r24 = r3
            r13 = r4
            r33 = r8
            r11 = r19
            r2 = r22
            r8 = r36
            if (r0 != 0) goto L_0x02d3
            int r6 = com.google.crypto.tink.shaded.protobuf.C9522e.L(r10, r13, r8)
            long r4 = r8.f67974b
            r0 = r9
            r1 = r31
            r0.putLong(r1, r2, r4)
            r0 = r7 | r20
            r7 = r33
            r13 = r34
            r3 = r11
            r2 = r12
            r1 = r24
            r11 = r8
            r12 = r10
            r8 = -1
            r28 = r6
            r6 = r0
            r0 = r28
            goto L_0x001c
        L_0x02a0:
            r10 = r32
            r12 = r2
            r24 = r3
            r13 = r4
            r33 = r8
            r11 = r19
            r2 = r22
            r8 = r36
            if (r0 != r6) goto L_0x02d3
            float r0 = com.google.crypto.tink.shaded.protobuf.C9522e.l(r10, r13)
            com.google.crypto.tink.shaded.protobuf.s0.O(r14, r2, r0)
            int r0 = r13 + 4
            goto L_0x024f
        L_0x02ba:
            r10 = r32
            r12 = r2
            r24 = r3
            r13 = r4
            r33 = r8
            r11 = r19
            r2 = r22
            r8 = r36
            if (r0 != r5) goto L_0x02d3
            double r0 = com.google.crypto.tink.shaded.protobuf.C9522e.d(r10, r13)
            com.google.crypto.tink.shaded.protobuf.s0.N(r14, r2, r0)
            goto L_0x024d
        L_0x02d3:
            r25 = r33
            r0 = r35
            r19 = r7
            r26 = r9
            r8 = r11
            r27 = r12
            r2 = r13
            r18 = -1
            goto L_0x03f3
        L_0x02e3:
            r8 = r36
            r24 = r3
            r13 = r4
            r28 = r11
            r12 = r2
            r2 = r28
            r11 = r19
            r4 = 27
            if (r10 != r4) goto L_0x0343
            r4 = 2
            if (r0 != r4) goto L_0x0334
            java.lang.Object r0 = r9.getObject(r14, r2)
            com.google.crypto.tink.shaded.protobuf.A$i r0 = (com.google.crypto.tink.shaded.protobuf.A.i) r0
            boolean r1 = r0.u()
            if (r1 != 0) goto L_0x0314
            int r1 = r0.size()
            if (r1 != 0) goto L_0x030b
            r1 = 10
            goto L_0x030d
        L_0x030b:
            int r1 = r1 * 2
        L_0x030d:
            com.google.crypto.tink.shaded.protobuf.A$i r0 = r0.f(r1)
            r9.putObject(r14, r2, r0)
        L_0x0314:
            r5 = r0
            com.google.crypto.tink.shaded.protobuf.h0 r0 = r15.v(r12)
            r1 = r11
            r2 = r32
            r3 = r13
            r4 = r34
            r19 = r6
            r6 = r36
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.q(r0, r1, r2, r3, r4, r5, r6)
            r13 = r34
            r3 = r11
            r2 = r12
            r6 = r19
            r1 = r24
            r12 = r32
            r11 = r8
            goto L_0x0167
        L_0x0334:
            r19 = r6
            r25 = r7
            r26 = r9
            r20 = r11
            r27 = r12
            r15 = r13
            r18 = -1
            goto L_0x03d0
        L_0x0343:
            r19 = r6
            r4 = 49
            if (r10 > r4) goto L_0x039e
            long r5 = (long) r1
            r4 = r0
            r0 = r30
            r1 = r31
            r22 = r2
            r2 = r32
            r3 = r13
            r33 = r4
            r4 = r34
            r20 = r5
            r5 = r11
            r6 = r24
            r25 = r7
            r7 = r33
            r18 = -1
            r8 = r12
            r26 = r9
            r17 = r10
            r9 = r20
            r15 = r35
            r20 = r11
            r11 = r17
            r27 = r12
            r15 = r13
            r12 = r22
            r14 = r36
            int r0 = r0.i0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0397
        L_0x037d:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r36
            r8 = r18
            r6 = r19
            r3 = r20
        L_0x038d:
            r1 = r24
            r7 = r25
            r9 = r26
            r2 = r27
            goto L_0x001c
        L_0x0397:
            r2 = r0
            r8 = r20
            r0 = r35
            goto L_0x03f3
        L_0x039e:
            r33 = r0
            r22 = r2
            r25 = r7
            r26 = r9
            r17 = r10
            r20 = r11
            r27 = r12
            r15 = r13
            r18 = -1
            r0 = 50
            r9 = r17
            if (r9 != r0) goto L_0x03d6
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x03d0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r27
            r6 = r22
            r8 = r36
            int r0 = r0.e0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0397
            goto L_0x037d
        L_0x03d0:
            r0 = r35
            r2 = r15
            r8 = r20
            goto L_0x03f3
        L_0x03d6:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r20
            r6 = r24
            r10 = r22
            r12 = r27
            r13 = r36
            int r0 = r0.f0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0397
            goto L_0x037d
        L_0x03f3:
            if (r8 != r0) goto L_0x0403
            if (r0 == 0) goto L_0x0403
            r9 = r30
            r10 = r0
            r6 = r2
            r0 = r19
            r7 = r25
        L_0x03ff:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0451
        L_0x0403:
            r9 = r30
            r10 = r0
            boolean r0 = r9.f67946f
            r11 = r36
            if (r0 == 0) goto L_0x0426
            com.google.crypto.tink.shaded.protobuf.p r0 = r11.f67976d
            com.google.crypto.tink.shaded.protobuf.p r1 = com.google.crypto.tink.shaded.protobuf.C9533p.b()
            if (r0 == r1) goto L_0x0426
            com.google.crypto.tink.shaded.protobuf.S r5 = r9.f67945e
            com.google.crypto.tink.shaded.protobuf.o0<?, ?> r6 = r9.f67955o
            r0 = r8
            r1 = r32
            r3 = r34
            r4 = r31
            r7 = r36
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.g(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0435
        L_0x0426:
            com.google.crypto.tink.shaded.protobuf.p0 r4 = w(r31)
            r0 = r8
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = com.google.crypto.tink.shaded.protobuf.C9522e.G(r0, r1, r2, r3, r4, r5)
        L_0x0435:
            r14 = r31
            r12 = r32
            r13 = r34
            r3 = r8
            r15 = r9
            r8 = r18
            r6 = r19
            goto L_0x038d
        L_0x0443:
            r10 = r35
            r19 = r6
            r25 = r7
            r26 = r9
            r9 = r15
            r6 = r0
            r8 = r3
            r0 = r19
            goto L_0x03ff
        L_0x0451:
            if (r7 == r1) goto L_0x045c
            long r1 = (long) r7
            r7 = r31
            r3 = r26
            r3.putInt(r7, r1, r0)
            goto L_0x045e
        L_0x045c:
            r7 = r31
        L_0x045e:
            int r0 = r9.f67951k
            r1 = 0
            r11 = r0
            r3 = r1
        L_0x0463:
            int r0 = r9.f67952l
            if (r11 >= r0) goto L_0x047d
            int[] r0 = r9.f67950j
            r2 = r0[r11]
            com.google.crypto.tink.shaded.protobuf.o0<?, ?> r4 = r9.f67955o
            r0 = r30
            r1 = r31
            r5 = r31
            java.lang.Object r0 = r0.q(r1, r2, r3, r4, r5)
            r3 = r0
            com.google.crypto.tink.shaded.protobuf.p0 r3 = (com.google.crypto.tink.shaded.protobuf.p0) r3
            int r11 = r11 + 1
            goto L_0x0463
        L_0x047d:
            if (r3 == 0) goto L_0x0484
            com.google.crypto.tink.shaded.protobuf.o0<?, ?> r0 = r9.f67955o
            r0.o(r7, r3)
        L_0x0484:
            if (r10 != 0) goto L_0x0490
            r0 = r34
            if (r6 != r0) goto L_0x048b
            goto L_0x0496
        L_0x048b:
            com.google.crypto.tink.shaded.protobuf.B r0 = com.google.crypto.tink.shaded.protobuf.B.h()
            throw r0
        L_0x0490:
            r0 = r34
            if (r6 > r0) goto L_0x0497
            if (r8 != r10) goto L_0x0497
        L_0x0496:
            return r6
        L_0x0497:
            com.google.crypto.tink.shaded.protobuf.B r0 = com.google.crypto.tink.shaded.protobuf.B.h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.V.g0(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    public int h(T t10) {
        return this.f67948h ? y(t10) : x(t10);
    }

    public void i(T t10, g0 g0Var, C9533p pVar) {
        pVar.getClass();
        m(t10);
        N(this.f67955o, this.f67956p, t10, g0Var, pVar);
    }

    public void j(T t10, v0 v0Var) {
        if (v0Var.t() == v0.a.DESCENDING) {
            A0(t10, v0Var);
        } else if (this.f67948h) {
            z0(t10, v0Var);
        } else {
            y0(t10, v0Var);
        }
    }
}
