package zq;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import w5.g;
import y5.C8978a;
import y5.C8979b;
import y5.C8981d;
import y5.C8983f;
import yq.C12498a;
import yq.C12499b;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lzq/a;", "Lw5/g;", "Lyq/b;", "Ly5/d;", "driver", "<init>", "(Ly5/d;)V", "Lyq/a;", "c", "Lyq/a;", "a", "()Lyq/a;", "episodDatabaseQueries", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zq.a  reason: case insensitive filesystem */
final class C12548a extends g implements C12499b {

    /* renamed from: c  reason: collision with root package name */
    private final C12498a f107559c;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJG\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Lzq/a$a;", "Ly5/f;", "Ly5/b$b;", "LXH/N;", "<init>", "()V", "Ly5/d;", "driver", "c", "(Ly5/d;)Ljava/lang/Object;", "", "oldVersion", "newVersion", "", "Ly5/a;", "callbacks", "d", "(Ly5/d;JJ[Ly5/a;)Ljava/lang/Object;", "getVersion", "()J", "version", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zq.a$a  reason: collision with other inner class name */
    public static final class C2565a implements C8983f<C8979b.C0933b<C16807N>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2565a f107560a = new C2565a();

        private C2565a() {
        }

        public /* bridge */ /* synthetic */ C8979b a(C8981d dVar, long j10, long j11, C8978a[] aVarArr) {
            return C8979b.C0933b.a(d(dVar, j10, j11, aVarArr));
        }

        public /* bridge */ /* synthetic */ C8979b b(C8981d dVar) {
            return C8979b.C0933b.a(c(dVar));
        }

        public Object c(C8981d dVar) {
            C17542s.j(dVar, "driver");
            C8981d.a.a(dVar, (Integer) null, "CREATE TABLE events (\n    id INTEGER PRIMARY KEY AUTOINCREMENT,\n    event TEXT NOT NULL\n)", 0, (C17642l) null, 8, (Object) null);
            return C8979b.f57830a.a();
        }

        public Object d(C8981d dVar, long j10, long j11, C8978a... aVarArr) {
            C17542s.j(dVar, "driver");
            C17542s.j(aVarArr, "callbacks");
            return C8979b.f57830a.a();
        }

        public long getVersion() {
            return 1;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12548a(C8981d dVar) {
        super(dVar);
        C17542s.j(dVar, "driver");
        this.f107559c = new C12498a(dVar);
    }

    public C12498a a() {
        return this.f107559c;
    }
}
