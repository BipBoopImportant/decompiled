package W2;

import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.b1;
import R2.f;
import R2.h;
import R2.i;
import R2.w;
import S2.b;
import T2.d;
import WK.C16762E;
import WK.C16777l;
import YH.C16877v;
import com.google.android.libraries.places.api.model.PlaceTypes;
import jI.C17423j;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011JU\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LW2/e;", "", "<init>", "()V", "LS2/b;", "LW2/f;", "corruptionHandler", "", "LR2/f;", "migrations", "LQJ/Q;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "LR2/h;", "b", "(LS2/b;Ljava/util/List;LQJ/Q;LnI/a;)LR2/h;", "LR2/w;", "storage", "a", "(LR2/w;LS2/b;Ljava/util/List;LQJ/Q;)LR2/h;", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f14655a = new e();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LWK/E;", "b", "()LWK/E;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<C16762E> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<File> f14656c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17631a<? extends File> aVar) {
            super(0);
            this.f14656c = aVar;
        }

        /* renamed from: b */
        public final C16762E invoke() {
            File invoke = this.f14656c.invoke();
            if (C17542s.e(C17423j.s(invoke), "preferences_pb")) {
                C16762E.a aVar = C16762E.f139592b;
                File absoluteFile = invoke.getAbsoluteFile();
                C17542s.i(absoluteFile, "file.absoluteFile");
                return C16762E.a.d(aVar, absoluteFile, false, 1, (Object) null);
            }
            throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    private e() {
    }

    public static /* synthetic */ h c(e eVar, b bVar, List list, Q q10, C17631a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = null;
        }
        if ((i10 & 2) != 0) {
            list = C16877v.n();
        }
        if ((i10 & 4) != 0) {
            q10 = S.a(C16311i0.b().plus(b1.b((F0) null, 1, (Object) null)));
        }
        return eVar.b(bVar, list, q10, aVar);
    }

    public final h<f> a(w<f> wVar, b<f> bVar, List<? extends f<f>> list, Q q10) {
        C17542s.j(wVar, PlaceTypes.STORAGE);
        C17542s.j(list, "migrations");
        C17542s.j(q10, "scope");
        return new d(i.f12316a.a(wVar, bVar, list, q10));
    }

    public final h<f> b(b<f> bVar, List<? extends f<f>> list, Q q10, C17631a<? extends File> aVar) {
        C17542s.j(list, "migrations");
        C17542s.j(q10, "scope");
        C17542s.j(aVar, "produceFile");
        return new d(a(new d(C16777l.f139691b, j.f14663a, (p) null, new a(aVar), 4, (DefaultConstructorMarker) null), bVar, list, q10));
    }
}
