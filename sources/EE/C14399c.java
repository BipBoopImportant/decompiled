package eE;

import androidx.work.C7032a;
import androidx.work.C7036e;
import androidx.work.C7037f;
import androidx.work.H;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0001\u0002\u001c\u001d¨\u0006\u001e"}, d2 = {"LeE/c;", "", "", "e", "()Ljava/lang/String;", "workName", "Landroidx/work/a;", "b", "()Landroidx/work/a;", "backOffPolicy", "", "d", "()J", "backOffTimeInMillis", "Landroidx/work/e;", "c", "()Landroidx/work/e;", "constraints", "g", "initialDelayInMillis", "Landroidx/work/f;", "f", "()Landroidx/work/f;", "inputData", "Landroidx/work/H;", "a", "()Landroidx/work/H;", "expeditedWorkPolicy", "LeE/a;", "LeE/b;", "workscheduler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eE.c  reason: case insensitive filesystem */
public interface C14399c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f126626a = a.f126627a;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"LeE/c$a;", "", "<init>", "()V", "Landroidx/work/a;", "b", "Landroidx/work/a;", "a", "()Landroidx/work/a;", "DEFAULT_BACKOFF_POLICY", "Landroidx/work/e;", "c", "Landroidx/work/e;", "()Landroidx/work/e;", "DEFAULT_CONSTRAINTS", "Landroidx/work/f;", "d", "Landroidx/work/f;", "()Landroidx/work/f;", "DEFAULT_INPUT_DATA", "workscheduler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eE.c$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f126627a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final C7032a f126628b = C7032a.EXPONENTIAL;

        /* renamed from: c  reason: collision with root package name */
        private static final C7036e f126629c = new C7036e.a().a();

        /* renamed from: d  reason: collision with root package name */
        private static final C7037f f126630d = C7037f.f45197c;

        private a() {
        }

        public final C7032a a() {
            return f126628b;
        }

        public final C7036e b() {
            return f126629c;
        }

        public final C7037f c() {
            return f126630d;
        }
    }

    H a();

    C7032a b();

    C7036e c();

    long d();

    String e();

    C7037f f();

    long g();
}
