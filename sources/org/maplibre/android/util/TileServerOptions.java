package org.maplibre.android.util;

import AL.C15449c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.maplibre.android.n;

public class TileServerOptions implements Parcelable {
    public static final Parcelable.Creator<TileServerOptions> CREATOR = new a();
    @Keep
    private String apiKeyParameterName;
    @Keep
    private boolean apiKeyRequired;
    @Keep
    private String baseURL;
    @Keep
    private String defaultStyle;
    @Keep
    private DefaultStyle[] defaultStyles;
    @Keep
    private String glyphsDomainName;
    @Keep
    private String glyphsTemplate;
    @Keep
    private String glyphsVersionPrefix;
    @Keep
    private String sourceDomainName;
    @Keep
    private String sourceTemplate;
    @Keep
    private String sourceVersionPrefix;
    @Keep
    private String spritesDomainName;
    @Keep
    private String spritesTemplate;
    @Keep
    private String spritesVersionPrefix;
    @Keep
    private String styleDomainName;
    @Keep
    private String styleTemplate;
    @Keep
    private String styleVersionPrefix;
    @Keep
    private String tileDomainName;
    @Keep
    private String tileTemplate;
    @Keep
    private String tileVersionPrefix;
    @Keep
    private String uriSchemeAlias;

    class a implements Parcelable.Creator<TileServerOptions> {
        a() {
        }

        /* renamed from: a */
        public TileServerOptions createFromParcel(Parcel parcel) {
            return new TileServerOptions(parcel);
        }

        /* renamed from: b */
        public TileServerOptions[] newArray(int i10) {
            return new TileServerOptions[i10];
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f146103a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                org.maplibre.android.n[] r0 = org.maplibre.android.n.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f146103a = r0
                org.maplibre.android.n r1 = org.maplibre.android.n.Mapbox     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f146103a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.maplibre.android.n r1 = org.maplibre.android.n.MapTiler     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f146103a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.maplibre.android.n r1 = org.maplibre.android.n.MapLibre     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.maplibre.android.util.TileServerOptions.b.<clinit>():void");
        }
    }

    @Keep
    public TileServerOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z10, String str19, DefaultStyle[] defaultStyleArr) {
        e(str);
        String str20 = str2;
        w(str2);
        String str21 = str3;
        l(str3);
        String str22 = str4;
        k(str4);
        String str23 = str5;
        m(str5);
        String str24 = str6;
        r(str6);
        String str25 = str7;
        q(str7);
        String str26 = str8;
        s(str8);
        String str27 = str9;
        o(str9);
        String str28 = str10;
        n(str10);
        String str29 = str11;
        p(str11);
        String str30 = str12;
        i(str12);
        String str31 = str13;
        h(str13);
        j(str14);
        u(str15);
        t(str16);
        v(str17);
        c(str18);
        g(defaultStyleArr);
        f(str19);
        d(z10);
    }

    public static TileServerOptions a(n nVar) {
        int i10 = b.f146103a[nVar.ordinal()];
        if (i10 == 1) {
            return mapboxConfiguration();
        }
        if (i10 == 2) {
            return mapTilerConfiguration();
        }
        if (i10 == 3) {
            return mapLibreConfiguration();
        }
        throw new C15449c("Unknown tile server");
    }

    @Keep
    private static native TileServerOptions defaultConfiguration();

    @Keep
    private static native TileServerOptions mapLibreConfiguration();

    @Keep
    private static native TileServerOptions mapTilerConfiguration();

    @Keep
    private static native TileServerOptions mapboxConfiguration();

    public DefaultStyle[] b() {
        return this.defaultStyles;
    }

    public void c(String str) {
        this.apiKeyParameterName = str;
    }

    public void d(boolean z10) {
        this.apiKeyRequired = z10;
    }

    public int describeContents() {
        return 0;
    }

    public void e(String str) {
        this.baseURL = str;
    }

    public void f(String str) {
        this.defaultStyle = str;
    }

    public void g(DefaultStyle[] defaultStyleArr) {
        this.defaultStyles = defaultStyleArr;
    }

    public void h(String str) {
        this.glyphsDomainName = str;
    }

    public void i(String str) {
        this.glyphsTemplate = str;
    }

    public void j(String str) {
        this.glyphsVersionPrefix = str;
    }

    public void k(String str) {
        this.sourceDomainName = str;
    }

    public void l(String str) {
        this.sourceTemplate = str;
    }

    public void m(String str) {
        this.sourceVersionPrefix = str;
    }

    public void n(String str) {
        this.spritesDomainName = str;
    }

    public void o(String str) {
        this.spritesTemplate = str;
    }

    public void p(String str) {
        this.spritesVersionPrefix = str;
    }

    public void q(String str) {
        this.styleDomainName = str;
    }

    public void r(String str) {
        this.styleTemplate = str;
    }

    public void s(String str) {
        this.styleVersionPrefix = str;
    }

    public void t(String str) {
        this.tileDomainName = str;
    }

    public void u(String str) {
        this.tileTemplate = str;
    }

    public void v(String str) {
        this.tileVersionPrefix = str;
    }

    public void w(String str) {
        this.uriSchemeAlias = str;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.baseURL);
        parcel.writeString(this.uriSchemeAlias);
        parcel.writeString(this.sourceTemplate);
        parcel.writeString(this.sourceDomainName);
        parcel.writeString(this.sourceVersionPrefix);
        parcel.writeString(this.styleTemplate);
        parcel.writeString(this.styleDomainName);
        parcel.writeString(this.styleVersionPrefix);
        parcel.writeString(this.spritesTemplate);
        parcel.writeString(this.spritesDomainName);
        parcel.writeString(this.spritesVersionPrefix);
        parcel.writeString(this.glyphsTemplate);
        parcel.writeString(this.glyphsDomainName);
        parcel.writeString(this.glyphsVersionPrefix);
        parcel.writeString(this.tileTemplate);
        parcel.writeString(this.tileDomainName);
        parcel.writeString(this.tileVersionPrefix);
        parcel.writeString(this.apiKeyParameterName);
        parcel.writeByte(this.apiKeyRequired ? (byte) 1 : 0);
        parcel.writeString(this.defaultStyle);
        parcel.writeTypedArray(this.defaultStyles, 0);
    }

    protected TileServerOptions(Parcel parcel) {
        e(parcel.readString());
        w(parcel.readString());
        l(parcel.readString());
        k(parcel.readString());
        m(parcel.readString());
        r(parcel.readString());
        q(parcel.readString());
        s(parcel.readString());
        o(parcel.readString());
        n(parcel.readString());
        p(parcel.readString());
        i(parcel.readString());
        h(parcel.readString());
        j(parcel.readString());
        u(parcel.readString());
        t(parcel.readString());
        v(parcel.readString());
        c(parcel.readString());
        d(parcel.readByte() != 0);
        f(parcel.readString());
        parcel.createTypedArray(DefaultStyle.CREATOR);
    }
}
