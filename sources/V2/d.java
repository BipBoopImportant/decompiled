package V2;

import R2.c;
import androidx.datastore.preferences.protobuf.A;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LV2/d;", "", "a", "datastore-preferences-proto"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14607a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LV2/d$a;", "", "<init>", "()V", "Ljava/io/InputStream;", "input", "LV2/f;", "a", "(Ljava/io/InputStream;)LV2/f;", "datastore-preferences-proto"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(InputStream inputStream) {
            C17542s.j(inputStream, "input");
            try {
                f V10 = f.V(inputStream);
                C17542s.i(V10, "{\n                Prefer…From(input)\n            }");
                return V10;
            } catch (A e10) {
                throw new c("Unable to parse preferences proto.", e10);
            }
        }

        private a() {
        }
    }
}
