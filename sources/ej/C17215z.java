package eJ;

/* renamed from: eJ.z  reason: case insensitive filesystem */
public final class C17215z {

    /* renamed from: a  reason: collision with root package name */
    static final int f143129a = c(1, 3);

    /* renamed from: b  reason: collision with root package name */
    static final int f143130b = c(1, 4);

    /* renamed from: c  reason: collision with root package name */
    static final int f143131c = c(2, 0);

    /* renamed from: d  reason: collision with root package name */
    static final int f143132d = c(3, 2);

    /* renamed from: eJ.z$b */
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
            public boolean j() {
                return false;
            }
        },
        GROUP(r13, 3) {
            public boolean j() {
                return false;
            }
        },
        MESSAGE(r13, 2) {
            public boolean j() {
                return false;
            }
        },
        BYTES(c.BYTE_STRING, 2) {
            public boolean j() {
                return false;
            }
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

        public boolean j() {
            return true;
        }

        private b(c cVar, int i10) {
            this.javaType = cVar;
            this.wireType = i10;
        }
    }

    /* renamed from: eJ.z$c */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(C17193d.f143014a),
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

    static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}
