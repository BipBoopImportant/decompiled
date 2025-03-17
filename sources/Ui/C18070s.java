package uI;

import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Marker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u000bB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001a"}, d2 = {"LuI/s;", "", "LuI/t;", "variance", "LuI/q;", "type", "<init>", "(LuI/t;LuI/q;)V", "", "toString", "()Ljava/lang/String;", "a", "()LuI/t;", "b", "()LuI/q;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LuI/t;", "d", "LuI/q;", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uI.s  reason: case insensitive filesystem */
public final class C18070s {

    /* renamed from: c  reason: collision with root package name */
    public static final a f147781c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final C18070s f147782d = new C18070s((C18071t) null, (C18068q) null);

    /* renamed from: a  reason: collision with root package name */
    private final C18071t f147783a;

    /* renamed from: b  reason: collision with root package name */
    private final C18068q f147784b;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bR\u0011\u0010\r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LuI/s$a;", "", "<init>", "()V", "LuI/q;", "type", "LuI/s;", "d", "(LuI/q;)LuI/s;", "a", "b", "c", "()LuI/s;", "STAR", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uI.s$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C18070s a(C18068q qVar) {
            C17542s.j(qVar, "type");
            return new C18070s(C18071t.IN, qVar);
        }

        public final C18070s b(C18068q qVar) {
            C17542s.j(qVar, "type");
            return new C18070s(C18071t.OUT, qVar);
        }

        public final C18070s c() {
            return C18070s.f147782d;
        }

        public final C18070s d(C18068q qVar) {
            C17542s.j(qVar, "type");
            return new C18070s(C18071t.INVARIANT, qVar);
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uI.s$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f147785a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                uI.t[] r0 = uI.C18071t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                uI.t r1 = uI.C18071t.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                uI.t r1 = uI.C18071t.IN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                uI.t r1 = uI.C18071t.OUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f147785a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uI.C18070s.b.<clinit>():void");
        }
    }

    public C18070s(C18071t tVar, C18068q qVar) {
        String str;
        this.f147783a = tVar;
        this.f147784b = qVar;
        if ((tVar == null) != (qVar == null)) {
            if (tVar == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + tVar + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public final C18071t a() {
        return this.f147783a;
    }

    public final C18068q b() {
        return this.f147784b;
    }

    public final C18068q c() {
        return this.f147784b;
    }

    public final C18071t d() {
        return this.f147783a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18070s)) {
            return false;
        }
        C18070s sVar = (C18070s) obj;
        return this.f147783a == sVar.f147783a && C17542s.e(this.f147784b, sVar.f147784b);
    }

    public int hashCode() {
        C18071t tVar = this.f147783a;
        int i10 = 0;
        int hashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
        C18068q qVar = this.f147784b;
        if (qVar != null) {
            i10 = qVar.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        C18071t tVar = this.f147783a;
        int i10 = tVar == null ? -1 : b.f147785a[tVar.ordinal()];
        if (i10 == -1) {
            return Marker.ANY_MARKER;
        }
        if (i10 == 1) {
            return String.valueOf(this.f147784b);
        }
        if (i10 == 2) {
            return "in " + this.f147784b;
        } else if (i10 == 3) {
            return "out " + this.f147784b;
        } else {
            throw new t();
        }
    }
}
