package Sl;

import Rl.f;
import XH.x;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦B¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"LSl/d;", "", "LXH/x;", "LSl/d$a;", "invoke-IoAF18A", "(LdI/e;)Ljava/lang/Object;", "invoke", "a", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"LSl/d$a;", "", "LRl/d;", "suggestedMarket", "LRl/f;", "suggestedLanguage", "", "availableMarkets", "<init>", "(LRl/d;LRl/f;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LRl/d;", "c", "()LRl/d;", "b", "LRl/f;", "()LRl/f;", "Ljava/util/List;", "()Ljava/util/List;", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Rl.d f87222a;

        /* renamed from: b  reason: collision with root package name */
        private final f f87223b;

        /* renamed from: c  reason: collision with root package name */
        private final List<Rl.d> f87224c;

        public a(Rl.d dVar, f fVar, List<Rl.d> list) {
            C17542s.j(dVar, "suggestedMarket");
            C17542s.j(fVar, "suggestedLanguage");
            C17542s.j(list, "availableMarkets");
            this.f87222a = dVar;
            this.f87223b = fVar;
            this.f87224c = list;
        }

        public final List<Rl.d> a() {
            return this.f87224c;
        }

        public final f b() {
            return this.f87223b;
        }

        public final Rl.d c() {
            return this.f87222a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f87222a, aVar.f87222a) && C17542s.e(this.f87223b, aVar.f87223b) && C17542s.e(this.f87224c, aVar.f87224c);
        }

        public int hashCode() {
            return (((this.f87222a.hashCode() * 31) + this.f87223b.hashCode()) * 31) + this.f87224c.hashCode();
        }

        public String toString() {
            Rl.d dVar = this.f87222a;
            f fVar = this.f87223b;
            List<Rl.d> list = this.f87224c;
            return "Markets(suggestedMarket=" + dVar + ", suggestedLanguage=" + fVar + ", availableMarkets=" + list + ")";
        }
    }

    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    Object m8invokeIoAF18A(C17164e<? super x<a>> eVar);
}
