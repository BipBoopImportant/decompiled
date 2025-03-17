package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

abstract class zzt extends Place {
    private final Place.BooleanPlaceAttributeValue zzA;
    private final Place.BooleanPlaceAttributeValue zzB;
    private final Place.BooleanPlaceAttributeValue zzC;
    private final Place.BooleanPlaceAttributeValue zzD;
    private final Place.BooleanPlaceAttributeValue zzE;
    private final List zzF;
    private final Integer zzG;
    private final Integer zzH;
    private final LatLngBounds zzI;
    private final Uri zzJ;
    private final Place.BooleanPlaceAttributeValue zzK;
    private final String zza;
    private final AddressComponents zzb;
    private final List zzc;
    private final Place.BusinessStatus zzd;
    private final Place.BooleanPlaceAttributeValue zze;
    private final OpeningHours zzf;
    private final Place.BooleanPlaceAttributeValue zzg;
    private final Place.BooleanPlaceAttributeValue zzh;
    private final String zzi;
    private final String zzj;
    private final Integer zzk;
    private final String zzl;
    private final String zzm;
    private final LatLng zzn;
    private final String zzo;
    private final OpeningHours zzp;
    private final String zzq;
    private final List zzr;
    private final PlusCode zzs;
    private final Integer zzt;
    private final Double zzu;
    private final Place.BooleanPlaceAttributeValue zzv;
    private final List zzw;
    private final Place.BooleanPlaceAttributeValue zzx;
    private final Place.BooleanPlaceAttributeValue zzy;
    private final Place.BooleanPlaceAttributeValue zzz;

