package Jy;

import IC.C13023e;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import rz.C15014g;
import rz.C15031y;
import xB.C15201a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\f\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LJy/o;", "", "<init>", "()V", "b", "a", "LJy/a;", "LJy/g;", "LJy/j;", "LJy/k;", "LJy/l;", "LJy/m;", "LJy/n;", "LJy/o$a;", "LJy/o$b;", "LJy/p;", "LJy/q;", "LJy/r;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class o {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\r\u001a\u0014\u001b\u0011B!\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0019\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0001\u0003\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"LJy/o$a;", "LJy/o;", "LxB/a;", "Lrz/g;", "product", "", "isSalesOrder", "isUpdatingQuantity", "<init>", "(Lrz/g;ZZ)V", "j", "()Z", "h", "a", "Lrz/g;", "g", "()Lrz/g;", "b", "Z", "i", "c", "n", "", "f", "()J", "stableId", "e", "d", "LJy/o$a$a;", "LJy/o$a$c;", "LJy/o$a$e;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a extends o implements C15201a {

        /* renamed from: a  reason: collision with root package name */
        private final C15014g f111429a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f111430b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f111431c;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"LJy/o$a$a;", "LJy/o$a;", "Lrz/g;", "product", "", "isSalesOrder", "isUpdatingQuantity", "<init>", "(Lrz/g;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Lrz/g;", "g", "()Lrz/g;", "e", "Z", "i", "()Z", "f", "n", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Jy.o$a$a  reason: collision with other inner class name */
        public static final class C2708a extends a {

            /* renamed from: d  reason: collision with root package name */
            private final C15014g f111432d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f111433e;

            /* renamed from: f  reason: collision with root package name */
            private final boolean f111434f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2708a(C15014g gVar, boolean z10, boolean z11) {
                super(gVar, z10, z11, (DefaultConstructorMarker) null);
                C17542s.j(gVar, "product");
                this.f111432d = gVar;
                this.f111433e = z10;
                this.f111434f = z11;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2708a)) {
                    return false;
                }
                C2708a aVar = (C2708a) obj;
                return C17542s.e(this.f111432d, aVar.f111432d) && this.f111433e == aVar.f111433e && this.f111434f == aVar.f111434f;
            }

            public C15014g g() {
                return this.f111432d;
            }

            public int hashCode() {
                return (((this.f111432d.hashCode() * 31) + Boolean.hashCode(this.f111433e)) * 31) + Boolean.hashCode(this.f111434f);
            }

            public boolean i() {
                return this.f111433e;
            }

            public boolean n() {
                return this.f111434f;
            }

            public String toString() {
                C15014g gVar = this.f111432d;
                boolean z10 = this.f111433e;
                boolean z11 = this.f111434f;
                return "CartItem(product=" + gVar + ", isSalesOrder=" + z10 + ", isUpdatingQuantity=" + z11 + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"LJy/o$a$b;", "LJy/o$a$c;", "Lrz/g;", "product", "", "isSalesOrder", "isUpdatingQuantity", "<init>", "(Lrz/g;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Lrz/g;", "()Lrz/g;", "h", "Z", "i", "()Z", "n", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends c {

            /* renamed from: g  reason: collision with root package name */
            private final C15014g f111435g;

            /* renamed from: h  reason: collision with root package name */
            private final boolean f111436h;

            /* renamed from: i  reason: collision with root package name */
            private final boolean f111437i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(C15014g gVar, boolean z10, boolean z11) {
                super(gVar, z10, z11, (DefaultConstructorMarker) null);
                C17542s.j(gVar, "product");
                this.f111435g = gVar;
                this.f111436h = z10;
                this.f111437i = z11;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f111435g, bVar.f111435g) && this.f111436h == bVar.f111436h && this.f111437i == bVar.f111437i;
            }

            public C15014g g() {
                return this.f111435g;
            }

            public int hashCode() {
                return (((this.f111435g.hashCode() * 31) + Boolean.hashCode(this.f111436h)) * 31) + Boolean.hashCode(this.f111437i);
            }

            public boolean i() {
                return this.f111436h;
            }

            public boolean n() {
                return this.f111437i;
            }

            public String toString() {
                C15014g gVar = this.f111435g;
                boolean z10 = this.f111436h;
                boolean z11 = this.f111437i;
                return "UnCollectedCashAndCarryItem(product=" + gVar + ", isSalesOrder=" + z10 + ", isUpdatingQuantity=" + z11 + ")";
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"LJy/o$a$c;", "LJy/o$a;", "Lrz/g;", "product", "", "isSalesOrder", "isUpdatingQuantity", "<init>", "(Lrz/g;ZZ)V", "d", "Lrz/g;", "g", "()Lrz/g;", "e", "Z", "i", "()Z", "f", "n", "LJy/o$a$b;", "LJy/o$a$d;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class c extends a {

            /* renamed from: d  reason: collision with root package name */
            private final C15014g f111438d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f111439e;

            /* renamed from: f  reason: collision with root package name */
            private final boolean f111440f;

            public /* synthetic */ c(C15014g gVar, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
                this(gVar, z10, z11);
            }

            public C15014g g() {
                return this.f111438d;
            }

            public boolean i() {
                return this.f111439e;
            }

            public boolean n() {
                return this.f111440f;
            }

            private c(C15014g gVar, boolean z10, boolean z11) {
                super(gVar, z10, z11, (DefaultConstructorMarker) null);
                this.f111438d = gVar;
                this.f111439e = z10;
                this.f111440f = z11;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"LJy/o$a$d;", "LJy/o$a$c;", "Lrz/g;", "product", "", "isSalesOrder", "isUpdatingQuantity", "<init>", "(Lrz/g;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Lrz/g;", "()Lrz/g;", "h", "Z", "i", "()Z", "n", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d extends c {

            /* renamed from: g  reason: collision with root package name */
            private final C15014g f111441g;

            /* renamed from: h  reason: collision with root package name */
            private final boolean f111442h;

            /* renamed from: i  reason: collision with root package name */
            private final boolean f111443i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(C15014g gVar, boolean z10, boolean z11) {
                super(gVar, z10, z11, (DefaultConstructorMarker) null);
                C17542s.j(gVar, "product");
                this.f111441g = gVar;
                this.f111442h = z10;
                this.f111443i = z11;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return C17542s.e(this.f111441g, dVar.f111441g) && this.f111442h == dVar.f111442h && this.f111443i == dVar.f111443i;
            }

            public C15014g g() {
                return this.f111441g;
            }

            public int hashCode() {
                return (((this.f111441g.hashCode() * 31) + Boolean.hashCode(this.f111442h)) * 31) + Boolean.hashCode(this.f111443i);
            }

            public boolean i() {
                return this.f111442h;
            }

            public boolean n() {
                return this.f111443i;
            }

            public String toString() {
                C15014g gVar = this.f111441g;
                boolean z10 = this.f111442h;
                boolean z11 = this.f111443i;
                return "UnCollectedSelfServeItem(product=" + gVar + ", isSalesOrder=" + z10 + ", isUpdatingQuantity=" + z11 + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"LJy/o$a$e;", "LJy/o$a;", "Lrz/g;", "product", "", "isSalesOrder", "isUpdatingQuantity", "<init>", "(Lrz/g;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Lrz/g;", "g", "()Lrz/g;", "e", "Z", "i", "()Z", "f", "n", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e extends a {

            /* renamed from: d  reason: collision with root package name */
            private final C15014g f111444d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f111445e;

            /* renamed from: f  reason: collision with root package name */
            private final boolean f111446f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(C15014g gVar, boolean z10, boolean z11) {
                super(gVar, z10, z11, (DefaultConstructorMarker) null);
                C17542s.j(gVar, "product");
                this.f111444d = gVar;
                this.f111445e = z10;
                this.f111446f = z11;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return C17542s.e(this.f111444d, eVar.f111444d) && this.f111445e == eVar.f111445e && this.f111446f == eVar.f111446f;
            }

            public C15014g g() {
                return this.f111444d;
            }

            public int hashCode() {
                return (((this.f111444d.hashCode() * 31) + Boolean.hashCode(this.f111445e)) * 31) + Boolean.hashCode(this.f111446f);
            }

            public boolean i() {
                return this.f111445e;
            }

            public boolean n() {
                return this.f111446f;
            }

            public String toString() {
                C15014g gVar = this.f111444d;
                boolean z10 = this.f111445e;
                boolean z11 = this.f111446f;
                return "UnavailableItem(product=" + gVar + ", isSalesOrder=" + z10 + ", isUpdatingQuantity=" + z11 + ")";
            }
        }

        public /* synthetic */ a(C15014g gVar, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(gVar, z10, z11);
        }

        public long f() {
            C15031y i10 = g().i();
            U u10 = new U(3);
            u10.a(P.b(a.class));
            u10.a(i10);
            u10.b(new Object[]{g().a()});
            return (long) Objects.hash(u10.d(new Object[u10.c()]));
        }

        public C15014g g() {
            return this.f111429a;
        }

        public final boolean h() {
            return g().b();
        }

        public boolean i() {
            return this.f111430b;
        }

        public final boolean j() {
            return g().i() == C15031y.SELF_SERVE;
        }

        public boolean n() {
            return this.f111431c;
        }

        private a(C15014g gVar, boolean z10, boolean z11) {
            super((DefaultConstructorMarker) null);
            this.f111429a = gVar;
            this.f111430b = z10;
            this.f111431c = z11;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0016B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010'\u001a\u00020\"8\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"LJy/o$b;", "LJy/o;", "LxB/a;", "LIC/e;", "title", "subTitle", "iconContentDescription", "LJy/o$b$a;", "type", "<init>", "(LIC/e;LIC/e;LIC/e;LJy/o$b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "getTitle", "()LIC/e;", "b", "h", "c", "g", "d", "LJy/o$b$a;", "i", "()LJy/o$b$a;", "", "e", "J", "f", "()J", "stableId", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends o implements C15201a {

        /* renamed from: f  reason: collision with root package name */
        public static final int f111447f = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f111448a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f111449b;

        /* renamed from: c  reason: collision with root package name */
        private final C13023e f111450c;

        /* renamed from: d  reason: collision with root package name */
        private final a f111451d;

        /* renamed from: e  reason: collision with root package name */
        private final long f111452e;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LJy/o$b$a;", "", "d", "a", "c", "b", "LJy/o$b$a$a;", "LJy/o$b$a$b;", "LJy/o$b$a$c;", "LJy/o$b$a$d;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface a {

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LJy/o$b$a$a;", "LJy/o$b$a;", "Lrz/y;", "productType", "<init>", "(Lrz/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrz/y;", "getProductType", "()Lrz/y;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Jy.o$b$a$a  reason: collision with other inner class name */
            public static final class C2709a implements a {

                /* renamed from: a  reason: collision with root package name */
                private final C15031y f111453a;

                public C2709a(C15031y yVar) {
                    C17542s.j(yVar, "productType");
                    this.f111453a = yVar;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2709a) && this.f111453a == ((C2709a) obj).f111453a;
                }

                public int hashCode() {
                    return this.f111453a.hashCode();
                }

                public String toString() {
                    C15031y yVar = this.f111453a;
                    return "Collect(productType=" + yVar + ")";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LJy/o$b$a$b;", "LJy/o$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Jy.o$b$a$b  reason: collision with other inner class name */
            public static final class C2710b implements a {

                /* renamed from: a  reason: collision with root package name */
                public static final C2710b f111454a = new C2710b();

                private C2710b() {
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C2710b);
                }

                public int hashCode() {
                    return -1943350191;
                }

                public String toString() {
                    return "CollectAfterCheckout";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LJy/o$b$a$c;", "LJy/o$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class c implements a {

                /* renamed from: a  reason: collision with root package name */
                public static final c f111455a = new c();

                private c() {
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public int hashCode() {
                    return -1593480496;
                }

                public String toString() {
                    return "Collected";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LJy/o$b$a$d;", "LJy/o$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class d implements a {

                /* renamed from: a  reason: collision with root package name */
                public static final d f111456a = new d();

                private d() {
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public int hashCode() {
                    return -550653417;
                }

                public String toString() {
                    return "Unavailable";
                }
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(C13023e eVar, C13023e eVar2, C13023e eVar3, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(eVar, (i10 & 2) != 0 ? null : eVar2, (i10 & 4) != 0 ? null : eVar3, aVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f111448a, bVar.f111448a) && C17542s.e(this.f111449b, bVar.f111449b) && C17542s.e(this.f111450c, bVar.f111450c) && C17542s.e(this.f111451d, bVar.f111451d);
        }

        public long f() {
            return this.f111452e;
        }

        public final C13023e g() {
            return this.f111450c;
        }

        public final C13023e getTitle() {
            return this.f111448a;
        }

        public final C13023e h() {
            return this.f111449b;
        }

        public int hashCode() {
            int hashCode = this.f111448a.hashCode() * 31;
            C13023e eVar = this.f111449b;
            int i10 = 0;
            int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
            C13023e eVar2 = this.f111450c;
            if (eVar2 != null) {
                i10 = eVar2.hashCode();
            }
            return ((hashCode2 + i10) * 31) + this.f111451d.hashCode();
        }

        public final a i() {
            return this.f111451d;
        }

        public String toString() {
            C13023e eVar = this.f111448a;
            C13023e eVar2 = this.f111449b;
            C13023e eVar3 = this.f111450c;
            a aVar = this.f111451d;
            return "SectionHeader(title=" + eVar + ", subTitle=" + eVar2 + ", iconContentDescription=" + eVar3 + ", type=" + aVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C13023e eVar, C13023e eVar2, C13023e eVar3, a aVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(eVar, "title");
            C17542s.j(aVar, "type");
            this.f111448a = eVar;
            this.f111449b = eVar2;
            this.f111450c = eVar3;
            this.f111451d = aVar;
            U u10 = new U(3);
            u10.a(P.b(b.class));
            u10.a(eVar);
            u10.b(new Object[]{aVar});
            this.f111452e = (long) Objects.hash(u10.d(new Object[u10.c()]));
        }
    }

    public /* synthetic */ o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private o() {
    }
}
