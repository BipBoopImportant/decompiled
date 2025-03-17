package Hd;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.ikea.kompassmap.model.store.map.IconMapping;
import kotlin.Metadata;
import uK.C18148c;
import yd.C10439J;
import yd.C10446Q;
import yd.C10451e;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LHd/m;", "", "<init>", "()V", "", "Lcom/ikea/kompassmap/model/store/map/IconMapping;", "b", "[Lcom/ikea/kompassmap/model/store/map/IconMapping;", "a", "()[Lcom/ikea/kompassmap/model/store/map/IconMapping;", "departmentIconsDefinition", "c", "unknownIconsDefinition", "d", "poisIconsDefinition", "Lyd/J;", "e", "[Lyd/J;", "getImportantPOIs", "()[Lyd/J;", "importantPOIs", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f60810a = new m();

    /* renamed from: b  reason: collision with root package name */
    private static final IconMapping[] f60811b;

    /* renamed from: c  reason: collision with root package name */
    private static final IconMapping[] f60812c;

    /* renamed from: d  reason: collision with root package name */
    private static final IconMapping[] f60813d;

    /* renamed from: e  reason: collision with root package name */
    private static final C10439J[] f60814e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f60815f = 8;

    static {
        IconMapping iconMapping = r0;
        IconMapping iconMapping2 = new IconMapping("HOME_ORGANISATION", C10451e.HOME_ORGANISATION.b(), "archive-box", C18148c.ArchiveBox);
        IconMapping iconMapping3 = r0;
        IconMapping iconMapping4 = new IconMapping("LIGHTING", C10451e.LIGHTING.b(), "light-rays", C18148c.LightbulbWithRays);
        IconMapping iconMapping5 = r0;
        IconMapping iconMapping6 = new IconMapping("DINNERWARE_AND_SERVING", C10451e.DINNERWARE_AND_SERVING.b(), "pot-with-lid", C18148c.PotWithLid);
        IconMapping iconMapping7 = r0;
        IconMapping iconMapping8 = new IconMapping("DECORATION", C10451e.DECORATION.b(), "vase", C18148c.Vase);
        IconMapping iconMapping9 = r0;
        IconMapping iconMapping10 = new IconMapping("BATH", C10451e.BATH.b(), "shower", C18148c.Shower);
        IconMapping iconMapping11 = r0;
        IconMapping iconMapping12 = new IconMapping("RUGS", C10451e.RUGS.b(), "rug", C18148c.Rug);
        IconMapping iconMapping13 = r0;
        IconMapping iconMapping14 = new IconMapping("HOME_TEXTILE", C10451e.HOME_TEXTILE.b(), "curtains", C18148c.Curtains);
        IconMapping iconMapping15 = r0;
        IconMapping iconMapping16 = new IconMapping("BED_TEXTILE", C10451e.BED_TEXTILE.b(), "pillow", C18148c.Pillow);
        IconMapping iconMapping17 = r0;
        IconMapping iconMapping18 = new IconMapping("LIVING_ROOM", C10451e.LIVING_ROOM.b(), "sofa", C18148c.Sofa);
        IconMapping iconMapping19 = r0;
        IconMapping iconMapping20 = new IconMapping("DINING", C10451e.DINING.b(), "chair", C18148c.Chair);
        IconMapping iconMapping21 = r0;
        IconMapping iconMapping22 = new IconMapping("KITCHEN", C10451e.KITCHEN.b(), "kitchen", C18148c.Kitchen);
        IconMapping iconMapping23 = r0;
        IconMapping iconMapping24 = new IconMapping("WORKSPACES", C10451e.WORKSPACES.b(), "office-chair", C18148c.OfficeChair);
        IconMapping iconMapping25 = r0;
        IconMapping iconMapping26 = new IconMapping("BEDROOM", C10451e.BEDROOM.b(), "bed", C18148c.Bed);
        IconMapping iconMapping27 = r0;
        IconMapping iconMapping28 = new IconMapping("CHILDREN", C10451e.CHILDREN.b(), "kick-scooter", C18148c.KickScooter);
        IconMapping iconMapping29 = r0;
        IconMapping iconMapping30 = new IconMapping("GLASSHOUSE", C10451e.GLASSHOUSE.b(), "plant-in-pot", C18148c.PlantInPot);
        IconMapping iconMapping31 = r0;
        IconMapping iconMapping32 = new IconMapping("LIVING_ROOM_STORAGE", C10451e.LIVING_ROOM_STORAGE.b(), "bookcase", C18148c.Bookcase);
        IconMapping iconMapping33 = r0;
        String b10 = C10451e.SWEDISH_FOOD_MARKET.b();
        C18148c cVar = C18148c.Seafood;
        IconMapping iconMapping34 = new IconMapping("SWEDISH_FOOD_MARKET", b10, "seafood", cVar);
        IconMapping iconMapping35 = r0;
        C18148c cVar2 = cVar;
        IconMapping iconMapping36 = new IconMapping("DIV_SELF_SERVE", C10451e.DIV_SELF_SERVE.b(), "furniture-trolley-loaded", C18148c.FurnitureTrolleyLoaded);
        IconMapping iconMapping37 = r0;
        IconMapping iconMapping38 = new IconMapping("DIV_MARKETHALL", C10451e.DIV_MARKETHALL.b(), "shopping-trolley", C18148c.ShoppingTrolley);
        IconMapping iconMapping39 = r0;
        IconMapping iconMapping40 = new IconMapping("DIV_SHOWROOM", C10451e.DIV_SHOWROOM.b(), "shopping-bag", C18148c.ShoppingBag);
        f60811b = new IconMapping[]{iconMapping, iconMapping3, iconMapping5, iconMapping7, iconMapping9, iconMapping11, iconMapping13, iconMapping15, iconMapping17, iconMapping19, iconMapping21, iconMapping23, iconMapping25, iconMapping27, iconMapping29, iconMapping31, iconMapping33, iconMapping35, iconMapping37, iconMapping39};
        String b11 = C10446Q.UNKNOWN_DEPARTMENT.b();
        C18148c cVar3 = C18148c.LocationPin;
        f60812c = new IconMapping[]{new IconMapping("UNKNOWN_DEPARTMENT", b11, "location-pin", cVar3), new IconMapping("UNKNOWN_POI", C10446Q.UNKNOWN_POI.b(), "location-pin", cVar3)};
        IconMapping iconMapping41 = r1;
        C10439J j10 = C10439J.POI_SUBTYPE_ESCALATOR;
        IconMapping iconMapping42 = new IconMapping(j10.b(), j10.b(), "escalator", C18148c.EscalatorUpDown);
        IconMapping iconMapping43 = r1;
        C10439J j11 = C10439J.POI_SUBTYPE_ESCALATOR_UP;
        IconMapping iconMapping44 = new IconMapping(j11.b(), j11.b(), "escalator-up", C18148c.EscalatorUp);
        IconMapping iconMapping45 = r1;
        C10439J j12 = C10439J.POI_SUBTYPE_ESCALATOR_DOWN;
        IconMapping iconMapping46 = new IconMapping(j12.b(), j12.b(), "escalator-down", C18148c.EscalatorDown);
        IconMapping iconMapping47 = r1;
        C10439J j13 = C10439J.POI_SUBTYPE_LIFT;
        IconMapping iconMapping48 = new IconMapping(j13.b(), j13.b(), "elevator", C18148c.LiftUpDown);
        IconMapping iconMapping49 = r1;
        C10439J j14 = C10439J.POI_SUBTYPE_LIFT_UP;
        IconMapping iconMapping50 = new IconMapping(j14.b(), j14.b(), "elevator-up", C18148c.LiftUp);
        IconMapping iconMapping51 = r1;
        C10439J j15 = C10439J.POI_SUBTYPE_LIFT_DOWN;
        IconMapping iconMapping52 = new IconMapping(j15.b(), j15.b(), "elevator-down", C18148c.LiftDown);
        IconMapping iconMapping53 = r1;
        C10439J j16 = C10439J.POI_SUBTYPE_RESTROOM;
        IconMapping iconMapping54 = new IconMapping(j16.b(), j16.b(), "restroom", C18148c.Restroom);
        IconMapping iconMapping55 = r1;
        C10439J j17 = C10439J.POI_SUBTYPE_RESTROOM_WITH_CHANGING_TABLE;
        IconMapping iconMapping56 = new IconMapping(j17.b(), j17.b(), "restroom-baby-care", C18148c.RestroomBabyCare);
        IconMapping iconMapping57 = r1;
        C10439J j18 = C10439J.POI_SUBTYPE_RESTROOM_MAN;
        IconMapping iconMapping58 = new IconMapping(j18.b(), j18.b(), "restroom-man", C18148c.RestroomMan);
        IconMapping iconMapping59 = r1;
        C10439J j19 = C10439J.POI_SUBTYPE_RESTROOM_WOMAN;
        IconMapping iconMapping60 = new IconMapping(j19.b(), j19.b(), "restroom-woman", C18148c.RestroomWoman);
        IconMapping iconMapping61 = r1;
        C10439J j20 = C10439J.POI_SUBTYPE_RESTAURANT_AND_CAFE;
        IconMapping iconMapping62 = new IconMapping(j20.b(), j20.b(), "cutlery", C18148c.Cutlery);
        IconMapping iconMapping63 = r1;
        C10439J j21 = C10439J.POI_SUBTYPE_BISTRO;
        IconMapping iconMapping64 = new IconMapping(j21.b(), j21.b(), "hotdog", C18148c.HotDog);
        IconMapping iconMapping65 = r1;
        C10439J j22 = C10439J.POI_SUBTYPE_EXCHANGES_AND_RETURNS;
        IconMapping iconMapping66 = new IconMapping(j22.b(), j22.b(), "returns", C18148c.Returns);
        IconMapping iconMapping67 = r1;
        C10439J j23 = C10439J.POI_SUBTYPE_CHECK_OUT;
        String b12 = j23.b();
        String b13 = j23.b();
        C18148c cVar4 = C18148c.CreditCard;
        IconMapping iconMapping68 = new IconMapping(b12, b13, "card", cVar4);
        IconMapping iconMapping69 = r1;
        C10439J j24 = C10439J.POI_SUBTYPE_EXIT;
        IconMapping iconMapping70 = new IconMapping(j24.b(), j24.b(), "arrow-left", C18148c.ArrowLeft);
        IconMapping iconMapping71 = r1;
        C10439J j25 = C10439J.POI_SUBTYPE_CUSTOMER_SERVICE;
        IconMapping iconMapping72 = new IconMapping(j25.b(), j25.b(), "co-worker", C18148c.CoWorker);
        IconMapping iconMapping73 = r1;
        C10439J j26 = C10439J.POI_SUBTYPE_SHOPPING_TROLLEY;
        String b14 = j26.b();
        String b15 = j26.b();
        C18148c cVar5 = C18148c.FurnitureTrolley;
        IconMapping iconMapping74 = new IconMapping(b14, b15, "furniture-trolley", cVar5);
        IconMapping iconMapping75 = r1;
        C10439J j27 = C10439J.POI_SUBTYPE_FURNITURE_TROLLEY;
        IconMapping iconMapping76 = new IconMapping(j27.b(), j27.b(), "furniture-trolley", cVar5);
        IconMapping iconMapping77 = r1;
        C10439J j28 = C10439J.POI_SUBTYPE_STAIRS;
        IconMapping iconMapping78 = new IconMapping(j28.b(), j28.b(), "stairs", C18148c.Stairs);
        IconMapping iconMapping79 = r1;
        C10439J j29 = C10439J.POI_SUBTYPE_LOCKERS;
        IconMapping iconMapping80 = new IconMapping(j29.b(), j29.b(), "lockers", C18148c.Lockers);
        IconMapping iconMapping81 = r1;
        C10439J j30 = C10439J.POI_SUBTYPE_CAFE;
        IconMapping iconMapping82 = new IconMapping(j30.b(), j30.b(), "cup", C18148c.Cup);
        IconMapping iconMapping83 = r1;
        C10439J j31 = C10439J.POI_SUBTYPE_NURSING_ROOM;
        IconMapping iconMapping84 = new IconMapping(j31.b(), j31.b(), "nursing", C18148c.Nursing);
        IconMapping iconMapping85 = r1;
        C10439J j32 = C10439J.POI_SUBTYPE_BABY_STROLLER;
        IconMapping iconMapping86 = new IconMapping(j32.b(), j32.b(), "baby-stroller", C18148c.BabyStroller);
        IconMapping iconMapping87 = r1;
        C10439J j33 = C10439J.POI_SUBTYPE_KIOSK_OR_DISPLAY;
        IconMapping iconMapping88 = new IconMapping(j33.b(), j33.b(), "touchscreen", C18148c.Touchscreen);
        IconMapping iconMapping89 = r1;
        C10439J j34 = C10439J.POI_SUBTYPE_ATM;
        IconMapping iconMapping90 = new IconMapping(j34.b(), j34.b(), PlaceTypes.ATM, C18148c.Atm);
        IconMapping iconMapping91 = r1;
        C10439J j35 = C10439J.POI_SUBTYPE_INFORMATION;
        IconMapping iconMapping92 = new IconMapping(j35.b(), j35.b(), "information-circle", C18148c.InformationCircle);
        IconMapping iconMapping93 = r1;
        C10439J j36 = C10439J.POI_SUBTYPE_IKEA_FAMILY;
        IconMapping iconMapping94 = new IconMapping(j36.b(), j36.b(), "membership-card", C18148c.MembershipCard);
        IconMapping iconMapping95 = r1;
        C10439J j37 = C10439J.POI_SUBTYPE_PLANNING_AND_CONSULTATION;
        IconMapping iconMapping96 = new IconMapping(j37.b(), j37.b(), "pencil", C18148c.Pencil);
        IconMapping iconMapping97 = r1;
        C10439J j38 = C10439J.POI_SUBTYPE_DELIVERY_SERVICES;
        IconMapping iconMapping98 = new IconMapping(j38.b(), j38.b(), "delivery-truck", C18148c.DeliveryTruck);
        IconMapping iconMapping99 = r1;
        C10439J j39 = C10439J.POI_SUBTYPE_SPARE_PARTS;
        IconMapping iconMapping100 = new IconMapping(j39.b(), j39.b(), "screw", C18148c.Screw);
        IconMapping iconMapping101 = r1;
        C10439J j40 = C10439J.POI_SUBTYPE_RECYCLE_STATION;
        IconMapping iconMapping102 = new IconMapping(j40.b(), j40.b(), "recycle", C18148c.Recycle);
        IconMapping iconMapping103 = r1;
        C10439J j41 = C10439J.POI_SUBTYPE_ENTRANCE;
        IconMapping iconMapping104 = new IconMapping(j41.b(), j41.b(), "arrow-right", C18148c.ArrowRight);
        IconMapping iconMapping105 = r1;
        C10439J j42 = C10439J.POI_SUBTYPE_SHOWROOM_ENTRANCE;
        String b16 = j42.b();
        String b17 = j42.b();
        C18148c cVar6 = C18148c.ArrowRightToBase;
        IconMapping iconMapping106 = new IconMapping(b16, b17, "arrow-right-to-base", cVar6);
        IconMapping iconMapping107 = r1;
        C10439J j43 = C10439J.POI_SUBTYPE_IKEA_FOR_BUSINESS;
        IconMapping iconMapping108 = new IconMapping(j43.b(), j43.b(), "briefcase", C18148c.Briefcase);
        IconMapping iconMapping109 = r1;
        C10439J j44 = C10439J.POI_SUBTYPE_MARKETHALL_ENTRANCE;
        IconMapping iconMapping110 = new IconMapping(j44.b(), j44.b(), "arrow-right-to-base", cVar6);
        IconMapping iconMapping111 = r1;
        C10439J j45 = C10439J.POI_SUBTYPE_CIRCULAR_HUB;
        IconMapping iconMapping112 = new IconMapping(j45.b(), j45.b(), "circle-three", C18148c.CircleThreeSegments);
        IconMapping iconMapping113 = r1;
        C10439J j46 = C10439J.POI_SUBTYPE_SWEDISH_FOOD_MARKET;
        IconMapping iconMapping114 = new IconMapping(j46.b(), j46.b(), "seafood", cVar2);
        IconMapping iconMapping115 = r0;
        C10439J j47 = C10439J.POI_SUBTYPE_SMALAND;
        IconMapping iconMapping116 = new IconMapping(j47.b(), j47.b(), "play-area", C18148c.PlayArea);
        IconMapping iconMapping117 = r0;
        C10439J j48 = C10439J.POI_SUBTYPE_FINANCIAL_DESK;
        IconMapping iconMapping118 = new IconMapping(j48.b(), j48.b(), "financing", C18148c.Financing);
        IconMapping iconMapping119 = r0;
        C10439J j49 = C10439J.POI_SUBTYPE_PICK_UP_POINT;
        IconMapping iconMapping120 = new IconMapping(j49.b(), j49.b(), "hand-with-box", C18148c.HandWithBox);
        IconMapping iconMapping121 = r0;
        C10439J j50 = C10439J.POI_SUBTYPE_PLANNER_KITCHEN;
        String b18 = j50.b();
        String b19 = j50.b();
        C18148c cVar7 = C18148c.LaptopPencil;
        IconMapping iconMapping122 = new IconMapping(b18, b19, "laptop-pencil", cVar7);
        IconMapping iconMapping123 = r0;
        C10439J j51 = C10439J.POI_SUBTYPE_PLANNER_BEDROOM;
        IconMapping iconMapping124 = new IconMapping(j51.b(), j51.b(), "laptop-pencil", cVar7);
        IconMapping iconMapping125 = r0;
        C10439J j52 = C10439J.POI_SUBTYPE_PLANNER_LIVING_ROOM;
        IconMapping iconMapping126 = new IconMapping(j52.b(), j52.b(), "laptop-pencil", cVar7);
        IconMapping iconMapping127 = r0;
        C10439J j53 = C10439J.POI_SUBTYPE_CHRISTMAS_MARKET;
        IconMapping iconMapping128 = new IconMapping(j53.b(), j53.b(), "snowflake", C18148c.Snowflake);
        IconMapping iconMapping129 = r0;
        C10439J j54 = C10439J.POI_SUBTYPE_ACTIVITY_AREA_0;
        String b20 = j54.b();
        String b21 = j54.b();
        C18148c cVar8 = C18148c.FurnitureSet;
        IconMapping iconMapping130 = new IconMapping(b20, b21, "furniture-set", cVar8);
        IconMapping iconMapping131 = r0;
        C10439J j55 = C10439J.POI_SUBTYPE_ACTIVITY_AREA_1;
        IconMapping iconMapping132 = new IconMapping(j55.b(), j55.b(), "furniture-set", cVar8);
        IconMapping iconMapping133 = r0;
        C10439J j56 = C10439J.POI_SUBTYPE_ACTIVITY_AREA_2;
        IconMapping iconMapping134 = new IconMapping(j56.b(), j56.b(), "furniture-set", cVar8);
        IconMapping iconMapping135 = r0;
        C10439J j57 = C10439J.POI_SUBTYPE_ACTIVITY_AREA_3;
        IconMapping iconMapping136 = new IconMapping(j57.b(), j57.b(), "furniture-set", cVar8);
        IconMapping iconMapping137 = r0;
        C10439J j58 = C10439J.POI_SUBTYPE_ACTIVITY_AREA_4;
        IconMapping iconMapping138 = new IconMapping(j58.b(), j58.b(), "furniture-set", cVar8);
        IconMapping iconMapping139 = r0;
        C10439J j59 = C10439J.POI_SUBTYPE_ACTIVITY_AREA_5;
        IconMapping iconMapping140 = new IconMapping(j59.b(), j59.b(), "furniture-set", cVar8);
        IconMapping iconMapping141 = r0;
        C10439J j60 = C10439J.POI_SUBTYPE_ACTIVITY_AREA_6;
        IconMapping iconMapping142 = new IconMapping(j60.b(), j60.b(), "furniture-set", cVar8);
        IconMapping iconMapping143 = r0;
        C10439J j61 = C10439J.POI_SUBTYPE_ACTIVITY_AREA_7;
        IconMapping iconMapping144 = new IconMapping(j61.b(), j61.b(), "furniture-set", cVar8);
        IconMapping iconMapping145 = r0;
        C10439J j62 = C10439J.POI_SUBTYPE_PAYMENT_POINT;
        IconMapping iconMapping146 = new IconMapping(j62.b(), j62.b(), "card", cVar4);
        IconMapping iconMapping147 = r0;
        C10439J j63 = C10439J.POI_SUBTYPE_ENTRANCE_EXIT;
        IconMapping iconMapping148 = new IconMapping(j63.b(), j63.b(), "arrow-left-arrow-right", C18148c.ArrowLeftArrowRight);
        f60813d = new IconMapping[]{iconMapping41, iconMapping43, iconMapping45, iconMapping47, iconMapping49, iconMapping51, iconMapping53, iconMapping55, iconMapping57, iconMapping59, iconMapping61, iconMapping63, iconMapping65, iconMapping67, iconMapping69, iconMapping71, iconMapping73, iconMapping75, iconMapping77, iconMapping79, iconMapping81, iconMapping83, iconMapping85, iconMapping87, iconMapping89, iconMapping91, iconMapping93, iconMapping95, iconMapping97, iconMapping99, iconMapping101, iconMapping103, iconMapping105, iconMapping107, iconMapping109, iconMapping111, iconMapping113, iconMapping115, iconMapping117, iconMapping119, iconMapping121, iconMapping123, iconMapping125, iconMapping127, iconMapping129, iconMapping131, iconMapping133, iconMapping135, iconMapping137, iconMapping139, iconMapping141, iconMapping143, iconMapping145, iconMapping147};
        f60814e = new C10439J[]{j41, j24, j63, j20, j16, j25};
    }

    private m() {
    }

    public final IconMapping[] a() {
        return f60811b;
    }

    public final IconMapping[] b() {
        return f60813d;
    }

    public final IconMapping[] c() {
        return f60812c;
    }
}
