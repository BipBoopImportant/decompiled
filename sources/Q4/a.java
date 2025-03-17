package Q4;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00132\u00020\u0001:\u0001\u000fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"LQ4/a;", "LQ4/j;", "", "query", "", "", "bindArgs", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/String;)V", "LQ4/i;", "statement", "LXH/N;", "d", "(LQ4/i;)V", "a", "Ljava/lang/String;", "b", "[Ljava/lang/Object;", "c", "()Ljava/lang/String;", "sql", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements j {

    /* renamed from: c  reason: collision with root package name */
    public static final C0626a f39563c = new C0626a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f39564a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f39565b;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LQ4/a$a;", "", "<init>", "()V", "LQ4/i;", "statement", "", "index", "arg", "LXH/N;", "a", "(LQ4/i;ILjava/lang/Object;)V", "", "bindArgs", "b", "(LQ4/i;[Ljava/lang/Object;)V", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: Q4.a$a  reason: collision with other inner class name */
    public static final class C0626a {
        public /* synthetic */ C0626a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(i iVar, int i10, Object obj) {
            if (obj == null) {
                iVar.I2(i10);
            } else if (obj instanceof byte[]) {
                iVar.o2(i10, (byte[]) obj);
            } else if (obj instanceof Float) {
                iVar.g0(i10, (double) ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                iVar.g0(i10, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                iVar.i2(i10, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                iVar.i2(i10, (long) ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                iVar.i2(i10, (long) ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                iVar.i2(i10, (long) ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                iVar.H(i10, (String) obj);
            } else if (obj instanceof Boolean) {
                iVar.i2(i10, ((Boolean) obj).booleanValue() ? 1 : 0);
            } else {
                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
            }
        }

        public final void b(i iVar, Object[] objArr) {
            C17542s.j(iVar, "statement");
            if (objArr != null) {
                int length = objArr.length;
                int i10 = 0;
                while (i10 < length) {
                    Object obj = objArr[i10];
                    i10++;
                    a(iVar, i10, obj);
                }
            }
        }

        private C0626a() {
        }
    }

    public a(String str, Object[] objArr) {
        C17542s.j(str, "query");
        this.f39564a = str;
        this.f39565b = objArr;
    }

    public String c() {
        return this.f39564a;
    }

    public void d(i iVar) {
        C17542s.j(iVar, "statement");
        f39563c.b(iVar, this.f39565b);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(String str) {
        this(str, (Object[]) null);
        C17542s.j(str, "query");
    }
}
