package com.adjust.sdk;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Calendar;
import java.util.LinkedList;

public class ActivityState implements Serializable, Cloneable {
    private static final int ORDER_ID_MAXCOUNT = 10;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 9039439291143138148L;
    public String adid = null;
    public boolean askingAttribution = false;
    public long clickTime = 0;
    public long clickTimeHuawei = 0;
    public long clickTimeSamsung = 0;
    public long clickTimeServer = 0;
    public long clickTimeServerXiaomi = 0;
    public long clickTimeVivo = 0;
    public long clickTimeXiaomi = 0;
    public boolean enabled = true;
    public int eventCount = 0;
    public Boolean googlePlayInstant = null;
    public long installBegin = 0;
    public long installBeginHuawei = 0;
    public long installBeginSamsung = 0;
    public long installBeginServer = 0;
    public long installBeginServerXiaomi = 0;
    public long installBeginVivo = 0;
    public long installBeginXiaomi = 0;
    public String installReferrer = null;
    public String installReferrerHuawei = null;
    public String installReferrerHuaweiAppGallery = null;
    public String installReferrerSamsung = null;
    public String installReferrerVivo = null;
    public String installReferrerXiaomi = null;
    public String installVersion = null;
    public String installVersionVivo = null;
    public String installVersionXiaomi = null;
    public boolean isGdprForgotten = false;
    public boolean isThirdPartySharingDisabled = false;
    public boolean isThirdPartySharingDisabledForCoppa = false;
    public long lastActivity = -1;
    public long lastInterval = -1;
    private transient ILogger logger = AdjustFactory.getLogger();
    public LinkedList<String> orderIds = null;
    public String pushToken = null;
    public int sessionCount = 0;
    public long sessionLength = -1;
    public int subsessionCount = -1;
    public long timeSpent = -1;
    public boolean updatePackages = false;
    public String uuid = Util.createUuid();

