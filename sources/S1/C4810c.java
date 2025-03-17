package S1;

import QJ.C16320n;
import QJ.C16324p;
import XH.x;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;
import w2.C6214h;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LS1/Q;", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "c", "(LS1/Q;Landroid/content/Context;)Landroid/graphics/Typeface;", "d", "(LS1/Q;Landroid/content/Context;LdI/e;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: S1.c  reason: case insensitive filesystem */
public final class C4810c {

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"S1/c$a", "Lw2/h$e;", "Landroid/graphics/Typeface;", "typeface", "LXH/N;", "i", "(Landroid/graphics/Typeface;)V", "", "reason", "h", "(I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: S1.c$a */
    public static final class a extends C6214h.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16320n<Typeface> f13375a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Q f13376b;

        a(C16320n<? super Typeface> nVar, Q q10) {
            this.f13375a = nVar;
            this.f13376b = q10;
        }

        public void h(int i10) {
            C16320n<Typeface> nVar = this.f13375a;
            nVar.p(new IllegalStateException("Unable to load font " + this.f13376b + " (reason=" + i10 + ')'));
        }

        public void i(Typeface typeface) {
            this.f13375a.resumeWith(x.b(typeface));
        }
    }

    /* access modifiers changed from: private */
    public static final Typeface c(Q q10, Context context) {
        Typeface g10 = C6214h.g(context, q10.d());
        C17542s.g(g10);
        return g10;
    }

    /* access modifiers changed from: private */
    public static final Object d(Q q10, Context context, C17164e<? super Typeface> eVar) {
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        C6214h.i(context, q10.d(), new a(pVar, q10), (Handler) null);
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10;
    }
}
