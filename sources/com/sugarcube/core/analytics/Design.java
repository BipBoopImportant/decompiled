package com.sugarcube.core.analytics;

import com.sugarcube.core.analytics.Event;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0012"}, d2 = {"Lcom/sugarcube/core/analytics/Design;", "Lcom/sugarcube/core/analytics/Event;", "<init>", "()V", "Pip", "BuyScreen", "Intro", "Warning", "Feedback", "Open", "Room", "Menu", "Save", "Exit", "Search", "EraseMenu", "Decoration", "Views", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Design implements Event {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/sugarcube/core/analytics/Design$BuyScreen;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "AddToBag", "AddAllToBag", "AddToFav", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum BuyScreen implements Event {
        AddToBag,
        AddAllToBag,
        AddToFav;

        static {
            BuyScreen[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<BuyScreen> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/core/analytics/Design$Decoration;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Error", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Decoration implements Event {
        Error;

        static {
            Decoration[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Decoration> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/sugarcube/core/analytics/Design$EraseMenu;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "EraseAll", "ShowAll", "Done", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum EraseMenu implements Event {
        EraseAll,
        ShowAll,
        Done;

        static {
            EraseMenu[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<EraseMenu> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/core/analytics/Design$Exit;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Prompt", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Exit implements Event {
        Prompt;

        static {
            Exit[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Exit> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/core/analytics/Design$Feedback;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Exit", "Submit", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Feedback implements Event {
        Exit,
        Submit;

        static {
            Feedback[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Feedback> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/core/analytics/Design$Intro;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Exit", "GetStarted", "GetLink", "GetLinkResult", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Intro implements Event {
        Exit,
        GetStarted,
        GetLink,
        GetLinkResult;

        static {
            Intro[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Intro> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/core/analytics/Design$Menu;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Add", "Rotate", "Remove", "Save", "List", "Swap", "Buy", "Erase", "ListProductTapped", "Info", "Views", "DuplicateItem", "GoesWellWith", "Variants", "Style", "SelectWallColor", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Menu implements Event {
        Add,
        Rotate,
        Remove,
        Save,
        List,
        Swap,
        Buy,
        Erase,
        ListProductTapped,
        Info,
        Views,
        DuplicateItem,
        GoesWellWith,
        Variants,
        Style,
        SelectWallColor;

        static {
            Menu[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Menu> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/core/analytics/Design$Open;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Open implements Event {
        Start;

        static {
            Open[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Open> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/core/analytics/Design$Pip;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "AddToBag", "AddToFav", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Pip implements Event {
        AddToBag,
        AddToFav;

        static {
            Pip[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Pip> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/core/analytics/Design$Room;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "AddProduct", "ProductLoadTime", "SwapProduct", "MoveProduct", "RotateProduct", "Exit", "Zoom", "Tapped", "ChangeProduct", "EnterPOI", "ExitPOI", "Save", "AddAllToBag", "AddToBag", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Room implements Event {
        AddProduct,
        ProductLoadTime,
        SwapProduct,
        MoveProduct,
        RotateProduct,
        Exit,
        Zoom,
        Tapped,
        ChangeProduct,
        EnterPOI,
        ExitPOI,
        Save,
        AddAllToBag,
        AddToBag;

        static {
            Room[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Room> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/core/analytics/Design$Save;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Prompt", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Save implements Event {
        Prompt;

        static {
            Save[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Save> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/sugarcube/core/analytics/Design$Search;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Cancel", "ClearAll", "Exit", "Result", "Select", "Open", "FilterTab", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Search implements Event {
        Cancel,
        ClearAll,
        Exit,
        Result,
        Select,
        Open,
        FilterTab;

        static {
            Search[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Search> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/core/analytics/Design$Views;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "ChangeView", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Views implements Event {
        ChangeView;

        static {
            Views[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Views> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/core/analytics/Design$Warning;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "LowDiskSpace", "LowMemory", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Warning implements Event {
        LowDiskSpace,
        LowMemory;

        static {
            Warning[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Warning> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    public String eventName() {
        return Event.DefaultImpls.eventName(this);
    }
}
