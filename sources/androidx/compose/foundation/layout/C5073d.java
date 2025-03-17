package androidx.compose.foundation.layout;

import YH.C16870n;
import c2.d;
import c2.t;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\bÇ\u0002\u0018\u00002\u00020\u0001:\u000521$\u001a\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001e\u0010\u001bJ/\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001f\u0010\u001bJ/\u0010 \u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b \u0010\u001bJ/\u0010!\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b!\u0010\u001bR \u0010'\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010\u0003\u001a\u0004\b$\u0010%R \u0010*\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010#\u0012\u0004\b)\u0010\u0003\u001a\u0004\b(\u0010%R \u00100\u001a\u00020\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010\u0003\u001a\u0004\b-\u0010.R \u00104\u001a\u00020\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010,\u0012\u0004\b3\u0010\u0003\u001a\u0004\b2\u0010.R \u00108\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u00105\u0012\u0004\b7\u0010\u0003\u001a\u0004\b\"\u00106R \u0010:\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u00105\u0012\u0004\b9\u0010\u0003\u001a\u0004\b1\u00106R \u0010<\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u00105\u0012\u0004\b;\u0010\u0003\u001a\u0004\b+\u00106R \u0010?\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u00105\u0012\u0004\b>\u0010\u0003\u001a\u0004\b=\u00106\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@"}, d2 = {"Landroidx/compose/foundation/layout/d;", "", "<init>", "()V", "Lc2/h;", "space", "Landroidx/compose/foundation/layout/d$f;", "n", "(F)Landroidx/compose/foundation/layout/d$f;", "Li1/c$b;", "alignment", "Landroidx/compose/foundation/layout/d$e;", "o", "(FLi1/c$b;)Landroidx/compose/foundation/layout/d$e;", "Li1/c$c;", "Landroidx/compose/foundation/layout/d$m;", "p", "(FLi1/c$c;)Landroidx/compose/foundation/layout/d$m;", "", "totalSize", "", "size", "outPosition", "", "reverseInput", "LXH/N;", "j", "(I[I[IZ)V", "i", "([I[IZ)V", "h", "m", "l", "k", "b", "Landroidx/compose/foundation/layout/d$e;", "f", "()Landroidx/compose/foundation/layout/d$e;", "getStart$annotations", "Start", "c", "getEnd$annotations", "End", "d", "Landroidx/compose/foundation/layout/d$m;", "g", "()Landroidx/compose/foundation/layout/d$m;", "getTop$annotations", "Top", "e", "a", "getBottom$annotations", "Bottom", "Landroidx/compose/foundation/layout/d$f;", "()Landroidx/compose/foundation/layout/d$f;", "getCenter$annotations", "Center", "getSpaceEvenly$annotations", "SpaceEvenly", "getSpaceBetween$annotations", "SpaceBetween", "getSpaceAround", "getSpaceAround$annotations", "SpaceAround", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.d  reason: case insensitive filesystem */
public final class C5073d {

    /* renamed from: a  reason: collision with root package name */
    public static final C5073d f18068a = new C5073d();

    /* renamed from: b  reason: collision with root package name */
    private static final e f18069b = new k();

    /* renamed from: c  reason: collision with root package name */
    private static final e f18070c = new C0266d();

    /* renamed from: d  reason: collision with root package name */
    private static final m f18071d = new l();

    /* renamed from: e  reason: collision with root package name */
    private static final m f18072e = new b();

    /* renamed from: f  reason: collision with root package name */
    private static final f f18073f = new c();

    /* renamed from: g  reason: collision with root package name */
    private static final f f18074g = new i();

    /* renamed from: h  reason: collision with root package name */
    private static final f f18075h = new h();

