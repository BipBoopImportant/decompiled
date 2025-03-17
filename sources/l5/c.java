package L5;

import S5.j;
import YH.X;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0005\t\rJ\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"LL5/c;", "", "LL5/c$b;", "key", "LL5/c$c;", "b", "(LL5/c$b;)LL5/c$c;", "value", "LXH/N;", "c", "(LL5/c$b;LL5/c$c;)V", "", "level", "a", "(I)V", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, d2 = {"LL5/c$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LL5/c;", "a", "()LL5/c;", "Landroid/content/Context;", "", "b", "D", "maxSizePercent", "", "c", "I", "maxSizeBytes", "", "d", "Z", "strongReferencesEnabled", "e", "weakReferencesEnabled", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f38274a;

        /* renamed from: b  reason: collision with root package name */
        private double f38275b;

        /* renamed from: c  reason: collision with root package name */
        private int f38276c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f38277d = true;

        /* renamed from: e  reason: collision with root package name */
        private boolean f38278e = true;

        public a(Context context) {
            this.f38274a = context;
            this.f38275b = j.e(context);
        }

        public final c a() {
            h hVar;
            i gVar = this.f38278e ? new g() : new b();
            if (this.f38277d) {
                double d10 = this.f38275b;
                int c10 = d10 > 0.0d ? j.c(this.f38274a, d10) : this.f38276c;
                hVar = c10 > 0 ? new f(c10, gVar) : new a(gVar);
            } else {
                hVar = new a(gVar);
            }
            return new e(hVar, gVar);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LL5/c$c;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "", "extras", "<init>", "(Landroid/graphics/Bitmap;Ljava/util/Map;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: L5.c$c  reason: collision with other inner class name */
    public static final class C0603c {

        /* renamed from: a  reason: collision with root package name */
        private final Bitmap f38282a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, Object> f38283b;

        public C0603c(Bitmap bitmap, Map<String, ? extends Object> map) {
            this.f38282a = bitmap;
            this.f38283b = map;
        }

        public final Bitmap a() {
            return this.f38282a;
        }

        public final Map<String, Object> b() {
            return this.f38283b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0603c) {
                C0603c cVar = (C0603c) obj;
                return C17542s.e(this.f38282a, cVar.f38282a) && C17542s.e(this.f38283b, cVar.f38283b);
            }
        }

        public int hashCode() {
            return (this.f38282a.hashCode() * 31) + this.f38283b.hashCode();
        }

        public String toString() {
            return "Value(bitmap=" + this.f38282a + ", extras=" + this.f38283b + ')';
        }
    }

    void a(int i10);

    C0603c b(b bVar);

    void c(b bVar, C0603c cVar);

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001dB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LL5/c$b;", "Landroid/os/Parcelable;", "", "key", "", "extras", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "a", "(Ljava/lang/String;Ljava/util/Map;)LL5/c$b;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getKey", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable {
        @Deprecated
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        private static final C0602b f38279c = new C0602b((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f38280a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, String> f38281b;

        @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"L5/c$b$a", "Landroid/os/Parcelable$Creator;", "LL5/c$b;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)LL5/c$b;", "", "size", "", "b", "(I)[LL5/c$b;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                C17542s.g(readString);
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i10 = 0; i10 < readInt; i10++) {
                    String readString2 = parcel.readString();
                    C17542s.g(readString2);
                    String readString3 = parcel.readString();
                    C17542s.g(readString3);
                    linkedHashMap.put(readString2, readString3);
                }
                return new b(readString, linkedHashMap);
            }

            /* renamed from: b */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LL5/c$b$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "LL5/c$b;", "CREATOR", "Landroid/os/Parcelable$Creator;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: L5.c$b$b  reason: collision with other inner class name */
        private static final class C0602b {
            public /* synthetic */ C0602b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0602b() {
            }
        }

        public b(String str, Map<String, String> map) {
            this.f38280a = str;
            this.f38281b = map;
        }

        public static /* synthetic */ b b(b bVar, String str, Map<String, String> map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f38280a;
            }
            if ((i10 & 2) != 0) {
                map = bVar.f38281b;
            }
            return bVar.a(str, map);
        }

        public final b a(String str, Map<String, String> map) {
            return new b(str, map);
        }

        public final Map<String, String> c() {
            return this.f38281b;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C17542s.e(this.f38280a, bVar.f38280a) && C17542s.e(this.f38281b, bVar.f38281b);
            }
        }

        public int hashCode() {
            return (this.f38280a.hashCode() * 31) + this.f38281b.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.f38280a + ", extras=" + this.f38281b + ')';
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f38280a);
            parcel.writeInt(this.f38281b.size());
            for (Map.Entry next : this.f38281b.entrySet()) {
                parcel.writeString((String) next.getKey());
                parcel.writeString((String) next.getValue());
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(String str, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? X.j() : map);
        }
    }
}
