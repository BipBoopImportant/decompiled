package oK;

import QJ.C16310i;
import QJ.C16311i0;
import QJ.Q;
import XH.C16807N;
import XH.y;
import android.content.Context;
import dI.C17164e;
import eI.C17187b;
import fI.C17221b;
import jI.C17416c;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nK.C17679j;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0010\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"LoK/d;", "", "LoK/d$b;", "orientation", "<init>", "(LoK/d$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LoK/d$b;", "()LoK/d$b;", "b", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oK.d  reason: case insensitive filesystem */
public final class C17711d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f145327b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final b f145328a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LoK/d$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LnK/j;", "source", "LoK/d;", "a", "(Landroid/content/Context;LnK/j;LdI/e;)Ljava/lang/Object;", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oK.d$a */
    public static final class a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LoK/d;", "<anonymous>", "(LQJ/Q;)LoK/d;"}, k = 3, mv = {1, 9, 0})
        @f(c = "me.saket.telephoto.subsamplingimage.internal.ExifMetadata$Companion$read$2", f = "ExifMetadata.kt", l = {}, m = "invokeSuspend")
        /* renamed from: oK.d$a$a  reason: collision with other inner class name */
        static final class C4237a extends l implements p<Q, C17164e<? super C17711d>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f145329c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17679j f145330d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Context f145331e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4237a(C17679j jVar, Context context, C17164e<? super C4237a> eVar) {
                super(2, eVar);
                this.f145330d = jVar;
                this.f145331e = context;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C4237a(this.f145330d, this.f145331e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C17711d> eVar) {
                return ((C4237a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                b bVar;
                C17187b.f();
                if (this.f145329c == 0) {
                    y.b(obj);
                    InputStream q32 = this.f145330d.C2(this.f145331e).q3();
                    try {
                        androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a((InputStream) new C17710c(q32));
                        int s10 = aVar.s();
                        if (s10 == 0) {
                            bVar = b.None;
                        } else if (s10 == 90) {
                            bVar = b.Orientation90;
                        } else if (s10 == 180) {
                            bVar = b.Orientation180;
                        } else if (s10 == 270) {
                            bVar = b.Orientation270;
                        } else {
                            int s11 = aVar.s();
                            throw new IllegalStateException(("Invalid image orientation at " + s11 + "°").toString());
                        }
                        C17711d dVar = new C17711d(bVar);
                        C17416c.a(q32, (Throwable) null);
                        return dVar;
                    } catch (Throwable th2) {
                        C17416c.a(q32, th);
                        throw th2;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(Context context, C17679j jVar, C17164e<? super C17711d> eVar) {
            return C16310i.g(C16311i0.a(), new C4237a(jVar, context, (C17164e<? super C4237a>) null), eVar);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LoK/d$b;", "", "", "degrees", "<init>", "(Ljava/lang/String;II)V", "I", "b", "()I", "None", "Orientation90", "Orientation180", "Orientation270", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oK.d$b */
    public enum b {
        None(0),
        Orientation90(90),
        Orientation180(180),
        Orientation270(270);
        
        private final int degrees;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private b(int i10) {
            this.degrees = i10;
        }

        public final int b() {
            return this.degrees;
        }
    }

    public C17711d(b bVar) {
        C17542s.j(bVar, "orientation");
        this.f145328a = bVar;
    }

    public final b a() {
        return this.f145328a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17711d) && this.f145328a == ((C17711d) obj).f145328a;
    }

    public int hashCode() {
        return this.f145328a.hashCode();
    }

    public String toString() {
        b bVar = this.f145328a;
        return "ExifMetadata(orientation=" + bVar + ")";
    }
}
