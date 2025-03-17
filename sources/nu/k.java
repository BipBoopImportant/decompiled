package nu;

import EB.C12832d;
import Gt.e;
import IC.C13023e;
import TJ.C16532g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0006J\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnu/k;", "", "LEB/d;", "currentStore", "LTJ/g;", "Lnu/k$a;", "a", "(LEB/d;)LTJ/g;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface k {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lnu/k$a;", "", "LGt/e;", "smallStoreUiModel", "<init>", "(LGt/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LGt/e;", "()LGt/e;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final int f100359b = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final e f100360a;

        public a(e eVar) {
            C17542s.j(eVar, "smallStoreUiModel");
            this.f100360a = eVar;
        }

        public final e a() {
            return this.f100360a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f100360a, ((a) obj).f100360a);
        }

        public int hashCode() {
            return this.f100360a.hashCode();
        }

        public String toString() {
            e eVar = this.f100360a;
            return "SmallStoreResult(smallStoreUiModel=" + eVar + ")";
        }
    }

    C16532g<a> a(C12832d dVar);
}
