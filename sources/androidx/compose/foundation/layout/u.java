package androidx.compose.foundation.layout;

import U0.C4889m;
import XH.C16807N;
import androidx.compose.foundation.layout.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010Ba\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/u;", "Landroidx/compose/foundation/layout/q;", "Landroidx/compose/foundation/layout/q$a;", "type", "", "minLinesToShowCollapse", "minCrossAxisSizeToShowCollapse", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/r;", "Lkotlin/Function0;", "LXH/N;", "seeMoreGetter", "collapseGetter", "<init>", "(Landroidx/compose/foundation/layout/q$a;IILnI/l;LnI/l;)V", "f", "a", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u extends q {

    /* renamed from: f  reason: collision with root package name */
    public static final a f18234f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f18235g = 0;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final u f18236h = new u(q.a.Visible, 0, 0, (C17642l) null, (C17642l) null, 30, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final u f18237i = new u(q.a.Clip, 0, 0, (C17642l) null, (C17642l) null, 30, (DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048GX\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048GX\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/u$a;", "", "<init>", "()V", "Landroidx/compose/foundation/layout/u;", "Visible", "Landroidx/compose/foundation/layout/u;", "b", "()Landroidx/compose/foundation/layout/u;", "getVisible$annotations", "Clip", "a", "getClip$annotations", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u a() {
            return u.f18237i;
        }

        public final u b() {
            return u.f18236h;
        }

        private a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ u(q.a aVar, int i10, int i11, C17642l lVar, C17642l lVar2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : lVar, (i12 & 16) != 0 ? null : lVar2);
    }

    private u(q.a aVar, int i10, int i11, C17642l<? super r, ? extends p<? super C4889m, ? super Integer, C16807N>> lVar, C17642l<? super r, ? extends p<? super C4889m, ? super Integer, C16807N>> lVar2) {
        super(aVar, i10, i11, lVar, lVar2, (DefaultConstructorMarker) null);
    }
}
