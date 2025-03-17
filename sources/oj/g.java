package oj;

import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import oj.C11680a;
import xB.C15201a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Loj/g;", "Loj/b;", "", "Loj/g$a;", "mustHaves", "Loj/a$b;", "analyticsEvent", "<init>", "(Ljava/util/List;Loj/a$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "h", "()Ljava/util/List;", "b", "Loj/a$b;", "g", "()Loj/a$b;", "", "c", "J", "f", "()J", "stableId", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements C11681b {

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f100419a;

    /* renamed from: b  reason: collision with root package name */
    private final C11680a.b f100420b;

    /* renamed from: c  reason: collision with root package name */
    private final long f100421c;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Loj/g$a;", "LxB/a;", "", "imageUrl", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "g", "", "c", "J", "f", "()J", "stableId", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C15201a {

        /* renamed from: a  reason: collision with root package name */
        private final String f100422a;

        /* renamed from: b  reason: collision with root package name */
        private final String f100423b;

        /* renamed from: c  reason: collision with root package name */
        private final long f100424c;

        public a(String str, String str2) {
            C17542s.j(str, "imageUrl");
            C17542s.j(str2, "description");
            this.f100422a = str;
            this.f100423b = str2;
            U u10 = new U(3);
            u10.a(P.b(a.class));
            u10.a(str);
            u10.b(new Object[]{str2});
            this.f100424c = (long) Objects.hash(u10.d(new Object[u10.c()]));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f100422a, aVar.f100422a) && C17542s.e(this.f100423b, aVar.f100423b);
        }

        public long f() {
            return this.f100424c;
        }

        public final String g() {
            return this.f100423b;
        }

        public final String h() {
            return this.f100422a;
        }

        public int hashCode() {
            return (this.f100422a.hashCode() * 31) + this.f100423b.hashCode();
        }

        public String toString() {
            String str = this.f100422a;
            String str2 = this.f100423b;
            return "MustHave(imageUrl=" + str + ", description=" + str2 + ")";
        }
    }

    public g(List<a> list, C11680a.b bVar) {
        C17542s.j(list, "mustHaves");
        C17542s.j(bVar, "analyticsEvent");
        this.f100419a = list;
        this.f100420b = bVar;
        U u10 = new U(3);
        u10.a(P.b(g.class));
        u10.a(list);
        u10.b(new Object[0]);
        this.f100421c = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return C17542s.e(this.f100419a, gVar.f100419a) && C17542s.e(this.f100420b, gVar.f100420b);
    }

    public long f() {
        return this.f100421c;
    }

    public final C11680a.b g() {
        return this.f100420b;
    }

    public final List<a> h() {
        return this.f100419a;
    }

    public int hashCode() {
        return (this.f100419a.hashCode() * 31) + this.f100420b.hashCode();
    }

    public String toString() {
        List<a> list = this.f100419a;
        C11680a.b bVar = this.f100420b;
        return "MustHavesModel(mustHaves=" + list + ", analyticsEvent=" + bVar + ")";
    }
}
