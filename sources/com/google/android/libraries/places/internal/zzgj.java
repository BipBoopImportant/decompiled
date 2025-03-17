package com.google.android.libraries.places.internal;

final class zzgj {
    private zza[] addressComponents;
    private String businessStatus;
    private Boolean curbsidePickup;
    private zzd currentOpeningHours;
    private Boolean delivery;
    private Boolean dineIn;
    private zzb editorialSummary;
    private String formattedAddress;
    private zzc geometry;
    private String icon;
    private String iconBackgroundColor;
    private String iconMaskBaseUri;
    private String internationalPhoneNumber;
    private String name;
    private zzd openingHours;
    private zze[] photos;
    private String placeId;
    private zzf plusCode;
    private Integer priceLevel;
    private Double rating;
    private Boolean reservable;
    private zzd[] secondaryOpeningHours;
    private Boolean servesBeer;
    private Boolean servesBreakfast;
    private Boolean servesBrunch;
    private Boolean servesDinner;
    private Boolean servesLunch;
    private Boolean servesVegetarianFood;
    private Boolean servesWine;
    private Boolean takeout;
    private String[] types;
    private Integer userRatingsTotal;
    private Integer utcOffset;
    private String website;
    private Boolean wheelchairAccessibleEntrance;

    class zza {
        private String longName;
        private String shortName;
        private String[] types;

        zza() {
        }

