package Uj;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0005\t\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"LUj/a;", "", "<init>", "()V", "", "a", "()I", "totalQuantity", "LUj/a$c;", "b", "()LUj/a$c;", "trigger", "c", "LUj/a$a;", "LUj/a$b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Uj.a  reason: case insensitive filesystem */
public abstract class C10958a {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"LUj/a$a;", "LUj/a;", "", "totalQuantity", "LUj/a$c;", "trigger", "<init>", "(ILUj/a$c;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "LUj/a$c;", "()LUj/a$c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Uj.a$a  reason: collision with other inner class name */
    public static final class C1836a extends C10958a {

        /* renamed from: a  reason: collision with root package name */
        private final int f87999a;

        /* renamed from: b  reason: collision with root package name */
        private final c f88000b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1836a(int i10, c cVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cVar, "trigger");
            this.f87999a = i10;
            this.f88000b = cVar;
        }

        public int a() {
            return this.f87999a;
        }

        public c b() {
            return this.f88000b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1836a)) {
                return false;
            }
            C1836a aVar = (C1836a) obj;
            return this.f87999a == aVar.f87999a && this.f88000b == aVar.f88000b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f87999a) * 31) + this.f88000b.hashCode();
        }

        public String toString() {
            int i10 = this.f87999a;
            c cVar = this.f88000b;
            return "Badge(totalQuantity=" + i10 + ", trigger=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"LUj/a$b;", "LUj/a;", "<init>", "()V", "", "b", "I", "a", "()I", "totalQuantity", "LUj/a$c;", "c", "LUj/a$c;", "()LUj/a$c;", "trigger", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Uj.a$b */
    public static final class b extends C10958a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f88001a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final int f88002b = 0;

        /* renamed from: c  reason: collision with root package name */
        private static final c f88003c = c.Other;

        private b() {
            super((DefaultConstructorMarker) null);
        }

        public int a() {
            return f88002b;
        }

        public c b() {
            return f88003c;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LUj/a$c;", "", "<init>", "(Ljava/lang/String;I)V", "Other", "ProductAdded", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Uj.a$c */
    public enum c {
        Other,
        ProductAdded;

        static {
            c[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    public /* synthetic */ C10958a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int a();

    public abstract c b();

    private C10958a() {
    }
}