    zzt(String str, AddressComponents addressComponents, List list, Place.BusinessStatus businessStatus, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, OpeningHours openingHours, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, String str2, String str3, Integer num, String str4, String str5, LatLng latLng, String str6, OpeningHours openingHours2, String str7, List list2, PlusCode plusCode, Integer num2, Double d10, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4, List list3, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue8, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue9, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue10, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue11, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue12, List list4, Integer num3, Integer num4, LatLngBounds latLngBounds, Uri uri, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue13) {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue14 = booleanPlaceAttributeValue;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue15 = booleanPlaceAttributeValue2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue16 = booleanPlaceAttributeValue3;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue17 = booleanPlaceAttributeValue4;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue18 = booleanPlaceAttributeValue5;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue19 = booleanPlaceAttributeValue6;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue20 = booleanPlaceAttributeValue7;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue21 = booleanPlaceAttributeValue8;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue22 = booleanPlaceAttributeValue9;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue23 = booleanPlaceAttributeValue10;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue24 = booleanPlaceAttributeValue11;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue25 = booleanPlaceAttributeValue12;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue26 = booleanPlaceAttributeValue13;
        this.zza = str;
        this.zzb = addressComponents;
        this.zzc = list;
        this.zzd = businessStatus;
        if (booleanPlaceAttributeValue14 != null) {
            this.zze = booleanPlaceAttributeValue14;
            this.zzf = openingHours;
            if (booleanPlaceAttributeValue15 != null) {
                this.zzg = booleanPlaceAttributeValue15;
                if (booleanPlaceAttributeValue16 != null) {
                    this.zzh = booleanPlaceAttributeValue16;
                    this.zzi = str2;
                    this.zzj = str3;
                    this.zzk = num;
                    this.zzl = str4;
                    this.zzm = str5;
                    this.zzn = latLng;
                    this.zzo = str6;
                    this.zzp = openingHours2;
                    this.zzq = str7;
                    this.zzr = list2;
                    this.zzs = plusCode;
                    this.zzt = num2;
                    this.zzu = d10;
                    if (booleanPlaceAttributeValue17 != null) {
                        this.zzv = booleanPlaceAttributeValue17;
                        this.zzw = list3;
                        if (booleanPlaceAttributeValue18 != null) {
                            this.zzx = booleanPlaceAttributeValue18;
                            if (booleanPlaceAttributeValue19 != null) {
                                this.zzy = booleanPlaceAttributeValue19;
                                if (booleanPlaceAttributeValue20 != null) {
                                    this.zzz = booleanPlaceAttributeValue20;
                                    if (booleanPlaceAttributeValue21 != null) {
                                        this.zzA = booleanPlaceAttributeValue21;
                                        if (booleanPlaceAttributeValue22 != null) {
                                            this.zzB = booleanPlaceAttributeValue22;
                                            if (booleanPlaceAttributeValue23 != null) {
                                                this.zzC = booleanPlaceAttributeValue23;
                                                if (booleanPlaceAttributeValue24 != null) {
                                                    this.zzD = booleanPlaceAttributeValue24;
                                                    if (booleanPlaceAttributeValue25 != null) {
                                                        this.zzE = booleanPlaceAttributeValue25;
                                                        this.zzF = list4;
                                                        this.zzG = num3;
                                                        this.zzH = num4;
                                                        this.zzI = latLngBounds;
                                                        this.zzJ = uri;
                                                        if (booleanPlaceAttributeValue26 != null) {
                                                            this.zzK = booleanPlaceAttributeValue26;
                                                            return;
                                                        }
                                                        throw new NullPointerException("Null wheelchairAccessibleEntrance");
                                                    }
                                                    throw new NullPointerException("Null takeout");
                                                }
                                                throw new NullPointerException("Null servesWine");
                                            }
                                            throw new NullPointerException("Null servesVegetarianFood");
                                        }
                                        throw new NullPointerException("Null servesLunch");
                                    }
                                    throw new NullPointerException("Null servesDinner");
                                }
                                throw new NullPointerException("Null servesBrunch");
                            }
                            throw new NullPointerException("Null servesBreakfast");
                        }
                        throw new NullPointerException("Null servesBeer");
                    }
                    throw new NullPointerException("Null reservable");
                }
                throw new NullPointerException("Null dineIn");
            }
            throw new NullPointerException("Null delivery");
        }
        throw new NullPointerException("Null curbsidePickup");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x016a, code lost:
        r1 = r4.zzs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x017f, code lost:
        r1 = r4.zzt;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0194, code lost:
        r1 = r4.zzu;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01b5, code lost:
        r1 = r4.zzw;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x022a, code lost:
        r1 = r4.zzF;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x023f, code lost:
        r1 = r4.zzG;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0254, code lost:
        r1 = r4.zzH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0269, code lost:
        r1 = r4.zzI;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x027e, code lost:
        r1 = r4.zzJ;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        r1 = r4.zzf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        r1 = r4.zzi;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ad, code lost:
        r1 = r4.zzj;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c2, code lost:
        r1 = r4.zzk;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d7, code lost:
        r1 = r4.zzl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ec, code lost:
        r1 = r4.zzm;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0101, code lost:
        r1 = r4.zzn;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0116, code lost:
        r1 = r4.zzo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x012b, code lost:
        r1 = r4.zzp;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0140, code lost:
        r1 = r4.zzq;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0155, code lost:
        r1 = r4.zzr;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.places.api.model.Place
            r2 = 0
            if (r1 == 0) goto L_0x02a1
            com.google.android.libraries.places.api.model.Place r5 = (com.google.android.libraries.places.api.model.Place) r5
            java.lang.String r1 = r4.zza
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = r5.getAddress()
            if (r1 != 0) goto L_0x02a1
            goto L_0x0020
        L_0x0016:
            java.lang.String r3 = r5.getAddress()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x0020:
            com.google.android.libraries.places.api.model.AddressComponents r1 = r4.zzb
            if (r1 != 0) goto L_0x002b
            com.google.android.libraries.places.api.model.AddressComponents r1 = r5.getAddressComponents()
            if (r1 != 0) goto L_0x02a1
            goto L_0x0035
        L_0x002b:
            com.google.android.libraries.places.api.model.AddressComponents r3 = r5.getAddressComponents()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x0035:
            java.util.List r1 = r4.zzc
            if (r1 != 0) goto L_0x0040
            java.util.List r1 = r5.getAttributions()
            if (r1 != 0) goto L_0x02a1
            goto L_0x004a
        L_0x0040:
            java.util.List r3 = r5.getAttributions()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x004a:
            com.google.android.libraries.places.api.model.Place$BusinessStatus r1 = r4.zzd
            if (r1 != 0) goto L_0x0055
            com.google.android.libraries.places.api.model.Place$BusinessStatus r1 = r5.getBusinessStatus()
            if (r1 != 0) goto L_0x02a1
            goto L_0x005f
        L_0x0055:
            com.google.android.libraries.places.api.model.Place$BusinessStatus r3 = r5.getBusinessStatus()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x005f:
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r1 = r4.zze
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r3 = r5.getCurbsidePickup()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
            com.google.android.libraries.places.api.model.OpeningHours r1 = r4.zzf
            if (r1 != 0) goto L_0x0076
            com.google.android.libraries.places.api.model.OpeningHours r1 = r5.getCurrentOpeningHours()
            if (r1 != 0) goto L_0x02a1
            goto L_0x0080
        L_0x0076:
            com.google.android.libraries.places.api.model.OpeningHours r3 = r5.getCurrentOpeningHours()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x0080:
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r1 = r4.zzg
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r3 = r5.getDelivery()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r1 = r4.zzh
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r3 = r5.getDineIn()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
            java.lang.String r1 = r4.zzi
            if (r1 != 0) goto L_0x00a3
            java.lang.String r1 = r5.getEditorialSummary()
            if (r1 != 0) goto L_0x02a1
            goto L_0x00ad
        L_0x00a3:
            java.lang.String r3 = r5.getEditorialSummary()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x00ad:
            java.lang.String r1 = r4.zzj
            if (r1 != 0) goto L_0x00b8
            java.lang.String r1 = r5.getEditorialSummaryLanguageCode()
            if (r1 != 0) goto L_0x02a1
            goto L_0x00c2
        L_0x00b8:
            java.lang.String r3 = r5.getEditorialSummaryLanguageCode()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x00c2:
            java.lang.Integer r1 = r4.zzk
            if (r1 != 0) goto L_0x00cd
            java.lang.Integer r1 = r5.getIconBackgroundColor()
            if (r1 != 0) goto L_0x02a1
            goto L_0x00d7
        L_0x00cd:
            java.lang.Integer r3 = r5.getIconBackgroundColor()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x00d7:
            java.lang.String r1 = r4.zzl
            if (r1 != 0) goto L_0x00e2
            java.lang.String r1 = r5.getIconUrl()
            if (r1 != 0) goto L_0x02a1
            goto L_0x00ec
        L_0x00e2:
            java.lang.String r3 = r5.getIconUrl()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x00ec:
            java.lang.String r1 = r4.zzm
            if (r1 != 0) goto L_0x00f7
            java.lang.String r1 = r5.getId()
            if (r1 != 0) goto L_0x02a1
            goto L_0x0101
        L_0x00f7:
            java.lang.String r3 = r5.getId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x0101:
            com.google.android.gms.maps.model.LatLng r1 = r4.zzn
            if (r1 != 0) goto L_0x010c
            com.google.android.gms.maps.model.LatLng r1 = r5.getLatLng()
            if (r1 != 0) goto L_0x02a1
            goto L_0x0116
        L_0x010c:
            com.google.android.gms.maps.model.LatLng r3 = r5.getLatLng()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x0116:
            java.lang.String r1 = r4.zzo
            if (r1 != 0) goto L_0x0121
            java.lang.String r1 = r5.getName()
            if (r1 != 0) goto L_0x02a1
            goto L_0x012b
        L_0x0121:
            java.lang.String r3 = r5.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x012b:
            com.google.android.libraries.places.api.model.OpeningHours r1 = r4.zzp
            if (r1 != 0) goto L_0x0136
            com.google.android.libraries.places.api.model.OpeningHours r1 = r5.getOpeningHours()
            if (r1 != 0) goto L_0x02a1
            goto L_0x0140
        L_0x0136:
            com.google.android.libraries.places.api.model.OpeningHours r3 = r5.getOpeningHours()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x0140:
            java.lang.String r1 = r4.zzq
            if (r1 != 0) goto L_0x014b
            java.lang.String r1 = r5.getPhoneNumber()
            if (r1 != 0) goto L_0x02a1
            goto L_0x0155
        L_0x014b:
            java.lang.String r3 = r5.getPhoneNumber()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x0155:
            java.util.List r1 = r4.zzr
            if (r1 != 0) goto L_0x0160
            java.util.List r1 = r5.getPhotoMetadatas()
            if (r1 != 0) goto L_0x02a1
            goto L_0x016a
        L_0x0160:
            java.util.List r3 = r5.getPhotoMetadatas()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x016a:
            com.google.android.libraries.places.api.model.PlusCode r1 = r4.zzs
            if (r1 != 0) goto L_0x0175
            com.google.android.libraries.places.api.model.PlusCode r1 = r5.getPlusCode()
            if (r1 != 0) goto L_0x02a1
            goto L_0x017f
        L_0x0175:
            com.google.android.libraries.places.api.model.PlusCode r3 = r5.getPlusCode()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x017f:
            java.lang.Integer r1 = r4.zzt
            if (r1 != 0) goto L_0x018a
            java.lang.Integer r1 = r5.getPriceLevel()
            if (r1 != 0) goto L_0x02a1
            goto L_0x0194
        L_0x018a:
            java.lang.Integer r3 = r5.getPriceLevel()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x0194:
            java.lang.Double r1 = r4.zzu
            if (r1 != 0) goto L_0x019f
            java.lang.Double r1 = r5.getRating()
            if (r1 != 0) goto L_0x02a1
            goto L_0x01a9
        L_0x019f:
            java.lang.Double r3 = r5.getRating()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x01a9:
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r1 = r4.zzv
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r3 = r5.getReservable()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
            java.util.List r1 = r4.zzw
            if (r1 != 0) goto L_0x01c0
            java.util.List r1 = r5.getSecondaryOpeningHours()
            if (r1 != 0) goto L_0x02a1
            goto L_0x01ca
        L_0x01c0:
            java.util.List r3 = r5.getSecondaryOpeningHours()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x01ca:
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r1 = r4.zzx
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r3 = r5.getServesBeer()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r1 = r4.zzy
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r3 = r5.getServesBreakfast()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r1 = r4.zzz
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r3 = r5.getServesBrunch()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r1 = r4.zzA
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r3 = r5.getServesDinner()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r1 = r4.zzB
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r3 = r5.getServesLunch()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r1 = r4.zzC
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r3 = r5.getServesVegetarianFood()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r1 = r4.zzD
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r3 = r5.getServesWine()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r1 = r4.zzE
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r3 = r5.getTakeout()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
            java.util.List r1 = r4.zzF
            if (r1 != 0) goto L_0x0235
            java.util.List r1 = r5.getTypes()
            if (r1 != 0) goto L_0x02a1
            goto L_0x023f
        L_0x0235:
            java.util.List r3 = r5.getTypes()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x023f:
            java.lang.Integer r1 = r4.zzG
            if (r1 != 0) goto L_0x024a
            java.lang.Integer r1 = r5.getUserRatingsTotal()
            if (r1 != 0) goto L_0x02a1
            goto L_0x0254
        L_0x024a:
            java.lang.Integer r3 = r5.getUserRatingsTotal()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x0254:
            java.lang.Integer r1 = r4.zzH
            if (r1 != 0) goto L_0x025f
            java.lang.Integer r1 = r5.getUtcOffsetMinutes()
            if (r1 != 0) goto L_0x02a1
            goto L_0x0269
        L_0x025f:
            java.lang.Integer r3 = r5.getUtcOffsetMinutes()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x0269:
            com.google.android.gms.maps.model.LatLngBounds r1 = r4.zzI
            if (r1 != 0) goto L_0x0274
            com.google.android.gms.maps.model.LatLngBounds r1 = r5.getViewport()
            if (r1 != 0) goto L_0x02a1
            goto L_0x027e
        L_0x0274:
            com.google.android.gms.maps.model.LatLngBounds r3 = r5.getViewport()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a1
        L_0x027e:
            android.net.Uri r1 = r4.zzJ
            if (r1 != 0) goto L_0x0289
            android.net.Uri r1 = r5.getWebsiteUri()
            if (r1 != 0) goto L_0x02a1
            goto L_0x0294
        L_0x0289:
            android.net.Uri r3 = r5.getWebsiteUri()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0294
            goto L_0x02a1
        L_0x0294:
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r1 = r4.zzK
            com.google.android.libraries.places.api.model.Place$BooleanPlaceAttributeValue r5 = r5.getWheelchairAccessibleEntrance()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x02a1
            return r0
        L_0x02a1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzt.equals(java.lang.Object):boolean");
    }

