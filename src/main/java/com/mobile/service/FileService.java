package com.mobile.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Memo TODO
 * @Author nqp
 **/
@Slf4j
@Service
public class FileService {
    public static final String UPLOAD_DIR = "upload";
    public static final String TMP_DIR = UPLOAD_DIR + "/tmp";
    public static final String IMG_DIR = UPLOAD_DIR + "/img";
    public static final String VIDEO_DIR = UPLOAD_DIR + "/video";
    public static final String APP_DIR = UPLOAD_DIR + "/app";
    public static final String DRIVER_DIR = UPLOAD_DIR + "/driver";
    public static final String OTHER_FILE_DIR = UPLOAD_DIR + "/other";

    @Value("${static-location}/")
    private String staticLocation;

}
