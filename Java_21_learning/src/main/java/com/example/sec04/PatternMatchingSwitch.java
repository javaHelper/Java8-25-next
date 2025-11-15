package com.example.sec04;

public class PatternMatchingSwitch {

    public static void main(String[] args) {
        SftpStorage sftpStorage = new SftpStorage();
        CloudStorage cloudStorage = new CloudStorage();

        uploadFile(sftpStorage);
        uploadFile(cloudStorage);

        System.out.println("------------");
        uploadFile_with_switch(sftpStorage);
        uploadFile_with_switch(cloudStorage);
    }

    private static void uploadFile(Storage storage) {
        if (storage instanceof SftpStorage sftpStorage) {
            System.out.println("Uploading file to SFTP");
            sftpStorage.save();
        } else if (storage instanceof CloudStorage cloudStorage) {
            System.out.println("Uploading file to cloud storage");
            cloudStorage.save();
        } else {
            throw new IllegalArgumentException("Storage Type not supported");
        }

    }

    private static void uploadFile_with_switch(Storage storage){
        switch (storage){
            case SftpStorage sftpStorage -> {
                System.out.println("Uploading file to SFTP");
                sftpStorage.save();
            }
            case CloudStorage cloudStorage -> {
                System.out.println("Uploading file to cloud storage");
                cloudStorage.save();
            }
            default -> throw new IllegalArgumentException("Storage Type not supported");
        }
    }
}
