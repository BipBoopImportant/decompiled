package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Type;

/* renamed from: com.google.crypto.tink.shaded.protobuf.v  reason: case insensitive filesystem */
public enum C9538v {
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
    MAP(50, b.MAP, C.VOID);
    
    private static final Type[] EMPTY_TYPES = null;
    private static final C9538v[] VALUES = null;
    private final b collection;
    private final Class<?> elementType;

    /* renamed from: id  reason: collision with root package name */
    private final int f68128id;
    private final C javaType;
    private final boolean primitiveScalar;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.v$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f68129a = null;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f68130b = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.google.crypto.tink.shaded.protobuf.C[] r0 = com.google.crypto.tink.shaded.protobuf.C.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f68130b = r0
                r1 = 1
                com.google.crypto.tink.shaded.protobuf.C r2 = com.google.crypto.tink.shaded.protobuf.C.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f68130b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.C r3 = com.google.crypto.tink.shaded.protobuf.C.MESSAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f68130b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.C r4 = com.google.crypto.tink.shaded.protobuf.C.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.crypto.tink.shaded.protobuf.v$b[] r3 = com.google.crypto.tink.shaded.protobuf.C9538v.b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f68129a = r3
                com.google.crypto.tink.shaded.protobuf.v$b r4 = com.google.crypto.tink.shaded.protobuf.C9538v.b.MAP     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f68129a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.crypto.tink.shaded.protobuf.v$b r3 = com.google.crypto.tink.shaded.protobuf.C9538v.b.VECTOR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f68129a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.google.crypto.tink.shaded.protobuf.v$b r1 = com.google.crypto.tink.shaded.protobuf.C9538v.b.SCALAR     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C9538v.a.<clinit>():void");
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.v$b */
    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        
        private final boolean isList;

        private b(boolean z10) {
            this.isList = z10;
        }
    }

    static {
        EMPTY_TYPES = new Type[0];
        C9538v[] values = values();
        VALUES = new C9538v[values.length];
        for (C9538v vVar : values) {
            VALUES[vVar.f68128id] = vVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r1 = com.google.crypto.tink.shaded.protobuf.C9538v.a.f68130b[r5.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C9538v(int r3, com.google.crypto.tink.shaded.protobuf.C9538v.b r4, com.google.crypto.tink.shaded.protobuf.C r5) {
        /*
            r0 = this;
            r0.<init>(r1, r2)
            r0.f68128id = r3
            r0.collection = r4
            r0.javaType = r5
            int[] r1 = com.google.crypto.tink.shaded.protobuf.C9538v.a.f68129a
            int r2 = r4.ordinal()
            r1 = r1[r2]
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L_0x0022
            if (r1 == r2) goto L_0x001b
            r1 = 0
            r0.elementType = r1
            goto L_0x0028
        L_0x001b:
            java.lang.Class r1 = r5.a()
            r0.elementType = r1
            goto L_0x0028
        L_0x0022:
            java.lang.Class r1 = r5.a()
            r0.elementType = r1
        L_0x0028:
            com.google.crypto.tink.shaded.protobuf.v$b r1 = com.google.crypto.tink.shaded.protobuf.C9538v.b.SCALAR
            if (r4 != r1) goto L_0x003c
            int[] r1 = com.google.crypto.tink.shaded.protobuf.C9538v.a.f68130b
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
            r0.primitiveScalar = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C9538v.<init>(java.lang.String, int, int, com.google.crypto.tink.shaded.protobuf.v$b, com.google.crypto.tink.shaded.protobuf.C):void");
    }

    public int a() {
        return this.f68128id;
    }
}
