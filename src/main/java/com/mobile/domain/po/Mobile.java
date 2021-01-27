package com.mobile.domain.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.NotBlank;

import java.io.Serializable;
import java.util.Date;

/**
 * @Memo TODO
 * @Author nqp
 **/
public class Mobile implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final int OFFLINE_STATUS = 0;
    public static final int USING_STATUS = 1;
    public static final int IDLE_STATUS = 2;


    @NotBlank(message = "mobile id不能为空")
    private String id;
    /**
     * mobile名称
     */
    private String name;
    /**
     * 0: 真机 1: 模拟器
     */
    private Integer emulator;
    /**
     * 所在的agent的ip
     */
    private String agentIp;
    /**
     * 所在的agent的端口
     */
    private Integer agentPort;
    /**
     * 系统版本
     */
    private String systemVersion;
    /**
     * cpu信息
     */
    private String cpuInfo;
    /**
     * 内存大小：GB
     */
    private String memSize;
    /**
     * 屏幕宽（像素）
     */
    private Integer screenWidth;
    /**
     * 屏幕高（像素）
     */
    private Integer screenHeight;
    /**
     * 服务端保存的图片路径
     */
    private String imgPath;
    /**
     * 平台：1.android  2.ios
     */
    private Integer platform;
    /**
     * 状态：0.离线 1.使用中 2.空闲
     */
    private Integer status;
    /**
     * 最近一次在线时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastOnlineTime;
    /**
     * 最近一次使用人
     */
    private String username;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmulator() {
        return emulator;
    }

    public void setEmulator(Integer emulator) {
        this.emulator = emulator;
    }

    public String getAgentIp() {
        return agentIp;
    }

    public void setAgentIp(String agentIp) {
        this.agentIp = agentIp;
    }

    public Integer getAgentPort() {
        return agentPort;
    }

    public void setAgentPort(Integer agentPort) {
        this.agentPort = agentPort;
    }

    public String getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }

    public String getCpuInfo() {
        return cpuInfo;
    }

    public void setCpuInfo(String cpuInfo) {
        this.cpuInfo = cpuInfo;
    }

    public String getMemSize() {
        return memSize;
    }

    public void setMemSize(String memSize) {
        this.memSize = memSize;
    }

    public Integer getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(Integer screenWidth) {
        this.screenWidth = screenWidth;
    }

    public Integer getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(Integer screenHeight) {
        this.screenHeight = screenHeight;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getLastOnlineTime() {
        return lastOnlineTime;
    }

    public void setLastOnlineTime(Date lastOnlineTime) {
        this.lastOnlineTime = lastOnlineTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


}