    static {
        ObjectStreamField objectStreamField = r1;
        Class<String> cls = String.class;
        ObjectStreamField objectStreamField2 = new ObjectStreamField("uuid", cls);
        ObjectStreamField objectStreamField3 = r2;
        Class cls2 = Boolean.TYPE;
        ObjectStreamField objectStreamField4 = new ObjectStreamField("enabled", cls2);
        ObjectStreamField objectStreamField5 = r3;
        ObjectStreamField objectStreamField6 = new ObjectStreamField("isGdprForgotten", cls2);
        ObjectStreamField objectStreamField7 = r4;
        ObjectStreamField objectStreamField8 = new ObjectStreamField("isThirdPartySharingDisabled", cls2);
        ObjectStreamField objectStreamField9 = r5;
        ObjectStreamField objectStreamField10 = new ObjectStreamField("askingAttribution", cls2);
        ObjectStreamField objectStreamField11 = r6;
        Class cls3 = Integer.TYPE;
        ObjectStreamField objectStreamField12 = new ObjectStreamField("eventCount", cls3);
        ObjectStreamField objectStreamField13 = r7;
        ObjectStreamField objectStreamField14 = new ObjectStreamField("sessionCount", cls3);
        ObjectStreamField objectStreamField15 = r9;
        ObjectStreamField objectStreamField16 = new ObjectStreamField("subsessionCount", cls3);
        ObjectStreamField objectStreamField17 = r9;
        Class cls4 = Long.TYPE;
        ObjectStreamField objectStreamField18 = new ObjectStreamField("sessionLength", cls4);
        ObjectStreamField objectStreamField19 = r10;
        ObjectStreamField objectStreamField20 = new ObjectStreamField("timeSpent", cls4);
        ObjectStreamField objectStreamField21 = r11;
        ObjectStreamField objectStreamField22 = new ObjectStreamField("lastActivity", cls4);
        ObjectStreamField objectStreamField23 = r12;
        ObjectStreamField objectStreamField24 = objectStreamField;
        ObjectStreamField objectStreamField25 = new ObjectStreamField("lastInterval", cls4);
        ObjectStreamField objectStreamField26 = r0;
        ObjectStreamField objectStreamField27 = new ObjectStreamField("updatePackages", cls2);
        ObjectStreamField objectStreamField28 = objectStreamField3;
        Class cls5 = cls4;
        ObjectStreamField objectStreamField29 = r0;
        ObjectStreamField objectStreamField30 = objectStreamField5;
        ObjectStreamField objectStreamField31 = new ObjectStreamField("orderIds", LinkedList.class);
        Class cls6 = cls2;
        ObjectStreamField objectStreamField32 = r0;
        ObjectStreamField objectStreamField33 = objectStreamField7;
        ObjectStreamField objectStreamField34 = new ObjectStreamField("pushToken", cls);
        Class<String> cls7 = cls;
        ObjectStreamField objectStreamField35 = r0;
        ObjectStreamField objectStreamField36 = new ObjectStreamField("adid", cls7);
        ObjectStreamField objectStreamField37 = r0;
        ObjectStreamField objectStreamField38 = new ObjectStreamField("clickTime", cls5);
        ObjectStreamField objectStreamField39 = r0;
        ObjectStreamField objectStreamField40 = new ObjectStreamField("installBegin", cls5);
        ObjectStreamField objectStreamField41 = r0;
        ObjectStreamField objectStreamField42 = new ObjectStreamField("installReferrer", cls7);
        ObjectStreamField objectStreamField43 = r0;
        ObjectStreamField objectStreamField44 = new ObjectStreamField("googlePlayInstant", Boolean.class);
        ObjectStreamField objectStreamField45 = r0;
        ObjectStreamField objectStreamField46 = new ObjectStreamField("clickTimeServer", cls5);
        ObjectStreamField objectStreamField47 = r0;
        ObjectStreamField objectStreamField48 = new ObjectStreamField("installBeginServer", cls5);
        ObjectStreamField objectStreamField49 = r0;
        ObjectStreamField objectStreamField50 = new ObjectStreamField("installVersion", cls7);
        ObjectStreamField objectStreamField51 = r0;
        ObjectStreamField objectStreamField52 = new ObjectStreamField("clickTimeHuawei", cls5);
        ObjectStreamField objectStreamField53 = r0;
        ObjectStreamField objectStreamField54 = new ObjectStreamField("installBeginHuawei", cls5);
        ObjectStreamField objectStreamField55 = r0;
        ObjectStreamField objectStreamField56 = new ObjectStreamField("installReferrerHuawei", cls7);
        ObjectStreamField objectStreamField57 = r0;
        ObjectStreamField objectStreamField58 = new ObjectStreamField("installReferrerHuaweiAppGallery", cls7);
        ObjectStreamField objectStreamField59 = r0;
        ObjectStreamField objectStreamField60 = new ObjectStreamField("isThirdPartySharingDisabledForCoppa", cls6);
        ObjectStreamField objectStreamField61 = r0;
        ObjectStreamField objectStreamField62 = new ObjectStreamField("clickTimeXiaomi", cls5);
        ObjectStreamField objectStreamField63 = r0;
        ObjectStreamField objectStreamField64 = new ObjectStreamField("installBeginXiaomi", cls5);
        ObjectStreamField objectStreamField65 = r0;
        ObjectStreamField objectStreamField66 = new ObjectStreamField("installReferrerXiaomi", cls7);
        ObjectStreamField objectStreamField67 = r0;
        ObjectStreamField objectStreamField68 = new ObjectStreamField("clickTimeServerXiaomi", cls5);
        ObjectStreamField objectStreamField69 = r0;
        ObjectStreamField objectStreamField70 = new ObjectStreamField("installBeginServerXiaomi", cls5);
        ObjectStreamField objectStreamField71 = r0;
        ObjectStreamField objectStreamField72 = new ObjectStreamField("installVersionXiaomi", cls7);
        ObjectStreamField objectStreamField73 = r0;
        ObjectStreamField objectStreamField74 = new ObjectStreamField("clickTimeSamsung", cls5);
        ObjectStreamField objectStreamField75 = r0;
        ObjectStreamField objectStreamField76 = new ObjectStreamField("installBeginSamsung", cls5);
        ObjectStreamField objectStreamField77 = r0;
        ObjectStreamField objectStreamField78 = new ObjectStreamField("installReferrerSamsung", cls7);
        ObjectStreamField objectStreamField79 = r0;
        ObjectStreamField objectStreamField80 = new ObjectStreamField("clickTimeVivo", cls5);
        ObjectStreamField objectStreamField81 = r0;
        ObjectStreamField objectStreamField82 = new ObjectStreamField("installBeginVivo", cls5);
        ObjectStreamField objectStreamField83 = r0;
        ObjectStreamField objectStreamField84 = new ObjectStreamField("installReferrerVivo", cls7);
        ObjectStreamField objectStreamField85 = r0;
        ObjectStreamField objectStreamField86 = new ObjectStreamField("installVersionVivo", cls7);
        serialPersistentFields = new ObjectStreamField[]{objectStreamField24, objectStreamField28, objectStreamField30, objectStreamField33, objectStreamField9, objectStreamField11, objectStreamField13, objectStreamField15, objectStreamField17, objectStreamField19, objectStreamField21, objectStreamField23, objectStreamField26, objectStreamField29, objectStreamField32, objectStreamField35, objectStreamField37, objectStreamField39, objectStreamField41, objectStreamField43, objectStreamField45, objectStreamField47, objectStreamField49, objectStreamField51, objectStreamField53, objectStreamField55, objectStreamField57, objectStreamField59, objectStreamField61, objectStreamField63, objectStreamField65, objectStreamField67, objectStreamField69, objectStreamField71, objectStreamField73, objectStreamField75, objectStreamField77, objectStreamField79, objectStreamField81, objectStreamField83, objectStreamField85};
    }

