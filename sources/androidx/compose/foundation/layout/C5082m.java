package androidx.compose.foundation.layout;

import E1.a0;
import c2.t;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u000b2\u00020\u0001:\u0007\u000b\r\u0010\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H ¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8PX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0001\u0006\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/m;", "", "<init>", "()V", "", "size", "Lc2/t;", "layoutDirection", "LE1/a0;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILc2/t;LE1/a0;I)I", "b", "(LE1/a0;)Ljava/lang/Integer;", "", "c", "()Z", "isRelative", "d", "e", "f", "g", "Landroidx/compose/foundation/layout/m$a;", "Landroidx/compose/foundation/layout/m$b;", "Landroidx/compose/foundation/layout/m$d;", "Landroidx/compose/foundation/layout/m$e;", "Landroidx/compose/foundation/layout/m$f;", "Landroidx/compose/foundation/layout/m$g;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.m  reason: case insensitive filesystem */
public abstract class C5082m {

    /* renamed from: a  reason: collision with root package name */
    public static final c f18136a = new c((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final C5082m f18137b = b.f18141e;

    /* renamed from: c  reason: collision with root package name */
    private static final C5082m f18138c = f.f18144e;

    /* renamed from: d  reason: collision with root package name */
    private static final C5082m f18139d = d.f18142e;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158PX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/m$a;", "Landroidx/compose/foundation/layout/m;", "Landroidx/compose/foundation/layout/c;", "alignmentLineProvider", "<init>", "(Landroidx/compose/foundation/layout/c;)V", "LE1/a0;", "placeable", "", "b", "(LE1/a0;)Ljava/lang/Integer;", "size", "Lc2/t;", "layoutDirection", "beforeCrossAxisAlignmentLine", "a", "(ILc2/t;LE1/a0;I)I", "e", "Landroidx/compose/foundation/layout/c;", "getAlignmentLineProvider", "()Landroidx/compose/foundation/layout/c;", "", "c", "()Z", "isRelative", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.m$a */
    private static final class a extends C5082m {

        /* renamed from: e  reason: collision with root package name */
        private final C5072c f18140e;

        public a(C5072c cVar) {
            super((DefaultConstructorMarker) null);
            this.f18140e = cVar;
        }

        public int a(int i10, t tVar, a0 a0Var, int i11) {
            int a10 = this.f18140e.a(a0Var);
            if (a10 == Integer.MIN_VALUE) {
                return 0;
            }
            int i12 = i11 - a10;
            return tVar == t.Rtl ? i10 - i12 : i12;
        }

        public Integer b(a0 a0Var) {
            return Integer.valueOf(this.f18140e.a(a0Var));
        }

        public boolean c() {
            return true;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/m$b;", "Landroidx/compose/foundation/layout/m;", "<init>", "()V", "", "size", "Lc2/t;", "layoutDirection", "LE1/a0;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILc2/t;LE1/a0;I)I", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.m$b */
    private static final class b extends C5082m {

        /* renamed from: e  reason: collision with root package name */
        public static final b f18141e = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }

        public int a(int i10, t tVar, a0 a0Var, int i11) {
            return i10 / 2;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/m$c;", "", "<init>", "()V", "Landroidx/compose/foundation/layout/c;", "alignmentLineProvider", "Landroidx/compose/foundation/layout/m;", "a", "(Landroidx/compose/foundation/layout/c;)Landroidx/compose/foundation/layout/m;", "Li1/c$c;", "vertical", "c", "(Li1/c$c;)Landroidx/compose/foundation/layout/m;", "Li1/c$b;", "horizontal", "b", "(Li1/c$b;)Landroidx/compose/foundation/layout/m;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.m$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5082m a(C5072c cVar) {
            return new a(cVar);
        }

        public final C5082m b(C5437c.b bVar) {
            return new e(bVar);
        }

        public final C5082m c(C5437c.C0386c cVar) {
            return new g(cVar);
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/m$d;", "Landroidx/compose/foundation/layout/m;", "<init>", "()V", "", "size", "Lc2/t;", "layoutDirection", "LE1/a0;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILc2/t;LE1/a0;I)I", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.m$d */
    private static final class d extends C5082m {

        /* renamed from: e  reason: collision with root package name */
        public static final d f18142e = new d();

        private d() {
            super((DefaultConstructorMarker) null);
        }

        public int a(int i10, t tVar, a0 a0Var, int i11) {
            if (tVar == t.Ltr) {
                return i10;
            }
            return 0;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/m$e;", "Landroidx/compose/foundation/layout/m;", "Li1/c$b;", "horizontal", "<init>", "(Li1/c$b;)V", "", "size", "Lc2/t;", "layoutDirection", "LE1/a0;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILc2/t;LE1/a0;I)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Li1/c$b;", "getHorizontal", "()Li1/c$b;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.m$e */
    private static final class e extends C5082m {

        /* renamed from: e  reason: collision with root package name */
        private final C5437c.b f18143e;

        public e(C5437c.b bVar) {
            super((DefaultConstructorMarker) null);
            this.f18143e = bVar;
        }

        public int a(int i10, t tVar, a0 a0Var, int i11) {
            return this.f18143e.a(0, i10, tVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C17542s.e(this.f18143e, ((e) obj).f18143e);
        }

        public int hashCode() {
            return this.f18143e.hashCode();
        }

        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f18143e + ')';
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/m$f;", "Landroidx/compose/foundation/layout/m;", "<init>", "()V", "", "size", "Lc2/t;", "layoutDirection", "LE1/a0;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILc2/t;LE1/a0;I)I", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.m$f */
    private static final class f extends C5082m {

        /* renamed from: e  reason: collision with root package name */
        public static final f f18144e = new f();

        private f() {
            super((DefaultConstructorMarker) null);
        }

        public int a(int i10, t tVar, a0 a0Var, int i11) {
            if (tVar == t.Ltr) {
                return 0;
            }
            return i10;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/m$g;", "Landroidx/compose/foundation/layout/m;", "Li1/c$c;", "vertical", "<init>", "(Li1/c$c;)V", "", "size", "Lc2/t;", "layoutDirection", "LE1/a0;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILc2/t;LE1/a0;I)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Li1/c$c;", "getVertical", "()Li1/c$c;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.m$g */
    private static final class g extends C5082m {

        /* renamed from: e  reason: collision with root package name */
        private final C5437c.C0386c f18145e;

        public g(C5437c.C0386c cVar) {
            super((DefaultConstructorMarker) null);
            this.f18145e = cVar;
        }

        public int a(int i10, t tVar, a0 a0Var, int i11) {
            return this.f18145e.a(0, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && C17542s.e(this.f18145e, ((g) obj).f18145e);
        }

        public int hashCode() {
            return this.f18145e.hashCode();
        }

        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.f18145e + ')';
        }
    }

    public /* synthetic */ C5082m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int a(int i10, t tVar, a0 a0Var, int i11);

    public Integer b(a0 a0Var) {
        return null;
    }

    public boolean c() {
        return false;
    }

    private C5082m() {
    }
}
