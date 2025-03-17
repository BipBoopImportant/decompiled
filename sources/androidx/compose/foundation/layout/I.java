package androidx.compose.foundation.layout;

import E1.C4468a;
import E1.L;
import G1.p0;
import androidx.compose.foundation.layout.C5072c;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import s0.C5841L;
import s0.C5870p;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/layout/I;", "LG1/p0;", "Landroidx/compose/ui/d$c;", "<init>", "()V", "a", "b", "Landroidx/compose/foundation/layout/I$a;", "Landroidx/compose/foundation/layout/I$b;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class I extends d.c implements p0 {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\t*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/layout/I$a;", "Landroidx/compose/foundation/layout/I;", "Lkotlin/Function1;", "LE1/L;", "", "block", "<init>", "(LnI/l;)V", "Lc2/d;", "", "parentData", "K", "(Lc2/d;Ljava/lang/Object;)Ljava/lang/Object;", "n", "LnI/l;", "getBlock", "()LnI/l;", "C2", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends I {

        /* renamed from: n  reason: collision with root package name */
        private C17642l<? super L, Integer> f17957n;

        public a(C17642l<? super L, Integer> lVar) {
            super((DefaultConstructorMarker) null);
            this.f17957n = lVar;
        }

        public final void C2(C17642l<? super L, Integer> lVar) {
            this.f17957n = lVar;
        }

        public Object K(c2.d dVar, Object obj) {
            C5841L l10 = obj instanceof C5841L ? (C5841L) obj : null;
            if (l10 == null) {
                l10 = new C5841L(0.0f, false, (C5082m) null, (C5870p) null, 15, (DefaultConstructorMarker) null);
            }
            l10.e(C5082m.f18136a.a(new C5072c.a(this.f17957n)));
            return l10;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u0007*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/layout/I$b;", "Landroidx/compose/foundation/layout/I;", "LE1/a;", "alignmentLine", "<init>", "(LE1/a;)V", "Lc2/d;", "", "parentData", "K", "(Lc2/d;Ljava/lang/Object;)Ljava/lang/Object;", "n", "LE1/a;", "getAlignmentLine", "()LE1/a;", "C2", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends I {

        /* renamed from: n  reason: collision with root package name */
        private C4468a f17958n;

        public b(C4468a aVar) {
            super((DefaultConstructorMarker) null);
            this.f17958n = aVar;
        }

        public final void C2(C4468a aVar) {
            this.f17958n = aVar;
        }

        public Object K(c2.d dVar, Object obj) {
            C5841L l10 = obj instanceof C5841L ? (C5841L) obj : null;
            if (l10 == null) {
                l10 = new C5841L(0.0f, false, (C5082m) null, (C5870p) null, 15, (DefaultConstructorMarker) null);
            }
            l10.e(C5082m.f18136a.a(new C5072c.b(this.f17958n)));
            return l10;
        }
    }

    public /* synthetic */ I(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private I() {
    }
}