    public String getAddress() {
        return this.zza;
    }

    public AddressComponents getAddressComponents() {
        return this.zzb;
    }

    public List<String> getAttributions() {
        return this.zzc;
    }

    public Place.BusinessStatus getBusinessStatus() {
        return this.zzd;
    }

    public Place.BooleanPlaceAttributeValue getCurbsidePickup() {
        return this.zze;
    }

    public OpeningHours getCurrentOpeningHours() {
        return this.zzf;
    }

    public Place.BooleanPlaceAttributeValue getDelivery() {
        return this.zzg;
    }

    public Place.BooleanPlaceAttributeValue getDineIn() {
        return this.zzh;
    }

    public String getEditorialSummary() {
        return this.zzi;
    }

    public String getEditorialSummaryLanguageCode() {
        return this.zzj;
    }

    public Integer getIconBackgroundColor() {
        return this.zzk;
    }

    public String getIconUrl() {
        return this.zzl;
    }

    public String getId() {
        return this.zzm;
    }

    public LatLng getLatLng() {
        return this.zzn;
    }

    public String getName() {
        return this.zzo;
    }

    public OpeningHours getOpeningHours() {
        return this.zzp;
    }

    public String getPhoneNumber() {
        return this.zzq;
    }

    public List<PhotoMetadata> getPhotoMetadatas() {
        return this.zzr;
    }

