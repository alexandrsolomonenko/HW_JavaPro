package hw_23_11_2023.convertToObject;

import java.util.List;

public class Service {
    private String serviceName;
    private int code;
    private String userMessage;
    private boolean isError;
    private List<SupportContact> supportContacts;

    public String getServiceName() {
        return serviceName;
    }

    public int getCode() {
        return code;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public boolean isError() {
        return isError;
    }

    public List<SupportContact> getSupportContacts() {
        return supportContacts;
    }
}
