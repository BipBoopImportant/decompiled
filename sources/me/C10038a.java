package me;

import HJ.C15854t;
import XH.C16807N;
import XH.C16814e;
import XH.v;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.AddressComponent;
import com.google.android.libraries.places.api.model.AddressComponents;
import com.google.android.libraries.places.api.model.Place;
import com.sugarcube.core.logger.DslKt;
import fI.C17221b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\n\u001e\u000f\u001cJ1\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t\u0018\u00010\fH'¢\u0006\u0004\b\u000f\u0010\u0010J]\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u0006H&¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lme/a;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lme/a$a;", "addressLookupConfig", "", "requestValue", "componentValue", "LXH/N;", "b", "(Landroidx/fragment/app/FragmentManager;Lme/a$a;Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function1;", "Lme/a$d;", "addressSetListener", "a", "(Landroidx/fragment/app/FragmentManager;Lme/a$a;Ljava/lang/String;Ljava/lang/String;LnI/l;)V", "countryCode", "Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBounds", "currentAddress", "", "locationRestriction", "enableAddStreetNumber", "Lme/a$b;", "cursorSelection", "Lme/a$c;", "onSelectAddressListener", "c", "(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLngBounds;Ljava/lang/String;ZZLme/a$b;Lme/a$c;Ljava/lang/String;)V", "d", "addresspicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: me.a  reason: case insensitive filesystem */
public interface C10038a {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0010\u0005\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Lme/a$a;", "Landroid/os/Parcelable;", "<init>", "()V", "", "c", "()Ljava/lang/String;", "countryCode", "Lme/a$a$b;", "d", "()Lme/a$a$b;", "cursorFocus", "", "a", "()Z", "addStreetNumberEnabled", "b", "autoCompleteEnabled", "e", "lookupKey", "Lme/a$a$a;", "Lme/a$a$c;", "addresspicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: me.a$a  reason: collision with other inner class name */
    public static abstract class C1374a implements Parcelable {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u001f\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"¨\u0006&"}, d2 = {"Lme/a$a$a;", "Lme/a$a;", "", "countryCode", "lookupKey", "", "autoCompleteEnabled", "Lme/a$a$b;", "cursorFocus", "addStreetNumberEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLme/a$a$b;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "e", "Z", "()Z", "d", "Lme/a$a$b;", "()Lme/a$a$b;", "addresspicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: me.a$a$a  reason: collision with other inner class name */
        public static final class C1375a extends C1374a {
            public static final Parcelable.Creator<C1375a> CREATOR = new C1376a();

            /* renamed from: a  reason: collision with root package name */
            private final String f75340a;

            /* renamed from: b  reason: collision with root package name */
            private final String f75341b;

            /* renamed from: c  reason: collision with root package name */
            private final boolean f75342c;

            /* renamed from: d  reason: collision with root package name */
            private final b f75343d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f75344e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: me.a$a$a$a  reason: collision with other inner class name */
            public static final class C1376a implements Parcelable.Creator<C1375a> {
                /* renamed from: a */
                public final C1375a createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new C1375a(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), parcel.readInt() != 0);
                }

                /* renamed from: b */
                public final C1375a[] newArray(int i10) {
                    return new C1375a[i10];
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C1375a(String str, String str2, boolean z10, b bVar, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : str2, z10, bVar, z11);
            }

            public boolean a() {
                return this.f75344e;
            }

            public boolean b() {
                return this.f75342c;
            }

            public String c() {
                return this.f75340a;
            }

            public b d() {
                return this.f75343d;
            }

            public final int describeContents() {
                return 0;
            }

