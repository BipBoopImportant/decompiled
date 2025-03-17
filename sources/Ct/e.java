package Ct;

import XH.x;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001\tJ\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦B¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"LCt/e;", "", "", "storeId", "LXH/x;", "LCt/e$a;", "invoke-gIAlu-s", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "invoke", "a", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"LCt/e$a;", "", "", "url", "", "open", "available", "<init>", "(Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Z", "()Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f79730a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f79731b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f79732c;

        public a(String str, boolean z10, boolean z11) {
            this.f79730a = str;
            this.f79731b = z10;
            this.f79732c = z11;
        }

        public final boolean a() {
            return this.f79732c;
        }

        public final boolean b() {
            return this.f79731b;
        }

        public final String c() {
            return this.f79730a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f79730a, aVar.f79730a) && this.f79731b == aVar.f79731b && this.f79732c == aVar.f79732c;
        }

        public int hashCode() {
            String str = this.f79730a;
            return ((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.f79731b)) * 31) + Boolean.hashCode(this.f79732c);
        }

        public String toString() {
            String str = this.f79730a;
            boolean z10 = this.f79731b;
            boolean z11 = this.f79732c;
            return "UseCaseResult(url=" + str + ", open=" + z10 + ", available=" + z11 + ")";
        }
    }

    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    Object m3invokegIAlus(String str, C17164e<? super x<a>> eVar);
}
