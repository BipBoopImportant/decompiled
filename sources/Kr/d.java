package kr;

import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\u0003R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lkr/d;", "", "Lkr/a;", "a", "()Lkr/a;", "navigateTo", "c", "b", "Lkr/d$a;", "Lkr/d$b;", "Lkr/d$c;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0016\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lkr/d$a;", "Lkr/d;", "", "balance", "LKJ/c;", "Lkr/c;", "content", "Lkr/a;", "navigateTo", "", "focusCollectPoints", "<init>", "(ILKJ/c;Lkr/a;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "LKJ/c;", "c", "()LKJ/c;", "Lkr/a;", "()Lkr/a;", "d", "Z", "()Z", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private final int f99113a;

        /* renamed from: b  reason: collision with root package name */
        private final C15987c<c> f99114b;

        /* renamed from: c  reason: collision with root package name */
        private final C11527a f99115c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f99116d;

        public a(int i10, C15987c<? extends c> cVar, C11527a aVar, boolean z10) {
            C17542s.j(cVar, "content");
            this.f99113a = i10;
            this.f99114b = cVar;
            this.f99115c = aVar;
            this.f99116d = z10;
        }

        public C11527a a() {
            return this.f99115c;
        }

        public final int b() {
            return this.f99113a;
        }

        public final C15987c<c> c() {
            return this.f99114b;
        }

        public final boolean d() {
            return this.f99116d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f99113a == aVar.f99113a && C17542s.e(this.f99114b, aVar.f99114b) && C17542s.e(this.f99115c, aVar.f99115c) && this.f99116d == aVar.f99116d;
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.f99113a) * 31) + this.f99114b.hashCode()) * 31;
            C11527a aVar = this.f99115c;
            return ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + Boolean.hashCode(this.f99116d);
        }

        public String toString() {
            int i10 = this.f99113a;
            C15987c<c> cVar = this.f99114b;
            C11527a aVar = this.f99115c;
            boolean z10 = this.f99116d;
            return "Content(balance=" + i10 + ", content=" + cVar + ", navigateTo=" + aVar + ", focusCollectPoints=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkr/d$b;", "Lkr/d;", "Lkr/a;", "navigateTo", "<init>", "(Lkr/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkr/a;", "()Lkr/a;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private final C11527a f99117a;

        public b() {
            this((C11527a) null, 1, (DefaultConstructorMarker) null);
        }

        public C11527a a() {
            return this.f99117a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f99117a, ((b) obj).f99117a);
        }

        public int hashCode() {
            C11527a aVar = this.f99117a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            C11527a aVar = this.f99117a;
            return "Error(navigateTo=" + aVar + ")";
        }

        public b(C11527a aVar) {
            this.f99117a = aVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(C11527a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : aVar);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkr/d$c;", "Lkr/d;", "Lkr/a;", "navigateTo", "<init>", "(Lkr/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkr/a;", "()Lkr/a;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        private final C11527a f99118a;

        public c() {
            this((C11527a) null, 1, (DefaultConstructorMarker) null);
        }

        public C11527a a() {
            return this.f99118a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f99118a, ((c) obj).f99118a);
        }

        public int hashCode() {
            C11527a aVar = this.f99118a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            C11527a aVar = this.f99118a;
            return "Loading(navigateTo=" + aVar + ")";
        }

        public c(C11527a aVar) {
            this.f99118a = aVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(C11527a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : aVar);
        }
    }

    C11527a a();
}
