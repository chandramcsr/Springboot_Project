package com.chandra.vo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "customerResponse", namespace = "https://ejb.acq.edt.dfsi.com/")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {

   private Customer customer;
   private String xmlCustomer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getXmlCustomer() {
        return xmlCustomer;
    }

    public void setXmlCustomer(String xmlCustomer) {
        this.xmlCustomer = xmlCustomer;
    }
}
