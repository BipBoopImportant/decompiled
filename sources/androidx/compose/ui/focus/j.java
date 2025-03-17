package androidx.compose.ui.focus;

import androidx.compose.ui.focus.m;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\f8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001b\u001a\u00020\f8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\"\u0010\u001f\u001a\u00020\f8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\"\u0010\"\u001a\u00020\f8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b \u0010\u000e\u001a\u0004\b\r\u0010\u0010\"\u0004\b!\u0010\u0012R\"\u0010&\u001a\u00020\f8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b#\u0010\u000e\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0012R\"\u0010*\u001a\u00020\f8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b'\u0010\u000e\u001a\u0004\b(\u0010\u0010\"\u0004\b)\u0010\u0012R\"\u0010-\u001a\u00020\f8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b(\u0010\u000e\u001a\u0004\b+\u0010\u0010\"\u0004\b,\u0010\u0012R4\u00107\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\f0.8\u0016@\u0016X\u000e¢\u0006\u0018\n\u0004\b0\u00101\u0012\u0004\b6\u0010\u0003\u001a\u0004\b2\u00103\"\u0004\b4\u00105R4\u0010<\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\f0.8\u0016@\u0016X\u000e¢\u0006\u0018\n\u0004\b8\u00101\u0012\u0004\b;\u0010\u0003\u001a\u0004\b9\u00103\"\u0004\b:\u00105¨\u0006="}, d2 = {"Landroidx/compose/ui/focus/j;", "Landroidx/compose/ui/focus/i;", "<init>", "()V", "", "a", "Z", "y", "()Z", "w", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/m;", "b", "Landroidx/compose/ui/focus/m;", "B", "()Landroidx/compose/ui/focus/m;", "setNext", "(Landroidx/compose/ui/focus/m;)V", "next", "c", "A", "setPrevious", "previous", "d", "s", "setUp", "up", "e", "v", "setDown", "down", "f", "setLeft", "left", "g", "q", "setRight", "right", "h", "i", "setStart", "start", "u", "setEnd", "end", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/d;", "j", "LnI/l;", "x", "()LnI/l;", "z", "(LnI/l;)V", "getEnter$annotations", "enter", "k", "t", "r", "getExit$annotations", "exit", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    private boolean f18846a = true;

    /* renamed from: b  reason: collision with root package name */
    private m f18847b;

    /* renamed from: c  reason: collision with root package name */
    private m f18848c;

    /* renamed from: d  reason: collision with root package name */
    private m f18849d;

    /* renamed from: e  reason: collision with root package name */
    private m f18850e;

    /* renamed from: f  reason: collision with root package name */
    private m f18851f;

    /* renamed from: g  reason: collision with root package name */
    private m f18852g;

    /* renamed from: h  reason: collision with root package name */
    private m f18853h;

    /* renamed from: i  reason: collision with root package name */
    private m f18854i;

    /* renamed from: j  reason: collision with root package name */
    private C17642l<? super d, m> f18855j;

    /* renamed from: k  reason: collision with root package name */
    private C17642l<? super d, m> f18856k;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/d;", "it", "Landroidx/compose/ui/focus/m;", "a", "(I)Landroidx/compose/ui/focus/m;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<d, m> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f18857c = new a();

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
        public static final b f18858c = new b();

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

    public j() {
        m.a aVar = m.f18861b;
        this.f18847b = aVar.c();
        this.f18848c = aVar.c();
        this.f18849d = aVar.c();
        this.f18850e = aVar.c();
        this.f18851f = aVar.c();
        this.f18852g = aVar.c();
        this.f18853h = aVar.c();
        this.f18854i = aVar.c();
        this.f18855j = a.f18857c;
        this.f18856k = b.f18858c;
    }

    public m A() {
        return this.f18848c;
    }

    public m B() {
        return this.f18847b;
    }

    public m b() {
        return this.f18851f;
    }

    public m i() {
        return this.f18853h;
    }

    public m q() {
        return this.f18852g;
    }

    public void r(C17642l<? super d, m> lVar) {
        this.f18856k = lVar;
    }

    public m s() {
        return this.f18849d;
    }

    public C17642l<d, m> t() {
        return this.f18856k;
    }

    public m u() {
        return this.f18854i;
    }

    public m v() {
        return this.f18850e;
    }

    public void w(boolean z10) {
        this.f18846a = z10;
    }

    public C17642l<d, m> x() {
        return this.f18855j;
    }

    public boolean y() {
        return this.f18846a;
    }

    public void z(C17642l<? super d, m> lVar) {
        this.f18855j = lVar;
    }
}
