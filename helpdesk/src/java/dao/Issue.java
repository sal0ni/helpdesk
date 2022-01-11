package dao;

import java.util.ArrayList;
import java.util.List;


public class Issue {
    private String issueid, customerid, customer, 
            title, description, postedon, status,
            resolvedon, supportperson;
    
    private ArrayList<Reply> replies;
    
    public String getIssueid() {
        return issueid;
    }
    
    public void setIssueid(String issueid) {
        this.issueid = issueid;
    }
    
    public String getCustomerid() {
        return customerid;
    }
    
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getPostedon() {
        return postedon;
    }
    
    public void setPostedon(String postedon) {
        this.postedon = postedon;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getResolvedon() {
        return resolvedon;
    }
    
    public void setResolvedon(String resolvedon) {
        this.resolvedon = resolvedon;
    }
    
    public String getSupportperson() {
        return supportperson;
    }
    
    public void setSupportperson(String supportperson) {
        this.supportperson = supportperson;
    }
    
    public ArrayList<Reply> getReplies() {
        return replies;
    }
    
    public void setReplies(ArrayList<Reply> replies) {
        this.replies = replies;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
    
    
}
