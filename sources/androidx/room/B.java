package androidx.room;

import Q4.i;
import Q4.j;
import XH.C16807N;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\t\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0006J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\u00020'8\u0006X\u0004¢\u0006\f\n\u0004\b(\u0010)\u0012\u0004\b*\u0010\u000eR\u001a\u0010/\u001a\u00020,8\u0006X\u0004¢\u0006\f\n\u0004\b\u0010\u0010-\u0012\u0004\b.\u0010\u000eR\"\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007008\u0006X\u0004¢\u0006\f\n\u0004\b1\u00102\u0012\u0004\b3\u0010\u000eR\"\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d008\u0006X\u0004¢\u0006\f\n\u0004\b5\u00106\u0012\u0004\b7\u0010\u000eR\u001a\u0010<\u001a\u0002098\u0002X\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u0012\u0004\b;\u0010\u000eR$\u0010>\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u00038\u0016@RX\u000e¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b5\u0010$R\u0014\u0010@\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010?¨\u0006B"}, d2 = {"Landroidx/room/B;", "LQ4/j;", "LQ4/i;", "", "capacity", "<init>", "(I)V", "", "query", "initArgCount", "LXH/N;", "g", "(Ljava/lang/String;I)V", "h", "()V", "statement", "d", "(LQ4/i;)V", "index", "I2", "", "value", "i2", "(IJ)V", "", "g0", "(ID)V", "H", "(ILjava/lang/String;)V", "", "o2", "(I[B)V", "close", "a", "I", "getCapacity", "()I", "b", "Ljava/lang/String;", "", "c", "[J", "getLongBindings$annotations", "longBindings", "", "[D", "getDoubleBindings$annotations", "doubleBindings", "", "e", "[Ljava/lang/String;", "getStringBindings$annotations", "stringBindings", "f", "[[B", "getBlobBindings$annotations", "blobBindings", "", "[I", "getBindingTypes$annotations", "bindingTypes", "<set-?>", "argCount", "()Ljava/lang/String;", "sql", "i", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class B implements j, i {

    /* renamed from: i  reason: collision with root package name */
    public static final a f44208i = new a((DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    public static final TreeMap<Integer, B> f44209j = new TreeMap<>();

    /* renamed from: a  reason: collision with root package name */
    private final int f44210a;

    /* renamed from: b  reason: collision with root package name */
    private volatile String f44211b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f44212c;

    /* renamed from: d  reason: collision with root package name */
    public final double[] f44213d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f44214e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[][] f44215f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f44216g;

    /* renamed from: h  reason: collision with root package name */
    private int f44217h;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\u0003R\u0014\u0010\r\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Landroidx/room/B$a;", "", "<init>", "()V", "", "query", "", "argumentCount", "Landroidx/room/B;", "a", "(Ljava/lang/String;I)Landroidx/room/B;", "LXH/N;", "b", "BLOB", "I", "DOUBLE", "LONG", "NULL", "STRING", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final B a(String str, int i10) {
            C17542s.j(str, "query");
            TreeMap<Integer, B> treeMap = B.f44209j;
            synchronized (treeMap) {
                Map.Entry<Integer, B> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (ceilingEntry != null) {
                    treeMap.remove(ceilingEntry.getKey());
                    B value = ceilingEntry.getValue();
                    value.g(str, i10);
                    C17542s.i(value, "sqliteQuery");
                    return value;
                }
                C16807N n10 = C16807N.f139792a;
                B b10 = new B(i10, (DefaultConstructorMarker) null);
                b10.g(str, i10);
                return b10;
            }
        }

        public final void b() {
            TreeMap<Integer, B> treeMap = B.f44209j;
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                C17542s.i(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i10 = size - 1;
                    if (size > 0) {
                        it.next();
                        it.remove();
                        size = i10;
                    } else {
                        return;
                    }
                }
            }
        }

        private a() {
        }
    }

    public /* synthetic */ B(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static final B e(String str, int i10) {
        return f44208i.a(str, i10);
    }

    public void H(int i10, String str) {
        C17542s.j(str, "value");
        this.f44216g[i10] = 4;
        this.f44214e[i10] = str;
    }

    public void I2(int i10) {
        this.f44216g[i10] = 1;
    }

    public String c() {
        String str = this.f44211b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public void close() {
    }

    public void d(i iVar) {
        C17542s.j(iVar, "statement");
        int f10 = f();
        if (1 <= f10) {
            int i10 = 1;
            while (true) {
                int i11 = this.f44216g[i10];
                if (i11 == 1) {
                    iVar.I2(i10);
                } else if (i11 == 2) {
                    iVar.i2(i10, this.f44212c[i10]);
                } else if (i11 == 3) {
                    iVar.g0(i10, this.f44213d[i10]);
                } else if (i11 == 4) {
                    String str = this.f44214e[i10];
                    if (str != null) {
                        iVar.H(i10, str);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else if (i11 == 5) {
                    byte[] bArr = this.f44215f[i10];
                    if (bArr != null) {
                        iVar.o2(i10, bArr);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                if (i10 != f10) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public int f() {
        return this.f44217h;
    }

    public final void g(String str, int i10) {
        C17542s.j(str, "query");
        this.f44211b = str;
        this.f44217h = i10;
    }

    public void g0(int i10, double d10) {
        this.f44216g[i10] = 3;
        this.f44213d[i10] = d10;
    }

    public final void h() {
        TreeMap<Integer, B> treeMap = f44209j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f44210a), this);
            f44208i.b();
            C16807N n10 = C16807N.f139792a;
        }
    }

    public void i2(int i10, long j10) {
        this.f44216g[i10] = 2;
        this.f44212c[i10] = j10;
    }

    public void o2(int i10, byte[] bArr) {
        C17542s.j(bArr, "value");
        this.f44216g[i10] = 5;
        this.f44215f[i10] = bArr;
    }

    private B(int i10) {
        this.f44210a = i10;
        int i11 = i10 + 1;
        this.f44216g = new int[i11];
        this.f44212c = new long[i11];
        this.f44213d = new double[i11];
        this.f44214e = new String[i11];
        this.f44215f = new byte[i11][];
    }
}
