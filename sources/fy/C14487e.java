package fy;

import IC.C13023e;
import KJ.C15987c;
import dy.C14357l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lfy/e;", "", "<init>", "()V", "b", "c", "a", "Lfy/e$a;", "Lfy/e$b;", "Lfy/e$c;", "reassurance-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fy.e  reason: case insensitive filesystem */
public abstract class C14487e {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lfy/e$a;", "Lfy/e;", "LKJ/c;", "Ldy/l;", "reassuranceItems", "LIC/e;", "message", "<init>", "(LKJ/c;LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "b", "()LKJ/c;", "LIC/e;", "()LIC/e;", "reassurance-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fy.e$a */
    public static final class a extends C14487e {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<C14357l> f127162a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f127163b;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(C15987c cVar, C13023e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(cVar, (i10 & 2) != 0 ? null : eVar);
        }

        public final C13023e a() {
            return this.f127163b;
        }

        public final C15987c<C14357l> b() {
            return this.f127162a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f127162a, aVar.f127162a) && C17542s.e(this.f127163b, aVar.f127163b);
        }

        public int hashCode() {
            int hashCode = this.f127162a.hashCode() * 31;
            C13023e eVar = this.f127163b;
            return hashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            C15987c<C14357l> cVar = this.f127162a;
            C13023e eVar = this.f127163b;
            return "Data(reassuranceItems=" + cVar + ", message=" + eVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C15987c<C14357l> cVar, C13023e eVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cVar, "reassuranceItems");
            this.f127162a = cVar;
            this.f127163b = eVar;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfy/e$b;", "Lfy/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "reassurance-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fy.e$b */
    public static final class b extends C14487e {

        /* renamed from: a  reason: collision with root package name */
        public static final b f127164a = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1147481984;
        }

        public String toString() {
            return "Error";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfy/e$c;", "Lfy/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "reassurance-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fy.e$c */
    public static final class c extends C14487e {

        /* renamed from: a  reason: collision with root package name */
        public static final c f127165a = new c();

        private c() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 739229876;
        }

        public String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ C14487e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C14487e() {
    }
}
