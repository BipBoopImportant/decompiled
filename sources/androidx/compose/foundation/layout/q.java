package androidx.compose.foundation.layout;

import U0.C4889m;
import XH.C16807N;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0014Ba\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R(\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR(\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c\u0001\u0001\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/q;", "", "Landroidx/compose/foundation/layout/q$a;", "type", "", "minLinesToShowCollapse", "minCrossAxisSizeToShowCollapse", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/r;", "Lkotlin/Function0;", "LXH/N;", "seeMoreGetter", "collapseGetter", "<init>", "(Landroidx/compose/foundation/layout/q$a;IILnI/l;LnI/l;)V", "b", "()Landroidx/compose/foundation/layout/r;", "state", "", "list", "a", "(Landroidx/compose/foundation/layout/r;Ljava/util/List;)V", "Landroidx/compose/foundation/layout/q$a;", "getType$foundation_layout_release", "()Landroidx/compose/foundation/layout/q$a;", "I", "c", "d", "LnI/l;", "e", "Landroidx/compose/foundation/layout/u;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    private final a f18178a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18179b;

    /* renamed from: c  reason: collision with root package name */
    private final int f18180c;

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<r, p<C4889m, Integer, C16807N>> f18181d;

    /* renamed from: e  reason: collision with root package name */
    private final C17642l<r, p<C4889m, Integer, C16807N>> f18182e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/layout/q$a;", "", "<init>", "(Ljava/lang/String;I)V", "Visible", "Clip", "ExpandIndicator", "ExpandOrCollapseIndicator", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum a {
        Visible,
        Clip,
        ExpandIndicator,
        ExpandOrCollapseIndicator
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18183a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.foundation.layout.q$a[] r0 = androidx.compose.foundation.layout.q.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.layout.q$a r1 = androidx.compose.foundation.layout.q.a.ExpandIndicator     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.layout.q$a r1 = androidx.compose.foundation.layout.q.a.ExpandOrCollapseIndicator     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f18183a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.q.b.<clinit>():void");
        }
    }

    public /* synthetic */ q(a aVar, int i10, int i11, C17642l lVar, C17642l lVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, i10, i11, lVar, lVar2);
    }

    public final void a(r rVar, List<p<C4889m, Integer, C16807N>> list) {
        C17642l<r, p<C4889m, Integer, C16807N>> lVar = this.f18181d;
        p pVar = null;
        p invoke = lVar != null ? lVar.invoke(rVar) : null;
        C17642l<r, p<C4889m, Integer, C16807N>> lVar2 = this.f18182e;
        if (lVar2 != null) {
            pVar = lVar2.invoke(rVar);
        }
        int i10 = b.f18183a[this.f18178a.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                if (invoke != null) {
                    list.add(invoke);
                }
                if (pVar != null) {
                    list.add(pVar);
                }
            }
        } else if (invoke != null) {
            list.add(invoke);
        }
    }

    public final r b() {
        return new r(this.f18178a, this.f18179b, this.f18180c);
    }

    private q(a aVar, int i10, int i11, C17642l<? super r, ? extends p<? super C4889m, ? super Integer, C16807N>> lVar, C17642l<? super r, ? extends p<? super C4889m, ? super Integer, C16807N>> lVar2) {
        this.f18178a = aVar;
        this.f18179b = i10;
        this.f18180c = i11;
        this.f18181d = lVar;
        this.f18182e = lVar2;
    }
}
