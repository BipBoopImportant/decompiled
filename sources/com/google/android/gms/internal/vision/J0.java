package com.google.android.gms.internal.vision;

import java.lang.reflect.Type;

public enum J0 {
    DOUBLE(0, r4, r42),
    FLOAT(1, r4, r43),
    INT64(2, r4, r5),
    UINT64(3, r4, r5),
    INT32(4, r4, r54),
    FIXED64(5, r4, r55),
    FIXED32(6, r4, r54),
    BOOL(7, r4, r49),
    STRING(8, r4, r33),
    MESSAGE(9, r4, r56),
    BYTES(10, r4, r35),
    UINT32(11, r4, r54),
    ENUM(12, r4, r51),
    SFIXED32(13, r4, r54),
    SFIXED64(14, r4, r55),
    SINT32(15, r4, r54),
    SINT64(16, r4, r55),
    GROUP(17, r4, r56),
    DOUBLE_LIST(18, r4, r42),
    FLOAT_LIST(19, r4, r43),
    INT64_LIST(20, r4, r5),
    UINT64_LIST(21, r4, r5),
    INT32_LIST(22, r4, r54),
    FIXED64_LIST(23, r4, r55),
    FIXED32_LIST(24, r4, r54),
    BOOL_LIST(25, r4, r49),
    STRING_LIST(26, r4, r33),
    MESSAGE_LIST(27, r4, r56),
    BYTES_LIST(28, r4, r35),
    UINT32_LIST(29, r4, r54),
    ENUM_LIST(30, r4, r51),
    SFIXED32_LIST(31, r4, r54),
    SFIXED64_LIST(32, r4, r55),
    SINT32_LIST(33, r4, r54),
    SINT64_LIST(34, r4, r55),
    DOUBLE_LIST_PACKED(35, r4, r42),
    FLOAT_LIST_PACKED(36, r4, r43),
    INT64_LIST_PACKED(37, r4, r5),
    UINT64_LIST_PACKED(38, r4, r5),
    INT32_LIST_PACKED(39, r4, r54),
    FIXED64_LIST_PACKED(40, r4, r55),
    FIXED32_LIST_PACKED(41, r4, r54),
    BOOL_LIST_PACKED(42, r4, r49),
    UINT32_LIST_PACKED(43, r4, r54),
    ENUM_LIST_PACKED(44, r4, r51),
    SFIXED32_LIST_PACKED(45, r4, r54),
    SFIXED64_LIST_PACKED(46, r4, r55),
    SINT32_LIST_PACKED(47, r4, r54),
    SINT64_LIST_PACKED(48, r4, r55),
    GROUP_LIST(49, r57, r56),
    MAP(50, L0.MAP, C7470b1.VOID);
    
    private static final J0[] zzbe = null;
    private static final Type[] zzbf = null;
    private final C7470b1 zzaz;
    private final int zzba;
    private final L0 zzbb;
    private final Class<?> zzbc;
    private final boolean zzbd;

    static {
        zzbf = new Type[0];
        J0[] values = values();
        zzbe = new J0[values.length];
        for (J0 j02 : values) {
            zzbe[j02.zzba] = j02;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r1 = com.google.android.gms.internal.vision.M0.f49222b[r5.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private J0(int r3, com.google.android.gms.internal.vision.L0 r4, com.google.android.gms.internal.vision.C7470b1 r5) {
        /*
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzba = r3
            r0.zzbb = r4
            r0.zzaz = r5
            int[] r1 = com.google.android.gms.internal.vision.M0.f49221a
            int r2 = r4.ordinal()
            r1 = r1[r2]
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L_0x0022
            if (r1 == r2) goto L_0x001b
            r1 = 0
            r0.zzbc = r1
            goto L_0x0028
        L_0x001b:
            java.lang.Class r1 = r5.a()
            r0.zzbc = r1
            goto L_0x0028
        L_0x0022:
            java.lang.Class r1 = r5.a()
            r0.zzbc = r1
        L_0x0028:
            com.google.android.gms.internal.vision.L0 r1 = com.google.android.gms.internal.vision.L0.SCALAR
            if (r4 != r1) goto L_0x003c
            int[] r1 = com.google.android.gms.internal.vision.M0.f49222b
            int r4 = r5.ordinal()
            r1 = r1[r4]
            if (r1 == r3) goto L_0x003c
            if (r1 == r2) goto L_0x003c
            r2 = 3
            if (r1 == r2) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            r0.zzbd = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.J0.<init>(java.lang.String, int, int, com.google.android.gms.internal.vision.L0, com.google.android.gms.internal.vision.b1):void");
    }

    public final int zza() {
        return this.zzba;
    }
}
