package com.mobile.init;

import com.mobile.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

/**
 * @Memo TODO
 * @Author nqp
 **/
public class StartupRunner implements ApplicationRunner {
//    @Autowired
//    private TestPlanService testPlanService;
    @Autowired
    private FileService fileService;

    @Override
    public void run(ApplicationArguments args) {
//        fileService.mkUploadDirIfNotExists();
//        // 启动server时，按cron表达式执行所有开启的定时任务
//        testPlanService.scheduleEnabledTasks();
    }
}
