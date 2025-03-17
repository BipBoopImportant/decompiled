package lm;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lm.C11550a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Llm/c;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "Llm/c$a;", "backinstock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c implements Parcelable {

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"Llm/c$a;", "Llm/c;", "Landroid/os/Parcelable;", "Llm/a$c;", "fulfilmentOption", "", "itemNo", "itemType", "<init>", "(Llm/a$c;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llm/a$c;", "()Llm/a$c;", "b", "Ljava/lang/String;", "c", "backinstock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends c implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C2261a();

        /* renamed from: a  reason: collision with root package name */
        private final C11550a.c f99221a;

        /* renamed from: b  reason: collision with root package name */
        private final String f99222b;

        /* renamed from: c  reason: collision with root package name */
        private final String f99223c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lm.c$a$a  reason: collision with other inner class name */
        public static final class C2261a implements Parcelable.Creator<a> {
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new a((C11550a.c) parcel.readParcelable(a.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C11550a.c cVar, String str, String str2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cVar, "fulfilmentOption");
            C17542s.j(str, "itemNo");
            C17542s.j(str2, "itemType");
            this.f99221a = cVar;
            this.f99222b = str;
            this.f99223c = str2;
        }

        public final C11550a.c a() {
            return this.f99221a;
        }

        public final String b() {
            return this.f99222b;
        }

        public final String c() {
            return this.f99223c;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f99221a, aVar.f99221a) && C17542s.e(this.f99222b, aVar.f99222b) && C17542s.e(this.f99223c, aVar.f99223c);
        }

        public int hashCode() {
            return (((this.f99221a.hashCode() * 31) + this.f99222b.hashCode()) * 31) + this.f99223c.hashCode();
        }

        public String toString() {
            C11550a.c cVar = this.f99221a;
            String str = this.f99222b;
            String str2 = this.f99223c;
            return "GetNotified(fulfilmentOption=" + cVar + ", itemNo=" + str + ", itemType=" + str2 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeParcelable(this.f99221a, i10);
            parcel.writeString(this.f99222b);
            parcel.writeString(this.f99223c);
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
