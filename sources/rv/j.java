package Rv;

import KJ.C15985a;
import KJ.C15987c;
import Sv.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0003\n\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"LRv/j;", "", "LRv/l;", "a", "()LRv/l;", "tab", "", "b", "()Z", "isContentEmpty", "c", "LRv/j$a;", "LRv/j$b;", "LRv/j$c;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface j {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001e"}, d2 = {"LRv/j$a;", "LRv/j;", "LKJ/c;", "LSv/e;", "content", "<init>", "(LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "c", "()LKJ/c;", "LRv/l;", "b", "LRv/l;", "()LRv/l;", "tab", "Z", "()Z", "isContentEmpty", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements j {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<e> f39786a;

        /* renamed from: b  reason: collision with root package name */
        private final l f39787b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f39788c;

        public a() {
            this((C15987c) null, 1, (DefaultConstructorMarker) null);
        }

        public l a() {
            return this.f39787b;
        }

        public boolean b() {
            return this.f39788c;
        }

        public final C15987c<e> c() {
            return this.f39786a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f39786a, ((a) obj).f39786a);
        }

        public int hashCode() {
            return this.f39786a.hashCode();
        }

        public String toString() {
            C15987c<e> cVar = this.f39786a;
            return "Overview(content=" + cVar + ")";
        }

        public a(C15987c<? extends e> cVar) {
            C17542s.j(cVar, "content");
            this.f39786a = cVar;
            this.f39787b = l.Overview;
            this.f39788c = cVar.isEmpty();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(C15987c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C15985a.a() : cVar);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001e"}, d2 = {"LRv/j$b;", "LRv/j;", "LKJ/c;", "LTv/b;", "content", "<init>", "(LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "c", "()LKJ/c;", "LRv/l;", "b", "LRv/l;", "()LRv/l;", "tab", "Z", "()Z", "isContentEmpty", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements j {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<Tv.b> f39789a;

        /* renamed from: b  reason: collision with root package name */
        private final l f39790b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f39791c;

        public b() {
            this((C15987c) null, 1, (DefaultConstructorMarker) null);
        }

        public l a() {
            return this.f39790b;
        }

        public boolean b() {
            return this.f39791c;
        }

        public final C15987c<Tv.b> c() {
            return this.f39789a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f39789a, ((b) obj).f39789a);
        }

        public int hashCode() {
            return this.f39789a.hashCode();
        }

        public String toString() {
            C15987c<Tv.b> cVar = this.f39789a;
            return "Settings(content=" + cVar + ")";
        }

        public b(C15987c<? extends Tv.b> cVar) {
            C17542s.j(cVar, "content");
            this.f39789a = cVar;
            this.f39790b = l.Settings;
            this.f39791c = cVar.isEmpty();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(C15987c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C15985a.a() : cVar);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001e"}, d2 = {"LRv/j$c;", "LRv/j;", "LKJ/c;", "LUv/a;", "content", "<init>", "(LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "c", "()LKJ/c;", "LRv/l;", "b", "LRv/l;", "()LRv/l;", "tab", "Z", "()Z", "isContentEmpty", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements j {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<Uv.a> f39792a;

        /* renamed from: b  reason: collision with root package name */
        private final l f39793b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f39794c;

        public c() {
            this((C15987c) null, 1, (DefaultConstructorMarker) null);
        }

        public l a() {
            return this.f39793b;
        }

        public boolean b() {
            return this.f39794c;
        }

        public final C15987c<Uv.a> c() {
            return this.f39792a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f39792a, ((c) obj).f39792a);
        }

        public int hashCode() {
            return this.f39792a.hashCode();
        }

        public String toString() {
            C15987c<Uv.a> cVar = this.f39792a;
            return "YourHome(content=" + cVar + ")";
        }

        public c(C15987c<? extends Uv.a> cVar) {
            C17542s.j(cVar, "content");
            this.f39792a = cVar;
            this.f39793b = l.YourHome;
            this.f39794c = cVar.isEmpty();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(C15987c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C15985a.a() : cVar);
        }
    }

    l a();

    boolean b();
}