            public String e() {
                return this.f75341b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1375a)) {
                    return false;
                }
                C1375a aVar = (C1375a) obj;
                return C17542s.e(this.f75340a, aVar.f75340a) && C17542s.e(this.f75341b, aVar.f75341b) && this.f75342c == aVar.f75342c && this.f75343d == aVar.f75343d && this.f75344e == aVar.f75344e;
            }

            public int hashCode() {
                int hashCode = this.f75340a.hashCode() * 31;
                String str = this.f75341b;
                int i10 = 0;
                int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f75342c)) * 31;
                b bVar = this.f75343d;
                if (bVar != null) {
                    i10 = bVar.hashCode();
                }
                return ((hashCode2 + i10) * 31) + Boolean.hashCode(this.f75344e);
            }

            public String toString() {
                String str = this.f75340a;
                String str2 = this.f75341b;
                boolean z10 = this.f75342c;
                b bVar = this.f75343d;
                boolean z11 = this.f75344e;
                return "AddressLookupApi(countryCode=" + str + ", lookupKey=" + str2 + ", autoCompleteEnabled=" + z10 + ", cursorFocus=" + bVar + ", addStreetNumberEnabled=" + z11 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeString(this.f75340a);
                parcel.writeString(this.f75341b);
                parcel.writeInt(this.f75342c ? 1 : 0);
                b bVar = this.f75343d;
                if (bVar == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(bVar.name());
                }
                parcel.writeInt(this.f75344e ? 1 : 0);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1375a(String str, String str2, boolean z10, b bVar, boolean z11) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "countryCode");
                this.f75340a = str;
                this.f75341b = str2;
                this.f75342c = z10;
                this.f75343d = bVar;
                this.f75344e = z11;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lme/a$a$b;", "", "<init>", "(Ljava/lang/String;I)V", "START", "END", "addresspicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: me.a$a$b */
        public enum b {
            START,
            END;

            static {
                b[] a10;
                $ENTRIES = C17221b.a(a10);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u001f\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"¨\u0006&"}, d2 = {"Lme/a$a$c;", "Lme/a$a;", "", "countryCode", "lookupKey", "", "autoCompleteEnabled", "Lme/a$a$b;", "cursorFocus", "addStreetNumberEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLme/a$a$b;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "e", "Z", "()Z", "d", "Lme/a$a$b;", "()Lme/a$a$b;", "addresspicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: me.a$a$c */
        public static final class c extends C1374a {
            public static final Parcelable.Creator<c> CREATOR = new C1377a();

            /* renamed from: a  reason: collision with root package name */
            private final String f75345a;

            /* renamed from: b  reason: collision with root package name */
            private final String f75346b;

            /* renamed from: c  reason: collision with root package name */
            private final boolean f75347c;

            /* renamed from: d  reason: collision with root package name */
            private final b f75348d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f75349e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: me.a$a$c$a  reason: collision with other inner class name */
            public static final class C1377a implements Parcelable.Creator<c> {
                /* renamed from: a */
                public final c createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new c(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), parcel.readInt() != 0);
                }

                /* renamed from: b */
                public final c[] newArray(int i10) {
                    return new c[i10];
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ c(String str, String str2, boolean z10, b bVar, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i10 & 4) != 0 ? true : z10, bVar, z11);
            }

            public boolean a() {
                return this.f75349e;
            }

            public boolean b() {
                return this.f75347c;
            }

            public String c() {
                return this.f75345a;
            }

            public b d() {
                return this.f75348d;
            }

            public final int describeContents() {
                return 0;
            }

            public String e() {
                return this.f75346b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return C17542s.e(this.f75345a, cVar.f75345a) && C17542s.e(this.f75346b, cVar.f75346b) && this.f75347c == cVar.f75347c && this.f75348d == cVar.f75348d && this.f75349e == cVar.f75349e;
            }

            public int hashCode() {
                int hashCode = ((((this.f75345a.hashCode() * 31) + this.f75346b.hashCode()) * 31) + Boolean.hashCode(this.f75347c)) * 31;
                b bVar = this.f75348d;
                return ((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + Boolean.hashCode(this.f75349e);
            }

            public String toString() {
                String str = this.f75345a;
                String str2 = this.f75346b;
                boolean z10 = this.f75347c;
                b bVar = this.f75348d;
                boolean z11 = this.f75349e;
                return "GooglePlaces(countryCode=" + str + ", lookupKey=" + str2 + ", autoCompleteEnabled=" + z10 + ", cursorFocus=" + bVar + ", addStreetNumberEnabled=" + z11 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeString(this.f75345a);
                parcel.writeString(this.f75346b);
                parcel.writeInt(this.f75347c ? 1 : 0);
                b bVar = this.f75348d;
                if (bVar == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(bVar.name());
                }
                parcel.writeInt(this.f75349e ? 1 : 0);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(String str, String str2, boolean z10, b bVar, boolean z11) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "countryCode");
                C17542s.j(str2, "lookupKey");
                this.f75345a = str;
                this.f75346b = str2;
                this.f75347c = z10;
                this.f75348d = bVar;
                this.f75349e = z11;
            }
        }

        public /* synthetic */ C1374a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract boolean a();

        public abstract boolean b();

        public abstract String c();

        public abstract b d();

        public abstract String e();

        private C1374a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lme/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "START", "END", "addresspicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: me.a$b */
    public enum b {
        START,
        END;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00100\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lme/a$c;", "", "<init>", "()V", "", "addressString", "Lcom/google/android/libraries/places/api/model/Place;", "place", "LXH/N;", "b", "(Ljava/lang/String;Lcom/google/android/libraries/places/api/model/Place;)V", "c", "(Ljava/lang/String;)V", "", "lookupKeysAndTarget", "", "LXH/v;", "a", "(Ljava/util/Map;Lcom/google/android/libraries/places/api/model/Place;)Ljava/util/List;", "addresspicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: me.a$c */
    public static abstract class c {
        /* access modifiers changed from: protected */
        public final List<v<String, String>> a(Map<String, String> map, Place place) {
            AddressComponents addressComponents;
            List<AddressComponent> asList;
            Object obj;
            C17542s.j(map, "lookupKeysAndTarget");
            C17542s.j(place, "place");
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (true) {
                v vVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str = (String) next.getKey();
                String str2 = (String) next.getValue();
                if (!(C15854t.v0(str) || (addressComponents = place.getAddressComponents()) == null || (asList = addressComponents.asList()) == null)) {
                    Iterator it2 = asList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (((AddressComponent) obj).getTypes().contains(str)) {
                            break;
                        }
                    }
                    AddressComponent addressComponent = (AddressComponent) obj;
                    if (addressComponent != null) {
                        String shortName = addressComponent.getShortName();
                        if (shortName == null) {
                            shortName = "";
                        }
                        vVar = new v(str2, shortName);
                    }
                }
                if (vVar != null) {
                    arrayList.add(vVar);
                }
            }
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar, true)) {
                    arrayList2.add(next2);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList2) {
                if (str3 == null) {
                    String a10 = C11818a.a("map address, input: " + map + ", place: " + place + ", result: " + arrayList, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                String str5 = str3;
                if (str4 == null) {
                    String name = getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str6 = str4;
                bVar.a(eVar, str6, true, (Throwable) null, str5);
                str3 = str5;
                str4 = str6;
            }
            return arrayList;
        }

        public abstract void b(String str, Place place);

        public abstract void c(String str);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001b\u0010\"¨\u0006#"}, d2 = {"Lme/a$d;", "Landroid/os/Parcelable;", "", "postalCode", "addressName", "subAddressName", "", "additionalValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "getSubAddressName", "d", "Ljava/util/Map;", "()Ljava/util/Map;", "addresspicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: me.a$d */
    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new C1378a();

        /* renamed from: a  reason: collision with root package name */
        private final String f75350a;

        /* renamed from: b  reason: collision with root package name */
        private final String f75351b;

        /* renamed from: c  reason: collision with root package name */
        private final String f75352c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<String, String> f75353d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: me.a$d$a  reason: collision with other inner class name */
        public static final class C1378a implements Parcelable.Creator<d> {
            /* renamed from: a */
            public final d createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                C17542s.j(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i10 = 0; i10 != readInt; i10++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new d(readString, readString2, readString3, linkedHashMap);
            }

            /* renamed from: b */
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(String str, String str2, String str3, Map<String, String> map) {
            C17542s.j(str, "postalCode");
            this.f75350a = str;
            this.f75351b = str2;
            this.f75352c = str3;
            this.f75353d = map;
        }

        public final Map<String, String> a() {
            return this.f75353d;
        }

        public final String b() {
            return this.f75351b;
        }

        public final String c() {
            return this.f75350a;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f75350a, dVar.f75350a) && C17542s.e(this.f75351b, dVar.f75351b) && C17542s.e(this.f75352c, dVar.f75352c) && C17542s.e(this.f75353d, dVar.f75353d);
        }

        public int hashCode() {
            int hashCode = this.f75350a.hashCode() * 31;
            String str = this.f75351b;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f75352c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, String> map = this.f75353d;
            if (map != null) {
                i10 = map.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            String str = this.f75350a;
            String str2 = this.f75351b;
            String str3 = this.f75352c;
            Map<String, String> map = this.f75353d;
            return "PostalCodeAddress(postalCode=" + str + ", addressName=" + str2 + ", subAddressName=" + str3 + ", additionalValues=" + map + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f75350a);
            parcel.writeString(this.f75351b);
            parcel.writeString(this.f75352c);
            Map<String, String> map = this.f75353d;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry next : map.entrySet()) {
                parcel.writeString((String) next.getKey());
                parcel.writeString((String) next.getValue());
            }
        }
    }

    @C16814e
    void a(FragmentManager fragmentManager, C1374a aVar, String str, String str2, C17642l<? super d, C16807N> lVar);

    void b(FragmentManager fragmentManager, C1374a aVar, String str, String str2);

    void c(FragmentManager fragmentManager, String str, LatLngBounds latLngBounds, String str2, boolean z10, boolean z11, b bVar, c cVar, String str3);
}