    public PlusCode getPlusCode() {
        return this.zzs;
    }

    public Integer getPriceLevel() {
        return this.zzt;
    }

    public Double getRating() {
        return this.zzu;
    }

    public Place.BooleanPlaceAttributeValue getReservable() {
        return this.zzv;
    }

    public List<OpeningHours> getSecondaryOpeningHours() {
        return this.zzw;
    }

    public Place.BooleanPlaceAttributeValue getServesBeer() {
        return this.zzx;
    }

    public Place.BooleanPlaceAttributeValue getServesBreakfast() {
        return this.zzy;
    }

    public Place.BooleanPlaceAttributeValue getServesBrunch() {
        return this.zzz;
    }

    public Place.BooleanPlaceAttributeValue getServesDinner() {
        return this.zzA;
    }

    public Place.BooleanPlaceAttributeValue getServesLunch() {
        return this.zzB;
    }

    public Place.BooleanPlaceAttributeValue getServesVegetarianFood() {
        return this.zzC;
    }

    public Place.BooleanPlaceAttributeValue getServesWine() {
        return this.zzD;
    }

    public Place.BooleanPlaceAttributeValue getTakeout() {
        return this.zzE;
    }

    public List<Place.Type> getTypes() {
        return this.zzF;
    }

    public Integer getUserRatingsTotal() {
        return this.zzG;
    }

