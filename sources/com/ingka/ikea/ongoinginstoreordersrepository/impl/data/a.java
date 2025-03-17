package com.ingka.ikea.ongoinginstoreordersrepository.impl.data;

import Fw.C12908a;
import N4.b;
import Q4.g;

final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    private final N4.a f119228a = new C12908a();

    public a() {
        super(1, 2);
    }

    public void migrate(g gVar) {
        gVar.T("ALTER TABLE `ongoingorders-table` ADD COLUMN `products` TEXT DEFAULT NULL");
        gVar.T("ALTER TABLE `ongoingorders-table` ADD COLUMN `totalPrice` REAL DEFAULT NULL");
        gVar.T("CREATE TABLE IF NOT EXISTS `_new_ongoingorders-table` (`timeSlotId` TEXT NOT NULL, `orderId` TEXT, `startTime` TEXT NOT NULL, `endTime` TEXT NOT NULL, `pickupStatus` TEXT NOT NULL, `updatedAt` INTEGER NOT NULL, `products` TEXT, `totalPrice` REAL, PRIMARY KEY(`timeSlotId`))");
        gVar.T("INSERT INTO `_new_ongoingorders-table` (`timeSlotId`,`orderId`,`startTime`,`endTime`,`pickupStatus`,`updatedAt`) SELECT `timeSlotId`,`orderId`,`startTime`,`endTime`,`pickupStatus`,`updatedAt` FROM `ongoingorders-table`");
        gVar.T("DROP TABLE `ongoingorders-table`");
        gVar.T("ALTER TABLE `_new_ongoingorders-table` RENAME TO `ongoingorders-table`");
        this.f119228a.a(gVar);
    }
}
