/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cassiomolin.example;

/**
 *
 * @author surajit.samui
 */
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceForJasyptSimple {

    @Value("${encryptedv2.property}")
    private String property;

    public String getProperty() {
        return property;
    }
}
