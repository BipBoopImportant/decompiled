package androidx.compose.ui.focus;

import XH.C16807N;
import XH.C16818i;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import n1.C5632l;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/d;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/i;", "LXH/N;", "scope", "a", "(Landroidx/compose/ui/d;LnI/l;)Landroidx/compose/ui/d;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a implements C5632l, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f18859a;

        a(C17642l lVar) {
            this.f18859a = lVar;
        }

        public final /* synthetic */ void a(i iVar) {
            this.f18859a.invoke(iVar);
        }

        public final C16818i<?> c() {
            return this.f18859a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C5632l) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    public static final d a(d dVar, C17642l<? super i, C16807N> lVar) {
        return dVar.s(new FocusPropertiesElement(new a(lVar)));
    }
}
