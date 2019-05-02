package com.wintertea.commons.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author woody
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WinterTeaException extends Exception {
    private int code;
    private String message;
}
