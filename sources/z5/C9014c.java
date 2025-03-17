package z5;

import Q4.g;
import Q4.i;
import Q4.j;
import XH.C16807N;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b%\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R(\u0010-\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00160+8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010,¨\u0006."}, d2 = {"Lz5/c;", "LQ4/j;", "Lz5/e;", "", "sql", "LQ4/g;", "database", "", "argCount", "", "windowSizeBytes", "<init>", "(Ljava/lang/String;LQ4/g;ILjava/lang/Long;)V", "index", "string", "LXH/N;", "H", "(ILjava/lang/String;)V", "", "b", "()Ljava/lang/Void;", "R", "Lkotlin/Function1;", "Ly5/c;", "Ly5/b;", "mapper", "a", "(LnI/l;)Ljava/lang/Object;", "LQ4/i;", "statement", "d", "(LQ4/i;)V", "toString", "()Ljava/lang/String;", "close", "()V", "Ljava/lang/String;", "c", "LQ4/g;", "I", "e", "()I", "Ljava/lang/Long;", "", "Ljava/util/List;", "binds", "sqldelight-android-driver_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z5.c  reason: case insensitive filesystem */
final class C9014c implements j, C9016e {

    /* renamed from: a  reason: collision with root package name */
    private final String f58393a;

    /* renamed from: b  reason: collision with root package name */
    private final g f58394b;

    /* renamed from: c  reason: collision with root package name */
    private final int f58395c;

    /* renamed from: d  reason: collision with root package name */
    private final Long f58396d;

    /* renamed from: e  reason: collision with root package name */
    private final List<C17642l<i, C16807N>> f58397e;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ4/i;", "it", "LXH/N;", "a", "(LQ4/i;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z5.c$a */
    static final class a extends C17544u implements C17642l<i, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f58398c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f58399d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, int i10) {
            super(1);
            this.f58398c = str;
            this.f58399d = i10;
        }

        public final void a(i iVar) {
            C17542s.j(iVar, "it");
            String str = this.f58398c;
            if (str == null) {
                iVar.I2(this.f58399d + 1);
            } else {
                iVar.H(this.f58399d + 1, str);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((i) obj);
            return C16807N.f139792a;
        }
    }

    public C9014c(String str, g gVar, int i10, Long l10) {
        C17542s.j(str, "sql");
        C17542s.j(gVar, "database");
        this.f58393a = str;
        this.f58394b = gVar;
        this.f58395c = i10;
        this.f58396d = l10;
        int e10 = e();
        ArrayList arrayList = new ArrayList(e10);
        for (int i11 = 0; i11 < e10; i11++) {
            arrayList.add((Object) null);
        }
        this.f58397e = arrayList;
    }

    public void H(int i10, String str) {
        this.f58397e.set(i10, new a(str, i10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        jI.C17416c.a(r0, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <R> R a(nI.C17642l<? super y5.C8980c, ? extends y5.C8979b<R>> r4) {
        /*
            r3 = this;
            java.lang.String r0 = "mapper"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            Q4.g r0 = r3.f58394b
            android.database.Cursor r0 = r0.l3(r3)
            z5.a r1 = new z5.a     // Catch:{ all -> 0x0021 }
            java.lang.Long r2 = r3.f58396d     // Catch:{ all -> 0x0021 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0021 }
            java.lang.Object r4 = r4.invoke(r1)     // Catch:{ all -> 0x0021 }
            y5.b r4 = (y5.C8979b) r4     // Catch:{ all -> 0x0021 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0021 }
            r1 = 0
            jI.C17416c.a(r0, r1)
            return r4
        L_0x0021:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r1 = move-exception
            jI.C17416c.a(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.C9014c.a(nI.l):java.lang.Object");
    }

    public Void b() {
        throw new UnsupportedOperationException();
    }

    public String c() {
        return this.f58393a;
    }

    public void close() {
    }

    public void d(i iVar) {
        C17542s.j(iVar, "statement");
        for (C17642l next : this.f58397e) {
            C17542s.g(next);
            next.invoke(iVar);
        }
    }

    public int e() {
        return this.f58395c;
    }

    public /* bridge */ /* synthetic */ long execute() {
        return ((Number) b()).longValue();
    }

    public String toString() {
        return c();
    }
}
