package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

final class zzs extends Place.Builder {
    private Place.BooleanPlaceAttributeValue zzA;
    private Place.BooleanPlaceAttributeValue zzB;
    private Place.BooleanPlaceAttributeValue zzC;
    private Place.BooleanPlaceAttributeValue zzD;
    private Place.BooleanPlaceAttributeValue zzE;
    private List zzF;
    private Integer zzG;
    private Integer zzH;
    private LatLngBounds zzI;
    private Uri zzJ;
    private Place.BooleanPlaceAttributeValue zzK;
    private String zza;
    private AddressComponents zzb;
    private List zzc;
    private Place.BusinessStatus zzd;
    private Place.BooleanPlaceAttributeValue zze;
    private OpeningHours zzf;
    private Place.BooleanPlaceAttributeValue zzg;
    private Place.BooleanPlaceAttributeValue zzh;
    private String zzi;
    private String zzj;
    private Integer zzk;
    private String zzl;
    private String zzm;
    private LatLng zzn;
    private String zzo;
    private OpeningHours zzp;
    private String zzq;
    private List zzr;
    private PlusCode zzs;
    private Integer zzt;
    private Double zzu;
    private Place.BooleanPlaceAttributeValue zzv;
    private List zzw;
    private Place.BooleanPlaceAttributeValue zzx;
    private Place.BooleanPlaceAttributeValue zzy;
    private Place.BooleanPlaceAttributeValue zzz;

    zzs() {
    }

    public final String getAddress() {
        return this.zza;
    }

    public final AddressComponents getAddressComponents() {
        return this.zzb;
    }

    public final List<String> getAttributions() {
        return this.zzc;
    }

    public final Place.BusinessStatus getBusinessStatus() {
        return this.zzd;
    }

