package XC;

import IC.C13023e;
import TJ.C16519P;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import xB.C15201a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"LXC/a;", "", "", "id", "LXH/N;", "A", "(Ljava/lang/String;)V", "f", "r", "()V", "LTJ/P;", "LXC/a$a;", "m", "()LTJ/P;", "uiState", "a", "time-slot-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: XC.a  reason: case insensitive filesystem */
public interface C13802a {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LXC/a$a;", "", "<init>", "()V", "c", "b", "a", "LXC/a$a$a;", "LXC/a$a$b;", "LXC/a$a$c;", "time-slot-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: XC.a$a  reason: collision with other inner class name */
    public static abstract class C2911a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LXC/a$a$b;", "LXC/a$a;", "LIC/e;", "text", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "time-slot-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: XC.a$a$b */
        public static final class b extends C2911a {

            /* renamed from: b  reason: collision with root package name */
            public static final int f117798b = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f117799a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(C13023e eVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(eVar, "text");
                this.f117799a = eVar;
            }

            public final C13023e a() {
                return this.f117799a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f117799a, ((b) obj).f117799a);
            }

            public int hashCode() {
                return this.f117799a.hashCode();
            }

            public String toString() {
                C13023e eVar = this.f117799a;
                return "FullScreenLoading(text=" + eVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"LXC/a$a$c;", "LXC/a$a;", "LIC/e;", "title", "description", "<init>", "(LIC/e;LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "b", "()LIC/e;", "time-slot-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: XC.a$a$c */
        public static final class c extends C2911a {

            /* renamed from: c  reason: collision with root package name */
            public static final int f117800c = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f117801a;

            /* renamed from: b  reason: collision with root package name */
            private final C13023e f117802b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(C13023e eVar, C13023e eVar2) {
                super((DefaultConstructorMarker) null);
                C17542s.j(eVar, "title");
                this.f117801a = eVar;
                this.f117802b = eVar2;
            }

            public final C13023e a() {
                return this.f117802b;
            }

            public final C13023e b() {
                return this.f117801a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return C17542s.e(this.f117801a, cVar.f117801a) && C17542s.e(this.f117802b, cVar.f117802b);
            }

            public int hashCode() {
                int hashCode = this.f117801a.hashCode() * 31;
                C13023e eVar = this.f117802b;
                return hashCode + (eVar == null ? 0 : eVar.hashCode());
            }

            public String toString() {
                C13023e eVar = this.f117801a;
                C13023e eVar2 = this.f117802b;
                return "Loading(title=" + eVar + ", description=" + eVar2 + ")";
            }
        }

        public /* synthetic */ C2911a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2911a() {
        }

        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001:\u0004\u001b$!\u001fBI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001b\u0010&R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b\u001f\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b$\u0010(¨\u0006)"}, d2 = {"LXC/a$a$a;", "LXC/a$a;", "LIC/e;", "title", "description", "LXC/a$a$a$a;", "bookedSlot", "", "LXC/a$a$a$d;", "availableSlotGroups", "LXC/a$a$a$c;", "availableTimeSlots", "LXC/a$a$a$b;", "buttonState", "<init>", "(LIC/e;LIC/e;LXC/a$a$a$a;Ljava/util/List;Ljava/util/List;LXC/a$a$a$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "f", "()LIC/e;", "b", "e", "c", "LXC/a$a$a$a;", "()LXC/a$a$a$a;", "d", "Ljava/util/List;", "()Ljava/util/List;", "LXC/a$a$a$b;", "()LXC/a$a$a$b;", "time-slot-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: XC.a$a$a  reason: collision with other inner class name */
        public static final class C2912a extends C2911a {

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f117775a;

            /* renamed from: b  reason: collision with root package name */
            private final C13023e f117776b;

            /* renamed from: c  reason: collision with root package name */
            private final C2913a f117777c;

            /* renamed from: d  reason: collision with root package name */
            private final List<d> f117778d;

            /* renamed from: e  reason: collision with root package name */
            private final List<c> f117779e;

            /* renamed from: f  reason: collision with root package name */
            private final b f117780f;

            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\r¨\u0006\u0018"}, d2 = {"LXC/a$a$a$a;", "", "LIC/e;", "label", "text", "", "leadingIconRes", "<init>", "(LIC/e;LIC/e;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "b", "c", "I", "time-slot-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: XC.a$a$a$a  reason: collision with other inner class name */
            public static final class C2913a {

                /* renamed from: d  reason: collision with root package name */
                public static final int f117781d = C13023e.f110931a;

                /* renamed from: a  reason: collision with root package name */
                private final C13023e f117782a;

                /* renamed from: b  reason: collision with root package name */
                private final C13023e f117783b;

                /* renamed from: c  reason: collision with root package name */
                private final int f117784c;

                public C2913a(C13023e eVar, C13023e eVar2, int i10) {
                    C17542s.j(eVar, "label");
                    C17542s.j(eVar2, "text");
                    this.f117782a = eVar;
                    this.f117783b = eVar2;
                    this.f117784c = i10;
                }

                public final C13023e a() {
                    return this.f117782a;
                }

                public final int b() {
                    return this.f117784c;
                }

                public final C13023e c() {
                    return this.f117783b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2913a)) {
                        return false;
                    }
                    C2913a aVar = (C2913a) obj;
                    return C17542s.e(this.f117782a, aVar.f117782a) && C17542s.e(this.f117783b, aVar.f117783b) && this.f117784c == aVar.f117784c;
                }

                public int hashCode() {
                    return (((this.f117782a.hashCode() * 31) + this.f117783b.hashCode()) * 31) + Integer.hashCode(this.f117784c);
                }

                public String toString() {
                    C13023e eVar = this.f117782a;
                    C13023e eVar2 = this.f117783b;
                    int i10 = this.f117784c;
                    return "BookedSlot(label=" + eVar + ", text=" + eVar2 + ", leadingIconRes=" + i10 + ")";
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"LXC/a$a$a$b;", "", "", "loading", "LIC/e;", "text", "<init>", "(ZLIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "LIC/e;", "()LIC/e;", "time-slot-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: XC.a$a$a$b */
            public static final class b {

                /* renamed from: c  reason: collision with root package name */
                public static final int f117785c = C13023e.f110931a;

                /* renamed from: a  reason: collision with root package name */
                private final boolean f117786a;

                /* renamed from: b  reason: collision with root package name */
                private final C13023e f117787b;

                public b(boolean z10, C13023e eVar) {
                    C17542s.j(eVar, "text");
                    this.f117786a = z10;
                    this.f117787b = eVar;
                }

                public final boolean a() {
                    return this.f117786a;
                }

                public final C13023e b() {
                    return this.f117787b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.f117786a == bVar.f117786a && C17542s.e(this.f117787b, bVar.f117787b);
                }

                public int hashCode() {
                    return (Boolean.hashCode(this.f117786a) * 31) + this.f117787b.hashCode();
                }

                public String toString() {
                    boolean z10 = this.f117786a;
                    C13023e eVar = this.f117787b;
                    return "ButtonState(loading=" + z10 + ", text=" + eVar + ")";
                }
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0018\u0010\f¨\u0006\u001b"}, d2 = {"LXC/a$a$a$d;", "", "", "id", "", "enabled", "isSelected", "title", "subtitle", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "c", "e", "d", "time-slot-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: XC.a$a$a$d */
            public static final class d {

                /* renamed from: a  reason: collision with root package name */
                private final String f117793a;

                /* renamed from: b  reason: collision with root package name */
                private final boolean f117794b;

                /* renamed from: c  reason: collision with root package name */
                private final boolean f117795c;

                /* renamed from: d  reason: collision with root package name */
                private final String f117796d;

                /* renamed from: e  reason: collision with root package name */
                private final String f117797e;

                public d(String str, boolean z10, boolean z11, String str2, String str3) {
                    C17542s.j(str, "id");
                    C17542s.j(str2, "title");
                    C17542s.j(str3, "subtitle");
                    this.f117793a = str;
                    this.f117794b = z10;
                    this.f117795c = z11;
                    this.f117796d = str2;
                    this.f117797e = str3;
                }

                public final boolean a() {
                    return this.f117794b;
                }

                public final String b() {
                    return this.f117793a;
                }

                public final String c() {
                    return this.f117797e;
                }

                public final String d() {
                    return this.f117796d;
                }

                public final boolean e() {
                    return this.f117795c;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return C17542s.e(this.f117793a, dVar.f117793a) && this.f117794b == dVar.f117794b && this.f117795c == dVar.f117795c && C17542s.e(this.f117796d, dVar.f117796d) && C17542s.e(this.f117797e, dVar.f117797e);
                }

                public int hashCode() {
                    return (((((((this.f117793a.hashCode() * 31) + Boolean.hashCode(this.f117794b)) * 31) + Boolean.hashCode(this.f117795c)) * 31) + this.f117796d.hashCode()) * 31) + this.f117797e.hashCode();
                }

                public String toString() {
                    String str = this.f117793a;
                    boolean z10 = this.f117794b;
                    boolean z11 = this.f117795c;
                    String str2 = this.f117796d;
                    String str3 = this.f117797e;
                    return "TimeSlotGroup(id=" + str + ", enabled=" + z10 + ", isSelected=" + z11 + ", title=" + str2 + ", subtitle=" + str3 + ")";
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2912a(C13023e eVar, C13023e eVar2, C2913a aVar, List<d> list, List<c> list2, b bVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(eVar, "title");
                C17542s.j(list, "availableSlotGroups");
                C17542s.j(list2, "availableTimeSlots");
                this.f117775a = eVar;
                this.f117776b = eVar2;
                this.f117777c = aVar;
                this.f117778d = list;
                this.f117779e = list2;
                this.f117780f = bVar;
            }

            public final List<d> a() {
                return this.f117778d;
            }

            public final List<c> b() {
                return this.f117779e;
            }

            public final C2913a c() {
                return this.f117777c;
            }

            public final b d() {
                return this.f117780f;
            }

            public final C13023e e() {
                return this.f117776b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2912a)) {
                    return false;
                }
                C2912a aVar = (C2912a) obj;
                return C17542s.e(this.f117775a, aVar.f117775a) && C17542s.e(this.f117776b, aVar.f117776b) && C17542s.e(this.f117777c, aVar.f117777c) && C17542s.e(this.f117778d, aVar.f117778d) && C17542s.e(this.f117779e, aVar.f117779e) && C17542s.e(this.f117780f, aVar.f117780f);
            }

            public final C13023e f() {
                return this.f117775a;
            }

            public int hashCode() {
                int hashCode = this.f117775a.hashCode() * 31;
                C13023e eVar = this.f117776b;
                int i10 = 0;
                int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
                C2913a aVar = this.f117777c;
                int hashCode3 = (((((hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f117778d.hashCode()) * 31) + this.f117779e.hashCode()) * 31;
                b bVar = this.f117780f;
                if (bVar != null) {
                    i10 = bVar.hashCode();
                }
                return hashCode3 + i10;
            }

            public String toString() {
                C13023e eVar = this.f117775a;
                C13023e eVar2 = this.f117776b;
                C2913a aVar = this.f117777c;
                List<d> list = this.f117778d;
                List<c> list2 = this.f117779e;
                b bVar = this.f117780f;
                return "Content(title=" + eVar + ", description=" + eVar2 + ", bookedSlot=" + aVar + ", availableSlotGroups=" + list + ", availableTimeSlots=" + list2 + ", buttonState=" + bVar + ")";
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010#\u001a\u00020\u001e8\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LXC/a$a$a$c;", "LxB/a;", "", "id", "", "isSelected", "formattedText", "trailingText", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Z", "i", "()Z", "c", "g", "d", "h", "", "e", "J", "f", "()J", "stableId", "time-slot-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: XC.a$a$a$c */
            public static final class c implements C15201a {

                /* renamed from: a  reason: collision with root package name */
                private final String f117788a;

                /* renamed from: b  reason: collision with root package name */
                private final boolean f117789b;

                /* renamed from: c  reason: collision with root package name */
                private final String f117790c;

                /* renamed from: d  reason: collision with root package name */
                private final String f117791d;

                /* renamed from: e  reason: collision with root package name */
                private final long f117792e;

                public c(String str, boolean z10, String str2, String str3) {
                    C17542s.j(str, "id");
                    C17542s.j(str2, "formattedText");
                    this.f117788a = str;
                    this.f117789b = z10;
                    this.f117790c = str2;
                    this.f117791d = str3;
                    U u10 = new U(3);
                    u10.a(P.b(c.class));
                    u10.a(str);
                    u10.b(new Object[0]);
                    this.f117792e = (long) Objects.hash(u10.d(new Object[u10.c()]));
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return C17542s.e(this.f117788a, cVar.f117788a) && this.f117789b == cVar.f117789b && C17542s.e(this.f117790c, cVar.f117790c) && C17542s.e(this.f117791d, cVar.f117791d);
                }

                public long f() {
                    return this.f117792e;
                }

                public final String g() {
                    return this.f117790c;
                }

                public final String getId() {
                    return this.f117788a;
                }

                public final String h() {
                    return this.f117791d;
                }

                public int hashCode() {
                    int hashCode = ((((this.f117788a.hashCode() * 31) + Boolean.hashCode(this.f117789b)) * 31) + this.f117790c.hashCode()) * 31;
                    String str = this.f117791d;
                    return hashCode + (str == null ? 0 : str.hashCode());
                }

                public final boolean i() {
                    return this.f117789b;
                }

                public String toString() {
                    String str = this.f117788a;
                    boolean z10 = this.f117789b;
                    String str2 = this.f117790c;
                    String str3 = this.f117791d;
                    return "TimeSlot(id=" + str + ", isSelected=" + z10 + ", formattedText=" + str2 + ", trailingText=" + str3 + ")";
                }

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ c(String str, boolean z10, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, z10, str2, (i10 & 8) != 0 ? null : str3);
                }
            }
        }
    }

    void A(String str);

    void f(String str);

    C16519P<C2911a> m();

    void r();
}
