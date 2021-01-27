package com.mobile.service;

import com.mobile.agent.AgentClient;
import com.mobile.domain.mapper.MobileMapper;
import com.mobile.domain.po.Mobile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Memo TODO
 * @Author nqp
 **/
@Service
@Slf4j
public class MobileService {

    @Autowired
    private MobileMapper mobileMapper;
    @Autowired
    private AgentClient agentClient;
    @Autowired
    private FileService fileService;

    public void save(Mobile mobile) {
        Mobile dbMobile = mobileMapper.selectByPrimaryKey(mobile.getId());

    }
}
