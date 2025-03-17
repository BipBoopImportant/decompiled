package s0;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import androidx.compose.foundation.layout.C5082m;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pI.C17752b;
import tI.C17978n;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0001\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ls0/J;", "", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "arrangementSpacingInt", "LE1/K;", "measureScope", "", "LE1/H;", "measurables", "", "LE1/a0;", "placeables", "startIndex", "endIndex", "", "crossAxisOffset", "currentLineIndex", "LE1/J;", "a", "(Ls0/J;IIIIILE1/K;Ljava/util/List;[LE1/a0;II[II)LE1/J;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.K  reason: case insensitive filesystem */
public final class C5840K {
    public static final J a(C5839J j10, int i10, int i11, int i12, int i13, int i14, K k10, List<? extends H> list, a0[] a0VarArr, int i15, int i16, int[] iArr, int i17) {
        int[] iArr2;
        int i18;
        int i19;
        int i20;
        int i21;
        Integer num;
        int i22;
        int i23;
        String str;
        String str2;
        String str3;
        long j11;
        String str4;
        long j12;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        float f10;
        long j13;
        float f11;
        int i24;
        long j14;
        int i25;
        String str13;
        int i26;
        String str14;
        float f12;
        int i27;
        int i28;
        float f13;
        int i29;
        String str15;
        int i30;
        String str16;
        long j15;
        float f14;
        int i31;
        float f15;
        String str17;
        int i32;
        char c10;
        long j16;
        int i33;
        int i34;
        float f16;
        int i35;
        int[] iArr3;
        int i36;
        int i37;
        int i38;
        int[] iArr4;
        int i39;
        C5839J j17 = j10;
        int i40 = i10;
        int i41 = i12;
        int i42 = i13;
        int i43 = i14;
        List<? extends H> list2 = list;
        int i44 = i16;
        int i45 = i44 - i15;
        int i46 = 0;
        int i47 = i15;
        int i48 = 0;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        int[] iArr5 = new int[i45];
        long j18 = (long) i43;
        float f17 = 0.0f;
        int i52 = 0;
        while (true) {
            int i53 = Integer.MAX_VALUE;
            if (i47 >= i44) {
                break;
            }
            int i54 = i52;
            H h10 = (H) list2.get(i47);
            C5841L c11 = C5838I.c(h10);
            float e10 = C5838I.e(c11);
            i51 = (i51 != 0 || C5838I.f(c11)) ? 1 : i46;
            if (e10 > 0.0f) {
                i50++;
                i33 = i47;
                j16 = j18;
                iArr3 = iArr5;
                i34 = i45;
                f16 = f17 + e10;
                i35 = i46;
            } else {
                if (!(i42 == Integer.MAX_VALUE || c11 == null)) {
                    c11.c();
                }
                int i55 = i41 - i49;
                a0 a0Var = a0VarArr[i47];
                if (a0Var == null) {
                    if (i41 != Integer.MAX_VALUE) {
                        i53 = C17978n.e(i55, i46);
                    }
                    i36 = i55;
                    i37 = i49;
                    i38 = i50;
                    i33 = i47;
                    int i56 = i53;
                    int i57 = i46;
                    iArr4 = iArr5;
                    j16 = j18;
                    i39 = i54;
                    i34 = i45;
                    f16 = f17;
                    a0Var = h10.i0(C5839J.m(j10, 0, 0, i56, i13, false, 16, (Object) null));
                } else {
                    i36 = i55;
                    i37 = i49;
                    i38 = i50;
                    i33 = i47;
                    j16 = j18;
                    iArr4 = iArr5;
                    i39 = i54;
                    i34 = i45;
                    f16 = f17;
                }
                a0 a0Var2 = a0Var;
                int c12 = j17.c(a0Var2);
                int e11 = j17.e(a0Var2);
                iArr3 = iArr4;
                iArr3[i33 - i15] = c12;
                i35 = 0;
                int min = Math.min(i43, C17978n.e(i36 - c12, 0));
                i49 = c12 + min + i37;
                int max = Math.max(i39, e11);
                a0VarArr[i33] = a0Var2;
                i54 = max;
                i48 = min;
                i50 = i38;
            }
            i47 = i33 + 1;
            iArr5 = iArr3;
            i46 = i35;
            f17 = f16;
            i45 = i34;
            i52 = i54;
            j18 = j16;
        }
        int i58 = i52;
        long j19 = j18;
        int[] iArr6 = iArr5;
        int i59 = i45;
        float f18 = f17;
        int i60 = i46;
        int i61 = i49;
        int i62 = i50;
        if (i62 == 0) {
            i21 = i61 - i48;
            iArr2 = iArr6;
            i20 = i60;
            i18 = i40;
            i19 = i58;
            num = null;
        } else {
            int i63 = i41 != Integer.MAX_VALUE ? i41 : i40;
            iArr2 = iArr6;
            long j20 = j19;
            long j21 = ((long) (i62 - 1)) * j20;
            long f19 = C17978n.f(((long) (i63 - i61)) - j21, 0);
            float f20 = ((float) f19) / f18;
            int i64 = i15;
            long j22 = f19;
            float f21 = f18;
            while (true) {
                str = "weightedSize ";
                str2 = "weightUnitSpace ";
                str3 = "totalWeight ";
                j11 = f19;
                str4 = "remainingToTarget ";
                j12 = j21;
                str5 = "arrangementSpacingPx ";
                str6 = "targetSpace ";
                str7 = "arrangementSpacingTotal ";
                if (i64 >= i44) {
                    break;
                }
                float e12 = C5838I.e(C5838I.c((H) list2.get(i64)));
                float f22 = f20 * e12;
                try {
                    j22 -= (long) Math.round(f22);
                    i64++;
                    list2 = list;
                    i44 = i16;
                    f19 = j11;
                    j21 = j12;
                } catch (IllegalArgumentException e13) {
                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + i41 + "mainAxisMin " + i10 + str6 + i63 + str5 + j20 + "weightChildrenCount " + i62 + "fixedSpace " + i61 + str7 + j12 + str4 + j11 + str3 + f21 + str2 + f20 + "itemWeight " + e12 + str + f22).initCause(e13);
                }
            }
            i18 = i10;
            float f23 = f21;
            String str18 = str;
            String str19 = str2;
            String str20 = str3;
            long j23 = j11;
            String str21 = str4;
            long j24 = j12;
            String str22 = str7;
            long j25 = j20;
            int i65 = i58;
            int i66 = 0;
            int i67 = i15;
            int i68 = i16;
            while (i67 < i68) {
                if (a0VarArr[i67] == null) {
                    H h11 = (H) list.get(i67);
                    C5841L c13 = C5838I.c(h11);
                    H h12 = h11;
                    float e14 = C5838I.e(c13);
                    String str23 = str5;
                    int i69 = i63;
                    if (!(i13 == Integer.MAX_VALUE || c13 == null)) {
                        c13.c();
                    }
                    if (e14 > 0.0f) {
                        int b10 = C17752b.b(j22);
                        String str24 = str6;
                        j22 -= (long) b10;
                        float f24 = f20 * e14;
                        int i70 = b10;
                        int max2 = Math.max(0, Math.round(f24) + b10);
                        try {
                            if (C5838I.b(c13)) {
                                c10 = 65535;
                                if (max2 != Integer.MAX_VALUE) {
                                    i32 = max2;
                                    j15 = j24;
                                    str16 = str23;
                                    i30 = i70;
                                    i31 = max2;
                                    str15 = str24;
                                    int i71 = i32;
                                    f13 = f24;
                                    i29 = i69;
                                    i28 = i62;
                                    i27 = i61;
                                    f12 = e14;
                                    f14 = f20;
                                    str17 = str18;
                                    H h13 = h12;
                                    char c14 = c10;
                                    f15 = f23;
                                    j14 = j25;
                                    a0 i02 = h13.i0(j10.b(i71, 0, i31, i13, true));
                                    int c15 = j17.c(i02);
                                    int e15 = j17.e(i02);
                                    iArr2[i67 - i15] = c15;
                                    i66 += c15;
                                    int max3 = Math.max(i65, e15);
                                    a0VarArr[i67] = i02;
                                    i65 = max3;
                                    str12 = str17;
                                    f11 = f15;
                                    f10 = f14;
                                    j13 = j23;
                                    str11 = str19;
                                    str10 = str20;
                                    str9 = str21;
                                    str8 = str22;
                                    j24 = j15;
                                    str13 = str16;
                                    str14 = str15;
                                    i26 = i29;
                                    i25 = i28;
                                    i24 = i27;
                                }
                            } else {
                                c10 = 65535;
                            }
                            i32 = 0;
                            j15 = j24;
                            str16 = str23;
                            i30 = i70;
                            i31 = max2;
                            str15 = str24;
                            int i712 = i32;
                            f13 = f24;
                            i29 = i69;
                            i28 = i62;
                            i27 = i61;
                            f12 = e14;
                            f14 = f20;
                            str17 = str18;
                            H h132 = h12;
                            char c142 = c10;
                            f15 = f23;
                            j14 = j25;
                            try {
                                a0 i022 = h132.i0(j10.b(i712, 0, i31, i13, true));
                                int c152 = j17.c(i022);
                                int e152 = j17.e(i022);
                                iArr2[i67 - i15] = c152;
                                i66 += c152;
                                int max32 = Math.max(i65, e152);
                                a0VarArr[i67] = i022;
                                i65 = max32;
                                str12 = str17;
                                f11 = f15;
                                f10 = f14;
                                j13 = j23;
                                str11 = str19;
                                str10 = str20;
                                str9 = str21;
                                str8 = str22;
                                j24 = j15;
                                str13 = str16;
                                str14 = str15;
                                i26 = i29;
                                i25 = i28;
                                i24 = i27;
                            } catch (IllegalArgumentException e16) {
                                e = e16;
                                throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i41 + "mainAxisMin " + i18 + str15 + i29 + str16 + j14 + "weightChildrenCount " + i28 + "fixedSpace " + i27 + str22 + j15 + str21 + j23 + str20 + f15 + str19 + f14 + "weight " + f12 + str17 + f13 + "crossAxisDesiredSize " + null + "remainderUnit " + i30 + "childMainAxisSize " + i31).initCause(e);
                            }
                        } catch (IllegalArgumentException e17) {
                            e = e17;
                            f13 = f24;
                            i28 = i62;
                            i27 = i61;
                            f12 = e14;
                            str17 = str18;
                            j15 = j24;
                            i29 = i69;
                            str16 = str23;
                            str15 = str24;
                            i30 = i70;
                            i31 = max2;
                            f14 = f20;
                            f15 = f23;
                            j14 = j25;
                            throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i41 + "mainAxisMin " + i18 + str15 + i29 + str16 + j14 + "weightChildrenCount " + i28 + "fixedSpace " + i27 + str22 + j15 + str21 + j23 + str20 + f15 + str19 + f14 + "weight " + f12 + str17 + f13 + "crossAxisDesiredSize " + null + "remainderUnit " + i30 + "childMainAxisSize " + i31).initCause(e);
                        }
                    } else {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                } else {
                    str13 = str5;
                    i24 = i61;
                    f10 = f20;
                    str12 = str18;
                    f11 = f23;
                    j14 = j25;
                    j13 = j23;
                    str11 = str19;
                    str10 = str20;
                    str9 = str21;
                    str8 = str22;
                    i26 = i63;
                    i25 = i62;
                    int i72 = i66;
                    str14 = str6;
                    int i73 = i65;
                }
                i67++;
                str6 = str14;
                i63 = i26;
                str5 = str13;
                i62 = i25;
                i61 = i24;
                j23 = j13;
                f20 = f10;
                str19 = str11;
                str20 = str10;
                str21 = str9;
                str22 = str8;
                i68 = i16;
                j25 = j14;
                f23 = f11;
                str18 = str12;
            }
            int i74 = i61;
            num = null;
            i19 = i65;
            i20 = C17978n.m((int) (((long) i66) + j24), 0, i41 - i74);
            i21 = i74;
        }
        if (i51 != 0) {
            int i75 = i16;
            int i76 = 0;
            int i77 = 0;
            for (int i78 = i15; i78 < i75; i78++) {
                a0 a0Var3 = a0VarArr[i78];
                C17542s.g(a0Var3);
                C5082m a10 = C5838I.a(C5838I.d(a0Var3));
                Integer b11 = a10 != null ? a10.b(a0Var3) : num;
                if (b11 != null) {
                    int intValue = b11.intValue();
                    int e18 = j17.e(a0Var3);
                    i76 = Math.max(i76, intValue != Integer.MIN_VALUE ? b11.intValue() : 0);
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = e18;
                    }
                    i77 = Math.max(i77, e18 - intValue);
                }
            }
            i23 = i77;
            i22 = i76;
        } else {
            int i79 = i16;
            i23 = 0;
            i22 = 0;
        }
        int max4 = Math.max(C17978n.e(i21 + i20, 0), i18);
        int max5 = Math.max(i19, Math.max(i11, i23 + i22));
        int i80 = i59;
        int[] iArr7 = new int[i80];
        for (int i81 = 0; i81 < i80; i81++) {
            iArr7[i81] = 0;
        }
        j17.g(max4, iArr2, iArr7, k10);
        return j10.k(a0VarArr, k10, i22, iArr7, max4, max5, iArr, i17, i15, i16);
    }

    public static /* synthetic */ J b(C5839J j10, int i10, int i11, int i12, int i13, int i14, K k10, List list, a0[] a0VarArr, int i15, int i16, int[] iArr, int i17, int i18, Object obj) {
        int i19 = i18;
        return a(j10, i10, i11, i12, i13, i14, k10, list, a0VarArr, i15, i16, (i19 & 1024) != 0 ? null : iArr, (i19 & RecyclerView.n.FLAG_MOVED) != 0 ? 0 : i17);
    }
}
