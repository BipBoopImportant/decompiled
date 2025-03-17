package Wv;

import KJ.C15985a;
import KJ.C15987c;
import Sv.e;
import TJ.C16532g;
import aA.C13910b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0006J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LWv/a;", "", "LaA/b;", "userState", "LTJ/g;", "LWv/a$a;", "a", "(LaA/b;)LTJ/g;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LWv/a$a;", "", "LKJ/c;", "LSv/e;", "content", "", "isFullyLoaded", "<init>", "(LKJ/c;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "()LKJ/c;", "b", "Z", "()Z", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Wv.a$a  reason: collision with other inner class name */
    public static final class C0672a {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<e> f40558a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f40559b;

        public C0672a() {
            this((C15987c) null, false, 3, (DefaultConstructorMarker) null);
        }

        public final C15987c<e> a() {
            return this.f40558a;
        }

        public final boolean b() {
            return this.f40559b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0672a)) {
                return false;
            }
            C0672a aVar = (C0672a) obj;
            return C17542s.e(this.f40558a, aVar.f40558a) && this.f40559b == aVar.f40559b;
        }

        public int hashCode() {
            return (this.f40558a.hashCode() * 31) + Boolean.hashCode(this.f40559b);
        }

        public String toString() {
            C15987c<e> cVar = this.f40558a;
            boolean z10 = this.f40559b;
            return "OverviewData(content=" + cVar + ", isFullyLoaded=" + z10 + ")";
        }

        public C0672a(C15987c<? extends e> cVar, boolean z10) {
            C17542s.j(cVar, "content");
            this.f40558a = cVar;
            this.f40559b = z10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0672a(C15987c cVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C15985a.a() : cVar, (i10 & 2) != 0 ? false : z10);
        }
    }

    C16532g<C0672a> a(C13910b bVar);
}
