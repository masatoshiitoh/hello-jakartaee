/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.dressingroom;

import javax.ejb.Local;

/**
 *
 * @author b-itoh
 */
@Local
public interface DateInfoLocal {
    public String today();
}
