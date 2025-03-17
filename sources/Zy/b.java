package Zy;

import QJ.F0;
import QJ.M;
import QJ.S;
import QJ.b1;
import R2.h;
import W2.e;
import W2.f;
import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nz.C14866a;
import ug.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LZy/b;", "", "a", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f118448a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LZy/b$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LQJ/M;", "dispatcherIO", "LR2/h;", "LW2/f;", "b", "(Landroid/content/Context;LQJ/M;)LR2/h;", "Landroid/content/SharedPreferences;", "d", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "Lug/k;", "labsFeatures", "Lnz/a;", "e", "(Lug/k;)Lnz/a;", "", "DATASTORE_NAME", "Ljava/lang/String;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public static final File c(Context context) {
            return V2.b.a(context, "scan_and_go_meta_data_store");
        }

        public final h<f> b(Context context, M m10) {
            C17542s.j(context, "context");
            C17542s.j(m10, "dispatcherIO");
            return e.c(e.f14655a, (S2.b) null, (List) null, S.a(m10.plus(b1.b((F0) null, 1, (Object) null))), new a(context), 3, (Object) null);
        }

        public final SharedPreferences d(Context context) {
            C17542s.j(context, "context");
            SharedPreferences a10 = G4.b.a(context);
            C17542s.i(a10, "getDefaultSharedPreferences(...)");
            return a10;
        }

        public final C14866a e(k kVar) {
            C17542s.j(kVar, "labsFeatures");
            return new C14866a(kVar);
        }

        private a() {
        }
    }
}
