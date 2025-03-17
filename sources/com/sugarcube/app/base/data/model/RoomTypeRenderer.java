package com.sugarcube.app.base.data.model;

import HJ.C15854t;
import OE.C13316h;
import OE.n;
import XH.t;
import YH.C16877v;
import android.content.res.Resources;
import com.sugarcube.core.network.models.RoomType;
import fI.C17220a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uK.C18148c;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t*\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\n\u0010\f\u001a\u00020\u0005*\u00020\u0006J\n\u0010\r\u001a\u00020\u0005*\u00020\u0006J\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010*\u00020\u0011J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\tJ\n\u0010\u0015\u001a\u00020\u0006*\u00020\tR\u000e\u0010\u000e\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/sugarcube/app/base/data/model/RoomTypeRenderer;", "", "<init>", "()V", "getTitleRes", "", "Lcom/sugarcube/core/network/models/RoomType;", "(Lcom/sugarcube/core/network/models/RoomType;)Ljava/lang/Integer;", "getTitle", "", "resources", "Landroid/content/res/Resources;", "getThumbnailResId", "getIconResId", "DEFAULT_ROOM_NAME", "getAllValidRoomTypes", "", "Lcom/sugarcube/core/network/models/RoomType$Companion;", "getTypeFromTerm", "term", "getRoom", "toRoomType", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RoomTypeRenderer {
    public static final int $stable = 0;
    private static final String DEFAULT_ROOM_NAME = "Room";
    public static final RoomTypeRenderer INSTANCE = new RoomTypeRenderer();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(2:17|18)|19|21) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.sugarcube.core.network.models.RoomType[] r0 = com.sugarcube.core.network.models.RoomType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.sugarcube.core.network.models.RoomType r1 = com.sugarcube.core.network.models.RoomType.LIVING_ROOM     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.sugarcube.core.network.models.RoomType r1 = com.sugarcube.core.network.models.RoomType.OFFICE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.sugarcube.core.network.models.RoomType r1 = com.sugarcube.core.network.models.RoomType.HALLWAY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.sugarcube.core.network.models.RoomType r1 = com.sugarcube.core.network.models.RoomType.DINING_ROOM     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.sugarcube.core.network.models.RoomType r1 = com.sugarcube.core.network.models.RoomType.KITCHEN     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.sugarcube.core.network.models.RoomType r1 = com.sugarcube.core.network.models.RoomType.BEDROOM     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.sugarcube.core.network.models.RoomType r1 = com.sugarcube.core.network.models.RoomType.FAMILY_ROOM     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                com.sugarcube.core.network.models.RoomType r1 = com.sugarcube.core.network.models.RoomType.OTHER     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                com.sugarcube.core.network.models.RoomType r1 = com.sugarcube.core.network.models.RoomType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.model.RoomTypeRenderer.WhenMappings.<clinit>():void");
        }
    }

    private RoomTypeRenderer() {
    }

    private final RoomType getTypeFromTerm(Resources resources, String str) {
        T t10;
        Iterator<T> it = RoomType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (C17542s.e(INSTANCE.getTitle((RoomType) t10, resources), str)) {
                break;
            }
        }
        RoomType roomType = (RoomType) t10;
        if (roomType == null || roomType == RoomType.UNKNOWN) {
            return null;
        }
        return roomType;
    }

    public final List<RoomType> getAllValidRoomTypes(RoomType.Companion companion) {
        C17542s.j(companion, "<this>");
        C17220a<RoomType> entries = RoomType.getEntries();
        ArrayList arrayList = new ArrayList();
        for (T next : entries) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[((RoomType) next).ordinal()];
            if (!(i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9)) {
                arrayList.add(next);
            }
        }
        return C16877v.t1(arrayList);
    }

    public final int getIconResId(RoomType roomType) {
        Integer num;
        C17542s.j(roomType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[roomType.ordinal()]) {
            case 1:
                num = Integer.valueOf(C18148c.Sofa.m());
                break;
            case 2:
                num = Integer.valueOf(C18148c.Laptop.m());
                break;
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
                num = null;
                break;
            case 4:
                num = Integer.valueOf(C18148c.Cutlery.m());
                break;
            case 6:
                num = Integer.valueOf(C18148c.Bed.m());
                break;
            default:
                throw new t();
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final RoomType getRoom(Resources resources, String str) {
        C17542s.j(resources, "resources");
        C17542s.j(str, "term");
        RoomType typeFromTerm = getTypeFromTerm(resources, str);
        if (typeFromTerm != null) {
            return typeFromTerm;
        }
        RoomType.Companion companion = RoomType.Companion;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C17542s.i(lowerCase, "toLowerCase(...)");
        return companion.getTypeFromKey(C15854t.P(lowerCase, ' ', '_', false, 4, (Object) null));
    }

    public final int getThumbnailResId(RoomType roomType) {
        Integer num;
        C17542s.j(roomType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[roomType.ordinal()]) {
            case 1:
                num = Integer.valueOf(C13316h.f112830L);
                break;
            case 2:
                num = Integer.valueOf(C13316h.f112829K);
                break;
            case 3:
                num = Integer.valueOf(C13316h.f112842X);
                break;
            case 4:
                num = Integer.valueOf(C13316h.f112828J);
                break;
            case 5:
                num = Integer.valueOf(C13316h.f112843Y);
                break;
            case 6:
                num = Integer.valueOf(C13316h.f112827I);
                break;
            case 7:
                num = Integer.valueOf(C13316h.f112841W);
                break;
            case 8:
                num = Integer.valueOf(C13316h.f112831M);
                break;
            case 9:
                num = null;
                break;
            default:
                throw new t();
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r2 = r3.getString(r2.intValue());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getTitle(com.sugarcube.core.network.models.RoomType r2, android.content.res.Resources r3) {
        /*
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "resources"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.Integer r2 = r1.getTitleRes(r2)
            if (r2 == 0) goto L_0x001a
            int r2 = r2.intValue()
            java.lang.String r2 = r3.getString(r2)
            if (r2 != 0) goto L_0x001c
        L_0x001a:
            java.lang.String r2 = "Room"
        L_0x001c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.model.RoomTypeRenderer.getTitle(com.sugarcube.core.network.models.RoomType, android.content.res.Resources):java.lang.String");
    }

    public final Integer getTitleRes(RoomType roomType) {
        C17542s.j(roomType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[roomType.ordinal()]) {
            case 1:
                return Integer.valueOf(n.f113353e1);
            case 2:
                return Integer.valueOf(n.f113346d1);
            case 3:
                return Integer.valueOf(n.f113216I0);
            case 4:
                return Integer.valueOf(n.f113339c1);
            case 5:
                return Integer.valueOf(n.f113234L0);
            case 6:
                return Integer.valueOf(n.f113332b1);
            case 7:
                return Integer.valueOf(n.f113192E0);
            case 8:
                return Integer.valueOf(n.f113360f1);
            case 9:
                return null;
            default:
                throw new t();
        }
    }

    public final RoomType toRoomType(String str) {
        T t10;
        C17542s.j(str, "<this>");
        Iterator<T> it = RoomType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            String apiKey = ((RoomType) t10).getApiKey();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C17542s.i(lowerCase, "toLowerCase(...)");
            if (C17542s.e(apiKey, lowerCase)) {
                break;
            }
        }
        RoomType roomType = (RoomType) t10;
        return roomType == null ? RoomType.UNKNOWN : roomType;
    }
}
