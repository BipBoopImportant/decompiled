package com.google.android.libraries.places.internal;

import com.google.ar.core.ImageFormat;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

final class zzahz<T> implements zzaih<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzaji.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final zzahw zze;
    private final boolean zzf;
    private final int[] zzg;
    private final int zzh;
    private final zzahk zzi;
    private final zzaiy zzj;
    private final zzage zzk;
    private final int zzl;
    private final zzaib zzm;
    private final zzahr zzn;

    private zzahz(int[] iArr, Object[] objArr, int i10, int i11, zzahw zzahw, int i12, boolean z10, int[] iArr2, int i13, int i14, zzaib zzaib, zzahk zzahk, zzaiy zzaiy, zzage zzage, zzahr zzahr) {
        zzahw zzahw2 = zzahw;
        zzage zzage2 = zzage;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzl = i12;
        boolean z11 = false;
        if (zzage2 != null && zzage2.zzc(zzahw)) {
            z11 = true;
        }
        this.zzf = z11;
        this.zzg = iArr2;
        this.zzh = i13;
        this.zzm = zzaib;
        this.zzi = zzahk;
        this.zzj = zzaiy;
        this.zzk = zzage2;
        this.zze = zzahw2;
        this.zzn = zzahr;
    }

    private final boolean zzA(Object obj, int i10) {
        int zzn2 = zzn(i10);
        long j10 = (long) (zzn2 & 1048575);
        if (j10 == 1048575) {
            int zzp = zzp(i10);
            long j11 = (long) (zzp & 1048575);
            switch (zzo(zzp)) {
                case 0:
                    return Double.doubleToRawLongBits(zzaji.zza(obj, j11)) != 0;
                case 1:
                    return Float.floatToRawIntBits(zzaji.zzb(obj, j11)) != 0;
                case 2:
                    return zzaji.zzd(obj, j11) != 0;
                case 3:
                    return zzaji.zzd(obj, j11) != 0;
                case 4:
                    return zzaji.zzc(obj, j11) != 0;
                case 5:
                    return zzaji.zzd(obj, j11) != 0;
                case 6:
                    return zzaji.zzc(obj, j11) != 0;
                case 7:
                    return zzaji.zzw(obj, j11);
                case 8:
                    Object zzf2 = zzaji.zzf(obj, j11);
                    if (zzf2 instanceof String) {
                        return !((String) zzf2).isEmpty();
                    }
                    if (zzf2 instanceof zzaft) {
                        return !zzaft.zzb.equals(zzf2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zzaji.zzf(obj, j11) != null;
                case 10:
                    return !zzaft.zzb.equals(zzaji.zzf(obj, j11));
                case 11:
                    return zzaji.zzc(obj, j11) != 0;
                case 12:
                    return zzaji.zzc(obj, j11) != 0;
                case 13:
                    return zzaji.zzc(obj, j11) != 0;
                case 14:
                    return zzaji.zzd(obj, j11) != 0;
                case 15:
                    return zzaji.zzc(obj, j11) != 0;
                case 16:
                    return zzaji.zzd(obj, j11) != 0;
                case 17:
                    return zzaji.zzf(obj, j11) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (zzaji.zzc(obj, j10) & (1 << (zzn2 >>> 20))) != 0;
        }
    }

    private final boolean zzB(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzA(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzC(Object obj, int i10, zzaih zzaih) {
        return zzaih.zzh(zzaji.zzf(obj, (long) (i10 & 1048575)));
    }

    private static boolean zzD(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzago) {
            return ((zzago) obj).zzL();
        }
        return true;
    }

    private final boolean zzE(Object obj, int i10, int i11) {
        return zzaji.zzc(obj, (long) (zzn(i11) & 1048575)) == i10;
    }

    private static boolean zzF(Object obj, long j10) {
        return ((Boolean) zzaji.zzf(obj, j10)).booleanValue();
    }

    private static final void zzG(int i10, Object obj, zzajp zzajp) {
        if (obj instanceof String) {
            zzajp.zzD(i10, (String) obj);
        } else {
            zzajp.zzd(i10, (zzaft) obj);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x026f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.libraries.places.internal.zzahz zzi(java.lang.Class r31, com.google.android.libraries.places.internal.zzaht r32, com.google.android.libraries.places.internal.zzaib r33, com.google.android.libraries.places.internal.zzahk r34, com.google.android.libraries.places.internal.zzaiy r35, com.google.android.libraries.places.internal.zzage r36, com.google.android.libraries.places.internal.zzahr r37) {
        /*
            r0 = r32
            boolean r1 = r0 instanceof com.google.android.libraries.places.internal.zzaig
            if (r1 == 0) goto L_0x03e5
            com.google.android.libraries.places.internal.zzaig r0 = (com.google.android.libraries.places.internal.zzaig) r0
            java.lang.String r1 = r0.zzd()
            int r2 = r1.length()
            r3 = 0
            char r4 = r1.charAt(r3)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0025
            r4 = 1
        L_0x001b:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0026
            r4 = r7
            goto L_0x001b
        L_0x0025:
            r7 = 1
        L_0x0026:
            int r4 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0045
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0032:
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0042
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r9
            r7 = r7 | r4
            int r9 = r9 + 13
            r4 = r10
            goto L_0x0032
        L_0x0042:
            int r4 = r4 << r9
            r7 = r7 | r4
            r4 = r10
        L_0x0045:
            if (r7 != 0) goto L_0x0057
            int[] r7 = zza
            r11 = r3
            r12 = r11
            r13 = r12
            r14 = r13
            r16 = r14
            r18 = r16
            r17 = r7
            r7 = r18
            goto L_0x0167
        L_0x0057:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0076
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0063:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0073
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r4 = r4 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x0063
        L_0x0073:
            int r7 = r7 << r9
            r4 = r4 | r7
            r7 = r10
        L_0x0076:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0095
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0082:
            int r11 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto L_0x0092
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r11
            goto L_0x0082
        L_0x0092:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r11
        L_0x0095:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto L_0x00b4
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a1:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto L_0x00b1
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r9 = r9 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L_0x00a1
        L_0x00b1:
            int r10 = r10 << r11
            r9 = r9 | r10
            r10 = r12
        L_0x00b4:
            int r11 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto L_0x00d3
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c0:
            int r13 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c0
        L_0x00d0:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        L_0x00d3:
            int r12 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00df:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00df
        L_0x00ef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f2:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fe:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L_0x010e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fe
        L_0x010e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0111:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L_0x0132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011d:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011d
        L_0x012e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0132:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L_0x0155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013e:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r5) goto L_0x0150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013e
        L_0x0150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int r16 = r4 + r4
            int r16 = r16 + r7
            int[] r7 = new int[r13]
            r17 = r7
            r13 = r9
            r18 = r14
            r7 = r4
            r14 = r10
            r4 = r15
        L_0x0167:
            sun.misc.Unsafe r9 = zzb
            java.lang.Object[] r10 = r0.zze()
            com.google.android.libraries.places.internal.zzahw r15 = r0.zza()
            java.lang.Class r15 = r15.getClass()
            int r19 = r18 + r12
            int r12 = r11 + r11
            int r11 = r11 * 3
            int[] r11 = new int[r11]
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r20 = r3
            r21 = r20
            r22 = r18
            r23 = r19
        L_0x0187:
            if (r4 >= r2) goto L_0x03c0
            int r24 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x01af
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x0197:
            int r25 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r5) goto L_0x01a9
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r25
            goto L_0x0197
        L_0x01a9:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r25
            goto L_0x01b1
        L_0x01af:
            r3 = r24
        L_0x01b1:
            int r24 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r5) goto L_0x01d7
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r8 = r24
            r24 = 13
        L_0x01bf:
            int r25 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r5) goto L_0x01d1
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r24
            r3 = r3 | r8
            int r24 = r24 + 13
            r8 = r25
            goto L_0x01bf
        L_0x01d1:
            int r8 = r8 << r24
            r3 = r3 | r8
            r8 = r25
            goto L_0x01d9
        L_0x01d7:
            r8 = r24
        L_0x01d9:
            r6 = r3 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x01e3
            int r6 = r21 + 1
            r17[r21] = r20
            r21 = r6
        L_0x01e3:
            r6 = r3 & 255(0xff, float:3.57E-43)
            r5 = 51
            if (r6 < r5) goto L_0x0289
            int r5 = r8 + 1
            char r8 = r1.charAt(r8)
            r26 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r2) goto L_0x0214
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r29 = 13
        L_0x01fa:
            int r30 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r2) goto L_0x020f
            r2 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r29
            r8 = r8 | r2
            int r29 = r29 + 13
            r5 = r30
            r2 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01fa
        L_0x020f:
            int r2 = r5 << r29
            r8 = r8 | r2
            r5 = r30
        L_0x0214:
            int r2 = r6 + -51
            r29 = r5
            r5 = 9
            if (r2 == r5) goto L_0x023d
            r5 = 17
            if (r2 != r5) goto L_0x0221
            goto L_0x023d
        L_0x0221:
            r5 = 12
            if (r2 != r5) goto L_0x0249
            int r2 = r0.zzc()
            r5 = 1
            if (r2 == r5) goto L_0x0230
            r2 = r3 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x0249
        L_0x0230:
            int r2 = r20 / 3
            int r2 = r2 + r2
            int r2 = r2 + r5
            int r5 = r16 + 1
            r16 = r10[r16]
            r12[r2] = r16
        L_0x023a:
            r16 = r5
            goto L_0x0249
        L_0x023d:
            int r2 = r20 / 3
            int r2 = r2 + r2
            r5 = 1
            int r2 = r2 + r5
            int r5 = r16 + 1
            r16 = r10[r16]
            r12[r2] = r16
            goto L_0x023a
        L_0x0249:
            int r8 = r8 + r8
            r2 = r10[r8]
            boolean r5 = r2 instanceof java.lang.reflect.Field
            if (r5 == 0) goto L_0x0256
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
        L_0x0252:
            r5 = r13
            r30 = r14
            goto L_0x025f
        L_0x0256:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r2 = zzt(r15, r2)
            r10[r8] = r2
            goto L_0x0252
        L_0x025f:
            long r13 = r9.objectFieldOffset(r2)
            int r2 = (int) r13
            int r8 = r8 + 1
            r13 = r10[r8]
            boolean r14 = r13 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x026f
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x0277
        L_0x026f:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = zzt(r15, r13)
            r10[r8] = r13
        L_0x0277:
            long r13 = r9.objectFieldOffset(r13)
            int r8 = (int) r13
            r28 = r1
            r27 = r5
            r14 = r16
            r25 = r29
            r16 = r8
            r8 = 0
            goto L_0x0389
        L_0x0289:
            r26 = r2
            r5 = r13
            r30 = r14
            int r2 = r16 + 1
            r13 = r10[r16]
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = zzt(r15, r13)
            r14 = 9
            if (r6 == r14) goto L_0x02a0
            r14 = 17
            if (r6 != r14) goto L_0x02a5
        L_0x02a0:
            r27 = r5
            r5 = 1
            goto L_0x030e
        L_0x02a5:
            r14 = 27
            if (r6 == r14) goto L_0x02ad
            r14 = 49
            if (r6 != r14) goto L_0x02b1
        L_0x02ad:
            r27 = r5
            r5 = 1
            goto L_0x0303
        L_0x02b1:
            r14 = 12
            if (r6 == r14) goto L_0x02e9
            r14 = 30
            if (r6 == r14) goto L_0x02e9
            r14 = 44
            if (r6 != r14) goto L_0x02be
            goto L_0x02e9
        L_0x02be:
            r14 = 50
            if (r6 != r14) goto L_0x02e6
            int r14 = r22 + 1
            r17[r22] = r20
            int r22 = r20 / 3
            int r27 = r16 + 2
            r2 = r10[r2]
            int r22 = r22 + r22
            r12[r22] = r2
            r2 = r3 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x02e2
            int r22 = r22 + 1
            int r2 = r16 + 3
            r16 = r10[r27]
            r12[r22] = r16
            r27 = r5
            r22 = r14
        L_0x02e0:
            r5 = 1
            goto L_0x0318
        L_0x02e2:
            r22 = r14
            r2 = r27
        L_0x02e6:
            r27 = r5
            goto L_0x02e0
        L_0x02e9:
            int r14 = r0.zzc()
            r27 = r5
            r5 = 1
            if (r14 == r5) goto L_0x02f6
            r14 = r3 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0318
        L_0x02f6:
            int r14 = r20 / 3
            int r14 = r14 + r14
            int r14 = r14 + r5
            int r16 = r16 + 2
            r2 = r10[r2]
            r12[r14] = r2
        L_0x0300:
            r2 = r16
            goto L_0x0318
        L_0x0303:
            int r14 = r20 / 3
            int r14 = r14 + r14
            int r14 = r14 + r5
            int r16 = r16 + 2
            r2 = r10[r2]
            r12[r14] = r2
            goto L_0x0300
        L_0x030e:
            int r14 = r20 / 3
            int r14 = r14 + r14
            int r14 = r14 + r5
            java.lang.Class r16 = r13.getType()
            r12[r14] = r16
        L_0x0318:
            long r13 = r9.objectFieldOffset(r13)
            int r13 = (int) r13
            r14 = r3 & 4096(0x1000, float:5.74E-42)
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r14 == 0) goto L_0x0374
            r14 = 17
            if (r6 > r14) goto L_0x0374
            int r14 = r8 + 1
            char r8 = r1.charAt(r8)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r5) goto L_0x034d
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0337:
            int r25 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L_0x0349
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r16
            r8 = r8 | r14
            int r16 = r16 + 13
            r14 = r25
            goto L_0x0337
        L_0x0349:
            int r14 = r14 << r16
            r8 = r8 | r14
            goto L_0x034f
        L_0x034d:
            r25 = r14
        L_0x034f:
            int r14 = r7 + r7
            int r16 = r8 / 32
            int r14 = r14 + r16
            r5 = r10[r14]
            r28 = r1
            boolean r1 = r5 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x0361
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x035f:
            r14 = r2
            goto L_0x036a
        L_0x0361:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = zzt(r15, r5)
            r10[r14] = r5
            goto L_0x035f
        L_0x036a:
            long r1 = r9.objectFieldOffset(r5)
            int r1 = (int) r1
            int r8 = r8 % 32
            r16 = r1
            goto L_0x037a
        L_0x0374:
            r28 = r1
            r14 = r2
            r25 = r8
            r8 = 0
        L_0x037a:
            r1 = 18
            if (r6 < r1) goto L_0x0388
            r1 = 49
            if (r6 > r1) goto L_0x0388
            int r1 = r23 + 1
            r17[r23] = r13
            r23 = r1
        L_0x0388:
            r2 = r13
        L_0x0389:
            int r1 = r20 + 1
            r11[r20] = r4
            int r4 = r20 + 2
            r5 = r3 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0396
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0397
        L_0x0396:
            r5 = 0
        L_0x0397:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x039e
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x039f
        L_0x039e:
            r3 = 0
        L_0x039f:
            int r6 = r6 << 20
            r3 = r3 | r5
            r3 = r3 | r6
            r2 = r2 | r3
            r11[r1] = r2
            int r20 = r20 + 3
            int r1 = r8 << 20
            r1 = r1 | r16
            r11[r4] = r1
            r16 = r14
            r4 = r25
            r2 = r26
            r13 = r27
            r1 = r28
            r14 = r30
            r3 = 0
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0187
        L_0x03c0:
            r27 = r13
            r30 = r14
            com.google.android.libraries.places.internal.zzahz r1 = new com.google.android.libraries.places.internal.zzahz
            com.google.android.libraries.places.internal.zzahw r14 = r0.zza()
            int r15 = r0.zzc()
            r16 = 0
            r9 = r1
            r10 = r11
            r11 = r12
            r12 = r27
            r13 = r30
            r20 = r33
            r21 = r34
            r22 = r35
            r23 = r36
            r24 = r37
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r1
        L_0x03e5:
            com.google.android.libraries.places.internal.zzaiv r0 = (com.google.android.libraries.places.internal.zzaiv) r0
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzahz.zzi(java.lang.Class, com.google.android.libraries.places.internal.zzaht, com.google.android.libraries.places.internal.zzaib, com.google.android.libraries.places.internal.zzahk, com.google.android.libraries.places.internal.zzaiy, com.google.android.libraries.places.internal.zzage, com.google.android.libraries.places.internal.zzahr):com.google.android.libraries.places.internal.zzahz");
    }

    private static double zzj(Object obj, long j10) {
        return ((Double) zzaji.zzf(obj, j10)).doubleValue();
    }

    private static float zzk(Object obj, long j10) {
        return ((Float) zzaji.zzf(obj, j10)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0338, code lost:
        r6 = r6 + r3;
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0458, code lost:
        r3 = r3 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0467, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        r6 = r6 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04af, code lost:
        r3 = r3 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0575, code lost:
        r5 = r5 + 3;
        r4 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        r3 = r3 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a8, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f2, code lost:
        r3 = r3 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f5, code lost:
        r4 = r4 + r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzl(java.lang.Object r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = zzb
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r4
            r5 = 0
            r6 = 0
            r8 = 0
        L_0x000c:
            int[] r9 = r0.zzc
            int r9 = r9.length
            if (r5 >= r9) goto L_0x057c
            int r9 = r15.zzp(r5)
            int[] r10 = r0.zzc
            r11 = r10[r5]
            int r12 = zzo(r9)
            r13 = 17
            r14 = 1
            if (r12 > r13) goto L_0x0035
            int r13 = r5 + 2
            r10 = r10[r13]
            r13 = r10 & r4
            int r10 = r10 >>> 20
            if (r13 == r7) goto L_0x0032
            long r7 = (long) r13
            int r8 = r2.getInt(r1, r7)
            r7 = r13
        L_0x0032:
            int r10 = r14 << r10
            goto L_0x0036
        L_0x0035:
            r10 = 0
        L_0x0036:
            r9 = r9 & r4
            long r3 = (long) r9
            r9 = 63
            switch(r12) {
                case 0: goto L_0x0568;
                case 1: goto L_0x055b;
                case 2: goto L_0x0546;
                case 3: goto L_0x0531;
                case 4: goto L_0x051c;
                case 5: goto L_0x050f;
                case 6: goto L_0x0502;
                case 7: goto L_0x04f4;
                case 8: goto L_0x04c5;
                case 9: goto L_0x04b2;
                case 10: goto L_0x0493;
                case 11: goto L_0x047f;
                case 12: goto L_0x046b;
                case 13: goto L_0x045c;
                case 14: goto L_0x044d;
                case 15: goto L_0x0431;
                case 16: goto L_0x0417;
                case 17: goto L_0x0403;
                case 18: goto L_0x03f7;
                case 19: goto L_0x03eb;
                case 20: goto L_0x03df;
                case 21: goto L_0x03d3;
                case 22: goto L_0x03c7;
                case 23: goto L_0x03bb;
                case 24: goto L_0x03af;
                case 25: goto L_0x03a1;
                case 26: goto L_0x0395;
                case 27: goto L_0x0385;
                case 28: goto L_0x0379;
                case 29: goto L_0x036c;
                case 30: goto L_0x0360;
                case 31: goto L_0x0354;
                case 32: goto L_0x0348;
                case 33: goto L_0x033c;
                case 34: goto L_0x032d;
                case 35: goto L_0x0315;
                case 36: goto L_0x02fd;
                case 37: goto L_0x02e5;
                case 38: goto L_0x02cd;
                case 39: goto L_0x02b5;
                case 40: goto L_0x029d;
                case 41: goto L_0x0285;
                case 42: goto L_0x026b;
                case 43: goto L_0x0254;
                case 44: goto L_0x023d;
                case 45: goto L_0x0226;
                case 46: goto L_0x020f;
                case 47: goto L_0x01f8;
                case 48: goto L_0x01df;
                case 49: goto L_0x01cf;
                case 50: goto L_0x01c2;
                case 51: goto L_0x01b4;
                case 52: goto L_0x01a6;
                case 53: goto L_0x0190;
                case 54: goto L_0x017a;
                case 55: goto L_0x0164;
                case 56: goto L_0x0156;
                case 57: goto L_0x0148;
                case 58: goto L_0x0139;
                case 59: goto L_0x0109;
                case 60: goto L_0x00f5;
                case 61: goto L_0x00d5;
                case 62: goto L_0x00c0;
                case 63: goto L_0x00ab;
                case 64: goto L_0x009c;
                case 65: goto L_0x008d;
                case 66: goto L_0x0071;
                case 67: goto L_0x0056;
                case 68: goto L_0x003e;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0053
        L_0x003e:
            boolean r9 = r15.zzE(r1, r11, r5)
            if (r9 == 0) goto L_0x0053
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.libraries.places.internal.zzahw r3 = (com.google.android.libraries.places.internal.zzahw) r3
            com.google.android.libraries.places.internal.zzaih r4 = r15.zzr(r5)
            int r3 = com.google.android.libraries.places.internal.zzagb.zzt(r11, r3, r4)
        L_0x0052:
            int r6 = r6 + r3
        L_0x0053:
            r12 = 0
            goto L_0x0575
        L_0x0056:
            boolean r10 = r15.zzE(r1, r11, r5)
            if (r10 == 0) goto L_0x0053
            long r3 = zzq(r1, r3)
            int r10 = r11 << 3
            long r11 = r3 + r3
            long r3 = r3 >> r9
            int r9 = com.google.android.libraries.places.internal.zzagb.zzx(r10)
            long r3 = r3 ^ r11
            int r3 = com.google.android.libraries.places.internal.zzagb.zzy(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x0053
        L_0x0071:
            boolean r9 = r15.zzE(r1, r11, r5)
            if (r9 == 0) goto L_0x0053
            int r3 = zzm(r1, r3)
            int r4 = r11 << 3
            int r9 = r3 + r3
            int r3 = r3 >> 31
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            r3 = r3 ^ r9
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
        L_0x008a:
            int r4 = r4 + r3
            int r6 = r6 + r4
            goto L_0x0053
        L_0x008d:
            boolean r3 = r15.zzE(r1, r11, r5)
            if (r3 == 0) goto L_0x0053
            int r3 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
        L_0x0099:
            int r3 = r3 + 8
            goto L_0x0052
        L_0x009c:
            boolean r3 = r15.zzE(r1, r11, r5)
            if (r3 == 0) goto L_0x0053
            int r3 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
        L_0x00a8:
            int r3 = r3 + 4
            goto L_0x0052
        L_0x00ab:
            boolean r9 = r15.zzE(r1, r11, r5)
            if (r9 == 0) goto L_0x0053
            int r3 = zzm(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzu(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x008a
        L_0x00c0:
            boolean r9 = r15.zzE(r1, r11, r5)
            if (r9 == 0) goto L_0x0053
            int r3 = zzm(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x008a
        L_0x00d5:
            boolean r9 = r15.zzE(r1, r11, r5)
            if (r9 == 0) goto L_0x0053
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.libraries.places.internal.zzaft r3 = (com.google.android.libraries.places.internal.zzaft) r3
            int r4 = r11 << 3
            int r9 = com.google.android.libraries.places.internal.zzagb.zzb
            int r3 = r3.zzd()
            int r9 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
        L_0x00f2:
            int r3 = r3 + r9
            goto L_0x0052
        L_0x00f5:
            boolean r9 = r15.zzE(r1, r11, r5)
            if (r9 == 0) goto L_0x0053
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.libraries.places.internal.zzaih r4 = r15.zzr(r5)
            int r3 = com.google.android.libraries.places.internal.zzaij.zzn(r11, r3, r4)
            goto L_0x0052
        L_0x0109:
            boolean r9 = r15.zzE(r1, r11, r5)
            if (r9 == 0) goto L_0x0053
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.libraries.places.internal.zzaft
            if (r4 == 0) goto L_0x012b
            com.google.android.libraries.places.internal.zzaft r3 = (com.google.android.libraries.places.internal.zzaft) r3
            int r4 = r11 << 3
            int r9 = com.google.android.libraries.places.internal.zzagb.zzb
            int r3 = r3.zzd()
            int r9 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x00f2
        L_0x012b:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzw(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x008a
        L_0x0139:
            boolean r3 = r15.zzE(r1, r11, r5)
            if (r3 == 0) goto L_0x0053
            int r3 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r3 = r3 + r14
            goto L_0x0052
        L_0x0148:
            boolean r3 = r15.zzE(r1, r11, r5)
            if (r3 == 0) goto L_0x0053
            int r3 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            goto L_0x00a8
        L_0x0156:
            boolean r3 = r15.zzE(r1, r11, r5)
            if (r3 == 0) goto L_0x0053
            int r3 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            goto L_0x0099
        L_0x0164:
            boolean r9 = r15.zzE(r1, r11, r5)
            if (r9 == 0) goto L_0x0053
            int r3 = zzm(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzu(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x008a
        L_0x017a:
            boolean r9 = r15.zzE(r1, r11, r5)
            if (r9 == 0) goto L_0x0053
            long r3 = zzq(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzy(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r9)
            goto L_0x008a
        L_0x0190:
            boolean r9 = r15.zzE(r1, r11, r5)
            if (r9 == 0) goto L_0x0053
            long r3 = zzq(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzy(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r9)
            goto L_0x008a
        L_0x01a6:
            boolean r3 = r15.zzE(r1, r11, r5)
            if (r3 == 0) goto L_0x0053
            int r3 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            goto L_0x00a8
        L_0x01b4:
            boolean r3 = r15.zzE(r1, r11, r5)
            if (r3 == 0) goto L_0x0053
            int r3 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            goto L_0x0099
        L_0x01c2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r15.zzs(r5)
            com.google.android.libraries.places.internal.zzahr.zza(r11, r3, r4)
            goto L_0x0053
        L_0x01cf:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.libraries.places.internal.zzaih r4 = r15.zzr(r5)
            int r3 = com.google.android.libraries.places.internal.zzaij.zzi(r11, r3, r4)
            goto L_0x0052
        L_0x01df:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzs(r3)
            if (r3 <= 0) goto L_0x0053
            int r4 = r11 << 3
            int r9 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
        L_0x01f5:
            int r4 = r4 + r9
            goto L_0x008a
        L_0x01f8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzq(r3)
            if (r3 <= 0) goto L_0x0053
            int r4 = r11 << 3
            int r9 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x01f5
        L_0x020f:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzh(r3)
            if (r3 <= 0) goto L_0x0053
            int r4 = r11 << 3
            int r9 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x01f5
        L_0x0226:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzf(r3)
            if (r3 <= 0) goto L_0x0053
            int r4 = r11 << 3
            int r9 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x01f5
        L_0x023d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzd(r3)
            if (r3 <= 0) goto L_0x0053
            int r4 = r11 << 3
            int r9 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x01f5
        L_0x0254:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzv(r3)
            if (r3 <= 0) goto L_0x0053
            int r4 = r11 << 3
            int r9 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x01f5
        L_0x026b:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r4 = com.google.android.libraries.places.internal.zzaij.zza
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0053
            int r4 = r11 << 3
            int r9 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x01f5
        L_0x0285:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzf(r3)
            if (r3 <= 0) goto L_0x0053
            int r4 = r11 << 3
            int r9 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x01f5
        L_0x029d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzh(r3)
            if (r3 <= 0) goto L_0x0053
            int r4 = r11 << 3
            int r9 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x01f5
        L_0x02b5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzk(r3)
            if (r3 <= 0) goto L_0x0053
            int r4 = r11 << 3
            int r9 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x01f5
        L_0x02cd:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzx(r3)
            if (r3 <= 0) goto L_0x0053
            int r4 = r11 << 3
            int r9 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x01f5
        L_0x02e5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzm(r3)
            if (r3 <= 0) goto L_0x0053
            int r4 = r11 << 3
            int r9 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x01f5
        L_0x02fd:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzf(r3)
            if (r3 <= 0) goto L_0x0053
            int r4 = r11 << 3
            int r9 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x01f5
        L_0x0315:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzh(r3)
            if (r3 <= 0) goto L_0x0053
            int r4 = r11 << 3
            int r9 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x01f5
        L_0x032d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r9 = 0
            int r3 = com.google.android.libraries.places.internal.zzaij.zzr(r11, r3, r9)
        L_0x0338:
            int r6 = r6 + r3
            r12 = r9
            goto L_0x0575
        L_0x033c:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzp(r11, r3, r9)
            goto L_0x0338
        L_0x0348:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzg(r11, r3, r9)
            goto L_0x0338
        L_0x0354:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zze(r11, r3, r9)
            goto L_0x0338
        L_0x0360:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzc(r11, r3, r9)
            goto L_0x0338
        L_0x036c:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzu(r11, r3, r9)
            goto L_0x0052
        L_0x0379:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzb(r11, r3)
            goto L_0x0052
        L_0x0385:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.libraries.places.internal.zzaih r4 = r15.zzr(r5)
            int r3 = com.google.android.libraries.places.internal.zzaij.zzo(r11, r3, r4)
            goto L_0x0052
        L_0x0395:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzt(r11, r3)
            goto L_0x0052
        L_0x03a1:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r12 = 0
            int r3 = com.google.android.libraries.places.internal.zzaij.zza(r11, r3, r12)
        L_0x03ac:
            int r6 = r6 + r3
            goto L_0x0575
        L_0x03af:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zze(r11, r3, r12)
            goto L_0x03ac
        L_0x03bb:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzg(r11, r3, r12)
            goto L_0x03ac
        L_0x03c7:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzj(r11, r3, r12)
            goto L_0x03ac
        L_0x03d3:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzw(r11, r3, r12)
            goto L_0x03ac
        L_0x03df:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzl(r11, r3, r12)
            goto L_0x03ac
        L_0x03eb:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zze(r11, r3, r12)
            goto L_0x03ac
        L_0x03f7:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.libraries.places.internal.zzaij.zzg(r11, r3, r12)
            goto L_0x03ac
        L_0x0403:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0575
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.libraries.places.internal.zzahw r3 = (com.google.android.libraries.places.internal.zzahw) r3
            com.google.android.libraries.places.internal.zzaih r4 = r15.zzr(r5)
            int r3 = com.google.android.libraries.places.internal.zzagb.zzt(r11, r3, r4)
            goto L_0x03ac
        L_0x0417:
            r12 = 0
            r10 = r10 & r8
            if (r10 == 0) goto L_0x0575
            long r3 = r2.getLong(r1, r3)
            int r10 = r11 << 3
            long r13 = r3 + r3
            long r3 = r3 >> r9
            int r9 = com.google.android.libraries.places.internal.zzagb.zzx(r10)
            long r3 = r3 ^ r13
            int r3 = com.google.android.libraries.places.internal.zzagb.zzy(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x0575
        L_0x0431:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0575
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r9 = r3 + r3
            int r3 = r3 >> 31
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            r3 = r3 ^ r9
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
        L_0x0449:
            int r4 = r4 + r3
            int r6 = r6 + r4
            goto L_0x0575
        L_0x044d:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0575
            int r3 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
        L_0x0458:
            int r3 = r3 + 8
            goto L_0x03ac
        L_0x045c:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0575
            int r3 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
        L_0x0467:
            int r3 = r3 + 4
            goto L_0x03ac
        L_0x046b:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0575
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzu(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x0449
        L_0x047f:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0575
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x0449
        L_0x0493:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0575
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.libraries.places.internal.zzaft r3 = (com.google.android.libraries.places.internal.zzaft) r3
            int r4 = r11 << 3
            int r9 = com.google.android.libraries.places.internal.zzagb.zzb
            int r3 = r3.zzd()
            int r9 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
        L_0x04af:
            int r3 = r3 + r9
            goto L_0x03ac
        L_0x04b2:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0575
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.libraries.places.internal.zzaih r4 = r15.zzr(r5)
            int r3 = com.google.android.libraries.places.internal.zzaij.zzn(r11, r3, r4)
            goto L_0x03ac
        L_0x04c5:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0575
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.libraries.places.internal.zzaft
            if (r4 == 0) goto L_0x04e6
            com.google.android.libraries.places.internal.zzaft r3 = (com.google.android.libraries.places.internal.zzaft) r3
            int r4 = r11 << 3
            int r9 = com.google.android.libraries.places.internal.zzagb.zzb
            int r3 = r3.zzd()
            int r9 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x04af
        L_0x04e6:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzw(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x0449
        L_0x04f4:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0575
            int r3 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            int r3 = r3 + r14
            goto L_0x03ac
        L_0x0502:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0575
            int r3 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            goto L_0x0467
        L_0x050f:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0575
            int r3 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            goto L_0x0458
        L_0x051c:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0575
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzu(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x0449
        L_0x0531:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0575
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzy(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r9)
            goto L_0x0449
        L_0x0546:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0575
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzy(r3)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r9)
            goto L_0x0449
        L_0x055b:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0575
            int r3 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            goto L_0x0467
        L_0x0568:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0575
            int r3 = r11 << 3
            int r3 = com.google.android.libraries.places.internal.zzagb.zzx(r3)
            goto L_0x0458
        L_0x0575:
            int r5 = r5 + 3
            r4 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000c
        L_0x057c:
            com.google.android.libraries.places.internal.zzaiy r2 = r0.zzj
            java.lang.Object r3 = r2.zzc(r1)
            int r2 = r2.zza(r3)
            int r6 = r6 + r2
            boolean r2 = r0.zzf
            if (r2 != 0) goto L_0x058c
            return r6
        L_0x058c:
            com.google.android.libraries.places.internal.zzage r2 = r0.zzk
            r2.zza(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzahz.zzl(java.lang.Object):int");
    }

    private static int zzm(Object obj, long j10) {
        return ((Integer) zzaji.zzf(obj, j10)).intValue();
    }

    private final int zzn(int i10) {
        return this.zzc[i10 + 2];
    }

    private static int zzo(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzp(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzq(Object obj, long j10) {
        return ((Long) zzaji.zzf(obj, j10)).longValue();
    }

    private final zzaih zzr(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzaih zzaih = (zzaih) this.zzd[i12];
        if (zzaih != null) {
            return zzaih;
        }
        zzaih zzb2 = zzaie.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzs(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private static Field zzt(Class cls, String str) {
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

    private final void zzu(Object obj, Object obj2, int i10) {
        if (zzA(obj2, i10)) {
            Unsafe unsafe = zzb;
            long zzp = (long) (zzp(i10) & 1048575);
            Object object = unsafe.getObject(obj2, zzp);
            if (object != null) {
                zzaih zzr = zzr(i10);
                if (!zzA(obj, i10)) {
                    if (!zzD(object)) {
                        unsafe.putObject(obj, zzp, object);
                    } else {
                        Object zzc2 = zzr.zzc();
                        zzr.zze(zzc2, object);
                        unsafe.putObject(obj, zzp, zzc2);
                    }
                    zzw(obj, i10);
                    return;
                }
                Object object2 = unsafe.getObject(obj, zzp);
                if (!zzD(object2)) {
                    Object zzc3 = zzr.zzc();
                    zzr.zze(zzc3, object2);
                    unsafe.putObject(obj, zzp, zzc3);
                    object2 = zzc3;
                }
                zzr.zze(object2, object);
                return;
            }
            int i11 = this.zzc[i10];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i11 + " is present but null: " + obj3);
        }
    }

    private final void zzv(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzE(obj2, i11, i10)) {
            Unsafe unsafe = zzb;
            long zzp = (long) (zzp(i10) & 1048575);
            Object object = unsafe.getObject(obj2, zzp);
            if (object != null) {
                zzaih zzr = zzr(i10);
                if (!zzE(obj, i11, i10)) {
                    if (!zzD(object)) {
                        unsafe.putObject(obj, zzp, object);
                    } else {
                        Object zzc2 = zzr.zzc();
                        zzr.zze(zzc2, object);
                        unsafe.putObject(obj, zzp, zzc2);
                    }
                    zzx(obj, i11, i10);
                    return;
                }
                Object object2 = unsafe.getObject(obj, zzp);
                if (!zzD(object2)) {
                    Object zzc3 = zzr.zzc();
                    zzr.zze(zzc3, object2);
                    unsafe.putObject(obj, zzp, zzc3);
                    object2 = zzc3;
                }
                zzr.zze(object2, object);
                return;
            }
            int i12 = this.zzc[i10];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i12 + " is present but null: " + obj3);
        }
    }

    private final void zzw(Object obj, int i10) {
        int zzn2 = zzn(i10);
        long j10 = (long) (1048575 & zzn2);
        if (j10 != 1048575) {
            zzaji.zzq(obj, j10, (1 << (zzn2 >>> 20)) | zzaji.zzc(obj, j10));
        }
    }

    private final void zzx(Object obj, int i10, int i11) {
        zzaji.zzq(obj, (long) (zzn(i11) & 1048575), i10);
    }

    private final void zzy(zzajp zzajp, int i10, Object obj, int i11) {
        if (obj != null) {
            zzahp zzahp = (zzahp) zzs(i11);
            throw null;
        }
    }

    private final boolean zzz(Object obj, Object obj2, int i10) {
        return zzA(obj, i10) == zzA(obj2, i10);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0582, code lost:
        r2 = r2 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        r4 = r4 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009c, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ab, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f5, code lost:
        r4 = r4 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0148, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f9, code lost:
        r5 = r5 + r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(java.lang.Object r12) {
        /*
            r11 = this;
            com.google.android.libraries.places.internal.zzajn r0 = com.google.android.libraries.places.internal.zzajn.DOUBLE
            int r0 = r11.zzl
            int r0 = r0 + -1
            if (r0 == 0) goto L_0x0592
            sun.misc.Unsafe r0 = zzb
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x000d:
            int[] r4 = r11.zzc
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0586
            int r4 = r11.zzp(r2)
            int r5 = zzo(r4)
            int[] r6 = r11.zzc
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            com.google.android.libraries.places.internal.zzagj r7 = com.google.android.libraries.places.internal.zzagj.DOUBLE_LIST_PACKED
            int r7 = r7.zza()
            if (r5 < r7) goto L_0x0038
            com.google.android.libraries.places.internal.zzagj r7 = com.google.android.libraries.places.internal.zzagj.SINT64_LIST_PACKED
            int r7 = r7.zza()
            if (r5 > r7) goto L_0x0038
            int[] r7 = r11.zzc
            int r8 = r2 + 2
            r7 = r7[r8]
        L_0x0038:
            long r7 = (long) r4
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0574;
                case 1: goto L_0x0566;
                case 2: goto L_0x0550;
                case 3: goto L_0x053a;
                case 4: goto L_0x0524;
                case 5: goto L_0x0516;
                case 6: goto L_0x0508;
                case 7: goto L_0x04fa;
                case 8: goto L_0x04c9;
                case 9: goto L_0x04b5;
                case 10: goto L_0x0496;
                case 11: goto L_0x0480;
                case 12: goto L_0x046a;
                case 13: goto L_0x045c;
                case 14: goto L_0x044e;
                case 15: goto L_0x0433;
                case 16: goto L_0x0417;
                case 17: goto L_0x0401;
                case 18: goto L_0x03f5;
                case 19: goto L_0x03e9;
                case 20: goto L_0x03dd;
                case 21: goto L_0x03d1;
                case 22: goto L_0x03c5;
                case 23: goto L_0x03b9;
                case 24: goto L_0x03ad;
                case 25: goto L_0x03a1;
                case 26: goto L_0x0395;
                case 27: goto L_0x0385;
                case 28: goto L_0x0379;
                case 29: goto L_0x036d;
                case 30: goto L_0x0361;
                case 31: goto L_0x0355;
                case 32: goto L_0x0349;
                case 33: goto L_0x033d;
                case 34: goto L_0x0331;
                case 35: goto L_0x0319;
                case 36: goto L_0x0301;
                case 37: goto L_0x02e9;
                case 38: goto L_0x02d1;
                case 39: goto L_0x02b9;
                case 40: goto L_0x02a1;
                case 41: goto L_0x0289;
                case 42: goto L_0x026f;
                case 43: goto L_0x0258;
                case 44: goto L_0x0241;
                case 45: goto L_0x022a;
                case 46: goto L_0x0213;
                case 47: goto L_0x01fc;
                case 48: goto L_0x01e3;
                case 49: goto L_0x01d3;
                case 50: goto L_0x01c6;
                case 51: goto L_0x01b8;
                case 52: goto L_0x01aa;
                case 53: goto L_0x0194;
                case 54: goto L_0x017e;
                case 55: goto L_0x0168;
                case 56: goto L_0x015a;
                case 57: goto L_0x014c;
                case 58: goto L_0x013c;
                case 59: goto L_0x010c;
                case 60: goto L_0x00f8;
                case 61: goto L_0x00d8;
                case 62: goto L_0x00c3;
                case 63: goto L_0x00ae;
                case 64: goto L_0x009f;
                case 65: goto L_0x0090;
                case 66: goto L_0x0073;
                case 67: goto L_0x0057;
                case 68: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0582
        L_0x0040:
            boolean r4 = r11.zzE(r12, r6, r2)
            if (r4 == 0) goto L_0x0582
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            com.google.android.libraries.places.internal.zzahw r4 = (com.google.android.libraries.places.internal.zzahw) r4
            com.google.android.libraries.places.internal.zzaih r5 = r11.zzr(r2)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzt(r6, r4, r5)
        L_0x0054:
            int r3 = r3 + r4
            goto L_0x0582
        L_0x0057:
            boolean r5 = r11.zzE(r12, r6, r2)
            if (r5 == 0) goto L_0x0582
            long r7 = zzq(r12, r7)
            int r5 = r6 << 3
            long r9 = r7 + r7
            long r6 = r7 >> r4
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            long r5 = r9 ^ r6
            int r5 = com.google.android.libraries.places.internal.zzagb.zzy(r5)
        L_0x0071:
            int r4 = r4 + r5
            goto L_0x0054
        L_0x0073:
            boolean r4 = r11.zzE(r12, r6, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = zzm(r12, r7)
            int r5 = r6 << 3
            int r6 = r4 + r4
            int r4 = r4 >> 31
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            r4 = r4 ^ r6
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
        L_0x008c:
            int r5 = r5 + r4
            int r3 = r3 + r5
            goto L_0x0582
        L_0x0090:
            boolean r4 = r11.zzE(r12, r6, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
        L_0x009c:
            int r4 = r4 + 8
            goto L_0x0054
        L_0x009f:
            boolean r4 = r11.zzE(r12, r6, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
        L_0x00ab:
            int r4 = r4 + 4
            goto L_0x0054
        L_0x00ae:
            boolean r4 = r11.zzE(r12, r6, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = zzm(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzu(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x008c
        L_0x00c3:
            boolean r4 = r11.zzE(r12, r6, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = zzm(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x008c
        L_0x00d8:
            boolean r4 = r11.zzE(r12, r6, r2)
            if (r4 == 0) goto L_0x0582
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            com.google.android.libraries.places.internal.zzaft r4 = (com.google.android.libraries.places.internal.zzaft) r4
            int r5 = r6 << 3
            int r6 = com.google.android.libraries.places.internal.zzagb.zzb
            int r4 = r4.zzd()
            int r6 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
        L_0x00f5:
            int r4 = r4 + r6
            goto L_0x0054
        L_0x00f8:
            boolean r4 = r11.zzE(r12, r6, r2)
            if (r4 == 0) goto L_0x0582
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            com.google.android.libraries.places.internal.zzaih r5 = r11.zzr(r2)
            int r4 = com.google.android.libraries.places.internal.zzaij.zzn(r6, r4, r5)
            goto L_0x0054
        L_0x010c:
            boolean r4 = r11.zzE(r12, r6, r2)
            if (r4 == 0) goto L_0x0582
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            boolean r5 = r4 instanceof com.google.android.libraries.places.internal.zzaft
            if (r5 == 0) goto L_0x012e
            com.google.android.libraries.places.internal.zzaft r4 = (com.google.android.libraries.places.internal.zzaft) r4
            int r5 = r6 << 3
            int r6 = com.google.android.libraries.places.internal.zzagb.zzb
            int r4 = r4.zzd()
            int r6 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x00f5
        L_0x012e:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzw(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x008c
        L_0x013c:
            boolean r4 = r11.zzE(r12, r6, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
        L_0x0148:
            int r4 = r4 + 1
            goto L_0x0054
        L_0x014c:
            boolean r4 = r11.zzE(r12, r6, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x00ab
        L_0x015a:
            boolean r4 = r11.zzE(r12, r6, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x009c
        L_0x0168:
            boolean r4 = r11.zzE(r12, r6, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = zzm(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzu(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x008c
        L_0x017e:
            boolean r4 = r11.zzE(r12, r6, r2)
            if (r4 == 0) goto L_0x0582
            long r4 = zzq(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzy(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r6)
            goto L_0x008c
        L_0x0194:
            boolean r4 = r11.zzE(r12, r6, r2)
            if (r4 == 0) goto L_0x0582
            long r4 = zzq(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzy(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r6)
            goto L_0x008c
        L_0x01aa:
            boolean r4 = r11.zzE(r12, r6, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x00ab
        L_0x01b8:
            boolean r4 = r11.zzE(r12, r6, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x009c
        L_0x01c6:
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            java.lang.Object r5 = r11.zzs(r2)
            com.google.android.libraries.places.internal.zzahr.zza(r6, r4, r5)
            goto L_0x0582
        L_0x01d3:
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.libraries.places.internal.zzaih r5 = r11.zzr(r2)
            int r4 = com.google.android.libraries.places.internal.zzaij.zzi(r6, r4, r5)
            goto L_0x0054
        L_0x01e3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzs(r4)
            if (r4 <= 0) goto L_0x0582
            int r5 = r6 << 3
            int r6 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
        L_0x01f9:
            int r5 = r5 + r6
            goto L_0x008c
        L_0x01fc:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzq(r4)
            if (r4 <= 0) goto L_0x0582
            int r5 = r6 << 3
            int r6 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x01f9
        L_0x0213:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzh(r4)
            if (r4 <= 0) goto L_0x0582
            int r5 = r6 << 3
            int r6 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x01f9
        L_0x022a:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzf(r4)
            if (r4 <= 0) goto L_0x0582
            int r5 = r6 << 3
            int r6 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x01f9
        L_0x0241:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzd(r4)
            if (r4 <= 0) goto L_0x0582
            int r5 = r6 << 3
            int r6 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x01f9
        L_0x0258:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzv(r4)
            if (r4 <= 0) goto L_0x0582
            int r5 = r6 << 3
            int r6 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x01f9
        L_0x026f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r5 = com.google.android.libraries.places.internal.zzaij.zza
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0582
            int r5 = r6 << 3
            int r6 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x01f9
        L_0x0289:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzf(r4)
            if (r4 <= 0) goto L_0x0582
            int r5 = r6 << 3
            int r6 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x01f9
        L_0x02a1:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzh(r4)
            if (r4 <= 0) goto L_0x0582
            int r5 = r6 << 3
            int r6 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x01f9
        L_0x02b9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzk(r4)
            if (r4 <= 0) goto L_0x0582
            int r5 = r6 << 3
            int r6 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x01f9
        L_0x02d1:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzx(r4)
            if (r4 <= 0) goto L_0x0582
            int r5 = r6 << 3
            int r6 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x01f9
        L_0x02e9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzm(r4)
            if (r4 <= 0) goto L_0x0582
            int r5 = r6 << 3
            int r6 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x01f9
        L_0x0301:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzf(r4)
            if (r4 <= 0) goto L_0x0582
            int r5 = r6 << 3
            int r6 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x01f9
        L_0x0319:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzh(r4)
            if (r4 <= 0) goto L_0x0582
            int r5 = r6 << 3
            int r6 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x01f9
        L_0x0331:
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzr(r6, r4, r1)
            goto L_0x0054
        L_0x033d:
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzp(r6, r4, r1)
            goto L_0x0054
        L_0x0349:
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzg(r6, r4, r1)
            goto L_0x0054
        L_0x0355:
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zze(r6, r4, r1)
            goto L_0x0054
        L_0x0361:
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzc(r6, r4, r1)
            goto L_0x0054
        L_0x036d:
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzu(r6, r4, r1)
            goto L_0x0054
        L_0x0379:
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzb(r6, r4)
            goto L_0x0054
        L_0x0385:
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.libraries.places.internal.zzaih r5 = r11.zzr(r2)
            int r4 = com.google.android.libraries.places.internal.zzaij.zzo(r6, r4, r5)
            goto L_0x0054
        L_0x0395:
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzt(r6, r4)
            goto L_0x0054
        L_0x03a1:
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zza(r6, r4, r1)
            goto L_0x0054
        L_0x03ad:
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zze(r6, r4, r1)
            goto L_0x0054
        L_0x03b9:
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzg(r6, r4, r1)
            goto L_0x0054
        L_0x03c5:
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzj(r6, r4, r1)
            goto L_0x0054
        L_0x03d1:
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzw(r6, r4, r1)
            goto L_0x0054
        L_0x03dd:
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzl(r6, r4, r1)
            goto L_0x0054
        L_0x03e9:
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zze(r6, r4, r1)
            goto L_0x0054
        L_0x03f5:
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.libraries.places.internal.zzaij.zzg(r6, r4, r1)
            goto L_0x0054
        L_0x0401:
            boolean r4 = r11.zzA(r12, r2)
            if (r4 == 0) goto L_0x0582
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            com.google.android.libraries.places.internal.zzahw r4 = (com.google.android.libraries.places.internal.zzahw) r4
            com.google.android.libraries.places.internal.zzaih r5 = r11.zzr(r2)
            int r4 = com.google.android.libraries.places.internal.zzagb.zzt(r6, r4, r5)
            goto L_0x0054
        L_0x0417:
            boolean r5 = r11.zzA(r12, r2)
            if (r5 == 0) goto L_0x0582
            long r7 = com.google.android.libraries.places.internal.zzaji.zzd(r12, r7)
            int r5 = r6 << 3
            long r9 = r7 + r7
            long r6 = r7 >> r4
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            long r5 = r9 ^ r6
            int r5 = com.google.android.libraries.places.internal.zzagb.zzy(r5)
            goto L_0x0071
        L_0x0433:
            boolean r4 = r11.zzA(r12, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = com.google.android.libraries.places.internal.zzaji.zzc(r12, r7)
            int r5 = r6 << 3
            int r6 = r4 + r4
            int r4 = r4 >> 31
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            r4 = r4 ^ r6
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x008c
        L_0x044e:
            boolean r4 = r11.zzA(r12, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x009c
        L_0x045c:
            boolean r4 = r11.zzA(r12, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x00ab
        L_0x046a:
            boolean r4 = r11.zzA(r12, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = com.google.android.libraries.places.internal.zzaji.zzc(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzu(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x008c
        L_0x0480:
            boolean r4 = r11.zzA(r12, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = com.google.android.libraries.places.internal.zzaji.zzc(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x008c
        L_0x0496:
            boolean r4 = r11.zzA(r12, r2)
            if (r4 == 0) goto L_0x0582
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            com.google.android.libraries.places.internal.zzaft r4 = (com.google.android.libraries.places.internal.zzaft) r4
            int r5 = r6 << 3
            int r6 = com.google.android.libraries.places.internal.zzagb.zzb
            int r4 = r4.zzd()
            int r6 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x00f5
        L_0x04b5:
            boolean r4 = r11.zzA(r12, r2)
            if (r4 == 0) goto L_0x0582
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            com.google.android.libraries.places.internal.zzaih r5 = r11.zzr(r2)
            int r4 = com.google.android.libraries.places.internal.zzaij.zzn(r6, r4, r5)
            goto L_0x0054
        L_0x04c9:
            boolean r4 = r11.zzA(r12, r2)
            if (r4 == 0) goto L_0x0582
            java.lang.Object r4 = com.google.android.libraries.places.internal.zzaji.zzf(r12, r7)
            boolean r5 = r4 instanceof com.google.android.libraries.places.internal.zzaft
            if (r5 == 0) goto L_0x04ec
            com.google.android.libraries.places.internal.zzaft r4 = (com.google.android.libraries.places.internal.zzaft) r4
            int r5 = r6 << 3
            int r6 = com.google.android.libraries.places.internal.zzagb.zzb
            int r4 = r4.zzd()
            int r6 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x00f5
        L_0x04ec:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzw(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x008c
        L_0x04fa:
            boolean r4 = r11.zzA(r12, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x0148
        L_0x0508:
            boolean r4 = r11.zzA(r12, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x00ab
        L_0x0516:
            boolean r4 = r11.zzA(r12, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x009c
        L_0x0524:
            boolean r4 = r11.zzA(r12, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = com.google.android.libraries.places.internal.zzaji.zzc(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzu(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r5)
            goto L_0x008c
        L_0x053a:
            boolean r4 = r11.zzA(r12, r2)
            if (r4 == 0) goto L_0x0582
            long r4 = com.google.android.libraries.places.internal.zzaji.zzd(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzy(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r6)
            goto L_0x008c
        L_0x0550:
            boolean r4 = r11.zzA(r12, r2)
            if (r4 == 0) goto L_0x0582
            long r4 = com.google.android.libraries.places.internal.zzaji.zzd(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzy(r4)
            int r5 = com.google.android.libraries.places.internal.zzagb.zzx(r6)
            goto L_0x008c
        L_0x0566:
            boolean r4 = r11.zzA(r12, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x00ab
        L_0x0574:
            boolean r4 = r11.zzA(r12, r2)
            if (r4 == 0) goto L_0x0582
            int r4 = r6 << 3
            int r4 = com.google.android.libraries.places.internal.zzagb.zzx(r4)
            goto L_0x009c
        L_0x0582:
            int r2 = r2 + 3
            goto L_0x000d
        L_0x0586:
            com.google.android.libraries.places.internal.zzaiy r0 = r11.zzj
            java.lang.Object r12 = r0.zzc(r12)
            int r12 = r0.zza(r12)
            int r3 = r3 + r12
            return r3
        L_0x0592:
            int r12 = r11.zzl(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzahz.zza(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        r3 = (int) (r3 ^ (r3 >>> 32));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0166, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0218, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r0 = r9.zzc
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x021c
            int r3 = r9.zzp(r1)
            int[] r4 = r9.zzc
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            int r3 = zzo(r3)
            long r5 = (long) r5
            r7 = 37
            r8 = 32
            switch(r3) {
                case 0: goto L_0x020a;
                case 1: goto L_0x01fe;
                case 2: goto L_0x01f4;
                case 3: goto L_0x01ea;
                case 4: goto L_0x01e2;
                case 5: goto L_0x01d8;
                case 6: goto L_0x01d0;
                case 7: goto L_0x01c4;
                case 8: goto L_0x01b6;
                case 9: goto L_0x01ab;
                case 10: goto L_0x019f;
                case 11: goto L_0x0197;
                case 12: goto L_0x018f;
                case 13: goto L_0x0187;
                case 14: goto L_0x017d;
                case 15: goto L_0x0175;
                case 16: goto L_0x016b;
                case 17: goto L_0x015c;
                case 18: goto L_0x0150;
                case 19: goto L_0x0150;
                case 20: goto L_0x0150;
                case 21: goto L_0x0150;
                case 22: goto L_0x0150;
                case 23: goto L_0x0150;
                case 24: goto L_0x0150;
                case 25: goto L_0x0150;
                case 26: goto L_0x0150;
                case 27: goto L_0x0150;
                case 28: goto L_0x0150;
                case 29: goto L_0x0150;
                case 30: goto L_0x0150;
                case 31: goto L_0x0150;
                case 32: goto L_0x0150;
                case 33: goto L_0x0150;
                case 34: goto L_0x0150;
                case 35: goto L_0x0150;
                case 36: goto L_0x0150;
                case 37: goto L_0x0150;
                case 38: goto L_0x0150;
                case 39: goto L_0x0150;
                case 40: goto L_0x0150;
                case 41: goto L_0x0150;
                case 42: goto L_0x0150;
                case 43: goto L_0x0150;
                case 44: goto L_0x0150;
                case 45: goto L_0x0150;
                case 46: goto L_0x0150;
                case 47: goto L_0x0150;
                case 48: goto L_0x0150;
                case 49: goto L_0x0150;
                case 50: goto L_0x0144;
                case 51: goto L_0x0130;
                case 52: goto L_0x011e;
                case 53: goto L_0x010e;
                case 54: goto L_0x00fe;
                case 55: goto L_0x00f0;
                case 56: goto L_0x00e0;
                case 57: goto L_0x00d2;
                case 58: goto L_0x00c0;
                case 59: goto L_0x00ac;
                case 60: goto L_0x009b;
                case 61: goto L_0x008a;
                case 62: goto L_0x007d;
                case 63: goto L_0x0070;
                case 64: goto L_0x0063;
                case 65: goto L_0x0054;
                case 66: goto L_0x0047;
                case 67: goto L_0x0034;
                case 68: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0218
        L_0x0021:
            boolean r3 = r9.zzE(r10, r4, r1)
            if (r3 == 0) goto L_0x0218
            java.lang.Object r3 = com.google.android.libraries.places.internal.zzaji.zzf(r10, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
        L_0x0031:
            int r2 = r2 + r3
            goto L_0x0218
        L_0x0034:
            boolean r3 = r9.zzE(r10, r4, r1)
            if (r3 == 0) goto L_0x0218
            int r2 = r2 * 53
            long r3 = zzq(r10, r5)
            byte[] r5 = com.google.android.libraries.places.internal.zzagx.zzd
        L_0x0042:
            long r5 = r3 >>> r8
            long r3 = r3 ^ r5
            int r3 = (int) r3
            goto L_0x0031
        L_0x0047:
            boolean r3 = r9.zzE(r10, r4, r1)
            if (r3 == 0) goto L_0x0218
            int r2 = r2 * 53
            int r3 = zzm(r10, r5)
            goto L_0x0031
        L_0x0054:
            boolean r3 = r9.zzE(r10, r4, r1)
            if (r3 == 0) goto L_0x0218
            int r2 = r2 * 53
            long r3 = zzq(r10, r5)
            byte[] r5 = com.google.android.libraries.places.internal.zzagx.zzd
            goto L_0x0042
        L_0x0063:
            boolean r3 = r9.zzE(r10, r4, r1)
            if (r3 == 0) goto L_0x0218
            int r2 = r2 * 53
            int r3 = zzm(r10, r5)
            goto L_0x0031
        L_0x0070:
            boolean r3 = r9.zzE(r10, r4, r1)
            if (r3 == 0) goto L_0x0218
            int r2 = r2 * 53
            int r3 = zzm(r10, r5)
            goto L_0x0031
        L_0x007d:
            boolean r3 = r9.zzE(r10, r4, r1)
            if (r3 == 0) goto L_0x0218
            int r2 = r2 * 53
            int r3 = zzm(r10, r5)
            goto L_0x0031
        L_0x008a:
            boolean r3 = r9.zzE(r10, r4, r1)
            if (r3 == 0) goto L_0x0218
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.libraries.places.internal.zzaji.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0031
        L_0x009b:
            boolean r3 = r9.zzE(r10, r4, r1)
            if (r3 == 0) goto L_0x0218
            java.lang.Object r3 = com.google.android.libraries.places.internal.zzaji.zzf(r10, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0031
        L_0x00ac:
            boolean r3 = r9.zzE(r10, r4, r1)
            if (r3 == 0) goto L_0x0218
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.libraries.places.internal.zzaji.zzf(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0031
        L_0x00c0:
            boolean r3 = r9.zzE(r10, r4, r1)
            if (r3 == 0) goto L_0x0218
            int r2 = r2 * 53
            boolean r3 = zzF(r10, r5)
            int r3 = com.google.android.libraries.places.internal.zzagx.zza(r3)
            goto L_0x0031
        L_0x00d2:
            boolean r3 = r9.zzE(r10, r4, r1)
            if (r3 == 0) goto L_0x0218
            int r2 = r2 * 53
            int r3 = zzm(r10, r5)
            goto L_0x0031
        L_0x00e0:
            boolean r3 = r9.zzE(r10, r4, r1)
            if (r3 == 0) goto L_0x0218
            int r2 = r2 * 53
            long r3 = zzq(r10, r5)
            byte[] r5 = com.google.android.libraries.places.internal.zzagx.zzd
            goto L_0x0042
        L_0x00f0:
            boolean r3 = r9.zzE(r10, r4, r1)
            if (r3 == 0) goto L_0x0218
            int r2 = r2 * 53
            int r3 = zzm(r10, r5)
            goto L_0x0031
        L_0x00fe:
            boolean r3 = r9.zzE(r10, r4, r1)
            if (r3 == 0) goto L_0x0218
            int r2 = r2 * 53
            long r3 = zzq(r10, r5)
            byte[] r5 = com.google.android.libraries.places.internal.zzagx.zzd
            goto L_0x0042
        L_0x010e:
            boolean r3 = r9.zzE(r10, r4, r1)
            if (r3 == 0) goto L_0x0218
            int r2 = r2 * 53
            long r3 = zzq(r10, r5)
            byte[] r5 = com.google.android.libraries.places.internal.zzagx.zzd
            goto L_0x0042
        L_0x011e:
            boolean r3 = r9.zzE(r10, r4, r1)
            if (r3 == 0) goto L_0x0218
            int r2 = r2 * 53
            float r3 = zzk(r10, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0031
        L_0x0130:
            boolean r3 = r9.zzE(r10, r4, r1)
            if (r3 == 0) goto L_0x0218
            int r2 = r2 * 53
            double r3 = zzj(r10, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            byte[] r5 = com.google.android.libraries.places.internal.zzagx.zzd
            goto L_0x0042
        L_0x0144:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.libraries.places.internal.zzaji.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0031
        L_0x0150:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.libraries.places.internal.zzaji.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0031
        L_0x015c:
            java.lang.Object r3 = com.google.android.libraries.places.internal.zzaji.zzf(r10, r5)
            if (r3 == 0) goto L_0x0166
            int r7 = r3.hashCode()
        L_0x0166:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0218
        L_0x016b:
            int r2 = r2 * 53
            long r3 = com.google.android.libraries.places.internal.zzaji.zzd(r10, r5)
            byte[] r5 = com.google.android.libraries.places.internal.zzagx.zzd
            goto L_0x0042
        L_0x0175:
            int r2 = r2 * 53
            int r3 = com.google.android.libraries.places.internal.zzaji.zzc(r10, r5)
            goto L_0x0031
        L_0x017d:
            int r2 = r2 * 53
            long r3 = com.google.android.libraries.places.internal.zzaji.zzd(r10, r5)
            byte[] r5 = com.google.android.libraries.places.internal.zzagx.zzd
            goto L_0x0042
        L_0x0187:
            int r2 = r2 * 53
            int r3 = com.google.android.libraries.places.internal.zzaji.zzc(r10, r5)
            goto L_0x0031
        L_0x018f:
            int r2 = r2 * 53
            int r3 = com.google.android.libraries.places.internal.zzaji.zzc(r10, r5)
            goto L_0x0031
        L_0x0197:
            int r2 = r2 * 53
            int r3 = com.google.android.libraries.places.internal.zzaji.zzc(r10, r5)
            goto L_0x0031
        L_0x019f:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.libraries.places.internal.zzaji.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0031
        L_0x01ab:
            java.lang.Object r3 = com.google.android.libraries.places.internal.zzaji.zzf(r10, r5)
            if (r3 == 0) goto L_0x0166
            int r7 = r3.hashCode()
            goto L_0x0166
        L_0x01b6:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.libraries.places.internal.zzaji.zzf(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0031
        L_0x01c4:
            int r2 = r2 * 53
            boolean r3 = com.google.android.libraries.places.internal.zzaji.zzw(r10, r5)
            int r3 = com.google.android.libraries.places.internal.zzagx.zza(r3)
            goto L_0x0031
        L_0x01d0:
            int r2 = r2 * 53
            int r3 = com.google.android.libraries.places.internal.zzaji.zzc(r10, r5)
            goto L_0x0031
        L_0x01d8:
            int r2 = r2 * 53
            long r3 = com.google.android.libraries.places.internal.zzaji.zzd(r10, r5)
            byte[] r5 = com.google.android.libraries.places.internal.zzagx.zzd
            goto L_0x0042
        L_0x01e2:
            int r2 = r2 * 53
            int r3 = com.google.android.libraries.places.internal.zzaji.zzc(r10, r5)
            goto L_0x0031
        L_0x01ea:
            int r2 = r2 * 53
            long r3 = com.google.android.libraries.places.internal.zzaji.zzd(r10, r5)
            byte[] r5 = com.google.android.libraries.places.internal.zzagx.zzd
            goto L_0x0042
        L_0x01f4:
            int r2 = r2 * 53
            long r3 = com.google.android.libraries.places.internal.zzaji.zzd(r10, r5)
            byte[] r5 = com.google.android.libraries.places.internal.zzagx.zzd
            goto L_0x0042
        L_0x01fe:
            int r2 = r2 * 53
            float r3 = com.google.android.libraries.places.internal.zzaji.zzb(r10, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0031
        L_0x020a:
            int r2 = r2 * 53
            double r3 = com.google.android.libraries.places.internal.zzaji.zza(r10, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            byte[] r5 = com.google.android.libraries.places.internal.zzagx.zzd
            goto L_0x0042
        L_0x0218:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x021c:
            int r2 = r2 * 53
            com.google.android.libraries.places.internal.zzaiy r0 = r9.zzj
            java.lang.Object r0 = r0.zzc(r10)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r9.zzf
            if (r0 != 0) goto L_0x022e
            return r2
        L_0x022e:
            com.google.android.libraries.places.internal.zzage r0 = r9.zzk
            r0.zza(r10)
            r10 = 0
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzahz.zzb(java.lang.Object):int");
    }

    public final Object zzc() {
        return ((zzago) this.zze).zzy();
    }

    public final void zzd(Object obj) {
        if (zzD(obj)) {
            if (obj instanceof zzago) {
                zzago zzago = (zzago) obj;
                zzago.zzJ(Integer.MAX_VALUE);
                zzago.zza = 0;
                zzago.zzH();
            }
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int zzp = zzp(i10);
                int i11 = 1048575 & zzp;
                int zzo = zzo(zzp);
                long j10 = (long) i11;
                if (zzo != 9) {
                    if (zzo == 60 || zzo == 68) {
                        if (zzE(obj, this.zzc[i10], i10)) {
                            zzr(i10).zzd(zzb.getObject(obj, j10));
                        }
                    } else {
                        switch (zzo) {
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
                            case ImageFormat.YUV_420_888 /*35*/:
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
                                this.zzi.zza(obj, j10);
                                continue;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzahq) object).zzb();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
                if (zzA(obj, i10)) {
                    zzr(i10).zzd(zzb.getObject(obj, j10));
                }
            }
            this.zzj.zze(obj);
            if (this.zzf) {
                this.zzk.zzb(obj);
            }
        }
    }

    public final void zze(Object obj, Object obj2) {
        if (zzD(obj)) {
            obj2.getClass();
            for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
                int zzp = zzp(i10);
                int i11 = this.zzc[i10];
                long j10 = (long) (1048575 & zzp);
                switch (zzo(zzp)) {
                    case 0:
                        if (!zzA(obj2, i10)) {
                            break;
                        } else {
                            zzaji.zzo(obj, j10, zzaji.zza(obj2, j10));
                            zzw(obj, i10);
                            break;
                        }
                    case 1:
                        if (!zzA(obj2, i10)) {
                            break;
                        } else {
                            zzaji.zzp(obj, j10, zzaji.zzb(obj2, j10));
                            zzw(obj, i10);
                            break;
                        }
                    case 2:
                        if (!zzA(obj2, i10)) {
                            break;
                        } else {
                            zzaji.zzr(obj, j10, zzaji.zzd(obj2, j10));
                            zzw(obj, i10);
                            break;
                        }
                    case 3:
                        if (!zzA(obj2, i10)) {
                            break;
                        } else {
                            zzaji.zzr(obj, j10, zzaji.zzd(obj2, j10));
                            zzw(obj, i10);
                            break;
                        }
                    case 4:
                        if (!zzA(obj2, i10)) {
                            break;
                        } else {
                            zzaji.zzq(obj, j10, zzaji.zzc(obj2, j10));
                            zzw(obj, i10);
                            break;
                        }
                    case 5:
                        if (!zzA(obj2, i10)) {
                            break;
                        } else {
                            zzaji.zzr(obj, j10, zzaji.zzd(obj2, j10));
                            zzw(obj, i10);
                            break;
                        }
                    case 6:
                        if (!zzA(obj2, i10)) {
                            break;
                        } else {
                            zzaji.zzq(obj, j10, zzaji.zzc(obj2, j10));
                            zzw(obj, i10);
                            break;
                        }
                    case 7:
                        if (!zzA(obj2, i10)) {
                            break;
                        } else {
                            zzaji.zzm(obj, j10, zzaji.zzw(obj2, j10));
                            zzw(obj, i10);
                            break;
                        }
                    case 8:
                        if (!zzA(obj2, i10)) {
                            break;
                        } else {
                            zzaji.zzs(obj, j10, zzaji.zzf(obj2, j10));
                            zzw(obj, i10);
                            break;
                        }
                    case 9:
                        zzu(obj, obj2, i10);
                        break;
                    case 10:
                        if (!zzA(obj2, i10)) {
                            break;
                        } else {
                            zzaji.zzs(obj, j10, zzaji.zzf(obj2, j10));
                            zzw(obj, i10);
                            break;
                        }
                    case 11:
                        if (!zzA(obj2, i10)) {
                            break;
                        } else {
                            zzaji.zzq(obj, j10, zzaji.zzc(obj2, j10));
                            zzw(obj, i10);
                            break;
                        }
                    case 12:
                        if (!zzA(obj2, i10)) {
                            break;
                        } else {
                            zzaji.zzq(obj, j10, zzaji.zzc(obj2, j10));
                            zzw(obj, i10);
                            break;
                        }
                    case 13:
                        if (!zzA(obj2, i10)) {
                            break;
                        } else {
                            zzaji.zzq(obj, j10, zzaji.zzc(obj2, j10));
                            zzw(obj, i10);
                            break;
                        }
                    case 14:
                        if (!zzA(obj2, i10)) {
                            break;
                        } else {
                            zzaji.zzr(obj, j10, zzaji.zzd(obj2, j10));
                            zzw(obj, i10);
                            break;
                        }
                    case 15:
                        if (!zzA(obj2, i10)) {
                            break;
                        } else {
                            zzaji.zzq(obj, j10, zzaji.zzc(obj2, j10));
                            zzw(obj, i10);
                            break;
                        }
                    case 16:
                        if (!zzA(obj2, i10)) {
                            break;
                        } else {
                            zzaji.zzr(obj, j10, zzaji.zzd(obj2, j10));
                            zzw(obj, i10);
                            break;
                        }
                    case 17:
                        zzu(obj, obj2, i10);
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
                    case ImageFormat.YUV_420_888 /*35*/:
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
                        this.zzi.zzb(obj, obj2, j10);
                        break;
                    case 50:
                        int i12 = zzaij.zza;
                        zzahq zzahq = (zzahq) zzaji.zzf(obj, j10);
                        zzahq zzahq2 = (zzahq) zzaji.zzf(obj2, j10);
                        if (!zzahq2.isEmpty()) {
                            if (!zzahq.zzd()) {
                                zzahq = zzahq.zza();
                            }
                            zzahq.zzc(zzahq2);
                        }
                        zzaji.zzs(obj, j10, zzahq);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!zzE(obj2, i11, i10)) {
                            break;
                        } else {
                            zzaji.zzs(obj, j10, zzaji.zzf(obj2, j10));
                            zzx(obj, i11, i10);
                            break;
                        }
                    case 60:
                        zzv(obj, obj2, i10);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!zzE(obj2, i11, i10)) {
                            break;
                        } else {
                            zzaji.zzs(obj, j10, zzaji.zzf(obj2, j10));
                            zzx(obj, i11, i10);
                            break;
                        }
                    case 68:
                        zzv(obj, obj2, i10);
                        break;
                }
            }
            zzaij.zzA(this.zzj, obj, obj2);
            if (this.zzf) {
                this.zzk.zza(obj2);
                throw null;
            }
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:167:0x049d, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x06ac, code lost:
        r14 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x08a8, code lost:
        r8 = r8 + 3;
        r6 = r14;
        r7 = 1048575;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzf(java.lang.Object r17, com.google.android.libraries.places.internal.zzajp r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            com.google.android.libraries.places.internal.zzajn r3 = com.google.android.libraries.places.internal.zzajn.DOUBLE
            int r3 = r0.zzl
            int r3 = r3 + -1
            r4 = 0
            r5 = 1
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            if (r3 == 0) goto L_0x0466
            boolean r3 = r0.zzf
            if (r3 != 0) goto L_0x0460
            int[] r3 = r0.zzc
            int r3 = r3.length
            r4 = r6
        L_0x001c:
            if (r4 >= r3) goto L_0x0456
            int r8 = r0.zzp(r4)
            int[] r9 = r0.zzc
            r9 = r9[r4]
            int r10 = zzo(r8)
            switch(r10) {
                case 0: goto L_0x0443;
                case 1: goto L_0x0433;
                case 2: goto L_0x0423;
                case 3: goto L_0x0413;
                case 4: goto L_0x0403;
                case 5: goto L_0x03f3;
                case 6: goto L_0x03e3;
                case 7: goto L_0x03d2;
                case 8: goto L_0x03c1;
                case 9: goto L_0x03ac;
                case 10: goto L_0x0399;
                case 11: goto L_0x0388;
                case 12: goto L_0x0377;
                case 13: goto L_0x0366;
                case 14: goto L_0x0355;
                case 15: goto L_0x0344;
                case 16: goto L_0x0333;
                case 17: goto L_0x031e;
                case 18: goto L_0x0311;
                case 19: goto L_0x0304;
                case 20: goto L_0x02f7;
                case 21: goto L_0x02ea;
                case 22: goto L_0x02dd;
                case 23: goto L_0x02d0;
                case 24: goto L_0x02c3;
                case 25: goto L_0x02b6;
                case 26: goto L_0x02a9;
                case 27: goto L_0x0298;
                case 28: goto L_0x028b;
                case 29: goto L_0x027e;
                case 30: goto L_0x0271;
                case 31: goto L_0x0264;
                case 32: goto L_0x0257;
                case 33: goto L_0x024a;
                case 34: goto L_0x023d;
                case 35: goto L_0x0230;
                case 36: goto L_0x0223;
                case 37: goto L_0x0216;
                case 38: goto L_0x0209;
                case 39: goto L_0x01fc;
                case 40: goto L_0x01ef;
                case 41: goto L_0x01e2;
                case 42: goto L_0x01d5;
                case 43: goto L_0x01c8;
                case 44: goto L_0x01bb;
                case 45: goto L_0x01ae;
                case 46: goto L_0x01a1;
                case 47: goto L_0x0194;
                case 48: goto L_0x0187;
                case 49: goto L_0x0176;
                case 50: goto L_0x016b;
                case 51: goto L_0x015a;
                case 52: goto L_0x0149;
                case 53: goto L_0x0138;
                case 54: goto L_0x0127;
                case 55: goto L_0x0116;
                case 56: goto L_0x0105;
                case 57: goto L_0x00f4;
                case 58: goto L_0x00e3;
                case 59: goto L_0x00d2;
                case 60: goto L_0x00bd;
                case 61: goto L_0x00aa;
                case 62: goto L_0x0099;
                case 63: goto L_0x0088;
                case 64: goto L_0x0077;
                case 65: goto L_0x0066;
                case 66: goto L_0x0055;
                case 67: goto L_0x0044;
                case 68: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0452
        L_0x002f:
            boolean r10 = r0.zzE(r1, r9, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            com.google.android.libraries.places.internal.zzaih r10 = r0.zzr(r4)
            r2.zzp(r9, r8, r10)
            goto L_0x0452
        L_0x0044:
            boolean r10 = r0.zzE(r1, r9, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = zzq(r1, r10)
            r2.zzB(r9, r10)
            goto L_0x0452
        L_0x0055:
            boolean r10 = r0.zzE(r1, r9, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = zzm(r1, r10)
            r2.zzz(r9, r8)
            goto L_0x0452
        L_0x0066:
            boolean r10 = r0.zzE(r1, r9, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = zzq(r1, r10)
            r2.zzx(r9, r10)
            goto L_0x0452
        L_0x0077:
            boolean r10 = r0.zzE(r1, r9, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = zzm(r1, r10)
            r2.zzv(r9, r8)
            goto L_0x0452
        L_0x0088:
            boolean r10 = r0.zzE(r1, r9, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = zzm(r1, r10)
            r2.zzh(r9, r8)
            goto L_0x0452
        L_0x0099:
            boolean r10 = r0.zzE(r1, r9, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = zzm(r1, r10)
            r2.zzF(r9, r8)
            goto L_0x0452
        L_0x00aa:
            boolean r10 = r0.zzE(r1, r9, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            com.google.android.libraries.places.internal.zzaft r8 = (com.google.android.libraries.places.internal.zzaft) r8
            r2.zzd(r9, r8)
            goto L_0x0452
        L_0x00bd:
            boolean r10 = r0.zzE(r1, r9, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            com.google.android.libraries.places.internal.zzaih r10 = r0.zzr(r4)
            r2.zzu(r9, r8, r10)
            goto L_0x0452
        L_0x00d2:
            boolean r10 = r0.zzE(r1, r9, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            zzG(r9, r8, r2)
            goto L_0x0452
        L_0x00e3:
            boolean r10 = r0.zzE(r1, r9, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            boolean r8 = zzF(r1, r10)
            r2.zzb(r9, r8)
            goto L_0x0452
        L_0x00f4:
            boolean r10 = r0.zzE(r1, r9, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = zzm(r1, r10)
            r2.zzj(r9, r8)
            goto L_0x0452
        L_0x0105:
            boolean r10 = r0.zzE(r1, r9, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = zzq(r1, r10)
            r2.zzl(r9, r10)
            goto L_0x0452
        L_0x0116:
            boolean r10 = r0.zzE(r1, r9, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = zzm(r1, r10)
            r2.zzq(r9, r8)
            goto L_0x0452
        L_0x0127:
            boolean r10 = r0.zzE(r1, r9, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = zzq(r1, r10)
            r2.zzH(r9, r10)
            goto L_0x0452
        L_0x0138:
            boolean r10 = r0.zzE(r1, r9, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = zzq(r1, r10)
            r2.zzs(r9, r10)
            goto L_0x0452
        L_0x0149:
            boolean r10 = r0.zzE(r1, r9, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            float r8 = zzk(r1, r10)
            r2.zzn(r9, r8)
            goto L_0x0452
        L_0x015a:
            boolean r10 = r0.zzE(r1, r9, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            double r10 = zzj(r1, r10)
            r2.zzf(r9, r10)
            goto L_0x0452
        L_0x016b:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            r0.zzy(r2, r9, r8, r4)
            goto L_0x0452
        L_0x0176:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaih r10 = r0.zzr(r4)
            com.google.android.libraries.places.internal.zzaij.zzJ(r9, r8, r2, r10)
            goto L_0x0452
        L_0x0187:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzQ(r9, r8, r2, r5)
            goto L_0x0452
        L_0x0194:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzP(r9, r8, r2, r5)
            goto L_0x0452
        L_0x01a1:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzO(r9, r8, r2, r5)
            goto L_0x0452
        L_0x01ae:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzN(r9, r8, r2, r5)
            goto L_0x0452
        L_0x01bb:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzF(r9, r8, r2, r5)
            goto L_0x0452
        L_0x01c8:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzS(r9, r8, r2, r5)
            goto L_0x0452
        L_0x01d5:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzC(r9, r8, r2, r5)
            goto L_0x0452
        L_0x01e2:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzG(r9, r8, r2, r5)
            goto L_0x0452
        L_0x01ef:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzH(r9, r8, r2, r5)
            goto L_0x0452
        L_0x01fc:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzK(r9, r8, r2, r5)
            goto L_0x0452
        L_0x0209:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzT(r9, r8, r2, r5)
            goto L_0x0452
        L_0x0216:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzL(r9, r8, r2, r5)
            goto L_0x0452
        L_0x0223:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzI(r9, r8, r2, r5)
            goto L_0x0452
        L_0x0230:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzE(r9, r8, r2, r5)
            goto L_0x0452
        L_0x023d:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzQ(r9, r8, r2, r6)
            goto L_0x0452
        L_0x024a:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzP(r9, r8, r2, r6)
            goto L_0x0452
        L_0x0257:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzO(r9, r8, r2, r6)
            goto L_0x0452
        L_0x0264:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzN(r9, r8, r2, r6)
            goto L_0x0452
        L_0x0271:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzF(r9, r8, r2, r6)
            goto L_0x0452
        L_0x027e:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzS(r9, r8, r2, r6)
            goto L_0x0452
        L_0x028b:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzD(r9, r8, r2)
            goto L_0x0452
        L_0x0298:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaih r10 = r0.zzr(r4)
            com.google.android.libraries.places.internal.zzaij.zzM(r9, r8, r2, r10)
            goto L_0x0452
        L_0x02a9:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzR(r9, r8, r2)
            goto L_0x0452
        L_0x02b6:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzC(r9, r8, r2, r6)
            goto L_0x0452
        L_0x02c3:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzG(r9, r8, r2, r6)
            goto L_0x0452
        L_0x02d0:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzH(r9, r8, r2, r6)
            goto L_0x0452
        L_0x02dd:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzK(r9, r8, r2, r6)
            goto L_0x0452
        L_0x02ea:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzT(r9, r8, r2, r6)
            goto L_0x0452
        L_0x02f7:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzL(r9, r8, r2, r6)
            goto L_0x0452
        L_0x0304:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzI(r9, r8, r2, r6)
            goto L_0x0452
        L_0x0311:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.libraries.places.internal.zzaij.zzE(r9, r8, r2, r6)
            goto L_0x0452
        L_0x031e:
            boolean r10 = r0.zzA(r1, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            com.google.android.libraries.places.internal.zzaih r10 = r0.zzr(r4)
            r2.zzp(r9, r8, r10)
            goto L_0x0452
        L_0x0333:
            boolean r10 = r0.zzA(r1, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = com.google.android.libraries.places.internal.zzaji.zzd(r1, r10)
            r2.zzB(r9, r10)
            goto L_0x0452
        L_0x0344:
            boolean r10 = r0.zzA(r1, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.google.android.libraries.places.internal.zzaji.zzc(r1, r10)
            r2.zzz(r9, r8)
            goto L_0x0452
        L_0x0355:
            boolean r10 = r0.zzA(r1, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = com.google.android.libraries.places.internal.zzaji.zzd(r1, r10)
            r2.zzx(r9, r10)
            goto L_0x0452
        L_0x0366:
            boolean r10 = r0.zzA(r1, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.google.android.libraries.places.internal.zzaji.zzc(r1, r10)
            r2.zzv(r9, r8)
            goto L_0x0452
        L_0x0377:
            boolean r10 = r0.zzA(r1, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.google.android.libraries.places.internal.zzaji.zzc(r1, r10)
            r2.zzh(r9, r8)
            goto L_0x0452
        L_0x0388:
            boolean r10 = r0.zzA(r1, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.google.android.libraries.places.internal.zzaji.zzc(r1, r10)
            r2.zzF(r9, r8)
            goto L_0x0452
        L_0x0399:
            boolean r10 = r0.zzA(r1, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            com.google.android.libraries.places.internal.zzaft r8 = (com.google.android.libraries.places.internal.zzaft) r8
            r2.zzd(r9, r8)
            goto L_0x0452
        L_0x03ac:
            boolean r10 = r0.zzA(r1, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            com.google.android.libraries.places.internal.zzaih r10 = r0.zzr(r4)
            r2.zzu(r9, r8, r10)
            goto L_0x0452
        L_0x03c1:
            boolean r10 = r0.zzA(r1, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.libraries.places.internal.zzaji.zzf(r1, r10)
            zzG(r9, r8, r2)
            goto L_0x0452
        L_0x03d2:
            boolean r10 = r0.zzA(r1, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            boolean r8 = com.google.android.libraries.places.internal.zzaji.zzw(r1, r10)
            r2.zzb(r9, r8)
            goto L_0x0452
        L_0x03e3:
            boolean r10 = r0.zzA(r1, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.google.android.libraries.places.internal.zzaji.zzc(r1, r10)
            r2.zzj(r9, r8)
            goto L_0x0452
        L_0x03f3:
            boolean r10 = r0.zzA(r1, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = com.google.android.libraries.places.internal.zzaji.zzd(r1, r10)
            r2.zzl(r9, r10)
            goto L_0x0452
        L_0x0403:
            boolean r10 = r0.zzA(r1, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.google.android.libraries.places.internal.zzaji.zzc(r1, r10)
            r2.zzq(r9, r8)
            goto L_0x0452
        L_0x0413:
            boolean r10 = r0.zzA(r1, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = com.google.android.libraries.places.internal.zzaji.zzd(r1, r10)
            r2.zzH(r9, r10)
            goto L_0x0452
        L_0x0423:
            boolean r10 = r0.zzA(r1, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = com.google.android.libraries.places.internal.zzaji.zzd(r1, r10)
            r2.zzs(r9, r10)
            goto L_0x0452
        L_0x0433:
            boolean r10 = r0.zzA(r1, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            float r8 = com.google.android.libraries.places.internal.zzaji.zzb(r1, r10)
            r2.zzn(r9, r8)
            goto L_0x0452
        L_0x0443:
            boolean r10 = r0.zzA(r1, r4)
            if (r10 == 0) goto L_0x0452
            r8 = r8 & r7
            long r10 = (long) r8
            double r10 = com.google.android.libraries.places.internal.zzaji.zza(r1, r10)
            r2.zzf(r9, r10)
        L_0x0452:
            int r4 = r4 + 3
            goto L_0x001c
        L_0x0456:
            com.google.android.libraries.places.internal.zzaiy r3 = r0.zzj
            java.lang.Object r1 = r3.zzc(r1)
            r3.zzg(r1, r2)
            return
        L_0x0460:
            com.google.android.libraries.places.internal.zzage r2 = r0.zzk
            r2.zza(r1)
            throw r4
        L_0x0466:
            boolean r3 = r0.zzf
            if (r3 != 0) goto L_0x08ba
            int[] r3 = r0.zzc
            int r3 = r3.length
            sun.misc.Unsafe r4 = zzb
            r8 = r6
            r10 = r8
            r9 = r7
        L_0x0472:
            if (r8 >= r3) goto L_0x08b0
            int r11 = r0.zzp(r8)
            int[] r12 = r0.zzc
            r13 = r12[r8]
            int r14 = zzo(r11)
            r15 = 17
            if (r14 > r15) goto L_0x0497
            int r15 = r8 + 2
            r12 = r12[r15]
            r15 = r12 & r7
            if (r15 == r9) goto L_0x0492
            long r9 = (long) r15
            int r10 = r4.getInt(r1, r9)
            r9 = r15
        L_0x0492:
            int r12 = r12 >>> 20
            int r12 = r5 << r12
            goto L_0x0498
        L_0x0497:
            r12 = r6
        L_0x0498:
            r11 = r11 & r7
            long r6 = (long) r11
            switch(r14) {
                case 0: goto L_0x089c;
                case 1: goto L_0x088f;
                case 2: goto L_0x0882;
                case 3: goto L_0x0875;
                case 4: goto L_0x0868;
                case 5: goto L_0x085b;
                case 6: goto L_0x084e;
                case 7: goto L_0x0841;
                case 8: goto L_0x0833;
                case 9: goto L_0x0821;
                case 10: goto L_0x0811;
                case 11: goto L_0x0803;
                case 12: goto L_0x07f5;
                case 13: goto L_0x07e7;
                case 14: goto L_0x07d9;
                case 15: goto L_0x07cb;
                case 16: goto L_0x07bd;
                case 17: goto L_0x07ab;
                case 18: goto L_0x079b;
                case 19: goto L_0x078b;
                case 20: goto L_0x077b;
                case 21: goto L_0x076b;
                case 22: goto L_0x075b;
                case 23: goto L_0x074b;
                case 24: goto L_0x073b;
                case 25: goto L_0x072b;
                case 26: goto L_0x071c;
                case 27: goto L_0x0709;
                case 28: goto L_0x06fa;
                case 29: goto L_0x06eb;
                case 30: goto L_0x06dc;
                case 31: goto L_0x06cd;
                case 32: goto L_0x06be;
                case 33: goto L_0x06af;
                case 34: goto L_0x069e;
                case 35: goto L_0x068f;
                case 36: goto L_0x0680;
                case 37: goto L_0x0671;
                case 38: goto L_0x0662;
                case 39: goto L_0x0653;
                case 40: goto L_0x0644;
                case 41: goto L_0x0635;
                case 42: goto L_0x0626;
                case 43: goto L_0x0617;
                case 44: goto L_0x0608;
                case 45: goto L_0x05f9;
                case 46: goto L_0x05ea;
                case 47: goto L_0x05db;
                case 48: goto L_0x05cc;
                case 49: goto L_0x05b9;
                case 50: goto L_0x05b0;
                case 51: goto L_0x05a1;
                case 52: goto L_0x0592;
                case 53: goto L_0x0583;
                case 54: goto L_0x0574;
                case 55: goto L_0x0565;
                case 56: goto L_0x0556;
                case 57: goto L_0x0547;
                case 58: goto L_0x0538;
                case 59: goto L_0x0529;
                case 60: goto L_0x0516;
                case 61: goto L_0x0506;
                case 62: goto L_0x04f8;
                case 63: goto L_0x04ea;
                case 64: goto L_0x04dc;
                case 65: goto L_0x04ce;
                case 66: goto L_0x04c0;
                case 67: goto L_0x04b2;
                case 68: goto L_0x04a0;
                default: goto L_0x049d;
            }
        L_0x049d:
            r14 = 0
            goto L_0x08a8
        L_0x04a0:
            boolean r11 = r0.zzE(r1, r13, r8)
            if (r11 == 0) goto L_0x049d
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.google.android.libraries.places.internal.zzaih r7 = r0.zzr(r8)
            r2.zzp(r13, r6, r7)
            goto L_0x049d
        L_0x04b2:
            boolean r11 = r0.zzE(r1, r13, r8)
            if (r11 == 0) goto L_0x049d
            long r6 = zzq(r1, r6)
            r2.zzB(r13, r6)
            goto L_0x049d
        L_0x04c0:
            boolean r11 = r0.zzE(r1, r13, r8)
            if (r11 == 0) goto L_0x049d
            int r6 = zzm(r1, r6)
            r2.zzz(r13, r6)
            goto L_0x049d
        L_0x04ce:
            boolean r11 = r0.zzE(r1, r13, r8)
            if (r11 == 0) goto L_0x049d
            long r6 = zzq(r1, r6)
            r2.zzx(r13, r6)
            goto L_0x049d
        L_0x04dc:
            boolean r11 = r0.zzE(r1, r13, r8)
            if (r11 == 0) goto L_0x049d
            int r6 = zzm(r1, r6)
            r2.zzv(r13, r6)
            goto L_0x049d
        L_0x04ea:
            boolean r11 = r0.zzE(r1, r13, r8)
            if (r11 == 0) goto L_0x049d
            int r6 = zzm(r1, r6)
            r2.zzh(r13, r6)
            goto L_0x049d
        L_0x04f8:
            boolean r11 = r0.zzE(r1, r13, r8)
            if (r11 == 0) goto L_0x049d
            int r6 = zzm(r1, r6)
            r2.zzF(r13, r6)
            goto L_0x049d
        L_0x0506:
            boolean r11 = r0.zzE(r1, r13, r8)
            if (r11 == 0) goto L_0x049d
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.google.android.libraries.places.internal.zzaft r6 = (com.google.android.libraries.places.internal.zzaft) r6
            r2.zzd(r13, r6)
            goto L_0x049d
        L_0x0516:
            boolean r11 = r0.zzE(r1, r13, r8)
            if (r11 == 0) goto L_0x049d
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.google.android.libraries.places.internal.zzaih r7 = r0.zzr(r8)
            r2.zzu(r13, r6, r7)
            goto L_0x049d
        L_0x0529:
            boolean r11 = r0.zzE(r1, r13, r8)
            if (r11 == 0) goto L_0x049d
            java.lang.Object r6 = r4.getObject(r1, r6)
            zzG(r13, r6, r2)
            goto L_0x049d
        L_0x0538:
            boolean r11 = r0.zzE(r1, r13, r8)
            if (r11 == 0) goto L_0x049d
            boolean r6 = zzF(r1, r6)
            r2.zzb(r13, r6)
            goto L_0x049d
        L_0x0547:
            boolean r11 = r0.zzE(r1, r13, r8)
            if (r11 == 0) goto L_0x049d
            int r6 = zzm(r1, r6)
            r2.zzj(r13, r6)
            goto L_0x049d
        L_0x0556:
            boolean r11 = r0.zzE(r1, r13, r8)
            if (r11 == 0) goto L_0x049d
            long r6 = zzq(r1, r6)
            r2.zzl(r13, r6)
            goto L_0x049d
        L_0x0565:
            boolean r11 = r0.zzE(r1, r13, r8)
            if (r11 == 0) goto L_0x049d
            int r6 = zzm(r1, r6)
            r2.zzq(r13, r6)
            goto L_0x049d
        L_0x0574:
            boolean r11 = r0.zzE(r1, r13, r8)
            if (r11 == 0) goto L_0x049d
            long r6 = zzq(r1, r6)
            r2.zzH(r13, r6)
            goto L_0x049d
        L_0x0583:
            boolean r11 = r0.zzE(r1, r13, r8)
            if (r11 == 0) goto L_0x049d
            long r6 = zzq(r1, r6)
            r2.zzs(r13, r6)
            goto L_0x049d
        L_0x0592:
            boolean r11 = r0.zzE(r1, r13, r8)
            if (r11 == 0) goto L_0x049d
            float r6 = zzk(r1, r6)
            r2.zzn(r13, r6)
            goto L_0x049d
        L_0x05a1:
            boolean r11 = r0.zzE(r1, r13, r8)
            if (r11 == 0) goto L_0x049d
            double r6 = zzj(r1, r6)
            r2.zzf(r13, r6)
            goto L_0x049d
        L_0x05b0:
            java.lang.Object r6 = r4.getObject(r1, r6)
            r0.zzy(r2, r13, r6, r8)
            goto L_0x049d
        L_0x05b9:
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaih r7 = r0.zzr(r8)
            com.google.android.libraries.places.internal.zzaij.zzJ(r11, r6, r2, r7)
            goto L_0x049d
        L_0x05cc:
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzQ(r11, r6, r2, r5)
            goto L_0x049d
        L_0x05db:
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzP(r11, r6, r2, r5)
            goto L_0x049d
        L_0x05ea:
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzO(r11, r6, r2, r5)
            goto L_0x049d
        L_0x05f9:
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzN(r11, r6, r2, r5)
            goto L_0x049d
        L_0x0608:
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzF(r11, r6, r2, r5)
            goto L_0x049d
        L_0x0617:
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzS(r11, r6, r2, r5)
            goto L_0x049d
        L_0x0626:
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzC(r11, r6, r2, r5)
            goto L_0x049d
        L_0x0635:
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzG(r11, r6, r2, r5)
            goto L_0x049d
        L_0x0644:
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzH(r11, r6, r2, r5)
            goto L_0x049d
        L_0x0653:
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzK(r11, r6, r2, r5)
            goto L_0x049d
        L_0x0662:
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzT(r11, r6, r2, r5)
            goto L_0x049d
        L_0x0671:
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzL(r11, r6, r2, r5)
            goto L_0x049d
        L_0x0680:
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzI(r11, r6, r2, r5)
            goto L_0x049d
        L_0x068f:
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzE(r11, r6, r2, r5)
            goto L_0x049d
        L_0x069e:
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r12 = 0
            com.google.android.libraries.places.internal.zzaij.zzQ(r11, r6, r2, r12)
        L_0x06ac:
            r14 = r12
            goto L_0x08a8
        L_0x06af:
            r12 = 0
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzP(r11, r6, r2, r12)
            goto L_0x06ac
        L_0x06be:
            r12 = 0
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzO(r11, r6, r2, r12)
            goto L_0x06ac
        L_0x06cd:
            r12 = 0
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzN(r11, r6, r2, r12)
            goto L_0x06ac
        L_0x06dc:
            r12 = 0
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzF(r11, r6, r2, r12)
            goto L_0x06ac
        L_0x06eb:
            r12 = 0
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzS(r11, r6, r2, r12)
            goto L_0x06ac
        L_0x06fa:
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzD(r11, r6, r2)
            goto L_0x049d
        L_0x0709:
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaih r7 = r0.zzr(r8)
            com.google.android.libraries.places.internal.zzaij.zzM(r11, r6, r2, r7)
            goto L_0x049d
        L_0x071c:
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzR(r11, r6, r2)
            goto L_0x049d
        L_0x072b:
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r14 = 0
            com.google.android.libraries.places.internal.zzaij.zzC(r11, r6, r2, r14)
            goto L_0x08a8
        L_0x073b:
            r14 = 0
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzG(r11, r6, r2, r14)
            goto L_0x08a8
        L_0x074b:
            r14 = 0
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzH(r11, r6, r2, r14)
            goto L_0x08a8
        L_0x075b:
            r14 = 0
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzK(r11, r6, r2, r14)
            goto L_0x08a8
        L_0x076b:
            r14 = 0
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzT(r11, r6, r2, r14)
            goto L_0x08a8
        L_0x077b:
            r14 = 0
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzL(r11, r6, r2, r14)
            goto L_0x08a8
        L_0x078b:
            r14 = 0
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzI(r11, r6, r2, r14)
            goto L_0x08a8
        L_0x079b:
            r14 = 0
            int[] r11 = r0.zzc
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.libraries.places.internal.zzaij.zzE(r11, r6, r2, r14)
            goto L_0x08a8
        L_0x07ab:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a8
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.google.android.libraries.places.internal.zzaih r7 = r0.zzr(r8)
            r2.zzp(r13, r6, r7)
            goto L_0x08a8
        L_0x07bd:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a8
            long r6 = r4.getLong(r1, r6)
            r2.zzB(r13, r6)
            goto L_0x08a8
        L_0x07cb:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a8
            int r6 = r4.getInt(r1, r6)
            r2.zzz(r13, r6)
            goto L_0x08a8
        L_0x07d9:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a8
            long r6 = r4.getLong(r1, r6)
            r2.zzx(r13, r6)
            goto L_0x08a8
        L_0x07e7:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a8
            int r6 = r4.getInt(r1, r6)
            r2.zzv(r13, r6)
            goto L_0x08a8
        L_0x07f5:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a8
            int r6 = r4.getInt(r1, r6)
            r2.zzh(r13, r6)
            goto L_0x08a8
        L_0x0803:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a8
            int r6 = r4.getInt(r1, r6)
            r2.zzF(r13, r6)
            goto L_0x08a8
        L_0x0811:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a8
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.google.android.libraries.places.internal.zzaft r6 = (com.google.android.libraries.places.internal.zzaft) r6
            r2.zzd(r13, r6)
            goto L_0x08a8
        L_0x0821:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a8
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.google.android.libraries.places.internal.zzaih r7 = r0.zzr(r8)
            r2.zzu(r13, r6, r7)
            goto L_0x08a8
        L_0x0833:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a8
            java.lang.Object r6 = r4.getObject(r1, r6)
            zzG(r13, r6, r2)
            goto L_0x08a8
        L_0x0841:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a8
            boolean r6 = com.google.android.libraries.places.internal.zzaji.zzw(r1, r6)
            r2.zzb(r13, r6)
            goto L_0x08a8
        L_0x084e:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a8
            int r6 = r4.getInt(r1, r6)
            r2.zzj(r13, r6)
            goto L_0x08a8
        L_0x085b:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a8
            long r6 = r4.getLong(r1, r6)
            r2.zzl(r13, r6)
            goto L_0x08a8
        L_0x0868:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a8
            int r6 = r4.getInt(r1, r6)
            r2.zzq(r13, r6)
            goto L_0x08a8
        L_0x0875:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a8
            long r6 = r4.getLong(r1, r6)
            r2.zzH(r13, r6)
            goto L_0x08a8
        L_0x0882:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a8
            long r6 = r4.getLong(r1, r6)
            r2.zzs(r13, r6)
            goto L_0x08a8
        L_0x088f:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a8
            float r6 = com.google.android.libraries.places.internal.zzaji.zzb(r1, r6)
            r2.zzn(r13, r6)
            goto L_0x08a8
        L_0x089c:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a8
            double r6 = com.google.android.libraries.places.internal.zzaji.zza(r1, r6)
            r2.zzf(r13, r6)
        L_0x08a8:
            int r8 = r8 + 3
            r6 = r14
            r7 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0472
        L_0x08b0:
            com.google.android.libraries.places.internal.zzaiy r3 = r0.zzj
            java.lang.Object r1 = r3.zzc(r1)
            r3.zzg(r1, r2)
            return
        L_0x08ba:
            com.google.android.libraries.places.internal.zzage r2 = r0.zzk
            r2.zza(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzahz.zzf(java.lang.Object, com.google.android.libraries.places.internal.zzajp):void");
    }

    public final boolean zzg(Object obj, Object obj2) {
        boolean z10;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzp = zzp(i10);
            long j10 = (long) (zzp & 1048575);
            switch (zzo(zzp)) {
                case 0:
                    if (zzz(obj, obj2, i10) && Double.doubleToLongBits(zzaji.zza(obj, j10)) == Double.doubleToLongBits(zzaji.zza(obj2, j10))) {
                        continue;
                    }
                case 1:
                    if (zzz(obj, obj2, i10) && Float.floatToIntBits(zzaji.zzb(obj, j10)) == Float.floatToIntBits(zzaji.zzb(obj2, j10))) {
                        continue;
                    }
                case 2:
                    if (zzz(obj, obj2, i10) && zzaji.zzd(obj, j10) == zzaji.zzd(obj2, j10)) {
                        continue;
                    }
                case 3:
                    if (zzz(obj, obj2, i10) && zzaji.zzd(obj, j10) == zzaji.zzd(obj2, j10)) {
                        continue;
                    }
                case 4:
                    if (zzz(obj, obj2, i10) && zzaji.zzc(obj, j10) == zzaji.zzc(obj2, j10)) {
                        continue;
                    }
                case 5:
                    if (zzz(obj, obj2, i10) && zzaji.zzd(obj, j10) == zzaji.zzd(obj2, j10)) {
                        continue;
                    }
                case 6:
                    if (zzz(obj, obj2, i10) && zzaji.zzc(obj, j10) == zzaji.zzc(obj2, j10)) {
                        continue;
                    }
                case 7:
                    if (zzz(obj, obj2, i10) && zzaji.zzw(obj, j10) == zzaji.zzw(obj2, j10)) {
                        continue;
                    }
                case 8:
                    if (zzz(obj, obj2, i10) && zzaij.zzU(zzaji.zzf(obj, j10), zzaji.zzf(obj2, j10))) {
                        continue;
                    }
                case 9:
                    if (zzz(obj, obj2, i10) && zzaij.zzU(zzaji.zzf(obj, j10), zzaji.zzf(obj2, j10))) {
                        continue;
                    }
                case 10:
                    if (zzz(obj, obj2, i10) && zzaij.zzU(zzaji.zzf(obj, j10), zzaji.zzf(obj2, j10))) {
                        continue;
                    }
                case 11:
                    if (zzz(obj, obj2, i10) && zzaji.zzc(obj, j10) == zzaji.zzc(obj2, j10)) {
                        continue;
                    }
                case 12:
                    if (zzz(obj, obj2, i10) && zzaji.zzc(obj, j10) == zzaji.zzc(obj2, j10)) {
                        continue;
                    }
                case 13:
                    if (zzz(obj, obj2, i10) && zzaji.zzc(obj, j10) == zzaji.zzc(obj2, j10)) {
                        continue;
                    }
                case 14:
                    if (zzz(obj, obj2, i10) && zzaji.zzd(obj, j10) == zzaji.zzd(obj2, j10)) {
                        continue;
                    }
                case 15:
                    if (zzz(obj, obj2, i10) && zzaji.zzc(obj, j10) == zzaji.zzc(obj2, j10)) {
                        continue;
                    }
                case 16:
                    if (zzz(obj, obj2, i10) && zzaji.zzd(obj, j10) == zzaji.zzd(obj2, j10)) {
                        continue;
                    }
                case 17:
                    if (zzz(obj, obj2, i10) && zzaij.zzU(zzaji.zzf(obj, j10), zzaji.zzf(obj2, j10))) {
                        continue;
                    }
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
                case ImageFormat.YUV_420_888 /*35*/:
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
                    z10 = zzaij.zzU(zzaji.zzf(obj, j10), zzaji.zzf(obj2, j10));
                    break;
                case 50:
                    z10 = zzaij.zzU(zzaji.zzf(obj, j10), zzaji.zzf(obj2, j10));
                    break;
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
                    long zzn2 = (long) (zzn(i10) & 1048575);
                    if (zzaji.zzc(obj, zzn2) == zzaji.zzc(obj2, zzn2) && zzaij.zzU(zzaji.zzf(obj, j10), zzaji.zzf(obj2, j10))) {
                        continue;
                    }
            }
            if (!z10) {
                return false;
            }
        }
        if (!this.zzj.zzc(obj).equals(this.zzj.zzc(obj2))) {
            return false;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzk.zza(obj);
        this.zzk.zza(obj2);
        throw null;
    }

    public final boolean zzh(Object obj) {
        int i10;
        int i11;
        Object obj2 = obj;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.zzh) {
            int i15 = this.zzg[i13];
            int i16 = this.zzc[i15];
            int zzp = zzp(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = zzb.getInt(obj2, (long) i18);
                }
                i10 = i12;
                i11 = i18;
            } else {
                i11 = i14;
                i10 = i12;
            }
            if ((268435456 & zzp) != 0 && !zzB(obj, i15, i11, i10, i19)) {
                return false;
            }
            int zzo = zzo(zzp);
            if (zzo != 9 && zzo != 17) {
                if (zzo != 27) {
                    if (zzo == 60 || zzo == 68) {
                        if (zzE(obj2, i16, i15) && !zzC(obj2, zzp, zzr(i15))) {
                            return false;
                        }
                    } else if (zzo != 49) {
                        if (zzo == 50 && !((zzahq) zzaji.zzf(obj2, (long) (zzp & 1048575))).isEmpty()) {
                            zzahp zzahp = (zzahp) zzs(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) zzaji.zzf(obj2, (long) (zzp & 1048575));
                if (!list.isEmpty()) {
                    zzaih zzr = zzr(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzr.zzh(list.get(i20))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzB(obj, i15, i11, i10, i19) && !zzC(obj2, zzp, zzr(i15))) {
                return false;
            }
            i13++;
            i14 = i11;
            i12 = i10;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzk.zza(obj2);
        throw null;
    }
}
