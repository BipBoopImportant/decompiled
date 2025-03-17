package p5;

import androidx.work.C7055y;
import androidx.work.C7056z;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o5.C8603d;
import q5.h;
import s5.C8739u;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0014XD¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lp5/g;", "Lp5/a;", "Lo5/d;", "Lq5/h;", "tracker", "<init>", "(Lq5/h;)V", "Ls5/u;", "workSpec", "", "b", "(Ls5/u;)Z", "value", "g", "(Lo5/d;)Z", "", "I", "e", "()I", "reason", "c", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g extends C8625a<C8603d> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f55408c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final String f55409d;

    /* renamed from: b  reason: collision with root package name */
    private final int f55410b = 7;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp5/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        String i10 = C7055y.i("NetworkNotRoamingCtrlr");
        C17542s.i(i10, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f55409d = i10;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h<C8603d> hVar) {
        super(hVar);
        C17542s.j(hVar, "tracker");
    }

    public boolean b(C8739u uVar) {
        C17542s.j(uVar, "workSpec");
        return uVar.f55919j.f() == C7056z.NOT_ROAMING;
    }

    /* access modifiers changed from: protected */
    public int e() {
        return this.f55410b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean f(C8603d dVar) {
        C17542s.j(dVar, "value");
        return !dVar.a() || !dVar.c();
    }
}
