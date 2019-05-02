package com.wintertea.commons.bean;

import lombok.Data;

/**
 * @author woody
 */
@Data
public class ResultEntity {
    private int code;
    private String message;
    private Object entity;
}
