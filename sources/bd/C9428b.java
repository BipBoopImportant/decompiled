package bd;

import K9.C6619q;
import java.util.concurrent.Executor;

/* renamed from: bd.b  reason: case insensitive filesystem */
public class C9428b {

    /* renamed from: a  reason: collision with root package name */
    private final int f65386a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f65387b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f65388c;

    /* renamed from: bd.b$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f65389a = 0;

        /* renamed from: b  reason: collision with root package name */
        private boolean f65390b;

        /* renamed from: c  reason: collision with root package name */
        private Executor f65391c;

        public C9428b a() {
            return new C9428b(this.f65389a, this.f65390b, this.f65391c, (d) null, (e) null);
        }

        public a b(int i10, int... iArr) {
            this.f65389a = i10;
            if (iArr != null) {
                for (int i11 : iArr) {
                    this.f65389a = i11 | this.f65389a;
                }
            }
            return this;
        }
    }

    /* synthetic */ C9428b(int i10, boolean z10, Executor executor, d dVar, e eVar) {
        this.f65386a = i10;
        this.f65387b = z10;
        this.f65388c = executor;
    }

    public final int a() {
        return this.f65386a;
    }

    public final d b() {
        return null;
    }

    public final Executor c() {
        return this.f65388c;
    }

    public final boolean d() {
        return this.f65387b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9428b)) {
            return false;
        }
        C9428b bVar = (C9428b) obj;
        return this.f65386a == bVar.f65386a && this.f65387b == bVar.f65387b && C6619q.b(this.f65388c, bVar.f65388c) && C6619q.b((Object) null, (Object) null);
    }

    public int hashCode() {
        return C6619q.c(Integer.valueOf(this.f65386a), Boolean.valueOf(this.f65387b), this.f65388c, null);
    }
}
