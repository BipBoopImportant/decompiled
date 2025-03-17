package T1;

import N1.P;
import XH.C16807N;
import XH.C16814e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import o1.C5669i;
import p1.O0;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJI\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\"\u0010$¨\u0006&"}, d2 = {"LT1/Y;", "", "LT1/S;", "textInputService", "LT1/K;", "platformTextInputService", "<init>", "(LT1/S;LT1/K;)V", "LXH/N;", "a", "()V", "Lo1/i;", "rect", "", "c", "(Lo1/i;)Z", "LT1/P;", "textFieldValue", "LT1/H;", "offsetMapping", "LN1/P;", "textLayoutResult", "Lkotlin/Function1;", "Lp1/O0;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "e", "(LT1/P;LT1/H;LN1/P;LnI/l;Lo1/i;Lo1/i;)Z", "oldValue", "newValue", "d", "(LT1/P;LT1/P;)Z", "LT1/S;", "b", "LT1/K;", "()Z", "isOpen", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public final class Y {

    /* renamed from: a  reason: collision with root package name */
    private final S f13570a;

    /* renamed from: b  reason: collision with root package name */
    private final K f13571b;

    public Y(S s10, K k10) {
        this.f13570a = s10;
        this.f13571b = k10;
    }

    public final void a() {
        this.f13570a.g(this);
    }

    public final boolean b() {
        return C17542s.e(this.f13570a.a(), this);
    }

    public final boolean c(C5669i iVar) {
        boolean b10 = b();
        if (b10) {
            this.f13571b.f(iVar);
        }
        return b10;
    }

    public final boolean d(P p10, P p11) {
        boolean b10 = b();
        if (b10) {
            this.f13571b.a(p10, p11);
        }
        return b10;
    }

    public final boolean e(P p10, H h10, P p11, C17642l<? super O0, C16807N> lVar, C5669i iVar, C5669i iVar2) {
        boolean b10 = b();
        if (b10) {
            this.f13571b.h(p10, h10, p11, lVar, iVar, iVar2);
        }
        return b10;
    }
}
