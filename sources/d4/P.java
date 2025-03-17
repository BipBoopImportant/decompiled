package D4;

import HJ.C15854t;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import dI.C17164e;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import oI.C17693a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0017\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u0005J\u001b\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\f\u0010\u000bJ-\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010 \u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001c\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"LD4/P;", "", "Key", "Value", "<init>", "()V", "LXH/N;", "e", "Lkotlin/Function0;", "onInvalidatedCallback", "g", "(LnI/a;)V", "h", "LD4/P$a;", "params", "LD4/P$b;", "f", "(LD4/P$a;LdI/e;)Ljava/lang/Object;", "LD4/Q;", "state", "d", "(LD4/Q;)Ljava/lang/Object;", "LD4/r;", "a", "LD4/r;", "invalidateCallbackTracker", "", "b", "()Z", "jumpingSupported", "c", "keyReuseSupported", "invalid", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class P<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    private final r<C17631a<C16807N>> f34188a = new r<>(c.f34204c, (C17631a) null, 2, (DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000e*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004\t\u000b\u000e\u0012B\u0019\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00018\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0010\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LD4/P$a;", "", "Key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(IZ)V", "a", "I", "b", "()I", "Z", "c", "()Z", "()Ljava/lang/Object;", "key", "d", "LD4/P$a$a;", "LD4/P$a$c;", "LD4/P$a$d;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class a<Key> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f34189c = new b((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final int f34190a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f34191b;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00028\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LD4/P$a$a;", "", "Key", "LD4/P$a;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "d", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: D4.P$a$a  reason: collision with other inner class name */
        public static final class C0532a<Key> extends a<Key> {

            /* renamed from: d  reason: collision with root package name */
            private final Key f34192d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0532a(Key key, int i10, boolean z10) {
                super(i10, z10, (DefaultConstructorMarker) null);
                C17542s.j(key, "key");
                this.f34192d = key;
            }

            public Key a() {
                return this.f34192d;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00030\f\"\b\b\u0003\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00018\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LD4/P$a$b;", "", "<init>", "()V", "Key", "LD4/x;", "loadType", "key", "", "loadSize", "", "placeholdersEnabled", "LD4/P$a;", "a", "(LD4/x;Ljava/lang/Object;IZ)LD4/P$a;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b {

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: D4.P$a$b$a  reason: collision with other inner class name */
            public /* synthetic */ class C0533a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f34193a;

                /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                static {
                    /*
                        D4.x[] r0 = D4.C6449x.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        D4.x r1 = D4.C6449x.REFRESH     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        D4.x r1 = D4.C6449x.PREPEND     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        D4.x r1 = D4.C6449x.APPEND     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        f34193a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: D4.P.a.b.C0533a.<clinit>():void");
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final <Key> a<Key> a(C6449x xVar, Key key, int i10, boolean z10) {
                C17542s.j(xVar, "loadType");
                int i11 = C0533a.f34193a[xVar.ordinal()];
                if (i11 == 1) {
                    return new d(key, i10, z10);
                }
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new t();
                    } else if (key != null) {
                        return new C0532a(key, i10, z10);
                    } else {
                        throw new IllegalArgumentException("key cannot be null for append");
                    }
                } else if (key != null) {
                    return new c(key, i10, z10);
                } else {
                    throw new IllegalArgumentException("key cannot be null for prepend");
                }
            }

            private b() {
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00028\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LD4/P$a$c;", "", "Key", "LD4/P$a;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "d", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class c<Key> extends a<Key> {

            /* renamed from: d  reason: collision with root package name */
            private final Key f34194d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(Key key, int i10, boolean z10) {
                super(i10, z10, (DefaultConstructorMarker) null);
                C17542s.j(key, "key");
                this.f34194d = key;
            }

            public Key a() {
                return this.f34194d;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B!\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00018\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LD4/P$a$d;", "", "Key", "LD4/P$a;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "d", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class d<Key> extends a<Key> {

            /* renamed from: d  reason: collision with root package name */
            private final Key f34195d;

            public d(Key key, int i10, boolean z10) {
                super(i10, z10, (DefaultConstructorMarker) null);
                this.f34195d = key;
            }

            public Key a() {
                return this.f34195d;
            }
        }

        public /* synthetic */ a(int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, z10);
        }

        public abstract Key a();

        public final int b() {
            return this.f34190a;
        }

        public final boolean c() {
            return this.f34191b;
        }

        private a(int i10, boolean z10) {
            this.f34190a = i10;
            this.f34191b = z10;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0001\u0002\b\t¨\u0006\n"}, d2 = {"LD4/P$b;", "", "Key", "Value", "<init>", "()V", "a", "b", "LD4/P$b$a;", "LD4/P$b$b;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class b<Key, Value> {

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LD4/P$b$a;", "", "Key", "Value", "LD4/P$b;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a<Key, Value> extends b<Key, Value> {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f34196a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Throwable th2) {
                super((DefaultConstructorMarker) null);
                C17542s.j(th2, "throwable");
                this.f34196a = th2;
            }

            public final Throwable b() {
                return this.f34196a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C17542s.e(this.f34196a, ((a) obj).f34196a);
            }

            public int hashCode() {
                return this.f34196a.hashCode();
            }

            public String toString() {
                return C15854t.o("LoadResult.Error(\n                    |   throwable: " + this.f34196a + "\n                    |) ", (String) null, 1, (Object) null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 **\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00042\b\u0012\u0004\u0012\u00028\u00050\u0005:\u0001\u001cB=\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00050\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0004\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\b\b\u0003\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eB+\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00050\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0004¢\u0006\u0004\b\r\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00050\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00050\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00018\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00018\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u0017¨\u0006+"}, d2 = {"LD4/P$b$b;", "", "Key", "Value", "LD4/P$b;", "", "", "data", "prevKey", "nextKey", "", "itemsBefore", "itemsAfter", "<init>", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)V", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", "", "iterator", "()Ljava/util/Iterator;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/Object;", "p", "()Ljava/lang/Object;", "c", "m", "d", "I", "k", "e", "i", "f", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: D4.P$b$b  reason: collision with other inner class name */
        public static final class C0534b<Key, Value> extends b<Key, Value> implements Iterable<Value>, C17693a {

            /* renamed from: f  reason: collision with root package name */
            public static final a f34197f = new a((DefaultConstructorMarker) null);

            /* renamed from: g  reason: collision with root package name */
            private static final C0534b f34198g = new C0534b(C16877v.n(), (Object) null, (Object) null, 0, 0);

            /* renamed from: a  reason: collision with root package name */
            private final List<Value> f34199a;

            /* renamed from: b  reason: collision with root package name */
            private final Key f34200b;

            /* renamed from: c  reason: collision with root package name */
            private final Key f34201c;

            /* renamed from: d  reason: collision with root package name */
            private final int f34202d;

            /* renamed from: e  reason: collision with root package name */
            private final int f34203e;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LD4/P$b$b$a;", "", "<init>", "()V", "", "COUNT_UNDEFINED", "I", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
            /* renamed from: D4.P$b$b$a */
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private a() {
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0534b(List<? extends Value> list, Key key, Key key2, int i10, int i11) {
                super((DefaultConstructorMarker) null);
                C17542s.j(list, "data");
                this.f34199a = list;
                this.f34200b = key;
                this.f34201c = key2;
                this.f34202d = i10;
                this.f34203e = i11;
                if (i10 != Integer.MIN_VALUE && i10 < 0) {
                    throw new IllegalArgumentException("itemsBefore cannot be negative");
                } else if (i11 != Integer.MIN_VALUE && i11 < 0) {
                    throw new IllegalArgumentException("itemsAfter cannot be negative");
                }
            }

            public final List<Value> b() {
                return this.f34199a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0534b)) {
                    return false;
                }
                C0534b bVar = (C0534b) obj;
                return C17542s.e(this.f34199a, bVar.f34199a) && C17542s.e(this.f34200b, bVar.f34200b) && C17542s.e(this.f34201c, bVar.f34201c) && this.f34202d == bVar.f34202d && this.f34203e == bVar.f34203e;
            }

            public int hashCode() {
                int hashCode = this.f34199a.hashCode() * 31;
                Key key = this.f34200b;
                int i10 = 0;
                int hashCode2 = (hashCode + (key == null ? 0 : key.hashCode())) * 31;
                Key key2 = this.f34201c;
                if (key2 != null) {
                    i10 = key2.hashCode();
                }
                return ((((hashCode2 + i10) * 31) + Integer.hashCode(this.f34202d)) * 31) + Integer.hashCode(this.f34203e);
            }

            public final int i() {
                return this.f34203e;
            }

            public Iterator<Value> iterator() {
                return this.f34199a.listIterator();
            }

            public final int k() {
                return this.f34202d;
            }

            public final Key m() {
                return this.f34201c;
            }

            public final Key p() {
                return this.f34200b;
            }

            public String toString() {
                return C15854t.o("LoadResult.Page(\n                    |   data size: " + this.f34199a.size() + "\n                    |   first Item: " + C16877v.y0(this.f34199a) + "\n                    |   last Item: " + C16877v.K0(this.f34199a) + "\n                    |   nextKey: " + this.f34201c + "\n                    |   prevKey: " + this.f34200b + "\n                    |   itemsBefore: " + this.f34202d + "\n                    |   itemsAfter: " + this.f34203e + "\n                    |) ", (String) null, 1, (Object) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public C0534b(List<? extends Value> list, Key key, Key key2) {
                this(list, key, key2, Integer.MIN_VALUE, Integer.MIN_VALUE);
                C17542s.j(list, "data");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lkotlin/Function0;", "LXH/N;", "it", "a", "(LnI/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<C17631a<? extends C16807N>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f34204c = new c();

        c() {
            super(1);
        }

        public final void a(C17631a<C16807N> aVar) {
            C17542s.j(aVar, "it");
            aVar.invoke();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C17631a) obj);
            return C16807N.f139792a;
        }
    }

    public final boolean a() {
        return this.f34188a.a();
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public abstract Key d(Q<Key, Value> q10);

    public final void e() {
        C6450y a10;
        if (this.f34188a.b() && (a10 = C6451z.a()) != null && a10.b(3)) {
            a10.a(3, "Invalidated PagingSource " + this, (Throwable) null);
        }
    }

    public abstract Object f(a<Key> aVar, C17164e<? super b<Key, Value>> eVar);

    public final void g(C17631a<C16807N> aVar) {
        C17542s.j(aVar, "onInvalidatedCallback");
        this.f34188a.c(aVar);
    }

    public final void h(C17631a<C16807N> aVar) {
        C17542s.j(aVar, "onInvalidatedCallback");
        this.f34188a.d(aVar);
    }
}
