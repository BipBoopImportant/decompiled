package U0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SuppressLint({"BanParcelableUsage"})
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0013B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"LU0/y0;", "T", "LU0/n1;", "Landroid/os/Parcelable;", "value", "LU0/o1;", "policy", "<init>", "(Ljava/lang/Object;LU0/o1;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "d", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.y0  reason: case insensitive filesystem */
public final class C4913y0<T> extends n1<T> implements Parcelable {
    public static final Parcelable.Creator<C4913y0<Object>> CREATOR = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final b f14193d = new b((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J)\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"U0/y0$a", "Landroid/os/Parcelable$ClassLoaderCreator;", "LU0/y0;", "", "Landroid/os/Parcel;", "parcel", "Ljava/lang/ClassLoader;", "loader", "b", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)LU0/y0;", "a", "(Landroid/os/Parcel;)LU0/y0;", "", "size", "", "c", "(I)[LU0/y0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: U0.y0$a */
    public static final class a implements Parcelable.ClassLoaderCreator<C4913y0<Object>> {
        a() {
        }

        /* renamed from: a */
        public C4913y0<Object> createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public C4913y0<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            o1 o1Var;
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                o1Var = p1.k();
            } else if (readInt == 1) {
                o1Var = p1.s();
            } else if (readInt == 2) {
                o1Var = p1.p();
            } else {
                throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            return new C4913y0<>(readValue, o1Var);
        }

        /* renamed from: c */
        public C4913y0<Object>[] newArray(int i10) {
            return new C4913y0[i10];
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"LU0/y0$b;", "", "<init>", "()V", "", "PolicyNeverEquals", "I", "PolicyReferentialEquality", "PolicyStructuralEquality", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: U0.y0$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C4913y0(T t10, o1<T> o1Var) {
        super(t10, o1Var);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        o1 c10 = c();
        if (C17542s.e(c10, p1.k())) {
            i11 = 0;
        } else if (C17542s.e(c10, p1.s())) {
            i11 = 1;
        } else if (C17542s.e(c10, p1.p())) {
            i11 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i11);
    }
}
