package kr;

import IC.C13023e;
import IC.C13026h;
import Iq.a;
import KJ.C15987c;
import Qq.q;
import Qq.r;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import xB.C15201a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lkr/c;", "LxB/a;", "g", "f", "b", "a", "h", "e", "c", "d", "Lkr/c$c;", "Lkr/c$d;", "Lkr/c$e;", "Lkr/c$f;", "Lkr/c$g;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c extends C15201a {

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lkr/c$a;", "Lkr/c$f;", "LKJ/c;", "LIq/a$b;", "rewards", "<init>", "(LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "d", "()LKJ/c;", "", "b", "J", "f", "()J", "stableId", "LIC/e;", "c", "LIC/e;", "getTitle", "()LIC/e;", "title", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<a.b> f99096a;

        /* renamed from: b  reason: collision with root package name */
        private final long f99097b = ((long) Objects.hash(new Object[]{P.b(a.class)}));

        /* renamed from: c  reason: collision with root package name */
        private final C13023e f99098c = C13026h.a(Rq.e.f86989j);

        public a(C15987c<a.b> cVar) {
            C17542s.j(cVar, "rewards");
            this.f99096a = cVar;
        }

        public C15987c<a.b> d() {
            return this.f99096a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f99096a, ((a) obj).f99096a);
        }

        public long f() {
            return this.f99097b;
        }

        public C13023e getTitle() {
            return this.f99098c;
        }

        public int hashCode() {
            return this.f99096a.hashCode();
        }

        public String toString() {
            C15987c<a.b> cVar = this.f99096a;
            return "AvailableRewards(rewards=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lkr/c$b;", "Lkr/c$f;", "LKJ/c;", "LIq/a$c;", "rewards", "<init>", "(LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "d", "()LKJ/c;", "", "b", "J", "f", "()J", "stableId", "LIC/e;", "c", "LIC/e;", "getTitle", "()LIC/e;", "title", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements f {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<a.c> f99099a;

        /* renamed from: b  reason: collision with root package name */
        private final long f99100b = ((long) Objects.hash(new Object[]{P.b(b.class)}));

        /* renamed from: c  reason: collision with root package name */
        private final C13023e f99101c = C13026h.a(Rq.e.f86990k);

        public b(C15987c<? extends a.c> cVar) {
            C17542s.j(cVar, "rewards");
            this.f99099a = cVar;
        }

        public C15987c<a.c> d() {
            return this.f99099a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f99099a, ((b) obj).f99099a);
        }

        public long f() {
            return this.f99100b;
        }

        public C13023e getTitle() {
            return this.f99101c;
        }

        public int hashCode() {
            return this.f99099a.hashCode();
        }

        public String toString() {
            C15987c<a.c> cVar = this.f99099a;
            return "ClaimedRewards(rewards=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lkr/c$c;", "Lkr/c;", "LQq/q;", "interaction", "<init>", "(LQq/q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQq/q;", "g", "()LQq/q;", "", "b", "J", "f", "()J", "stableId", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kr.c$c  reason: collision with other inner class name */
    public static final class C2246c implements c {

        /* renamed from: a  reason: collision with root package name */
        private final q f99102a;

        /* renamed from: b  reason: collision with root package name */
        private final long f99103b = ((long) Objects.hash(new Object[]{P.b(C2246c.class)}));

        public C2246c(q qVar) {
            C17542s.j(qVar, "interaction");
            this.f99102a = qVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2246c) && C17542s.e(this.f99102a, ((C2246c) obj).f99102a);
        }

        public long f() {
            return this.f99103b;
        }

        public final q g() {
            return this.f99102a;
        }

        public int hashCode() {
            return this.f99102a.hashCode();
        }

        public String toString() {
            q qVar = this.f99102a;
            return "PromotedRewardingInteraction(interaction=" + qVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lkr/c$d;", "Lkr/c;", "LKJ/c;", "LQq/r;", "interactions", "<init>", "(LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "g", "()LKJ/c;", "", "b", "J", "f", "()J", "stableId", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<r> f99104a;

        /* renamed from: b  reason: collision with root package name */
        private final long f99105b = ((long) Objects.hash(new Object[]{P.b(d.class)}));

        public d(C15987c<r> cVar) {
            C17542s.j(cVar, "interactions");
            this.f99104a = cVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C17542s.e(this.f99104a, ((d) obj).f99104a);
        }

        public long f() {
            return this.f99105b;
        }

        public final C15987c<r> g() {
            return this.f99104a;
        }

        public int hashCode() {
            return this.f99104a.hashCode();
        }

        public String toString() {
            C15987c<r> cVar = this.f99104a;
            return "RewardingInteractions(interactions=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lkr/c$e;", "Lkr/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "b", "J", "f", "()J", "stableId", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final e f99106a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final long f99107b = ((long) Objects.hash(new Object[]{P.b(e.class)}));

        private e() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public long f() {
            return f99107b;
        }

        public int hashCode() {
            return -1510016027;
        }

        public String toString() {
            return "RewardingInteractionsSectionHeader";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lkr/c$f;", "Lkr/c;", "LKJ/c;", "LIq/a;", "d", "()LKJ/c;", "rewards", "LIC/e;", "getTitle", "()LIC/e;", "title", "Lkr/c$a;", "Lkr/c$b;", "Lkr/c$h;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface f extends c {
        C15987c<Iq.a> d();

        C13023e getTitle();
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lkr/c$g;", "Lkr/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "b", "J", "f", "()J", "stableId", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final g f99108a = new g();

        /* renamed from: b  reason: collision with root package name */
        private static final long f99109b = ((long) Objects.hash(new Object[]{P.b(g.class)}));

        private g() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public long f() {
            return f99109b;
        }

        public int hashCode() {
            return 1542333482;
        }

        public String toString() {
            return "RewardsHeader";
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lkr/c$h;", "Lkr/c$f;", "LKJ/c;", "LIq/a$d;", "rewards", "<init>", "(LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "d", "()LKJ/c;", "", "b", "J", "f", "()J", "stableId", "LIC/e;", "c", "LIC/e;", "getTitle", "()LIC/e;", "title", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements f {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<a.d> f99110a;

        /* renamed from: b  reason: collision with root package name */
        private final long f99111b = ((long) Objects.hash(new Object[]{P.b(h.class)}));

        /* renamed from: c  reason: collision with root package name */
        private final C13023e f99112c = C13026h.a(Rq.e.f87000u);

        public h(C15987c<a.d> cVar) {
            C17542s.j(cVar, "rewards");
            this.f99110a = cVar;
        }

        public C15987c<a.d> d() {
            return this.f99110a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && C17542s.e(this.f99110a, ((h) obj).f99110a);
        }

        public long f() {
            return this.f99111b;
        }

        public C13023e getTitle() {
            return this.f99112c;
        }

        public int hashCode() {
            return this.f99110a.hashCode();
        }

        public String toString() {
            C15987c<a.d> cVar = this.f99110a;
            return "UnavailableRewards(rewards=" + cVar + ")";
        }
    }
}
