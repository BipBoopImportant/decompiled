package MG;

import OE.n;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \t2\u00020\u0001:\u0005\n\t\u000b\f\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"LMG/b;", "", "<init>", "()V", "", "a", "J", "()J", "timeOut", "b", "c", "d", "e", "LMG/b$b;", "LMG/b$c;", "LMG/b$d;", "LMG/b$e;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: MG.b  reason: case insensitive filesystem */
public abstract class C16033b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f136227b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f136228a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LMG/b$a;", "", "<init>", "()V", "", "MIN_TIME_OUT", "J", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: MG.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LMG/b$b;", "LMG/b;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "b", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: MG.b$b  reason: collision with other inner class name */
    public static final class C3349b extends C16033b {

        /* renamed from: c  reason: collision with root package name */
        private final String f136229c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3349b(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "message");
            this.f136229c = str;
        }

        public final String b() {
            return this.f136229c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3349b) && C17542s.e(this.f136229c, ((C3349b) obj).f136229c);
        }

        public int hashCode() {
            return this.f136229c.hashCode();
        }

        public String toString() {
            String str = this.f136229c;
            return "EngineStatusDialog(message=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\t¨\u0006\u0013"}, d2 = {"LMG/b$c;", "LMG/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "I", "b", "messageRes", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: MG.b$c */
    public static final class c extends C16033b {

        /* renamed from: c  reason: collision with root package name */
        public static final c f136230c = new c();

        /* renamed from: d  reason: collision with root package name */
        private static final int f136231d = n.f113254O2;

        private c() {
            super((DefaultConstructorMarker) null);
        }

        public final int b() {
            return f136231d;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1693731008;
        }

        public String toString() {
            return "SavedStatusDialog";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"LMG/b$d;", "LMG/b;", "", "message", "", "messageResId", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "b", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: MG.b$d */
    public static final class d extends C16033b {

        /* renamed from: c  reason: collision with root package name */
        private final String f136232c;

        /* renamed from: d  reason: collision with root package name */
        private final Integer f136233d;

        public d() {
            this((String) null, (Integer) null, 3, (DefaultConstructorMarker) null);
        }

        public final String b() {
            return this.f136232c;
        }

        public final Integer c() {
            return this.f136233d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f136232c, dVar.f136232c) && C17542s.e(this.f136233d, dVar.f136233d);
        }

        public int hashCode() {
            String str = this.f136232c;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f136233d;
            if (num != null) {
                i10 = num.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            String str = this.f136232c;
            Integer num = this.f136233d;
            return "UserMessage(message=" + str + ", messageResId=" + num + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(String str, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num);
        }

        public d(String str, Integer num) {
            super((DefaultConstructorMarker) null);
            this.f136232c = str;
            this.f136233d = num;
            if (str == null && num == null) {
                throw new IllegalArgumentException("Either message or messageResId must be provided");
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016XD¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\f¨\u0006\u001f"}, d2 = {"LMG/b$e;", "LMG/b;", "Lkotlin/Function0;", "LXH/N;", "onUndo", "<init>", "(LnI/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "LnI/a;", "()LnI/a;", "", "d", "J", "a", "()J", "timeOut", "e", "I", "b", "messageRes", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: MG.b$e */
    public static final class e extends C16033b {

        /* renamed from: c  reason: collision with root package name */
        private final C17631a<C16807N> f136234c;

        /* renamed from: d  reason: collision with root package name */
        private final long f136235d = 5000;

        /* renamed from: e  reason: collision with root package name */
        private final int f136236e = n.f113418n3;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a<C16807N> aVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(aVar, "onUndo");
            this.f136234c = aVar;
        }

        public long a() {
            return this.f136235d;
        }

        public final int b() {
            return this.f136236e;
        }

        public final C17631a<C16807N> c() {
            return this.f136234c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C17542s.e(this.f136234c, ((e) obj).f136234c);
        }

        public int hashCode() {
            return this.f136234c.hashCode();
        }

        public String toString() {
            C17631a<C16807N> aVar = this.f136234c;
            return "VariantUndoStatusDialog(onUndo=" + aVar + ")";
        }
    }

    public /* synthetic */ C16033b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public long a() {
        return this.f136228a;
    }

    private C16033b() {
        this.f136228a = 3500;
    }
}
