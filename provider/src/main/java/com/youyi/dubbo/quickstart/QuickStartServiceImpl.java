package com.youyi.dubbo.quickstart;

import com.youyi.dubbo.ServiceAPI;

public class QuickStartServiceImpl implements ServiceAPI {
    @Override
    public String sendMSG(String message) {
        return "quickstart-provider-message="+message;
    }
}
