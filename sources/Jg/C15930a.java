package JG;

import OE.n;
import com.sugarcube.common.UiText;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LJG/a;", "", "<init>", "()V", "f", "d", "e", "c", "b", "a", "LJG/a$a;", "LJG/a$b;", "LJG/a$c;", "LJG/a$d;", "LJG/a$e;", "LJG/a$f;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: JG.a  reason: case insensitive filesystem */
public abstract class C15930a {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001a\u0010\u0016\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\n¨\u0006\u0017"}, d2 = {"LJG/a$a;", "LJG/a;", "", "debugInfo", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "titleRes", "primaryButtonRes", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: JG.a$a  reason: collision with other inner class name */
    public static final class C3338a extends C15930a {

        /* renamed from: a  reason: collision with root package name */
        private final String f135585a;

        /* renamed from: b  reason: collision with root package name */
        private final int f135586b = n.f113266Q2;

        /* renamed from: c  reason: collision with root package name */
        private final int f135587c = n.f113227K;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3338a(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "debugInfo");
            this.f135585a = str;
        }

        public final String a() {
            return this.f135585a;
        }

        public int b() {
            return this.f135587c;
        }

        public int c() {
            return this.f135586b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3338a) && C17542s.e(this.f135585a, ((C3338a) obj).f135585a);
        }

        public int hashCode() {
            return this.f135585a.hashCode();
        }

        public String toString() {
            String str = this.f135585a;
            return "EngineDebugInfo(debugInfo=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u001a\u0010\u001c\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\r¨\u0006\u001d"}, d2 = {"LJG/a$b;", "LJG/a;", "Lcom/sugarcube/common/UiText;", "errorMessage", "", "fatal", "<init>", "(Lcom/sugarcube/common/UiText;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/common/UiText;", "()Lcom/sugarcube/common/UiText;", "b", "Z", "()Z", "c", "I", "d", "titleRes", "primaryButtonRes", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: JG.a$b */
    public static final class b extends C15930a {

        /* renamed from: a  reason: collision with root package name */
        private final UiText f135588a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f135589b;

        /* renamed from: c  reason: collision with root package name */
        private final int f135590c = n.f113272R2;

        /* renamed from: d  reason: collision with root package name */
        private final int f135591d = n.f113227K;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(UiText uiText, boolean z10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(uiText, "errorMessage");
            this.f135588a = uiText;
            this.f135589b = z10;
        }

        public final UiText a() {
            return this.f135588a;
        }

        public final boolean b() {
            return this.f135589b;
        }

        public int c() {
            return this.f135591d;
        }

        public int d() {
            return this.f135590c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f135588a, bVar.f135588a) && this.f135589b == bVar.f135589b;
        }

        public int hashCode() {
            return (this.f135588a.hashCode() * 31) + Boolean.hashCode(this.f135589b);
        }

        public String toString() {
            UiText uiText = this.f135588a;
            boolean z10 = this.f135589b;
            return "Error(errorMessage=" + uiText + ", fatal=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0019\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u001a"}, d2 = {"LJG/a$c;", "LJG/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "d", "titleRes", "c", "a", "()Ljava/lang/Integer;", "bodyRes", "primaryButtonRes", "e", "secondaryButtonRes", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: JG.a$c */
    public static final class c extends C15930a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f135592a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final int f135593b = n.f113397k3;

        /* renamed from: c  reason: collision with root package name */
        private static final int f135594c = n.f113425o3;

        /* renamed from: d  reason: collision with root package name */
        private static final int f135595d = n.f113191E;

        /* renamed from: e  reason: collision with root package name */
        private static final int f135596e = n.f113311Y;

        private c() {
            super((DefaultConstructorMarker) null);
        }

        public Integer a() {
            return Integer.valueOf(f135594c);
        }

        public int b() {
            return f135595d;
        }

        public Integer c() {
            return Integer.valueOf(f135596e);
        }

        public int d() {
            return f135593b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1783756049;
        }

        public String toString() {
            return "LoginOrSignUp";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0019\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u001a"}, d2 = {"LJG/a$d;", "LJG/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "d", "titleRes", "c", "a", "()Ljava/lang/Integer;", "bodyRes", "primaryButtonRes", "e", "secondaryButtonRes", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: JG.a$d */
    public static final class d extends C15930a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f135597a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final int f135598b = n.f113260P2;

        /* renamed from: c  reason: collision with root package name */
        private static final int f135599c = n.f113236L2;

        /* renamed from: d  reason: collision with root package name */
        private static final int f135600d = n.f113442r;

        /* renamed from: e  reason: collision with root package name */
        private static final int f135601e = n.f113351e;

        private d() {
            super((DefaultConstructorMarker) null);
        }

        public Integer a() {
            return Integer.valueOf(f135599c);
        }

        public int b() {
            return f135600d;
        }

        public Integer c() {
            return Integer.valueOf(f135601e);
        }

        public int d() {
            return f135598b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 1011600770;
        }

        public String toString() {
            return "SaveAndExitOrCancel";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0019\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u001a"}, d2 = {"LJG/a$e;", "LJG/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "d", "titleRes", "c", "a", "()Ljava/lang/Integer;", "bodyRes", "primaryButtonRes", "e", "secondaryButtonRes", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: JG.a$e */
    public static final class e extends C15930a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f135602a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final int f135603b = n.f113397k3;

        /* renamed from: c  reason: collision with root package name */
        private static final int f135604c = n.f113446r3;

        /* renamed from: d  reason: collision with root package name */
        private static final int f135605d = n.f113263Q;

        /* renamed from: e  reason: collision with root package name */
        private static final int f135606e = n.f113379i;

        private e() {
            super((DefaultConstructorMarker) null);
        }

        public Integer a() {
            return Integer.valueOf(f135604c);
        }

        public int b() {
            return f135605d;
        }

        public Integer c() {
            return Integer.valueOf(f135606e);
        }

        public int d() {
            return f135603b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -1878963562;
        }

        public String toString() {
            return "SaveAndExitOrDiscard";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0013\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0017\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\t¨\u0006\u001b"}, d2 = {"LJG/a$f;", "LJG/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "c", "titleRes", "primaryButtonRes", "d", "getSecondaryButtonRes", "()Ljava/lang/Integer;", "secondaryButtonRes", "e", "a", "hintTextRes", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: JG.a$f */
    public static final class f extends C15930a {

        /* renamed from: a  reason: collision with root package name */
        public static final f f135607a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final int f135608b = n.f113404l3;

        /* renamed from: c  reason: collision with root package name */
        private static final int f135609c = n.f113227K;

        /* renamed from: d  reason: collision with root package name */
        private static final int f135610d = n.f113351e;

        /* renamed from: e  reason: collision with root package name */
        private static final int f135611e = n.f113453s3;

        private f() {
            super((DefaultConstructorMarker) null);
        }

        public final int a() {
            return f135611e;
        }

        public int b() {
            return f135609c;
        }

        public int c() {
            return f135608b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return -1074772978;
        }

        public String toString() {
            return "SaveNewDesign";
        }
    }

    public /* synthetic */ C15930a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C15930a() {
    }
}
