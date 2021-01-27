package com.mobile.agent;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.Response;

/**
 * @Memo TODO
 * @Author nqp
 **/
@Component
public class AgentClient {
    @Autowired
    private RestTemplate restTemplate;

    public Response debugAction(String agentIp, int agentPort, JSONObject requestBody) {
        String url = getUrl(agentIp, agentPort, "/action/debug");
        return restTemplate.postForObject(url, requestBody, Response.class);
    }



    private String getUrl(String agentIp, int agentPort, String requestURI) {
        return String.format("http://%s:%d%s", agentIp, agentPort, requestURI);
    }




}
