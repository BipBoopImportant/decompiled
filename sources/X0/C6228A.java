package x0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\bg\u0018\u0000 \t2\u00020\u0001:\u0001\tJ7\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lx0/A;", "", "", "startPage", "suggestedTargetPage", "", "velocity", "pageSize", "pageSpacing", "a", "(IIFII)I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x0.A  reason: case insensitive filesystem */
public interface C6228A {

    /* renamed from: a  reason: collision with root package name */
    public static final a f31553a = a.f31554a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx0/A$a;", "", "<init>", "()V", "", "pages", "Lx0/A;", "a", "(I)Lx0/A;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x0.A$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f31554a = new a();

        private a() {
        }

        public final C6228A a(int i10) {
            if (i10 >= 0) {
                return new C6229B(i10);
            }
            throw new IllegalArgumentException(("pages should be greater than or equal to 0. You have used " + i10 + '.').toString());
        }
    }

    int a(int i10, int i11, float f10, int i12, int i13);
}
