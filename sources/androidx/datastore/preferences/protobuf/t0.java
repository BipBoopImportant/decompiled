package androidx.datastore.preferences.protobuf;

public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    static final int f21445a = c(1, 3);

    /* renamed from: b  reason: collision with root package name */
    static final int f21446b = c(1, 4);

    /* renamed from: c  reason: collision with root package name */
    static final int f21447c = c(2, 0);

    /* renamed from: d  reason: collision with root package name */
    static final int f21448d = c(3, 2);

    public enum b {
        DOUBLE(c.DOUBLE, 1),
        FLOAT(c.FLOAT, 5),
        INT64(r5, 0),
        UINT64(r5, 0),
        INT32(r11, 0),
        FIXED64(r5, 1),
        FIXED32(r11, 5),
        BOOL(c.BOOLEAN, 0),
        STRING(c.STRING, 2) {
        },
        GROUP(r13, 3) {
        },
        MESSAGE(r13, 2) {
        },
        BYTES(c.BYTE_STRING, 2) {
        },
        UINT32(r11, 0),
        ENUM(c.ENUM, 0),
        SFIXED32(r11, 5),
        SFIXED64(r5, 1),
        SINT32(r11, 0),
        SINT64(r5, 0);
        
        private final c javaType;
        private final int wireType;

        public c a() {
            return this.javaType;
        }

        public int b() {
            return this.wireType;
        }

        private b(c cVar, int i10) {
            this.javaType = cVar;
            this.wireType = i10;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(C5154g.f21312b),
        ENUM((String) null),
        MESSAGE((String) null);
        
        private final Object defaultDefault;

        private c(Object obj) {
            this.defaultDefault = obj;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    public static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}
