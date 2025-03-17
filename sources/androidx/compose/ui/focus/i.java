package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR$\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR$\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR$\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR$\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR$\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rRB\u0010,\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$8W@WX\u000e¢\u0006\u0012\u0012\u0004\b*\u0010+\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)RB\u00100\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$8W@WX\u000e¢\u0006\u0012\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010'\"\u0004\b.\u0010)ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u00061À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/i;", "", "", "y", "()Z", "w", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/m;", "<anonymous parameter 0>", "B", "()Landroidx/compose/ui/focus/m;", "setNext", "(Landroidx/compose/ui/focus/m;)V", "next", "A", "setPrevious", "previous", "s", "setUp", "up", "v", "setDown", "down", "b", "setLeft", "left", "q", "setRight", "right", "i", "setStart", "start", "u", "setEnd", "end", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/d;", "x", "()LnI/l;", "z", "(LnI/l;)V", "getEnter$annotations", "()V", "enter", "t", "r", "getExit$annotations", "exit", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface i {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/d;", "it", "Landroidx/compose/ui/focus/m;", "a", "(I)Landroidx/compose/ui/focus/m;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<d, m> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f18844c = new a();

        a() {
            super(1);
        }

        public final m a(int i10) {
            return m.f18861b.c();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((d) obj).o());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/d;", "it", "Landroidx/compose/ui/focus/m;", "a", "(I)Landroidx/compose/ui/focus/m;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<d, m> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f18845c = new b();

        b() {
            super(1);
        }

        public final m a(int i10) {
            return m.f18861b.c();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((d) obj).o());
        }
    }

    m A() {
        return m.f18861b.c();
    }

    m B() {
        return m.f18861b.c();
    }

    m b() {
        return m.f18861b.c();
    }

    m i() {
        return m.f18861b.c();
    }

    m q() {
        return m.f18861b.c();
    }

    void r(C17642l<? super d, m> lVar) {
    }

    m s() {
        return m.f18861b.c();
    }

    C17642l<d, m> t() {
        return b.f18845c;
    }

    m u() {
        return m.f18861b.c();
    }

    m v() {
        return m.f18861b.c();
    }

    void w(boolean z10);

    C17642l<d, m> x() {
        return a.f18844c;
    }

    boolean y();

    void z(C17642l<? super d, m> lVar) {
    }
}