    public Integer getUtcOffsetMinutes() {
        return this.zzH;
    }

    public LatLngBounds getViewport() {
        return this.zzI;
    }

    public Uri getWebsiteUri() {
        return this.zzJ;
    }

    public Place.BooleanPlaceAttributeValue getWheelchairAccessibleEntrance() {
        return this.zzK;
    }

    public final int hashCode() {
        String str = this.zza;
        int i10 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        AddressComponents addressComponents = this.zzb;
        int hashCode2 = addressComponents == null ? 0 : addressComponents.hashCode();
        int i11 = hashCode ^ 1000003;
        List list = this.zzc;
        int hashCode3 = ((((i11 * 1000003) ^ hashCode2) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        Place.BusinessStatus businessStatus = this.zzd;
        int hashCode4 = (((hashCode3 ^ (businessStatus == null ? 0 : businessStatus.hashCode())) * 1000003) ^ this.zze.hashCode()) * 1000003;
        OpeningHours openingHours = this.zzf;
        int hashCode5 = (((((hashCode4 ^ (openingHours == null ? 0 : openingHours.hashCode())) * 1000003) ^ this.zzg.hashCode()) * 1000003) ^ this.zzh.hashCode()) * 1000003;
        String str2 = this.zzi;
        int hashCode6 = (hashCode5 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.zzj;
        int hashCode7 = (hashCode6 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Integer num = this.zzk;
        int hashCode8 = (hashCode7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str4 = this.zzl;
        int hashCode9 = (hashCode8 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.zzm;
        int hashCode10 = (hashCode9 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        LatLng latLng = this.zzn;
        int hashCode11 = (hashCode10 ^ (latLng == null ? 0 : latLng.hashCode())) * 1000003;
        String str6 = this.zzo;
        int hashCode12 = (hashCode11 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        OpeningHours openingHours2 = this.zzp;
        int hashCode13 = (hashCode12 ^ (openingHours2 == null ? 0 : openingHours2.hashCode())) * 1000003;
        String str7 = this.zzq;
        int hashCode14 = (hashCode13 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        List list2 = this.zzr;
        int hashCode15 = (hashCode14 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PlusCode plusCode = this.zzs;
        int hashCode16 = (hashCode15 ^ (plusCode == null ? 0 : plusCode.hashCode())) * 1000003;
        Integer num2 = this.zzt;
        int hashCode17 = (hashCode16 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Double d10 = this.zzu;
        int hashCode18 = (((hashCode17 ^ (d10 == null ? 0 : d10.hashCode())) * 1000003) ^ this.zzv.hashCode()) * 1000003;
        List list3 = this.zzw;
        int hashCode19 = (((((((((((((((((hashCode18 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003) ^ this.zzx.hashCode()) * 1000003) ^ this.zzy.hashCode()) * 1000003) ^ this.zzz.hashCode()) * 1000003) ^ this.zzA.hashCode()) * 1000003) ^ this.zzB.hashCode()) * 1000003) ^ this.zzC.hashCode()) * 1000003) ^ this.zzD.hashCode()) * 1000003) ^ this.zzE.hashCode()) * 1000003;
        List list4 = this.zzF;
        int hashCode20 = (hashCode19 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
        Integer num3 = this.zzG;
        int hashCode21 = (hashCode20 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Integer num4 = this.zzH;
        int hashCode22 = (hashCode21 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
        LatLngBounds latLngBounds = this.zzI;
        int hashCode23 = (hashCode22 ^ (latLngBounds == null ? 0 : latLngBounds.hashCode())) * 1000003;
        Uri uri = this.zzJ;
        if (uri != null) {
            i10 = uri.hashCode();
        }
        return ((hashCode23 ^ i10) * 1000003) ^ this.zzK.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        String valueOf3 = String.valueOf(this.zzd);
        String obj = this.zze.toString();
        String valueOf4 = String.valueOf(this.zzf);
        String obj2 = this.zzg.toString();
        String obj3 = this.zzh.toString();
        String str2 = this.zzi;
        String str3 = this.zzj;
        Integer num = this.zzk;
        String str4 = this.zzl;
        String str5 = this.zzm;
        String valueOf5 = String.valueOf(this.zzn);
        String str6 = this.zzo;
        String valueOf6 = String.valueOf(this.zzp);
        String str7 = this.zzq;
        String valueOf7 = String.valueOf(this.zzr);
        String valueOf8 = String.valueOf(this.zzs);
        Integer num2 = this.zzt;
        Double d10 = this.zzu;
        String obj4 = this.zzv.toString();
        String valueOf9 = String.valueOf(this.zzw);
        String obj5 = this.zzx.toString();
        String obj6 = this.zzy.toString();
        String obj7 = this.zzz.toString();
        String obj8 = this.zzA.toString();
        String obj9 = this.zzB.toString();
        String obj10 = this.zzC.toString();
        String obj11 = this.zzD.toString();
        String obj12 = this.zzE.toString();
        String valueOf10 = String.valueOf(this.zzF);
        Integer num3 = this.zzG;
        Integer num4 = this.zzH;
        String valueOf11 = String.valueOf(this.zzI);
        String valueOf12 = String.valueOf(this.zzJ);
        String obj13 = this.zzK.toString();
        return "Place{address=" + str + ", addressComponents=" + valueOf + ", attributions=" + valueOf2 + ", businessStatus=" + valueOf3 + ", curbsidePickup=" + obj + ", currentOpeningHours=" + valueOf4 + ", delivery=" + obj2 + ", dineIn=" + obj3 + ", editorialSummary=" + str2 + ", editorialSummaryLanguageCode=" + str3 + ", iconBackgroundColor=" + num + ", iconUrl=" + str4 + ", id=" + str5 + ", latLng=" + valueOf5 + ", name=" + str6 + ", openingHours=" + valueOf6 + ", phoneNumber=" + str7 + ", photoMetadatas=" + valueOf7 + ", plusCode=" + valueOf8 + ", priceLevel=" + num2 + ", rating=" + d10 + ", reservable=" + obj4 + ", secondaryOpeningHours=" + valueOf9 + ", servesBeer=" + obj5 + ", servesBreakfast=" + obj6 + ", servesBrunch=" + obj7 + ", servesDinner=" + obj8 + ", servesLunch=" + obj9 + ", servesVegetarianFood=" + obj10 + ", servesWine=" + obj11 + ", takeout=" + obj12 + ", types=" + valueOf10 + ", userRatingsTotal=" + num3 + ", utcOffsetMinutes=" + num4 + ", viewport=" + valueOf11 + ", websiteUri=" + valueOf12 + ", wheelchairAccessibleEntrance=" + obj13 + "}";
    }
}
