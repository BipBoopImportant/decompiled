package V2;

import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.b1;
import R2.f;
import R2.h;
import S2.b;
import YH.C16877v;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import qI.C17786c;

@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00070\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "name", "LS2/b;", "LW2/f;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "LR2/f;", "produceMigrations", "LQJ/Q;", "scope", "LqI/c;", "LR2/h;", "a", "(Ljava/lang/String;LS2/b;LnI/l;LQJ/Q;)LqI/c;", "datastore-preferences_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/content/Context;", "it", "", "LR2/f;", "LW2/f;", "a", "(Landroid/content/Context;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: V2.a$a  reason: collision with other inner class name */
    static final class C0211a extends C17544u implements C17642l<Context, List<? extends f<W2.f>>> {

        /* renamed from: c  reason: collision with root package name */
        public static final C0211a f14598c = new C0211a();

        C0211a() {
            super(1);
        }

        /* renamed from: a */
        public final List<f<W2.f>> invoke(Context context) {
            C17542s.j(context, "it");
            return C16877v.n();
        }
    }

    public static final C17786c<Context, h<W2.f>> a(String str, b<W2.f> bVar, C17642l<? super Context, ? extends List<? extends f<W2.f>>> lVar, Q q10) {
        C17542s.j(str, "name");
        C17542s.j(lVar, "produceMigrations");
        C17542s.j(q10, "scope");
        return new c(str, bVar, lVar, q10);
    }

    public static /* synthetic */ C17786c b(String str, b bVar, C17642l lVar, Q q10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            lVar = C0211a.f14598c;
        }
        if ((i10 & 8) != 0) {
            q10 = S.a(C16311i0.b().plus(b1.b((F0) null, 1, (Object) null)));
        }
        return a(str, bVar, lVar, q10);
    }
}