    /* renamed from: i  reason: collision with root package name */
    private static final f f18076i = new g();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\f\u0010\rR \u0010\u0012\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0010\u0010\rR \u0010\u0015\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\n\u0010\rR \u0010\u0019\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\rR \u0010\u001d\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001b\u0010\rR \u0010!\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u000b\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001f\u0010\r\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/foundation/layout/d$a;", "", "<init>", "()V", "Lc2/h;", "space", "Landroidx/compose/foundation/layout/d$f;", "c", "(F)Landroidx/compose/foundation/layout/d$f;", "Landroidx/compose/foundation/layout/d$e;", "b", "Landroidx/compose/foundation/layout/d$e;", "a", "()Landroidx/compose/foundation/layout/d$e;", "getLeft$annotations", "Left", "getCenter", "getCenter$annotations", "Center", "d", "getRight$annotations", "Right", "e", "getSpaceBetween", "getSpaceBetween$annotations", "SpaceBetween", "f", "getSpaceEvenly", "getSpaceEvenly$annotations", "SpaceEvenly", "g", "getSpaceAround", "getSpaceAround$annotations", "SpaceAround", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.d$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18077a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final e f18078b = new b();

        /* renamed from: c  reason: collision with root package name */
        private static final e f18079c = new C0264a();

        /* renamed from: d  reason: collision with root package name */
        private static final e f18080d = new c();

        /* renamed from: e  reason: collision with root package name */
        private static final e f18081e = new e();

        /* renamed from: f  reason: collision with root package name */
        private static final e f18082f = new f();

