package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.provider.parser.ImagesResponseParser;
import com.oppwa.mobile.connect.utils.Logger;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ImagesRequest implements Parcelable {
    public static final Parcelable.Creator<ImagesRequest> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, ImageDetail> f121785a;

    class a implements Parcelable.Creator<ImagesRequest> {
        a() {
        }

        /* renamed from: a */
        public ImagesRequest createFromParcel(Parcel parcel) {
            return new ImagesRequest(parcel, (a) null);
        }

        /* renamed from: a */
        public ImagesRequest[] newArray(int i10) {
            return new ImagesRequest[i10];
        }
    }

    /* synthetic */ ImagesRequest(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Deprecated
    public static ImagesRequest createFromJson(JSONObject jSONObject) {
        try {
            return (ImagesRequest) new ImagesResponseParser().parse(jSONObject.toString());
        } catch (Exception e10) {
            Logger.error((Throwable) e10);
            throw new JSONException(e10.getMessage());
        }
    }

    public void addValues(ImagesRequest imagesRequest) {
        if (imagesRequest != null) {
            this.f121785a.putAll(imagesRequest.getImagesRequestMap());
        }
    }

    public boolean containsPaymentBrand(String str) {
        return this.f121785a.containsKey(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f121785a.equals(((ImagesRequest) obj).f121785a);
    }

    public Map<String, ImageDetail> getImagesRequestMap() {
        return this.f121785a;
    }

    public int hashCode() {
        return this.f121785a.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f121785a.size();
        parcel.writeInt(size);
        if (size > 0) {
            for (Map.Entry next : this.f121785a.entrySet()) {
                parcel.writeString((String) next.getKey());
                parcel.writeParcelable((Parcelable) next.getValue(), 0);
            }
        }
    }

    public ImagesRequest(Map<String, ImageDetail> map) {
        this.f121785a = map;
    }

    private ImagesRequest(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.f121785a = new LinkedHashMap();
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f121785a.put(parcel.readString(), (ImageDetail) parcel.readParcelable(ImageDetail.class.getClassLoader()));
            }
            return;
        }
        this.f121785a = Collections.emptyMap();
    }
}
