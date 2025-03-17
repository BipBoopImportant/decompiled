package lC;

import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mC.C14787e;
import nC.C14840a;
import nC.C14845f;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u000f\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020!8\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0013\u0010$R\u001a\u0010*\u001a\u00020&8\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001c\u0010)R\u001a\u0010.\u001a\u00020+8\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010,\u001a\u0004\b\u0007\u0010-R\u001a\u00103\u001a\u00020/8\u0016X\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b\u000b\u00102¨\u00064"}, d2 = {"LlC/b;", "LlC/c;", "LmC/e;", "target", "<init>", "(LmC/e;)V", "Landroid/view/View;", "a", "Landroid/view/View;", "view", "Landroid/view/Window;", "b", "Landroid/view/Window;", "window", "LlC/f;", "c", "LlC/f;", "iconColorHandler", "LnC/f;", "d", "LnC/f;", "suggestIconColor", "LlC/B;", "e", "LlC/B;", "()LlC/B;", "insetsInternal", "LlC/n;", "f", "LlC/n;", "i", "()LlC/n;", "statusBarInternal", "LlC/k;", "g", "LlC/k;", "()LlC/k;", "navigationBarInternal", "LlC/o;", "h", "LlC/o;", "()LlC/o;", "insets", "LlC/l;", "LlC/l;", "()LlC/l;", "statusBar", "LlC/g;", "j", "LlC/g;", "()LlC/g;", "navigationBar", "systemui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lC.b  reason: case insensitive filesystem */
public final class C14750b implements C14751c {

    /* renamed from: a  reason: collision with root package name */
    private final View f128897a;

    /* renamed from: b  reason: collision with root package name */
    private final Window f128898b;

    /* renamed from: c  reason: collision with root package name */
    private final C14754f f128899c;

    /* renamed from: d  reason: collision with root package name */
    private final C14845f f128900d;

    /* renamed from: e  reason: collision with root package name */
    private final C14747B f128901e;

    /* renamed from: f  reason: collision with root package name */
    private final n f128902f;

    /* renamed from: g  reason: collision with root package name */
    private final k f128903g;

    /* renamed from: h  reason: collision with root package name */
    private final o f128904h = c();

    /* renamed from: i  reason: collision with root package name */
    private final l f128905i = i();

    /* renamed from: j  reason: collision with root package name */
    private final C14755g f128906j = d();

    public C14750b(C14787e eVar) {
        C17542s.j(eVar, "target");
        View b10 = eVar.b();
        this.f128897a = b10;
        Window d10 = eVar.d();
        this.f128898b = d10;
        C14754f fVar = new C14754f(b10, d10);
        this.f128899c = fVar;
        C14845f fVar2 = new C14845f((C14840a) null, 1, (DefaultConstructorMarker) null);
        this.f128900d = fVar2;
        this.f128901e = new C14746A(b10, d10);
        this.f128902f = new m(b10, fVar, fVar2);
        this.f128903g = new C14758j(b10, d10, fVar);
    }

    public l a() {
        return this.f128905i;
    }

    public C14755g b() {
        return this.f128906j;
    }

    public C14747B c() {
        return this.f128901e;
    }

    public k d() {
        return this.f128903g;
    }

    public o f() {
        return this.f128904h;
    }

    public n i() {
        return this.f128902f;
    }
}
