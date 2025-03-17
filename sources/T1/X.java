package T1;

import L2.a;
import N1.W;
import T1.C4854x;
import T1.C4855y;
import T1.r;
import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.f;
import androidx.recyclerview.widget.RecyclerView;
import com.sugarcube.app.base.data.source.CatalogRepository;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "LXH/N;", "i", "(Landroid/view/inputmethod/EditorInfo;)V", "LT1/s;", "imeOptions", "LT1/P;", "textFieldValue", "h", "(Landroid/view/inputmethod/EditorInfo;LT1/s;LT1/P;)V", "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", "d", "(Landroid/view/Choreographer;)Ljava/util/concurrent/Executor;", "", "bits", "flag", "", "g", "(II)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class X {
    public static final Executor d(Choreographer choreographer) {
        return new V(choreographer);
    }

    /* access modifiers changed from: private */
    public static final void e(Choreographer choreographer, Runnable runnable) {
        choreographer.postFrameCallback(new W(runnable));
    }

    /* access modifiers changed from: private */
    public static final void f(Runnable runnable, long j10) {
        runnable.run();
    }

    private static final boolean g(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static final void h(EditorInfo editorInfo, C4849s sVar, P p10) {
        int e10 = sVar.e();
        r.a aVar = r.f13620b;
        int i10 = 6;
        if (r.m(e10, aVar.a())) {
            if (!sVar.h()) {
                i10 = 0;
            }
        } else if (r.m(e10, aVar.e())) {
            i10 = 1;
        } else if (r.m(e10, aVar.c())) {
            i10 = 2;
        } else if (r.m(e10, aVar.d())) {
            i10 = 5;
        } else if (r.m(e10, aVar.f())) {
            i10 = 7;
        } else if (r.m(e10, aVar.g())) {
            i10 = 3;
        } else if (r.m(e10, aVar.h())) {
            i10 = 4;
        } else if (!r.m(e10, aVar.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i10;
        sVar.g();
        int f10 = sVar.f();
        C4855y.a aVar2 = C4855y.f13650b;
        if (C4855y.n(f10, aVar2.h())) {
            editorInfo.inputType = 1;
        } else if (C4855y.n(f10, aVar2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (C4855y.n(f10, aVar2.d())) {
            editorInfo.inputType = 2;
        } else if (C4855y.n(f10, aVar2.g())) {
            editorInfo.inputType = 3;
        } else if (C4855y.n(f10, aVar2.j())) {
            editorInfo.inputType = 17;
        } else if (C4855y.n(f10, aVar2.c())) {
            editorInfo.inputType = 33;
        } else if (C4855y.n(f10, aVar2.f())) {
            editorInfo.inputType = 129;
        } else if (C4855y.n(f10, aVar2.e())) {
            editorInfo.inputType = 18;
        } else if (C4855y.n(f10, aVar2.b())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type");
        }
        if (!sVar.h() && g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (r.m(sVar.e(), aVar.a())) {
                editorInfo.imeOptions |= CatalogRepository.FETCH_FLAG_SDB;
            }
        }
        if (g(editorInfo.inputType, 1)) {
            int c10 = sVar.c();
            C4854x.a aVar3 = C4854x.f13643b;
            if (C4854x.i(c10, aVar3.a())) {
                editorInfo.inputType |= RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
            } else if (C4854x.i(c10, aVar3.e())) {
                editorInfo.inputType |= 8192;
            } else if (C4854x.i(c10, aVar3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (sVar.b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = W.n(p10.h());
        editorInfo.initialSelEnd = W.i(p10.h());
        a.e(editorInfo, p10.i());
        editorInfo.imeOptions |= 33554432;
    }

    /* access modifiers changed from: private */
    public static final void i(EditorInfo editorInfo) {
        if (f.k()) {
            f.c().x(editorInfo);
        }
    }
}
