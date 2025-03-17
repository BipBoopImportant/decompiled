package b2;

import GJ.C15765h;
import GJ.C15768k;
import a2.C4985a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.M;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lb2/a;", "La2/a;", "", "", "words", "<init>", "(I)V", "a", "(I)Ljava/lang/String;", "I", "LGJ/h;", "getValues", "()LGJ/h;", "values", "ui-tooling-preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: b2.a  reason: case insensitive filesystem */
public class C5259a implements C4985a<String> {

    /* renamed from: a  reason: collision with root package name */
    private final int f22941a;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: b2.a$a  reason: collision with other inner class name */
    static final class C0356a extends C17544u implements C17631a<String> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ M f22942c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f22943d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0356a(M m10, int i10) {
            super(0);
            this.f22942c = m10;
            this.f22943d = i10;
        }

        /* renamed from: b */
        public final String invoke() {
            List a10 = b.f22944a;
            M m10 = this.f22942c;
            int i10 = m10.f144346a;
            m10.f144346a = i10 + 1;
            return (String) a10.get(i10 % this.f22943d);
        }
    }

    public C5259a(int i10) {
        this.f22941a = i10;
    }

    private final String a(int i10) {
        return C15768k.Q(C15768k.X(C15768k.r(new C0356a(new M(), b.f22944a.size())), i10), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
    }

    public C15765h<String> getValues() {
        return C15768k.v(a(this.f22941a));
    }
}
