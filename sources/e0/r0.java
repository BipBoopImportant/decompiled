package E0;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import nI.C17642l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"4\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"LE0/q0;", "b", "()LE0/q0;", "Landroid/view/inputmethod/EditorInfo;", "LXH/N;", "d", "(Landroid/view/inputmethod/EditorInfo;)V", "Lkotlin/Function1;", "Landroid/view/View;", "LE0/l0;", "a", "LnI/l;", "c", "()LnI/l;", "setInputMethodManagerFactory", "(LnI/l;)V", "getInputMethodManagerFactory$annotations", "()V", "inputMethodManagerFactory", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    private static C17642l<? super View, ? extends l0> f5747a = a.f5748a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17642l<View, m0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f5748a = new a();

        a() {
            super(1, m0.class, "<init>", "<init>(Landroid/view/View;)V", 0);
        }

        /* renamed from: t */
        public final m0 invoke(View view) {
            return new m0(view);
        }
    }

    public static final q0 b() {
        return new C4443a();
    }

    public static final C17642l<View, l0> c() {
        return f5747a;
    }

    /* access modifiers changed from: private */
    public static final void d(EditorInfo editorInfo) {
        if (f.k()) {
            f.c().x(editorInfo);
        }
    }
}