    public final Place.BooleanPlaceAttributeValue getCurbsidePickup() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zze;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"curbsidePickup\" has not been set");
    }

    public final OpeningHours getCurrentOpeningHours() {
        return this.zzf;
    }

    public final Place.BooleanPlaceAttributeValue getDelivery() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzg;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"delivery\" has not been set");
    }

    public final Place.BooleanPlaceAttributeValue getDineIn() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzh;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"dineIn\" has not been set");
    }

    public final String getEditorialSummary() {
        return this.zzi;
    }

    public final String getEditorialSummaryLanguageCode() {
        return this.zzj;
    }

    public final Integer getIconBackgroundColor() {
        return this.zzk;
    }

    public final String getIconUrl() {
        return this.zzl;
    }

    public final String getId() {
        return this.zzm;
    }

    public final LatLng getLatLng() {
        return this.zzn;
    }

    public final String getName() {
        return this.zzo;
    }

    public final OpeningHours getOpeningHours() {
        return this.zzp;
    }

    public final String getPhoneNumber() {
        return this.zzq;
    }

    public final List<PhotoMetadata> getPhotoMetadatas() {
        return this.zzr;
    }

    public final PlusCode getPlusCode() {
        return this.zzs;
    }

    public final Integer getPriceLevel() {
        return this.zzt;
    }

    public final Double getRating() {
        return this.zzu;
    }

    public final Place.BooleanPlaceAttributeValue getReservable() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzv;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"reservable\" has not been set");
    }

    public final List<OpeningHours> getSecondaryOpeningHours() {
        return this.zzw;
    }

    public final Place.BooleanPlaceAttributeValue getServesBeer() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzx;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"servesBeer\" has not been set");
    }

    public final Place.BooleanPlaceAttributeValue getServesBreakfast() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzy;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"servesBreakfast\" has not been set");
    }

    public final Place.BooleanPlaceAttributeValue getServesBrunch() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzz;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"servesBrunch\" has not been set");
    }

    public final Place.BooleanPlaceAttributeValue getServesDinner() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzA;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"servesDinner\" has not been set");
    }

    public final Place.BooleanPlaceAttributeValue getServesLunch() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzB;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"servesLunch\" has not been set");
    }

    public final Place.BooleanPlaceAttributeValue getServesVegetarianFood() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzC;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"servesVegetarianFood\" has not been set");
    }

    public final Place.BooleanPlaceAttributeValue getServesWine() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzD;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"servesWine\" has not been set");
    }

    public final Place.BooleanPlaceAttributeValue getTakeout() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzE;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"takeout\" has not been set");
    }

    public final List<Place.Type> getTypes() {
        return this.zzF;
    }

    public final Integer getUserRatingsTotal() {
        return this.zzG;
    }

    public final Integer getUtcOffsetMinutes() {
        return this.zzH;
    }

    public final LatLngBounds getViewport() {
        return this.zzI;
    }

    public final Uri getWebsiteUri() {
        return this.zzJ;
    }

    public final Place.BooleanPlaceAttributeValue getWheelchairAccessibleEntrance() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzK;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"wheelchairAccessibleEntrance\" has not been set");
    }

    public final Place.Builder setAddress(String str) {
        this.zza = str;
        return this;
    }

    public final Place.Builder setAddressComponents(AddressComponents addressComponents) {
        this.zzb = addressComponents;
        return this;
    }

    public final Place.Builder setAttributions(List<String> list) {
        this.zzc = list;
        return this;
    }

    public final Place.Builder setBusinessStatus(Place.BusinessStatus businessStatus) {
        this.zzd = businessStatus;
        return this;
    }

    public final Place.Builder setCurbsidePickup(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zze = booleanPlaceAttributeValue;
            return this;
        }
        throw new NullPointerException("Null curbsidePickup");
    }

    public final Place.Builder setCurrentOpeningHours(OpeningHours openingHours) {
        this.zzf = openingHours;
        return this;
    }

    public final Place.Builder setDelivery(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzg = booleanPlaceAttributeValue;
            return this;
        }
        throw new NullPointerException("Null delivery");
    }

    public final Place.Builder setDineIn(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzh = booleanPlaceAttributeValue;
            return this;
        }
        throw new NullPointerException("Null dineIn");
    }

    public final Place.Builder setEditorialSummary(String str) {
        this.zzi = str;
        return this;
    }

    public final Place.Builder setEditorialSummaryLanguageCode(String str) {
        this.zzj = str;
        return this;
    }

    public final Place.Builder setIconBackgroundColor(Integer num) {
        this.zzk = num;
        return this;
    }

    public final Place.Builder setIconUrl(String str) {
        this.zzl = str;
        return this;
    }

    public final Place.Builder setId(String str) {
        this.zzm = str;
        return this;
    }

    public final Place.Builder setLatLng(LatLng latLng) {
        this.zzn = latLng;
        return this;
    }

    public final Place.Builder setName(String str) {
        this.zzo = str;
        return this;
    }

    public final Place.Builder setOpeningHours(OpeningHours openingHours) {
        this.zzp = openingHours;
        return this;
    }

    public final Place.Builder setPhoneNumber(String str) {
        this.zzq = str;
        return this;
    }

    public final Place.Builder setPhotoMetadatas(List<PhotoMetadata> list) {
        this.zzr = list;
        return this;
    }

    public final Place.Builder setPlusCode(PlusCode plusCode) {
        this.zzs = plusCode;
        return this;
    }

    public final Place.Builder setPriceLevel(Integer num) {
        this.zzt = num;
        return this;
    }

    public final Place.Builder setRating(Double d10) {
        this.zzu = d10;
        return this;
    }

    public final Place.Builder setReservable(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzv = booleanPlaceAttributeValue;
            return this;
        }
        throw new NullPointerException("Null reservable");
    }

    public final Place.Builder setSecondaryOpeningHours(List<OpeningHours> list) {
        this.zzw = list;
        return this;
    }

    public final Place.Builder setServesBeer(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzx = booleanPlaceAttributeValue;
            return this;
        }
        throw new NullPointerException("Null servesBeer");
    }

    public final Place.Builder setServesBreakfast(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzy = booleanPlaceAttributeValue;
            return this;
        }
        throw new NullPointerException("Null servesBreakfast");
    }

    public final Place.Builder setServesBrunch(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzz = booleanPlaceAttributeValue;
            return this;
        }
        throw new NullPointerException("Null servesBrunch");
    }

    public final Place.Builder setServesDinner(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzA = booleanPlaceAttributeValue;
            return this;
        }
        throw new NullPointerException("Null servesDinner");
    }

    public final Place.Builder setServesLunch(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzB = booleanPlaceAttributeValue;
            return this;
        }
        throw new NullPointerException("Null servesLunch");
    }

    public final Place.Builder setServesVegetarianFood(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzC = booleanPlaceAttributeValue;
            return this;
        }
        throw new NullPointerException("Null servesVegetarianFood");
    }

    public final Place.Builder setServesWine(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzD = booleanPlaceAttributeValue;
            return this;
        }
        throw new NullPointerException("Null servesWine");
    }

    public final Place.Builder setTakeout(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzE = booleanPlaceAttributeValue;
            return this;
        }
        throw new NullPointerException("Null takeout");
    }

    public final Place.Builder setTypes(List<Place.Type> list) {
        this.zzF = list;
        return this;
    }

    public final Place.Builder setUserRatingsTotal(Integer num) {
        this.zzG = num;
        return this;
    }

    public final Place.Builder setUtcOffsetMinutes(Integer num) {
        this.zzH = num;
        return this;
    }

    public final Place.Builder setViewport(LatLngBounds latLngBounds) {
        this.zzI = latLngBounds;
        return this;
    }

    public final Place.Builder setWebsiteUri(Uri uri) {
        this.zzJ = uri;
        return this;
    }

    public final Place.Builder setWheelchairAccessibleEntrance(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue != null) {
            this.zzK = booleanPlaceAttributeValue;
            return this;
        }
        throw new NullPointerException("Null wheelchairAccessibleEntrance");
    }

    /* access modifiers changed from: package-private */
    public final Place zza() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue8;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue9;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue10;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue11;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue12;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue13 = this.zze;
        if (booleanPlaceAttributeValue13 == null || (booleanPlaceAttributeValue = this.zzg) == null || (booleanPlaceAttributeValue2 = this.zzh) == null || (booleanPlaceAttributeValue3 = this.zzv) == null || (booleanPlaceAttributeValue4 = this.zzx) == null || (booleanPlaceAttributeValue5 = this.zzy) == null || (booleanPlaceAttributeValue6 = this.zzz) == null || (booleanPlaceAttributeValue7 = this.zzA) == null || (booleanPlaceAttributeValue8 = this.zzB) == null || (booleanPlaceAttributeValue9 = this.zzC) == null || (booleanPlaceAttributeValue10 = this.zzD) == null || (booleanPlaceAttributeValue11 = this.zzE) == null || (booleanPlaceAttributeValue12 = this.zzK) == null) {
            StringBuilder sb2 = new StringBuilder();
            if (this.zze == null) {
                sb2.append(" curbsidePickup");
            }
            if (this.zzg == null) {
                sb2.append(" delivery");
            }
            if (this.zzh == null) {
                sb2.append(" dineIn");
            }
            if (this.zzv == null) {
                sb2.append(" reservable");
            }
            if (this.zzx == null) {
                sb2.append(" servesBeer");
            }
            if (this.zzy == null) {
                sb2.append(" servesBreakfast");
            }
            if (this.zzz == null) {
                sb2.append(" servesBrunch");
            }
            if (this.zzA == null) {
                sb2.append(" servesDinner");
            }
            if (this.zzB == null) {
                sb2.append(" servesLunch");
            }
            if (this.zzC == null) {
                sb2.append(" servesVegetarianFood");
            }
            if (this.zzD == null) {
                sb2.append(" servesWine");
            }
            if (this.zzE == null) {
                sb2.append(" takeout");
            }
            if (this.zzK == null) {
                sb2.append(" wheelchairAccessibleEntrance");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
        }
        return new zzay(this.zza, this.zzb, this.zzc, this.zzd, booleanPlaceAttributeValue13, this.zzf, booleanPlaceAttributeValue, booleanPlaceAttributeValue2, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, booleanPlaceAttributeValue3, this.zzw, booleanPlaceAttributeValue4, booleanPlaceAttributeValue5, booleanPlaceAttributeValue6, booleanPlaceAttributeValue7, booleanPlaceAttributeValue8, booleanPlaceAttributeValue9, booleanPlaceAttributeValue10, booleanPlaceAttributeValue11, this.zzF, this.zzG, this.zzH, this.zzI, this.zzJ, booleanPlaceAttributeValue12);
    }
}
