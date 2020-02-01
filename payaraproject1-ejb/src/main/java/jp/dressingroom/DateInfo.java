/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.dressingroom;

import javax.ejb.Stateless;

/**
 *
 * @author b-itoh
 */
@Stateless
public class DateInfo implements DateInfoLocal {

    @Override
    public String today() {
        return "this is today";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