    private void readObject(ObjectInputStream objectInputStream) {
        ObjectInputStream.GetField readFields = objectInputStream.readFields();
        this.eventCount = Util.readIntField(readFields, "eventCount", 0);
        this.sessionCount = Util.readIntField(readFields, "sessionCount", 0);
        this.subsessionCount = Util.readIntField(readFields, "subsessionCount", -1);
        this.sessionLength = Util.readLongField(readFields, "sessionLength", -1);
        this.timeSpent = Util.readLongField(readFields, "timeSpent", -1);
        this.lastActivity = Util.readLongField(readFields, "lastActivity", -1);
        this.lastInterval = Util.readLongField(readFields, "lastInterval", -1);
        this.uuid = Util.readStringField(readFields, "uuid", (String) null);
        this.enabled = Util.readBooleanField(readFields, "enabled", true);
        this.isGdprForgotten = Util.readBooleanField(readFields, "isGdprForgotten", false);
        this.isThirdPartySharingDisabled = Util.readBooleanField(readFields, "isThirdPartySharingDisabled", false);
        this.isThirdPartySharingDisabledForCoppa = Util.readBooleanField(readFields, "isThirdPartySharingDisabledForCoppa", false);
        this.askingAttribution = Util.readBooleanField(readFields, "askingAttribution", false);
        this.updatePackages = Util.readBooleanField(readFields, "updatePackages", false);
        this.orderIds = (LinkedList) Util.readObjectField(readFields, "orderIds", null);
        this.pushToken = Util.readStringField(readFields, "pushToken", (String) null);
        this.adid = Util.readStringField(readFields, "adid", (String) null);
        this.clickTime = Util.readLongField(readFields, "clickTime", -1);
        this.installBegin = Util.readLongField(readFields, "installBegin", -1);
        this.installReferrer = Util.readStringField(readFields, "installReferrer", (String) null);
        this.googlePlayInstant = (Boolean) Util.readObjectField(readFields, "googlePlayInstant", null);
        this.clickTimeServer = Util.readLongField(readFields, "clickTimeServer", -1);
        this.installBeginServer = Util.readLongField(readFields, "installBeginServer", -1);
        this.installVersion = Util.readStringField(readFields, "installVersion", (String) null);
        this.clickTimeHuawei = Util.readLongField(readFields, "clickTimeHuawei", -1);
        this.installBeginHuawei = Util.readLongField(readFields, "installBeginHuawei", -1);
        this.installReferrerHuawei = Util.readStringField(readFields, "installReferrerHuawei", (String) null);
        this.installReferrerHuaweiAppGallery = Util.readStringField(readFields, "installReferrerHuaweiAppGallery", (String) null);
        this.clickTimeXiaomi = Util.readLongField(readFields, "clickTimeXiaomi", -1);
        this.installBeginXiaomi = Util.readLongField(readFields, "installBeginXiaomi", -1);
        this.installReferrerXiaomi = Util.readStringField(readFields, "installReferrerXiaomi", (String) null);
        this.clickTimeServerXiaomi = Util.readLongField(readFields, "clickTimeServerXiaomi", -1);
        this.installBeginServerXiaomi = Util.readLongField(readFields, "installBeginServerXiaomi", -1);
        this.installVersionXiaomi = Util.readStringField(readFields, "installVersionXiaomi", (String) null);
        this.clickTimeSamsung = Util.readLongField(readFields, "clickTimeSamsung", -1);
        this.installBeginSamsung = Util.readLongField(readFields, "installBeginSamsung", -1);
        this.installReferrerSamsung = Util.readStringField(readFields, "installReferrerSamsung", (String) null);
        this.clickTimeVivo = Util.readLongField(readFields, "clickTimeVivo", -1);
        this.installBeginVivo = Util.readLongField(readFields, "installBeginVivo", -1);
        this.installReferrerVivo = Util.readStringField(readFields, "installReferrerVivo", (String) null);
        this.installVersionVivo = Util.readStringField(readFields, "installVersionVivo", (String) null);
        if (this.uuid == null) {
            this.uuid = Util.createUuid();
        }
    }

