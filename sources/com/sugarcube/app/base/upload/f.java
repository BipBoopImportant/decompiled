package com.sugarcube.app.base.upload;

import N4.b;
import Q4.g;

final class f extends b {
    public f() {
        super(1, 2);
    }

    public void migrate(g gVar) {
        gVar.T("CREATE TABLE IF NOT EXISTS `_new_UploadSetDBO` (`captureUUID` TEXT NOT NULL, `uploadUUID` TEXT, `uploadUUIDCreatedTs` INTEGER, `state` TEXT NOT NULL, `sceneUUID` TEXT, `uploadAttempts` INTEGER NOT NULL, `roomTitle` TEXT NOT NULL, `roomType` TEXT NOT NULL, `captureType` TEXT NOT NULL, `captureStrategy` TEXT NOT NULL, PRIMARY KEY(`captureUUID`))");
        gVar.T("INSERT INTO `_new_UploadSetDBO` (`captureUUID`,`uploadUUID`,`uploadUUIDCreatedTs`,`state`,`sceneUUID`,`uploadAttempts`,`roomTitle`,`roomType`,`captureType`,`captureStrategy`) SELECT `captureUUID`,`uploadUUID`,`uploadUUIDCreatedTs`,`state`,`sceneUUID`,`uploadAttempts`,`roomTitle`,`roomType`,`captureType`,`captureStrategy` FROM `UploadSetDBO`");
        gVar.T("DROP TABLE `UploadSetDBO`");
        gVar.T("ALTER TABLE `_new_UploadSetDBO` RENAME TO `UploadSetDBO`");
        gVar.T("CREATE TABLE IF NOT EXISTS `_new_UploadFileDBO` (`localPath` TEXT NOT NULL, `fileName` TEXT NOT NULL, `localState` TEXT NOT NULL, `remoteState` TEXT NOT NULL, `captureUUID` TEXT NOT NULL, `remotePath` TEXT NOT NULL, `contentType` TEXT NOT NULL, `contentMd5` TEXT, `uploadUrl` TEXT, `uploadAttempts` INTEGER NOT NULL, PRIMARY KEY(`localPath`))");
        gVar.T("INSERT INTO `_new_UploadFileDBO` (`localPath`,`fileName`,`localState`,`remoteState`,`captureUUID`,`remotePath`,`contentType`,`uploadUrl`,`uploadAttempts`) SELECT `localPath`,`fileName`,`localState`,`remoteState`,`captureUUID`,`remotePath`,`contentType`,`uploadUrl`,`uploadAttempts` FROM `UploadFileDBO`");
        gVar.T("DROP TABLE `UploadFileDBO`");
        gVar.T("ALTER TABLE `_new_UploadFileDBO` RENAME TO `UploadFileDBO`");
    }
}
