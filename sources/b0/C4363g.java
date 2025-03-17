package B0;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.p;
import nI.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: B0.g  reason: case insensitive filesystem */
public final class C4363g {

    /* renamed from: a  reason: collision with root package name */
    public static final C4363g f4859a = new C4363g();

    /* renamed from: b  reason: collision with root package name */
    public static q<p<? super C4889m, ? super Integer, C16807N>, C4889m, Integer, C16807N> f4860b = c.c(671295101, false, a.f4861c);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "innerTextField", "a", "(LnI/p;LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.g$a */
    static final class a extends C17544u implements q<p<? super C4889m, ? super Integer, ? extends C16807N>, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f4861c = new a();

        a() {
            super(3);
        }

        public final void a(p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= mVar.F(pVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(671295101, i10, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:219)");
                }
                pVar.invoke(mVar, Integer.valueOf(i10 & 14));
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((p) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public final q<p<? super C4889m, ? super Integer, C16807N>, C4889m, Integer, C16807N> a() {
        return f4860b;
    }
}
