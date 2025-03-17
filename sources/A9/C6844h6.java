package a9;

import android.graphics.Rect;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

/* renamed from: a9.h6  reason: case insensitive filesystem */
public final class C6844h6 extends C17544u implements C17642l<Rect, String> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ W3 f42603c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6844h6(W3 w32) {
        super(1);
        this.f42603c = w32;
    }

    public final Object invoke(Object obj) {
        Rect rect = (Rect) obj;
        C17542s.j(rect, "bounds");
        W3 w32 = this.f42603c;
        int i10 = rect.left;
        int i11 = rect.top;
        return w32.d(i10, i11, rect.right - i10, rect.bottom - i11);
    }
}
