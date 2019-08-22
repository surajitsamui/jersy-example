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
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "encrypted.properties")
public class AppConfigForJasyptStarter {
}