        /* renamed from: g  reason: collision with root package name */
        private static final e f18083g = new C0265d();

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/d$a$a", "Landroidx/compose/foundation/layout/d$e;", "Lc2/d;", "", "totalSize", "", "sizes", "Lc2/t;", "layoutDirection", "outPositions", "LXH/N;", "b", "(Lc2/d;I[ILc2/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.d$a$a  reason: collision with other inner class name */
        public static final class C0264a implements e {
            C0264a() {
            }

            public void b(d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
                C5073d.f18068a.h(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/d$a$b", "Landroidx/compose/foundation/layout/d$e;", "Lc2/d;", "", "totalSize", "", "sizes", "Lc2/t;", "layoutDirection", "outPositions", "LXH/N;", "b", "(Lc2/d;I[ILc2/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.d$a$b */
        public static final class b implements e {
            b() {
            }

            public void b(d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
                C5073d.f18068a.i(iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/d$a$c", "Landroidx/compose/foundation/layout/d$e;", "Lc2/d;", "", "totalSize", "", "sizes", "Lc2/t;", "layoutDirection", "outPositions", "LXH/N;", "b", "(Lc2/d;I[ILc2/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.d$a$c */
        public static final class c implements e {
            c() {
            }

            public void b(d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
                C5073d.f18068a.j(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/d$a$d", "Landroidx/compose/foundation/layout/d$e;", "Lc2/d;", "", "totalSize", "", "sizes", "Lc2/t;", "layoutDirection", "outPositions", "LXH/N;", "b", "(Lc2/d;I[ILc2/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.d$a$d  reason: collision with other inner class name */
        public static final class C0265d implements e {
            C0265d() {
            }

            public void b(d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
                C5073d.f18068a.k(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/d$a$e", "Landroidx/compose/foundation/layout/d$e;", "Lc2/d;", "", "totalSize", "", "sizes", "Lc2/t;", "layoutDirection", "outPositions", "LXH/N;", "b", "(Lc2/d;I[ILc2/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.d$a$e */
        public static final class e implements e {
            e() {
            }

            public void b(d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
                C5073d.f18068a.l(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/d$a$f", "Landroidx/compose/foundation/layout/d$e;", "Lc2/d;", "", "totalSize", "", "sizes", "Lc2/t;", "layoutDirection", "outPositions", "LXH/N;", "b", "(Lc2/d;I[ILc2/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.d$a$f */
        public static final class f implements e {
            f() {
            }

            public void b(d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
                C5073d.f18068a.m(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        }

        private a() {
        }

        public final e a() {
            return f18078b;
        }

        public final e b() {
            return f18080d;
        }

        public final f c(float f10) {
            return new j(f10, false, (nI.p) null, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/layout/d$b", "Landroidx/compose/foundation/layout/d$m;", "Lc2/d;", "", "totalSize", "", "sizes", "outPositions", "LXH/N;", "c", "(Lc2/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.d$b */
    public static final class b implements m {
        b() {
        }

        public void c(d dVar, int i10, int[] iArr, int[] iArr2) {
            C5073d.f18068a.j(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/layout/d$c", "Landroidx/compose/foundation/layout/d$f;", "Lc2/d;", "", "totalSize", "", "sizes", "Lc2/t;", "layoutDirection", "outPositions", "LXH/N;", "b", "(Lc2/d;I[ILc2/t;[I)V", "c", "(Lc2/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Lc2/h;", "a", "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.d$c */
    public static final class c implements f {

        /* renamed from: a  reason: collision with root package name */
        private final float f18084a = c2.h.B((float) 0);

        c() {
        }

        public float a() {
            return this.f18084a;
        }

        public void b(d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
            if (tVar == t.Ltr) {
                C5073d.f18068a.h(i10, iArr, iArr2, false);
            } else {
                C5073d.f18068a.h(i10, iArr, iArr2, true);
            }
        }

        public void c(d dVar, int i10, int[] iArr, int[] iArr2) {
            C5073d.f18068a.h(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/d$d", "Landroidx/compose/foundation/layout/d$e;", "Lc2/d;", "", "totalSize", "", "sizes", "Lc2/t;", "layoutDirection", "outPositions", "LXH/N;", "b", "(Lc2/d;I[ILc2/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.d$d  reason: collision with other inner class name */
    public static final class C0266d implements e {
        C0266d() {
        }

        public void b(d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
            if (tVar == t.Ltr) {
                C5073d.f18068a.j(i10, iArr, iArr2, false);
            } else {
                C5073d.f18068a.i(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0002\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/d$e;", "", "Lc2/d;", "", "totalSize", "", "sizes", "Lc2/t;", "layoutDirection", "outPositions", "LXH/N;", "b", "(Lc2/d;I[ILc2/t;[I)V", "Lc2/h;", "a", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.d$e */
    public interface e {
        float a() {
            return c2.h.B((float) 0);
        }

        void b(d dVar, int i10, int[] iArr, t tVar, int[] iArr2);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/d$f;", "Landroidx/compose/foundation/layout/d$e;", "Landroidx/compose/foundation/layout/d$m;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.d$f */
    public interface f extends e, m {
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/layout/d$g", "Landroidx/compose/foundation/layout/d$f;", "Lc2/d;", "", "totalSize", "", "sizes", "Lc2/t;", "layoutDirection", "outPositions", "LXH/N;", "b", "(Lc2/d;I[ILc2/t;[I)V", "c", "(Lc2/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Lc2/h;", "a", "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.d$g */
    public static final class g implements f {

        /* renamed from: a  reason: collision with root package name */
        private final float f18085a = c2.h.B((float) 0);

        g() {
        }

        public float a() {
            return this.f18085a;
        }

        public void b(d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
            if (tVar == t.Ltr) {
                C5073d.f18068a.k(i10, iArr, iArr2, false);
            } else {
                C5073d.f18068a.k(i10, iArr, iArr2, true);
            }
        }

        public void c(d dVar, int i10, int[] iArr, int[] iArr2) {
            C5073d.f18068a.k(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/layout/d$h", "Landroidx/compose/foundation/layout/d$f;", "Lc2/d;", "", "totalSize", "", "sizes", "Lc2/t;", "layoutDirection", "outPositions", "LXH/N;", "b", "(Lc2/d;I[ILc2/t;[I)V", "c", "(Lc2/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Lc2/h;", "a", "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.d$h */
    public static final class h implements f {

        /* renamed from: a  reason: collision with root package name */
        private final float f18086a = c2.h.B((float) 0);

        h() {
        }

        public float a() {
            return this.f18086a;
        }

        public void b(d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
            if (tVar == t.Ltr) {
                C5073d.f18068a.l(i10, iArr, iArr2, false);
            } else {
                C5073d.f18068a.l(i10, iArr, iArr2, true);
            }
        }

        public void c(d dVar, int i10, int[] iArr, int[] iArr2) {
            C5073d.f18068a.l(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/layout/d$i", "Landroidx/compose/foundation/layout/d$f;", "Lc2/d;", "", "totalSize", "", "sizes", "Lc2/t;", "layoutDirection", "outPositions", "LXH/N;", "b", "(Lc2/d;I[ILc2/t;[I)V", "c", "(Lc2/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Lc2/h;", "a", "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.d$i */
    public static final class i implements f {

        /* renamed from: a  reason: collision with root package name */
        private final float f18087a = c2.h.B((float) 0);

        i() {
        }

        public float a() {
            return this.f18087a;
        }

        public void b(d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
            if (tVar == t.Ltr) {
                C5073d.f18068a.m(i10, iArr, iArr2, false);
            } else {
                C5073d.f18068a.m(i10, iArr, iArr2, true);
            }
        }

        public void c(d dVar, int i10, int[] iArr, int[] iArr2) {
            C5073d.f18068a.m(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0013\u001a\u00020\u0012*\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0015\u001a\u00020\u0012*\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&R+\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010'\u001a\u0004\b(\u0010)R \u0010+\u001a\u00020\u00028\u0016X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b \u0010#\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/foundation/layout/d$j;", "Landroidx/compose/foundation/layout/d$f;", "Lc2/h;", "space", "", "rtlMirror", "Lkotlin/Function2;", "", "Lc2/t;", "alignment", "<init>", "(FZLnI/p;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lc2/d;", "totalSize", "", "sizes", "layoutDirection", "outPositions", "LXH/N;", "b", "(Lc2/d;I[ILc2/t;[I)V", "c", "(Lc2/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getSpace-D9Ej5fM", "()F", "Z", "getRtlMirror", "()Z", "LnI/p;", "getAlignment", "()LnI/p;", "d", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.d$j */
    public static final class j implements f {

        /* renamed from: a  reason: collision with root package name */
        private final float f18088a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f18089b;

        /* renamed from: c  reason: collision with root package name */
        private final nI.p<Integer, t, Integer> f18090c;

        /* renamed from: d  reason: collision with root package name */
        private final float f18091d;

        public /* synthetic */ j(float f10, boolean z10, nI.p pVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, z10, pVar);
        }

        public float a() {
            return this.f18091d;
        }

        public void b(d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
            int i11;
            int i12;
            if (iArr.length != 0) {
                int K02 = dVar.K0(this.f18088a);
                boolean z10 = this.f18089b && tVar == t.Rtl;
                C5073d dVar2 = C5073d.f18068a;
                if (!z10) {
                    int length = iArr.length;
                    int i13 = 0;
                    i12 = 0;
                    i11 = 0;
                    int i14 = 0;
                    while (i13 < length) {
                        int i15 = iArr[i13];
                        int min = Math.min(i12, i10 - i15);
                        iArr2[i14] = min;
                        int min2 = Math.min(K02, (i10 - min) - i15);
                        int i16 = iArr2[i14] + i15 + min2;
                        i13++;
                        i14++;
                        int i17 = i16;
                        i11 = min2;
                        i12 = i17;
                    }
                } else {
                    int length2 = iArr.length - 1;
                    int i18 = 0;
                    int i19 = 0;
                    while (-1 < length2) {
                        int i20 = iArr[length2];
                        int min3 = Math.min(i12, i10 - i20);
                        iArr2[length2] = min3;
                        int min4 = Math.min(K02, (i10 - min3) - i20);
                        length2--;
                        int i21 = iArr2[length2] + i20 + min4;
                        i19 = min4;
                        i18 = i21;
                    }
                }
                int i22 = i12 - i11;
                nI.p<Integer, t, Integer> pVar = this.f18090c;
                if (pVar != null && i22 < i10) {
                    int intValue = pVar.invoke(Integer.valueOf(i10 - i22), tVar).intValue();
                    int length3 = iArr2.length;
                    for (int i23 = 0; i23 < length3; i23++) {
                        iArr2[i23] = iArr2[i23] + intValue;
                    }
                }
            }
        }

        public void c(d dVar, int i10, int[] iArr, int[] iArr2) {
            b(dVar, i10, iArr, t.Ltr, iArr2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return c2.h.D(this.f18088a, jVar.f18088a) && this.f18089b == jVar.f18089b && C17542s.e(this.f18090c, jVar.f18090c);
        }

        public int hashCode() {
            int E10 = ((c2.h.E(this.f18088a) * 31) + Boolean.hashCode(this.f18089b)) * 31;
            nI.p<Integer, t, Integer> pVar = this.f18090c;
            return E10 + (pVar == null ? 0 : pVar.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f18089b ? "" : "Absolute");
            sb2.append("Arrangement#spacedAligned(");
            sb2.append(c2.h.F(this.f18088a));
            sb2.append(", ");
            sb2.append(this.f18090c);
            sb2.append(')');
            return sb2.toString();
        }

        private j(float f10, boolean z10, nI.p<? super Integer, ? super t, Integer> pVar) {
            this.f18088a = f10;
            this.f18089b = z10;
            this.f18090c = pVar;
            this.f18091d = f10;
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/d$k", "Landroidx/compose/foundation/layout/d$e;", "Lc2/d;", "", "totalSize", "", "sizes", "Lc2/t;", "layoutDirection", "outPositions", "LXH/N;", "b", "(Lc2/d;I[ILc2/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.d$k */
    public static final class k implements e {
        k() {
        }

        public void b(d dVar, int i10, int[] iArr, t tVar, int[] iArr2) {
            if (tVar == t.Ltr) {
                C5073d.f18068a.i(iArr, iArr2, false);
            } else {
                C5073d.f18068a.j(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/layout/d$l", "Landroidx/compose/foundation/layout/d$m;", "Lc2/d;", "", "totalSize", "", "sizes", "outPositions", "LXH/N;", "c", "(Lc2/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.d$l */
    public static final class l implements m {
        l() {
        }

        public void c(d dVar, int i10, int[] iArr, int[] iArr2) {
            C5073d.f18068a.i(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000b8VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0002\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/d$m;", "", "Lc2/d;", "", "totalSize", "", "sizes", "outPositions", "LXH/N;", "c", "(Lc2/d;I[I[I)V", "Lc2/h;", "a", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.d$m */
    public interface m {
        float a() {
            return c2.h.B((float) 0);
        }

        void c(d dVar, int i10, int[] iArr, int[] iArr2);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "Lc2/t;", "layoutDirection", "a", "(ILc2/t;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.d$n */
    static final class n extends C17544u implements nI.p<Integer, t, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final n f18092c = new n();

        n() {
            super(2);
        }

        public final Integer a(int i10, t tVar) {
            return Integer.valueOf(C5437c.f24302a.k().a(0, i10, tVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (t) obj2);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "Lc2/t;", "layoutDirection", "a", "(ILc2/t;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.d$o */
    static final class o extends C17544u implements nI.p<Integer, t, Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5437c.b f18093c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(C5437c.b bVar) {
            super(2);
            this.f18093c = bVar;
        }

        public final Integer a(int i10, t tVar) {
            return Integer.valueOf(this.f18093c.a(0, i10, tVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (t) obj2);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "Lc2/t;", "<anonymous parameter 1>", "a", "(ILc2/t;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.d$p */
    static final class p extends C17544u implements nI.p<Integer, t, Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5437c.C0386c f18094c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(C5437c.C0386c cVar) {
            super(2);
            this.f18094c = cVar;
        }

        public final Integer a(int i10, t tVar) {
            return Integer.valueOf(this.f18094c.a(0, i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (t) obj2);
        }
    }

    private C5073d() {
    }

    public final m a() {
        return f18072e;
    }

    public final f b() {
        return f18073f;
    }

    public final e c() {
        return f18070c;
    }

    public final f d() {
        return f18075h;
    }

    public final f e() {
        return f18074g;
    }

    public final e f() {
        return f18069b;
    }

    public final m g() {
        return f18071d;
    }

    public final void h(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f10 = ((float) (i10 - i12)) / ((float) 2);
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f10);
                f10 += (float) i15;
                i11++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i16 = iArr[length2];
                iArr2[length2] = Math.round(f10);
                f10 += (float) i16;
            } else {
                return;
            }
        }
    }

    public final void i(int[] iArr, int[] iArr2, boolean z10) {
        int i10 = 0;
        if (!z10) {
            int length = iArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = iArr[i10];
                iArr2[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i14 = iArr[length2];
                iArr2[length2] = i10;
                i10 += i14;
            } else {
                return;
            }
        }
    }

    public final void j(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        int i14 = i10 - i12;
        if (!z10) {
            int length = iArr.length;
            int i15 = 0;
            while (i11 < length) {
                int i16 = iArr[i11];
                iArr2[i15] = i14;
                i14 += i16;
                i11++;
                i15++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i17 = iArr[length2];
                iArr2[length2] = i14;
                i14 += i17;
            } else {
                return;
            }
        }
    }

    public final void k(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = !(iArr.length == 0) ? ((float) (i10 - i12)) / ((float) iArr.length) : 0.0f;
        float f10 = length / ((float) 2);
        if (!z10) {
            int length2 = iArr.length;
            int i14 = 0;
            while (i11 < length2) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f10);
                f10 += ((float) i15) + length;
                i11++;
                i14++;
            }
            return;
        }
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i16 = iArr[length3];
            iArr2[length3] = Math.round(f10);
            f10 += ((float) i16) + length;
        }
    }

    public final void l(int i10, int[] iArr, int[] iArr2, boolean z10) {
        if (iArr.length != 0) {
            int i11 = 0;
            int i12 = 0;
            for (int i13 : iArr) {
                i12 += i13;
            }
            float max = ((float) (i10 - i12)) / ((float) Math.max(C16870n.l0(iArr), 1));
            float f10 = (!z10 || iArr.length != 1) ? 0.0f : max;
            if (!z10) {
                int length = iArr.length;
                int i14 = 0;
                while (i11 < length) {
                    int i15 = iArr[i11];
                    iArr2[i14] = Math.round(f10);
                    f10 += ((float) i15) + max;
                    i11++;
                    i14++;
                }
                return;
            }
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i16 = iArr[length2];
                iArr2[length2] = Math.round(f10);
                f10 += ((float) i16) + max;
            }
        }
    }

    public final void m(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = ((float) (i10 - i12)) / ((float) (iArr.length + 1));
        if (!z10) {
            int length2 = iArr.length;
            float f10 = length;
            int i14 = 0;
            while (i11 < length2) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f10);
                f10 += ((float) i15) + length;
                i11++;
                i14++;
            }
            return;
        }
        float f11 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i16 = iArr[length3];
            iArr2[length3] = Math.round(f11);
            f11 += ((float) i16) + length;
        }
    }

    public final f n(float f10) {
        return new j(f10, true, n.f18092c, (DefaultConstructorMarker) null);
    }

    public final e o(float f10, C5437c.b bVar) {
        return new j(f10, true, new o(bVar), (DefaultConstructorMarker) null);
    }

    public final m p(float f10, C5437c.C0386c cVar) {
        return new j(f10, false, new p(cVar), (DefaultConstructorMarker) null);
    }
}
