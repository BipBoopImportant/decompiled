package fo;

import Do.m;
import Nn.y;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"Lfo/o;", "Landroid/os/Parcelable;", "", "", "itemsToDelete", "LNn/y;", "itemsToUpdate", "LDo/m;", "preselectDeliveryOption", "<init>", "(Ljava/util/List;Ljava/util/List;LDo/m;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "LDo/m;", "()LDo/m;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final int f97475d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f97476a;

    /* renamed from: b  reason: collision with root package name */
    private final List<y> f97477b;

    /* renamed from: c  reason: collision with root package name */
    private final m f97478c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o> {
        /* renamed from: a */
        public final o createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i10 = 0;
            while (true) {
                Class<o> cls = o.class;
                if (i10 == readInt) {
                    return new o(createStringArrayList, arrayList, (m) parcel.readParcelable(cls.getClassLoader()));
                }
                arrayList.add(parcel.readParcelable(cls.getClassLoader()));
                i10++;
            }
        }

        /* renamed from: b */
        public final o[] newArray(int i10) {
            return new o[i10];
        }
    }

    public o(List<String> list, List<y> list2, m mVar) {
        C17542s.j(list, "itemsToDelete");
        C17542s.j(list2, "itemsToUpdate");
        this.f97476a = list;
        this.f97477b = list2;
        this.f97478c = mVar;
    }

    public final List<String> a() {
        return this.f97476a;
    }

    public final List<y> b() {
        return this.f97477b;
    }

    public final m c() {
        return this.f97478c;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return C17542s.e(this.f97476a, oVar.f97476a) && C17542s.e(this.f97477b, oVar.f97477b) && C17542s.e(this.f97478c, oVar.f97478c);
    }

    public int hashCode() {
        int hashCode = ((this.f97476a.hashCode() * 31) + this.f97477b.hashCode()) * 31;
        m mVar = this.f97478c;
        return hashCode + (mVar == null ? 0 : mVar.hashCode());
    }

    public String toString() {
        List<String> list = this.f97476a;
        List<y> list2 = this.f97477b;
        m mVar = this.f97478c;
        return "Result(itemsToDelete=" + list + ", itemsToUpdate=" + list2 + ", preselectDeliveryOption=" + mVar + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeStringList(this.f97476a);
        List<y> list = this.f97477b;
        parcel.writeInt(list.size());
        for (y writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i10);
        }
        parcel.writeParcelable(this.f97478c, i10);
    }
}
