package P1;

import O1.C4769c;
import android.text.SegmentFinder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LP1/a;", "", "<init>", "()V", "LP1/f;", "Landroid/text/SegmentFinder;", "a", "(LP1/f;)Landroid/text/SegmentFinder;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f11833a = new a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"P1/a$a", "Landroid/text/SegmentFinder;", "", "offset", "previousStartBoundary", "(I)I", "previousEndBoundary", "nextStartBoundary", "nextEndBoundary", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: P1.a$a  reason: collision with other inner class name */
    public static final class C0176a extends SegmentFinder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f11834a;

        C0176a(f fVar) {
            this.f11834a = fVar;
        }

        public int nextEndBoundary(int i10) {
            return this.f11834a.c(i10);
        }

        public int nextStartBoundary(int i10) {
            return this.f11834a.a(i10);
        }

        public int previousEndBoundary(int i10) {
            return this.f11834a.d(i10);
        }

        public int previousStartBoundary(int i10) {
            return this.f11834a.b(i10);
        }
    }

    private a() {
    }

    public final SegmentFinder a(f fVar) {
        return C4769c.a(new C0176a(fVar));
    }
}