    private static String stamp(long j10) {
        Calendar.getInstance().setTimeInMillis(j10);
        return Util.formatString("%02d:%02d:%02d", 11, 12, 13);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
    }

    public void addOrderId(String str) {
        if (this.orderIds == null) {
            this.orderIds = new LinkedList<>();
        }
        if (this.orderIds.size() >= 10) {
            this.orderIds.removeLast();
        }
        this.orderIds.addFirst(str);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityState activityState = (ActivityState) obj;
        return Util.equalString(this.uuid, activityState.uuid) && Util.equalBoolean(Boolean.valueOf(this.enabled), Boolean.valueOf(activityState.enabled)) && Util.equalBoolean(Boolean.valueOf(this.isGdprForgotten), Boolean.valueOf(activityState.isGdprForgotten)) && Util.equalBoolean(Boolean.valueOf(this.isThirdPartySharingDisabled), Boolean.valueOf(activityState.isThirdPartySharingDisabled)) && Util.equalBoolean(Boolean.valueOf(this.isThirdPartySharingDisabledForCoppa), Boolean.valueOf(activityState.isThirdPartySharingDisabledForCoppa)) && Util.equalBoolean(Boolean.valueOf(this.askingAttribution), Boolean.valueOf(activityState.askingAttribution)) && Util.equalInt(Integer.valueOf(this.eventCount), Integer.valueOf(activityState.eventCount)) && Util.equalInt(Integer.valueOf(this.sessionCount), Integer.valueOf(activityState.sessionCount)) && Util.equalInt(Integer.valueOf(this.subsessionCount), Integer.valueOf(activityState.subsessionCount)) && Util.equalLong(Long.valueOf(this.sessionLength), Long.valueOf(activityState.sessionLength)) && Util.equalLong(Long.valueOf(this.timeSpent), Long.valueOf(activityState.timeSpent)) && Util.equalLong(Long.valueOf(this.lastInterval), Long.valueOf(activityState.lastInterval)) && Util.equalBoolean(Boolean.valueOf(this.updatePackages), Boolean.valueOf(activityState.updatePackages)) && Util.equalObject(this.orderIds, activityState.orderIds) && Util.equalString(this.pushToken, activityState.pushToken) && Util.equalString(this.adid, activityState.adid) && Util.equalLong(Long.valueOf(this.clickTime), Long.valueOf(activityState.clickTime)) && Util.equalLong(Long.valueOf(this.installBegin), Long.valueOf(activityState.installBegin)) && Util.equalString(this.installReferrer, activityState.installReferrer) && Util.equalBoolean(this.googlePlayInstant, activityState.googlePlayInstant) && Util.equalLong(Long.valueOf(this.clickTimeServer), Long.valueOf(activityState.clickTimeServer)) && Util.equalLong(Long.valueOf(this.installBeginServer), Long.valueOf(activityState.installBeginServer)) && Util.equalString(this.installVersion, activityState.installVersion) && Util.equalLong(Long.valueOf(this.clickTimeHuawei), Long.valueOf(activityState.clickTimeHuawei)) && Util.equalLong(Long.valueOf(this.installBeginHuawei), Long.valueOf(activityState.installBeginHuawei)) && Util.equalString(this.installReferrerHuawei, activityState.installReferrerHuawei) && Util.equalString(this.installReferrerHuaweiAppGallery, activityState.installReferrerHuaweiAppGallery) && Util.equalLong(Long.valueOf(this.clickTimeXiaomi), Long.valueOf(activityState.clickTimeXiaomi)) && Util.equalLong(Long.valueOf(this.installBeginXiaomi), Long.valueOf(activityState.installBeginXiaomi)) && Util.equalString(this.installReferrerXiaomi, activityState.installReferrerXiaomi) && Util.equalLong(Long.valueOf(this.clickTimeServerXiaomi), Long.valueOf(activityState.clickTimeServerXiaomi)) && Util.equalLong(Long.valueOf(this.installBeginServerXiaomi), Long.valueOf(activityState.installBeginServerXiaomi)) && Util.equalString(this.installVersionXiaomi, activityState.installVersionXiaomi) && Util.equalLong(Long.valueOf(this.clickTimeSamsung), Long.valueOf(activityState.clickTimeSamsung)) && Util.equalLong(Long.valueOf(this.installBeginSamsung), Long.valueOf(activityState.installBeginSamsung)) && Util.equalString(this.installReferrerSamsung, activityState.installReferrerSamsung) && Util.equalLong(Long.valueOf(this.clickTimeVivo), Long.valueOf(activityState.clickTimeVivo)) && Util.equalLong(Long.valueOf(this.installBeginVivo), Long.valueOf(activityState.installBeginVivo)) && Util.equalString(this.installReferrerVivo, activityState.installReferrerVivo) && Util.equalString(this.installVersionVivo, activityState.installVersionVivo);
    }