        /* access modifiers changed from: package-private */
        public final zzkh zza() {
            String[] strArr = this.types;
            if (strArr != null) {
                return zzkh.zzk(strArr);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public final String zzb() {
            return this.longName;
        }

        /* access modifiers changed from: package-private */
        public final String zzc() {
            return this.shortName;
        }
    }

    class zzb {
        private String language;
        private String overview;

        zzb() {
        }

        /* access modifiers changed from: package-private */
        public final String zza() {
            return this.language;
        }

        /* access modifiers changed from: package-private */
        public final String zzb() {
            return this.overview;
        }
    }

    class zzc {
        private zza location;
        private zzb viewport;

        class zza {
            private Double lat;
            private Double lng;

            zza() {
            }

            /* access modifiers changed from: package-private */
            public final Double zza() {
                return this.lat;
            }

            /* access modifiers changed from: package-private */
            public final Double zzb() {
                return this.lng;
            }
        }

        class zzb {
            private zza northeast;
            private zza southwest;

            zzb() {
            }

            /* access modifiers changed from: package-private */
            public final zza zza() {
                return this.northeast;
            }

            /* access modifiers changed from: package-private */
            public final zza zzb() {
                return this.southwest;
            }
        }

        zzc() {
        }

        /* access modifiers changed from: package-private */
        public final zza zza() {
            return this.location;
        }

        /* access modifiers changed from: package-private */
        public final zzb zzb() {
            return this.viewport;
        }
    }

    class zzd {
        private zza[] periods;
        private zzb[] specialDays;
        private String type;
        private String[] weekdayText;

        class zza {
            private zzc close;
            private zzc open;

            zza() {
            }

            /* access modifiers changed from: package-private */
            public final zzc zza() {
                return this.close;
            }

            /* access modifiers changed from: package-private */
            public final zzc zzb() {
                return this.open;
            }
        }

        class zzb {
            private String date;
            private Boolean exceptionalHours;

            zzb() {
            }

            /* access modifiers changed from: package-private */
            public final Boolean zza() {
                return this.exceptionalHours;
            }

            /* access modifiers changed from: package-private */
            public final String zzb() {
                return this.date;
            }
        }

        class zzc {
            private String date;
            private Integer day;
            private String time;
            private Boolean truncated;

            zzc() {
            }

            /* access modifiers changed from: package-private */
            public final Boolean zza() {
                return this.truncated;
            }

            /* access modifiers changed from: package-private */
            public final Integer zzb() {
                return this.day;
            }

            /* access modifiers changed from: package-private */
            public final String zzc() {
                return this.date;
            }

            /* access modifiers changed from: package-private */
            public final String zzd() {
                return this.time;
            }
        }

        zzd() {
        }

        /* access modifiers changed from: package-private */
        public final zzkh zza() {
            zza[] zzaArr = this.periods;
            if (zzaArr != null) {
                return zzkh.zzk(zzaArr);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public final zzkh zzb() {
            zzb[] zzbArr = this.specialDays;
            if (zzbArr != null) {
                return zzkh.zzk(zzbArr);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public final zzkh zzc() {
            String[] strArr = this.weekdayText;
            if (strArr != null) {
                return zzkh.zzk(strArr);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public final String zzd() {
            return this.type;
        }
    }

    class zze {
        private Integer height;
        private String[] htmlAttributions;
        private String photoReference;
        private Integer width;

        zze() {
        }

        /* access modifiers changed from: package-private */
        public final zzkh zza() {
            String[] strArr = this.htmlAttributions;
            if (strArr != null) {
                return zzkh.zzk(strArr);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public final Integer zzb() {
            return this.height;
        }

        /* access modifiers changed from: package-private */
        public final Integer zzc() {
            return this.width;
        }

        /* access modifiers changed from: package-private */
        public final String zzd() {
            return this.photoReference;
        }
    }

    class zzf {
        private String compoundCode;
        private String globalCode;

        zzf() {
        }

        /* access modifiers changed from: package-private */
        public final String zza() {
            return this.compoundCode;
        }

        /* access modifiers changed from: package-private */
        public final String zzb() {
            return this.globalCode;
        }
    }

    zzgj() {
    }

    /* access modifiers changed from: package-private */
    public final String zzA() {
        return this.formattedAddress;
    }

    /* access modifiers changed from: package-private */
    public final String zzB() {
        return this.iconBackgroundColor;
    }

    /* access modifiers changed from: package-private */
    public final String zzC() {
        return this.iconMaskBaseUri;
    }

    /* access modifiers changed from: package-private */
    public final String zzD() {
        return this.internationalPhoneNumber;
    }

    /* access modifiers changed from: package-private */
    public final String zzE() {
        return this.name;
    }

    /* access modifiers changed from: package-private */
    public final String zzF() {
        return this.placeId;
    }

    /* access modifiers changed from: package-private */
    public final String zzG() {
        return this.website;
    }

    /* access modifiers changed from: package-private */
    public final zzb zza() {
        return this.editorialSummary;
    }

    /* access modifiers changed from: package-private */
    public final zzc zzb() {
        return this.geometry;
    }

    /* access modifiers changed from: package-private */
    public final zzd zzc() {
        return this.currentOpeningHours;
    }

    /* access modifiers changed from: package-private */
    public final zzd zzd() {
        return this.openingHours;
    }

    /* access modifiers changed from: package-private */
    public final zzf zze() {
        return this.plusCode;
    }

    /* access modifiers changed from: package-private */
    public final zzkh zzf() {
        zza[] zzaArr = this.addressComponents;
        if (zzaArr != null) {
            return zzkh.zzk(zzaArr);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final zzkh zzg() {
        zze[] zzeArr = this.photos;
        if (zzeArr != null) {
            return zzkh.zzk(zzeArr);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final zzkh zzh() {
        zzd[] zzdArr = this.secondaryOpeningHours;
        if (zzdArr != null) {
            return zzkh.zzk(zzdArr);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final zzkh zzi() {
        String[] strArr = this.types;
        if (strArr != null) {
            return zzkh.zzk(strArr);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Boolean zzj() {
        return this.curbsidePickup;
    }

    /* access modifiers changed from: package-private */
    public final Boolean zzk() {
        return this.delivery;
    }

    /* access modifiers changed from: package-private */
    public final Boolean zzl() {
        return this.dineIn;
    }

    /* access modifiers changed from: package-private */
    public final Boolean zzm() {
        return this.reservable;
    }

    /* access modifiers changed from: package-private */
    public final Boolean zzn() {
        return this.servesBeer;
    }

    /* access modifiers changed from: package-private */
    public final Boolean zzo() {
        return this.servesBreakfast;
    }

    /* access modifiers changed from: package-private */
    public final Boolean zzp() {
        return this.servesDinner;
    }

    /* access modifiers changed from: package-private */
    public final Boolean zzq() {
        return this.servesLunch;
    }

    /* access modifiers changed from: package-private */
    public final Boolean zzr() {
        return this.servesVegetarianFood;
    }

    /* access modifiers changed from: package-private */
    public final Boolean zzs() {
        return this.servesWine;
    }

    /* access modifiers changed from: package-private */
    public final Boolean zzt() {
        return this.takeout;
    }

    /* access modifiers changed from: package-private */
    public final Boolean zzu() {
        return this.wheelchairAccessibleEntrance;
    }

    /* access modifiers changed from: package-private */
    public final Double zzv() {
        return this.rating;
    }

    /* access modifiers changed from: package-private */
    public final Integer zzw() {
        return this.priceLevel;
    }

    /* access modifiers changed from: package-private */
    public final Integer zzx() {
        return this.userRatingsTotal;
    }

    /* access modifiers changed from: package-private */
    public final Integer zzy() {
        return this.utcOffset;
    }

    /* access modifiers changed from: package-private */
    public final String zzz() {
        return this.businessStatus;
    }
}
