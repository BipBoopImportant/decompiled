package jD;

import kD.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0005J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LjD/a;", "", "LkD/l;", "state", "LjD/a$a;", "a", "(LkD/l;)LjD/a$a;", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jD.a  reason: case insensitive filesystem */
public interface C14619a {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LjD/a$a;", "", "<init>", "()V", "b", "c", "a", "LjD/a$a$a;", "LjD/a$a$b;", "LjD/a$a$c;", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jD.a$a  reason: collision with other inner class name */
    public static abstract class C3153a {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"LjD/a$a$a;", "LjD/a$a;", "", "message", "", "throwable", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jD.a$a$a  reason: collision with other inner class name */
        public static final class C3154a extends C3153a {

            /* renamed from: a  reason: collision with root package name */
            private final String f127884a;

            /* renamed from: b  reason: collision with root package name */
            private final Throwable f127885b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3154a(String str, Throwable th2) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "message");
                this.f127884a = str;
                this.f127885b = th2;
            }

            public final String a() {
                return this.f127884a;
            }

            public final Throwable b() {
                return this.f127885b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3154a)) {
                    return false;
                }
                C3154a aVar = (C3154a) obj;
                return C17542s.e(this.f127884a, aVar.f127884a) && C17542s.e(this.f127885b, aVar.f127885b);
            }

            public int hashCode() {
                int hashCode = this.f127884a.hashCode() * 31;
                Throwable th2 = this.f127885b;
                return hashCode + (th2 == null ? 0 : th2.hashCode());
            }

            public String toString() {
                String str = this.f127884a;
                Throwable th2 = this.f127885b;
                return "Failure(message=" + str + ", throwable=" + th2 + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C3154a(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjD/a$a$b;", "LjD/a$a;", "<init>", "()V", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jD.a$a$b */
        public static final class b extends C3153a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f127886a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjD/a$a$c;", "LjD/a$a;", "<init>", "()V", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jD.a$a$c */
        public static final class c extends C3153a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f127887a = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C3153a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3153a() {
        }
    }

    C3153a a(l lVar);
}