    public boolean findOrderId(String str) {
        LinkedList<String> linkedList = this.orderIds;
        if (linkedList == null) {
            return false;
        }
        return linkedList.contains(str);
    }

    public int hashCode() {
        return Util.hashString(this.installVersionVivo, Util.hashString(this.installReferrerVivo, Util.hashLong(Long.valueOf(this.installBeginVivo), Util.hashLong(Long.valueOf(this.clickTimeVivo), Util.hashString(this.installReferrerSamsung, Util.hashLong(Long.valueOf(this.installBeginSamsung), Util.hashLong(Long.valueOf(this.clickTimeSamsung), Util.hashString(this.installVersionXiaomi, Util.hashLong(Long.valueOf(this.installBeginServerXiaomi), Util.hashLong(Long.valueOf(this.clickTimeServerXiaomi), Util.hashString(this.installReferrerXiaomi, Util.hashLong(Long.valueOf(this.installBeginXiaomi), Util.hashLong(Long.valueOf(this.clickTimeXiaomi), Util.hashString(this.installReferrerHuaweiAppGallery, Util.hashString(this.installReferrerHuawei, Util.hashLong(Long.valueOf(this.installBeginHuawei), Util.hashLong(Long.valueOf(this.clickTimeHuawei), Util.hashString(this.installVersion, Util.hashLong(Long.valueOf(this.installBeginServer), Util.hashLong(Long.valueOf(this.clickTimeServer), Util.hashBoolean(this.googlePlayInstant, Util.hashString(this.installReferrer, Util.hashLong(Long.valueOf(this.installBegin), Util.hashLong(Long.valueOf(this.clickTime), Util.hashString(this.adid, Util.hashString(this.pushToken, Util.hashObject(this.orderIds, Util.hashBoolean(Boolean.valueOf(this.updatePackages), Util.hashLong(Long.valueOf(this.lastInterval), Util.hashLong(Long.valueOf(this.timeSpent), Util.hashLong(Long.valueOf(this.sessionLength), (((((Util.hashBoolean(Boolean.valueOf(this.askingAttribution), Util.hashBoolean(Boolean.valueOf(this.isThirdPartySharingDisabledForCoppa), Util.hashBoolean(Boolean.valueOf(this.isThirdPartySharingDisabled), Util.hashBoolean(Boolean.valueOf(this.isGdprForgotten), Util.hashBoolean(Boolean.valueOf(this.enabled), Util.hashString(this.uuid, 17)))))) * 37) + this.eventCount) * 37) + this.sessionCount) * 37) + this.subsessionCount)))))))))))))))))))))))))))))));
    }

    public void resetSessionAttributes(long j10) {
        this.subsessionCount = 1;
        this.sessionLength = 0;
        this.timeSpent = 0;
        this.lastActivity = j10;
        this.lastInterval = -1;
    }

    public String toString() {
        return Util.formatString("ec:%d sc:%d ssc:%d sl:%.1f ts:%.1f la:%s uuid:%s", Integer.valueOf(this.eventCount), Integer.valueOf(this.sessionCount), Integer.valueOf(this.subsessionCount), Double.valueOf(((double) this.sessionLength) / 1000.0d), Double.valueOf(((double) this.timeSpent) / 1000.0d), stamp(this.lastActivity), this.uuid);
    }
}
